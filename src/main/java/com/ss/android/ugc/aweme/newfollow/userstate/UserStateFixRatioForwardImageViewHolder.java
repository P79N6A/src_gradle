package com.ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioImageForwardFeedViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/userstate/UserStateFixRatioForwardImageViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FixRatioImageForwardFeedViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "isMyProfile", "", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Z)V", "()Z", "setMyProfile", "(Z)V", "bindExtraView", "", "getEventType", "", "getFrom", "getPageType", "", "getUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStateFixRatioForwardImageViewHolder extends FixRatioImageForwardFeedViewHolder {
    public static ChangeQuickRedirect u;
    public boolean v;

    public final int N() {
        return 5;
    }

    @NotNull
    public final String O() {
        return "from_user_state_tab";
    }

    @NotNull
    public final String t() {
        if (this.v) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @NotNull
    public final String q() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 61807, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, u, false, 61807, new Class[0], String.class);
        }
        Aweme aweme = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        Intrinsics.checkExpressionValueIsNotNull(authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 61806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 61806, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.mIvExtraBtn;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStateFixRatioForwardImageViewHolder(@Nullable FollowFeedLayout followFeedLayout, @Nullable a aVar, @Nullable l lVar, @NotNull BaseFollowViewHolder.a aVar2, @Nullable com.ss.android.ugc.aweme.newfollow.b.a aVar3, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        this.v = z;
    }
}
