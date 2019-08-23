package com.ss.android.ugc.aweme.choosemusic.view;

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

public class BaseMusicListView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36010a;

    /* renamed from: b  reason: collision with root package name */
    private BaseMusicListView f36011b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f36010a, false, 26819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36010a, false, 26819, new Class[0], Void.TYPE);
            return;
        }
        BaseMusicListView baseMusicListView = this.f36011b;
        if (baseMusicListView != null) {
            this.f36011b = null;
            baseMusicListView.mTitleBar = null;
            baseMusicListView.mRecyclerView = null;
            baseMusicListView.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseMusicListView_ViewBinding(BaseMusicListView baseMusicListView, View view) {
        this.f36011b = baseMusicListView;
        baseMusicListView.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        baseMusicListView.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.boi, "field 'mRecyclerView'", RecyclerView.class);
        baseMusicListView.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.bos, "field 'mStatusView'", DmtStatusView.class);
    }
}
