package com.ss.android.ugc.aweme.discover.presenter;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.discover.model.SearchCommodity;
import com.ss.android.ugc.aweme.discover.model.SearchCommodityList;
import com.ss.android.ugc.aweme.net.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0004J!\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0014¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0012\u001a\u00020\nH\u0016J!\u0010\u0013\u001a\u00020\u00102\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0014¢\u0006\u0002\u0010\u0014J!\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0014¢\u0006\u0002\u0010\u0014J@\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchCommodityModel;", "Lcom/ss/android/ugc/aweme/discover/presenter/SearchBaseModel;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodity;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodityList;", "()V", "searchType", "", "getSearchType", "()I", "checkParams", "", "params", "", "", "([Ljava/lang/Object;)Z", "handleData", "", "data", "isHasMore", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "searchCommodityList", "keyword", "", "type", "sort", "cursor", "count", "pullRefresh", "correctType", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class n extends j<SearchCommodity, SearchCommodityList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42729a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f42730b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/presenter/SearchCommodityModel$Companion;", "", "()V", "FILTER_TYPE_GENERAL", "", "FILTER_TYPE_PRICE", "FILTER_TYPE_SALES", "LOAD_MORE_COUNT", "SORT_ASC", "SORT_DESC", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodityList;", "it", "Lbolts/Task;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class b<TTaskResult, TContinuationResult> implements g<TResult, TContinuationResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42731a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f42732b = new b();

        b() {
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f42731a, false, 37226, new Class[]{i.class}, SearchCommodityList.class)) {
                return (SearchCommodityList) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f42731a, false, 37226, new Class[]{i.class}, SearchCommodityList.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
            if (iVar.c()) {
                return null;
            }
            if (!iVar.d()) {
                return (SearchCommodityList) iVar.e();
            }
            Exception f2 = iVar.f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "it.error");
            throw f2;
        }
    }

    public final int a() {
        return 7;
    }

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f42729a, false, 37225, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f42729a, false, 37225, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    public final boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f42729a, false, 37224, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42729a, false, 37224, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null) {
            Object obj = this.mData;
            Intrinsics.checkExpressionValueIsNotNull(obj, "mData");
            if (((SearchCommodityList) obj).hasMore) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (((com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r1).hasMore != false) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleData(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.discover.model.SearchCommodityList r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42729a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchCommodityList> r1 = com.ss.android.ugc.aweme.discover.model.SearchCommodityList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 37223(0x9167, float:5.216E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f42729a
            r3 = 0
            r4 = 37223(0x9167, float:5.216E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.SearchCommodityList> r1 = com.ss.android.ugc.aweme.discover.model.SearchCommodityList.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r0 = r10
            com.ss.android.ugc.aweme.discover.model.SearchApiResult r0 = (com.ss.android.ugc.aweme.discover.model.SearchApiResult) r0
            super.handleData(r0)
            if (r10 == 0) goto L_0x003d
            java.util.List<com.ss.android.ugc.aweme.discover.model.SearchCommodity> r0 = r10.commodityList
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r10 == 0) goto L_0x004c
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r1 = 0
            goto L_0x004d
        L_0x004c:
            r1 = 1
        L_0x004d:
            r9.mIsNewDataEmpty = r1
            boolean r1 = r9.mIsNewDataEmpty
            if (r1 != 0) goto L_0x00b6
            if (r0 != 0) goto L_0x0058
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0058:
            java.util.Iterator r1 = r0.iterator()
        L_0x005c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0079
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.discover.model.SearchCommodity r2 = (com.ss.android.ugc.aweme.discover.model.SearchCommodity) r2
            java.lang.String r3 = "searchCommodity"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            com.ss.android.ugc.aweme.discover.model.Commodity r2 = r2.getCommodity()
            if (r2 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r10.logPb
            r2.setLogPb(r3)
            goto L_0x005c
        L_0x0079:
            int r1 = r9.mListQueryType
            if (r1 == r7) goto L_0x00b0
            r2 = 4
            if (r1 == r2) goto L_0x0081
            goto L_0x00af
        L_0x0081:
            r9.c(r0)
            java.lang.Object r0 = r9.mData
            java.lang.String r1 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.discover.model.SearchCommodityList r0 = (com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r0
            boolean r1 = r10.hasMore
            if (r1 == 0) goto L_0x009f
            java.lang.Object r1 = r9.mData
            java.lang.String r2 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.discover.model.SearchCommodityList r1 = (com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r1
            boolean r1 = r1.hasMore
            if (r1 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r7 = 0
        L_0x00a0:
            r0.hasMore = r7
            java.lang.Object r0 = r9.mData
            java.lang.String r1 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.discover.model.SearchCommodityList r0 = (com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r0
            int r1 = r10.cursor
            r0.cursor = r1
        L_0x00af:
            return
        L_0x00b0:
            r9.mData = r10
            r9.b(r0)
            return
        L_0x00b6:
            int r0 = r9.mListQueryType
            if (r0 == r7) goto L_0x00bb
            goto L_0x00c0
        L_0x00bb:
            r9.mData = r10
            r9.b()
        L_0x00c0:
            java.lang.Object r0 = r9.mData
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r9.mData
            java.lang.String r1 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.discover.model.SearchCommodityList r0 = (com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r0
            r0.hasMore = r8
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.n.handleData(com.ss.android.ugc.aweme.discover.model.SearchCommodityList):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f42729a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37221(0x9165, float:5.2158E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42729a
            r13 = 0
            r14 = 37221(0x9165, float:5.2158E-41)
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
            if (r1 == 0) goto L_0x00a7
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = 2
            r1 = r0[r1]
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            r1 = 3
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0093
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            r1 = r17
            java.lang.Object r2 = r1.mData
            java.lang.String r6 = "mData"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r6)
            com.ss.android.ugc.aweme.discover.model.SearchCommodityList r2 = (com.ss.android.ugc.aweme.discover.model.SearchCommodityList) r2
            int r6 = r2.cursor
            r7 = 10
            r2 = 4
            r2 = r0[r2]
            if (r2 == 0) goto L_0x008b
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r8 = r2.intValue()
            r2 = 5
            r0 = r0[r2]
            if (r0 == 0) goto L_0x0083
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            r2 = r17
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0083:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)
            throw r0
        L_0x008b:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)
            throw r0
        L_0x0093:
            r1 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)
            throw r0
        L_0x009d:
            r1 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r2)
            throw r0
        L_0x00a7:
            r1 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.n.loadMoreList(java.lang.Object[]):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f42729a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 37220(0x9164, float:5.2156E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f42729a
            r13 = 0
            r14 = 37220(0x9164, float:5.2156E-41)
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
            if (r1 == 0) goto L_0x0097
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            r1 = 2
            r1 = r0[r1]
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r4 = r1.intValue()
            r1 = 3
            r1 = r0[r1]
            if (r1 == 0) goto L_0x0087
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r5 = r1.intValue()
            r6 = 0
            r7 = 10
            r1 = 4
            r1 = r0[r1]
            if (r1 == 0) goto L_0x007f
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r8 = r1.intValue()
            r1 = 5
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            r2 = r17
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0077:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        L_0x007f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        L_0x0087:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        L_0x008f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)
            throw r0
        L_0x0097:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.presenter.n.refreshList(java.lang.Object[]):void");
    }

    private final void a(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 10, Integer.valueOf(i5), Integer.valueOf(i6)}, this, f42729a, false, 37222, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), 10, Integer.valueOf(i5), Integer.valueOf(i6)}, this, f42729a, false, 37222, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        SearchApi.a(str, i, i2, i3, 10, i5, this.f42717e, this.g, i6).a((g<TResult, TContinuationResult>) b.f42732b).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
