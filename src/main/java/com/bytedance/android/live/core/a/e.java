package com.bytedance.android.live.core.a;

import android.util.Pair;
import com.bytedance.android.live.core.rxutils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.subjects.Subject;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class e<K, V> implements a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7792a;

    /* renamed from: b  reason: collision with root package name */
    private final Function<K, Integer> f7793b;

    /* renamed from: c  reason: collision with root package name */
    private final BiFunction<K, V, Boolean> f7794c;

    /* renamed from: d  reason: collision with root package name */
    private final Function3<K, V, Long, Boolean> f7795d;

    /* renamed from: e  reason: collision with root package name */
    private final BiFunction<V, V, V> f7796e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, Pair<V, Long>> f7797f;
    private final ConcurrentMap<Integer, Subject<V>> g;

    public e() {
        this(Long.MAX_VALUE);
    }

    private e(long j) {
        this(f.f7799b, Long.MAX_VALUE);
    }

    public final void a(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7792a, false, 157, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{k}, this, f7792a, false, 157, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f7797f.remove(i.a(this.f7793b, k));
    }

    public final V b(K k) {
        if (PatchProxy.isSupport(new Object[]{k}, this, f7792a, false, 158, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{k}, this, f7792a, false, 158, new Class[]{Object.class}, Object.class);
        }
        Pair pair = this.f7797f.get(i.a(this.f7793b, k));
        if (pair == null || ((Boolean) i.a(this.f7795d, k, pair.first, pair.second)).booleanValue()) {
            return null;
        }
        return pair.first;
    }

    private e(BiFunction<K, V, Boolean> biFunction, long j) {
        this(g.f7801b, biFunction, new h(j), i.f7805b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(K r12, V r13) {
        /*
            r11 = this;
            r8 = 2
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            r10 = 1
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f7792a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 156(0x9c, float:2.19E-43)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f7792a
            r3 = 0
            r4 = 156(0x9c, float:2.19E-43)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r9] = r1
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003d:
            io.reactivex.functions.BiFunction<K, V, java.lang.Boolean> r0 = r11.f7794c
            java.lang.Object r0 = com.bytedance.android.live.core.rxutils.i.a(r0, r12, r13)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004c
            return
        L_0x004c:
            io.reactivex.functions.Function<K, java.lang.Integer> r0 = r11.f7793b
            java.lang.Object r0 = com.bytedance.android.live.core.rxutils.i.a(r0, r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.Integer, android.util.Pair<V, java.lang.Long>> r1 = r11.f7797f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            if (r1 == 0) goto L_0x0098
            io.reactivex.functions.Function3<K, V, java.lang.Long, java.lang.Boolean> r2 = r11.f7795d
            java.lang.Object r3 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Object r1 = com.bytedance.android.live.core.rxutils.i.a(r2, r12, r3, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0098
            java.util.Map<java.lang.Integer, android.util.Pair<V, java.lang.Long>> r1 = r11.f7797f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            boolean r9 = r13.equals(r1)
            if (r9 != 0) goto L_0x0098
            io.reactivex.functions.BiFunction<V, V, V> r2 = r11.f7796e
            java.lang.Object r2 = com.bytedance.android.live.core.rxutils.i.a(r2, r1, r13)
            boolean r9 = r2.equals(r1)
            r7 = r2
            goto L_0x0099
        L_0x0098:
            r7 = r13
        L_0x0099:
            if (r9 == 0) goto L_0x009c
            return
        L_0x009c:
            java.util.Map<java.lang.Integer, android.util.Pair<V, java.lang.Long>> r1 = r11.f7797f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.util.Pair r3 = new android.util.Pair
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r3.<init>(r7, r4)
            r1.put(r2, r3)
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.reactivex.subjects.Subject<V>> r1 = r11.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x00cd
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.reactivex.subjects.Subject<V>> r1 = r11.g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            io.reactivex.subjects.Subject r0 = (io.reactivex.subjects.Subject) r0
            r0.onNext(r7)
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.a.e.a(java.lang.Object, java.lang.Object):void");
    }

    private e(Function<K, Integer> function, BiFunction<K, V, Boolean> biFunction, Function3<K, V, Long, Boolean> function3, BiFunction<V, V, V> biFunction2) {
        this.f7797f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap(20, 0.75f, 4);
        this.f7793b = function;
        this.f7794c = biFunction;
        this.f7795d = function3;
        this.f7796e = biFunction2;
    }
}
