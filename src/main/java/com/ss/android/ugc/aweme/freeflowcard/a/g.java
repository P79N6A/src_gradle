package com.ss.android.ugc.aweme.freeflowcard.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.freeflowcard.data.a;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import java.util.concurrent.Callable;

public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48565a = null;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f48566b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile g f48567c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48568d;

    public boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f48565a, false, 46161, new Class[0], Boolean.TYPE)) {
            return m.a().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48565a, false, 46161, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48565a, false, 46163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48565a, false, 46163, new Class[0], Void.TYPE);
            return;
        }
        f48566b = true;
        i.a((Callable<TResult>) new Callable<Boolean>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48571a;

            /* JADX WARNING: Code restructure failed: missing block: B:36:0x0152, code lost:
                if (r2.size() == 1) goto L_0x024e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:74:0x024a, code lost:
                if (r2.size() == 1) goto L_0x024e;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Object call() throws java.lang.Exception {
                /*
                    r20 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f48571a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
                    r4 = 0
                    r5 = 46167(0xb457, float:6.4694E-41)
                    r2 = r20
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x002a
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f48571a
                    r5 = 0
                    r6 = 46167(0xb457, float:6.4694E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
                    r3 = r20
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    return r0
                L_0x002a:
                    r1 = r20
                    com.ss.android.ugc.aweme.freeflowcard.a.g r9 = com.ss.android.ugc.aweme.freeflowcard.a.g.this
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.g.f48565a
                    r5 = 0
                    r6 = 46164(0xb454, float:6.469E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    r10 = 1
                    if (r2 == 0) goto L_0x005b
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.g.f48565a
                    r5 = 0
                    r6 = 46164(0xb454, float:6.469E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Boolean.TYPE
                    r3 = r9
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    goto L_0x024e
                L_0x005b:
                    long[] r2 = com.ss.android.ugc.aweme.freeflowcard.a.b()
                    int r3 = r2.length
                    r11 = 2
                    if (r3 != r11) goto L_0x024d
                    com.ss.android.ugc.aweme.freeflowcard.data.a r3 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r4 = r2[r0]
                    r6 = r2[r10]
                    java.util.List r2 = r3.a((long) r4, (long) r6)
                    if (r2 == 0) goto L_0x024d
                    int r3 = r2.size()
                    r4 = 20
                    if (r3 >= r4) goto L_0x007b
                    goto L_0x024d
                L_0x007b:
                    java.util.Iterator r3 = r2.iterator()
                    r4 = 0
                L_0x0080:
                    boolean r5 = r3.hasNext()
                    if (r5 == 0) goto L_0x0093
                    java.lang.Object r5 = r3.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r5 = (com.ss.android.ugc.aweme.freeflowcard.data.b.a) r5
                    int r5 = r5.mode
                    if (r5 != r10) goto L_0x0080
                    int r4 = r4 + 1
                    goto L_0x0080
                L_0x0093:
                    float r3 = (float) r4
                    r4 = 1065353216(0x3f800000, float:1.0)
                    float r3 = r3 * r4
                    int r2 = r2.size()
                    float r2 = (float) r2
                    float r3 = r3 / r2
                    r2 = 1031127695(0x3d75c28f, float:0.06)
                    r12 = 25
                    int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                    if (r2 >= 0) goto L_0x0156
                    java.lang.Object[] r13 = new java.lang.Object[r0]
                    r14 = 0
                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.freeflowcard.a.f48547a
                    r16 = 1
                    r17 = 46011(0xb3bb, float:6.4475E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r0]
                    java.lang.Class<long[]> r19 = long[].class
                    r18 = r2
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                    if (r2 == 0) goto L_0x00d4
                    java.lang.Object[] r13 = new java.lang.Object[r0]
                    r14 = 0
                    com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.freeflowcard.a.f48547a
                    r16 = 1
                    r17 = 46011(0xb3bb, float:6.4475E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r0]
                    java.lang.Class<long[]> r19 = long[].class
                    r18 = r2
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                    long[] r2 = (long[]) r2
                    goto L_0x011c
                L_0x00d4:
                    long[] r2 = new long[r11]
                    java.util.Calendar r3 = java.util.Calendar.getInstance()
                    java.util.Date r5 = new java.util.Date
                    r5.<init>()
                    r3.setTime(r5)
                    r5 = 5
                    r3.set(r5, r10)
                    r6 = 11
                    r3.set(r6, r0)
                    r7 = 12
                    r3.set(r7, r0)
                    r8 = 13
                    r3.set(r8, r0)
                    long r13 = r3.getTimeInMillis()
                    r2[r0] = r13
                    java.util.Date r13 = new java.util.Date
                    r13.<init>()
                    r3.setTime(r13)
                    r3.add(r11, r10)
                    r3.set(r5, r10)
                    r3.set(r6, r0)
                    r3.set(r7, r0)
                    r3.set(r8, r0)
                    r5 = -1
                    r3.add(r8, r5)
                    long r5 = r3.getTimeInMillis()
                    r2[r10] = r5
                L_0x011c:
                    int r3 = r2.length
                    if (r3 != r11) goto L_0x024d
                    com.ss.android.ugc.aweme.freeflowcard.data.a r13 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r14 = r2[r0]
                    r16 = r2[r10]
                    r18 = 0
                    java.util.List r2 = r13.a(r14, r16, r18)
                    if (r2 == 0) goto L_0x0137
                    int r2 = r2.size()
                    if (r2 != r10) goto L_0x0137
                    goto L_0x024e
                L_0x0137:
                    long[] r2 = com.ss.android.ugc.aweme.freeflowcard.a.a(r12)
                    int r3 = r2.length
                    if (r3 != r11) goto L_0x024d
                    com.ss.android.ugc.aweme.freeflowcard.data.a r13 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r14 = r2[r0]
                    r16 = r2[r10]
                    r18 = 0
                    java.util.List r2 = r13.a(r14, r16, r18)
                    if (r2 == 0) goto L_0x0156
                    int r2 = r2.size()
                    if (r2 != r10) goto L_0x0156
                    goto L_0x024e
                L_0x0156:
                    com.ss.android.ugc.aweme.freeflowcard.data.a r2 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r3 = 7
                    long[] r5 = com.ss.android.ugc.aweme.freeflowcard.a.a(r10, r3)
                    r6 = r5[r0]
                    long[] r3 = com.ss.android.ugc.aweme.freeflowcard.a.a(r10, r3)
                    r13 = r3[r10]
                    java.util.List r2 = r2.a((long) r6, (long) r13)
                    com.ss.android.ugc.aweme.freeflowcard.data.a r3 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r5 = 19
                    long[] r6 = com.ss.android.ugc.aweme.freeflowcard.a.a(r5, r12)
                    r7 = r6[r0]
                    long[] r5 = com.ss.android.ugc.aweme.freeflowcard.a.a(r5, r12)
                    r13 = r5[r10]
                    java.util.List r3 = r3.a((long) r7, (long) r13)
                    if (r2 == 0) goto L_0x024d
                    int r5 = r2.size()
                    if (r5 <= 0) goto L_0x024d
                    if (r3 == 0) goto L_0x024d
                    int r5 = r3.size()
                    if (r5 <= 0) goto L_0x024d
                    java.util.Iterator r5 = r2.iterator()
                    r6 = 0
                L_0x0196:
                    boolean r7 = r5.hasNext()
                    if (r7 == 0) goto L_0x01a9
                    java.lang.Object r7 = r5.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r7 = (com.ss.android.ugc.aweme.freeflowcard.data.b.a) r7
                    int r7 = r7.mode
                    if (r7 != r10) goto L_0x0196
                    int r6 = r6 + 1
                    goto L_0x0196
                L_0x01a9:
                    java.util.Iterator r5 = r3.iterator()
                    r7 = 0
                L_0x01ae:
                    boolean r8 = r5.hasNext()
                    if (r8 == 0) goto L_0x01c1
                    java.lang.Object r8 = r5.next()
                    com.ss.android.ugc.aweme.freeflowcard.data.b.a r8 = (com.ss.android.ugc.aweme.freeflowcard.data.b.a) r8
                    int r8 = r8.mode
                    if (r8 != r10) goto L_0x01ae
                    int r7 = r7 + 1
                    goto L_0x01ae
                L_0x01c1:
                    float r5 = (float) r6
                    float r5 = r5 * r4
                    int r2 = r2.size()
                    float r2 = (float) r2
                    float r5 = r5 / r2
                    float r2 = (float) r7
                    float r2 = r2 * r4
                    int r3 = r3.size()
                    float r3 = (float) r3
                    float r2 = r2 / r3
                    float r13 = r5 - r2
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.g.f48565a
                    r5 = 0
                    r6 = 46165(0xb455, float:6.4691E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Float.TYPE
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                    if (r2 == 0) goto L_0x0200
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.freeflowcard.a.g.f48565a
                    r5 = 0
                    r6 = 46165(0xb455, float:6.4691E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Float.TYPE
                    r3 = r9
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    java.lang.Float r2 = (java.lang.Float) r2
                    float r2 = r2.floatValue()
                    goto L_0x022c
                L_0x0200:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "getRatioDValue : "
                    r2.<init>(r3)
                    com.ss.android.ugc.aweme.setting.AbTestManager r3 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r3.d()
                    int r3 = r3.newFlowStrategy
                    if (r3 != r10) goto L_0x0215
                    r3 = 1
                    goto L_0x0216
                L_0x0215:
                    r3 = 0
                L_0x0216:
                    r2.append(r3)
                    com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    com.ss.android.ugc.aweme.setting.model.AbTestModel r2 = r2.d()
                    int r2 = r2.newFlowStrategy
                    if (r2 != r10) goto L_0x0229
                    r2 = 1045220557(0x3e4ccccd, float:0.2)
                    goto L_0x022c
                L_0x0229:
                    r2 = 1036831949(0x3dcccccd, float:0.1)
                L_0x022c:
                    int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                    if (r2 <= 0) goto L_0x024d
                    long[] r2 = com.ss.android.ugc.aweme.freeflowcard.a.a(r12)
                    int r3 = r2.length
                    if (r3 != r11) goto L_0x024d
                    com.ss.android.ugc.aweme.freeflowcard.data.a r4 = com.ss.android.ugc.aweme.freeflowcard.data.a.a()
                    r5 = r2[r0]
                    r7 = r2[r10]
                    r9 = 0
                    java.util.List r2 = r4.a(r5, r7, r9)
                    if (r2 == 0) goto L_0x024d
                    int r2 = r2.size()
                    if (r2 != r10) goto L_0x024d
                    goto L_0x024e
                L_0x024d:
                    r0 = 1
                L_0x024e:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.freeflowcard.a.g.AnonymousClass2.call():java.lang.Object");
            }
        }).a((a.g<TResult, TContinuationResult>) new a.g<Boolean, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48569a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f48569a, false, 46166, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f48569a, false, 46166, new Class[]{i.class}, Void.class);
                }
                g.f48566b = ((Boolean) iVar.e()).booleanValue();
                return null;
            }
        });
    }

    public static g a() {
        if (PatchProxy.isSupport(new Object[0], null, f48565a, true, 46160, new Class[0], g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[0], null, f48565a, true, 46160, new Class[0], g.class);
        }
        if (f48567c == null) {
            synchronized (g.class) {
                if (f48567c == null) {
                    f48567c = new g();
                }
            }
        }
        return f48567c;
    }

    public boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f48565a, false, 46162, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48565a, false, 46162, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (AbTestManager.a().d().enableWifiToast == 0 || a.a().d()) {
            return true;
        } else {
            if (f48566b) {
                return f48566b;
            }
            if (this.f48568d) {
                return true;
            }
            this.f48568d = true;
            return false;
        }
    }
}
