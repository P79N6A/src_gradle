package com.ss.android.ugc.aweme.bizactivity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35224a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35225b;

    d(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35225b = bizActivityFloatDialogHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35224a, false, 25688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35224a, false, 25688, new Class[0], Void.TYPE);
            return;
        }
        BizActivityFloatDialogHelper bizActivityFloatDialogHelper = this.f35225b;
        bizActivityFloatDialogHelper.unfoldIv.setTranslationX((float) (-bizActivityFloatDialogHelper.unfoldIv.getLayoutParams().width));
        bizActivityFloatDialogHelper.unfoldIv.setVisibility(0);
        bizActivityFloatDialogHelper.foldIv.setVisibility(8);
        bizActivityFloatDialogHelper.unfoldIv.animate().translationX(0.0f).withEndAction(new e(bizActivityFloatDialogHelper)).start();
    }
}
