package com.flipkart.mobile.models;

/**
 * Created by piyushsinha.c on 28/04/16.
 */
public abstract class BaseRequest {
    private String hash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
