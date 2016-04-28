package com.flipkart.mobile.helpers;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsonorg.JsonOrgModule;


/**
 * Created by piyushsinha.c on 28/04/16.
 */
public class HashingConfig {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public HashingConfig() {
    }

    public static ObjectMapper getMapper() {
        return objectMapper;
    }

    static {
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JsonOrgModule());

    }
}
