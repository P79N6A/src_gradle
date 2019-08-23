package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/TitleState;", "Lcom/bytedance/jedi/arch/State;", "title", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationTitle;", "(Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationTitle;)V", "getTitle", "()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/RelationTitle;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TitleState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final e title;

    public TitleState() {
        this(null, 1, null);
    }

    public static /* synthetic */ TitleState copy$default(TitleState titleState, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = titleState.title;
        }
        return titleState.copy(eVar);
    }

    @NotNull
    public final e component1() {
        return this.title;
    }

    @NotNull
    public final TitleState copy(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, changeQuickRedirect, false, 45282, new Class[]{e.class}, TitleState.class)) {
            return (TitleState) PatchProxy.accessDispatch(new Object[]{eVar2}, this, changeQuickRedirect, false, 45282, new Class[]{e.class}, TitleState.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar2, PushConstants.TITLE);
        return new TitleState(eVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45285, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof TitleState) && Intrinsics.areEqual((Object) this.title, (Object) ((TitleState) obj).title));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45285, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45284, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45284, new Class[0], Integer.TYPE)).intValue();
        }
        e eVar = this.title;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45283, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45283, new Class[0], String.class);
        }
        return "TitleState(title=" + this.title + ")";
    }

    @NotNull
    public final e getTitle() {
        return this.title;
    }

    public TitleState(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, PushConstants.TITLE);
        this.title = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TitleState(e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new e(0, null, 3) : eVar);
    }
}
