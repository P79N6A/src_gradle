package com.coloros.mcssdk.mode;

import android.text.TextUtils;
import com.coloros.mcssdk.c.d;
import com.google.a.a.a.a.a.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CommandMessage extends Message {
    public static final String TYPE_NULL = null;
    private String appKey;
    private String appSecret;
    private int command;
    private String content;
    private String params;
    private String registerID;
    private int responseCode = -2;
    private String sdkVersion;

    public static List<String> parseToList(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("&");
        if (split != null && split.length > 0) {
            arrayList = new ArrayList();
            for (int i = 0; i < split.length; i++) {
                if (!TextUtils.isEmpty(split[i])) {
                    arrayList.add(split[i]);
                }
            }
        }
        return arrayList;
    }

    public static <T> String parseToString(List<T> list) {
        StringBuilder sb = new StringBuilder();
        for (T next : list) {
            sb.append(next + "&");
        }
        return sb.toString();
    }

    public static List<SubscribeResult> parseToSubscribeResultList(String str, String str2, String str3, String str4) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray(str2);
            arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    SubscribeResult subscribeResult = new SubscribeResult();
                    subscribeResult.setContent(jSONObject.getString(str4));
                    subscribeResult.setSubscribeId(jSONObject.getString(str3));
                    arrayList.add(subscribeResult);
                    i++;
                } catch (JSONException e2) {
                    e = e2;
                    a.b(e);
                    d.a("parseToSubscribeResultList--".concat(String.valueOf(arrayList)));
                    return arrayList;
                }
            }
        } catch (JSONException e3) {
            e = e3;
            arrayList = null;
            a.b(e);
            d.a("parseToSubscribeResultList--".concat(String.valueOf(arrayList)));
            return arrayList;
        }
        d.a("parseToSubscribeResultList--".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public int getCommand() {
        return this.command;
    }

    public String getContent() {
        return this.content;
    }

    public String getParams() {
        return this.params;
    }

    public String getRegisterID() {
        return this.registerID;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public int getType() {
        return 4105;
    }

    public void setAppKey(String str) {
        this.appKey = str;
    }

    public void setAppSecret(String str) {
        this.appSecret = str;
    }

    public void setCommand(int i) {
        this.command = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setParams(String str) {
        this.params = str;
    }

    public void setRegisterID(String str) {
        this.registerID = str;
    }

    public void setResponseCode(int i) {
        this.responseCode = i;
    }

    public void setSdkVersion(String str) {
        this.sdkVersion = str;
    }

    public String toString() {
        return "type:4105,messageID:" + this.messageID + ",taskID:" + this.taskID + ",appPackage:" + this.appPackage + ",registerID:" + this.registerID + ",sdkVersion:" + this.sdkVersion + ",command:" + this.command + ",responseCode:" + this.responseCode + ",content:" + this.content;
    }
}
