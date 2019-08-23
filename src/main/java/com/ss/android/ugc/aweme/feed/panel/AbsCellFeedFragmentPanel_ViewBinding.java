package com.ss.android.ugc.aweme.feed.panel;

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

public class AbsCellFeedFragmentPanel_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45640a;

    /* renamed from: b  reason: collision with root package name */
    private AbsCellFeedFragmentPanel f45641b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f45640a, false, 41522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45640a, false, 41522, new Class[0], Void.TYPE);
            return;
        }
        AbsCellFeedFragmentPanel absCellFeedFragmentPanel = this.f45641b;
        if (absCellFeedFragmentPanel != null) {
            this.f45641b = null;
            absCellFeedFragmentPanel.mStatusView = null;
            absCellFeedFragmentPanel.mListView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AbsCellFeedFragmentPanel_ViewBinding(AbsCellFeedFragmentPanel absCellFeedFragmentPanel, View view) {
        this.f45641b = absCellFeedFragmentPanel;
        absCellFeedFragmentPanel.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        absCellFeedFragmentPanel.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
    }
}
