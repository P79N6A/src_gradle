package com.ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioVideoForwardFeedViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/userstate/UserStateFixRatioForwardVideoViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FixRatioVideoForwardFeedViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "isMyProfile", "", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/feed/DialogController;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Z)V", "()Z", "setMyProfile", "(Z)V", "bindExtraView", "", "getEventType", "", "getFrom", "getPageType", "", "getUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStateFixRatioForwardVideoViewHolder extends FixRatioVideoForwardFeedViewHolder {
    public static ChangeQuickRedirect u;
    public boolean v;

    public final int R() {
        return 5;
    }

    @NotNull
    public final String S() {
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
    public final String Q() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 61809, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, u, false, 61809, new Class[0], String.class);
        }
        Aweme aweme = this.f48319d;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        Intrinsics.checkExpressionValueIsNotNull(authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, u, false, 61808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, u, false, 61808, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.mIvExtraBtn;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStateFixRatioForwardVideoViewHolder(@Nullable FollowFeedLayout followFeedLayout, @Nullable a aVar, @Nullable d dVar, @Nullable l lVar, @NotNull BaseFollowViewHolder.a aVar2, @Nullable com.ss.android.ugc.aweme.newfollow.b.a aVar3, boolean z) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        this.v = z;
    }
}
