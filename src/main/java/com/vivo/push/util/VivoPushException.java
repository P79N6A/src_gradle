package com.vivo.push.util;

public class VivoPushException extends Exception {
    private int mReasonCode;

    public int getCode() {
        return this.mReasonCode;
    }

    public VivoPushException(String str) {
        this(10000, str);
    }

    public VivoPushException(int i, String str) {
        super(str);
        this.mReasonCode = i;
    }
}
