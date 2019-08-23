package com.ss.android.ugc.aweme.hotsearch.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView;

public class RankingListMusicItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49913a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListMusicItemViewHolder f49914b;

    /* renamed from: c  reason: collision with root package name */
    private View f49915c;

    /* renamed from: d  reason: collision with root package name */
    private View f49916d;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49913a, false, 49875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49913a, false, 49875, new Class[0], Void.TYPE);
            return;
        }
        RankingListMusicItemViewHolder rankingListMusicItemViewHolder = this.f49914b;
        if (rankingListMusicItemViewHolder != null) {
            this.f49914b = null;
            rankingListMusicItemViewHolder.mTvRankSeq = null;
            rankingListMusicItemViewHolder.mImgRankSeqMark = null;
            rankingListMusicItemViewHolder.mMusicCover = null;
            rankingListMusicItemViewHolder.ivMusicianMark = null;
            rankingListMusicItemViewHolder.ivStop = null;
            rankingListMusicItemViewHolder.ivPlay = null;
            rankingListMusicItemViewHolder.ivLoad = null;
            rankingListMusicItemViewHolder.mTitleView = null;
            rankingListMusicItemViewHolder.mOriginalTag = null;
            rankingListMusicItemViewHolder.mNameView = null;
            rankingListMusicItemViewHolder.mCountView = null;
            rankingListMusicItemViewHolder.mPlaceHolder = null;
            rankingListMusicItemViewHolder.mContentContainer = null;
            rankingListMusicItemViewHolder.crown = null;
            this.f49915c.setOnClickListener(null);
            this.f49915c = null;
            this.f49916d.setOnClickListener(null);
            this.f49916d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListMusicItemViewHolder_ViewBinding(final RankingListMusicItemViewHolder rankingListMusicItemViewHolder, View view) {
        this.f49914b = rankingListMusicItemViewHolder;
        rankingListMusicItemViewHolder.mTvRankSeq = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dgz, "field 'mTvRankSeq'", DmtTextView.class);
        rankingListMusicItemViewHolder.mImgRankSeqMark = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.atg, "field 'mImgRankSeqMark'", RemoteImageView.class);
        rankingListMusicItemViewHolder.mMusicCover = (RemoteRoundImageView) Utils.findRequiredViewAsType(view, C0906R.id.boa, "field 'mMusicCover'", RemoteRoundImageView.class);
        rankingListMusicItemViewHolder.ivMusicianMark = (RemoteRoundImageView) Utils.findRequiredViewAsType(view, C0906R.id.bvh, "field 'ivMusicianMark'", RemoteRoundImageView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.bot, "field 'ivStop' and method 'click'");
        rankingListMusicItemViewHolder.ivStop = (ImageView) Utils.castView(findRequiredView, C0906R.id.bot, "field 'ivStop'", ImageView.class);
        this.f49915c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49917a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49917a, false, 49876, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49917a, false, 49876, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                rankingListMusicItemViewHolder.click(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.bon, "field 'ivPlay' and method 'click'");
        rankingListMusicItemViewHolder.ivPlay = (ImageView) Utils.castView(findRequiredView2, C0906R.id.bon, "field 'ivPlay'", ImageView.class);
        this.f49916d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49920a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f49920a, false, 49877, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f49920a, false, 49877, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                rankingListMusicItemViewHolder.click(view2);
            }
        });
        rankingListMusicItemViewHolder.ivLoad = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.boj, "field 'ivLoad'", ImageView.class);
        rankingListMusicItemViewHolder.mTitleView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'mTitleView'", TextView.class);
        rankingListMusicItemViewHolder.mOriginalTag = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3q, "field 'mOriginalTag'", ImageView.class);
        rankingListMusicItemViewHolder.mNameView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.df7, "field 'mNameView'", TextView.class);
        rankingListMusicItemViewHolder.mCountView = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.daa, "field 'mCountView'", TextView.class);
        rankingListMusicItemViewHolder.mPlaceHolder = Utils.findRequiredView(view, C0906R.id.bye, "field 'mPlaceHolder'");
        rankingListMusicItemViewHolder.mContentContainer = Utils.findRequiredView(view, C0906R.id.ci4, "field 'mContentContainer'");
        rankingListMusicItemViewHolder.crown = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1r, "field 'crown'", ImageView.class);
    }
}
