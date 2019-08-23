package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdkapi.k.a;
import com.bytedance.android.livesdkapi.service.b;
import com.bytedance.android.livesdkapi.service.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18766a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile g f18767b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile Context f18768c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile b f18769d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f18770e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f18771f;

    public static Context d() {
        return f18768c;
    }

    public static b f() {
        return f18769d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void c() {
        /*
            java.lang.Class<com.bytedance.android.livesdkapi.h> r0 = com.bytedance.android.livesdkapi.h.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0039 }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f18766a     // Catch:{ all -> 0x0039 }
            r5 = 1
            r6 = 14905(0x3a39, float:2.0886E-41)
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x0039 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0039 }
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0027
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0039 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = f18766a     // Catch:{ all -> 0x0039 }
            r6 = 1
            r7 = 14905(0x3a39, float:2.0886E-41)
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ all -> 0x0039 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x0039 }
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)
            return
        L_0x0027:
            boolean r2 = f18771f     // Catch:{ all -> 0x0039 }
            if (r2 != 0) goto L_0x0037
            java.lang.String r2 = "com.bytedance.android.livesdk.TTLiveSDKContext"
            java.lang.String r3 = "initGiftResource"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0039 }
            com.bytedance.android.livesdkapi.k.a.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r1)     // Catch:{ all -> 0x0039 }
            r1 = 1
            f18771f = r1     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)
            return
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdkapi.h.c():void");
    }

    @Nullable
    public static c e() {
        if (PatchProxy.isSupport(new Object[0], null, f18766a, true, 14906, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f18766a, true, 14906, new Class[0], c.class);
        }
        if (f18767b == null) {
            return null;
        }
        return f18767b.a();
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f18766a, true, 14903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f18766a, true, 14903, new Class[0], Void.TYPE);
            return;
        }
        try {
            a.a(Class.forName("com.bytedance.android.live.gift.GiftService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.BrowserService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.LinkPkService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.RoomService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.UserService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.WalletService"));
            a.a(Class.forName("com.bytedance.android.livesdk.module.I18nServices"));
        } catch (Exception unused) {
        }
    }

    public static synchronized boolean b() {
        synchronized (h.class) {
            if (PatchProxy.isSupport(new Object[0], null, f18766a, true, 14904, new Class[0], Boolean.TYPE)) {
                boolean booleanValue = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f18766a, true, 14904, new Class[0], Boolean.TYPE)).booleanValue();
                return booleanValue;
            }
            if (!f18770e) {
                a.a("com.bytedance.android.livesdk.TTLiveSDKContext", "delayInit", new Object[0]);
                f18770e = true;
            }
            boolean z = f18770e;
            return z;
        }
    }
}
