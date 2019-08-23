package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView;

public class HotSearchImageItemNewViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41630a;

    /* renamed from: b  reason: collision with root package name */
    private HotSearchImageItemNewViewHolder f41631b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41630a, false, 35595, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41630a, false, 35595, new Class[0], Void.TYPE);
            return;
        }
        HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder = this.f41631b;
        if (hotSearchImageItemNewViewHolder != null) {
            this.f41631b = null;
            hotSearchImageItemNewViewHolder.mImageView = null;
            hotSearchImageItemNewViewHolder.mMaskView = null;
            hotSearchImageItemNewViewHolder.mTitleView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HotSearchImageItemNewViewHolder_ViewBinding(HotSearchImageItemNewViewHolder hotSearchImageItemNewViewHolder, View view) {
        this.f41631b = hotSearchImageItemNewViewHolder;
        hotSearchImageItemNewViewHolder.mImageView = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.b08, "field 'mImageView'", RemoteImageView.class);
        hotSearchImageItemNewViewHolder.mMaskView = Utils.findRequiredView(view, C0906R.id.du7, "field 'mMaskView'");
        hotSearchImageItemNewViewHolder.mTitleView = (HotSearchTitleTextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'mTitleView'", HotSearchTitleTextView.class);
    }
}
