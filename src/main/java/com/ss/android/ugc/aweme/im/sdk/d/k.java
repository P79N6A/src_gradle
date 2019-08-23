package com.ss.android.ugc.aweme.im.sdk.d;

import a.f;
import a.i;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.bytedance.im.core.d.g;
import com.bytedance.im.core.d.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.im.sdk.chat.n;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.b;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.e;
import com.ss.android.ugc.aweme.im.sdk.utils.ab;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.service.c;
import com.ss.android.ugc.aweme.im.service.model.d;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51273a;
    private static volatile k m;

    /* renamed from: b  reason: collision with root package name */
    public b f51274b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.aweme.im.service.session.a> f51275c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map<String, com.ss.android.ugc.aweme.im.service.session.a> f51276d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    public volatile int f51277e;

    /* renamed from: f  reason: collision with root package name */
    public volatile int f51278f;
    public volatile boolean g;
    public f h;
    public Handler i = new n(this.o);
    Set<com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a>> j = new HashSet();
    g k = new g() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51279a;

        public final void a(String str, List<m> list) {
        }

        public final void a(List<m> list) {
        }

        public final void b(List<m> list) {
        }

        public final void d(com.bytedance.im.core.d.b bVar) {
        }

        public final void e(com.bytedance.im.core.d.b bVar) {
        }

        public final void a(com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51279a, false, 51811, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51279a, false, 51811, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            k.this.g = true;
            k.this.i.sendEmptyMessage(2);
        }

        public final void b(com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51279a, false, 51812, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51279a, false, 51812, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            k.this.g = true;
            k.this.i.sendEmptyMessage(2);
        }

        public final void c(com.bytedance.im.core.d.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f51279a, false, 51813, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar}, this, f51279a, false, 51813, new Class[]{com.bytedance.im.core.d.b.class}, Void.TYPE);
                return;
            }
            k.this.g = true;
            k.this.i.sendEmptyMessage(2);
        }

        public final void a(Map<String, com.bytedance.im.core.d.b> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, f51279a, false, 51810, new Class[]{Map.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{map}, this, f51279a, false, 51810, new Class[]{Map.class}, Void.TYPE);
                return;
            }
            k.this.g = true;
            k.this.i.sendEmptyMessage(2);
        }
    };
    public Comparator<com.ss.android.ugc.aweme.im.service.session.a> l = new Comparator<com.ss.android.ugc.aweme.im.service.session.a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51287a;

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            com.ss.android.ugc.aweme.im.service.session.a aVar = (com.ss.android.ugc.aweme.im.service.session.a) obj;
            com.ss.android.ugc.aweme.im.service.session.a aVar2 = (com.ss.android.ugc.aweme.im.service.session.a) obj2;
            if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f51287a, false, 51816, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, com.ss.android.ugc.aweme.im.service.session.a.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f51287a, false, 51816, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class, com.ss.android.ugc.aweme.im.service.session.a.class}, Integer.TYPE)).intValue();
            } else if (aVar.o == aVar2.o) {
                return (aVar2.l > aVar.l ? 1 : (aVar2.l == aVar.l ? 0 : -1));
            } else {
                return Integer.compare(aVar2.o, aVar.o);
            }
        }
    };
    private i n;
    private n.a o = new n.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51285a;

        public final void a(Object obj, int i) {
        }

        public final void b() {
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f51285a, false, 51815, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51285a, false, 51815, new Class[0], Void.TYPE);
                return;
            }
            c e2 = a.a().e();
            if (e2 == null || !e2.enableIM()) {
                k.this.d();
            } else if (com.ss.android.ugc.aweme.im.sdk.utils.m.a()) {
                k.this.b();
            } else {
                k.this.c();
            }
        }
    };

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final e f51299a;

        /* renamed from: b  reason: collision with root package name */
        public final List<com.ss.android.ugc.aweme.im.service.session.a> f51300b;

        /* renamed from: c  reason: collision with root package name */
        public final List<com.ss.android.ugc.aweme.im.service.session.a> f51301c;

        public a(e eVar, List<com.ss.android.ugc.aweme.im.service.session.a> list, List<com.ss.android.ugc.aweme.im.service.session.a> list2) {
            this.f51299a = eVar;
            this.f51300b = list;
            this.f51301c = list2;
        }
    }

    private k() {
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51273a, false, 51800, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51273a, false, 51800, new Class[0], Void.TYPE);
            return;
        }
        this.i.sendEmptyMessage(1);
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f51273a, false, 51807, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51273a, false, 51807, new Class[0], Void.TYPE);
            return;
        }
        if (this.f51274b != null) {
            this.g = true;
            this.f51274b = null;
            this.i.sendEmptyMessage(2);
        }
    }

    public static k a() {
        if (PatchProxy.isSupport(new Object[0], null, f51273a, true, 51787, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], null, f51273a, true, 51787, new Class[0], k.class);
        }
        if (m == null) {
            synchronized (k.class) {
                if (m == null) {
                    m = new k();
                }
            }
        }
        return m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r3 = f51273a     // Catch:{ all -> 0x006b }
            r4 = 0
            r5 = 51788(0xca4c, float:7.257E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r4 = f51273a     // Catch:{ all -> 0x006b }
            r5 = 0
            r6 = 51788(0xca4c, float:7.257E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            return
        L_0x0027:
            com.bytedance.im.core.b.e.k.a()     // Catch:{ all -> 0x006b }
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.c()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.b()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.d()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
        L_0x0046:
            a.f r0 = new a.f     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r9.h = r0     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$6 r0 = new com.ss.android.ugc.aweme.im.sdk.d.k$6     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            a.f r1 = r9.h     // Catch:{ all -> 0x006b }
            a.d r1 = r1.b()     // Catch:{ all -> 0x006b }
            a.i r0 = a.i.a((java.util.concurrent.Callable<TResult>) r0, (a.d) r1)     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$5 r1 = new com.ss.android.ugc.aweme.im.sdk.d.k$5     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            java.util.concurrent.Executor r2 = a.i.f1052b     // Catch:{ all -> 0x006b }
            a.i r0 = r0.c(r1, r2)     // Catch:{ all -> 0x006b }
            r9.n = r0     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r9)
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.d.k.b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r3 = f51273a     // Catch:{ all -> 0x006b }
            r4 = 0
            r5 = 51789(0xca4d, float:7.2572E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r4 = f51273a     // Catch:{ all -> 0x006b }
            r5 = 0
            r6 = 51789(0xca4d, float:7.2572E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            return
        L_0x0027:
            com.bytedance.im.core.b.e.k.a()     // Catch:{ all -> 0x006b }
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.c()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.b()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.d()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
        L_0x0046:
            a.f r0 = new a.f     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r9.h = r0     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$8 r0 = new com.ss.android.ugc.aweme.im.sdk.d.k$8     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            a.f r1 = r9.h     // Catch:{ all -> 0x006b }
            a.d r1 = r1.b()     // Catch:{ all -> 0x006b }
            a.i r0 = a.i.a((java.util.concurrent.Callable<TResult>) r0, (a.d) r1)     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$7 r1 = new com.ss.android.ugc.aweme.im.sdk.d.k$7     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            java.util.concurrent.Executor r2 = a.i.f1052b     // Catch:{ all -> 0x006b }
            a.i r0 = r0.c(r1, r2)     // Catch:{ all -> 0x006b }
            r9.n = r0     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r9)
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.d.k.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r3 = f51273a     // Catch:{ all -> 0x006b }
            r4 = 0
            r5 = 51790(0xca4e, float:7.2573E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x006b }
            com.meituan.robust.ChangeQuickRedirect r4 = f51273a     // Catch:{ all -> 0x006b }
            r5 = 0
            r6 = 51790(0xca4e, float:7.2573E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x006b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x006b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x006b }
            monitor-exit(r9)
            return
        L_0x0027:
            com.bytedance.im.core.b.e.k.a()     // Catch:{ all -> 0x006b }
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.c()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.b()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0046
            a.i r0 = r9.n     // Catch:{ all -> 0x006b }
            boolean r0 = r0.d()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
        L_0x0046:
            a.f r0 = new a.f     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            r9.h = r0     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$10 r0 = new com.ss.android.ugc.aweme.im.sdk.d.k$10     // Catch:{ all -> 0x006b }
            r0.<init>()     // Catch:{ all -> 0x006b }
            a.f r1 = r9.h     // Catch:{ all -> 0x006b }
            a.d r1 = r1.b()     // Catch:{ all -> 0x006b }
            a.i r0 = a.i.a((java.util.concurrent.Callable<TResult>) r0, (a.d) r1)     // Catch:{ all -> 0x006b }
            com.ss.android.ugc.aweme.im.sdk.d.k$9 r1 = new com.ss.android.ugc.aweme.im.sdk.d.k$9     // Catch:{ all -> 0x006b }
            r1.<init>()     // Catch:{ all -> 0x006b }
            java.util.concurrent.Executor r2 = a.i.f1052b     // Catch:{ all -> 0x006b }
            a.i r0 = r0.c(r1, r2)     // Catch:{ all -> 0x006b }
            r9.n = r0     // Catch:{ all -> 0x006b }
        L_0x0069:
            monitor-exit(r9)
            return
        L_0x006b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.d.k.d():void");
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f51273a, false, 51791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51273a, false, 51791, new Class[0], Void.TYPE);
            return;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(GlobalContext.getContext());
        Intent intent = new Intent("com.msg.count.action.arrived");
        int max = Math.max(0, Math.abs(o.a().c() - this.f51278f));
        intent.putExtra("msg_count", this.f51277e);
        if (bc.a() || com.ss.android.ugc.aweme.im.sdk.utils.m.b()) {
            if (max == 0) {
                max = -1;
            }
            intent.putExtra("msg_dot", max);
        }
        instance.sendBroadcast(intent);
    }

    public final void a(com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a> aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f51273a, false, 51798, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.session.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f51273a, false, 51798, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.session.b.a.class}, Void.TYPE);
            return;
        }
        this.j.add(aVar);
        this.i.sendEmptyMessage(1);
    }

    public final void b(com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a> aVar) {
        com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f51273a, false, 51799, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.session.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f51273a, false, 51799, new Class[]{com.ss.android.ugc.aweme.im.sdk.module.session.b.a.class}, Void.TYPE);
            return;
        }
        this.j.remove(aVar2);
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51273a, false, 51803, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51273a, false, 51803, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        d iMSetting = a.a().e().getIMSetting();
        if (!(iMSetting == null || iMSetting.f52882e == null || !iMSetting.f52882e.getShowMsgCell().booleanValue() || !iMSetting.f52882e.getMainSwitch().booleanValue() || bundle == null)) {
            this.g = true;
            if (PatchProxy.isSupport(new Object[0], this, f51273a, false, 51804, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51273a, false, 51804, new Class[0], Void.TYPE);
            } else if (this.f51274b == null) {
                this.f51274b = new b();
                this.f51274b.t = true;
            }
            long j2 = bundle.getLong("flip_chat_msg_unread_dot_count");
            long j3 = bundle.getLong("flip_chat_msg_unread_count");
            long j4 = bundle.getLong("flip_chat_msg_update_time");
            String string = bundle.getString("flip_chat_msg_content");
            this.f51274b.f51902b = ab.a(j2);
            this.f51274b.m = ab.a(j3);
            this.f51274b.a(j4);
            this.f51274b.k = string;
            this.i.sendEmptyMessage(2);
        }
    }

    public final void a(com.ss.android.ugc.aweme.im.service.session.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f51273a, false, 51802, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f51273a, false, 51802, new Class[]{com.ss.android.ugc.aweme.im.service.session.a.class}, Void.TYPE);
        } else if (aVar.b() != 10) {
            this.f51276d.put(aVar.O_(), aVar);
            this.i.sendEmptyMessage(2);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51273a, false, 51805, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f51273a, false, 51805, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && this.f51276d.containsKey(str)) {
            this.f51276d.remove(str);
            this.i.sendEmptyMessage(2);
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.im.service.session.a> list) {
        List<com.ss.android.ugc.aweme.im.service.session.a> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f51273a, false, 51796, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f51273a, false, 51796, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a> a2 : this.j) {
            a2.a(list2);
        }
    }
}
