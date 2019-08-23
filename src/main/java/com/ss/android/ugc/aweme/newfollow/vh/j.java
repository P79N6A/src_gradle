package com.ss.android.ugc.aweme.newfollow.vh;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.views.MentionTextView;
import java.util.List;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57722a;

    /* renamed from: b  reason: collision with root package name */
    private final CommentFollowFeedMomentViewHolder f57723b;

    /* renamed from: c  reason: collision with root package name */
    private final Comment f57724c;

    public j(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, Comment comment) {
        this.f57723b = commentFollowFeedMomentViewHolder;
        this.f57724c = comment;
    }

    public final void run() {
        String str;
        List<TextExtraStruct> list;
        if (PatchProxy.isSupport(new Object[0], this, f57722a, false, 62099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57722a, false, 62099, new Class[0], Void.TYPE);
            return;
        }
        CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = this.f57723b;
        Comment comment = this.f57724c;
        if (y.a()) {
            str = commentFollowFeedMomentViewHolder.f57493b.getDisplayTextForIns(commentFollowFeedMomentViewHolder.mTvComment.getPaint(), commentFollowFeedMomentViewHolder.mTvComment.getMeasuredWidth());
        } else {
            str = commentFollowFeedMomentViewHolder.f57493b.getDisplayTextForMoment(commentFollowFeedMomentViewHolder.mTvComment.getPaint(), commentFollowFeedMomentViewHolder.mTvComment.getMeasuredWidth());
        }
        if (!TextUtils.isEmpty(str)) {
            commentFollowFeedMomentViewHolder.mTvComment.setText(str);
            g.a((TextView) commentFollowFeedMomentViewHolder.mTvComment);
        }
        if (comment.hasTextExtra()) {
            commentFollowFeedMomentViewHolder.mTvComment.setSpanColor(commentFollowFeedMomentViewHolder.mTvComment.getResources().getColor(C0906R.color.zm));
            commentFollowFeedMomentViewHolder.mTvComment.setOnSpanClickListener(new k(commentFollowFeedMomentViewHolder));
            MentionTextView mentionTextView = commentFollowFeedMomentViewHolder.mTvComment;
            if (y.a()) {
                list = comment.getDisplayTextExtraForIns();
            } else {
                list = comment.getDispalyTextExtraForMoment();
            }
            AbTestManager.a();
            mentionTextView.a(list, (MentionTextView.d) new f(true));
            commentFollowFeedMomentViewHolder.mTvComment.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
