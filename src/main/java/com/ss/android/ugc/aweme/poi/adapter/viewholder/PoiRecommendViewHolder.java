package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.poi.a.i;
import com.ss.android.ugc.aweme.poi.adapter.RecommendImageAdapter;
import com.ss.android.ugc.aweme.poi.c;

public class PoiRecommendViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59626a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59627b;

    /* renamed from: c  reason: collision with root package name */
    public i f59628c;

    /* renamed from: d  reason: collision with root package name */
    public c f59629d;

    /* renamed from: e  reason: collision with root package name */
    public RecommendImageAdapter f59630e;
    @BindView(2131496237)
    public LinearLayout mRecommendLayout;

    public PoiRecommendViewHolder(View view) {
        super(view);
        this.f59627b = view.getContext();
        ButterKnife.bind((Object) this, view);
    }
}
