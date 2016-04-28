package com.flipkart.mobile.helpers;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by piyushsinha.c on 28/04/16.
 */
public enum HashingMethod {
    MD5 {
        public String generateHash(String data) {
            return DigestUtils.md5Hex(data);
        }
    },
    SHA256 {
        public String generateHash(String data) {
            return DigestUtils.sha256Hex(data);
        }
    };

    private HashingMethod() {

    }

    public abstract String generateHash(String data);
}
