package com.tt.miniapphost;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;
import com.tt.miniapphost.dynamic.IBaseBundleManager;
import com.tt.miniapphost.entity.AppInfoEntity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ParamManager {
    static Map<String, String> baseParam;
    static String doraVersion;
    static String fullAppSdkVersion;
    static String jsEngineVersion;
    static String jsSdkVersion;
    static String miniAppSdkVersion;

    public static class CommonParams {
    }

    public static String getDoraVersion() {
        if (!(!TextUtils.isEmpty(doraVersion) || AppbrandApplication.getInst() == null || AppbrandApplication.getInst().getBuildConfig() == null)) {
            doraVersion = AppbrandApplication.getInst().getBuildConfig().getDoraVersion();
        }
        return doraVersion;
    }

    public static String getFullAppSdkVersion() {
        if (!(!TextUtils.isEmpty(fullAppSdkVersion) || AppbrandApplication.getInst() == null || AppbrandApplication.getInst().getBuildConfig() == null)) {
            fullAppSdkVersion = AppbrandApplication.getInst().getBuildConfig().getMiniAppSdkVersion();
        }
        return fullAppSdkVersion;
    }

    public static String getJsEngineVersion() {
        if (!(!TextUtils.isEmpty(jsEngineVersion) || AppbrandApplication.getInst() == null || AppbrandApplication.getInst().getBuildConfig() == null)) {
            jsEngineVersion = AppbrandApplication.getInst().getBuildConfig().getJsEngineVersion();
        }
        return jsEngineVersion;
    }

    public static String getMiniAppSdkVersion() {
        String fullAppSdkVersion2 = getFullAppSdkVersion();
        if (TextUtils.isEmpty(miniAppSdkVersion) && !TextUtils.isEmpty(fullAppSdkVersion2)) {
            String[] split = fullAppSdkVersion2.split("\\.");
            miniAppSdkVersion = split[0] + ClassUtils.PACKAGE_SEPARATOR + split[1] + ClassUtils.PACKAGE_SEPARATOR + split[2];
        }
        return miniAppSdkVersion;
    }

    public static String getJsSdkVersion(Context context) {
        if (context == null) {
            return jsSdkVersion;
        }
        if (!TextUtils.isEmpty(jsSdkVersion)) {
            return jsSdkVersion;
        }
        IBaseBundleManager baseBundleManager = AppbrandHostConstants.getBundleManager().getBaseBundleManager();
        if (baseBundleManager != null) {
            jsSdkVersion = baseBundleManager.getSdkCurrentVersionStr(context);
        }
        return jsSdkVersion;
    }

    public static Map<String, String> getBaseEventParam(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = null;
        if (baseParam == null && context != null) {
            baseParam = new HashMap();
            if (AppbrandHostConstants.getBundleManager().getBaseBundleManager() != null) {
                str4 = AppbrandHostConstants.getBundleManager().getBaseBundleManager().getSdkCurrentVersionStr(context);
            } else {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str4)) {
                baseParam.put("tma_jssdk_version", str4);
            }
            if (AppbrandApplication.getInst() != null) {
                if (AppbrandApplication.getInst().getAppInfo() != null) {
                    str7 = AppbrandApplication.getInst().getAppInfo().appId;
                } else {
                    str7 = "";
                }
                if (!TextUtils.isEmpty(str7)) {
                    baseParam.put("tma_app_id", str7);
                }
            }
            if (AppbrandContext.getInst().getInitParams() != null) {
                str5 = AppbrandContext.getInst().getInitParams().getAppId();
            } else {
                str5 = "";
            }
            if (!TextUtils.isEmpty(str5)) {
                baseParam.put("host_app_id", str5);
            }
            if (AppbrandContext.getInst().getInitParams() != null) {
                str6 = AppbrandContext.getInst().getInitParams().getPluginVersion();
            } else {
                str6 = "";
            }
            if (!TextUtils.isEmpty(str6)) {
                baseParam.put("tma_plugin_version", str6);
            }
            String miniAppSdkVersion2 = getMiniAppSdkVersion();
            if (!TextUtils.isEmpty(miniAppSdkVersion2)) {
                baseParam.put("tma_sdk_version", miniAppSdkVersion2);
            }
            String jsEngineVersion2 = getJsEngineVersion();
            if (!TextUtils.isEmpty(jsEngineVersion2)) {
                baseParam.put("tma_j2v8_version", jsEngineVersion2);
            }
            String doraVersion2 = getDoraVersion();
            if (!TextUtils.isEmpty(doraVersion2)) {
                baseParam.put("tma_dora_version", doraVersion2);
            }
        }
        if (TextUtils.isEmpty(baseParam.get("tma_dora_version"))) {
            baseParam.put("tma_dora_version", getDoraVersion());
        }
        if (TextUtils.isEmpty(baseParam.get("tma_j2v8_version"))) {
            baseParam.put("tma_j2v8_version", getJsEngineVersion());
        }
        if (TextUtils.isEmpty(baseParam.get("tma_sdk_version"))) {
            baseParam.put("tma_sdk_version", getMiniAppSdkVersion());
        }
        if (TextUtils.isEmpty(baseParam.get("tma_plugin_version"))) {
            if (AppbrandContext.getInst().getInitParams() != null) {
                str3 = AppbrandContext.getInst().getInitParams().getPluginVersion();
            } else {
                str3 = "";
            }
            baseParam.put("tma_plugin_version", str3);
        }
        if (TextUtils.isEmpty(baseParam.get("host_app_id"))) {
            if (AppbrandContext.getInst().getInitParams() != null) {
                str2 = AppbrandContext.getInst().getInitParams().getAppId();
            } else {
                str2 = "";
            }
            baseParam.put("host_app_id", str2);
        }
        if (TextUtils.isEmpty(baseParam.get("tma_app_id")) && AppbrandApplication.getInst() != null) {
            if (AppbrandApplication.getInst().getAppInfo() != null) {
                str = AppbrandApplication.getInst().getAppInfo().appId;
            } else {
                str = "";
            }
            baseParam.put("tma_app_id", str);
        }
        if (TextUtils.isEmpty(baseParam.get("tma_jssdk_version"))) {
            if (AppbrandHostConstants.getBundleManager().getBaseBundleManager() != null) {
                str8 = AppbrandHostConstants.getBundleManager().getBaseBundleManager().getSdkCurrentVersionStr(context);
            }
            baseParam.put("tma_jssdk_version", str8);
        }
        return baseParam;
    }

    private static void addExtraEventParams(AppInfoEntity appInfoEntity, JSONObject jSONObject) throws JSONException {
        if (appInfoEntity != null && !TextUtils.isEmpty(appInfoEntity.extra) && jSONObject != null) {
            JSONObject optJSONObject = new JSONObject(appInfoEntity.extra).optJSONObject("event_extra");
            if (optJSONObject != null) {
                try {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, optJSONObject.get(next));
                    }
                } catch (JSONException e2) {
                    AppBrandLogger.stacktrace(5, "tma_ParamManager", e2.getStackTrace());
                }
            }
        }
    }

    public static void copyBasicCommonParams(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null) {
            try {
                jSONObject2.put("lib_version", jSONObject.opt("lib_version"));
                jSONObject2.put("miniapp_sdk_version", jSONObject.opt("miniapp_sdk_version"));
                jSONObject2.put("js_engine_version", jSONObject.opt("js_engine_version"));
                jSONObject2.put("dora_version", jSONObject.opt("dora_version"));
                jSONObject2.put("_param_for_special", jSONObject.opt("_param_for_special"));
                jSONObject2.put("mp_id", jSONObject.opt("mp_id"));
                jSONObject2.put("mp_gid", jSONObject.opt("mp_gid"));
                jSONObject2.put("mp_name", jSONObject.opt("mp_name"));
                jSONObject2.put("launch_from", jSONObject.opt("launch_from"));
                jSONObject2.put("scene", jSONObject.opt("scene"));
                jSONObject2.put("sub_scene", jSONObject.opt("sub_scene"));
                jSONObject2.put("bdp_log", jSONObject.opt("bdp_log"));
                jSONObject2.put("location", jSONObject.opt("location"));
                jSONObject2.put("biz_location", jSONObject.opt("biz_location"));
            } catch (JSONException e2) {
                AppBrandLogger.eWithThrowable("tma_ParamManager", "fetchCommonParams exp!", e2);
            }
        }
    }

    public static JSONObject getCommonParams(JSONObject jSONObject, AppInfoEntity appInfoEntity) {
        String str;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (appInfoEntity == null) {
            appInfoEntity = AppbrandApplication.getInst().getAppInfo();
        }
        try {
            jSONObject.put("lib_version", getJsSdkVersion(AppbrandContext.getInst().getApplicationContext()));
            jSONObject.put("js_engine_version", getJsEngineVersion());
            jSONObject.put("dora_version", getDoraVersion());
            jSONObject.put("miniapp_sdk_version", getMiniAppSdkVersion());
            if (appInfoEntity == null) {
                jSONObject.put("_param_for_special", "micro_app");
                return jSONObject;
            }
            if (appInfoEntity.isGame()) {
                str = "micro_game";
            } else {
                str = "micro_app";
            }
            jSONObject.put("_param_for_special", str);
            jSONObject.put("mp_id", appInfoEntity.appId);
            jSONObject.put("mp_gid", appInfoEntity.ttId);
            jSONObject.put("mp_name", appInfoEntity.appName);
            if (!TextUtils.isEmpty(appInfoEntity.launchFrom)) {
                jSONObject.put("launch_from", appInfoEntity.launchFrom);
            }
            jSONObject.put("scene", appInfoEntity.scene);
            jSONObject.put("sub_scene", appInfoEntity.subScene);
            if (!TextUtils.isEmpty(appInfoEntity.bdpLog)) {
                jSONObject.put("bdp_log", appInfoEntity.bdpLog);
            }
            if (!TextUtils.isEmpty(appInfoEntity.location)) {
                jSONObject.put("location", appInfoEntity.location);
            }
            if (!TextUtils.isEmpty(appInfoEntity.bizLocation)) {
                jSONObject.put("biz_location", appInfoEntity.bizLocation);
            }
            addExtraEventParams(appInfoEntity, jSONObject);
            return jSONObject;
        } catch (JSONException e2) {
            AppBrandLogger.stacktrace(6, "tma_ParamManager", e2.getStackTrace());
        }
    }
}
