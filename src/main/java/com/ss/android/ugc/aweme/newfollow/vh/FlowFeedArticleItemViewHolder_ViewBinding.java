package com.ss.android.ugc.aweme.newfollow.vh;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class FlowFeedArticleItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57521a;

    /* renamed from: b  reason: collision with root package name */
    private FlowFeedArticleItemViewHolder f57522b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f57521a, false, 62153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57521a, false, 62153, new Class[0], Void.TYPE);
            return;
        }
        FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder = this.f57522b;
        if (flowFeedArticleItemViewHolder != null) {
            this.f57522b = null;
            flowFeedArticleItemViewHolder.mImgCover = null;
            flowFeedArticleItemViewHolder.mTvTitle = null;
            flowFeedArticleItemViewHolder.mTvSource = null;
            flowFeedArticleItemViewHolder.mTvReadCount = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FlowFeedArticleItemViewHolder_ViewBinding(FlowFeedArticleItemViewHolder flowFeedArticleItemViewHolder, View view) {
        this.f57522b = flowFeedArticleItemViewHolder;
        flowFeedArticleItemViewHolder.mImgCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.as4, "field 'mImgCover'", RemoteImageView.class);
        flowFeedArticleItemViewHolder.mTvTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d9_, "field 'mTvTitle'", DmtTextView.class);
        flowFeedArticleItemViewHolder.mTvSource = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d99, "field 'mTvSource'", DmtTextView.class);
        flowFeedArticleItemViewHolder.mTvReadCount = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d98, "field 'mTvReadCount'", DmtTextView.class);
    }
}
