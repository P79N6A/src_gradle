package com.bytedance.android.livesdk.feed.tab.b;

import android.content.Context;
import com.bytedance.android.live.core.utils.s;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdk.feed.tab.a.a;
import com.bytedance.common.utility.StringUtils;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.q.c;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14423a;

    /* renamed from: b  reason: collision with root package name */
    List<g> f14424b;

    /* renamed from: c  reason: collision with root package name */
    private Context f14425c;

    /* renamed from: d  reason: collision with root package name */
    private a f14426d;

    /* renamed from: e  reason: collision with root package name */
    private m<g> f14427e;

    /* renamed from: f  reason: collision with root package name */
    private long f14428f = Long.MIN_VALUE;
    private Gson g;
    private Map<Long, g> h = new ConcurrentHashMap();

    public final Observable<List<g>> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f14423a, false, 8924, new Class[0], Observable.class)) {
            return Observable.create(new l(this)).subscribeOn(Schedulers.io());
        }
        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f14423a, false, 8924, new Class[0], Observable.class);
    }

    public final List<g> b() {
        if (PatchProxy.isSupport(new Object[0], this, f14423a, false, 8925, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f14423a, false, 8925, new Class[0], List.class);
        }
        c();
        return new ArrayList(this.f14424b);
    }

    private List<g> d() {
        if (PatchProxy.isSupport(new Object[0], this, f14423a, false, 8931, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f14423a, false, 8931, new Class[0], List.class);
        }
        String string = c.a(this.f14425c, "ttlive_tabs_cache", 0).getString("tabs", "");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (List) s.a(string, new TypeToken<List<g>>() {
            }.getType());
        } catch (JsonParseException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0047 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x0047 }
            r4 = 0
            r5 = 8927(0x22df, float:1.251E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0047 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0047 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0047 }
            com.meituan.robust.ChangeQuickRedirect r4 = f14423a     // Catch:{ all -> 0x0047 }
            r5 = 0
            r6 = 8927(0x22df, float:1.251E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0047 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0047 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0047 }
            monitor-exit(r9)
            return
        L_0x0025:
            java.util.List<com.bytedance.android.livesdk.feed.d.g> r0 = r9.f14424b     // Catch:{ all -> 0x0047 }
            boolean r0 = b(r0)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0034
            java.util.List r0 = r9.d()     // Catch:{ all -> 0x0047 }
            r9.c(r0)     // Catch:{ all -> 0x0047 }
        L_0x0034:
            java.util.List<com.bytedance.android.livesdk.feed.d.g> r0 = r9.f14424b     // Catch:{ all -> 0x0047 }
            boolean r0 = b(r0)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0045
            com.bytedance.android.livesdk.feed.tab.a.a r0 = r9.f14426d     // Catch:{ all -> 0x0047 }
            java.util.List r0 = r0.a()     // Catch:{ all -> 0x0047 }
            r9.c(r0)     // Catch:{ all -> 0x0047 }
        L_0x0045:
            monitor-exit(r9)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.b.k.c():void");
    }

    static boolean b(List<g> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f14423a, true, 8928, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, null, f14423a, true, 8928, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        } else if (list == null || list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public final g a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f14423a, false, 8934, new Class[]{Long.TYPE}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f14423a, false, 8934, new Class[]{Long.TYPE}, g.class);
        }
        c();
        return this.h.get(Long.valueOf(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void c(java.util.List<com.bytedance.android.livesdk.feed.d.g> r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0089 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0089 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x0089 }
            r4 = 0
            r5 = 8926(0x22de, float:1.2508E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0089 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r9] = r2     // Catch:{ all -> 0x0089 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0089 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0089 }
            r1[r9] = r11     // Catch:{ all -> 0x0089 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x0089 }
            r4 = 0
            r5 = 8926(0x22de, float:1.2508E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0089 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r9] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0089 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0089 }
            monitor-exit(r10)
            return
        L_0x0032:
            r10.f14424b = r11     // Catch:{ all -> 0x0089 }
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0089 }
            r1[r9] = r11     // Catch:{ all -> 0x0089 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x0089 }
            r4 = 0
            r5 = 8935(0x22e7, float:1.252E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0089 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r9] = r2     // Catch:{ all -> 0x0089 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0089 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0063
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0089 }
            r1[r9] = r11     // Catch:{ all -> 0x0089 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x0089 }
            r4 = 0
            r5 = 8935(0x22e7, float:1.252E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0089 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r9] = r0     // Catch:{ all -> 0x0089 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0089 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0089 }
            monitor-exit(r10)
            return
        L_0x0063:
            boolean r1 = com.bytedance.common.utility.Lists.isEmpty(r11)     // Catch:{ all -> 0x0089 }
            if (r1 != 0) goto L_0x0087
            java.util.Iterator r0 = r11.iterator()     // Catch:{ all -> 0x0089 }
        L_0x006d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0087
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0089 }
            com.bytedance.android.livesdk.feed.d.g r1 = (com.bytedance.android.livesdk.feed.d.g) r1     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x006d
            java.util.Map<java.lang.Long, com.bytedance.android.livesdk.feed.d.g> r2 = r10.h     // Catch:{ all -> 0x0089 }
            long r3 = r1.f14080b     // Catch:{ all -> 0x0089 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0089 }
            r2.put(r3, r1)     // Catch:{ all -> 0x0089 }
            goto L_0x006d
        L_0x0087:
            monitor-exit(r10)
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.b.k.c(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.util.List<com.bytedance.android.livesdk.feed.d.g> r19) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            monitor-enter(r18)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d9 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00d9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x00d9 }
            r4 = 0
            r5 = 8930(0x22e2, float:1.2514E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00d9 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r6[r10] = r2     // Catch:{ all -> 0x00d9 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00d9 }
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x003f
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d9 }
            r1[r10] = r0     // Catch:{ all -> 0x00d9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f14423a     // Catch:{ all -> 0x00d9 }
            r4 = 0
            r5 = 8930(0x22e2, float:1.2514E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00d9 }
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r6[r10] = r0     // Catch:{ all -> 0x00d9 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00d9 }
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00d9 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00d9 }
            monitor-exit(r18)
            return r0
        L_0x003f:
            if (r0 == 0) goto L_0x00d7
            boolean r1 = r19.isEmpty()     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x00d7
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d9 }
            r11[r10] = r0     // Catch:{ all -> 0x00d9 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f14423a     // Catch:{ all -> 0x00d9 }
            r14 = 1
            r15 = 8929(0x22e1, float:1.2512E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ all -> 0x00d9 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1[r10] = r2     // Catch:{ all -> 0x00d9 }
            java.lang.Class r17 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00d9 }
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x0080
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x00d9 }
            r11[r10] = r0     // Catch:{ all -> 0x00d9 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f14423a     // Catch:{ all -> 0x00d9 }
            r14 = 1
            r15 = 8929(0x22e1, float:1.2512E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]     // Catch:{ all -> 0x00d9 }
            java.lang.Class<java.util.List> r2 = java.util.List.class
            r1[r10] = r2     // Catch:{ all -> 0x00d9 }
            java.lang.Class r17 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00d9 }
            r16 = r1
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00d9 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00d9 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00d9 }
            goto L_0x00a2
        L_0x0080:
            boolean r1 = b(r19)     // Catch:{ all -> 0x00d9 }
            if (r1 != 0) goto L_0x0088
        L_0x0086:
            r1 = 0
            goto L_0x00a2
        L_0x0088:
            java.util.Iterator r1 = r19.iterator()     // Catch:{ all -> 0x00d9 }
        L_0x008c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d9 }
            com.bytedance.android.livesdk.feed.d.g r2 = (com.bytedance.android.livesdk.feed.d.g) r2     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x0086
            boolean r2 = r2.b()     // Catch:{ all -> 0x00d9 }
            if (r2 != 0) goto L_0x008c
            goto L_0x0086
        L_0x00a1:
            r1 = 1
        L_0x00a2:
            if (r1 != 0) goto L_0x00a5
            goto L_0x00d7
        L_0x00a5:
            com.bytedance.android.livesdk.feed.m<com.bytedance.android.livesdk.feed.d.g> r1 = r8.f14427e     // Catch:{ all -> 0x00d9 }
            java.util.List<com.bytedance.android.livesdk.feed.d.g> r2 = r8.f14424b     // Catch:{ all -> 0x00d9 }
            boolean r1 = r1.a(r0, r2)     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x00b1
            monitor-exit(r18)
            return r10
        L_0x00b1:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d9 }
            r8.c(r1)     // Catch:{ all -> 0x00d9 }
            com.google.gson.Gson r1 = r8.g     // Catch:{ JsonIOException -> 0x00d5 }
            java.lang.String r0 = r1.toJson((java.lang.Object) r0)     // Catch:{ JsonIOException -> 0x00d5 }
            android.content.Context r1 = r8.f14425c     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "ttlive_tabs_cache"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r10)     // Catch:{ all -> 0x00d9 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "tabs"
            r1.putString(r2, r0)     // Catch:{ all -> 0x00d9 }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r1)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r18)
            return r9
        L_0x00d5:
            monitor-exit(r18)
            return r10
        L_0x00d7:
            monitor-exit(r18)
            return r10
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.tab.b.k.a(java.util.List):boolean");
    }

    public k(a aVar, Context context, m<g> mVar) {
        this.f14426d = aVar;
        this.f14425c = context;
        this.f14427e = mVar;
        this.g = d.a().e();
    }
}
