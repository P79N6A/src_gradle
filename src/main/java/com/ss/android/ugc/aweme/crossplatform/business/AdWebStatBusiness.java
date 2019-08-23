package com.ss.android.ugc.aweme.crossplatform.business;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.d;
import com.ss.android.sdk.c.g;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.a.a;
import com.ss.android.ugc.aweme.crossplatform.params.b;
import com.ss.android.ugc.aweme.web.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class AdWebStatBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40730a;

    /* renamed from: b  reason: collision with root package name */
    private long f40731b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40732c;

    /* renamed from: d  reason: collision with root package name */
    private final a f40733d = new a();

    public final void a(d dVar, g gVar) {
        d dVar2 = dVar;
        g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, gVar2}, this, f40730a, false, 34233, new Class[]{d.class, g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, gVar2}, this, f40730a, false, 34233, new Class[]{d.class, g.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        if (TextUtils.isEmpty(bVar.u) || bVar.v == 4) {
            dVar2.f30735a.add(new com.ss.android.ugc.aweme.web.a(gVar2.a(l.c().g())));
        }
    }

    public final void a(List<Pattern> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f40730a, false, 34234, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f40730a, false, 34234, new Class[]{List.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        if (TextUtils.isEmpty(bVar.u) || bVar.v == 4) {
            List<Pattern> arrayList = list == null ? new ArrayList<>() : list;
            try {
                List<String> adLandingPagePreloadCommonPrefix = com.ss.android.ugc.aweme.global.config.settings.g.b().s().getAdLandingPagePreloadCommonPrefix();
                if (!CollectionUtils.isEmpty(adLandingPagePreloadCommonPrefix)) {
                    for (String compile : adLandingPagePreloadCommonPrefix) {
                        arrayList.add(Pattern.compile(compile));
                    }
                }
            } catch (com.bytedance.ies.a unused) {
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40730a, false, 34241, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40730a, false, 34241, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Activity a2 = v.a(this.g.getContext());
        b bVar = this.i.f40806b;
        if (a2 != null) {
            JSONObject a3 = a(bVar);
            JSONObject a4 = a(bVar, (String) null);
            long currentTimeMillis = System.currentTimeMillis() - this.f40731b;
            this.f40731b = 0;
            if (bVar.f40800b > 0) {
                if (currentTimeMillis > 0 && !this.f40732c) {
                    this.f40733d.a(currentTimeMillis, bVar.f40800b, a3, a4);
                    this.f40732c = true;
                }
                if (z || a2.isFinishing()) {
                    this.f40733d.a(this.g.getContext(), (String) null, bVar.f40800b, a3, a4);
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40730a, false, 34240, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40730a, false, 34240, new Class[0], Void.TYPE);
            return;
        }
        this.f40731b = System.currentTimeMillis();
        this.f40732c = false;
        this.f40733d.a();
    }

    @Keep
    public AdWebStatBusiness(@NonNull d dVar) {
        super(dVar);
    }

    private JSONObject a(b bVar) {
        JSONObject jSONObject;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f40730a, false, 34242, new Class[]{b.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f40730a, false, 34242, new Class[]{b.class}, JSONObject.class);
        }
        JSONObject jSONObject2 = null;
        try {
            if (!TextUtils.isEmpty(bVar2.l)) {
                jSONObject = new JSONObject(bVar2.l);
            } else {
                jSONObject = new JSONObject();
            }
            jSONObject2 = jSONObject;
            jSONObject2.put("log_extra", bVar2.j);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    public final void b(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40730a, false, 34236, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40730a, false, 34236, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        this.f40733d.a(webView, str, bVar.f40800b, a(bVar), a(bVar, (String) null));
    }

    public final void c(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40730a, false, 34237, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40730a, false, 34237, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        this.f40733d.b(webView, str, bVar.f40800b, a(bVar), a(bVar, (String) null));
    }

    private JSONObject a(b bVar, String str) {
        b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{bVar2, str2}, this, f40730a, false, 34243, new Class[]{b.class, String.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{bVar2, str2}, this, f40730a, false, 34243, new Class[]{b.class, String.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", bVar2.w);
            if (!TextUtils.isEmpty(bVar2.u)) {
                jSONObject.put("site_id", bVar2.u);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void a(WebView webView, String str) {
        WebView webView2 = webView;
        String str2 = str;
        int i = 0;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{webView2, str2}, this, f40730a, false, 34235, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str2}, this, f40730a, false, 34235, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        this.f40733d.a(webView2, str2, bVar.u);
        com.ss.android.ugc.aweme.commercialize.feed.b.a aVar = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e;
        String str3 = bVar.u;
        int i2 = bVar.v;
        int i3 = bVar.w;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3)}, aVar, com.ss.android.ugc.aweme.commercialize.feed.b.a.f38809a, false, 30792, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            com.ss.android.ugc.aweme.commercialize.feed.b.a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i2), Integer.valueOf(i3)}, aVar2, com.ss.android.ugc.aweme.commercialize.feed.b.a.f38809a, false, 30792, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str3;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z) {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("site_id", str3);
            com.ss.android.ugc.aweme.commercialize.feed.b.b bVar2 = com.ss.android.ugc.aweme.commercialize.feed.b.a.f38812d.get(str3);
            if (bVar2 != null) {
                bVar2.f38818d = System.currentTimeMillis();
                map.put("webview_init_duration", Long.valueOf(bVar2.f38818d - bVar2.f38817c));
            }
            map.put("is_web_url", Integer.valueOf(i3));
            if (i2 == 4) {
                i = aVar.a(str3);
            }
            map.put("preload_status", Integer.valueOf(i));
            com.ss.android.ugc.aweme.commercialize.log.d.a().b("ad_landing_webview_init").a("ad_wap_stat").a((Object) hashMap).b();
        }
    }

    @TargetApi(23)
    public final void a(WebView webView, WebResourceRequest webResourceRequest, String str) {
        WebView webView2 = webView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{webView2, webResourceRequest, str2}, this, f40730a, false, 34238, new Class[]{WebView.class, WebResourceRequest.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, webResourceRequest, str2}, this, f40730a, false, 34238, new Class[]{WebView.class, WebResourceRequest.class, String.class}, Void.TYPE);
        } else if (webView2 == null || webResourceRequest == null) {
        } else if (Build.VERSION.SDK_INT >= 23) {
            if (webResourceRequest.isForMainFrame()) {
                a(webView2, webResourceRequest.getUrl().toString(), str2);
            }
        }
    }

    public final void a(WebView webView, String str, String str2) {
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{webView, str, str3}, this, f40730a, false, 34239, new Class[]{WebView.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str, str3}, this, f40730a, false, 34239, new Class[]{WebView.class, String.class, String.class}, Void.TYPE);
            return;
        }
        b bVar = this.i.f40806b;
        this.f40733d.c(webView, str, bVar.f40800b, a(bVar), a(bVar, str3));
    }
}
