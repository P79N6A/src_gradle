package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVApiPlugin;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.WVPluginManager;
import android.taobao.windvane.jsbridge.WVResult;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class JSLogBridge extends WVApiPlugin {

    class LogBody {
        String data;
        String module;
        String tag;

        LogBody() {
        }
    }

    public static void init() {
        WVPluginManager.registerPlugin("tlogBridge", JSLogBridge.class, true);
    }

    private LogBody getLog(String str) {
        try {
            LogBody logBody = new LogBody();
            JSONObject jSONObject = new JSONObject(str);
            logBody.tag = jSONObject.optString("tag", "jsTag");
            logBody.data = jSONObject.optString(PushConstants.CONTENT, "");
            return logBody;
        } catch (JSONException unused) {
            return null;
        }
    }

    public void logd(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logd(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void loge(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.loge(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logi(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logi(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logv(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logv(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public void logw(String str, WVCallBackContext wVCallBackContext) {
        LogBody log = getLog(str);
        if (log != null) {
            AdapterForTLog.logw(log.tag, str);
            wVCallBackContext.success();
            return;
        }
        wVCallBackContext.error("the tag is null!");
    }

    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        if (TextUtils.isEmpty(str) || wVCallBackContext == null) {
            return false;
        }
        if ("getLogLevel".equals(str)) {
            WVResult wVResult = new WVResult();
            wVResult.addData("logLevel", AdapterForTLog.getLogLevel());
            wVCallBackContext.success(wVResult);
        } else if ("logv".equals(str)) {
            logv(str2, wVCallBackContext);
        } else if ("logd".equals(str)) {
            logd(str2, wVCallBackContext);
        } else if ("logi".equals(str)) {
            logi(str2, wVCallBackContext);
        } else if ("logw".equals(str)) {
            logw(str2, wVCallBackContext);
        } else if (!"loge".equals(str)) {
            return false;
        } else {
            loge(str2, wVCallBackContext);
        }
        return true;
    }
}
