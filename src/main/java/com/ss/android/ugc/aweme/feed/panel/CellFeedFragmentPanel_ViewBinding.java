package com.ss.android.ugc.aweme.feed.panel;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;

public class CellFeedFragmentPanel_ViewBinding extends AbsCellFeedFragmentPanel_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f45682b;

    /* renamed from: c  reason: collision with root package name */
    private CellFeedFragmentPanel f45683c;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f45682b, false, 41795, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45682b, false, 41795, new Class[0], Void.TYPE);
            return;
        }
        CellFeedFragmentPanel cellFeedFragmentPanel = this.f45683c;
        if (cellFeedFragmentPanel != null) {
            this.f45683c = null;
            cellFeedFragmentPanel.mRefreshLayout = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CellFeedFragmentPanel_ViewBinding(CellFeedFragmentPanel cellFeedFragmentPanel, View view) {
        super(cellFeedFragmentPanel, view);
        this.f45683c = cellFeedFragmentPanel;
        cellFeedFragmentPanel.mRefreshLayout = (SwipeRefreshLayout) Utils.findRequiredViewAsType(view, C0906R.id.ccw, "field 'mRefreshLayout'", SwipeRefreshLayout.class);
    }
}
