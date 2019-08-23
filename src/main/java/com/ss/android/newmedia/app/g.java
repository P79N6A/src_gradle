package com.ss.android.newmedia.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.agilelogger.f.k;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.l;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.utils.aq;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.bh;
import java.util.HashSet;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30176a;

    /* renamed from: b  reason: collision with root package name */
    public static int f30177b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static int f30178c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static int f30179d = -1;

    /* renamed from: e  reason: collision with root package name */
    static Handler f30180e = null;

    /* renamed from: f  reason: collision with root package name */
    static final HashSet<String> f30181f;
    static final HashSet<String> g;
    private static final boolean h;
    private static final boolean i;

    static {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 16 || !ToolUtils.isMiui()) {
            z = false;
        } else {
            z = true;
        }
        h = z;
        if (PatchProxy.isSupport(new Object[0], null, f30176a, true, 18595, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30176a, true, 18595, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!h && (Build.VERSION.SDK_INT != 16 || !"ZTE N5".equals(Build.MODEL))) {
            z2 = false;
        }
        i = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f30181f = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        g = hashSet2;
    }

    public static void a(WebView webView) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2}, null, f30176a, true, 18596, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, null, f30176a, true, 18596, new Class[]{WebView.class}, Void.TYPE);
        } else if (webView2 != null) {
            if (PatchProxy.isSupport(new Object[]{webView2}, null, aq.f39745a, true, 32687, new Class[]{WebView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView2}, null, aq.f39745a, true, 32687, new Class[]{WebView.class}, Void.TYPE);
            } else if (!a.a()) {
                n.a("webview_anr_log", "common_msg", bh.a().a("layerType", Integer.valueOf(webView.getLayerType())).a("stackTrace", k.a(new Throwable())).b());
            }
            webView2.setWebChromeClient(null);
            webView2.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView2);
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, null, aq.f39745a, true, 32688, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, null, aq.f39745a, true, 32688, new Class[]{Throwable.class}, Void.TYPE);
                    } else if (!a.a()) {
                        n.a("webview_anr_log", "destroy_exception", bh.a().a("stacktrace", k.a(th2)).b());
                    }
                }
            }
        }
    }

    public static void a(Context context, WebView webView) {
        Context context2 = context;
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{context2, webView2}, null, f30176a, true, 18594, new Class[]{Context.class, WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, webView2}, null, f30176a, true, 18594, new Class[]{Context.class, WebView.class}, Void.TYPE);
        } else if (context2 != null && webView2 != null) {
            if (BaseAppData.a().n() == 0) {
                int i2 = f30177b;
                if (i2 < 0 && i) {
                    i2 = 1;
                }
                if (i2 <= 0) {
                    return;
                }
            }
            if (context2 instanceof Activity) {
                Activity activity = (Activity) context2;
                if (activity.isFinishing()) {
                    try {
                        l.a(webView2, "about:blank");
                        if (f30179d > 0) {
                            View rootView = webView.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    Logger.debug();
                }
            }
        }
    }
}
