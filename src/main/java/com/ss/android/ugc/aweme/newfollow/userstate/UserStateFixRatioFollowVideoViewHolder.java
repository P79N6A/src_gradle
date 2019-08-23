package com.ss.android.ugc.aweme.newfollow.userstate;

import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FixRatioFollowVideoViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/userstate/UserStateFixRatioFollowVideoViewHolder;", "Lcom/ss/android/ugc/aweme/newfollow/vh/FixRatioFollowVideoViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "isMyProfile", "", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;Z)V", "()Z", "setMyProfile", "(Z)V", "bindExtraView", "", "getEventType", "", "getFrom", "getPageType", "", "getUserId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStateFixRatioFollowVideoViewHolder extends FixRatioFollowVideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57355a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f57356b;

    @NotNull
    public final String D_() {
        return "from_user_state_tab";
    }

    public final int e() {
        return 5;
    }

    @NotNull
    public final String d() {
        if (this.f57356b) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f57355a, false, 61804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57355a, false, 61804, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.q;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "mIvExtraBtn");
        imageView.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r0 == null) goto L_0x0032;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f57355a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 61805(0xf16d, float:8.6607E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f57355a
            r5 = 0
            r6 = 61805(0xf16d, float:8.6607E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.j
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r0.getAuthorUid()
            if (r0 != 0) goto L_0x0034
        L_0x0032:
            java.lang.String r0 = ""
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.userstate.UserStateFixRatioFollowVideoViewHolder.g():java.lang.String");
    }

    public UserStateFixRatioFollowVideoViewHolder(@Nullable FollowFeedLayout followFeedLayout, @Nullable a aVar, @Nullable l lVar, @Nullable com.ss.android.ugc.aweme.newfollow.b.a aVar2, @Nullable d dVar, boolean z) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
        this.f57356b = z;
    }
}
