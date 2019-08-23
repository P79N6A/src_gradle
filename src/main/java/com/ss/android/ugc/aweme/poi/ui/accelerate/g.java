package com.ss.android.ugc.aweme.poi.ui.accelerate;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiFeedApi;
import com.ss.android.ugc.aweme.poi.b;
import com.ss.android.ugc.aweme.poi.model.s;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f\"\u0004\u0018\u00010\rH\u0014¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0014¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/accelerate/PoiBannerModel;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/poi/model/PoiCommonBannerResponse;", "()V", "sApi", "Lcom/ss/android/ugc/aweme/poi/api/PoiFeedApi;", "kotlin.jvm.PlatformType", "getSApi$main_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/poi/api/PoiFeedApi;", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "sendRequest", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends a<s> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60528a;

    /* renamed from: b  reason: collision with root package name */
    public final PoiFeedApi f60529b = ((PoiFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFeedApi.class));

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean checkParams(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f60528a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 66226(0x102b2, float:9.2802E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f60528a
            r13 = 0
            r14 = 66226(0x102b2, float:9.2802E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            int r0 = r0.length
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x004c
            return r1
        L_0x004c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.accelerate.g.checkParams(java.lang.Object[]):boolean");
    }

    public final boolean sendRequest(@NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f60528a, false, 66227, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f60528a, false, 66227, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(objArr, "params");
        b bVar = objArr[0];
        if (bVar != null) {
            b bVar2 = bVar;
            this.f60529b.getPoiCommonBanner(bVar2.i, 53, bVar2.f59732a).a((a.g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.PoiParams");
    }
}
