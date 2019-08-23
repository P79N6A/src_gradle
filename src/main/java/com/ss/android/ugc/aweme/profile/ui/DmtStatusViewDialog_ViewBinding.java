package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DmtStatusViewDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61792a;

    /* renamed from: b  reason: collision with root package name */
    private DmtStatusViewDialog f61793b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f61792a, false, 67953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61792a, false, 67953, new Class[0], Void.TYPE);
            return;
        }
        DmtStatusViewDialog dmtStatusViewDialog = this.f61793b;
        if (dmtStatusViewDialog != null) {
            this.f61793b = null;
            dmtStatusViewDialog.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DmtStatusViewDialog_ViewBinding(DmtStatusViewDialog dmtStatusViewDialog, View view) {
        this.f61793b = dmtStatusViewDialog;
        dmtStatusViewDialog.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, C0906R.id.cvd, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
