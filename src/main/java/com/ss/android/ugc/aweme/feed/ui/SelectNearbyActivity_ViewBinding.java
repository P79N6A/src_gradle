package com.ss.android.ugc.aweme.feed.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.login.ui.b;

public class SelectNearbyActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46300a;

    /* renamed from: b  reason: collision with root package name */
    private SelectNearbyActivity f46301b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f46300a, false, 43004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46300a, false, 43004, new Class[0], Void.TYPE);
            return;
        }
        SelectNearbyActivity selectNearbyActivity = this.f46301b;
        if (selectNearbyActivity != null) {
            this.f46301b = null;
            selectNearbyActivity.mRecyclerView = null;
            selectNearbyActivity.mSlideBar = null;
            selectNearbyActivity.ivClose = null;
            selectNearbyActivity.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SelectNearbyActivity_ViewBinding(SelectNearbyActivity selectNearbyActivity, View view) {
        this.f46301b = selectNearbyActivity;
        selectNearbyActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ccc, "field 'mRecyclerView'", RecyclerView.class);
        selectNearbyActivity.mSlideBar = (b) Utils.findRequiredViewAsType(view, C0906R.id.cre, "field 'mSlideBar'", b.class);
        selectNearbyActivity.ivClose = Utils.findRequiredView(view, C0906R.id.ti, "field 'ivClose'");
        selectNearbyActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
