package com.ss.android.ugc.aweme.comment.adapter;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.Map;

public final /* synthetic */ class f implements MentionTextView.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36350a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentReplyViewHolder f36351b;

    f(CommentReplyViewHolder commentReplyViewHolder) {
        this.f36351b = commentReplyViewHolder;
    }

    public final void a(View view, TextExtraStruct textExtraStruct) {
        if (PatchProxy.isSupport(new Object[]{view, textExtraStruct}, this, f36350a, false, 27243, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, textExtraStruct}, this, f36350a, false, 27243, new Class[]{View.class, TextExtraStruct.class}, Void.TYPE);
            return;
        }
        CommentReplyViewHolder commentReplyViewHolder = this.f36351b;
        if (p.a().e() != null) {
            h a2 = h.a();
            Activity e2 = p.a().e();
            a2.a(e2, j.a("aweme://user/profile/" + textExtraStruct.getUserId()).a("sec_user_id", textExtraStruct.getSecUid()).a());
        }
        r.a(commentReplyViewHolder.mContentView.getContext(), "name", "comment_at", textExtraStruct.getUserId(), 0);
        r.a("enter_personal_detail", (Map) d.a().a("enter_from", commentReplyViewHolder.f36299e).a("to_user_id", textExtraStruct.getUserId()).a("group_id", commentReplyViewHolder.f36300f).a("author_id", commentReplyViewHolder.g).a("enter_method", "comment_at").f34114b);
    }
}
