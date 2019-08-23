package com.ss.android.ugc.aweme.miniapp.b.a;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final String f55551a = "n";

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f55552c;

    /* renamed from: b  reason: collision with root package name */
    private final Set<String> f55553b = new HashSet(1);

    /* renamed from: d  reason: collision with root package name */
    private Looper f55554d = Looper.getMainLooper();

    public abstract void a();

    public abstract void a(String str);

    public final synchronized void a(@NonNull String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{strArr}, this, f55552c, false, 59340, new Class[]{String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr}, this, f55552c, false, 59340, new Class[]{String[].class}, Void.TYPE);
            return;
        }
        Collections.addAll(this.f55553b, strArr);
    }

    public final synchronized boolean a(@NonNull String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f55552c, false, 59338, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f55552c, false, 59338, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i == 0) {
            return a(str, j.GRANTED);
        } else {
            return a(str, j.DENIED);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(@android.support.annotation.NonNull final java.lang.String r12, com.ss.android.ugc.aweme.miniapp.b.a.j r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x009e }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x009e }
            r10 = 1
            r1[r10] = r13     // Catch:{ all -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r3 = f55552c     // Catch:{ all -> 0x009e }
            r4 = 0
            r5 = 59339(0xe7cb, float:8.3152E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x009e }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r9] = r2     // Catch:{ all -> 0x009e }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.j> r2 = com.ss.android.ugc.aweme.miniapp.b.a.j.class
            r6[r10] = r2     // Catch:{ all -> 0x009e }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x009e }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x0048
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x009e }
            r1[r9] = r12     // Catch:{ all -> 0x009e }
            r1[r10] = r13     // Catch:{ all -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r3 = f55552c     // Catch:{ all -> 0x009e }
            r4 = 0
            r5 = 59339(0xe7cb, float:8.3152E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x009e }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r9] = r0     // Catch:{ all -> 0x009e }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.j> r0 = com.ss.android.ugc.aweme.miniapp.b.a.j.class
            r6[r10] = r0     // Catch:{ all -> 0x009e }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x009e }
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x009e }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x009e }
            monitor-exit(r11)
            return r0
        L_0x0048:
            java.util.Set<java.lang.String> r1 = r11.f55553b     // Catch:{ all -> 0x009e }
            r1.remove(r12)     // Catch:{ all -> 0x009e }
            com.ss.android.ugc.aweme.miniapp.b.a.j r1 = com.ss.android.ugc.aweme.miniapp.b.a.j.GRANTED     // Catch:{ all -> 0x009e }
            if (r13 != r1) goto L_0x006a
            java.util.Set<java.lang.String> r1 = r11.f55553b     // Catch:{ all -> 0x009e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x009c
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x009e }
            android.os.Looper r2 = r11.f55554d     // Catch:{ all -> 0x009e }
            r1.<init>(r2)     // Catch:{ all -> 0x009e }
            com.ss.android.ugc.aweme.miniapp.b.a.n$1 r2 = new com.ss.android.ugc.aweme.miniapp.b.a.n$1     // Catch:{ all -> 0x009e }
            r2.<init>(r12)     // Catch:{ all -> 0x009e }
            r1.post(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r11)
            return r10
        L_0x006a:
            com.ss.android.ugc.aweme.miniapp.b.a.j r1 = com.ss.android.ugc.aweme.miniapp.b.a.j.DENIED     // Catch:{ all -> 0x009e }
            if (r13 != r1) goto L_0x007f
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x009e }
            android.os.Looper r2 = r11.f55554d     // Catch:{ all -> 0x009e }
            r1.<init>(r2)     // Catch:{ all -> 0x009e }
            com.ss.android.ugc.aweme.miniapp.b.a.n$2 r2 = new com.ss.android.ugc.aweme.miniapp.b.a.n$2     // Catch:{ all -> 0x009e }
            r2.<init>(r12)     // Catch:{ all -> 0x009e }
            r1.post(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r11)
            return r10
        L_0x007f:
            com.ss.android.ugc.aweme.miniapp.b.a.j r1 = com.ss.android.ugc.aweme.miniapp.b.a.j.NOT_FOUND     // Catch:{ all -> 0x009e }
            if (r13 != r1) goto L_0x009c
            java.util.Set<java.lang.String> r1 = r11.f55553b     // Catch:{ all -> 0x009e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x009c
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x009e }
            android.os.Looper r2 = r11.f55554d     // Catch:{ all -> 0x009e }
            r1.<init>(r2)     // Catch:{ all -> 0x009e }
            com.ss.android.ugc.aweme.miniapp.b.a.n$3 r2 = new com.ss.android.ugc.aweme.miniapp.b.a.n$3     // Catch:{ all -> 0x009e }
            r2.<init>(r12)     // Catch:{ all -> 0x009e }
            r1.post(r2)     // Catch:{ all -> 0x009e }
            monitor-exit(r11)
            return r10
        L_0x009c:
            monitor-exit(r11)
            return r9
        L_0x009e:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.n.a(java.lang.String, com.ss.android.ugc.aweme.miniapp.b.a.j):boolean");
    }
}
