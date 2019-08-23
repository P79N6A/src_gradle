package com.ss.android.ugc.aweme.profile.ui;

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

public class ProfileCoverLibActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62113a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileCoverLibActivity f62114b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62113a, false, 68640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62113a, false, 68640, new Class[0], Void.TYPE);
            return;
        }
        ProfileCoverLibActivity profileCoverLibActivity = this.f62114b;
        if (profileCoverLibActivity != null) {
            this.f62114b = null;
            profileCoverLibActivity.mTitleBar = null;
            profileCoverLibActivity.mCoverRecycleView = null;
            profileCoverLibActivity.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileCoverLibActivity_ViewBinding(ProfileCoverLibActivity profileCoverLibActivity, View view) {
        this.f62114b = profileCoverLibActivity;
        profileCoverLibActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
        profileCoverLibActivity.mCoverRecycleView = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.cig, "field 'mCoverRecycleView'", RecyclerView.class);
        profileCoverLibActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
    }
}
