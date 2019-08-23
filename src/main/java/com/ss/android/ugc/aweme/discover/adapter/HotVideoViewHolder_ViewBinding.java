package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class HotVideoViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41673a;

    /* renamed from: b  reason: collision with root package name */
    private HotVideoViewHolder f41674b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41673a, false, 35659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41673a, false, 35659, new Class[0], Void.TYPE);
            return;
        }
        HotVideoViewHolder hotVideoViewHolder = this.f41674b;
        if (hotVideoViewHolder != null) {
            this.f41674b = null;
            hotVideoViewHolder.mLeftTitleView = null;
            hotVideoViewHolder.mRightTitleView = null;
            hotVideoViewHolder.mYellowDotView = null;
            hotVideoViewHolder.mRightArrowView = null;
            hotVideoViewHolder.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HotVideoViewHolder_ViewBinding(HotVideoViewHolder hotVideoViewHolder, View view) {
        this.f41674b = hotVideoViewHolder;
        hotVideoViewHolder.mLeftTitleView = Utils.findRequiredView(view, C0906R.id.dkk, "field 'mLeftTitleView'");
        hotVideoViewHolder.mRightTitleView = Utils.findRequiredView(view, C0906R.id.dd1, "field 'mRightTitleView'");
        hotVideoViewHolder.mYellowDotView = Utils.findRequiredView(view, C0906R.id.dtz, "field 'mYellowDotView'");
        hotVideoViewHolder.mRightArrowView = Utils.findRequiredView(view, C0906R.id.b29, "field 'mRightArrowView'");
        hotVideoViewHolder.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cim, "field 'mRecyclerView'", RecyclerView.class);
    }
}
