package com.ss.android.ugc.aweme.requestcombine.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/request/CombinedUserSettingsRequest;", "Lcom/ss/android/ugc/aweme/requestcombine/request/ColdLaunchRequest;", "()V", "mRequestName", "", "getMRequestName", "()Ljava/lang/String;", "responseModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "getResponseModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "setResponseModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;)V", "onFail", "", "transaction", "Lcom/ss/android/ugc/aweme/lego/Lego$RequestTransaction;", "onSuccess", "", "settingsModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63584b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private BaseCombineMode f63585c;

    @Nullable
    public final BaseCombineMode b() {
        return this.f63585c;
    }

    @Nullable
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f63584b, false, 70800, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63584b, false, 70800, new Class[0], String.class);
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (a2.isLogin()) {
            return "/aweme/v1/user/settings/";
        }
        return null;
    }

    public final void a(@NotNull a.d dVar) {
        a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f63584b, false, 70799, new Class[]{a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f63584b, false, 70799, new Class[]{a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "transaction");
        dVar2.a(new com.ss.android.ugc.aweme.requesttask.a.d(1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d6 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f63584b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel> r3 = com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 70798(0x1148e, float:9.9209E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f63584b
            r13 = 0
            r14 = 70798(0x1148e, float:9.9209E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel> r0 = com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            r2 = 0
            if (r18 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r0 = r18.getData()
            if (r0 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r0 = r0.getUserSettingCombineModel()
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            if (r0 == 0) goto L_0x00cd
            int r3 = r0.getHttpCode()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x00cd
            r3 = r0
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r3 = (com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r3
            r4 = r17
            r4.f63585c = r3
            com.ss.android.ugc.aweme.requestcombine.c$a r3 = com.ss.android.ugc.aweme.requestcombine.c.f63589a
            com.ss.android.ugc.aweme.setting.serverpush.a.c r0 = r0.getUserSetting()
            r5 = 2
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r10[r9] = r6
            r10[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.requestcombine.c.a.f63590a
            r13 = 0
            r14 = 70720(0x11440, float:9.91E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r15[r9] = r6
            java.lang.Class<com.ss.android.ugc.aweme.setting.serverpush.a.c> r6 = com.ss.android.ugc.aweme.setting.serverpush.a.c.class
            r15[r1] = r6
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x00a6
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r10[r9] = r2
            r10[r1] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.requestcombine.c.a.f63590a
            r13 = 0
            r14 = 70720(0x11440, float:9.91E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.setting.serverpush.a.c> r0 = com.ss.android.ugc.aweme.setting.serverpush.a.c.class
            r15[r1] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00cf
        L_0x00a6:
            java.lang.String r5 = "pushSettings"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r5)
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            boolean r5 = r5.isLogin()
            if (r5 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager r2 = com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f2599b
            com.ss.android.ugc.aweme.requestcombine.c$a$a r3 = new com.ss.android.ugc.aweme.requestcombine.c$a$a
            r3.<init>(r1)
            com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager$a r3 = (com.ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.a) r3
            r2.a(r3, r0)
            goto L_0x00cf
        L_0x00c7:
            com.ss.android.ugc.aweme.requestcombine.c$a r3 = (com.ss.android.ugc.aweme.requestcombine.c.a) r3
            r3.a(r1, r2)
            goto L_0x00cf
        L_0x00cd:
            r4 = r17
        L_0x00cf:
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r0 = r17.b()
            if (r0 == 0) goto L_0x00d6
            return r1
        L_0x00d6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requestcombine.a.i.a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
