package com.ss.android.ugc.aweme.commercialize.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.commercialize.views.AdCommentView;
import java.lang.ref.WeakReference;

public class AdCommentViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38479a;

    /* renamed from: b  reason: collision with root package name */
    public AdCommentView f38480b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<CommentViewHolder.a> f38481c;

    public AdCommentViewHolder(View view, CommentViewHolder.a aVar) {
        super(view);
        this.f38480b = (AdCommentView) view;
        this.f38481c = new WeakReference<>(aVar);
    }
}
