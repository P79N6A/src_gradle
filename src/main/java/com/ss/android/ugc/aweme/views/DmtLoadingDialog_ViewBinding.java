package com.ss.android.ugc.aweme.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DmtLoadingDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76324a;

    /* renamed from: b  reason: collision with root package name */
    private DmtLoadingDialog f76325b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f76324a, false, 89455, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76324a, false, 89455, new Class[0], Void.TYPE);
            return;
        }
        DmtLoadingDialog dmtLoadingDialog = this.f76325b;
        if (dmtLoadingDialog != null) {
            this.f76325b = null;
            dmtLoadingDialog.mMainLayout = null;
            dmtLoadingDialog.mProgressbar = null;
            dmtLoadingDialog.mContent = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public DmtLoadingDialog_ViewBinding(DmtLoadingDialog dmtLoadingDialog, View view) {
        this.f76325b = dmtLoadingDialog;
        dmtLoadingDialog.mMainLayout = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.bl3, "field 'mMainLayout'", LinearLayout.class);
        dmtLoadingDialog.mProgressbar = (ProgressBar) Utils.findRequiredViewAsType(view, C0906R.id.c7n, "field 'mProgressbar'", ProgressBar.class);
        dmtLoadingDialog.mContent = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.bji, "field 'mContent'", DmtTextView.class);
    }
}
