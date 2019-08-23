package com.ss.android.ugc.aweme.poi.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiRouteFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60485a;

    /* renamed from: b  reason: collision with root package name */
    private PoiRouteFragment f60486b;

    /* renamed from: c  reason: collision with root package name */
    private View f60487c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60485a, false, 66154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60485a, false, 66154, new Class[0], Void.TYPE);
        } else if (this.f60486b != null) {
            this.f60486b = null;
            this.f60487c.setOnClickListener(null);
            this.f60487c = null;
        } else {
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    @UiThread
    public PoiRouteFragment_ViewBinding(final PoiRouteFragment poiRouteFragment, View view) {
        this.f60486b = poiRouteFragment;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.c2u, "method 'onClick'");
        this.f60487c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60488a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60488a, false, 66155, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60488a, false, 66155, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiRouteFragment.onClick(view2);
            }
        });
    }
}
