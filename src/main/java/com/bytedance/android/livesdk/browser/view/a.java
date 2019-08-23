package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9644a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f9645b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9646c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9647d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f9648e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9649f = true;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;

    public final a a(boolean z) {
        this.j = z;
        return this;
    }

    private a(Context context) {
        this.f9645b = new WeakReference<>(context);
    }

    public static a a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f9644a, true, 3836, new Class[]{Context.class}, a.class)) {
            return new a(context2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f9644a, true, 3836, new Class[]{Context.class}, a.class);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b A[Catch:{ Throwable -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[Catch:{ Throwable -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.webkit.WebView r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f9644a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 3837(0xefd, float:5.377E-42)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f9644a
            r3 = 0
            r4 = 3837(0xefd, float:5.377E-42)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            if (r10 == 0) goto L_0x0088
            java.lang.ref.WeakReference<android.content.Context> r0 = r9.f9645b
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x003b
            goto L_0x0088
        L_0x003b:
            android.webkit.WebSettings r0 = r10.getSettings()
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r1 = r9.f9646c     // Catch:{ Exception -> 0x0047 }
            r0.setJavaScriptEnabled(r1)     // Catch:{ Exception -> 0x0047 }
        L_0x0047:
            boolean r1 = r9.f9647d     // Catch:{ Throwable -> 0x0058 }
            if (r1 == 0) goto L_0x0055
            r0.setSupportZoom(r7)     // Catch:{ Throwable -> 0x0058 }
            r0.setBuiltInZoomControls(r7)     // Catch:{ Throwable -> 0x0058 }
            com.bytedance.common.util.HoneyCombV11Compat.setDisplayZoomControl(r0, r8)     // Catch:{ Throwable -> 0x0058 }
            goto L_0x0058
        L_0x0055:
            r0.setSupportZoom(r8)     // Catch:{ Throwable -> 0x0058 }
        L_0x0058:
            r0.setLoadWithOverviewMode(r7)
            boolean r1 = r9.f9648e
            r0.setUseWideViewPort(r1)
            boolean r1 = r9.g
            r0.setDomStorageEnabled(r1)
            boolean r1 = r9.h
            r0.setAllowFileAccess(r1)
            boolean r1 = r9.i
            r1 = r1 ^ r7
            r0.setBlockNetworkImage(r1)
            boolean r1 = r9.j
            if (r1 != 0) goto L_0x0078
            r1 = 0
            android.support.v4.view.ViewCompat.setLayerType(r10, r7, r1)     // Catch:{ Throwable -> 0x0078 }
        L_0x0078:
            com.bytedance.common.util.JellyBeanMR1V17Compat.setMediaPlaybackRequiresUserGesture(r0, r7)
            boolean r1 = r9.f9649f
            r9.a(r10, r1)
            r1 = 2
            com.bytedance.common.util.LollipopV21Compat.setMixedContentMode(r0, r1)
            com.bytedance.common.util.LollipopV21Compat.setAcceptThirdPartyCookies(r10, r7)
            return
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.view.a.a(android.webkit.WebView):void");
    }

    private void a(WebView webView, boolean z) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f9644a, false, 3838, new Class[]{WebView.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, Byte.valueOf(z)}, this, f9644a, false, 3838, new Class[]{WebView.class, Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            webView2.setOnLongClickListener(null);
            webView2.setLongClickable(false);
        } else {
            webView2.setLongClickable(true);
            webView2.setOnLongClickListener(b.f9651b);
        }
    }
}
