package com.ss.android.ugc.aweme.forward.b;

import android.app.Activity;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.e.n;
import com.ss.android.ugc.aweme.comment.e.p;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.h.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.forward.b.a$a  reason: collision with other inner class name */
    public interface C0024a {
        BaseFollowViewHolder.a a();

        CommentViewHolder.a b();

        d c();

        void d();

        void e();

        String f();
    }

    public interface b {
        CommentReplyButtonViewHolder a(int i);

        void a(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment);

        void a(String str, boolean z);

        void a(boolean z);

        AbsFragment b();

        void c(Comment comment);

        void d(Comment comment);

        Activity i();

        boolean isViewValid();

        t j();

        b k();

        n l();

        p m();

        Aweme n();
    }
}
