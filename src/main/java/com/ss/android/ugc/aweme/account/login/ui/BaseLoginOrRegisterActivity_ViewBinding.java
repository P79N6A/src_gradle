package com.ss.android.ugc.aweme.account.login.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseLoginOrRegisterActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32362a;

    /* renamed from: b  reason: collision with root package name */
    private BaseLoginOrRegisterActivity f32363b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f32362a, false, 20463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32362a, false, 20463, new Class[0], Void.TYPE);
            return;
        }
        BaseLoginOrRegisterActivity baseLoginOrRegisterActivity = this.f32363b;
        if (baseLoginOrRegisterActivity != null) {
            this.f32363b = null;
            baseLoginOrRegisterActivity.mStatusView = null;
            baseLoginOrRegisterActivity.mFragmentContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseLoginOrRegisterActivity_ViewBinding(BaseLoginOrRegisterActivity baseLoginOrRegisterActivity, View view) {
        this.f32363b = baseLoginOrRegisterActivity;
        baseLoginOrRegisterActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mStatusView'", DmtStatusView.class);
        baseLoginOrRegisterActivity.mFragmentContainer = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.aic, "field 'mFragmentContainer'", ViewGroup.class);
    }
}
