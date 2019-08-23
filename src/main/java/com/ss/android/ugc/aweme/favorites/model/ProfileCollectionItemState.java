package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.favorites.a.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionItemState;", "Lcom/bytedance/jedi/arch/State;", "profileCollectionItemStruct", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "(Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;)V", "getProfileCollectionItemStruct", "()Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionItemState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final f profileCollectionItemStruct;

    public ProfileCollectionItemState() {
        this(null, 1, null);
    }

    public static /* synthetic */ ProfileCollectionItemState copy$default(ProfileCollectionItemState profileCollectionItemState, f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = profileCollectionItemState.profileCollectionItemStruct;
        }
        return profileCollectionItemState.copy(fVar);
    }

    @NotNull
    public final f component1() {
        return this.profileCollectionItemStruct;
    }

    @NotNull
    public final ProfileCollectionItemState copy(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, changeQuickRedirect, false, 39481, new Class[]{f.class}, ProfileCollectionItemState.class)) {
            return (ProfileCollectionItemState) PatchProxy.accessDispatch(new Object[]{fVar2}, this, changeQuickRedirect, false, 39481, new Class[]{f.class}, ProfileCollectionItemState.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "profileCollectionItemStruct");
        return new ProfileCollectionItemState(fVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 39484, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ProfileCollectionItemState) && Intrinsics.areEqual((Object) this.profileCollectionItemStruct, (Object) ((ProfileCollectionItemState) obj).profileCollectionItemStruct));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 39484, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39483, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39483, new Class[0], Integer.TYPE)).intValue();
        }
        f fVar = this.profileCollectionItemStruct;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39482, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39482, new Class[0], String.class);
        }
        return "ProfileCollectionItemState(profileCollectionItemStruct=" + this.profileCollectionItemStruct + ")";
    }

    @NotNull
    public final f getProfileCollectionItemStruct() {
        return this.profileCollectionItemStruct;
    }

    public ProfileCollectionItemState(@NotNull f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "profileCollectionItemStruct");
        this.profileCollectionItemStruct = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileCollectionItemState(f fVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new f() : fVar);
    }
}
