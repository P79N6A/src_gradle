package com.ss.android.ugc.aweme.poi.ui.comment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiCommentListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60573a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentListFragment f60574b;

    /* renamed from: c  reason: collision with root package name */
    private View f60575c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60573a, false, 66275, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60573a, false, 66275, new Class[0], Void.TYPE);
            return;
        }
        PoiCommentListFragment poiCommentListFragment = this.f60574b;
        if (poiCommentListFragment != null) {
            this.f60574b = null;
            poiCommentListFragment.mStatusView = null;
            this.f60575c.setOnClickListener(null);
            this.f60575c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommentListFragment_ViewBinding(final PoiCommentListFragment poiCommentListFragment, View view) {
        this.f60574b = poiCommentListFragment;
        poiCommentListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'onClick'");
        this.f60575c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60576a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60576a, false, 66276, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60576a, false, 66276, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCommentListFragment.onClick(view2);
            }
        });
    }
}
