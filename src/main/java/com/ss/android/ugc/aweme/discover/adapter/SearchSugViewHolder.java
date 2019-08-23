package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.ui.ak;

public class SearchSugViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41887a;

    /* renamed from: b  reason: collision with root package name */
    public long f41888b;

    /* renamed from: c  reason: collision with root package name */
    public ak.d f41889c;
    @BindView(2131498174)
    TextView mSugView;

    public SearchSugViewHolder(View view, ak.d dVar) {
        super(view);
        this.f41889c = dVar;
        ButterKnife.bind((Object) this, view);
    }
}
