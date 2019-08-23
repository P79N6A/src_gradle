package com.ss.android.newmedia.ui.webview;

import android.content.Context;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30367a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f30368b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f30369c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30370d = true;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30371e = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f30372f = true;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;

    public final a a(boolean z) {
        this.j = z;
        return this;
    }

    private a(Context context) {
        this.f30368b = new WeakReference<>(context);
    }

    public static a a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f30367a, true, 18876, new Class[]{Context.class}, a.class)) {
            return new a(context2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context2}, null, f30367a, true, 18876, new Class[]{Context.class}, a.class);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:10|11|12|13|(1:15)(1:16)|17|(2:20|21)|23|(1:25)(1:(1:27)(1:28))|29|(1:31)(1:(2:33|(1:35)))|36|(1:40)|41|42) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052 A[Catch:{ Throwable -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[Catch:{ Throwable -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[SYNTHETIC, Splitter:B:20:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0119  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled", "CI_InlinedApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.webkit.WebView r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f30367a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 18877(0x49bd, float:2.6452E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f30367a
            r3 = 0
            r4 = 18877(0x49bd, float:2.6452E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            if (r8 == 0) goto L_0x014a
            java.lang.ref.WeakReference<android.content.Context> r0 = r7.f30368b
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x0042
            goto L_0x014a
        L_0x0042:
            android.webkit.WebSettings r0 = r19.getSettings()
            if (r0 != 0) goto L_0x0049
            return
        L_0x0049:
            boolean r1 = r7.f30369c     // Catch:{ Exception -> 0x004e }
            r0.setJavaScriptEnabled(r1)     // Catch:{ Exception -> 0x004e }
        L_0x004e:
            boolean r1 = r7.f30370d     // Catch:{ Throwable -> 0x005f }
            if (r1 == 0) goto L_0x005c
            r0.setSupportZoom(r9)     // Catch:{ Throwable -> 0x005f }
            r0.setBuiltInZoomControls(r9)     // Catch:{ Throwable -> 0x005f }
            com.bytedance.common.util.HoneyCombV11Compat.setDisplayZoomControl(r0, r10)     // Catch:{ Throwable -> 0x005f }
            goto L_0x005f
        L_0x005c:
            r0.setSupportZoom(r10)     // Catch:{ Throwable -> 0x005f }
        L_0x005f:
            r0.setLoadWithOverviewMode(r9)
            boolean r1 = r7.f30371e
            r0.setUseWideViewPort(r1)
            boolean r1 = r7.g
            r0.setDomStorageEnabled(r1)
            boolean r1 = r7.h
            r0.setAllowFileAccess(r1)
            boolean r1 = r7.i
            r1 = r1 ^ r9
            r0.setBlockNetworkImage(r1)
            boolean r0 = r7.j
            r11 = 0
            if (r0 != 0) goto L_0x0081
            android.support.v4.view.ViewCompat.setLayerType(r8, r9, r11)     // Catch:{ Throwable -> 0x0080 }
            goto L_0x0081
        L_0x0080:
        L_0x0081:
            android.webkit.WebSettings r0 = r19.getSettings()
            com.bytedance.common.util.JellyBeanMR1V17Compat.setMediaPlaybackRequiresUserGesture(r0, r9)
            boolean r12 = r7.f30372f
            r13 = 2
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r10] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30367a
            r3 = 0
            r4 = 18878(0x49be, float:2.6454E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cf
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r10] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f30367a
            r3 = 0
            r4 = 18878(0x49be, float:2.6454E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00e3
        L_0x00cf:
            if (r12 != 0) goto L_0x00d8
            r8.setOnLongClickListener(r11)
            r8.setLongClickable(r10)
            goto L_0x00e3
        L_0x00d8:
            r8.setLongClickable(r9)
            com.ss.android.newmedia.ui.webview.a$1 r0 = new com.ss.android.newmedia.ui.webview.a$1
            r0.<init>()
            r8.setOnLongClickListener(r0)
        L_0x00e3:
            com.ss.android.newmedia.BaseAppData r0 = com.ss.android.newmedia.BaseAppData.a()
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.BaseAppData.f2496a
            r14 = 0
            r15 = 18321(0x4791, float:2.5673E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.webkit.WebView> r2 = android.webkit.WebView.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0119
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.newmedia.BaseAppData.f2496a
            r14 = 0
            r15 = 18321(0x4791, float:2.5673E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<android.webkit.WebView> r2 = android.webkit.WebView.class
            r1[r10] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0130
        L_0x0119:
            if (r8 == 0) goto L_0x0130
            android.content.Context r1 = r19.getContext()
            java.lang.String r0 = r0.a((android.content.Context) r1, (android.webkit.WebView) r8)
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0130
            android.webkit.WebSettings r1 = r19.getSettings()
            r1.setUserAgentString(r0)
        L_0x0130:
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x013f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x013f
            android.webkit.WebView.setWebContentsDebuggingEnabled(r9)
        L_0x013f:
            android.webkit.WebSettings r0 = r19.getSettings()
            com.bytedance.common.util.LollipopV21Compat.setMixedContentMode(r0, r10)
            com.bytedance.common.util.LollipopV21Compat.setAcceptThirdPartyCookies(r8, r9)
            return
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.ui.webview.a.a(android.webkit.WebView):void");
    }

    public static String a(String str, long j2) {
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3)}, null, f30367a, true, 18879, new Class[]{String.class, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, new Long(j3)}, null, f30367a, true, 18879, new Class[]{String.class, Long.TYPE}, String.class);
        } else if (StringUtils.isEmpty(str) || j3 <= 0 || !str2.contains("{{ad_id}}")) {
            return null;
        } else {
            String replace = str2.replace("{{ad_id}}", String.valueOf(j2));
            return "javascript:(function () {    var JS_ACTLOG_URL = '" + replace + "';    var head = document.getElementsByTagName('head')[0];    var script = document.createElement('script');    script.type = 'text/javascript';    script.src = JS_ACTLOG_URL;    head.appendChild(script);})();";
        }
    }
}
