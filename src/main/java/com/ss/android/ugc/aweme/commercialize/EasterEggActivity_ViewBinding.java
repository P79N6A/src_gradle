package com.ss.android.ugc.aweme.commercialize;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class EasterEggActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38414a;

    /* renamed from: b  reason: collision with root package name */
    private EasterEggActivity f38415b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f38414a, false, 30310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38414a, false, 30310, new Class[0], Void.TYPE);
            return;
        }
        EasterEggActivity easterEggActivity = this.f38415b;
        if (easterEggActivity != null) {
            this.f38415b = null;
            easterEggActivity.flContanier = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public EasterEggActivity_ViewBinding(EasterEggActivity easterEggActivity, View view) {
        this.f38415b = easterEggActivity;
        easterEggActivity.flContanier = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.aic, "field 'flContanier'", FrameLayout.class);
    }
}
