package com.ss.android.ugc.aweme.account.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32843a;

    /* renamed from: b  reason: collision with root package name */
    private BaseAccountActivity f32844b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f32843a, false, 21044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32843a, false, 21044, new Class[0], Void.TYPE);
            return;
        }
        BaseAccountActivity baseAccountActivity = this.f32844b;
        if (baseAccountActivity != null) {
            this.f32844b = null;
            baseAccountActivity.mRootContainer = null;
            baseAccountActivity.mStatusView = null;
            baseAccountActivity.mContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseAccountActivity_ViewBinding(BaseAccountActivity baseAccountActivity, View view) {
        this.f32844b = baseAccountActivity;
        baseAccountActivity.mRootContainer = (ViewGroup) Utils.findOptionalViewAsType(view, C0906R.id.chw, "field 'mRootContainer'", ViewGroup.class);
        baseAccountActivity.mStatusView = (DmtStatusView) Utils.findOptionalViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        baseAccountActivity.mContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.aic, "field 'mContainer'", FrameLayout.class);
    }
}
