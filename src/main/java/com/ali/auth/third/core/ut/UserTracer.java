package com.ali.auth.third.core.ut;

import android.os.Build;
import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.service.UserTrackerService;
import com.ali.auth.third.core.service.impl.CredentialManager;
import com.ali.auth.third.core.util.CommonUtils;
import com.ali.auth.third.core.util.JSONUtils;
import com.ali.auth.third.core.util.SystemUtils;
import java.util.Map;
import org.json.JSONObject;

public class UserTracer implements UserTrackerService {
    public static JSONObject getAppInfo() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("diskSize", CommonUtils.getSDCardSize());
            jSONObject.put("sysSize", CommonUtils.getSystemSize());
            jSONObject.put("memorySize", CommonUtils.getTotalMemory());
            jSONObject.put("deviceId", CommonUtils.getAndroidId());
            jSONObject.put("uuid", KernelContext.UUID);
        } catch (Exception unused) {
        }
        try {
            jSONObject.put("osType", "android");
            jSONObject.put("osVersion", Build.VERSION.SDK_INT);
        } catch (Exception unused2) {
        }
        try {
            jSONObject.put("sdkName", "alibabauth_sdk");
            jSONObject.put("sdkVersion", KernelContext.sdkVersion);
            if (KernelContext.isMini) {
                str = "sdkType";
                str2 = "mini";
            } else {
                str = "sdkType";
                str2 = "std";
            }
            jSONObject.put(str, str2);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put("appId", KernelContext.getApplicationContext().getPackageName() + "|" + SystemUtils.getApkPublicKeyDigest());
            jSONObject.put("appKey", KernelContext.getAppKey());
            jSONObject.put("appName", CommonUtils.getAppLabel());
            jSONObject.put("appVersion", CommonUtils.getAndroidAppVersion());
        } catch (Exception unused4) {
        }
        try {
            jSONObject.put("openId", CredentialManager.INSTANCE.getInternalSession().user.openId);
        } catch (Exception unused5) {
        }
        return jSONObject;
    }

    public void init() {
    }

    public void send(String str, Map<String, String> map) {
        JSONObject appInfo = getAppInfo();
        try {
            if (!TextUtils.isEmpty(str)) {
                appInfo.put("action", str);
            }
            if (map != null) {
                appInfo.put("actionExt", JSONUtils.toJsonObject(map));
            }
            new Thread(new a(this, appInfo)).start();
        } catch (Exception unused) {
        }
    }
}
