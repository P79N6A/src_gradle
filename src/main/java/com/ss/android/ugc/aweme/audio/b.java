package com.ss.android.ugc.aweme.audio;

import android.content.BroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34397a;

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f34398f = com.ss.android.ugc.aweme.g.a.a();
    private static volatile b g;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f34399b;

    /* renamed from: c  reason: collision with root package name */
    public BroadcastReceiver f34400c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f34401d;

    /* renamed from: e  reason: collision with root package name */
    public int f34402e = -1;

    public interface a {
        void a(int i);
    }

    private b() {
        if (g == null) {
            this.f34399b = new CopyOnWriteArrayList();
            return;
        }
        throw new RuntimeException("Illegal access.");
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f34397a, true, 23884, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f34397a, true, 23884, new Class[0], b.class);
        }
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|(1:12)(2:13|(4:15|(1:17)|18|19))|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x009c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r12, @android.support.annotation.NonNull com.ss.android.ugc.aweme.audio.b.a r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r12
            r10 = 1
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f34397a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2
            java.lang.Class<com.ss.android.ugc.aweme.audio.b$a> r2 = com.ss.android.ugc.aweme.audio.b.a.class
            r6[r10] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 23885(0x5d4d, float:3.347E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003d
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r12
            r1[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f34397a
            r4 = 0
            r5 = 23885(0x5d4d, float:3.347E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.audio.b$a> r0 = com.ss.android.ugc.aweme.audio.b.a.class
            r6[r10] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003d:
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r8 = r11.f34399b
            monitor-enter(r8)
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r1 = r11.f34399b     // Catch:{ all -> 0x009e }
            boolean r1 = r1.contains(r13)     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x004d
            java.util.List<com.ss.android.ugc.aweme.audio.b$a> r1 = r11.f34399b     // Catch:{ all -> 0x009e }
            r1.add(r13)     // Catch:{ all -> 0x009e }
        L_0x004d:
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x009e }
            r1[r9] = r12     // Catch:{ all -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r3 = f34397a     // Catch:{ all -> 0x009e }
            r4 = 0
            r5 = 23886(0x5d4e, float:3.3471E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x009e }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x009e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x009e }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x007b
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x009e }
            r1[r9] = r12     // Catch:{ all -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r3 = f34397a     // Catch:{ all -> 0x009e }
            r4 = 0
            r5 = 23886(0x5d4e, float:3.3471E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]     // Catch:{ all -> 0x009e }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x009e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x009e }
            r2 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            goto L_0x009c
        L_0x007b:
            boolean r1 = r11.f34401d     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x009c
            android.content.BroadcastReceiver r1 = r11.f34400c     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x008a
            com.ss.android.ugc.aweme.audio.PhoneRingerObserver$1 r1 = new com.ss.android.ugc.aweme.audio.PhoneRingerObserver$1     // Catch:{ all -> 0x009e }
            r1.<init>(r11)     // Catch:{ all -> 0x009e }
            r11.f34400c = r1     // Catch:{ all -> 0x009e }
        L_0x008a:
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = "android.media.RINGER_MODE_CHANGED"
            r1.<init>(r2)     // Catch:{ Exception -> 0x009c }
            android.content.Context r0 = r12.getApplicationContext()     // Catch:{ Exception -> 0x009c }
            android.content.BroadcastReceiver r2 = r11.f34400c     // Catch:{ Exception -> 0x009c }
            r0.registerReceiver(r2, r1)     // Catch:{ Exception -> 0x009c }
            r11.f34401d = r10     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            return
        L_0x009e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audio.b.a(android.content.Context, com.ss.android.ugc.aweme.audio.b$a):void");
    }
}
