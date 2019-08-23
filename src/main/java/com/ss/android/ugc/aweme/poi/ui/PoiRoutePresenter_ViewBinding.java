package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiRoutePresenter_ViewBinding implements Unbinder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f60498b;

    /* renamed from: a  reason: collision with root package name */
    private PoiRoutePresenter f60499a;

    /* renamed from: c  reason: collision with root package name */
    private View f60500c;

    /* renamed from: d  reason: collision with root package name */
    private View f60501d;

    /* renamed from: e  reason: collision with root package name */
    private View f60502e;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60498b, false, 66184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60498b, false, 66184, new Class[0], Void.TYPE);
            return;
        }
        PoiRoutePresenter poiRoutePresenter = this.f60499a;
        if (poiRoutePresenter != null) {
            this.f60499a = null;
            poiRoutePresenter.mRouteDrive = null;
            poiRoutePresenter.mRouteBus = null;
            poiRoutePresenter.mRouteWalking = null;
            poiRoutePresenter.mTitle = null;
            poiRoutePresenter.mRouteTab = null;
            this.f60500c.setOnClickListener(null);
            this.f60500c = null;
            this.f60501d.setOnClickListener(null);
            this.f60501d = null;
            this.f60502e.setOnClickListener(null);
            this.f60502e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiRoutePresenter_ViewBinding(final PoiRoutePresenter poiRoutePresenter, View view) {
        this.f60499a = poiRoutePresenter;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c2y, "field 'mRouteDrive' and method 'onClick'");
        poiRoutePresenter.mRouteDrive = (TextView) Utils.castView(findRequiredView, C0906R.id.c2y, "field 'mRouteDrive'", TextView.class);
        this.f60500c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60503a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60503a, false, 66185, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60503a, false, 66185, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiRoutePresenter.onClick(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.c2v, "field 'mRouteBus' and method 'onClick'");
        poiRoutePresenter.mRouteBus = (TextView) Utils.castView(findRequiredView2, C0906R.id.c2v, "field 'mRouteBus'", TextView.class);
        this.f60501d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60506a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60506a, false, 66186, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60506a, false, 66186, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiRoutePresenter.onClick(view2);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.c39, "field 'mRouteWalking' and method 'onClick'");
        poiRoutePresenter.mRouteWalking = (TextView) Utils.castView(findRequiredView3, C0906R.id.c39, "field 'mRouteWalking'", TextView.class);
        this.f60502e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60509a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60509a, false, 66187, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60509a, false, 66187, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiRoutePresenter.onClick(view2);
            }
        });
        poiRoutePresenter.mTitle = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.c34, "field 'mTitle'", TextView.class);
        poiRoutePresenter.mRouteTab = Utils.findRequiredView(view, C0906R.id.c32, "field 'mRouteTab'");
    }
}
