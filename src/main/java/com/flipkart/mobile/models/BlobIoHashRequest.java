package com.flipkart.mobile.models;

/**
 * Created by piyushsinha.c on 28/04/16.
 */
public class BlobIoHashRequest extends BaseRequest {
    private String mechantKey;
    private String resourceId;

    public String getMechantKey() {
        return mechantKey;
    }

    public void setMechantKey(String mechantKey) {
        this.mechantKey = mechantKey;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
}
