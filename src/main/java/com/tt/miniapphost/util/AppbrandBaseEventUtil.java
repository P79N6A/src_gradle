package com.tt.miniapphost.util;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tt.miniapphost.AppBrandLogger;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.option.net.NetRequestUtil;
import com.tt.option.net.TmaFileResponse;
import com.tt.option.net.TmaRequest;
import com.tt.option.net.TmaResponse;
import java.io.File;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@MiniAppProcess
public class AppbrandBaseEventUtil {

    public static class EventName {
    }

    public static class EventParams {
    }

    @NonNull
    private static JSONObject getCommonParams(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lib_version", str);
            jSONObject.put("latest_version", str2);
            jSONObject.put("result_type", str3);
            jSONObject.put("_param_for_special", "micro_app");
        } catch (JSONException e2) {
            AppBrandLogger.stacktrace(6, "AppbrandBaseEventUtil", e2.getStackTrace());
        }
        return jSONObject;
    }

    public static void mpRequestResult(TmaRequest tmaRequest, TmaResponse tmaResponse, long j) {
        AppInfoEntity appInfoEntity;
        String str;
        int i;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.WEB_URL, tmaRequest.getUrl());
            jSONObject.put("duration", j);
            jSONObject.put("is_net_availbale", NetRequestUtil.isNetworkAvailable(AppbrandContext.getInst().getApplicationContext()) ? 1 : 0);
            jSONObject.put("net_type", NetRequestUtil.getNetType(AppbrandContext.getInst().getApplicationContext()));
            if (tmaResponse != null) {
                jSONObject.put("net_code", tmaResponse.getCode());
                jSONObject.put("net_message", tmaResponse.getMessage());
                jSONObject.put("data", tmaResponse.getData());
                jSONObject.put("err_stack", Log.getStackTraceString(tmaResponse.getThrowable()));
                if (tmaResponse instanceof TmaFileResponse) {
                    File downloadedFile = ((TmaFileResponse) tmaResponse).getDownloadedFile();
                    if (downloadedFile == null || !downloadedFile.exists()) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("download_file_result", i);
                }
                if (tmaResponse.getExtraInfoJsonObj() != null) {
                    Iterator<String> keys = tmaResponse.getExtraInfoJsonObj().keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, tmaResponse.getExtraInfoJsonObj().get(next));
                    }
                }
            }
            if (AppbrandApplication.getInst() != null) {
                appInfoEntity = AppbrandApplication.getInst().getAppInfo();
            } else {
                appInfoEntity = null;
            }
            if (appInfoEntity != null) {
                jSONObject.put("mp_id", appInfoEntity.appId);
                jSONObject.put("mp_name", appInfoEntity.appName);
                jSONObject.put("launch_from", appInfoEntity.launchFrom);
                if (appInfoEntity.isGame()) {
                    str = "micro_game";
                } else {
                    str = "micro_app";
                }
                jSONObject.put("_param_for_special", str);
            } else {
                jSONObject.put("_param_for_special", "micro_app");
            }
        } catch (JSONException unused) {
        }
        HostProcessBridge.logEvent("mp_sdk_request_result", jSONObject);
    }

    public static void mpLibResult(@NonNull String str, String str2, String str3, String str4, String str5, long j) {
        JSONObject commonParams = getCommonParams(str2, str3, str4);
        if (j >= 0) {
            try {
                commonParams.put("duration", j);
            } catch (JSONException e2) {
                AppBrandLogger.stacktrace(6, "AppbrandBaseEventUtil", e2.getStackTrace());
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            commonParams.put("error_msg", str5);
        }
        AppBrandLogger.d("AppbrandBaseEventUtil", "exit event:", commonParams.toString());
        HostProcessBridge.logEvent(str, commonParams);
    }
}
