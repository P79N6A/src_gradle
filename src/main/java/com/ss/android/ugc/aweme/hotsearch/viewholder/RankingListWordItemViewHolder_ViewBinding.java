package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class RankingListWordItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49955a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListWordItemViewHolder f49956b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49955a, false, 49897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49955a, false, 49897, new Class[0], Void.TYPE);
            return;
        }
        RankingListWordItemViewHolder rankingListWordItemViewHolder = this.f49956b;
        if (rankingListWordItemViewHolder != null) {
            this.f49956b = null;
            rankingListWordItemViewHolder.mRootView = null;
            rankingListWordItemViewHolder.mNumView = null;
            rankingListWordItemViewHolder.mPlaceHolder = null;
            rankingListWordItemViewHolder.mImagePlaceHolder = null;
            rankingListWordItemViewHolder.mContentContainer = null;
            rankingListWordItemViewHolder.mContentView = null;
            rankingListWordItemViewHolder.mCountView = null;
            rankingListWordItemViewHolder.mImageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListWordItemViewHolder_ViewBinding(RankingListWordItemViewHolder rankingListWordItemViewHolder, View view) {
        this.f49956b = rankingListWordItemViewHolder;
        rankingListWordItemViewHolder.mRootView = Utils.findRequiredView(view, C0906R.id.bgy, "field 'mRootView'");
        rankingListWordItemViewHolder.mNumView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dfl, "field 'mNumView'", TextView.class);
        rankingListWordItemViewHolder.mPlaceHolder = Utils.findRequiredView(view, C0906R.id.bhg, "field 'mPlaceHolder'");
        rankingListWordItemViewHolder.mImagePlaceHolder = Utils.findRequiredView(view, C0906R.id.duc, "field 'mImagePlaceHolder'");
        rankingListWordItemViewHolder.mContentContainer = Utils.findRequiredView(view, C0906R.id.bg4, "field 'mContentContainer'");
        rankingListWordItemViewHolder.mContentView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.da0, "field 'mContentView'", TextView.class);
        rankingListWordItemViewHolder.mCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.daa, "field 'mCountView'", TextView.class);
        rankingListWordItemViewHolder.mImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b2e, "field 'mImageView'", RemoteImageView.class);
    }
}
