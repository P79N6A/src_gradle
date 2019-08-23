package com.ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.poi.model.al;

public class PoiBannerViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59487a;

    /* renamed from: b  reason: collision with root package name */
    public al f59488b;

    /* renamed from: c  reason: collision with root package name */
    a f59489c;
    @BindView(2131496925)
    public RemoteImageView mSdCover;
    @BindView(2131498597)
    public DmtTextView mWaterMark;

    public interface a {
        void a();
    }

    public PoiBannerViewHolder(View view, a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f59489c = aVar;
    }
}
