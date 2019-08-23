package com.tt.miniapphost.hostmethod;

import android.app.Activity;
import android.content.Intent;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import org.json.JSONObject;

public interface IHostMethod {

    public static class Stub implements IHostMethod {
        public void call(Activity activity, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) throws Exception {
        }

        public String callSync(Activity activity, JSONObject jSONObject) throws Exception {
            return null;
        }

        public boolean onActivityResult(int i, int i2, Intent intent) {
            return false;
        }

        public boolean shouldHandleActivityResult(JSONObject jSONObject) {
            return false;
        }
    }

    void call(Activity activity, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) throws Exception;

    String callSync(Activity activity, JSONObject jSONObject) throws Exception;

    boolean onActivityResult(int i, int i2, Intent intent);

    boolean shouldHandleActivityResult(JSONObject jSONObject);
}
