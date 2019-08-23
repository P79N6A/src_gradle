package com.ss.android.ugc.aweme.poi.adapter.viewholder;

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

public class PoiBannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59490a;

    /* renamed from: b  reason: collision with root package name */
    private PoiBannerViewHolder f59491b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f59490a, false, 64793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59490a, false, 64793, new Class[0], Void.TYPE);
            return;
        }
        PoiBannerViewHolder poiBannerViewHolder = this.f59491b;
        if (poiBannerViewHolder != null) {
            this.f59491b = null;
            poiBannerViewHolder.mSdCover = null;
            poiBannerViewHolder.mWaterMark = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiBannerViewHolder_ViewBinding(PoiBannerViewHolder poiBannerViewHolder, View view) {
        this.f59491b = poiBannerViewHolder;
        poiBannerViewHolder.mSdCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'mSdCover'", RemoteImageView.class);
        poiBannerViewHolder.mWaterMark = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dws, "field 'mWaterMark'", DmtTextView.class);
    }
}
