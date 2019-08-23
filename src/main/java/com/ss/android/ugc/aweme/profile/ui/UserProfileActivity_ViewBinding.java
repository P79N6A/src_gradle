package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.SlideSwitchLayout;

public class UserProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62390a;

    /* renamed from: b  reason: collision with root package name */
    private UserProfileActivity f62391b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f62390a, false, 69148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62390a, false, 69148, new Class[0], Void.TYPE);
            return;
        }
        UserProfileActivity userProfileActivity = this.f62391b;
        if (userProfileActivity != null) {
            this.f62391b = null;
            userProfileActivity.mProfileLayout = null;
            userProfileActivity.mSlideSwitchLayout = null;
            userProfileActivity.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public UserProfileActivity_ViewBinding(UserProfileActivity userProfileActivity, View view) {
        this.f62391b = userProfileActivity;
        userProfileActivity.mProfileLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.due, "field 'mProfileLayout'", LinearLayout.class);
        userProfileActivity.mSlideSwitchLayout = (SlideSwitchLayout) Utils.findRequiredViewAsType(view, C0906R.id.cry, "field 'mSlideSwitchLayout'", SlideSwitchLayout.class);
        userProfileActivity.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
