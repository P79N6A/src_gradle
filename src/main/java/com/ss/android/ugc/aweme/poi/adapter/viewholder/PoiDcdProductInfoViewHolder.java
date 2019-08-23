package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.poi.a.g;

public class PoiDcdProductInfoViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59547a;

    /* renamed from: b  reason: collision with root package name */
    public int f59548b;

    /* renamed from: c  reason: collision with root package name */
    public Context f59549c;

    /* renamed from: d  reason: collision with root package name */
    public g f59550d;
    @BindView(2131494897)
    public TextView mAllProduct;
    @BindView(2131494896)
    public View mAllProductContainer;
    @BindView(2131494900)
    public RecyclerView mProductList;
    @BindView(2131494905)
    public TextView mTitle;

    public PoiDcdProductInfoViewHolder(View view) {
        super(view);
        this.f59549c = view.getContext();
        ButterKnife.bind((Object) this, view);
    }
}
