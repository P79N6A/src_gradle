package com.ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioFollowImageViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/userstate/UserStateFixRatioFollowImageViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FixRatioFollowImageViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "isMyProfile", "", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Z)V", "()Z", "setMyProfile", "(Z)V", "bindExtraView", "", "getEventType", "", "getFrom", "getPageType", "", "getUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStateFixRatioFollowImageViewHolder extends FixRatioFollowImageViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57353a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f57354b;

    @NotNull
    public final String c() {
        return "from_user_state_tab";
    }

    public final int e() {
        return 5;
    }

    @NotNull
    public final String d() {
        if (this.f57354b) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57353a, false, 61802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57353a, false, 61802, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.q;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mIvExtraBtn");
        imageView.setVisibility(8);
    }

    @NotNull
    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f57353a, false, 61803, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57353a, false, 61803, new Class[0], String.class);
        }
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        Intrinsics.checkExpressionValueIsNotNull(authorUid, "mAweme.authorUid");
        return authorUid;
    }

    public UserStateFixRatioFollowImageViewHolder(@Nullable FollowFeedLayout followFeedLayout, @Nullable a aVar, @Nullable l lVar, @Nullable com.ss.android.ugc.aweme.newfollow.b.a aVar2, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2);
        this.f57354b = z;
    }
}
