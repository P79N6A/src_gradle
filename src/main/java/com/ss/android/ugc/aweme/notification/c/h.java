package com.ss.android.ugc.aweme.notification.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.session.a;
import com.ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public abstract class h extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f58053d;

    public int i() {
        return -1;
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f58053d, false, 63208, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58053d, false, 63208, new Class[0], Void.TYPE);
            return;
        }
        int i = i();
        if (i == 16 || i == 47) {
            b.a().markSessionInMsgHelperRead(i(), this.m);
        }
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f58053d, false, 63209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58053d, false, 63209, new Class[0], Void.TYPE);
            return;
        }
        NoticeApiManager.a(Integer.valueOf(i())).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe((Observer<? super T>) new Observer<Notice>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58054a;

            public final void onComplete() {
            }

            public final void onError(Throwable th) {
            }

            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b7, code lost:
                if ((!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4.getCurUserId())) != false) goto L_0x00b9;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onSubscribe(io.reactivex.disposables.Disposable r18) {
                /*
                    r17 = this;
                    r7 = r17
                    r8 = 1
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r9 = 0
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f58054a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<io.reactivex.disposables.Disposable> r1 = io.reactivex.disposables.Disposable.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 63210(0xf6ea, float:8.8576E-41)
                    r1 = r17
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x0036
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    r0[r9] = r18
                    com.meituan.robust.ChangeQuickRedirect r2 = f58054a
                    r3 = 0
                    r4 = 63210(0xf6ea, float:8.8576E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<io.reactivex.disposables.Disposable> r1 = io.reactivex.disposables.Disposable.class
                    r5[r9] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x0036:
                    com.ss.android.ugc.aweme.notification.c.h r0 = com.ss.android.ugc.aweme.notification.c.h.this
                    int r0 = r0.i()
                    com.ss.android.ugc.aweme.notification.c.h r1 = com.ss.android.ugc.aweme.notification.c.h.this
                    long r1 = r1.l
                    r3 = 1000(0x3e8, double:4.94E-321)
                    long r1 = r1 / r3
                    r3 = 2
                    java.lang.Object[] r10 = new java.lang.Object[r3]
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
                    r10[r9] = r4
                    java.lang.Long r4 = new java.lang.Long
                    r4.<init>(r1)
                    r10[r8] = r4
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.notification.d.a.f58087a
                    r13 = 1
                    r14 = 62822(0xf566, float:8.8032E-41)
                    java.lang.Class[] r4 = new java.lang.Class[r3]
                    java.lang.Class r5 = java.lang.Integer.TYPE
                    r4[r9] = r5
                    java.lang.Class r5 = java.lang.Long.TYPE
                    r4[r8] = r5
                    java.lang.Class r16 = java.lang.Void.TYPE
                    r15 = r4
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                    if (r4 == 0) goto L_0x0094
                    java.lang.Object[] r10 = new java.lang.Object[r3]
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r10[r9] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r1)
                    r10[r8] = r0
                    r11 = 0
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.notification.d.a.f58087a
                    r13 = 1
                    r14 = 62822(0xf566, float:8.8032E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r0[r9] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r0[r8] = r1
                    java.lang.Class r16 = java.lang.Void.TYPE
                    r15 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                    goto L_0x0100
                L_0x0094:
                    java.util.Map<java.lang.Integer, java.lang.Long> r3 = com.ss.android.ugc.aweme.notification.d.a.f58091e
                    if (r3 == 0) goto L_0x00b9
                    java.lang.String r3 = com.ss.android.ugc.aweme.notification.d.a.f58088b
                    if (r3 == 0) goto L_0x00b9
                    java.lang.String r3 = com.ss.android.ugc.aweme.notification.d.a.f58088b
                    if (r3 != 0) goto L_0x00a5
                    java.lang.String r4 = "mUserId"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                L_0x00a5:
                    com.ss.android.ugc.aweme.IAccountUserService r4 = com.ss.android.ugc.aweme.account.d.a()
                    java.lang.String r5 = "AccountUserProxyService.get()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                    java.lang.String r4 = r4.getCurUserId()
                    boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
                    r3 = r3 ^ r8
                    if (r3 == 0) goto L_0x00d2
                L_0x00b9:
                    com.ss.android.ugc.aweme.IAccountUserService r3 = com.ss.android.ugc.aweme.account.d.a()
                    java.lang.String r4 = "AccountUserProxyService.get()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                    java.lang.String r3 = r3.getCurUserId()
                    java.lang.String r4 = "AccountUserProxyService.get().curUserId"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
                    com.ss.android.ugc.aweme.notification.d.a.f58088b = r3
                    com.ss.android.ugc.aweme.notification.d$a r3 = com.ss.android.ugc.aweme.notification.d.a.f58092f
                    r3.b()
                L_0x00d2:
                    java.util.Map<java.lang.Integer, java.lang.Long> r3 = com.ss.android.ugc.aweme.notification.d.a.f58091e
                    if (r3 != 0) goto L_0x00db
                    java.lang.String r4 = "mCurrentNoticeMap"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
                L_0x00db:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    java.lang.Long r1 = java.lang.Long.valueOf(r1)
                    r3.put(r0, r1)
                    com.ss.android.ugc.aweme.notification.d$a r0 = com.ss.android.ugc.aweme.notification.d.a.f58092f
                    com.ss.android.ugc.aweme.app.an r0 = r0.a()
                    com.google.gson.Gson r1 = com.ss.android.ugc.aweme.notification.d.a.f58089c
                    java.util.Map<java.lang.Integer, java.lang.Long> r2 = com.ss.android.ugc.aweme.notification.d.a.f58091e
                    if (r2 != 0) goto L_0x00f7
                    java.lang.String r3 = "mCurrentNoticeMap"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                L_0x00f7:
                    java.lang.reflect.Type r3 = com.ss.android.ugc.aweme.notification.d.a.f58090d
                    java.lang.String r1 = r1.toJson((java.lang.Object) r2, (java.lang.reflect.Type) r3)
                    r0.a(r1)
                L_0x0100:
                    com.ss.android.ugc.aweme.im.service.IIMService r0 = com.ss.android.ugc.aweme.im.b.a()
                    com.ss.android.ugc.aweme.notification.c.h r1 = com.ss.android.ugc.aweme.notification.c.h.this
                    r0.deleteNoticeSession(r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.c.h.AnonymousClass1.onSubscribe(io.reactivex.disposables.Disposable):void");
            }
        });
    }
}
