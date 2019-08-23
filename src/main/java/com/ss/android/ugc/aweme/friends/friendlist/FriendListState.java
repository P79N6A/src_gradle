package com.ss.android.ugc.aweme.friends.friendlist;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.adapter.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bHÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001e\b\u0002\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R'\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListState;", "Lcom/bytedance/jedi/arch/State;", "nickNameModifiable", "", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/friends/adapter/FriendList;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListState;", "(ZLcom/bytedance/jedi/arch/ext/list/ListState;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getNickNameModifiable", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<c, k> listState;
    private final boolean nickNameModifiable;

    public FriendListState() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ FriendListState copy$default(FriendListState friendListState, boolean z, ListState<c, k> listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = friendListState.nickNameModifiable;
        }
        if ((i & 2) != 0) {
            listState2 = friendListState.listState;
        }
        return friendListState.copy(z, listState2);
    }

    public final boolean component1() {
        return this.nickNameModifiable;
    }

    @NotNull
    public final ListState<c, k> component2() {
        return this.listState;
    }

    @NotNull
    public final FriendListState copy(boolean z, @NotNull ListState<c, k> listState2) {
        ListState<c, k> listState3 = listState2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), listState3}, this, changeQuickRedirect, false, 46468, new Class[]{Boolean.TYPE, ListState.class}, FriendListState.class)) {
            return (FriendListState) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), listState3}, this, changeQuickRedirect, false, 46468, new Class[]{Boolean.TYPE, ListState.class}, FriendListState.class);
        }
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        return new FriendListState(z, listState3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46471, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46471, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof FriendListState) {
                FriendListState friendListState = (FriendListState) obj;
                if (!(this.nickNameModifiable == friendListState.nickNameModifiable) || !Intrinsics.areEqual((Object) this.listState, (Object) friendListState.listState)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46470, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46470, new Class[0], Integer.TYPE)).intValue();
        }
        boolean z = this.nickNameModifiable;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        ListState<c, k> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46469, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46469, new Class[0], String.class);
        }
        return "FriendListState(nickNameModifiable=" + this.nickNameModifiable + ", listState=" + this.listState + ")";
    }

    @NotNull
    public final ListState<c, k> getListState() {
        return this.listState;
    }

    public final boolean getNickNameModifiable() {
        return this.nickNameModifiable;
    }

    public FriendListState(boolean z, @NotNull ListState<c, k> listState2) {
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        this.nickNameModifiable = z;
        this.listState = listState2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FriendListState(boolean r10, com.bytedance.jedi.arch.ext.list.ListState r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r9 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0006
            r10 = 0
        L_0x0006:
            r12 = r12 & 2
            if (r12 == 0) goto L_0x001d
            com.bytedance.jedi.arch.ext.list.k r2 = new com.bytedance.jedi.arch.ext.list.k
            r11 = 3
            r2.<init>(r0, r0, r11)
            com.bytedance.jedi.arch.ext.list.ListState r11 = new com.bytedance.jedi.arch.ext.list.ListState
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x001d:
            r9.<init>(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.friendlist.FriendListState.<init>(boolean, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
