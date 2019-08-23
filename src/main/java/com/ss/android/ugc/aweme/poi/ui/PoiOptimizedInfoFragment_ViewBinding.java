package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.sothree.slidinguppanel.SlidingUpPanelLayout;

public class PoiOptimizedInfoFragment_ViewBinding extends AbsSlidablePoiAwemeFeedFragment_ViewBinding {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f60454c;

    /* renamed from: d  reason: collision with root package name */
    private PoiOptimizedInfoFragment f60455d;

    /* renamed from: e  reason: collision with root package name */
    private View f60456e;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60454c, false, 66083, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60454c, false, 66083, new Class[0], Void.TYPE);
            return;
        }
        PoiOptimizedInfoFragment poiOptimizedInfoFragment = this.f60455d;
        if (poiOptimizedInfoFragment != null) {
            this.f60455d = null;
            poiOptimizedInfoFragment.mSlideUpPanelLayout = null;
            this.f60456e.setOnClickListener(null);
            this.f60456e = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiOptimizedInfoFragment_ViewBinding(final PoiOptimizedInfoFragment poiOptimizedInfoFragment, View view) {
        super(poiOptimizedInfoFragment, view);
        this.f60455d = poiOptimizedInfoFragment;
        poiOptimizedInfoFragment.mSlideUpPanelLayout = (SlidingUpPanelLayout) Utils.findRequiredViewAsType(view, C0906R.id.cs2, "field 'mSlideUpPanelLayout'", SlidingUpPanelLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c11, "method 'onClick'");
        this.f60456e = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60457a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60457a, false, 66084, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60457a, false, 66084, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedInfoFragment.onClick(view2);
            }
        });
    }
}
