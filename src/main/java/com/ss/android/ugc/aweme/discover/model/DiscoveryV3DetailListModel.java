package com.ss.android.ugc.aweme.discover.model;

import a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.net.m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0014¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J!\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010\u0014J%\u0010\u0015\u001a\u00020\u000f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0014¢\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u000f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0014¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3DetailListModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/discover/model/DiscoveryV3CellDetailResponse;", "()V", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "getItems", "", "isHasMore", "loadList", "", "cellId", "", "count", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "setItems", "items", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class DiscoveryV3DetailListModel extends a<Aweme, DiscoveryV3CellDetailResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37047, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37047, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    @Nullable
    public final List<Aweme> getItems() {
        DiscoveryV3CellDetailResponse discoveryV3CellDetailResponse = (DiscoveryV3CellDetailResponse) this.mData;
        if (discoveryV3CellDetailResponse != null) {
            return discoveryV3CellDetailResponse.awemeList;
        }
        return null;
    }

    public final boolean isHasMore() {
        DiscoveryV3CellDetailResponse discoveryV3CellDetailResponse = (DiscoveryV3CellDetailResponse) this.mData;
        if (discoveryV3CellDetailResponse != null) {
            return discoveryV3CellDetailResponse.hasMore;
        }
        return true;
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
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37049(0x90b9, float:5.1917E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 37049(0x90b9, float:5.1917E-41)
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
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 != 0) goto L_0x0043
            r1 = r3
        L_0x0043:
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            r0 = r0[r2]
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x004d
            r0 = r3
        L_0x004d:
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = r17
            r2.loadList(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.DiscoveryV3DetailListModel.loadMoreList(java.lang.Object[]):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37048(0x90b8, float:5.1915E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 37048(0x90b8, float:5.1915E-41)
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
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 != 0) goto L_0x0043
            r1 = r3
        L_0x0043:
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            r0 = r0[r2]
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x004d
            r0 = r3
        L_0x004d:
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = r17
            r2.loadList(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.model.DiscoveryV3DetailListModel.refreshList(java.lang.Object[]):void");
    }

    public final void setItems(@Nullable List<Aweme> list) {
        String str;
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 37046, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 37046, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            LogPbBean logPbBean = new LogPbBean();
            if (list != null) {
                Aweme aweme = (Aweme) CollectionsKt.firstOrNull(list);
                if (aweme != null) {
                    str = aweme.getRequestId();
                    logPbBean.setImprId(str);
                    this.mData = new DiscoveryV3CellDetailResponse(list, true, logPbBean);
                }
            }
            str = null;
            logPbBean.setImprId(str);
            this.mData = new DiscoveryV3CellDetailResponse(list, true, logPbBean);
        }
    }

    private final void loadList(String str, Integer num) {
        int i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, num}, this, changeQuickRedirect, false, 37050, new Class[]{String.class, Integer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, num}, this, changeQuickRedirect, false, 37050, new Class[]{String.class, Integer.class}, Void.TYPE);
            return;
        }
        DiscoverApi.DiscoverService a2 = DiscoverApi.a();
        if (num != null) {
            i = num.intValue();
        } else {
            i = 8;
        }
        a2.cellDetailV3(str2, i).a((g<TResult, TContinuationResult>) DiscoveryV3DetailListModel$loadList$1.INSTANCE).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
