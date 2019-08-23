package com.ss.android.ugc.aweme.update;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75210a;

    /* renamed from: c  reason: collision with root package name */
    private static d f75211c;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f75212b;

    private d() {
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f75210a, true, 87362, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f75210a, true, 87362, new Class[0], d.class);
        }
        if (f75211c == null) {
            synchronized (d.class) {
                if (f75211c == null) {
                    f75211c = new d();
                }
            }
        }
        return f75211c;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        r9 = r3;
        r3 = r1;
        r1 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object b() throws java.lang.Exception {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r7 = com.ss.android.ugc.aweme.global.config.settings.g.b()
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r3 = 0
            r4 = 48797(0xbe9d, float:6.8379E-41)
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x002c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.f49567a
            r3 = 0
            r4 = 48797(0xbe9d, float:6.8379E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r1 = r7
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0049
        L_0x002c:
            com.bytedance.ies.c r0 = r7.f49569c
            if (r0 != 0) goto L_0x0037
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getCheckLarkInhouseNet()
            goto L_0x0049
        L_0x0037:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r0 = r7.f49568b
            java.lang.Integer r0 = r0.getCheckLarkInhouseNet()
            com.bytedance.ies.c r1 = r7.f49569c
            java.lang.String r2 = "check_lark_inhouse_net"
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.global.config.settings.pojo.a.a((com.bytedance.ies.c) r1, (java.lang.String) r2, (java.lang.Class<T>) r3, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
        L_0x0049:
            int r0 = r0.intValue()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0086
            java.net.Socket r0 = new java.net.Socket     // Catch:{ Exception -> 0x0086 }
            r0.<init>()     // Catch:{ Exception -> 0x0086 }
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ Throwable -> 0x0071, all -> 0x006e }
            java.lang.String r3 = "aweme-beta.bytedance.net"
            r4 = 80
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x0071, all -> 0x006e }
            r3 = 5000(0x1388, float:7.006E-42)
            r0.connect(r1, r3)     // Catch:{ Throwable -> 0x0071, all -> 0x006e }
            boolean r1 = r0.isConnected()     // Catch:{ Throwable -> 0x0071, all -> 0x006e }
            r10.f75212b = r1     // Catch:{ Throwable -> 0x0071, all -> 0x006e }
            r0.close()     // Catch:{ Exception -> 0x0086 }
            goto L_0x0086
        L_0x006e:
            r1 = move-exception
            r3 = r2
            goto L_0x0077
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r3 = move-exception
            r9 = r3
            r3 = r1
            r1 = r9
        L_0x0077:
            if (r3 == 0) goto L_0x0082
            r0.close()     // Catch:{ Throwable -> 0x007d }
            goto L_0x0085
        L_0x007d:
            r0 = move-exception
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r3, (java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0085
        L_0x0082:
            r0.close()     // Catch:{ Exception -> 0x0086 }
        L_0x0085:
            throw r1     // Catch:{ Exception -> 0x0086 }
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.d.b():java.lang.Object");
    }
}
