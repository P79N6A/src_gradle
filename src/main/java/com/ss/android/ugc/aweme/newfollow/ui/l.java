package com.ss.android.ugc.aweme.newfollow.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.ui.CommentLikeListView;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class l implements CommentLikeListView.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57310a;

    /* renamed from: b  reason: collision with root package name */
    private final InsCommentLikeListView f57311b;

    /* renamed from: c  reason: collision with root package name */
    private final User f57312c;

    l(InsCommentLikeListView insCommentLikeListView, User user) {
        this.f57311b = insCommentLikeListView;
        this.f57312c = user;
    }

    public final void a(View view, User user) {
        if (PatchProxy.isSupport(new Object[]{view, user}, this, f57310a, false, 61665, new Class[]{View.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, user}, this, f57310a, false, 61665, new Class[]{View.class, User.class}, Void.TYPE);
            return;
        }
        this.f57311b.b(this.f57312c);
    }
}
