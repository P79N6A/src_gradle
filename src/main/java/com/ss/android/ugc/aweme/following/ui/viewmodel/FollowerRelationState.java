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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationState;", "Lcom/bytedance/jedi/arch/State;", "userId", "", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "Lcom/ss/android/ugc/aweme/following/repository/RelationPayload;", "(Ljava/lang/String;Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowerRelationState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<User, i> listState;
    @NotNull
    private final String userId;

    public FollowerRelationState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FollowerRelationState copy$default(FollowerRelationState followerRelationState, String str, ListState<User, i> listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followerRelationState.userId;
        }
        if ((i & 2) != 0) {
            listState2 = followerRelationState.listState;
        }
        return followerRelationState.copy(str, listState2);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final ListState<User, i> component2() {
        return this.listState;
    }

    @NotNull
    public final FollowerRelationState copy(@NotNull String str, @NotNull ListState<User, i> listState2) {
        String str2 = str;
        ListState<User, i> listState3 = listState2;
        if (PatchProxy.isSupport(new Object[]{str2, listState3}, this, changeQuickRedirect, false, 45232, new Class[]{String.class, ListState.class}, FollowerRelationState.class)) {
            return (FollowerRelationState) PatchProxy.accessDispatch(new Object[]{str2, listState3}, this, changeQuickRedirect, false, 45232, new Class[]{String.class, ListState.class}, FollowerRelationState.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "userId");
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        return new FollowerRelationState(str2, listState3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45235, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45235, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof FollowerRelationState) {
                FollowerRelationState followerRelationState = (FollowerRelationState) obj;
                if (!Intrinsics.areEqual((Object) this.userId, (Object) followerRelationState.userId) || !Intrinsics.areEqual((Object) this.listState, (Object) followerRelationState.listState)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45234, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45234, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.userId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ListState<User, i> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45233, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45233, new Class[0], String.class);
        }
        return "FollowerRelationState(userId=" + this.userId + ", listState=" + this.listState + ")";
    }

    @NotNull
    public final ListState<User, i> getListState() {
        return this.listState;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public FollowerRelationState(@NotNull String str, @NotNull ListState<User, i> listState2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        this.userId = str;
        this.listState = listState2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FollowerRelationState(java.lang.String r10, com.bytedance.jedi.arch.ext.list.ListState r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r9 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0006
            java.lang.String r10 = ""
        L_0x0006:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x0029
            com.bytedance.jedi.arch.ext.list.ListState r11 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.following.repository.i r12 = new com.ss.android.ugc.aweme.following.repository.i
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 63
            r0 = r12
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r1 = r12
            com.bytedance.jedi.arch.ext.list.k r1 = (com.bytedance.jedi.arch.ext.list.k) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0029:
            r9.<init>(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState.<init>(java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
