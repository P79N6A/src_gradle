package com.ss.android.ugc.aweme.requestcombine.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/requestcombine/request/CombinedAbTestRequest;", "Lcom/ss/android/ugc/aweme/requestcombine/request/ColdLaunchRequest;", "()V", "mRequestName", "", "getMRequestName", "()Ljava/lang/String;", "responseModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "getResponseModel", "()Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;", "setResponseModel", "(Lcom/ss/android/ugc/aweme/requestcombine/model/BaseCombineMode;)V", "onFail", "", "transaction", "Lcom/ss/android/ugc/aweme/lego/Lego$RequestTransaction;", "onSuccess", "", "settingsModel", "Lcom/ss/android/ugc/aweme/requestcombine/model/SettingCombineModel;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f63570b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private BaseCombineMode f63571c;

    @Nullable
    public final String a() {
        return "/aweme/v1/abtest/param/";
    }

    @Nullable
    public final BaseCombineMode b() {
        return this.f63571c;
    }

    public final void a(@NotNull a.d dVar) {
        a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f63570b, false, 70780, new Class[]{a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f63570b, false, 70780, new Class[]{a.d.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(dVar2, "transaction");
        dVar2.a(new com.ss.android.ugc.aweme.requesttask.b.b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0075 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f63570b
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel> r3 = com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 70779(0x1147b, float:9.9183E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f63570b
            r13 = 0
            r14 = 70779(0x1147b, float:9.9183E-41)
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
            if (r18 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r0 = r18.getData()
            if (r0 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r0 = r0.getAbTestCombineModel()
            goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            if (r0 == 0) goto L_0x006c
            int r2 = r0.getHttpCode()
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x006c
            r2 = r0
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r2 = (com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r2
            r3 = r17
            r3.f63571c = r2
            java.lang.String r2 = com.ss.android.common.applog.AppLog.getServerDeviceId()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            com.google.gson.JsonElement r0 = r0.getAbTestResponse()
            com.ss.android.ugc.aweme.setting.api.AbTestApi.a(r2, r0)
            goto L_0x006e
        L_0x006c:
            r3 = r17
        L_0x006e:
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r0 = r17.b()
            if (r0 == 0) goto L_0x0075
            return r1
        L_0x0075:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.requestcombine.a.b.a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}