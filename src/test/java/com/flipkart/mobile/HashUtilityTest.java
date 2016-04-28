package com.flipkart.mobile;

import com.flipkart.mobile.application.BlobIoHashApplication;
import com.flipkart.mobile.models.BlobIoHashRequest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.json.JSONException;

/**
 * Unit test for simple HashUtility.
 */
public class HashUtilityTest extends BlobIoHashApplication
{
    private static final String merchantKey = "f7labs";
    private static final String secretKey = "mppr860ae107faefa5521365e2bff5811d3f7a6f2027190d62d3911b7e61a36e";

    public HashUtilityTest() {
        super(merchantKey, secretKey);
    }

    public static void main (String[] args) throws JSONException {
        HashUtilityTest hashUtilityTest = new HashUtilityTest();
        BlobIoHashRequest blobIoHashRequest = hashUtilityTest.getBlobIoHashRequest("DbAzlnH2bF2HrGMxvlE4JXtbNfnsFpoy5tFN8A9d1heqDgu21RvI-XMvI6qgfLzzFoeDEl5OzeCsIyLfepk-XQ");
        System.out.println(blobIoHashRequest.getHash());
    }
}
