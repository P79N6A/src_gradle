package com.ss.android.ugc.aweme.bizactivity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35222a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35223b;

    c(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35223b = bizActivityFloatDialogHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35222a, false, 25687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35222a, false, 25687, new Class[0], Void.TYPE);
            return;
        }
        this.f35223b.dismiss();
    }
}
