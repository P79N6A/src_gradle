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
import com.ss.android.ugc.aweme.views.MentionTextView;

public class RankingListVideoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49944a;

    /* renamed from: b  reason: collision with root package name */
    private RankingListVideoItemViewHolder f49945b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f49944a, false, 49892, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49944a, false, 49892, new Class[0], Void.TYPE);
            return;
        }
        RankingListVideoItemViewHolder rankingListVideoItemViewHolder = this.f49945b;
        if (rankingListVideoItemViewHolder != null) {
            this.f49945b = null;
            rankingListVideoItemViewHolder.mHotVideoOrder = null;
            rankingListVideoItemViewHolder.mVideoTitle = null;
            rankingListVideoItemViewHolder.mAuthorName = null;
            rankingListVideoItemViewHolder.mViewCount = null;
            rankingListVideoItemViewHolder.mPlaceHolder = null;
            rankingListVideoItemViewHolder.mContentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RankingListVideoItemViewHolder_ViewBinding(RankingListVideoItemViewHolder rankingListVideoItemViewHolder, View view) {
        this.f49945b = rankingListVideoItemViewHolder;
        rankingListVideoItemViewHolder.mHotVideoOrder = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ap6, "field 'mHotVideoOrder'", TextView.class);
        rankingListVideoItemViewHolder.mVideoTitle = (MentionTextView) Utils.findRequiredViewAsType(view, C0906R.id.dt4, "field 'mVideoTitle'", MentionTextView.class);
        rankingListVideoItemViewHolder.mAuthorName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.gw, "field 'mAuthorName'", TextView.class);
        rankingListVideoItemViewHolder.mViewCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ap9, "field 'mViewCount'", TextView.class);
        rankingListVideoItemViewHolder.mPlaceHolder = Utils.findRequiredView(view, C0906R.id.ap7, "field 'mPlaceHolder'");
        rankingListVideoItemViewHolder.mContentContainer = Utils.findRequiredView(view, C0906R.id.ap8, "field 'mContentContainer'");
    }
}
