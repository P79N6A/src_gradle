package com.bytedance.router.net;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.dynamic.RouterConfig;
import com.bytedance.router.dynamic.ServerParam;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SmartRouterApi {
    private static String ROUTER_CONFIG_URL = "https://lf.snssdk.com/smart_router/config";
    private static String ROUTER_REPORT_URL = "https://lf.snssdk.com/smart_router/report";
    private static Map<String, String> sCommonParams;

    public static class ApiResult<T> {
        public int errorCode = -1;
        public T result;
    }

    private static Map<String, String> getCommonParams(Context context) {
        if (sCommonParams != null) {
            return sCommonParams;
        }
        sCommonParams = new HashMap();
        try {
            sCommonParams.put("version_code", String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).versionCode));
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData;
            if (bundle != null) {
                sCommonParams.put("update_version_code", String.valueOf(bundle.getInt("UPDATE_VERSION_CODE")));
            }
            sCommonParams.put("device_platform", "android");
            sCommonParams.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        } catch (Exception unused) {
            sCommonParams = null;
        }
        return sCommonParams;
    }

    private static String getRouterConfigTag(Context context) {
        if (getCommonParams(context) == null) {
            return "";
        }
        String str = "";
        String str2 = sCommonParams.get("version_code");
        String str3 = sCommonParams.get("update_version_code");
        if (!TextUtils.isEmpty(str2)) {
            str = str + str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            str = str + "_" + str2;
        }
        return str;
    }

    public static ApiResult<RouterConfig> requestConfig(Context context, ServerParam serverParam) {
        ApiResult<RouterConfig> apiResult = new ApiResult<>();
        Map<String, String> commonParams = getCommonParams(context);
        if (commonParams == null) {
            Logger.e("SmartRouterApi#requestConfig commonParams is null!!!");
            return apiResult;
        } else if (serverParam == null) {
            Logger.e("SmartRouterApi#requestConfig serverParam is null!!!");
            return apiResult;
        } else {
            commonParams.put("aid", String.valueOf(serverParam.getAid()));
            commonParams.put("device_id", String.valueOf(serverParam.getDeviceId()));
            commonParams.put("channel", String.valueOf(serverParam.getChannel()));
            NetResponse netResponse = NetClient.get(ROUTER_CONFIG_URL, commonParams);
            if (netResponse == null) {
                return apiResult;
            }
            if (netResponse.errorCode == 200) {
                try {
                    JSONObject jSONObject = new JSONObject(netResponse.content);
                    apiResult.errorCode = jSONObject.optInt("errorCode");
                    if (apiResult.errorCode == 0) {
                        String routerConfigTag = getRouterConfigTag(context);
                        if (!TextUtils.isEmpty(routerConfigTag)) {
                            apiResult.result = new RouterConfig(routerConfigTag);
                            ((RouterConfig) apiResult.result).setIncMapping(RouterConfig.parseJsonArray(jSONObject.optJSONArray("mapping")));
                            ((RouterConfig) apiResult.result).setRewriteMapping(RouterConfig.parseJsonArray(jSONObject.optJSONArray("rewrite")));
                            apiResult.errorCode = 0;
                        }
                        if (Logger.isDebug()) {
                            Logger.d("SmartRouterApi#requestConfig success, content: " + jSONObject.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            } else {
                apiResult.errorCode = netResponse.errorCode;
            }
            return apiResult;
        }
    }

    public static boolean reportRouterConfig(Context context, ServerParam serverParam, RouterConfig routerConfig) {
        boolean z;
        ApiResult apiResult = new ApiResult();
        Map<String, String> commonParams = getCommonParams(context);
        if (commonParams == null) {
            Logger.e("SmartRouterApi#reportRouterConfig commonParams is null!!!");
            return false;
        } else if (serverParam == null) {
            Logger.e("SmartRouterApi#reportRouterConfig serverParam is null!!!");
            return false;
        } else if (routerConfig == null || (routerConfig.getIncMapping().isEmpty() && routerConfig.getRewriteMapping().isEmpty())) {
            Logger.d("SmartRouterApi#reportRouterConfig there is no need to report.");
            return true;
        } else {
            commonParams.put("aid", String.valueOf(serverParam.getAid()));
            commonParams.put("device_id", String.valueOf(serverParam.getDeviceId()));
            commonParams.put("channel", String.valueOf(serverParam.getChannel()));
            JSONObject jSONObject = new JSONObject();
            if (routerConfig != null) {
                JSONArray jSONArray = new JSONArray();
                try {
                    if (routerConfig.getIncMapping() != null) {
                        for (Map.Entry next : routerConfig.getIncMapping().entrySet()) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("schema", next.getKey());
                            jSONObject2.put("target", next.getValue());
                            jSONObject2.put("type", 1);
                            jSONArray.put(jSONObject2);
                        }
                    }
                    if (routerConfig.getRewriteMapping() != null) {
                        for (Map.Entry next2 : routerConfig.getRewriteMapping().entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("schema", next2.getKey());
                            jSONObject3.put("target", next2.getValue());
                            jSONObject3.put("type", 2);
                            jSONArray.put(jSONObject3);
                        }
                    }
                    jSONObject.put("route", jSONArray);
                } catch (JSONException unused) {
                }
            }
            NetResponse post = NetClient.post(ROUTER_REPORT_URL, commonParams, jSONObject);
            if (200 == post.errorCode) {
                try {
                    apiResult.errorCode = new JSONObject(post.content).optInt("errorCode");
                } catch (Exception unused2) {
                }
            } else {
                apiResult.errorCode = post.errorCode;
            }
            StringBuilder sb = new StringBuilder("SmartRouterApi#reportRouterConfig result: ");
            if (apiResult.errorCode == 0) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            Logger.d(sb.toString());
            if (apiResult.errorCode == 0) {
                return true;
            }
            return false;
        }
    }
}
