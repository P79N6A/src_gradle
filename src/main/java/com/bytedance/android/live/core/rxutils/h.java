package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;

public class h implements Function<Observable<Throwable>, ObservableSource<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8100a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8101b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8102c;

    /* renamed from: d  reason: collision with root package name */
    public int f8103d;

    public /* synthetic */ Object apply(Object obj) throws Exception {
        Observable observable = (Observable) obj;
        if (!PatchProxy.isSupport(new Object[]{observable}, this, f8100a, false, 626, new Class[]{Observable.class}, ObservableSource.class)) {
            return observable.flatMap(new Function<Throwable, ObservableSource<?>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8104a;

                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
                    if (r0 == false) goto L_0x0092;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ java.lang.Object apply(java.lang.Object r19) throws java.lang.Exception {
                    /*
                        r18 = this;
                        r7 = r18
                        r8 = r19
                        java.lang.Throwable r8 = (java.lang.Throwable) r8
                        r9 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r10 = 0
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f8104a
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
                        r5[r10] = r1
                        java.lang.Class<io.reactivex.ObservableSource> r6 = io.reactivex.ObservableSource.class
                        r3 = 0
                        r4 = 628(0x274, float:8.8E-43)
                        r1 = r18
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x003b
                        java.lang.Object[] r0 = new java.lang.Object[r9]
                        r0[r10] = r8
                        com.meituan.robust.ChangeQuickRedirect r2 = f8104a
                        r3 = 0
                        r4 = 628(0x274, float:8.8E-43)
                        java.lang.Class[] r5 = new java.lang.Class[r9]
                        java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
                        r5[r10] = r1
                        java.lang.Class<io.reactivex.ObservableSource> r6 = io.reactivex.ObservableSource.class
                        r1 = r18
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        io.reactivex.ObservableSource r0 = (io.reactivex.ObservableSource) r0
                        return r0
                    L_0x003b:
                        boolean r0 = r8 instanceof com.bytedance.android.live.base.model.d.a
                        if (r0 == 0) goto L_0x0092
                        com.bytedance.android.live.core.rxutils.h r0 = com.bytedance.android.live.core.rxutils.h.this
                        r1 = r8
                        com.bytedance.android.live.base.model.d.a r1 = (com.bytedance.android.live.base.model.d.a) r1
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.core.rxutils.h.f8100a
                        r14 = 0
                        r15 = 627(0x273, float:8.79E-43)
                        java.lang.Class[] r2 = new java.lang.Class[r9]
                        java.lang.Class<com.bytedance.android.live.base.model.d.a> r3 = com.bytedance.android.live.base.model.d.a.class
                        r2[r10] = r3
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r2
                        boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                        if (r2 == 0) goto L_0x007d
                        java.lang.Object[] r11 = new java.lang.Object[r9]
                        r11[r10] = r1
                        com.meituan.robust.ChangeQuickRedirect r13 = com.bytedance.android.live.core.rxutils.h.f8100a
                        r14 = 0
                        r15 = 627(0x273, float:8.79E-43)
                        java.lang.Class[] r1 = new java.lang.Class[r9]
                        java.lang.Class<com.bytedance.android.live.base.model.d.a> r2 = com.bytedance.android.live.base.model.d.a.class
                        r1[r10] = r2
                        java.lang.Class r17 = java.lang.Boolean.TYPE
                        r12 = r0
                        r16 = r1
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                        java.lang.Boolean r0 = (java.lang.Boolean) r0
                        boolean r0 = r0.booleanValue()
                        goto L_0x0090
                    L_0x007d:
                        int r0 = r1.getStatusCode()
                        r2 = 500(0x1f4, float:7.0E-43)
                        if (r0 < r2) goto L_0x008f
                        int r0 = r1.getStatusCode()
                        r1 = 599(0x257, float:8.4E-43)
                        if (r0 > r1) goto L_0x008f
                        r0 = 1
                        goto L_0x0090
                    L_0x008f:
                        r0 = 0
                    L_0x0090:
                        if (r0 != 0) goto L_0x00aa
                    L_0x0092:
                        com.bytedance.android.live.core.rxutils.h r0 = com.bytedance.android.live.core.rxutils.h.this
                        int r1 = r0.f8103d
                        int r1 = r1 + r9
                        r0.f8103d = r1
                        com.bytedance.android.live.core.rxutils.h r0 = com.bytedance.android.live.core.rxutils.h.this
                        int r0 = r0.f8101b
                        if (r1 > r0) goto L_0x00aa
                        com.bytedance.android.live.core.rxutils.h r0 = com.bytedance.android.live.core.rxutils.h.this
                        long r0 = r0.f8102c
                        java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
                        io.reactivex.Observable r0 = io.reactivex.Observable.timer(r0, r2)
                        return r0
                    L_0x00aa:
                        io.reactivex.Observable r0 = io.reactivex.Observable.error((java.lang.Throwable) r8)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.h.AnonymousClass1.apply(java.lang.Object):java.lang.Object");
                }
            });
        }
        return (ObservableSource) PatchProxy.accessDispatch(new Object[]{observable}, this, f8100a, false, 626, new Class[]{Observable.class}, ObservableSource.class);
    }

    public h(int i, long j) {
        this.f8101b = i <= 0 ? 1 : i;
        this.f8102c = j <= 0 ? 500 : j;
    }
}
