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
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;

public class HotVideoItemViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41658a;

    /* renamed from: b  reason: collision with root package name */
    private HotVideoItemViewHolder f41659b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41658a, false, 35640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41658a, false, 35640, new Class[0], Void.TYPE);
            return;
        }
        HotVideoItemViewHolder hotVideoItemViewHolder = this.f41659b;
        if (hotVideoItemViewHolder != null) {
            this.f41659b = null;
            hotVideoItemViewHolder.mCover = null;
            hotVideoItemViewHolder.mText = null;
            hotVideoItemViewHolder.mRank = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HotVideoItemViewHolder_ViewBinding(HotVideoItemViewHolder hotVideoItemViewHolder, View view) {
        this.f41659b = hotVideoItemViewHolder;
        hotVideoItemViewHolder.mCover = (AnimatedImageView) Utils.findRequiredViewAsType(view, C0906R.id.b2e, "field 'mCover'", AnimatedImageView.class);
        hotVideoItemViewHolder.mText = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dgd, "field 'mText'", TextView.class);
        hotVideoItemViewHolder.mRank = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dh0, "field 'mRank'", TextView.class);
    }
}
