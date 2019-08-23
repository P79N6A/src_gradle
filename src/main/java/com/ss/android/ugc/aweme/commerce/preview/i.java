package com.ss.android.ugc.aweme.commerce.preview;

import a.g;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.preview.api.a.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u000b\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0004J!\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0014¢\u0006\u0002\u0010\u000fJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016J!\u0010\u001a\u001a\u00020\u00112\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0014¢\u0006\u0002\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00112\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0014¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nJ#\u0010\u001f\u001a\u00020\u00062\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\r\"\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewFeedModel;", "Lcom/ss/android/ugc/aweme/common/presenter/BaseListModel;", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewVideoIdsResponse;", "()V", "hasMore", "", "mCursor", "", "requestSessionId", "", "checkParams", "params", "", "", "([Ljava/lang/Object;)Z", "fetchData", "", "awemeId", "promotionId", "productId", "getItems", "", "handleData", "data", "isHasMore", "loadMoreList", "([Ljava/lang/Object;)V", "refreshList", "restore", "requestId", "sendRealRequest", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class i extends com.ss.android.ugc.aweme.common.f.a<Aweme, d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37504a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37505b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int f37506c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37507d = true;

    /* renamed from: e  reason: collision with root package name */
    private String f37508e = "FIRST_REQUEST_SESSION_ID";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/PreviewFeedModel$Companion;", "", "()V", "COUNT", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<Aweme, Boolean> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Aweme) obj));
        }

        public final boolean invoke(@NotNull Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{aweme2}, this, changeQuickRedirect, false, 28785, new Class[]{Aweme.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, changeQuickRedirect, false, 28785, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
            if (!aweme.isPublic() || aweme.isSelfSee() || aweme.isProhibited() || aweme.isInReviewing() || aweme.isDelete() || aweme.getPromotion() == null) {
                return true;
            }
            return false;
        }
    }

    public final boolean isHasMore() {
        return this.f37507d;
    }

    @NotNull
    public final List<Aweme> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f37504a, false, 28777, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f37504a, false, 28777, new Class[0], List.class);
        } else if (this.mData == null) {
            return new ArrayList<>();
        } else {
            List<Aweme> list = ((d) this.mData).f37343d;
            if (list == null) {
                list = new ArrayList<>();
            }
            return new ArrayList<>(list);
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
            com.meituan.robust.ChangeQuickRedirect r4 = f37504a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 28781(0x706d, float:4.0331E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37504a
            r13 = 0
            r14 = 28781(0x706d, float:4.0331E-41)
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
            r2 = 4
            if (r0 != r2) goto L_0x0045
            return r1
        L_0x0045:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.i.checkParams(java.lang.Object[]):boolean");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f37504a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 28780(0x706c, float:4.033E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37504a
            r13 = 0
            r14 = 28780(0x706c, float:4.033E-41)
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
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            r2 = r0[r2]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 3
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = ""
        L_0x004b:
            if (r2 != 0) goto L_0x004f
            java.lang.String r2 = ""
        L_0x004f:
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            r3 = r0
            r0 = r17
            r0.a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.i.loadMoreList(java.lang.Object[]):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f37504a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 28778(0x706a, float:4.0327E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37504a
            r13 = 0
            r14 = 28778(0x706a, float:4.0327E-41)
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
            r1 = r0[r1]
            java.lang.String r1 = (java.lang.String) r1
            r2 = 2
            r2 = r0[r2]
            java.lang.String r2 = (java.lang.String) r2
            r3 = 3
            r0 = r0[r3]
            java.lang.String r0 = (java.lang.String) r0
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = ""
        L_0x004b:
            if (r2 != 0) goto L_0x004f
            java.lang.String r2 = ""
        L_0x004f:
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = ""
        L_0x0053:
            r3 = r0
            r0 = r17
            r0.a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.i.refreshList(java.lang.Object[]):void");
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
            com.meituan.robust.ChangeQuickRedirect r4 = f37504a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 28783(0x706f, float:4.0334E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f37504a
            r13 = 0
            r14 = 28783(0x706f, float:4.0334E-41)
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
            java.lang.String r1 = "params"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = r17
            boolean r0 = super.sendRequest(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.preview.i.a(java.lang.Object[]):boolean");
    }

    public final /* synthetic */ void handleData(Object obj) {
        String str;
        String str2;
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f37504a, false, 28779, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f37504a, false, 28779, new Class[]{d.class}, Void.TYPE);
            return;
        }
        Integer num = null;
        if (dVar != null) {
            str = dVar.f37341b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.f37508e)) {
            int i = this.f37506c;
            if (dVar != null && i == dVar.f37342c) {
                List<Aweme> list = dVar.f37343d;
                if (list == null) {
                    list = new ArrayList<>();
                }
                CollectionsKt.removeAll(list, (Function1<? super T, Boolean>) b.INSTANCE);
                this.mIsNewDataEmpty = dVar.f37344e;
                int i2 = this.mListQueryType;
                if (i2 != 4) {
                    switch (i2) {
                        case 1:
                            this.mData = dVar;
                            ((d) this.mData).f37343d = list;
                            break;
                        case 2:
                            List<Aweme> list2 = ((d) this.mData).f37343d;
                            if (list2 != null) {
                                list2.addAll(list);
                                break;
                            }
                            break;
                    }
                } else {
                    List<Aweme> list3 = ((d) this.mData).f37343d;
                    if (list3 != null) {
                        list3.addAll(list);
                    }
                }
                this.f37506c += 10;
                this.f37507d = dVar.f37344e;
                return;
            }
        }
        StringBuilder sb = new StringBuilder("skipped request current:");
        sb.append(this.f37508e);
        sb.append(' ');
        sb.append(this.f37506c);
        sb.append(" request: ");
        if (dVar != null) {
            str2 = dVar.f37341b;
        } else {
            str2 = null;
        }
        sb.append(str2);
        sb.append(' ');
        if (dVar != null) {
            num = Integer.valueOf(dVar.f37342c);
        }
        sb.append(num);
        Logger.d("tag_commerce", sb.toString());
    }

    private final void a(String str, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3}, this, f37504a, false, 28782, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3}, this, f37504a, false, 28782, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commerce.preview.api.a.f37316c.a(this.f37506c, 10, str, str2, str3).a((g<TResult, TContinuationResult>) new n<TResult,TContinuationResult>(this.mHandler, 0, this.f37508e, this.f37506c));
    }
}
