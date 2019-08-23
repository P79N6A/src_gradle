package com.ss.android.ugc.aweme.feed.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45230a;

    /* renamed from: b  reason: collision with root package name */
    final LinkedHashMap<K, V> f45231b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c  reason: collision with root package name */
    private int f45232c;

    /* renamed from: d  reason: collision with root package name */
    private int f45233d = 31;

    /* renamed from: e  reason: collision with root package name */
    private int f45234e;

    /* renamed from: f  reason: collision with root package name */
    private int f45235f;
    private int g;
    private int h;

    private int b(K k, V v) {
        if (!PatchProxy.isSupport(new Object[]{k, v}, this, f45230a, false, 41082, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{k, v}, this, f45230a, false, 41082, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }

    public final synchronized String toString() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f45230a, false, 41086, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f45230a, false, 41086, new Class[0], String.class);
        }
        int i2 = this.g + this.h;
        if (i2 != 0) {
            i = (this.g * 100) / i2;
        } else {
            i = 0;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f45233d), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i)});
    }

    public a(int i) {
    }

    public final V a(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f45230a, false, 41078, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k}, this, f45230a, false, 41078, new Class[]{Object.class}, Object.class);
        } else if (k != null) {
            synchronized (this) {
                V v = this.f45231b.get(k);
                if (v != null) {
                    this.g++;
                    return v;
                }
                this.h++;
                return null;
            }
        } else {
            throw new NullPointerException("key == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0086, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f45230a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r8] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 41080(0xa078, float:5.7565E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003a
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r1[r8] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f45230a
            r4 = 0
            r5 = 41080(0xa078, float:5.7565E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r8] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x003a:
            monitor-enter(r9)
            int r1 = r9.f45232c     // Catch:{ all -> 0x00a6 }
            if (r1 < 0) goto L_0x0087
            java.util.LinkedHashMap<K, V> r1 = r9.f45231b     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x004b
            int r1 = r9.f45232c     // Catch:{ all -> 0x00a6 }
            if (r1 != 0) goto L_0x0087
        L_0x004b:
            int r1 = r9.f45232c     // Catch:{ all -> 0x00a6 }
            if (r1 <= r10) goto L_0x0085
            java.util.LinkedHashMap<K, V> r1 = r9.f45231b     // Catch:{ all -> 0x00a6 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0058
            goto L_0x0085
        L_0x0058:
            java.util.LinkedHashMap<K, V> r1 = r9.f45231b     // Catch:{ all -> 0x00a6 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x00a6 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00a6 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00a6 }
            java.util.LinkedHashMap<K, V> r4 = r9.f45231b     // Catch:{ all -> 0x00a6 }
            r4.remove(r3)     // Catch:{ all -> 0x00a6 }
            int r4 = r9.f45232c     // Catch:{ all -> 0x00a6 }
            int r1 = r9.b(r3, r1)     // Catch:{ all -> 0x00a6 }
            int r4 = r4 - r1
            r9.f45232c = r4     // Catch:{ all -> 0x00a6 }
            int r1 = r9.f45235f     // Catch:{ all -> 0x00a6 }
            int r1 = r1 + r0
            r9.f45235f = r1     // Catch:{ all -> 0x00a6 }
            monitor-exit(r9)     // Catch:{ all -> 0x00a6 }
            goto L_0x003a
        L_0x0085:
            monitor-exit(r9)     // Catch:{ all -> 0x00a6 }
            return
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.Class r2 = r9.getClass()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00a6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.d.a.a(int):void");
    }

    public final V a(K k, V v) {
        V put;
        if (PatchProxy.isSupport(new Object[]{k, v}, this, f45230a, false, 41079, new Class[]{Object.class, Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k, v}, this, f45230a, false, 41079, new Class[]{Object.class, Object.class}, Object.class);
        } else if (k != null) {
            synchronized (this) {
                this.f45234e++;
                this.f45232c += b(k, v);
                put = this.f45231b.put(k, v);
                if (put != null) {
                    this.f45232c -= b(k, put);
                }
            }
            a(this.f45233d);
            return put;
        } else {
            throw new NullPointerException("key == null || value == null");
        }
    }
}
