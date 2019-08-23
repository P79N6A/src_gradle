package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class RankingListCoverViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41729a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListCoverViewHolder f41730b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41729a, false, 35731, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41729a, false, 35731, new Class[0], Void.TYPE);
            return;
        }
        RankingListCoverViewHolder rankingListCoverViewHolder = this.f41730b;
        if (rankingListCoverViewHolder != null) {
            this.f41730b = null;
            rankingListCoverViewHolder.mStarContainer = null;
            rankingListCoverViewHolder.mMusicContainer = null;
            rankingListCoverViewHolder.mStarHeaderView = null;
            rankingListCoverViewHolder.mMusicHeaderView = null;
            rankingListCoverViewHolder.mStarName = null;
            rankingListCoverViewHolder.mMusicName = null;
            rankingListCoverViewHolder.mStarBackground = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListCoverViewHolder_ViewBinding(RankingListCoverViewHolder rankingListCoverViewHolder, View view) {
        this.f41730b = rankingListCoverViewHolder;
        rankingListCoverViewHolder.mStarContainer = Utils.findRequiredView(view, C0906R.id.cfr, "field 'mStarContainer'");
        rankingListCoverViewHolder.mMusicContainer = Utils.findRequiredView(view, C0906R.id.cfq, "field 'mMusicContainer'");
        rankingListCoverViewHolder.mStarHeaderView = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.b1y, "field 'mStarHeaderView'", CircleImageView.class);
        rankingListCoverViewHolder.mMusicHeaderView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b1x, "field 'mMusicHeaderView'", RemoteImageView.class);
        rankingListCoverViewHolder.mStarName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.djd, "field 'mStarName'", TextView.class);
        rankingListCoverViewHolder.mMusicName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df2, "field 'mMusicName'", TextView.class);
        rankingListCoverViewHolder.mStarBackground = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.kr, "field 'mStarBackground'", RemoteImageView.class);
    }
}
