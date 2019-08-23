package com.tt.option.net;

import org.json.JSONObject;

public class TmaResponse {
    private int code = -1;
    private String data;
    private JSONObject extraInfoJsonObj;
    private String message;
    private Throwable throwable;

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public JSONObject getExtraInfoJsonObj() {
        return this.extraInfoJsonObj;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setExtraInfoJsonObj(JSONObject jSONObject) {
        this.extraInfoJsonObj = jSONObject;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setThrowable(Throwable th) {
        this.throwable = th;
    }
}
