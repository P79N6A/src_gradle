package com.ss.android.ugc.aweme.poi.model;

import a.g;
import a.i;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.poi.api.PoiHalfCardApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\b\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0017\u001a\u00020\bH\u0016J%\u0010\u0018\u001a\u00020\u000e2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0002\u0010\u0019J%\u0010\u001a\u001a\u00020\u000e2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "Lcom/ss/android/ugc/aweme/feed/model/poi/SimplePoiInfoStruct;", "Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeResponse;", "()V", "mCursor", "", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "fetchPoiCouponScopeResp", "", "couponId", "", "codeId", "", "getItems", "", "handleData", "data", "isHasMore", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class v extends com.ss.android.ugc.aweme.common.f.a<SimplePoiInfoStruct, w> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59945a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f59946b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private long f59947c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiCouponScopeModel$Companion;", "", "()V", "COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Nullable
    public final List<SimplePoiInfoStruct> getItems() {
        w wVar = (w) this.mData;
        if (wVar != null) {
            return wVar.f59949b;
        }
        return null;
    }

    public final boolean isHasMore() {
        w wVar = (w) this.mData;
        if (wVar != null) {
            return wVar.f59951d;
        }
        return false;
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
            com.meituan.robust.ChangeQuickRedirect r4 = f59945a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 65042(0xfe12, float:9.1143E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59945a
            r13 = 0
            r14 = 65042(0xfe12, float:9.1143E-41)
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
            r2 = 3
            if (r0 != r2) goto L_0x0047
            return r1
        L_0x0047:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.v.checkParams(java.lang.Object[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void loadMoreList(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59945a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 65044(0xfe14, float:9.1146E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59945a
            r13 = 0
            r14 = 65044(0xfe14, float:9.1146E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r1 = r0[r1]
            if (r1 == 0) goto L_0x005c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 2
            r0 = r0[r2]
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = (java.lang.String) r0
            r2 = r17
            r2.a(r1, r0)
            return
        L_0x0052:
            r2 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        L_0x005c:
            r2 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.v.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void refreshList(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f59945a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 65043(0xfe13, float:9.1145E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f59945a
            r13 = 0
            r14 = 65043(0xfe13, float:9.1145E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r1 = r0[r1]
            if (r1 == 0) goto L_0x005c
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 2
            r0 = r0[r2]
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = (java.lang.String) r0
            r2 = r17
            r2.a(r1, r0)
            return
        L_0x0052:
            r2 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        L_0x005c:
            r2 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.model.v.refreshList(java.lang.Object[]):void");
    }

    public final /* synthetic */ void handleData(Object obj) {
        List<SimplePoiInfoStruct> list;
        w wVar = (w) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{wVar}, this, f59945a, false, 65046, new Class[]{w.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{wVar}, this, f59945a, false, 65046, new Class[]{w.class}, Void.TYPE);
            return;
        }
        int i = this.mListQueryType;
        long j = 0;
        if (i != 1) {
            if (i == 4) {
                List<SimplePoiInfoStruct> list2 = null;
                if (wVar != null) {
                    list = wVar.f59949b;
                } else {
                    list = null;
                }
                this.mIsNewDataEmpty = CollectionUtils.isEmpty(list);
                if (this.mIsNewDataEmpty) {
                    ((w) this.mData).f59951d = false;
                    return;
                }
                List<SimplePoiInfoStruct> list3 = ((w) this.mData).f59949b;
                if (list3 != null) {
                    if (wVar != null) {
                        list2 = wVar.f59949b;
                    }
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    list3.addAll(list2);
                }
                w wVar2 = (w) this.mData;
                if (wVar != null) {
                    z = wVar.f59951d;
                }
                wVar2.f59951d = z;
                if (wVar != null) {
                    j = wVar.f59950c;
                }
                this.f59947c = j;
            }
            return;
        }
        this.mData = wVar;
        if (wVar != null) {
            j = wVar.f59950c;
        }
        this.f59947c = j;
    }

    private final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f59945a, false, 65045, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f59945a, false, 65045, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        PoiHalfCardApi.f59719c.a(i, str, this.f59947c, 20).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
    }
}
