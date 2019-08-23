package com.ss.android.ugc.aweme.miniapp;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RecentlyUsedMicroAppActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55402a;

    /* renamed from: b  reason: collision with root package name */
    private RecentlyUsedMicroAppActivity f55403b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f55402a, false, 59113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55402a, false, 59113, new Class[0], Void.TYPE);
            return;
        }
        RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity = this.f55403b;
        if (recentlyUsedMicroAppActivity != null) {
            this.f55403b = null;
            recentlyUsedMicroAppActivity.mStatusView = null;
            recentlyUsedMicroAppActivity.mListView = null;
            recentlyUsedMicroAppActivity.mTextTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public RecentlyUsedMicroAppActivity_ViewBinding(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity, View view) {
        this.f55403b = recentlyUsedMicroAppActivity;
        recentlyUsedMicroAppActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        recentlyUsedMicroAppActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bcz, "field 'mListView'", RecyclerView.class);
        recentlyUsedMicroAppActivity.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
