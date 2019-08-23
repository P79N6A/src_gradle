package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "Lcom/bytedance/jedi/arch/State;", "header", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "(Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;)V", "getHeader", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeaderState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a header;

    public HeaderState() {
        this(null, 1, null);
    }

    public static /* synthetic */ HeaderState copy$default(HeaderState headerState, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = headerState.header;
        }
        return headerState.copy(aVar);
    }

    @NotNull
    public final a component1() {
        return this.header;
    }

    @NotNull
    public final HeaderState copy(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, changeQuickRedirect, false, 46798, new Class[]{a.class}, HeaderState.class)) {
            return (HeaderState) PatchProxy.accessDispatch(new Object[]{aVar2}, this, changeQuickRedirect, false, 46798, new Class[]{a.class}, HeaderState.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "header");
        return new HeaderState(aVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46801, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof HeaderState) && Intrinsics.areEqual((Object) this.header, (Object) ((HeaderState) obj).header));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46801, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46800, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46800, new Class[0], Integer.TYPE)).intValue();
        }
        a aVar = this.header;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46799, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46799, new Class[0], String.class);
        }
        return "HeaderState(header=" + this.header + ")";
    }

    @NotNull
    public final a getHeader() {
        return this.header;
    }

    public HeaderState(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "header");
        this.header = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderState(a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new a(0, null, 3) : aVar);
    }
}
