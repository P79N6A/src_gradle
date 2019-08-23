package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "Lcom/bytedance/jedi/arch/State;", "isSearching", "", "connectedRelationCount", "", "isFollowingTab", "(ZIZ)V", "getConnectedRelationCount", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowRelationState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int connectedRelationCount;
    private final boolean isFollowingTab;
    private final boolean isSearching;

    public FollowRelationState() {
        this(false, 0, false, 7, null);
    }

    public static /* synthetic */ FollowRelationState copy$default(FollowRelationState followRelationState, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = followRelationState.isSearching;
        }
        if ((i2 & 2) != 0) {
            i = followRelationState.connectedRelationCount;
        }
        if ((i2 & 4) != 0) {
            z2 = followRelationState.isFollowingTab;
        }
        return followRelationState.copy(z, i, z2);
    }

    public final boolean component1() {
        return this.isSearching;
    }

    public final int component2() {
        return this.connectedRelationCount;
    }

    public final boolean component3() {
        return this.isFollowingTab;
    }

    @NotNull
    public final FollowRelationState copy(boolean z, int i, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 45218, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, FollowRelationState.class)) {
            return new FollowRelationState(z, i, z2);
        }
        return (FollowRelationState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Byte.valueOf(z2)}, this, changeQuickRedirect, false, 45218, new Class[]{Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, FollowRelationState.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof FollowRelationState) {
                FollowRelationState followRelationState = (FollowRelationState) obj;
                if (this.isSearching == followRelationState.isSearching) {
                    if (this.connectedRelationCount == followRelationState.connectedRelationCount) {
                        if (this.isFollowingTab == followRelationState.isFollowingTab) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isSearching;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (((z ? 1 : 0) * true) + this.connectedRelationCount) * 31;
        boolean z3 = this.isFollowingTab;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45219, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45219, new Class[0], String.class);
        }
        return "FollowRelationState(isSearching=" + this.isSearching + ", connectedRelationCount=" + this.connectedRelationCount + ", isFollowingTab=" + this.isFollowingTab + ")";
    }

    public final int getConnectedRelationCount() {
        return this.connectedRelationCount;
    }

    public final boolean isFollowingTab() {
        return this.isFollowingTab;
    }

    public final boolean isSearching() {
        return this.isSearching;
    }

    public FollowRelationState(boolean z, int i, boolean z2) {
        this.isSearching = z;
        this.connectedRelationCount = i;
        this.isFollowingTab = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRelationState(boolean z, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z2);
    }
}
