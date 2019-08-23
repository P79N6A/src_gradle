package com.ss.android.ugc.aweme.newfollow.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.ui.CommentLikeListView;
import com.ss.android.ugc.aweme.profile.model.User;

public final /* synthetic */ class b implements CommentLikeListView.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57297a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentLikeListView f57298b;

    /* renamed from: c  reason: collision with root package name */
    private final User f57299c;

    b(CommentLikeListView commentLikeListView, User user) {
        this.f57298b = commentLikeListView;
        this.f57299c = user;
    }

    public final void a(View view, User user) {
        if (PatchProxy.isSupport(new Object[]{view, user}, this, f57297a, false, 61447, new Class[]{View.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, user}, this, f57297a, false, 61447, new Class[]{View.class, User.class}, Void.TYPE);
            return;
        }
        this.f57298b.a(this.f57299c);
    }
}
