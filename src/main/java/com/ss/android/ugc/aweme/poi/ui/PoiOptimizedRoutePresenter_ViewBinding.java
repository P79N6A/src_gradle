package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiOptimizedRoutePresenter_ViewBinding extends PoiRoutePresenter_ViewBinding {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60462a;

    /* renamed from: c  reason: collision with root package name */
    private PoiOptimizedRoutePresenter f60463c;

    /* renamed from: d  reason: collision with root package name */
    private View f60464d;

    /* renamed from: e  reason: collision with root package name */
    private View f60465e;

    /* renamed from: f  reason: collision with root package name */
    private View f60466f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60462a, false, 66098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60462a, false, 66098, new Class[0], Void.TYPE);
            return;
        }
        PoiOptimizedRoutePresenter poiOptimizedRoutePresenter = this.f60463c;
        if (poiOptimizedRoutePresenter != null) {
            this.f60463c = null;
            poiOptimizedRoutePresenter.mRouteDriveLayout = null;
            poiOptimizedRoutePresenter.mRouteBusLayout = null;
            poiOptimizedRoutePresenter.mRouteWalkingLayout = null;
            poiOptimizedRoutePresenter.mRouteDriveImg = null;
            poiOptimizedRoutePresenter.mRouteBusImg = null;
            poiOptimizedRoutePresenter.mRouteWalkingImg = null;
            poiOptimizedRoutePresenter.mShareBtn = null;
            this.f60464d.setOnClickListener(null);
            this.f60464d = null;
            this.f60465e.setOnClickListener(null);
            this.f60465e = null;
            this.f60466f.setOnClickListener(null);
            this.f60466f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiOptimizedRoutePresenter_ViewBinding(final PoiOptimizedRoutePresenter poiOptimizedRoutePresenter, View view) {
        super(poiOptimizedRoutePresenter, view);
        this.f60463c = poiOptimizedRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c30, "field 'mRouteDriveLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteDriveLayout = findRequiredView;
        this.f60464d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60467a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60467a, false, 66099, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60467a, false, 66099, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedRoutePresenter.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.c2x, "field 'mRouteBusLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteBusLayout = findRequiredView2;
        this.f60465e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60470a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60470a, false, 66100, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60470a, false, 66100, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedRoutePresenter.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.c3a, "field 'mRouteWalkingLayout' and method 'onClick'");
        poiOptimizedRoutePresenter.mRouteWalkingLayout = findRequiredView3;
        this.f60466f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60473a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60473a, false, 66101, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60473a, false, 66101, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiOptimizedRoutePresenter.onClick(view2);
            }
        });
        poiOptimizedRoutePresenter.mRouteDriveImg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c2z, "field 'mRouteDriveImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteBusImg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c2w, "field 'mRouteBusImg'", ImageView.class);
        poiOptimizedRoutePresenter.mRouteWalkingImg = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.c3_, "field 'mRouteWalkingImg'", ImageView.class);
        poiOptimizedRoutePresenter.mShareBtn = view.findViewById(C0906R.id.cp9);
    }
}
