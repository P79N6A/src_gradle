package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u00020\u0004BS\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000e\u0010\u0017\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tHÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003Jj\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006&"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/ListState;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/State;", "payload", "list", "", "refresh", "Lcom/bytedance/jedi/arch/Async;", "loadMore", "isEmpty", "Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "(Lcom/bytedance/jedi/arch/ext/list/Payload;Ljava/util/List;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;)V", "()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "getList", "()Ljava/util/List;", "getLoadMore", "()Lcom/bytedance/jedi/arch/Async;", "getPayload", "()Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "getRefresh", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/bytedance/jedi/arch/ext/list/Payload;Ljava/util/List;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;)Lcom/bytedance/jedi/arch/ext/list/ListState;", "equals", "", "other", "", "hashCode", "", "toString", "", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class ListState<T, P extends k> implements x {
    @NotNull
    private final b isEmpty;
    @NotNull
    private final List<T> list;
    @NotNull
    private final a<List<T>> loadMore;
    @NotNull
    private final P payload;
    @NotNull
    private final a<List<T>> refresh;

    public static /* synthetic */ ListState copy$default(ListState listState, P p, List<T> list2, a<List<T>> aVar, a<List<T>> aVar2, b bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            p = listState.payload;
        }
        if ((i & 2) != 0) {
            list2 = listState.list;
        }
        List<T> list3 = list2;
        if ((i & 4) != 0) {
            aVar = listState.refresh;
        }
        a<List<T>> aVar3 = aVar;
        if ((i & 8) != 0) {
            aVar2 = listState.loadMore;
        }
        a<List<T>> aVar4 = aVar2;
        if ((i & 16) != 0) {
            bVar = listState.isEmpty;
        }
        return listState.copy(p, list3, aVar3, aVar4, bVar);
    }

    @NotNull
    public final P component1() {
        return this.payload;
    }

    @NotNull
    public final List<T> component2() {
        return this.list;
    }

    @NotNull
    public final a<List<T>> component3() {
        return this.refresh;
    }

    @NotNull
    public final a<List<T>> component4() {
        return this.loadMore;
    }

    @NotNull
    public final b component5() {
        return this.isEmpty;
    }

    @NotNull
    public final ListState<T, P> copy(@NotNull P p, @NotNull List<? extends T> list2, @NotNull a<? extends List<? extends T>> aVar, @NotNull a<? extends List<? extends T>> aVar2, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(p, "payload");
        Intrinsics.checkParameterIsNotNull(list2, "list");
        Intrinsics.checkParameterIsNotNull(aVar, "refresh");
        Intrinsics.checkParameterIsNotNull(aVar2, "loadMore");
        Intrinsics.checkParameterIsNotNull(bVar, "isEmpty");
        ListState listState = new ListState(p, list2, aVar, aVar2, bVar);
        return listState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2.isEmpty, (java.lang.Object) r3.isEmpty) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.bytedance.jedi.arch.ext.list.ListState
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.ListState r3 = (com.bytedance.jedi.arch.ext.list.ListState) r3
            P r0 = r2.payload
            P r1 = r3.payload
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<T> r0 = r2.list
            java.util.List<T> r1 = r3.list
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.refresh
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.refresh
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.a<java.util.List<T>> r0 = r2.loadMore
            com.bytedance.jedi.arch.a<java.util.List<T>> r1 = r3.loadMore
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x003b
            com.bytedance.jedi.arch.ext.list.b r0 = r2.isEmpty
            com.bytedance.jedi.arch.ext.list.b r3 = r3.isEmpty
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListState.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        P p = this.payload;
        int i = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        List<T> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        a<List<T>> aVar = this.refresh;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<List<T>> aVar2 = this.loadMore;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        b bVar = this.isEmpty;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        return "ListState(payload=" + this.payload + ", list=" + this.list + ", refresh=" + this.refresh + ", loadMore=" + this.loadMore + ", isEmpty=" + this.isEmpty + ")";
    }

    @NotNull
    public final List<T> getList() {
        return this.list;
    }

    @NotNull
    public final a<List<T>> getLoadMore() {
        return this.loadMore;
    }

    @NotNull
    public final P getPayload() {
        return this.payload;
    }

    @NotNull
    public final a<List<T>> getRefresh() {
        return this.refresh;
    }

    @NotNull
    public final b isEmpty() {
        return this.isEmpty;
    }

    public ListState(@NotNull P p, @NotNull List<? extends T> list2, @NotNull a<? extends List<? extends T>> aVar, @NotNull a<? extends List<? extends T>> aVar2, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(p, "payload");
        Intrinsics.checkParameterIsNotNull(list2, "list");
        Intrinsics.checkParameterIsNotNull(aVar, "refresh");
        Intrinsics.checkParameterIsNotNull(aVar2, "loadMore");
        Intrinsics.checkParameterIsNotNull(bVar, "isEmpty");
        this.payload = p;
        this.list = list2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.isEmpty = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListState(k kVar, List list2, a aVar, a aVar2, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? ad.f21345a : aVar, (i & 8) != 0 ? ad.f21345a : aVar2, (i & 16) != 0 ? new b(false) : bVar);
    }
}
