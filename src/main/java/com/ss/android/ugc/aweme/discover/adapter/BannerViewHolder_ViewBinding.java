package com.ss.android.ugc.aweme.discover.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class BannerViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41537a;

    /* renamed from: b  reason: collision with root package name */
    private BannerViewHolder f41538b;

    /* renamed from: c  reason: collision with root package name */
    private View f41539c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f41537a, false, 35496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41537a, false, 35496, new Class[0], Void.TYPE);
            return;
        }
        BannerViewHolder bannerViewHolder = this.f41538b;
        if (bannerViewHolder != null) {
            this.f41538b = null;
            bannerViewHolder.mSdCover = null;
            this.f41539c.setOnClickListener(null);
            this.f41539c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BannerViewHolder_ViewBinding(final BannerViewHolder bannerViewHolder, View view) {
        this.f41538b = bannerViewHolder;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ckd, "field 'mSdCover' and method 'clickCover'");
        bannerViewHolder.mSdCover = (RemoteImageView) Utils.castView(findRequiredView, C0906R.id.ckd, "field 'mSdCover'", RemoteImageView.class);
        this.f41539c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41540a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f41540a, false, 35497, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f41540a, false, 35497, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                bannerViewHolder.clickCover();
            }
        });
    }
}
