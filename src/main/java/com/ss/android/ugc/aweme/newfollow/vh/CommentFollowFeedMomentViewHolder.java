package com.ss.android.ugc.aweme.newfollow.vh;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class CommentFollowFeedMomentViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57492a;

    /* renamed from: b  reason: collision with root package name */
    public Comment f57493b;

    /* renamed from: c  reason: collision with root package name */
    public String f57494c;

    /* renamed from: d  reason: collision with root package name */
    public String f57495d;

    /* renamed from: e  reason: collision with root package name */
    public String f57496e;
    @BindView(2131497848)
    public MentionTextView mTvComment;

    public CommentFollowFeedMomentViewHolder(@NonNull View view, CommentViewHolder.a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        if (y.a()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTvComment.getLayoutParams();
            layoutParams.topMargin = (int) UIUtils.dip2Px(d.a(), 3.0f);
            this.mTvComment.setLayoutParams(layoutParams);
        }
        view.setOnClickListener(new i(this, aVar));
        this.mTvComment.setHighlightColor(this.mTvComment.getResources().getColor(C0906R.color.a7l));
        if (Build.VERSION.SDK_INT >= 23) {
            this.mTvComment.setBreakStrategy(0);
        }
    }
}
