package com.ss.android.ugc.aweme.challenge.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DetailAwemeListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35556a;

    /* renamed from: b  reason: collision with root package name */
    private DetailAwemeListFragment f35557b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35556a, false, 26282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35556a, false, 26282, new Class[0], Void.TYPE);
            return;
        }
        DetailAwemeListFragment detailAwemeListFragment = this.f35557b;
        if (detailAwemeListFragment != null) {
            this.f35557b = null;
            detailAwemeListFragment.mListView = null;
            detailAwemeListFragment.mStatusView = null;
            detailAwemeListFragment.mStatusViewContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DetailAwemeListFragment_ViewBinding(DetailAwemeListFragment detailAwemeListFragment, View view) {
        this.f35557b = detailAwemeListFragment;
        detailAwemeListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.acu, "field 'mListView'", RecyclerView.class);
        detailAwemeListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        detailAwemeListFragment.mStatusViewContainer = (FrameLayout) Utils.findOptionalViewAsType(view, C0906R.id.cve, "field 'mStatusViewContainer'", FrameLayout.class);
    }
}
