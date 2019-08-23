package com.cmic.sso.sdk.auth;

import android.os.Bundle;
import com.cmic.sso.sdk.d.f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", "103000");
            jSONObject.put("desc", "true");
            jSONObject.put("securityphone", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("resultCode", str);
            jSONObject.put("resultDesc", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static JSONObject a(String str, Bundle bundle, JSONObject jSONObject) {
        String[] strArr = {"未知", "移动", "联通", "电信"};
        try {
            String string = bundle.getString("operatortype", PushConstants.PUSH_TYPE_NOTIFY);
            if (!PushConstants.PUSH_TYPE_NOTIFY.equals(string)) {
                jSONObject.put("operatorType", strArr[Integer.parseInt(string)]);
            } else if ("103000".equals(str)) {
                jSONObject.put("operatorType", strArr[1]);
            } else {
                jSONObject.put("operatorType", strArr[0]);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    static JSONObject a(String str, String str2, Bundle bundle, JSONObject jSONObject) {
        String str3;
        String str4;
        JSONObject jSONObject2 = new JSONObject();
        try {
            int intValue = Integer.valueOf(bundle.getString("authtype", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
            int i = bundle.getInt("networktype");
            switch (intValue) {
                case 2:
                    str4 = "7";
                    str3 = "短信验证码";
                    break;
                case 3:
                    if (i != 3) {
                        str3 = "网关鉴权";
                        str4 = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                        break;
                    } else {
                        str3 = "WIFI下网关鉴权";
                        str4 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        break;
                    }
                case 4:
                    str4 = "3";
                    str3 = "短信上行";
                    break;
                default:
                    str4 = PushConstants.PUSH_TYPE_NOTIFY;
                    str3 = "其他";
                    break;
            }
            jSONObject2.put("resultCode", str);
            jSONObject2.put("authType", str4);
            jSONObject2.put("authTypeDes", str3);
            if ("103000".equals(str)) {
                if (1 == bundle.getInt("logintype", 0)) {
                    jSONObject2.put("openId", bundle.getString("openId"));
                }
                jSONObject2.put("token", jSONObject.optString("token"));
            } else {
                jSONObject2.put("resultDesc", str2);
            }
        } catch (Exception unused) {
        }
        f.b("AuthnResult", "返回参数:" + jSONObject2.toString());
        return jSONObject2;
    }
}
