package com.bytedance.android.livesdk.browser;

import android.os.Build;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import java.util.HashSet;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9296a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f9297b;

    /* renamed from: c  reason: collision with root package name */
    public static int f9298c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static int f9299d = -1;

    /* renamed from: e  reason: collision with root package name */
    static Handler f9300e = null;

    /* renamed from: f  reason: collision with root package name */
    static final HashSet<String> f9301f;
    static final HashSet<String> g;
    private static final boolean h;
    private static int i = -1;

    static {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT < 16 || !ToolUtils.isMiui()) {
            z = false;
        } else {
            z = true;
        }
        h = z;
        if (PatchProxy.isSupport(new Object[0], null, f9296a, true, 3385, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f9296a, true, 3385, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!h && (Build.VERSION.SDK_INT != 16 || !"ZTE N5".equals(Build.MODEL))) {
            z2 = false;
        }
        f9297b = z2;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f9301f = hashSet;
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
        if (PatchProxy.isSupport(new Object[]{webView2}, null, f9296a, true, 3386, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, null, f9296a, true, 3386, new Class[]{WebView.class}, Void.TYPE);
        } else if (webView2 != null) {
            webView2.setWebChromeClient(null);
            webView2.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView2);
                try {
                    webView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
