package com.ss.android.ugc.aweme.services;

import a.i;
import a.j;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.g.c;
import com.ss.android.ugc.aweme.account.login.twostep.e;
import com.ss.android.ugc.aweme.account.terminal.a;
import com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.w;
import java.net.URI;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J6\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0016J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J.\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/services/InterceptorService;", "Lcom/ss/android/ugc/aweme/services/BaseInterceptorService;", "()V", "currentErrorCode", "", "Ljava/lang/Integer;", "currentUrlPath", "", "getAuthType", "errorCode", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "getPathFromUrl", "fullUrl", "interceptAndGetNewParams", "", "request", "Lcom/bytedance/retrofit2/client/Request;", "ssResponse", "Lcom/bytedance/retrofit2/SsResponse;", "", "parseErrorCode", "response", "(Ljava/lang/String;)Ljava/lang/Integer;", "shouldIntercept", "", "startTwoStepAuthentication", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/interfaces/TwoStepAuthResponse;", "activity", "Landroid/app/Activity;", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class InterceptorService extends BaseInterceptorService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Integer currentErrorCode;
    private String currentUrlPath;

    private final Integer getAuthType(Integer num) {
        if (PatchProxy.isSupport(new Object[]{num}, this, changeQuickRedirect, false, 71392, new Class[]{Integer.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{num}, this, changeQuickRedirect, false, 71392, new Class[]{Integer.class}, Integer.class);
        } else if (num != null && num.intValue() == 2020) {
            return 2;
        } else {
            if (num != null && num.intValue() == 2022) {
                return 1;
            }
            if (num != null && num.intValue() == 2025) {
                return 3;
            }
            return null;
        }
    }

    private final String getPathFromUrl(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, changeQuickRedirect, false, 71390, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3}, this, changeQuickRedirect, false, 71390, new Class[]{String.class}, String.class);
        }
        try {
            str2 = new URI(str3).getPath();
        } catch (Exception unused) {
            str2 = null;
        }
        return str2;
    }

    private final Integer parseErrorCode(String str) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71391, new Class[]{String.class}, Integer.class)) {
            return (Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71391, new Class[]{String.class}, Integer.class);
        }
        try {
            i = new JSONObject(str2).getJSONObject("data").optInt("error_code");
        } catch (JSONException unused) {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    public final boolean shouldIntercept(@NotNull Request request) {
        Request request2 = request;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{request2}, this, changeQuickRedirect, false, 71387, new Class[]{Request.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{request2}, this, changeQuickRedirect, false, 71387, new Class[]{Request.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(request2, "request");
        String url = request.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url, "request.url");
        if (url.length() <= 0) {
            z = false;
        }
        String url2 = request.getUrl();
        Intrinsics.checkExpressionValueIsNotNull(url2, "request.url");
        return StringsKt.contains$default((CharSequence) url2, (CharSequence) "/passport/", false, 2, (Object) null) & z;
    }

    private final i<c> startTwoStepAuthentication(Activity activity, String str, String str2) {
        Activity activity2 = activity;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{activity2, str3, str4}, this, changeQuickRedirect, false, 71389, new Class[]{Activity.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{activity2, str3, str4}, this, changeQuickRedirect, false, 71389, new Class[]{Activity.class, String.class, String.class}, i.class);
        }
        j jVar = new j();
        if (activity2 == null || str4 == null) {
            jVar.b(new Exception("Activity or response is null, activity: " + activity2 + ", response: " + str4));
            return jVar.f1091a;
        }
        this.currentErrorCode = parseErrorCode(str4);
        Integer authType = getAuthType(this.currentErrorCode);
        if (authType == null) {
            jVar.b(new Exception("Failed to parse error code from JSON response: " + str4));
            return jVar.f1091a;
        }
        e.a().a((b) new InterceptorService$startTwoStepAuthentication$1(jVar));
        this.currentUrlPath = getPathFromUrl(str3);
        Intent intent = new Intent(activity2, TwoStepAuthActivity.class);
        intent.putExtra("auth_type", authType.intValue());
        intent.putExtra("auth_data", str4);
        intent.putExtra("url_path", this.currentUrlPath);
        activity2.startActivity(intent);
        return jVar.f1091a;
    }

    @NotNull
    public final Map<String, String> interceptAndGetNewParams(int i, @Nullable Request request, @Nullable SsResponse<Object> ssResponse) {
        String str;
        Object obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), request, ssResponse}, this, changeQuickRedirect, false, 71388, new Class[]{Integer.TYPE, Request.class, SsResponse.class}, Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), request, ssResponse}, this, changeQuickRedirect, false, 71388, new Class[]{Integer.TYPE, Request.class, SsResponse.class}, Map.class);
        }
        ArrayMap arrayMap = new ArrayMap();
        if (!InterceptorServiceKt.TWO_STEP_AUTH_ERROR_CODES.contains(Integer.valueOf(i))) {
            return arrayMap;
        }
        Activity a2 = ((com.ss.android.ugc.aweme.main.h.i) w.a(com.ss.android.ugc.aweme.main.h.i.class)).a();
        String str2 = null;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        if (ssResponse != null) {
            obj = ssResponse.body();
        } else {
            obj = null;
        }
        i<c> startTwoStepAuthentication = startTwoStepAuthentication(a2, str, String.valueOf(obj));
        if (startTwoStepAuthentication == null) {
            return arrayMap;
        }
        startTwoStepAuthentication.g();
        c cVar = (c) startTwoStepAuthentication.e();
        if (InterceptorServiceKt.DEBUG) {
            StringBuilder sb = new StringBuilder("interceptAndGetNewParams, 2-step auth result: ");
            sb.append(cVar);
            if (cVar != null) {
                str2 = "ticket: " + cVar.f31967b + ", profileKey: " + cVar.f31968c + ", errorCode: " + cVar.f31969d + ", errorMessage: " + cVar.f31970e;
            }
            sb.append(str2);
        }
        if (cVar == null || TextUtils.isEmpty(cVar.f31967b)) {
            return arrayMap;
        }
        if (!TextUtils.isEmpty(cVar.f31968c)) {
            arrayMap.put("profile_key", cVar.f31968c);
        }
        Map<String, String> map = arrayMap;
        map.put("verify_ticket", cVar.f31967b);
        a.C0415a aVar = a.f32778d;
        String str3 = this.currentUrlPath;
        Integer num = this.currentErrorCode;
        if (PatchProxy.isSupport(new Object[]{str3, num}, aVar, a.C0415a.f32779a, false, 20937, new Class[]{String.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, num}, aVar, a.C0415a.f32779a, false, 20937, new Class[]{String.class, Integer.class}, Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.g.a.a();
            n.a("two_step_auth", 0, com.ss.android.ugc.aweme.account.a.a.a.a().a("url_path", str3).a("error_code", num).b());
        }
        return map;
    }
}
