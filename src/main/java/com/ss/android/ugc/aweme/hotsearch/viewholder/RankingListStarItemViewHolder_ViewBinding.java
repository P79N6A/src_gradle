package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class RankingListStarItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49931a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListStarItemViewHolder f49932b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49931a, false, 49881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49931a, false, 49881, new Class[0], Void.TYPE);
            return;
        }
        RankingListStarItemViewHolder rankingListStarItemViewHolder = this.f49932b;
        if (rankingListStarItemViewHolder != null) {
            this.f49932b = null;
            rankingListStarItemViewHolder.mTvRankSeq = null;
            rankingListStarItemViewHolder.mImgRankSeqMark = null;
            rankingListStarItemViewHolder.mImgAvatar = null;
            rankingListStarItemViewHolder.mTvName = null;
            rankingListStarItemViewHolder.mTvHotValue = null;
            rankingListStarItemViewHolder.crown = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListStarItemViewHolder_ViewBinding(RankingListStarItemViewHolder rankingListStarItemViewHolder, View view) {
        this.f49932b = rankingListStarItemViewHolder;
        rankingListStarItemViewHolder.mTvRankSeq = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dgz, "field 'mTvRankSeq'", DmtTextView.class);
        rankingListStarItemViewHolder.mImgRankSeqMark = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.atg, "field 'mImgRankSeqMark'", RemoteImageView.class);
        rankingListStarItemViewHolder.mImgAvatar = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.as5, "field 'mImgAvatar'", CircleImageView.class);
        rankingListStarItemViewHolder.mTvName = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mTvName'", DmtTextView.class);
        rankingListStarItemViewHolder.mTvHotValue = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dd0, "field 'mTvHotValue'", DmtTextView.class);
        rankingListStarItemViewHolder.crown = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1r, "field 'crown'", ImageView.class);
    }
}
