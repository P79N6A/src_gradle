package com.ss.android.ugc.aweme.commercialize.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.sdk.activity.AbsBrowserFragment;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class d implements AbsBrowserFragment.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38530a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f38531e = "d";

    /* renamed from: b  reason: collision with root package name */
    public boolean f38532b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38533c;

    /* renamed from: d  reason: collision with root package name */
    public AwemeRawAd f38534d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38535f;
    private boolean g;
    private f h;
    private boolean i;
    private long j = System.currentTimeMillis();
    private WeakReference<Context> k;

    public final void a() {
        this.f38535f = true;
    }

    public final void a(int i2) {
    }

    public final void a(WebResourceResponse webResourceResponse) {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38530a, false, 30968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38530a, false, 30968, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f38532b) {
            this.f38532b = true;
            if (!this.f38533c && !this.g) {
                a("load_finish", (String) null);
            }
            if (this.h != null) {
                this.h.k();
            }
        }
    }

    public d(f fVar, boolean z) {
        this.h = fVar;
        this.i = z;
    }

    private void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f38530a, false, 30976, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f38530a, false, 30976, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (this.k != null && this.k.get() != null && this.f38534d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.j));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("fail_reason", str2);
            }
            g.a((Context) this.k.get(), "ad_wap_stat", str, this.f38534d, (Map<String, String>) hashMap);
        }
    }

    @TargetApi(23)
    public final void a(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceError}, this, f38530a, false, 30970, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceError}, this, f38530a, false, 30970, new Class[]{WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.j();
        }
        this.f38533c = true;
        a("load_fail", a(webResourceRequest.getUrl().toString(), webResourceError.getDescription().toString(), webResourceError.getErrorCode()));
    }

    @TargetApi(23)
    public final void a(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{webResourceRequest, webResourceResponse}, this, f38530a, false, 30971, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webResourceRequest, webResourceResponse}, this, f38530a, false, 30971, new Class[]{WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
            return;
        }
        if (this.i) {
            if (PatchProxy.isSupport(new Object[]{webResourceRequest}, this, f38530a, false, 30972, new Class[]{WebResourceRequest.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{webResourceRequest}, this, f38530a, false, 30972, new Class[]{WebResourceRequest.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (webResourceRequest != null) {
                    Uri url = webResourceRequest.getUrl();
                    if (PatchProxy.isSupport(new Object[]{url}, this, f38530a, false, 30973, new Class[]{Uri.class}, Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{url}, this, f38530a, false, 30973, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
                    } else if (url != null) {
                        String path = url.getPath();
                        if (!TextUtils.isEmpty(path)) {
                            z = path.endsWith("favicon.ico");
                        }
                    }
                }
                z = false;
            }
            if (!z) {
                if (this.h != null) {
                    this.h.j();
                }
                this.f38533c = true;
                a("load_fail", String.format("%s %s %d", new Object[]{webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), Integer.valueOf(webResourceResponse.getStatusCode())}));
            }
        }
    }

    private String a(String str, String str2, int i2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i2)}, this, f38530a, false, 30977, new Class[]{String.class, String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4, Integer.valueOf(i2)}, this, f38530a, false, 30977, new Class[]{String.class, String.class, Integer.TYPE}, String.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PushConstants.WEB_URL, str3);
            jSONObject.put("description", str4);
            jSONObject.put("code", i2);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    public final void a(int i2, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str3, str4}, this, f38530a, false, 30969, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str3, str4}, this, f38530a, false, 30969, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.j();
        }
        this.f38533c = true;
        int i3 = i2;
        a("load_fail", a(str4, str3, i2));
    }
}
