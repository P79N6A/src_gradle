package com.ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.favorites.a.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\u0002\u0010\u0007J\u001f\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/model/ProfileCollectionState;", "Lcom/bytedance/jedi/arch/State;", "profileCollectionItemStructListState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListState;", "(Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getProfileCollectionItemStructListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProfileCollectionState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<f, k> profileCollectionItemStructListState;

    public ProfileCollectionState() {
        this(null, 1, null);
    }

    public static /* synthetic */ ProfileCollectionState copy$default(ProfileCollectionState profileCollectionState, ListState<f, k> listState, int i, Object obj) {
        if ((i & 1) != 0) {
            listState = profileCollectionState.profileCollectionItemStructListState;
        }
        return profileCollectionState.copy(listState);
    }

    @NotNull
    public final ListState<f, k> component1() {
        return this.profileCollectionItemStructListState;
    }

    @NotNull
    public final ProfileCollectionState copy(@NotNull ListState<f, k> listState) {
        ListState<f, k> listState2 = listState;
        if (PatchProxy.isSupport(new Object[]{listState2}, this, changeQuickRedirect, false, 39486, new Class[]{ListState.class}, ProfileCollectionState.class)) {
            return (ProfileCollectionState) PatchProxy.accessDispatch(new Object[]{listState2}, this, changeQuickRedirect, false, 39486, new Class[]{ListState.class}, ProfileCollectionState.class);
        }
        Intrinsics.checkParameterIsNotNull(listState2, "profileCollectionItemStructListState");
        return new ProfileCollectionState(listState2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 39489, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ProfileCollectionState) && Intrinsics.areEqual((Object) this.profileCollectionItemStructListState, (Object) ((ProfileCollectionState) obj).profileCollectionItemStructListState));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 39489, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39488, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39488, new Class[0], Integer.TYPE)).intValue();
        }
        ListState<f, k> listState = this.profileCollectionItemStructListState;
        if (listState != null) {
            i = listState.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 39487, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 39487, new Class[0], String.class);
        }
        return "ProfileCollectionState(profileCollectionItemStructListState=" + this.profileCollectionItemStructListState + ")";
    }

    @NotNull
    public final ListState<f, k> getProfileCollectionItemStructListState() {
        return this.profileCollectionItemStructListState;
    }

    public ProfileCollectionState(@NotNull ListState<f, k> listState) {
        Intrinsics.checkParameterIsNotNull(listState, "profileCollectionItemStructListState");
        this.profileCollectionItemStructListState = listState;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProfileCollectionState(com.bytedance.jedi.arch.ext.list.ListState r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.model.ProfileCollectionState.<init>(com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
