package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerItemState;", "Lcom/bytedance/jedi/arch/State;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowerItemState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final User user;

    public FollowerItemState() {
        this(null, 1, null);
    }

    public static /* synthetic */ FollowerItemState copy$default(FollowerItemState followerItemState, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = followerItemState.user;
        }
        return followerItemState.copy(user2);
    }

    @NotNull
    public final User component1() {
        return this.user;
    }

    @NotNull
    public final FollowerItemState copy(@NotNull User user2) {
        User user3 = user2;
        if (PatchProxy.isSupport(new Object[]{user3}, this, changeQuickRedirect, false, 45227, new Class[]{User.class}, FollowerItemState.class)) {
            return (FollowerItemState) PatchProxy.accessDispatch(new Object[]{user3}, this, changeQuickRedirect, false, 45227, new Class[]{User.class}, FollowerItemState.class);
        }
        Intrinsics.checkParameterIsNotNull(user3, AllStoryActivity.f73306b);
        return new FollowerItemState(user3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45230, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof FollowerItemState) && Intrinsics.areEqual((Object) this.user, (Object) ((FollowerItemState) obj).user));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45230, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45229, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45229, new Class[0], Integer.TYPE)).intValue();
        }
        User user2 = this.user;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45228, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45228, new Class[0], String.class);
        }
        return "FollowerItemState(user=" + this.user + ")";
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }

    public FollowerItemState(@NotNull User user2) {
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        this.user = user2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowerItemState(User user2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new User() : user2);
    }
}
