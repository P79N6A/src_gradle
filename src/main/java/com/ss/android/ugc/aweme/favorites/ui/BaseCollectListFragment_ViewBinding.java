package com.ss.android.ugc.aweme.favorites.ui;

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

public class BaseCollectListFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44318a;

    /* renamed from: b  reason: collision with root package name */
    private BaseCollectListFragment f44319b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44318a, false, 39551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44318a, false, 39551, new Class[0], Void.TYPE);
            return;
        }
        BaseCollectListFragment baseCollectListFragment = this.f44319b;
        if (baseCollectListFragment != null) {
            this.f44319b = null;
            baseCollectListFragment.mListView = null;
            baseCollectListFragment.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseCollectListFragment_ViewBinding(BaseCollectListFragment baseCollectListFragment, View view) {
        this.f44319b = baseCollectListFragment;
        baseCollectListFragment.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.u9, "field 'mListView'", RecyclerView.class);
        baseCollectListFragment.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
