package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0014¢\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0014¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardModel;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "()V", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "sendRequest", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ae extends com.ss.android.ugc.aweme.common.a<ac> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59870a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/poi/model/PoiHalfCardInfoResponse;", "kotlin.jvm.PlatformType", "task", "Lbolts/Task;", "then"}, k = 3, mv = {1, 1, 15})
    static final class a<TTaskResult, TContinuationResult> implements g<ac, ac> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59871a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f59872b = new a();

        a() {
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f59871a, false, 65127, new Class[]{i.class}, ac.class)) {
                return (ac) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f59871a, false, 65127, new Class[]{i.class}, ac.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, "task");
            ac acVar = (ac) iVar.e();
            if (acVar != null) {
                ad adVar = acVar.f59863b;
                if (adVar != null) {
                    d dVar = adVar.l;
                    if (dVar != null) {
                        dVar.parseRawData();
                    }
                }
            }
            return acVar;
        }
    }

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
            com.meituan.robust.ChangeQuickRedirect r4 = f59870a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 65125(0xfe65, float:9.126E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59870a
            r13 = 0
            r14 = 65125(0xfe65, float:9.126E-41)
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
            if (r0 != r1) goto L_0x0046
            return r1
        L_0x0046:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.ae.checkParams(java.lang.Object[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean sendRequest(@org.jetbrains.annotations.NotNull java.lang.Object... r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59870a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 65126(0xfe66, float:9.1261E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59870a
            r3 = 0
            r4 = 65126(0xfe66, float:9.1261E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            int r0 = r8.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r8, r0)
            boolean r0 = super.sendRequest(r0)
            if (r0 != 0) goto L_0x0050
            return r10
        L_0x0050:
            r0 = r8[r10]
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = (java.lang.String) r0
            com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi r1 = com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi.f59719c
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi.f59717a
            r14 = 0
            r15 = 64924(0xfd9c, float:9.0978E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3
            java.lang.Class<a.i> r17 = a.i.class
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x008f
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi.f59717a
            r14 = 0
            r15 = 64924(0xfd9c, float:9.0978E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r10] = r2
            java.lang.Class<a.i> r17 = a.i.class
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            a.i r0 = (a.i) r0
            goto L_0x009a
        L_0x008f:
            java.lang.String r1 = "poiId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi$RealApi r1 = com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi.f59718b
            a.i r0 = r1.getPoiHalfCardResp(r0)
        L_0x009a:
            com.ss.android.ugc.aweme.poi.model.ae$a r1 = com.ss.android.ugc.aweme.poi.model.ae.a.f59872b
            a.g r1 = (a.g) r1
            java.util.concurrent.ExecutorService r2 = a.i.f1051a
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            a.i r0 = r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            com.ss.android.ugc.aweme.net.m r1 = new com.ss.android.ugc.aweme.net.m
            com.bytedance.common.utility.collection.WeakHandler r2 = r7.mHandler
            android.os.Handler r2 = (android.os.Handler) r2
            r1.<init>(r2, r10)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
            return r9
        L_0x00b7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.ae.sendRequest(java.lang.Object[]):boolean");
    }
}
