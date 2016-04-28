package com.flipkart.mobile.application;

import com.flipkart.mobile.helpers.HashUtility;
import com.flipkart.mobile.helpers.HashingMethod;
import com.flipkart.mobile.models.BlobIoHashRequest;
import org.json.JSONException;

/**
 * Created by piyushsinha.c on 28/04/16.
 */
public abstract class BlobIoHashApplication {
    private String merchantKey;
    private String secretKey;

    public BlobIoHashApplication(String merchantKey, String secretKey) {
        this.merchantKey = merchantKey;
        this.secretKey = secretKey;
    }

    public BlobIoHashRequest getBlobIoHashRequest(String resourceId) throws JSONException {
        BlobIoHashRequest blobIoHashRequest = new BlobIoHashRequest();
        blobIoHashRequest.setMechantKey(this.merchantKey);
        blobIoHashRequest.setResourceId(resourceId);
        blobIoHashRequest.setHash(HashUtility.INSTANCE.generateHash(blobIoHashRequest, HashingMethod.SHA256, this.secretKey));

        return blobIoHashRequest;
    }
}
