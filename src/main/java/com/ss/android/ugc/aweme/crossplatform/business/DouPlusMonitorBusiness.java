package com.ss.android.ugc.aweme.crossplatform.business;

import android.annotation.TargetApi;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import org.json.JSONException;
import org.json.JSONObject;

public class DouPlusMonitorBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40737a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f40738b;

    /* renamed from: c  reason: collision with root package name */
    private long f40739c;

    private String a() {
        return this.i.f40806b.s;
    }

    @Keep
    DouPlusMonitorBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40737a, false, 34250, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f40737a, false, 34250, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(a(), str2)) {
            this.f40738b = false;
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40737a, false, 34249, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f40737a, false, 34249, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(a(), str)) {
                this.f40738b = true;
                this.f40739c = System.currentTimeMillis();
                return;
            }
            this.f40738b = false;
        }
    }

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f40737a, false, 34252, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f40737a, false, 34252, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (this.f40738b) {
            this.f40738b = false;
            long currentTimeMillis = System.currentTimeMillis() - this.f40739c;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("duration", currentTimeMillis);
                jSONObject2.put("error_status", i);
                jSONObject2.put("error_message", str);
            } catch (JSONException unused) {
            }
            n.a("douplus_delivery_show", 0, jSONObject, jSONObject2);
        }
    }

    @TargetApi(23)
    public final void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceError}, this, f40737a, false, 34251, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceError}, this, f40737a, false, 34251, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
        } else if (this.f40738b && webResourceRequest != null && webResourceError != null && webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            if (url == null) {
                a(webResourceError.getErrorCode(), (String) null);
            } else {
                a(webResourceError.getErrorCode(), url.toString());
            }
        }
    }
}
