package com.bytedance.sdk.account.api.call;

import android.os.Bundle;
import org.json.JSONObject;

public class BaseApiResponse {
    public final int api;
    public Bundle dataTip;
    public int error;
    public String errorMsg;
    public JSONObject result;
    public boolean success;
    @Deprecated
    public String url;

    public boolean needCaptcha() {
        if (this.error <= 1100 || this.error >= 1199) {
            return false;
        }
        return true;
    }

    public boolean isBindExist() {
        if (this.error == 1030 || this.error == 1041) {
            return true;
        }
        return false;
    }

    public boolean needPicCaptcha() {
        if (this.error == 1101 || this.error == 1102 || this.error == 1103) {
            return true;
        }
        return false;
    }

    public boolean needSecureCaptcha() {
        if (this.error == 1104 || this.error == 1105) {
            return true;
        }
        return false;
    }

    public BaseApiResponse(boolean z, int i) {
        this.success = z;
        this.api = i;
    }
}
