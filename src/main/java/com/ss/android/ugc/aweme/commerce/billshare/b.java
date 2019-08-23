package com.ss.android.ugc.aweme.commerce.billshare;

import a.g;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0004J \u0010\u0016\u001a\u00020\n2\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\n0\bJ!\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0014¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 H\u0016J\b\u0010!\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\"\u001a\u00020\u0006J\u0012\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010%\u001a\u00020\u0010H\u0016J!\u0010&\u001a\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0014¢\u0006\u0002\u0010'J!\u0010(\u001a\u00020\n2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0014¢\u0006\u0002\u0010'J#\u0010)\u001a\u00020\u00102\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001a\"\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001cJ\u000e\u0010*\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R.\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareFeedModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/commerce/billshare/api/vo/BillShareResponse;", "()V", "billShareCount", "", "dataCB", "Lkotlin/Function1;", "", "", "getDataCB", "()Lkotlin/jvm/functions/Function1;", "setDataCB", "(Lkotlin/jvm/functions/Function1;)V", "hasMore", "", "mCursor", "mTopAweme", "needShowTopItem", "requestSessionId", "", "addListener", "cb", "checkParams", "params", "", "", "([Ljava/lang/Object;)Z", "fetchData", "promotionId", "getItems", "", "getTopAweme", "getTotal", "handleData", "data", "isHasMore", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "sendRealRequest", "setNeedTopItem", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends com.ss.android.ugc.aweme.common.f.a<Aweme, com.ss.android.ugc.aweme.commerce.billshare.api.a.a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36747a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f36748f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f36749b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f36750c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36751d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public Function1<? super List<? extends Aweme>, Unit> f36752e;
    private int g;
    private boolean h = true;
    private String i = "FIRST_REQUEST_SESSION_ID";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/BillShareFeedModel$Companion;", "", "()V", "COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.billshare.b$b  reason: collision with other inner class name */
    static final class C0463b extends Lambda implements Function1<Aweme, Boolean> {
        public static final C0463b INSTANCE = new C0463b();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0463b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Aweme) obj));
        }

        public final boolean invoke(@NotNull Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 27995, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 27995, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
            if (!aweme.isPublic() || aweme.isSelfSee() || aweme.isProhibited() || aweme.isInReviewing() || aweme.isDelete() || aweme.getPromotion() == null) {
                return true;
            }
            return false;
        }
    }

    public final boolean isHasMore() {
        return this.h;
    }

    @NotNull
    public final List<Aweme> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f36747a, false, 27987, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f36747a, false, 27987, new Class[0], List.class);
        } else if (this.mData == null) {
            return new ArrayList<>();
        } else {
            List<Aweme> list = ((com.ss.android.ugc.aweme.commerce.billshare.api.a.a) this.mData).f36744d;
            if (list == null) {
                list = new ArrayList<>();
            }
            return new ArrayList<>(list);
        }
    }

    public final void a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36747a, false, 27992, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f36747a, false, 27992, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "promotionId");
        com.ss.android.ugc.aweme.commerce.billshare.api.a.f36739b.a(str, this.g, 10).a((g<TResult, TContinuationResult>) new n<TResult,TContinuationResult>(this.mHandler, 0, this.i, this.g));
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
            com.meituan.robust.ChangeQuickRedirect r4 = f36747a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 27991(0x6d57, float:3.9224E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f36747a
            r13 = 0
            r14 = 27991(0x6d57, float:3.9224E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            int r0 = r0.length
            r2 = 2
            if (r0 != r2) goto L_0x0045
            return r1
        L_0x0045:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.b.checkParams(java.lang.Object[]):boolean");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f36747a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 27990(0x6d56, float:3.9222E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f36747a
            r13 = 0
            r14 = 27990(0x6d56, float:3.9222E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = (java.lang.String) r0
            r1 = r17
            r1.a((java.lang.String) r0)
            return
        L_0x0045:
            r1 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.b.loadMoreList(java.lang.Object[]):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f36747a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 27988(0x6d54, float:3.922E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f36747a
            r13 = 0
            r14 = 27988(0x6d54, float:3.922E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r0 = r0[r1]
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = (java.lang.String) r0
            r1 = r17
            r1.a((java.lang.String) r0)
            return
        L_0x0045:
            r1 = r17
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.b.refreshList(java.lang.Object[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(@org.jetbrains.annotations.NotNull java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f36747a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 27994(0x6d5a, float:3.9228E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f36747a
            r13 = 0
            r14 = 27994(0x6d5a, float:3.9228E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003b:
            java.lang.String r2 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L_0x0055
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r3 = r0[r9]
            r2[r9] = r3
            r0 = r0[r1]
            r2[r1] = r0
            r0 = r17
            boolean r1 = super.sendRequest(r2)
            return r1
        L_0x0055:
            r0 = r17
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.billshare.b.a(java.lang.Object[]):boolean");
    }

    public final /* synthetic */ void handleData(Object obj) {
        String str;
        String str2;
        com.ss.android.ugc.aweme.commerce.billshare.api.a.a aVar = (com.ss.android.ugc.aweme.commerce.billshare.api.a.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f36747a, false, 27989, new Class[]{com.ss.android.ugc.aweme.commerce.billshare.api.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f36747a, false, 27989, new Class[]{com.ss.android.ugc.aweme.commerce.billshare.api.a.a.class}, Void.TYPE);
            return;
        }
        Integer num = null;
        if (aVar != null) {
            str = aVar.f36742b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.i)) {
            int i2 = this.g;
            if (aVar != null && i2 == aVar.f36743c) {
                this.f36749b = Math.max(this.f36749b, aVar.f36745e);
                List<Aweme> list = aVar.f36744d;
                if (list == null) {
                    list = new ArrayList<>();
                }
                CollectionsKt.removeAll(list, (Function1<? super T, Boolean>) C0463b.INSTANCE);
                if (this.f36751d) {
                    Aweme aweme = aVar.f36746f;
                    if (aweme != null) {
                        this.f36750c = aweme;
                        list.add(0, aweme);
                    }
                }
                this.mIsNewDataEmpty = list.isEmpty();
                int i3 = this.mListQueryType;
                if (i3 != 4) {
                    switch (i3) {
                        case 1:
                            this.mData = aVar;
                            ((com.ss.android.ugc.aweme.commerce.billshare.api.a.a) this.mData).f36744d = list;
                            break;
                        case 2:
                            List<Aweme> list2 = ((com.ss.android.ugc.aweme.commerce.billshare.api.a.a) this.mData).f36744d;
                            if (list2 != null) {
                                list2.addAll(list);
                                break;
                            }
                            break;
                    }
                } else {
                    List<Aweme> list3 = ((com.ss.android.ugc.aweme.commerce.billshare.api.a.a) this.mData).f36744d;
                    if (list3 != null) {
                        list3.addAll(list);
                    }
                }
                this.g += 10;
                this.h = !this.mIsNewDataEmpty;
                Function1<? super List<? extends Aweme>, Unit> function1 = this.f36752e;
                if (function1 != null) {
                    List<Aweme> list4 = ((com.ss.android.ugc.aweme.commerce.billshare.api.a.a) this.mData).f36744d;
                    if (list4 == null) {
                        list4 = CollectionsKt.emptyList();
                    }
                    function1.invoke(list4);
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder("skipped request current:");
        sb.append(this.i);
        sb.append(' ');
        sb.append(this.g);
        sb.append(" request: ");
        if (aVar != null) {
            str2 = aVar.f36742b;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(' ');
        if (aVar != null) {
            num = Integer.valueOf(aVar.f36743c);
        }
        sb.append(num);
        Logger.d("tag_commerce", sb.toString());
    }
}
