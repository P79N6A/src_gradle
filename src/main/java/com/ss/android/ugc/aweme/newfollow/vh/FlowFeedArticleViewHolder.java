package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.newfollow.adapter.FlowFeedArticleAdapter;

public class FlowFeedArticleViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57523a;

    /* renamed from: b  reason: collision with root package name */
    public FlowFeedArticleAdapter f57524b;

    /* renamed from: c  reason: collision with root package name */
    public a f57525c;
    @BindView(2131496665)
    public RecyclerView mRecyclerView;

    public interface a {
        void a(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i);

        void b(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i);
    }

    public FlowFeedArticleViewHolder(View view, a aVar) {
        super(view);
        this.f57525c = aVar;
        ButterKnife.bind((Object) this, view);
    }
}
