package com.bytedance.android.livesdk.browser.c;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.fragment.FullWebDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.android.livesdk.browser.view.RoundRectWebView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.monitor.webview.g;
import com.bytedance.android.monitor.webview.h;
import com.bytedance.android.monitor.webview.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9323a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.bytedance.android.livesdk.browser.jsbridge.a> f9324b;

    /* renamed from: c  reason: collision with root package name */
    private List<DialogFragment> f9325c;

    /* renamed from: d  reason: collision with root package name */
    private Set<com.bytedance.android.livesdk.browser.f.a> f9326d;

    /* renamed from: e  reason: collision with root package name */
    private b.c f9327e;

    static class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9332a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.android.livesdk.browser.jsbridge.b f9333b;

        public final void onConsoleMessage(String str, int i, String str2) {
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        }

        a() {
        }

        public final void onGeolocationPermissionsHidePrompt() {
            if (PatchProxy.isSupport(new Object[0], this, f9332a, false, 3464, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9332a, false, 3464, new Class[0], Void.TYPE);
                return;
            }
            if (this.f9333b != null) {
                this.f9333b.d();
            }
        }

        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (PatchProxy.isSupport(new Object[]{str, callback}, this, f9332a, false, 3463, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, callback}, this, f9332a, false, 3463, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE);
                return;
            }
            if (this.f9333b != null) {
                this.f9333b.a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i)}, this, f9332a, false, 3461, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i)}, this, f9332a, false, 3461, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onProgressChanged(webView, i);
        }

        public final void onReceivedTitle(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9332a, false, 3462, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9332a, false, 3462, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            super.onReceivedTitle(webView, str);
        }
    }

    static class b extends com.bytedance.ies.f.a.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9334a;

        /* renamed from: b  reason: collision with root package name */
        private b.d f9335b;

        /* renamed from: c  reason: collision with root package name */
        private List<com.bytedance.android.livesdk.browser.e.c> f9336c;

        b(b.d dVar, List<com.bytedance.android.livesdk.browser.e.c> list) {
            this.f9335b = dVar;
            this.f9336c = list;
        }

        public final void onPageFinished(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9334a, false, 3468, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9334a, false, 3468, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            super.onPageFinished(webView, str);
            if (this.f9335b != null) {
                this.f9335b.a(webView, str);
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebView webView2 = webView;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{webView2, str2}, this, f9334a, false, 3465, new Class[]{WebView.class, String.class}, WebResourceResponse.class)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{webView2, str2}, this, f9334a, false, 3465, new Class[]{WebView.class, String.class}, WebResourceResponse.class);
            }
            if (!TextUtils.isEmpty(str) && ((Boolean) LiveConfigSettingKeys.WEB_OFFLINE_ENABLED.a()).booleanValue()) {
                WebResourceResponse c2 = TTLiveSDKContext.getHostService().l().c(str2);
                if (c2 != null) {
                    return c2;
                }
            }
            WebResourceResponse a2 = j.q().h().e().a(str2, this.f9336c, webView2);
            if (a2 != null) {
                return a2;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{webView, str3}, this, f9334a, false, 3466, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str3}, this, f9334a, false, 3466, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            } else {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        str2 = "";
                    } else {
                        str2 = parse.getScheme().toLowerCase();
                    }
                    if (!TextUtils.isEmpty(str2) && !"about".equals(str2) && !str2.equals("https")) {
                        if (!str2.equals("http")) {
                            return j.q().m().b(webView.getContext(), str3);
                        }
                    }
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (PatchProxy.isSupport(new Object[]{webView, str, bitmap}, this, f9334a, false, 3469, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str, bitmap}, this, f9334a, false, 3469, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                return;
            }
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f9334a, false, 3467, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f9334a, false, 3467, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            super.onReceivedError(webView, i, str, str2);
        }
    }

    public static final class c implements h.b<b> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9337a;

        @NonNull
        public final h.b.a<b> a(h.b.a<b> aVar) {
            h.b.a<b> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f9337a, false, 3470, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new d((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9337a, false, 3470, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final void a(b.e eVar) {
        b.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f9323a, false, 3441, new Class[]{b.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f9323a, false, 3441, new Class[]{b.e.class}, Void.TYPE);
            return;
        }
        if (eVar2 != null) {
            b((com.bytedance.android.livesdk.browser.jsbridge.a) eVar);
            com.bytedance.android.livesdk.browser.b.a(eVar2.f9317b);
            if (eVar2.f9318c != null) {
                eVar2.f9318c.b();
            }
            com.bytedance.android.monitor.webview.h.a().b(eVar2.f9317b);
            eVar2.f9318c = null;
            eVar2.f9317b = null;
            eVar2.f9319d = null;
            eVar2.f9320e = null;
        }
    }

    public final void a(b.e eVar, String str, JSONObject jSONObject) {
        b.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, str, jSONObject}, this, f9323a, false, 3442, new Class[]{b.e.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, str, jSONObject}, this, f9323a, false, 3442, new Class[]{b.e.class, String.class, JSONObject.class}, Void.TYPE);
        } else if (eVar2 != null && eVar2.f9318c != null) {
            eVar.a(str, jSONObject);
        }
    }

    public final void a(b.e eVar, String str) {
        b.e eVar2 = eVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{eVar2, str2}, this, f9323a, false, 3444, new Class[]{b.e.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, str2}, this, f9323a, false, 3444, new Class[]{b.e.class, String.class}, Void.TYPE);
        } else if (eVar2 != null && eVar2.f9317b != null) {
            com.bytedance.android.livesdk.utils.a.a(str2, (WebView) eVar2.f9317b, TTLiveSDKContext.getHostService().l().b(str2));
        }
    }

    public final boolean a(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9323a, false, 3445, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9323a, false, 3445, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f9326d != null && this.f9326d.size() > 0) {
            for (com.bytedance.android.livesdk.browser.f.a a2 : this.f9326d) {
                if (a2.a(webView, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(com.bytedance.android.livesdk.browser.jsbridge.a aVar) {
        com.bytedance.android.livesdk.browser.jsbridge.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f9323a, false, 3446, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9323a, false, 3446, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.class}, Void.TYPE);
            return;
        }
        this.f9324b.add(aVar2);
    }

    public final void a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f9323a, false, 3448, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f9323a, false, 3448, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        for (com.bytedance.android.livesdk.browser.jsbridge.a a2 : this.f9324b) {
            a2.a(str2, jSONObject2);
        }
    }

    public final void a(WebView webView) {
        if (PatchProxy.isSupport(new Object[]{webView}, this, f9323a, false, 3450, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView}, this, f9323a, false, 3450, new Class[]{WebView.class}, Void.TYPE);
            return;
        }
        if (webView.getParent() instanceof ViewGroup) {
            ((ViewGroup) webView.getParent()).removeView(webView);
        }
        if (this.f9327e == null || !this.f9327e.a(webView)) {
            com.bytedance.android.livesdk.browser.b.a(webView);
        }
        com.bytedance.android.monitor.webview.h.a().b(webView);
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f9323a, false, 3451, new Class[0], Boolean.TYPE)) {
            return this.f9327e == null || this.f9327e.a() == null;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3451, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3455, new Class[0], Void.TYPE);
            return;
        }
        for (DialogFragment dismissAllowingStateLoss : this.f9325c) {
            dismissAllowingStateLoss.dismissAllowingStateLoss();
        }
        this.f9325c.clear();
    }

    private d() {
        boolean z;
        boolean z2;
        boolean z3;
        com.bytedance.android.monitor.webview.c cVar;
        com.bytedance.android.monitor.webview.b bVar;
        String[] strArr;
        com.bytedance.android.monitor.webview.a aVar;
        long j;
        String[] strArr2;
        String[] strArr3;
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        this.f9324b = new CopyOnWriteArrayList();
        this.f9325c = new CopyOnWriteArrayList();
        this.f9326d = new HashSet();
        this.f9326d.add(new com.bytedance.android.livesdk.browser.f.b());
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3433, new Class[0], Void.TYPE);
            return;
        }
        com.bytedance.android.monitor.webview.h.a();
        h.a aVar2 = new h.a((byte) 0);
        aVar2.m = 10;
        aVar2.l = false;
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3437, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3437, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = ((com.bytedance.android.livesdk.browser.d.a) LiveSettingKeys.WEBVIEW_MONITOR_SWITCH_SET.a()).f9340c;
        }
        aVar2.k = z;
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3438, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3438, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z2 = ((com.bytedance.android.livesdk.browser.d.a) LiveSettingKeys.WEBVIEW_MONITOR_SWITCH_SET.a()).f9339b;
        }
        aVar2.j = z2;
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3439, new Class[0], Boolean.TYPE)) {
            z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3439, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z3 = ((com.bytedance.android.livesdk.browser.d.a) LiveSettingKeys.WEBVIEW_MONITOR_SWITCH_SET.a()).f9341d;
        }
        aVar2.i = z3;
        aVar2.f18868d = new String[]{"about:blank"};
        aVar2.f18866b = ea.f66827f;
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3434, new Class[0], com.bytedance.android.monitor.webview.c.class)) {
            cVar = (com.bytedance.android.monitor.webview.c) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3434, new Class[0], com.bytedance.android.monitor.webview.c.class);
        } else {
            cVar = new com.bytedance.android.monitor.webview.c() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f9328a;

                public final void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                    String str2 = str;
                    JSONObject jSONObject3 = jSONObject;
                    JSONObject jSONObject4 = jSONObject2;
                    if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject4}, this, f9328a, false, 3459, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject4}, this, f9328a, false, 3459, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
                        return;
                    }
                    ((com.bytedance.android.livesdkapi.service.b) com.bytedance.android.live.base.a.a(com.bytedance.android.livesdkapi.service.b.class)).d().a(str2, i, jSONObject3, jSONObject4);
                }
            };
        }
        aVar2.h = cVar;
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3435, new Class[0], com.bytedance.android.monitor.webview.b.class)) {
            bVar = (com.bytedance.android.monitor.webview.b) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3435, new Class[0], com.bytedance.android.monitor.webview.b.class);
        } else {
            bVar = new com.bytedance.android.monitor.webview.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f9330a;

                public final boolean a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f9330a, false, 3460, new Class[0], Boolean.TYPE)) {
                        return ((com.bytedance.android.livesdk.browser.d.a) LiveSettingKeys.WEBVIEW_MONITOR_SWITCH_SET.a()).f9342e;
                    }
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f9330a, false, 3460, new Class[0], Boolean.TYPE)).booleanValue();
                }
            };
        }
        aVar2.n = bVar;
        aVar2.f18865a = com.bytedance.android.monitor.webview.d.a();
        if (PatchProxy.isSupport(new Object[0], this, f9323a, false, 3436, new Class[0], String[].class)) {
            strArr = (String[]) PatchProxy.accessDispatch(new Object[0], this, f9323a, false, 3436, new Class[0], String[].class);
        } else {
            strArr = ((com.bytedance.android.livesdk.browser.d.a) LiveSettingKeys.WEBVIEW_MONITOR_SWITCH_SET.a()).f9338a;
        }
        aVar2.f18869e = h.a.a(strArr);
        com.bytedance.android.monitor.webview.h a2 = com.bytedance.android.monitor.webview.h.a();
        if (aVar2.f18865a != null) {
            aVar = aVar2.f18865a;
        } else {
            aVar = g.a();
        }
        a2.f18859a = aVar;
        if (aVar2.f18866b > 0) {
            j = aVar2.f18866b;
        } else {
            j = -1;
        }
        a2.f18860b = j;
        if (aVar2.f18867c != null) {
            strArr2 = aVar2.f18867c;
        } else {
            strArr2 = new String[0];
        }
        a2.f18861c = strArr2;
        if (aVar2.f18868d != null) {
            strArr3 = aVar2.f18868d;
        } else {
            strArr3 = new String[0];
        }
        a2.f18862d = strArr3;
        if (aVar2.g != null) {
            str = aVar2.g;
        } else {
            str = "WebViewMonitor";
        }
        a2.f18863e = str;
        if (aVar2.f18869e != null) {
            map = aVar2.f18869e;
        } else {
            map = new HashMap<>();
        }
        a2.f18864f = map;
        if (aVar2.f18870f != null) {
            map2 = aVar2.f18870f;
        } else {
            map2 = new HashMap<>();
        }
        a2.g = map2;
        a2.h = new com.bytedance.android.monitor.webview.j(aVar2.h);
        a2.i = aVar2.i;
        a2.j = aVar2.j;
        a2.k = aVar2.k;
        a2.l = aVar2.l;
        a2.n = aVar2.m;
        a2.m = aVar2.n;
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final void a(b.c cVar) {
        this.f9327e = cVar;
    }

    public final void b(b.c cVar) {
        if (this.f9327e == cVar) {
            this.f9327e = null;
        }
    }

    public final void a(DialogFragment dialogFragment) {
        DialogFragment dialogFragment2 = dialogFragment;
        if (PatchProxy.isSupport(new Object[]{dialogFragment2}, this, f9323a, false, 3453, new Class[]{DialogFragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogFragment2}, this, f9323a, false, 3453, new Class[]{DialogFragment.class}, Void.TYPE);
            return;
        }
        this.f9325c.add(dialogFragment2);
    }

    public final WebView a(Context context) {
        b.e eVar;
        if (PatchProxy.isSupport(new Object[]{context}, this, f9323a, false, 3449, new Class[]{Context.class}, WebView.class)) {
            return (WebView) PatchProxy.accessDispatch(new Object[]{context}, this, f9323a, false, 3449, new Class[]{Context.class}, WebView.class);
        }
        if (this.f9327e == null) {
            eVar = null;
        } else {
            eVar = this.f9327e.a();
        }
        if (eVar != null) {
            return eVar.f9317b;
        }
        RoundRectWebView roundRectWebView = new RoundRectWebView(context);
        j.q().h().a().a(roundRectWebView);
        return roundRectWebView;
    }

    public final void b(DialogFragment dialogFragment) {
        DialogFragment dialogFragment2 = dialogFragment;
        if (PatchProxy.isSupport(new Object[]{dialogFragment2}, this, f9323a, false, 3454, new Class[]{DialogFragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogFragment2}, this, f9323a, false, 3454, new Class[]{DialogFragment.class}, Void.TYPE);
            return;
        }
        this.f9325c.remove(dialogFragment2);
    }

    public final void b(com.bytedance.android.livesdk.browser.jsbridge.a aVar) {
        com.bytedance.android.livesdk.browser.jsbridge.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f9323a, false, 3447, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9323a, false, 3447, new Class[]{com.bytedance.android.livesdk.browser.jsbridge.a.class}, Void.TYPE);
            return;
        }
        this.f9324b.remove(aVar2);
    }

    public final BaseDialogFragment a(b.C0073b bVar) {
        b.C0073b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f9323a, false, 3456, new Class[]{b.C0073b.class}, BaseDialogFragment.class)) {
            return (BaseDialogFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f9323a, false, 3456, new Class[]{b.C0073b.class}, BaseDialogFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, WebDialogFragment.f9368e, true, 3569, new Class[]{b.C0073b.class}, WebDialogFragment.class)) {
            return (WebDialogFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, null, WebDialogFragment.f9368e, true, 3569, new Class[]{b.C0073b.class}, WebDialogFragment.class);
        }
        WebDialogFragment webDialogFragment = new WebDialogFragment();
        webDialogFragment.f9369f = bVar2.f9310a;
        webDialogFragment.g = bVar2.f9311b;
        webDialogFragment.h = bVar2.f9312c;
        webDialogFragment.i = bVar2.j;
        webDialogFragment.j = bVar2.f9314e;
        webDialogFragment.o = bVar2.f9313d;
        webDialogFragment.k = bVar2.f9315f;
        webDialogFragment.l = bVar2.g;
        webDialogFragment.n = bVar2.h;
        webDialogFragment.m = bVar2.i;
        webDialogFragment.p = bVar2.l;
        webDialogFragment.r = bVar2.n;
        webDialogFragment.w = bVar2.r;
        webDialogFragment.s = bVar2.o;
        webDialogFragment.t = bVar2.p;
        webDialogFragment.u = bVar2.q;
        webDialogFragment.v = bVar2.k;
        webDialogFragment.x = bVar2.s;
        return webDialogFragment;
    }

    public final b.e a(Activity activity, b.d dVar) {
        Activity activity2 = activity;
        b.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{activity2, dVar2}, this, f9323a, false, 3440, new Class[]{Activity.class, b.d.class}, b.e.class)) {
            return (b.e) PatchProxy.accessDispatch(new Object[]{activity2, dVar2}, this, f9323a, false, 3440, new Class[]{Activity.class, b.d.class}, b.e.class);
        }
        RoundRectWebView roundRectWebView = new RoundRectWebView(activity2);
        roundRectWebView.setHorizontalScrollBarEnabled(false);
        roundRectWebView.setVerticalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 21) {
            roundRectWebView.getSettings().setMixedContentMode(2);
        }
        j.q().h().a().a(roundRectWebView);
        LinkedList linkedList = new LinkedList();
        b bVar = new b(dVar2, linkedList);
        a aVar = new a();
        com.bytedance.android.livesdk.browser.jsbridge.b a2 = com.bytedance.android.livesdk.browser.jsbridge.b.a(activity2, roundRectWebView, bVar, aVar);
        aVar.f9333b = a2;
        bVar.f20619d = a2.c().f20681a;
        com.bytedance.android.livesdk.browser.view.a.a((Context) activity).a(true).a((WebView) roundRectWebView);
        if (Build.VERSION.SDK_INT >= 19 && ((Boolean) com.bytedance.android.livesdk.browser.a.i.a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        b.e eVar = new b.e(roundRectWebView, a2, aVar, bVar, linkedList);
        a((com.bytedance.android.livesdk.browser.jsbridge.a) eVar);
        return eVar;
    }

    public final void a(Context context, b.a aVar) {
        Context context2 = context;
        b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, this, f9323a, false, 3458, new Class[]{Context.class, b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, this, f9323a, false, 3458, new Class[]{Context.class, b.a.class}, Void.TYPE);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", aVar2.f9306c);
        bundle.putBoolean("hide_status_bar", aVar2.f9307d);
        bundle.putString(PushConstants.TITLE, aVar2.f9305b);
        bundle.putBoolean("show_progress", aVar2.f9308e);
        bundle.putBoolean("bundle_user_webview_title", true);
        bundle.putString("status_bar_color", aVar2.f9309f);
        bundle.putString("status_bar_bg_color", aVar2.g);
        bundle.putInt("bundle_web_view_background_color", ac.b((int) C0906R.color.a81));
        TTLiveSDKContext.getHostService().i().a(aVar2.f9304a, bundle, context2);
    }

    public final BaseDialogFragment a(Context context, String str, String str2) {
        FullWebDialogFragment.a aVar;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context, str3, str4}, this, f9323a, false, 3457, new Class[]{Context.class, String.class, String.class}, BaseDialogFragment.class)) {
            return (BaseDialogFragment) PatchProxy.accessDispatch(new Object[]{context, str3, str4}, this, f9323a, false, 3457, new Class[]{Context.class, String.class, String.class}, BaseDialogFragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{str3}, null, FullWebDialogFragment.a.f9352a, true, 3485, new Class[]{String.class}, FullWebDialogFragment.a.class)) {
            aVar = (FullWebDialogFragment.a) PatchProxy.accessDispatch(new Object[]{str3}, null, FullWebDialogFragment.a.f9352a, true, 3485, new Class[]{String.class}, FullWebDialogFragment.a.class);
        } else {
            aVar = new FullWebDialogFragment.a(str3);
        }
        aVar.f9356e = false;
        aVar.f9355d = str4;
        if (PatchProxy.isSupport(new Object[0], aVar, FullWebDialogFragment.a.f9352a, false, 3486, new Class[0], BaseDialogFragment.class)) {
            return (BaseDialogFragment) PatchProxy.accessDispatch(new Object[0], aVar, FullWebDialogFragment.a.f9352a, false, 3486, new Class[0], BaseDialogFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_url", aVar.f9353b);
        bundle.putString("key_from_type", aVar.f9355d);
        bundle.putString("key_title", aVar.f9354c);
        bundle.putBoolean("key_with_title_bar", aVar.f9356e);
        FullWebDialogFragment fullWebDialogFragment = new FullWebDialogFragment();
        fullWebDialogFragment.setArguments(bundle);
        return fullWebDialogFragment;
    }
}
