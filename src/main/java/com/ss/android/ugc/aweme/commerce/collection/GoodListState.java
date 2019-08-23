package com.ss.android.ugc.aweme.commerce.collection;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/collection/GoodListState;", "Lcom/bytedance/jedi/arch/State;", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/commerce/collection/CollectionGood;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListState;", "(Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GoodListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<CollectionGood, k> listState;

    public GoodListState() {
        this(null, 1, null);
    }

    public static /* synthetic */ GoodListState copy$default(GoodListState goodListState, ListState<CollectionGood, k> listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = goodListState.listState;
        }
        return goodListState.copy(listState2);
    }

    @NotNull
    public final ListState<CollectionGood, k> component1() {
        return this.listState;
    }

    @NotNull
    public final GoodListState copy(@NotNull ListState<CollectionGood, k> listState2) {
        ListState<CollectionGood, k> listState3 = listState2;
        if (PatchProxy.isSupport(new Object[]{listState3}, this, changeQuickRedirect, false, 28077, new Class[]{ListState.class}, GoodListState.class)) {
            return (GoodListState) PatchProxy.accessDispatch(new Object[]{listState3}, this, changeQuickRedirect, false, 28077, new Class[]{ListState.class}, GoodListState.class);
        }
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        return new GoodListState(listState3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 28080, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof GoodListState) && Intrinsics.areEqual((Object) this.listState, (Object) ((GoodListState) obj).listState));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 28080, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28079, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28079, new Class[0], Integer.TYPE)).intValue();
        }
        ListState<CollectionGood, k> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 28078, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 28078, new Class[0], String.class);
        }
        return "GoodListState(listState=" + this.listState + ")";
    }

    @NotNull
    public final ListState<CollectionGood, k> getListState() {
        return this.listState;
    }

    public GoodListState(@NotNull ListState<CollectionGood, k> listState2) {
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        this.listState = listState2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GoodListState(com.bytedance.jedi.arch.ext.list.ListState r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r8 = this;
            r10 = r10 & 1
            if (r10 == 0) goto L_0x0018
            com.bytedance.jedi.arch.ext.list.k r1 = new com.bytedance.jedi.arch.ext.list.k
            r9 = 3
            r10 = 0
            r1.<init>(r10, r10, r9)
            com.bytedance.jedi.arch.ext.list.ListState r9 = new com.bytedance.jedi.arch.ext.list.ListState
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0018:
            r8.<init>(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.collection.GoodListState.<init>(com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
