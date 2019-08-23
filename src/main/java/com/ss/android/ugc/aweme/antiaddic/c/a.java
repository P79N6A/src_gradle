package com.ss.android.ugc.aweme.antiaddic.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/unlogin/AntiAddictionTipTimeTicker;", "Lcom/ss/android/ugc/aweme/antiaddic/AbsContinuousTimeListener;", "()V", "isShowAntiAddictionTime", "", "()Z", "isShowAntiAddictionTipActivity", "isNewDay", "resetHasShownAntiAddictionTipToday", "", "startAntiAddictionTipActivity", "tryToPerform", "lastPauseTime", "", "continuousDuration", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.antiaddic.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33377a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final C0426a f33378b = new C0426a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final int f33379c = f33379c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f33380d = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/unlogin/AntiAddictionTipTimeTicker$Companion;", "", "()V", "END_SHOW_ANTI_ADDICTION_HOUR", "", "START_SHOW_ANTI_ADDICTION_HOUR", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.antiaddic.c.a$a  reason: collision with other inner class name */
    public static final class C0426a {
        private C0426a() {
        }

        public /* synthetic */ C0426a(byte b2) {
            this();
        }
    }

    private final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f33377a, false, 22094, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33377a, false, 22094, new Class[0], Boolean.TYPE)).booleanValue();
        }
        int i = Calendar.getInstance().get(11);
        if (i >= f33379c || i < f33380d) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x028d, code lost:
        if (r13 != false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0088, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x008a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(long r22, long r24) {
        /*
            r21 = this;
            r0 = r22
            r2 = r24
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r0)
            r12 = 0
            r5[r12] = r6
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r2)
            r13 = 1
            r5[r13] = r6
            com.meituan.robust.ChangeQuickRedirect r7 = f33377a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class r6 = java.lang.Long.TYPE
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Long.TYPE
            r10[r13] = r6
            java.lang.Class r11 = java.lang.Boolean.TYPE
            r8 = 0
            r9 = 22096(0x5650, float:3.0963E-41)
            r6 = r21
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0061
            java.lang.Object[] r14 = new java.lang.Object[r4]
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r0)
            r14[r12] = r5
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r2)
            r14[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = f33377a
            r17 = 0
            r18 = 22096(0x5650, float:3.0963E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r15 = r21
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0061:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isSelfContentFilterOn()
            if (r0 != 0) goto L_0x008a
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.app.an r0 = r0.l()
            java.lang.String r1 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object r0 = r0.c()
            java.lang.String r1 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02a6
        L_0x008a:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22095(0x564f, float:3.0962E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x00b5
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22095(0x564f, float:3.0962E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00e0
        L_0x00b5:
            android.content.Context r0 = com.ss.android.ugc.aweme.base.utils.d.a()
            boolean r0 = com.ss.android.common.util.ToolUtils.isMainProcess(r0)
            if (r0 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.app.AwemeAppData r0 = com.ss.android.ugc.aweme.app.AwemeAppData.p()
            java.lang.String r1 = "AwemeAppData.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.q()
            if (r0 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r1 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x00df
            r0 = 1
            goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            if (r0 == 0) goto L_0x01cc
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22097(0x5651, float:3.0964E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0107
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22097(0x5651, float:3.0964E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01cc
        L_0x0107:
            com.ss.android.ugc.aweme.app.p r0 = com.ss.android.ugc.aweme.app.p.a()
            java.lang.String r1 = "AwemeRuntime.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.app.Activity r0 = r0.e()
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity
            if (r1 != 0) goto L_0x01be
            if (r0 == 0) goto L_0x01cc
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L_0x01cc
            boolean r1 = r21.a()
            if (r1 == 0) goto L_0x01cc
            com.ss.android.ugc.aweme.app.x r1 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.app.an r1 = r1.aj()
            java.lang.String r2 = "CommonSharePrefCache.ins…hownAntiAddictionTipToday"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01cc
            r1 = 0
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.l()
            java.lang.String r3 = "CommonSharePrefCache.inst().isForceMinor"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "CommonSharePrefCache.inst().isForceMinor.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0178
            android.content.Intent r1 = new android.content.Intent
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity> r3 = com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity.class
            r1.<init>(r2, r3)
            java.lang.String r2 = "type"
            r1.putExtra(r2, r13)
            goto L_0x0188
        L_0x0178:
            boolean r2 = com.ss.android.ugc.aweme.antiaddic.lock.d.c()
            if (r2 != 0) goto L_0x0188
            android.content.Intent r1 = new android.content.Intent
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity> r3 = com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity.class
            r1.<init>(r2, r3)
        L_0x0188:
            if (r1 == 0) goto L_0x01cc
            r0.startActivity(r1)
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.app.an r0 = r0.ak()
            java.lang.String r1 = "CommonSharePrefCache.ins…lastShowAntiAddictionTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.a(r1)
            java.lang.String r0 = "time_lock_block_show"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "night_block"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            goto L_0x01cc
        L_0x01be:
            boolean r0 = r21.a()
            if (r0 != 0) goto L_0x01cc
            com.ss.android.ugc.aweme.antiaddic.b.a r0 = new com.ss.android.ugc.aweme.antiaddic.b.a
            r0.<init>()
            com.ss.android.ugc.aweme.utils.bg.a(r0)
        L_0x01cc:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22098(0x5652, float:3.0966E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x01f1
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22098(0x5652, float:3.0966E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02a6
        L_0x01f1:
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            int r1 = r0.get(r1)
            r2 = 13
            int r0 = r0.get(r2)
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.aj()
            java.lang.String r3 = "CommonSharePrefCache.ins…hownAntiAddictionTipToday"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "CommonSharePrefCache.ins…tiAddictionTipToday.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x02a6
            int r2 = f33380d
            if (r1 <= r2) goto L_0x022c
            int r2 = f33379c
            if (r1 < r2) goto L_0x028f
        L_0x022c:
            int r2 = f33380d
            if (r1 != r2) goto L_0x0232
            if (r0 > 0) goto L_0x028f
        L_0x0232:
            java.lang.Object[] r3 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r5 = f33377a
            r6 = 0
            r7 = 22099(0x5653, float:3.0967E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x025e
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r3 = f33377a
            r4 = 0
            r5 = 22099(0x5653, float:3.0967E-41)
            java.lang.Class[] r6 = new java.lang.Class[r12]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r13 = r0
            goto L_0x028d
        L_0x025e:
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.app.an r2 = r2.ak()
            java.lang.String r3 = "CommonSharePrefCache.ins…lastShowAntiAddictionTime"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Object r2 = r2.c()
            java.lang.String r3 = "CommonSharePrefCache.ins…owAntiAddictionTime.cache"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            long r0 = r0 - r2
            r2 = 57600000(0x36ee800, double:2.8458181E-316)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x028c
            goto L_0x028d
        L_0x028c:
            r13 = 0
        L_0x028d:
            if (r13 == 0) goto L_0x02a6
        L_0x028f:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.app.an r0 = r0.aj()
            java.lang.String r1 = "CommonSharePrefCache.ins…hownAntiAddictionTipToday"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.a(r1)
        L_0x02a6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.antiaddic.c.a.a(long, long):boolean");
    }
}
