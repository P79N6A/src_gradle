package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;

public class PoiCommentMoreViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59517a;

    /* renamed from: b  reason: collision with root package name */
    public Context f59518b;
    @BindView(2131496213)
    public TextView mTxtMore;

    public PoiCommentMoreViewHolder(View view) {
        super(view);
        this.f59518b = view.getContext();
        ButterKnife.bind((Object) this, view);
    }
}
