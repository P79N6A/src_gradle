package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class HotSearchImageViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41644a;

    /* renamed from: b  reason: collision with root package name */
    private HotSearchImageViewHolder f41645b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41644a, false, 35614, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41644a, false, 35614, new Class[0], Void.TYPE);
            return;
        }
        HotSearchImageViewHolder hotSearchImageViewHolder = this.f41645b;
        if (hotSearchImageViewHolder != null) {
            this.f41645b = null;
            hotSearchImageViewHolder.mHotSearchBoardView = null;
            hotSearchImageViewHolder.mHotSearchCardView = null;
            hotSearchImageViewHolder.mTitle = null;
            hotSearchImageViewHolder.mViewMoreTextView = null;
            hotSearchImageViewHolder.ivMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public HotSearchImageViewHolder_ViewBinding(HotSearchImageViewHolder hotSearchImageViewHolder, View view) {
        this.f41645b = hotSearchImageViewHolder;
        hotSearchImageViewHolder.mHotSearchBoardView = Utils.findRequiredView(view, C0906R.id.bii, "field 'mHotSearchBoardView'");
        hotSearchImageViewHolder.mHotSearchCardView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cik, "field 'mHotSearchCardView'", RecyclerView.class);
        hotSearchImageViewHolder.mTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'mTitle'", DmtTextView.class);
        hotSearchImageViewHolder.mViewMoreTextView = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dcy, "field 'mViewMoreTextView'", DmtTextView.class);
        hotSearchImageViewHolder.ivMore = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b3b, "field 'ivMore'", ImageView.class);
    }
}
