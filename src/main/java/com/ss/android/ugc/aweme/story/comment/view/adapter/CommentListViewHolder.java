package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.story.api.model.g;
import com.ss.android.ugc.aweme.story.feed.view.ui.comment.StoryCommentView;

public class CommentListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72247a;

    /* renamed from: b  reason: collision with root package name */
    Context f72248b;

    /* renamed from: c  reason: collision with root package name */
    AvatarImageView f72249c;

    /* renamed from: d  reason: collision with root package name */
    StoryCommentView f72250d;

    /* renamed from: e  reason: collision with root package name */
    g f72251e;

    public CommentListViewHolder(View view) {
        super(view);
        this.f72249c = (AvatarImageView) view.findViewById(C0906R.id.hk);
        this.f72250d = (StoryCommentView) view.findViewById(C0906R.id.vo);
        this.f72248b = view.getContext();
    }
}
