package com.ss.android.ugc.aweme.user.repository;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/UserState;", "Lcom/bytedance/jedi/arch/State;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "followerIsRemoved", "", "followStatus", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "remarkName", "", "(Lcom/ss/android/ugc/aweme/profile/model/User;ZLcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/Async;)V", "getFollowStatus", "()Lcom/bytedance/jedi/arch/Async;", "getFollowerIsRemoved", "()Z", "getRemarkName", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a<FollowStatus> followStatus;
    private final boolean followerIsRemoved;
    @NotNull
    private final a<String> remarkName;
    @NotNull
    private final User user;

    public UserState() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ UserState copy$default(UserState userState, User user2, boolean z, a<FollowStatus> aVar, a<String> aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = userState.user;
        }
        if ((i & 2) != 0) {
            z = userState.followerIsRemoved;
        }
        if ((i & 4) != 0) {
            aVar = userState.followStatus;
        }
        if ((i & 8) != 0) {
            aVar2 = userState.remarkName;
        }
        return userState.copy(user2, z, aVar, aVar2);
    }

    @NotNull
    public final User component1() {
        return this.user;
    }

    public final boolean component2() {
        return this.followerIsRemoved;
    }

    @NotNull
    public final a<FollowStatus> component3() {
        return this.followStatus;
    }

    @NotNull
    public final a<String> component4() {
        return this.remarkName;
    }

    @NotNull
    public final UserState copy(@NotNull User user2, boolean z, @NotNull a<? extends FollowStatus> aVar, @NotNull a<String> aVar2) {
        User user3 = user2;
        a<? extends FollowStatus> aVar3 = aVar;
        a<String> aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{user3, Byte.valueOf(z ? (byte) 1 : 0), aVar3, aVar4}, this, changeQuickRedirect, false, 87690, new Class[]{User.class, Boolean.TYPE, a.class, a.class}, UserState.class)) {
            return (UserState) PatchProxy.accessDispatch(new Object[]{user3, Byte.valueOf(z), aVar3, aVar4}, this, changeQuickRedirect, false, 87690, new Class[]{User.class, Boolean.TYPE, a.class, a.class}, UserState.class);
        }
        Intrinsics.checkParameterIsNotNull(user3, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(aVar3, "followStatus");
        Intrinsics.checkParameterIsNotNull(aVar4, "remarkName");
        return new UserState(user3, z, aVar3, aVar4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 87693, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 87693, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof UserState) {
                UserState userState = (UserState) obj;
                if (Intrinsics.areEqual((Object) this.user, (Object) userState.user)) {
                    if (!(this.followerIsRemoved == userState.followerIsRemoved) || !Intrinsics.areEqual((Object) this.followStatus, (Object) userState.followStatus) || !Intrinsics.areEqual((Object) this.remarkName, (Object) userState.remarkName)) {
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
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87692, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87692, new Class[0], Integer.TYPE)).intValue();
        }
        User user2 = this.user;
        int hashCode = (user2 != null ? user2.hashCode() : 0) * 31;
        boolean z = this.followerIsRemoved;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        a<FollowStatus> aVar = this.followStatus;
        int hashCode2 = (i2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<String> aVar2 = this.remarkName;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 87691, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 87691, new Class[0], String.class);
        }
        return "UserState(user=" + this.user + ", followerIsRemoved=" + this.followerIsRemoved + ", followStatus=" + this.followStatus + ", remarkName=" + this.remarkName + ")";
    }

    @NotNull
    public final a<FollowStatus> getFollowStatus() {
        return this.followStatus;
    }

    public final boolean getFollowerIsRemoved() {
        return this.followerIsRemoved;
    }

    @NotNull
    public final a<String> getRemarkName() {
        return this.remarkName;
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }

    public UserState(@NotNull User user2, boolean z, @NotNull a<? extends FollowStatus> aVar, @NotNull a<String> aVar2) {
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        Intrinsics.checkParameterIsNotNull(aVar, "followStatus");
        Intrinsics.checkParameterIsNotNull(aVar2, "remarkName");
        this.user = user2;
        this.followerIsRemoved = z;
        this.followStatus = aVar;
        this.remarkName = aVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserState(User user2, boolean z, a aVar, a aVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new User() : user2, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ad.f21345a : aVar, (i & 8) != 0 ? ad.f21345a : aVar2);
    }
}
