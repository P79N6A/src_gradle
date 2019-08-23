package com.ss.android.ugc.aweme.account.login.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.ss.android.ugc.aweme.account.login.ui.o;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32184a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f32185c;

    /* renamed from: b  reason: collision with root package name */
    public o<OneLoginPhoneBean> f32186b;

    /* renamed from: d  reason: collision with root package name */
    private long f32187d;

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f32184a, true, 20308, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f32184a, true, 20308, new Class[0], b.class);
        }
        if (f32185c == null) {
            synchronized (b.class) {
                if (f32185c == null) {
                    f32185c = new b();
                }
            }
        }
        return f32185c;
    }

    public final b a(o<OneLoginPhoneBean> oVar) {
        this.f32186b = oVar;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r0.equals("telecom") != false) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f32184a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5 = 0
            r6 = 20310(0x4f56, float:2.846E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f32184a
            r13 = 0
            r14 = 20310(0x4f56, float:2.846E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            boolean r2 = android.text.TextUtils.isEmpty(r18)
            if (r2 == 0) goto L_0x0040
            java.lang.String r0 = ""
            return r0
        L_0x0040:
            r2 = -1
            int r3 = r18.hashCode()
            r4 = -1429363305(0xffffffffaacda597, float:-3.6530216E-13)
            if (r3 == r4) goto L_0x0069
            r1 = -1068855134(0xffffffffc04a90a2, float:-3.1650777)
            if (r3 == r1) goto L_0x005f
            r1 = -840542575(0xffffffffcde65691, float:-4.83054112E8)
            if (r3 == r1) goto L_0x0055
            goto L_0x0072
        L_0x0055:
            java.lang.String r1 = "unicom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0072
            r1 = 2
            goto L_0x0073
        L_0x005f:
            java.lang.String r1 = "mobile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0072
            r1 = 0
            goto L_0x0073
        L_0x0069:
            java.lang.String r3 = "telecom"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = -1
        L_0x0073:
            switch(r1) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007c;
                case 2: goto L_0x0079;
                default: goto L_0x0076;
            }
        L_0x0076:
            java.lang.String r0 = ""
            return r0
        L_0x0079:
            java.lang.String r0 = "china_unicom"
            return r0
        L_0x007c:
            java.lang.String r0 = "china_telecom"
            return r0
        L_0x007f:
            java.lang.String r0 = "china_mobile"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.c.b.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.Context r16, int r17, java.lang.String r18) {
        /*
            r15 = this;
            r8 = r15
            r9 = r18
            monitor-enter(r15)
            r10 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x00a6 }
            r11 = 0
            r1[r11] = r16     // Catch:{ all -> 0x00a6 }
            r12 = 3000(0xbb8, float:4.204E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a6 }
            r13 = 1
            r1[r13] = r2     // Catch:{ all -> 0x00a6 }
            r14 = 2
            r1[r14] = r9     // Catch:{ all -> 0x00a6 }
            com.meituan.robust.ChangeQuickRedirect r3 = f32184a     // Catch:{ all -> 0x00a6 }
            r4 = 0
            r5 = 20309(0x4f55, float:2.8459E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r11] = r2     // Catch:{ all -> 0x00a6 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a6 }
            r6[r13] = r2     // Catch:{ all -> 0x00a6 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r14] = r2     // Catch:{ all -> 0x00a6 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a6 }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0059
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x00a6 }
            r1[r11] = r16     // Catch:{ all -> 0x00a6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a6 }
            r1[r13] = r0     // Catch:{ all -> 0x00a6 }
            r1[r14] = r9     // Catch:{ all -> 0x00a6 }
            com.meituan.robust.ChangeQuickRedirect r3 = f32184a     // Catch:{ all -> 0x00a6 }
            r4 = 0
            r5 = 20309(0x4f55, float:2.8459E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x00a6 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r11] = r0     // Catch:{ all -> 0x00a6 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a6 }
            r6[r13] = r0     // Catch:{ all -> 0x00a6 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r14] = r0     // Catch:{ all -> 0x00a6 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00a6 }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a6 }
            monitor-exit(r15)
            return
        L_0x0059:
            java.lang.Class<com.bytedance.sdk.account.i.a.b> r0 = com.bytedance.sdk.account.i.a.b.class
            com.bytedance.sdk.account.i.a.a r0 = com.bytedance.sdk.account.i.b.c.a(r0)     // Catch:{ all -> 0x00a6 }
            com.bytedance.sdk.account.i.a.b r0 = (com.bytedance.sdk.account.i.a.b) r0     // Catch:{ all -> 0x00a6 }
            if (r0 != 0) goto L_0x0076
            java.lang.String r0 = "not found"
            java.lang.String r1 = "-1"
            r15.a(r9, r0, r11, r1)     // Catch:{ all -> 0x00a6 }
            com.ss.android.ugc.aweme.account.login.ui.o<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r0 = r8.f32186b     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.account.login.ui.o<com.ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean> r0 = r8.f32186b     // Catch:{ all -> 0x00a6 }
            r1 = 0
            r0.a(r1)     // Catch:{ all -> 0x00a6 }
        L_0x0074:
            monitor-exit(r15)
            return
        L_0x0076:
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00a6 }
            com.ss.android.ugc.aweme.account.login.c.b$1 r2 = new com.ss.android.ugc.aweme.account.login.c.b$1     // Catch:{ all -> 0x00a6 }
            r2.<init>(r9, r1)     // Catch:{ all -> 0x00a6 }
            r0.a(r1, r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "one_click_number_request_send"
            com.ss.android.ugc.aweme.account.a.a.b r2 = new com.ss.android.ugc.aweme.account.a.a.b     // Catch:{ all -> 0x00a6 }
            r2.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "enter_method"
            com.ss.android.ugc.aweme.account.a.a.b r2 = r2.a((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ all -> 0x00a6 }
            java.lang.String r3 = "carrier"
            java.lang.String r1 = r15.a((java.lang.String) r1)     // Catch:{ all -> 0x00a6 }
            com.ss.android.ugc.aweme.account.a.a.b r1 = r2.a((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x00a6 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f31599b     // Catch:{ all -> 0x00a6 }
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)     // Catch:{ all -> 0x00a6 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a6 }
            r8.f32187d = r0     // Catch:{ all -> 0x00a6 }
            monitor-exit(r15)
            return
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.c.b.a(android.content.Context, int, java.lang.String):void");
    }

    public final void a(String str, String str2, int i, String str3) {
        String str4 = str;
        String str5 = str2;
        int i2 = i;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i), str6}, this, f32184a, false, 20311, new Class[]{String.class, String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {str4, str5, Integer.valueOf(i), str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f32184a, false, 20311, new Class[]{String.class, String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_method", str4).a("carrier", str5).a("is_success", i2).a("duration", System.currentTimeMillis() - this.f32187d);
        if (i2 == 0) {
            a2.a("error_code", str6);
        }
        r.a("one_click_number_request_response", (Map) a2.f31599b);
    }
}
