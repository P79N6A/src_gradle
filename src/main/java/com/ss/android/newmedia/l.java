package com.ss.android.newmedia;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.c;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30225a;

    /* renamed from: b  reason: collision with root package name */
    static final a f30226b;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30227a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f30227a, false, 18418, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f30227a, false, 18418, new Class[]{WebView.class, String.class}, Void.TYPE);
            } else if (webView != null) {
                try {
                    if (PatchProxy.isSupport(new Object[]{webView, str}, null, m.f30229a, true, 18419, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{webView, str}, null, m.f30229a, true, 18419, new Class[]{WebView.class, String.class}, Void.TYPE);
                        return;
                    }
                    c.a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @TargetApi(19)
    static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f30228b;

        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[SYNTHETIC, Splitter:B:17:0x0057] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.webkit.WebView r12, java.lang.String r13) {
            /*
                r11 = this;
                r1 = 2
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r12
                r10 = 1
                r2[r10] = r13
                com.meituan.robust.ChangeQuickRedirect r4 = f30228b
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
                r7[r9] = r0
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r7[r10] = r0
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 18420(0x47f4, float:2.5812E-41)
                r3 = r11
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r0 == 0) goto L_0x003d
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r2[r9] = r12
                r2[r10] = r13
                com.meituan.robust.ChangeQuickRedirect r4 = f30228b
                r5 = 0
                r6 = 18420(0x47f4, float:2.5812E-41)
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
                r7[r9] = r0
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r7[r10] = r0
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x003d:
                if (r12 != 0) goto L_0x0040
                return
            L_0x0040:
                if (r13 == 0) goto L_0x0054
                java.lang.String r0 = "javascript:"
                boolean r0 = r13.startsWith(r0)
                if (r0 == 0) goto L_0x0054
                r0 = 0
                r12.evaluateJavascript(r13, r0)     // Catch:{ Throwable -> 0x0050 }
                r0 = 1
                goto L_0x0055
            L_0x0050:
                r0 = move-exception
                r2 = r0
                boolean r0 = r2 instanceof java.lang.IllegalStateException
            L_0x0054:
                r0 = 0
            L_0x0055:
                if (r0 != 0) goto L_0x0098
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0098 }
                r2[r9] = r12     // Catch:{ Throwable -> 0x0098 }
                r2[r10] = r13     // Catch:{ Throwable -> 0x0098 }
                r3 = 0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.n.f30256a     // Catch:{ Throwable -> 0x0098 }
                r5 = 1
                r6 = 18421(0x47f5, float:2.5813E-41)
                java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
                r7[r9] = r0     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r7[r10] = r0     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0098 }
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0098 }
                if (r0 == 0) goto L_0x0091
                java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x0098 }
                r2[r9] = r12     // Catch:{ Throwable -> 0x0098 }
                r2[r10] = r13     // Catch:{ Throwable -> 0x0098 }
                r3 = 0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.n.f30256a     // Catch:{ Throwable -> 0x0098 }
                r5 = 1
                r6 = 18421(0x47f5, float:2.5813E-41)
                java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class<android.webkit.WebView> r0 = android.webkit.WebView.class
                r7[r9] = r0     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r7[r10] = r0     // Catch:{ Throwable -> 0x0098 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0098 }
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0098 }
                goto L_0x0098
            L_0x0091:
                com.ss.android.ugc.aweme.lancet.c.a(r13)     // Catch:{ Throwable -> 0x0098 }
                r12.loadUrl(r13)     // Catch:{ Throwable -> 0x0098 }
                return
            L_0x0098:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.l.b.a(android.webkit.WebView, java.lang.String):void");
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f30226b = new b((byte) 0);
        } else {
            f30226b = new a((byte) 0);
        }
    }

    public static void a(WebView webView, String str) {
        WebView webView2 = webView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{webView2, str2}, null, f30225a, true, 18417, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str2}, null, f30225a, true, 18417, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        f30226b.a(webView2, str2);
    }
}
