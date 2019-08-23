package com.ss.android.ugc.aweme.poi.ui.comment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiCommentDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60561a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentDetailFragment f60562b;

    /* renamed from: c  reason: collision with root package name */
    private View f60563c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60561a, false, 66260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60561a, false, 66260, new Class[0], Void.TYPE);
            return;
        }
        PoiCommentDetailFragment poiCommentDetailFragment = this.f60562b;
        if (poiCommentDetailFragment != null) {
            this.f60562b = null;
            poiCommentDetailFragment.mRecyclerView = null;
            this.f60563c.setOnClickListener(null);
            this.f60563c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommentDetailFragment_ViewBinding(final PoiCommentDetailFragment poiCommentDetailFragment, View view) {
        this.f60562b = poiCommentDetailFragment;
        poiCommentDetailFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.dug, "field 'mRecyclerView'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'onClick'");
        this.f60563c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60564a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f60564a, false, 66261, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f60564a, false, 66261, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCommentDetailFragment.onClick(view2);
            }
        });
    }
}
