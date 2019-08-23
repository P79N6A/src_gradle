package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.hotsearch.a.f;

public class HotVideoItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41654a;

    /* renamed from: b  reason: collision with root package name */
    f<Aweme> f41655b;

    /* renamed from: c  reason: collision with root package name */
    Aweme f41656c;

    /* renamed from: d  reason: collision with root package name */
    private String f41657d;
    @BindView(2131495067)
    AnimatedImageView mCover;
    @BindView(2131498076)
    TextView mRank;
    @BindView(2131498053)
    TextView mText;

    public HotVideoItemViewHolder(View view, String str, f<Aweme> fVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f41657d = str;
        this.f41655b = fVar;
    }
}
