package com.monitor.cloudmessage.entity;

import java.util.HashMap;

public class ConsumerResult {
    private String mErrMsg;
    private boolean mIsSuccess;
    private HashMap<String, String> specificParams;

    public String getErrMsg() {
        return this.mErrMsg;
    }

    public HashMap<String, String> getSpecificParams() {
        return this.specificParams;
    }

    public boolean isSuccess() {
        return this.mIsSuccess;
    }

    public static ConsumerResult build(boolean z, String str, HashMap<String, String> hashMap) {
        return new ConsumerResult(z, str, hashMap);
    }

    private ConsumerResult(boolean z, String str, HashMap<String, String> hashMap) {
        this.mIsSuccess = z;
        this.mErrMsg = str;
        this.specificParams = hashMap;
    }
}
