package com.flipkart.mobile.helpers;

import com.flipkart.mobile.helpers.HashingConfig;
import com.flipkart.mobile.helpers.HashingMethod;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public enum HashUtility
{
   INSTANCE;

   public <T> boolean isHashValid(T obj , HashingMethod hashingMethod, String secretKey, String originalHash) throws JSONException {
      String newHash = generateHash(obj, hashingMethod, secretKey);
      return newHash.equals(originalHash);
   }

   public <T> String generateHash(T obj, HashingMethod hashingMethod, String secretKey) throws JSONException {
      return generateHash(HashingConfig.getMapper().convertValue(obj, JSONObject.class), hashingMethod, secretKey);
   }

   public String generateHash(JSONObject params, HashingMethod hashingMethod, String secretKey) throws JSONException {
      StringBuilder stringBuilder = new StringBuilder(100);
      combineValues(params, stringBuilder);
      stringBuilder.append(secretKey);
      return hashingMethod.generateHash(stringBuilder.toString());
   }

   private void combineValues(JSONObject params, StringBuilder stringBuilder) throws JSONException {
      Iterator keys = params.keys();
      ArrayList sortedKeys = new ArrayList();

      while(keys.hasNext()) {
         sortedKeys.add(keys.next());
      }

      Collections.sort(sortedKeys);
      Iterator iterator = sortedKeys.iterator();

       while(iterator.hasNext()) {
           String sk = (String)iterator.next();
           if(!sk.equals("hash")) {
               Object obj = params.get(sk);
               if(obj != null) {
                   stringBuilder.append(obj.toString()).append('|');
               }
           }
       }
   }
}
