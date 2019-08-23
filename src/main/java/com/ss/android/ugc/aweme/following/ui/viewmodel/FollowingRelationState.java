package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.following.repository.i;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowingRelationState;", "Lcom/bytedance/jedi/arch/State;", "userId", "", "isSelf", "", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "(Ljava/lang/String;ZLcom/bytedance/jedi/arch/ext/list/ListState;)V", "()Z", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowingRelationState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final boolean isSelf;
    @NotNull
    private final ListState<User, i> listState;
    @NotNull
    private final String userId;

    public FollowingRelationState() {
        this(null, false, null, 7, null);
    }

    public static /* synthetic */ FollowingRelationState copy$default(FollowingRelationState followingRelationState, String str, boolean z, ListState<User, i> listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followingRelationState.userId;
        }
        if ((i & 2) != 0) {
            z = followingRelationState.isSelf;
        }
        if ((i & 4) != 0) {
            listState2 = followingRelationState.listState;
        }
        return followingRelationState.copy(str, z, listState2);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    public final boolean component2() {
        return this.isSelf;
    }

    @NotNull
    public final ListState<User, i> component3() {
        return this.listState;
    }

    @NotNull
    public final FollowingRelationState copy(@NotNull String str, boolean z, @NotNull ListState<User, i> listState2) {
        String str2 = str;
        ListState<User, i> listState3 = listState2;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), listState3}, this, changeQuickRedirect, false, 45251, new Class[]{String.class, Boolean.TYPE, ListState.class}, FollowingRelationState.class)) {
            return (FollowingRelationState) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), listState3}, this, changeQuickRedirect, false, 45251, new Class[]{String.class, Boolean.TYPE, ListState.class}, FollowingRelationState.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        return new FollowingRelationState(str2, z, listState3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45254, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45254, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof FollowingRelationState) {
                FollowingRelationState followingRelationState = (FollowingRelationState) obj;
                if (Intrinsics.areEqual((Object) this.userId, (Object) followingRelationState.userId)) {
                    if (!(this.isSelf == followingRelationState.isSelf) || !Intrinsics.areEqual((Object) this.listState, (Object) followingRelationState.listState)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45253, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45253, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.userId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isSelf;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        ListState<User, i> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45252, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45252, new Class[0], String.class);
        }
        return "FollowingRelationState(userId=" + this.userId + ", isSelf=" + this.isSelf + ", listState=" + this.listState + ")";
    }

    @NotNull
    public final ListState<User, i> getListState() {
        return this.listState;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public FollowingRelationState(@NotNull String str, boolean z, @NotNull ListState<User, i> listState2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        this.userId = str;
        this.isSelf = z;
        this.listState = listState2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FollowingRelationState(java.lang.String r10, boolean r11, com.bytedance.jedi.arch.ext.list.ListState r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r9 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.String r10 = ""
        L_0x0006:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000b
            r11 = 0
        L_0x000b:
            r13 = r13 & 4
            if (r13 == 0) goto L_0x002e
            com.bytedance.jedi.arch.ext.list.ListState r12 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.following.repository.i r13 = new com.ss.android.ugc.aweme.following.repository.i
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 63
            r0 = r13
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r1 = r13
            com.bytedance.jedi.arch.ext.list.k r1 = (com.bytedance.jedi.arch.ext.list.k) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x002e:
            r9.<init>(r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState.<init>(java.lang.String, boolean, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
