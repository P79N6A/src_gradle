package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.Map;

public final /* synthetic */ class k implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57725a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentFollowFeedMomentViewHolder f57726b;

    k(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder) {
        this.f57726b = commentFollowFeedMomentViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f57725a, false, 62100, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f57725a, false, 62100, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f57726b;
        if (p.a().e() != null) {
            h a2 = h.a();
            Activity e2 = p.a().e();
            a2.a(e2, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a());
        }
        r.a(commentFollowFeedMomentViewHolder.mTvComment.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", commentFollowFeedMomentViewHolder.f57494c).a("to_user_id", textExtraStruct.getUserId()).a("group_id", commentFollowFeedMomentViewHolder.f57495d).a("author_id", commentFollowFeedMomentViewHolder.f57496e).a("enter_method", "click_comment_name").f34114b);
        z.a(z.c.PROFILE);
    }
}
