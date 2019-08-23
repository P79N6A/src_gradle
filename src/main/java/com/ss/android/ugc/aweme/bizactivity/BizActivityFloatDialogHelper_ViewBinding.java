package com.ss.android.ugc.aweme.bizactivity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BizActivityFloatDialogHelper_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35216a;

    /* renamed from: b  reason: collision with root package name */
    private BizActivityFloatDialogHelper f35217b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f35216a, false, 25692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35216a, false, 25692, new Class[0], Void.TYPE);
            return;
        }
        BizActivityFloatDialogHelper bizActivityFloatDialogHelper = this.f35217b;
        if (bizActivityFloatDialogHelper != null) {
            this.f35217b = null;
            bizActivityFloatDialogHelper.displayIv = null;
            bizActivityFloatDialogHelper.foldIv = null;
            bizActivityFloatDialogHelper.unfoldIv = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BizActivityFloatDialogHelper_ViewBinding(BizActivityFloatDialogHelper bizActivityFloatDialogHelper, View view) {
        this.f35217b = bizActivityFloatDialogHelper;
        bizActivityFloatDialogHelper.displayIv = (AnimateDraweeView) Utils.findRequiredViewAsType(view, C0906R.id.a5o, "field 'displayIv'", AnimateDraweeView.class);
        bizActivityFloatDialogHelper.foldIv = (AnimateDraweeView) Utils.findRequiredViewAsType(view, C0906R.id.agp, "field 'foldIv'", AnimateDraweeView.class);
        bizActivityFloatDialogHelper.unfoldIv = (AnimateDraweeView) Utils.findRequiredViewAsType(view, C0906R.id.do1, "field 'unfoldIv'", AnimateDraweeView.class);
    }
}
