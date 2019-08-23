package com.ss.android.ugc.aweme.freeflowcard.a;

import a.i;
import android.content.Context;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.freeflowcard.data.a;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;
import com.ss.android.ugc.aweme.freeflowcard.data.b.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48555a;

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f48556d;

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f48557b;

    /* renamed from: c  reason: collision with root package name */
    int f48558c = 25;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f48559e;

    private d() {
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48555a, false, 46144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48555a, false, 46144, new Class[0], Void.TYPE);
            return;
        }
        this.f48559e = true;
        i.a((Callable<TResult>) new Callable<Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48560a;

            /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d1, code lost:
                if (r4 == 0) goto L_0x011b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
                if (r3 != 0) goto L_0x00d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d6, code lost:
                r4 = r3 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
                if (r4 >= r2) goto L_0x00f7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00da, code lost:
                r6 = com.ss.android.ugc.aweme.freeflowcard.a.b(r4);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
                if (r6.length != 2) goto L_0x011b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f1, code lost:
                if (com.bytedance.common.utility.collection.CollectionUtils.isEmpty(com.ss.android.ugc.aweme.freeflowcard.data.a.a().b(r6[0], r6[1])) != false) goto L_0x00f4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
                r4 = r4 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
                r15 = com.ss.android.ugc.aweme.freeflowcard.a.c();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0101, code lost:
                if (r3 >= r9.f48558c) goto L_0x0106;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
                r17 = 2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x0106, code lost:
                r17 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x0108, code lost:
                r12 = new com.ss.android.ugc.aweme.freeflowcard.data.b.b(true, 0, r15, r17, r10.isDayOpen, r10.dayOpenResetTime);
                com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(r12);
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                /*
                    r21 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f48560a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                    r4 = 0
                    r5 = 46152(0xb448, float:6.4673E-41)
                    r2 = r21
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x002a
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f48560a
                    r5 = 0
                    r6 = 46152(0xb448, float:6.4673E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
                    r3 = r21
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Void r0 = (java.lang.Void) r0
                    return r0
                L_0x002a:
                    r1 = r21
                    com.ss.android.ugc.aweme.freeflowcard.a.d r9 = com.ss.android.ugc.aweme.freeflowcard.a.d.this
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a
                    r5 = 0
                    r6 = 46145(0xb441, float:6.4663E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x0053
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a
                    r5 = 0
                    r6 = 46145(0xb441, float:6.4663E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    goto L_0x0133
                L_0x0053:
                    com.ss.android.ugc.aweme.freeflowcard.data.a r2 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.b r10 = r2.c()
                    boolean r2 = r10.isOpen
                    r11 = 1
                    if (r2 != 0) goto L_0x0064
                    int r2 = r10.changeType
                    if (r2 == r11) goto L_0x0131
                L_0x0064:
                    boolean r2 = r10.isOpen
                    if (r2 != 0) goto L_0x011b
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r2[r0] = r10
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a
                    r5 = 0
                    r6 = 46147(0xb443, float:6.4666E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r11]
                    java.lang.Class<com.ss.android.ugc.aweme.freeflowcard.data.b.b> r3 = com.ss.android.ugc.aweme.freeflowcard.data.b.b.class
                    r7[r0] = r3
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x0099
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r2[r0] = r10
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.d.f48555a
                    r5 = 0
                    r6 = 46147(0xb443, float:6.4666E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r11]
                    java.lang.Class<com.ss.android.ugc.aweme.freeflowcard.data.b.b> r3 = com.ss.android.ugc.aweme.freeflowcard.data.b.b.class
                    r7[r0] = r3
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    goto L_0x011b
                L_0x0099:
                    java.util.Date r2 = new java.util.Date
                    r2.<init>()
                    int r2 = r2.getDate()
                    r3 = 1
                    r4 = 0
                L_0x00a4:
                    r5 = 2
                    if (r3 == r2) goto L_0x00d0
                    long[] r6 = com.ss.android.ugc.aweme.freeflowcard.a.b(r3)
                    int r7 = r6.length
                    if (r7 != r5) goto L_0x011b
                    com.ss.android.ugc.aweme.freeflowcard.data.a r7 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r12 = r6[r0]
                    r14 = r6[r11]
                    java.util.List r6 = r7.b(r12, r14)
                    boolean r6 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r6)
                    if (r6 != 0) goto L_0x00cd
                    boolean r6 = r9.a((int) r3)
                    if (r6 == 0) goto L_0x00ca
                    if (r4 != 0) goto L_0x00d1
                    r4 = r3
                    goto L_0x00cd
                L_0x00ca:
                    if (r4 == 0) goto L_0x00cd
                    r4 = 0
                L_0x00cd:
                    int r3 = r3 + 1
                    goto L_0x00a4
                L_0x00d0:
                    r3 = 0
                L_0x00d1:
                    if (r4 == 0) goto L_0x011b
                    if (r3 != 0) goto L_0x00d6
                    goto L_0x011b
                L_0x00d6:
                    int r4 = r3 + 1
                L_0x00d8:
                    if (r4 >= r2) goto L_0x00f7
                    long[] r6 = com.ss.android.ugc.aweme.freeflowcard.a.b(r4)
                    int r7 = r6.length
                    if (r7 != r5) goto L_0x011b
                    com.ss.android.ugc.aweme.freeflowcard.data.a r7 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r12 = r6[r0]
                    r14 = r6[r11]
                    java.util.List r6 = r7.b(r12, r14)
                    boolean r6 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r6)
                    if (r6 != 0) goto L_0x00f4
                    goto L_0x011b
                L_0x00f4:
                    int r4 = r4 + 1
                    goto L_0x00d8
                L_0x00f7:
                    com.ss.android.ugc.aweme.freeflowcard.data.b.b r2 = new com.ss.android.ugc.aweme.freeflowcard.data.b.b
                    r13 = 1
                    r14 = 0
                    long r15 = com.ss.android.ugc.aweme.freeflowcard.a.c()
                    int r4 = r9.f48558c
                    if (r3 >= r4) goto L_0x0106
                    r17 = 2
                    goto L_0x0108
                L_0x0106:
                    r17 = 0
                L_0x0108:
                    boolean r0 = r10.isDayOpen
                    long r3 = r10.dayOpenResetTime
                    r12 = r2
                    r18 = r0
                    r19 = r3
                    r12.<init>(r13, r14, r15, r17, r18, r19)
                    com.ss.android.ugc.aweme.freeflowcard.data.a r0 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r0.a((com.ss.android.ugc.aweme.freeflowcard.data.b.b) r2)
                L_0x011b:
                    com.ss.android.ugc.aweme.freeflowcard.data.a r0 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.b r0 = r0.c()
                    r9.a((com.ss.android.ugc.aweme.freeflowcard.data.b.b) r0)
                    boolean r2 = r0.isOpen
                    if (r2 == 0) goto L_0x012e
                    int r0 = r0.monthlyState
                    if (r0 == 0) goto L_0x0131
                L_0x012e:
                    r9.e()
                L_0x0131:
                    r9.f48557b = r11
                L_0x0133:
                    r0 = 0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freeflowcard.a.d.AnonymousClass1.call():java.lang.Object");
            }
        });
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f48555a, true, 46141, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f48555a, true, 46141, new Class[0], d.class);
        }
        if (f48556d == null) {
            synchronized (d.class) {
                if (f48556d == null) {
                    f48556d = new d();
                }
            }
        }
        return f48556d;
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f48555a, false, 46142, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48555a, false, 46142, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (m.a().c() && !m.a().b()) {
            z = true;
        }
        return z;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f48555a, false, 46143, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48555a, false, 46143, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.f48559e) {
            d();
            return true;
        } else if (!this.f48557b) {
            return true;
        } else {
            b c2 = a.a().c();
            if (com.ss.android.ugc.aweme.freeflowcard.b.a().i) {
                return true;
            }
            if (c2.isDayOpen) {
                f();
                return true;
            } else if (!c2.isOpen || c2.monthlyState == 1) {
                return false;
            } else {
                f();
                return true;
            }
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f48555a, false, 46150, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48555a, false, 46150, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.freeflowcard.b.a().n || !m.a().c() || m.a().b()) {
            return false;
        } else {
            if (a.a().d()) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.dqh).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bn2).a();
            }
            com.ss.android.ugc.aweme.freeflowcard.b.a().n = false;
            return true;
        }
    }

    public boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f48555a, false, 46148, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48555a, false, 46148, new Class[0], Boolean.TYPE)).booleanValue();
        }
        long[] b2 = com.ss.android.ugc.aweme.freeflowcard.a.b(new Date().getDate());
        if (b2.length != 2) {
            return false;
        }
        List<c> b3 = a.a().b(b2[0], b2[1]);
        if (b3 == null || b3.size() < 2) {
            b c2 = a.a().c();
            c2.isDayOpen = false;
            c2.dayOpenResetTime = 0;
            a.a().a(c2);
            return false;
        }
        Collections.sort(b3, new Comparator<c>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                if (((c) obj2).time > ((c) obj).time) {
                    return 1;
                }
                return -1;
            }
        });
        if (b3.get(0).clickType != 1 || b3.get(1).clickType != 1) {
            return false;
        }
        b c3 = a.a().c();
        c3.isDayOpen = true;
        c3.dayOpenResetTime = com.ss.android.ugc.aweme.freeflowcard.a.b(new Date().getDate())[1];
        a.a().a(c3);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f48555a, false, 46146, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f48555a, false, 46146, new Class[]{b.class}, Void.TYPE);
        } else if (bVar2.monthlyState != 2 || new Date().getDate() < this.f48558c) {
            if (bVar2.monthlyState == 1) {
                int i = this.f48558c;
                while (i < new Date().getDate()) {
                    long[] b2 = com.ss.android.ugc.aweme.freeflowcard.a.b(i);
                    if (b2.length == 2) {
                        List<c> b3 = a.a().b(b2[0], b2[1]);
                        if (b3 == null || b3.size() <= 0) {
                            i++;
                        } else if (a(i)) {
                            b bVar3 = new b(true, 0, com.ss.android.ugc.aweme.freeflowcard.a.c(), 0, bVar2.isDayOpen, bVar2.dayOpenResetTime);
                            a.a().a(bVar3);
                            return;
                        } else {
                            b bVar4 = new b(false, 0, 0, 0, bVar2.isDayOpen, bVar2.dayOpenResetTime);
                            a.a().a(bVar4);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            b bVar5 = new b(true, 0, com.ss.android.ugc.aweme.freeflowcard.a.c(), 1, bVar2.isDayOpen, bVar2.dayOpenResetTime);
            a.a().a(bVar5);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48555a, false, 46149, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48555a, false, 46149, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        long[] b2 = com.ss.android.ugc.aweme.freeflowcard.a.b(i);
        if (b2.length != 2) {
            return false;
        }
        List<c> b3 = a.a().b(b2[0], b2[1]);
        if (CollectionUtils.isEmpty(b3)) {
            return false;
        }
        int i2 = 0;
        for (c cVar : b3) {
            if (cVar.clickType == 1) {
                i2++;
            }
        }
        if ((((float) i2) * 1.0f) / ((float) b3.size()) >= 0.6f) {
            return true;
        }
        return false;
    }
}
