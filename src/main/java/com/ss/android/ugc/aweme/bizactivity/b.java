package com.ss.android.ugc.aweme.bizactivity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35220a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35221b;

    b(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35221b = bizActivityFloatDialogHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f35220a, false, 25685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35220a, false, 25685, new Class[0], Void.TYPE);
            return;
        }
        BizActivityFloatDialogHelper bizActivityFloatDialogHelper = this.f35221b;
        bizActivityFloatDialogHelper.foldIv.setTranslationX((float) (-bizActivityFloatDialogHelper.foldIv.getLayoutParams().width));
        bizActivityFloatDialogHelper.unfoldIv.setVisibility(8);
        bizActivityFloatDialogHelper.foldIv.setVisibility(0);
        bizActivityFloatDialogHelper.foldIv.animate().translationX(0.0f).start();
    }
}
