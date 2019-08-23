package com.bytedance.android.livesdk.browser.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.core.utils.d;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.c.a;
import com.bytedance.android.livesdk.browser.jsbridge.c.f;
import com.bytedance.android.livesdk.browser.jsbridge.c.h;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ToastMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.an;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.e;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.g;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.i;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.l;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.m;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.n;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.q;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.r;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.v;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.w;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.x;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.b.k;
import com.bytedance.ies.f.b.o;
import com.bytedance.ies.f.b.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9434a;

    /* renamed from: b  reason: collision with root package name */
    private static List<String> f9435b;

    /* renamed from: c  reason: collision with root package name */
    private static List<String> f9436c;

    /* renamed from: d  reason: collision with root package name */
    private o f9437d;

    /* renamed from: e  reason: collision with root package name */
    private p f9438e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<Context> f9439f;
    private WeakReference<com.bytedance.android.live.uikit.dialog.b> g;
    private Activity h;

    public final o a() {
        return this.f9437d;
    }

    public final p c() {
        return this.f9438e;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9434a, false, 3599, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9434a, false, 3599, new Class[0], Void.TYPE);
            return;
        }
        this.f9437d.a();
        this.f9438e.a();
    }

    public final void d() {
        com.bytedance.android.live.uikit.dialog.b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f9434a, false, 3598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9434a, false, 3598, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            bVar = (com.bytedance.android.live.uikit.dialog.b) this.g.get();
        } else {
            bVar = null;
        }
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    private static List<String> e() {
        if (PatchProxy.isSupport(new Object[0], null, f9434a, true, 3601, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f9434a, true, 3601, new Class[0], List.class);
        }
        if (f9435b != null) {
            return f9435b;
        }
        ArrayList arrayList = new ArrayList();
        f9435b = arrayList;
        arrayList.add("snssdk.com");
        f9435b.add("toutiao.com");
        f9435b.add("neihanshequ.com");
        f9435b.add("youdianyisi.com");
        f9435b.add("admin.bytedance.com");
        f9435b.add("bytecdn.cn");
        f9435b.add("fe.byted.org");
        f9435b.add("jinritemai.com");
        f9435b.add("chengzijianzhan.com");
        f9435b.add("bytedance.net");
        f9435b.add("amemv.com");
        List<String> list = (List) com.bytedance.android.livesdk.browser.a.f9279b.a();
        if (!Lists.isEmpty(list)) {
            for (String str : list) {
                if (!f9435b.contains(str)) {
                    f9435b.add(str);
                }
            }
        }
        f9435b.addAll(TTLiveSDKContext.getHostService().l().a());
        return f9435b;
    }

    private static List<String> f() {
        if (PatchProxy.isSupport(new Object[0], null, f9434a, true, 3602, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f9434a, true, 3602, new Class[0], List.class);
        }
        if (f9436c != null) {
            return f9436c;
        }
        ArrayList arrayList = new ArrayList();
        f9436c = arrayList;
        arrayList.add("config");
        f9436c.add("appInfo");
        f9436c.add("login");
        f9436c.add("logout");
        f9436c.add("close");
        f9436c.add("gallery");
        f9436c.add("toggleGalleryBars");
        f9436c.add("slideShow");
        f9436c.add("relatedShow");
        f9436c.add("toast");
        f9436c.add("slideDownload");
        f9436c.add("requestChangeOrientation");
        f9436c.add("adInfo");
        return f9436c;
    }

    public final void a(String str, GeolocationPermissions.Callback callback) {
        com.bytedance.android.live.uikit.dialog.b bVar;
        if (PatchProxy.isSupport(new Object[]{str, callback}, this, f9434a, false, 3597, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, callback}, this, f9434a, false, 3597, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && callback != null) {
            Activity a2 = d.a((Context) this.f9439f.get());
            if (a2 != null) {
                if (this.g != null) {
                    bVar = (com.bytedance.android.live.uikit.dialog.b) this.g.get();
                } else {
                    bVar = null;
                }
                if (bVar != null && bVar.isShowing()) {
                    bVar.dismiss();
                }
                b.a aVar = new b.a(a2);
                aVar.a((int) C0906R.string.cxv);
                aVar.b((CharSequence) a2.getString(C0906R.string.cxu, new Object[]{str}));
                c cVar = new c(callback, str);
                aVar.b((int) C0906R.string.cxt, (DialogInterface.OnClickListener) cVar);
                aVar.a((int) C0906R.string.cxs, (DialogInterface.OnClickListener) cVar);
                aVar.a(false);
                this.g = new WeakReference<>(aVar.b());
            }
        }
    }

    private b(Activity activity, o oVar, p pVar) {
        this.h = activity;
        this.f9439f = new WeakReference<>(activity);
        this.f9437d = oVar;
        this.f9438e = pVar;
        if (PatchProxy.isSupport(new Object[0], this, f9434a, false, 3600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9434a, false, 3600, new Class[0], Void.TYPE);
            return;
        }
        f fVar = new f(this.f9439f);
        o oVar2 = this.f9437d;
        oVar2.f20679d = this.f9438e;
        oVar2.a("appInfo", (com.bytedance.ies.f.b.d<?, ?>) new e<Object,Object>()).a("getXTtToken", (com.bytedance.ies.f.b.d<?, ?>) new l<Object,Object>()).a("userInfo", (com.bytedance.ies.f.b.d<?, ?>) new an<Object,Object>()).a("apiParam", (com.bytedance.ies.f.b.d<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.d<Object,Object>()).a("toast", (com.bytedance.ies.f.b.d<?, ?>) new ToastMethod<Object,Object>()).a("sendLogV3", (com.bytedance.ies.f.b.d<?, ?>) new x<Object,Object>()).a("sendMonitor", (com.bytedance.ies.f.b.d<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.p<Object,Object>()).a("setBannerVisibility", (com.bytedance.ies.f.b.d<?, ?>) new com.bytedance.android.livesdk.browser.jsbridge.newmethods.f<Object,Object>()).a("baseInfo", (com.bytedance.ies.f.b.d<?, ?>) new g<Object,Object>()).a("close", (com.bytedance.ies.f.b.d<?, ?>) new i<Object,Object>(this.h)).a("isTeenMode", (com.bytedance.ies.f.b.d<?, ?>) new m<Object,Object>()).a("sendPokemon", (com.bytedance.ies.f.b.d<?, ?>) new n<Object,Object>()).a("statusNotification", (com.bytedance.ies.f.b.d<?, ?>) new q<Object,Object>()).a("sendGift", (com.bytedance.ies.f.b.d<?, ?>) new w<Object,Object>()).a("payPanel", (com.bytedance.ies.f.b.d<?, ?>) new r<Object,Object>()).a("registerMessage", (com.bytedance.ies.f.b.d<?, ?>) new v<Object,Object>()).a("sharePanel", d.f9475b).a("cashdesk", e.f9477b).a("liveLoading", f.f9479b).a("userAction", g.f9481b).a("fetch", h.f9483b).a("app.showModal", i.f9485b).a("login", j.f9487b).a("setFansStatus", k.f9489b);
        this.f9438e.a("share", (com.bytedance.ies.f.a.d) new h(this.f9439f)).a("openHotsoon", (com.bytedance.ies.f.a.d) fVar).a("openLive", (com.bytedance.ies.f.a.d) fVar).a("userStatusChange", (com.bytedance.ies.f.a.d) new com.bytedance.android.livesdk.browser.jsbridge.c.i()).a("livePay", (com.bytedance.ies.f.a.d) new com.bytedance.android.livesdk.browser.jsbridge.c.e(this.f9439f)).a("openLiveRecharge", (com.bytedance.ies.f.a.d) new com.bytedance.android.livesdk.browser.jsbridge.c.g()).a("copyToClipboard", (com.bytedance.ies.f.a.d) new com.bytedance.android.livesdk.browser.jsbridge.c.a((Context) this.f9439f.get()));
    }

    public static b a(Activity activity, WebView webView, WebViewClient webViewClient, WebChromeClient webChromeClient) {
        Activity activity2 = activity;
        WebView webView2 = webView;
        WebViewClient webViewClient2 = webViewClient;
        WebChromeClient webChromeClient2 = webChromeClient;
        if (PatchProxy.isSupport(new Object[]{activity2, webView2, webViewClient2, webChromeClient2}, null, f9434a, true, 3596, new Class[]{Activity.class, WebView.class, WebViewClient.class, WebChromeClient.class}, b.class)) {
            Object[] objArr = {activity2, webView2, webViewClient2, webChromeClient2};
            return (b) PatchProxy.accessDispatch(objArr, null, f9434a, true, 3596, new Class[]{Activity.class, WebView.class, WebViewClient.class, WebChromeClient.class}, b.class);
        }
        o a2 = o.a(webView).a((Context) activity2).a((k) new k() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9440a;

            @NonNull
            public final <T> String a(@NonNull T t) {
                T t2 = t;
                if (!PatchProxy.isSupport(new Object[]{t2}, this, f9440a, false, 3613, new Class[]{Object.class}, String.class)) {
                    return j.q().c().toJson((Object) t2);
                }
                return (String) PatchProxy.accessDispatch(new Object[]{t2}, this, f9440a, false, 3613, new Class[]{Object.class}, String.class);
            }

            @NonNull
            public final <T> T a(@NonNull String str, @NonNull Type type) {
                String str2 = str;
                Type type2 = type;
                if (!PatchProxy.isSupport(new Object[]{str2, type2}, this, f9440a, false, 3612, new Class[]{String.class, Type.class}, Object.class)) {
                    return j.q().c().fromJson(str2, type2);
                }
                return PatchProxy.accessDispatch(new Object[]{str2, type2}, this, f9440a, false, 3612, new Class[]{String.class, Type.class}, Object.class);
            }
        }).a(false).b(true).a((Collection<String>) e()).a("ToutiaoJSBridge").a();
        return new b(activity2, a2, p.a(webView2, a2).b("bytedance").a(webViewClient2).a(webChromeClient2).b(e()).a(f()));
    }
}
