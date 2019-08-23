package com.ss.android.ugc.aweme.services;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.api.h;
import com.ss.android.ugc.aweme.b.a.a;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.survey.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bJ\u001a\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001H$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/services/AbsApiMonitorService;", "", "()V", "handler", "Landroid/os/Handler;", "addALog", "", "url", "", "res", "Lcom/bytedance/retrofit2/SsResponse;", "apiMonitor", "requestId", "body", "checkApiFailedAndMonitor", "checkApiSuccess", "", "filter", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class AbsApiMonitorService {
    public static final Companion Companion = new Companion(null);
    private static final Gson GSON = new Gson();
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/services/AbsApiMonitorService$Companion;", "", "()V", "GSON", "Lcom/google/gson/Gson;", "MONITOR_LOG_TYPE", "", "TAG", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public abstract boolean filter(@NotNull String str, @NotNull Object obj);

    public final void addALog(@NotNull String str, @NotNull SsResponse<?> ssResponse) {
        String str2 = str;
        SsResponse<?> ssResponse2 = ssResponse;
        if (PatchProxy.isSupport(new Object[]{str2, ssResponse2}, this, changeQuickRedirect, false, 71326, new Class[]{String.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, ssResponse2}, this, changeQuickRedirect, false, 71326, new Class[]{String.class, SsResponse.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(ssResponse2, "res");
        try {
            a aVar = a.f34456b;
            List<Header> headers = ssResponse.headers();
            if (PatchProxy.isSupport(new Object[]{str2, headers}, aVar, a.f34455a, false, 21568, new Class[]{String.class, List.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{str2, headers}, aVar2, a.f34455a, false, 21568, new Class[]{String.class, List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
                Uri parse = Uri.parse(str);
                if (!TextUtils.isEmpty(parse.getQueryParameter("device_id"))) {
                    if (!TextUtils.isEmpty(parse.getQueryParameter("aid"))) {
                        if (headers != null) {
                            ALog.d("API_URL_HEADER", "URL: " + str2 + "\r\nHEADER" + headers.toString());
                        }
                    }
                }
            }
        } catch (NoSuchMethodError unused) {
        }
    }

    public final void checkApiFailedAndMonitor(@NotNull String str, @NotNull SsResponse<?> ssResponse) {
        List<Header> list;
        if (PatchProxy.isSupport(new Object[]{str, ssResponse}, this, changeQuickRedirect, false, 71325, new Class[]{String.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, ssResponse}, this, changeQuickRedirect, false, 71325, new Class[]{String.class, SsResponse.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(ssResponse, "res");
        Object body = ssResponse.body();
        if (ssResponse.isSuccessful()) {
            Intrinsics.checkExpressionValueIsNotNull(body, "body");
            if (!checkApiSuccess(str, body)) {
                String str2 = "";
                if (body instanceof h) {
                    str2 = ((h) body).getRequestId();
                }
                if (TextUtils.isEmpty(str2)) {
                    Response raw = ssResponse.raw();
                    if (raw != null) {
                        list = raw.headers("X-TT-LOGID");
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        for (Header header : list) {
                            Intrinsics.checkExpressionValueIsNotNull(header, AdvanceSetting.NETWORK_TYPE);
                            str2 = header.getValue();
                            TextUtils.isEmpty(str2);
                        }
                    }
                }
                try {
                    String json = GSON.toJson(body);
                    Intrinsics.checkExpressionValueIsNotNull(json, "GSON.toJson(body)");
                    apiMonitor(str, str2, json);
                } catch (NoSuchMethodError unused) {
                }
            }
        }
    }

    private final boolean checkApiSuccess(String str, Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str, obj2}, this, changeQuickRedirect, false, 71327, new Class[]{String.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, obj2}, this, changeQuickRedirect, false, 71327, new Class[]{String.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj2 == null) {
            return false;
        } else {
            String str2 = null;
            if (obj2 instanceof String) {
                if (TextUtils.isEmpty((CharSequence) obj2)) {
                    return false;
                }
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                if (!TextUtils.equals("musically", b2.f3305c)) {
                    com.ss.android.ugc.aweme.framework.core.a b3 = com.ss.android.ugc.aweme.framework.core.a.b();
                    Intrinsics.checkExpressionValueIsNotNull(b3, "AppTracker.get()");
                    if (!TextUtils.equals("tiktok", b3.f3305c)) {
                        CharSequence charSequence = "/aweme/v1/user/";
                        Uri parse = Uri.parse(str);
                        if (parse != null) {
                            str2 = parse.getPath();
                        }
                        if (TextUtils.equals(charSequence, str2)) {
                            try {
                                JSONObject jSONObject = new JSONObject((String) obj2);
                                if ((jSONObject.has("status_code") && jSONObject.optInt("status_code") != 0) || !jSONObject.has(AllStoryActivity.f73306b)) {
                                    return false;
                                }
                                JSONObject jSONObject2 = jSONObject.getJSONObject(AllStoryActivity.f73306b);
                                if (Intrinsics.areEqual(jSONObject2.opt("uid"), (Object) 0) || TextUtils.isEmpty(jSONObject2.optString("nickname"))) {
                                    return false;
                                }
                            } catch (Exception unused) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            } else if (obj2 instanceof BaseResponse) {
                BaseResponse baseResponse = (BaseResponse) obj2;
                if (baseResponse.status_code == 0 || Intrinsics.areEqual((Object) baseResponse.message, (Object) "success")) {
                    return true;
                }
                return false;
            } else if (obj2 instanceof com.ss.android.ugc.aweme.commerce.service.d.a) {
                com.ss.android.ugc.aweme.commerce.service.d.a aVar = (com.ss.android.ugc.aweme.commerce.service.d.a) obj2;
                if (aVar.statusCode == 0 || Intrinsics.areEqual((Object) aVar.message, (Object) "success")) {
                    return true;
                }
                return false;
            } else if (obj2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj2;
                if (jSONObject3.has("statusCode") && jSONObject3.optInt("statusCode") == 0) {
                    return true;
                }
                if (jSONObject3.has("status_code") && jSONObject3.optInt("status_code") == 0) {
                    return true;
                }
                if (!jSONObject3.has("message") || !TextUtils.equals("success", jSONObject3.optString("message"))) {
                    return false;
                }
                return true;
            } else if (obj2 instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) obj2;
                if (jsonObject.has("statusCode")) {
                    JsonElement jsonElement = jsonObject.get("statusCode");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement, "body.get(\"statusCode\")");
                    if (jsonElement.getAsInt() == 0) {
                        return true;
                    }
                }
                if (jsonObject.has("status_code")) {
                    JsonElement jsonElement2 = jsonObject.get("status_code");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement2, "body.get(\"status_code\")");
                    if (jsonElement2.getAsInt() == 0) {
                        return true;
                    }
                }
                if (jsonObject.has("message")) {
                    JsonElement jsonElement3 = jsonObject.get("message");
                    Intrinsics.checkExpressionValueIsNotNull(jsonElement3, "body.get(\"message\")");
                    if (TextUtils.equals("success", jsonElement3.getAsString())) {
                        return true;
                    }
                }
                return false;
            } else if (obj2 instanceof FeedItemList) {
                FeedItemList feedItemList = (FeedItemList) obj2;
                if (feedItemList.items == null || feedItemList.items.size() <= 0) {
                    return false;
                }
                return true;
            } else if ((obj2 instanceof TypedInput) || (obj2 instanceof TypedOutput) || (obj2 instanceof com.bytedance.retrofit2.client.a) || (obj2 instanceof LinkedTreeMap) || (obj2 instanceof e) || !com.ss.android.ugc.aweme.g.a.a()) {
                return true;
            } else {
                Uri parse2 = Uri.parse(str);
                Intrinsics.checkExpressionValueIsNotNull(parse2, "Uri.parse(url)");
                String path = parse2.getPath();
                Intrinsics.checkExpressionValueIsNotNull(path, "path");
                if (StringsKt.startsWith$default(path, "/webcast/", false, 2, null) || StringsKt.startsWith$default(path, "/aweme/v1/im/", false, 2, null) || StringsKt.startsWith$default(path, "/v1/message/", false, 2, null) || path.equals("/api/ad/v1/adlink/") || path.equals("/aweme/v1/fansclub/club/")) {
                    return true;
                }
                return filter(str, obj);
            }
        }
    }

    public final void apiMonitor(@NotNull String str, @Nullable String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 71324, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, changeQuickRedirect, false, 71324, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str6, "body");
        Uri parse = Uri.parse(str);
        if (parse != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(PushConstants.WEB_URL, str4);
                jSONObject.put("path", parse.getPath());
                jSONObject.put("host", parse.getHost());
                jSONObject.put("body", str6);
                jSONObject.put("requestid", str5);
                jSONObject.put("debug", com.ss.android.ugc.aweme.g.a.a());
                n.b("api_error_service_log", "", jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
