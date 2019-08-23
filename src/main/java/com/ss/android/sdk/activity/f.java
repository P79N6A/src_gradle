package com.ss.android.sdk.activity;

import android.annotation.TargetApi;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.bytedance.common.utility.StringUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

public final class f {
    @TargetApi(23)
    public static void a(JSONObject jSONObject, boolean z) {
        n.a("aweme_webview_open_error_rate", z ^ true ? 1 : 0, jSONObject);
    }

    @TargetApi(23)
    public static void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        a(jSONObject, "statusCode", null);
        a(jSONObject, "errorCode", Integer.valueOf(webResourceError.getErrorCode()));
        n.a("aweme_webview_assets_error", 0, jSONObject);
    }

    @TargetApi(23)
    public static void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "host", webResourceRequest.getUrl().getHost());
        a(jSONObject, "path", webResourceRequest.getUrl().getPath());
        a(jSONObject, "statusCode", Integer.valueOf(webResourceResponse.getStatusCode()));
        a(jSONObject, "errorCode", Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST));
        n.a("aweme_webview_assets_error", 0, jSONObject);
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        if (!StringUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }
}
