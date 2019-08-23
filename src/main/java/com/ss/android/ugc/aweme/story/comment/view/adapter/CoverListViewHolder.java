package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;

public class CoverListViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72252a;

    /* renamed from: b  reason: collision with root package name */
    Context f72253b;

    /* renamed from: c  reason: collision with root package name */
    LifeStory f72254c;

    /* renamed from: d  reason: collision with root package name */
    RemoteImageView f72255d;

    public CoverListViewHolder(View view) {
        super(view);
        this.f72253b = view.getContext();
        this.f72255d = (RemoteImageView) view.findViewById(C0906R.id.b6f);
    }
}
