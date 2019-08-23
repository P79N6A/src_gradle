package com.ss.android.ugc.aweme.newfollow.userstate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanD;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/userstate/UserStateInsFollowVideoViewHolderPlanD;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowVideoViewHolderPlanD;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "isMyProfile", "", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;Z)V", "()Z", "getEventType", "", "getFrom", "getPageType", "", "getUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStateInsFollowVideoViewHolderPlanD extends InsFollowVideoViewHolderPlanD {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f57383b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f57384c;

    @NotNull
    public final String D_() {
        return "from_user_state_tab";
    }

    public final int e() {
        return 5;
    }

    @NotNull
    public final String d() {
        if (this.f57384c) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    @NotNull
    public final String g() {
        if (PatchProxy.isSupport(new Object[0], this, f57383b, false, 61855, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f57383b, false, 61855, new Class[0], String.class);
        }
        Aweme aweme = this.j;
        Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
        String authorUid = aweme.getAuthorUid();
        Intrinsics.checkExpressionValueIsNotNull(authorUid, "mAweme.authorUid");
        return authorUid;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserStateInsFollowVideoViewHolderPlanD(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2, @NotNull d dVar, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        this.f57384c = z;
    }
}
