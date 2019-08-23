package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class PoiDcdProductViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59558a;
    @BindView(2131494899)
    public RemoteImageView mImage;
    @BindView(2131494901)
    public TextView mName;
    @BindView(2131494902)
    public TextView mPrice;
    @BindView(2131494903)
    public TextView mSalesPromotion;
    @BindView(2131494904)
    public TextView mSubmitButton;

    public PoiDcdProductViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
    }
}
