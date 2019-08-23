package com.ss.android.ugc.aweme.poi.ui.comment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;

public class PoiCommentVH_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60609a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCommentVH f60610b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f60609a, false, 66313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60609a, false, 66313, new Class[0], Void.TYPE);
            return;
        }
        PoiCommentVH poiCommentVH = this.f60610b;
        if (poiCommentVH != null) {
            this.f60610b = null;
            poiCommentVH.mRecyclerView = null;
            poiCommentVH.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCommentVH_ViewBinding(PoiCommentVH poiCommentVH, View view) {
        this.f60610b = poiCommentVH;
        poiCommentVH.mRecyclerView = (NestedScrollingRecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.dug, "field 'mRecyclerView'", NestedScrollingRecyclerView.class);
        poiCommentVH.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
