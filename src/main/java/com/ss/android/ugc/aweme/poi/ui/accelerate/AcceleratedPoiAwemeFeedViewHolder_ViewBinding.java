package com.ss.android.ugc.aweme.poi.ui.accelerate;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder_ViewBinding;

public class AcceleratedPoiAwemeFeedViewHolder_ViewBinding extends FlowFeedViewHolder_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60517a;

    /* renamed from: c  reason: collision with root package name */
    private AcceleratedPoiAwemeFeedViewHolder f60518c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60517a, false, 66222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60517a, false, 66222, new Class[0], Void.TYPE);
            return;
        }
        AcceleratedPoiAwemeFeedViewHolder acceleratedPoiAwemeFeedViewHolder = this.f60518c;
        if (acceleratedPoiAwemeFeedViewHolder != null) {
            this.f60518c = null;
            acceleratedPoiAwemeFeedViewHolder.mLoadingStatusViewBg = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AcceleratedPoiAwemeFeedViewHolder_ViewBinding(AcceleratedPoiAwemeFeedViewHolder acceleratedPoiAwemeFeedViewHolder, View view) {
        super(acceleratedPoiAwemeFeedViewHolder, view);
        this.f60518c = acceleratedPoiAwemeFeedViewHolder;
        acceleratedPoiAwemeFeedViewHolder.mLoadingStatusViewBg = Utils.findRequiredView(view, C0906R.id.cv5, "field 'mLoadingStatusViewBg'");
    }
}
