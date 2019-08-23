package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileEditLocationFragment_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62205a;

    /* renamed from: b  reason: collision with root package name */
    private ProfileEditLocationFragment f62206b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62205a, false, 68791, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62205a, false, 68791, new Class[0], Void.TYPE);
            return;
        }
        ProfileEditLocationFragment profileEditLocationFragment = this.f62206b;
        if (profileEditLocationFragment != null) {
            this.f62206b = null;
            profileEditLocationFragment.mLocationList = null;
            profileEditLocationFragment.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ProfileEditLocationFragment_ViewBinding(ProfileEditLocationFragment profileEditLocationFragment, View view) {
        this.f62206b = profileEditLocationFragment;
        profileEditLocationFragment.mLocationList = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.ciq, "field 'mLocationList'", RecyclerView.class);
        profileEditLocationFragment.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
