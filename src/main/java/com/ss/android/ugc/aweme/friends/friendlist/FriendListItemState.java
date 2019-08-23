package com.ss.android.ugc.aweme.friends.friendlist;

import android.content.Context;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0013\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u0011HÖ\u0001J\t\u0010.\u001a\u00020\rHÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000fR\u0011\u0010\u001f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b \u0010\u000fR\u0011\u0010!\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000fR\u0011\u0010#\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "Lcom/bytedance/jedi/arch/State;", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "(Lcom/ss/android/ugc/aweme/profile/model/User;)V", "avatarMedium", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getAvatarMedium", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "followInfo", "", "getFollowInfo", "()Ljava/lang/String;", "followStatus", "", "getFollowStatus", "()I", "followerStatus", "getFollowerStatus", "nickName", "getNickName", "recommendAwemeItems", "", "Lcom/ss/android/ugc/aweme/profile/model/RecommendAwemeItem;", "getRecommendAwemeItems", "()Ljava/util/List;", "recommendReason", "getRecommendReason", "remarkName", "getRemarkName", "signature", "getSignature", "updateCount", "getUpdateCount", "getUser", "()Lcom/ss/android/ugc/aweme/profile/model/User;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListItemState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context context;
    @NotNull
    private final User user;

    public FriendListItemState() {
        this(null, 1, null);
    }

    public static /* synthetic */ FriendListItemState copy$default(FriendListItemState friendListItemState, User user2, int i, Object obj) {
        if ((i & 1) != 0) {
            user2 = friendListItemState.user;
        }
        return friendListItemState.copy(user2);
    }

    @NotNull
    public final User component1() {
        return this.user;
    }

    @NotNull
    public final FriendListItemState copy(@NotNull User user2) {
        User user3 = user2;
        if (PatchProxy.isSupport(new Object[]{user3}, this, changeQuickRedirect, false, 46392, new Class[]{User.class}, FriendListItemState.class)) {
            return (FriendListItemState) PatchProxy.accessDispatch(new Object[]{user3}, this, changeQuickRedirect, false, 46392, new Class[]{User.class}, FriendListItemState.class);
        }
        Intrinsics.checkParameterIsNotNull(user3, AllStoryActivity.f73306b);
        return new FriendListItemState(user3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46395, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof FriendListItemState) && Intrinsics.areEqual((Object) this.user, (Object) ((FriendListItemState) obj).user));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46395, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46394, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46394, new Class[0], Integer.TYPE)).intValue();
        }
        User user2 = this.user;
        if (user2 != null) {
            i = user2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46393, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46393, new Class[0], String.class);
        }
        return "FriendListItemState(user=" + this.user + ")";
    }

    @NotNull
    public final User getUser() {
        return this.user;
    }

    @Nullable
    public final UrlModel getAvatarMedium() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46386, new Class[0], UrlModel.class)) {
            return this.user.getAvatarMedium();
        }
        return (UrlModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46386, new Class[0], UrlModel.class);
    }

    public final int getFollowStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46382, new Class[0], Integer.TYPE)) {
            return this.user.getFollowStatus();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46382, new Class[0], Integer.TYPE)).intValue();
    }

    public final int getFollowerStatus() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46383, new Class[0], Integer.TYPE)) {
            return this.user.getFollowerStatus();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46383, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final String getNickName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46388, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46388, new Class[0], String.class);
        }
        String nickname = this.user.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        return nickname;
    }

    @NotNull
    public final List<RecommendAwemeItem> getRecommendAwemeItems() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46391, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46391, new Class[0], List.class);
        }
        List<RecommendAwemeItem> recommendAwemeItems = this.user.getRecommendAwemeItems();
        if (recommendAwemeItems == null) {
            recommendAwemeItems = CollectionsKt.emptyList();
        }
        return recommendAwemeItems;
    }

    @NotNull
    public final String getRecommendReason() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46390, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46390, new Class[0], String.class);
        }
        String recommendReason = this.user.getRecommendReason();
        if (recommendReason == null) {
            recommendReason = "";
        }
        return recommendReason;
    }

    @NotNull
    public final String getRemarkName() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46387, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46387, new Class[0], String.class);
        }
        String remarkName = this.user.getRemarkName();
        if (remarkName == null) {
            remarkName = "";
        }
        return remarkName;
    }

    @NotNull
    public final String getSignature() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46385, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46385, new Class[0], String.class);
        }
        String signature = this.user.getSignature();
        if (signature == null) {
            signature = "";
        }
        return signature;
    }

    public final int getUpdateCount() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46384, new Class[0], Integer.TYPE)) {
            return b.a().getUpdateTagCount(this.user.getUid());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46384, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final String getFollowInfo() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46389, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46389, new Class[0], String.class);
        }
        return this.context.getString(C0906R.string.du7) + ':' + com.ss.android.ugc.aweme.i18n.b.a((long) this.user.getAwemeCount()) + "  " + this.context.getString(C0906R.string.agu) + ':' + com.ss.android.ugc.aweme.i18n.b.a((long) this.user.getFollowerCount());
    }

    public FriendListItemState(@NotNull User user2) {
        Intrinsics.checkParameterIsNotNull(user2, AllStoryActivity.f73306b);
        this.user = user2;
        this.context = k.g();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FriendListItemState(User user2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new User() : user2);
    }
}
