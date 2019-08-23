package com.ss.android.ugc.aweme.antiaddic.lock.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SetTimeLockActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33463a;

    /* renamed from: b  reason: collision with root package name */
    private SetTimeLockActivity f33464b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f33463a, false, 21903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33463a, false, 21903, new Class[0], Void.TYPE);
            return;
        }
        SetTimeLockActivity setTimeLockActivity = this.f33464b;
        if (setTimeLockActivity != null) {
            this.f33464b = null;
            setTimeLockActivity.rootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public SetTimeLockActivity_ViewBinding(SetTimeLockActivity setTimeLockActivity, View view) {
        this.f33464b = setTimeLockActivity;
        setTimeLockActivity.rootView = (ViewGroup) Utils.findRequiredViewAsType(view, C0906R.id.chu, "field 'rootView'", ViewGroup.class);
    }
}
