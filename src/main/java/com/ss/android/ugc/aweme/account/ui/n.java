package com.ss.android.ugc.aweme.account.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33060a;

    /* renamed from: b  reason: collision with root package name */
    private final BindMobileInputPhoneFragment f33061b;

    n(BindMobileInputPhoneFragment bindMobileInputPhoneFragment) {
        this.f33061b = bindMobileInputPhoneFragment;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f33060a, false, 21116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33060a, false, 21116, new Class[0], Void.TYPE);
            return;
        }
        BindMobileInputPhoneFragment bindMobileInputPhoneFragment = this.f33061b;
        if (bindMobileInputPhoneFragment.u != null) {
            bindMobileInputPhoneFragment.u.requestFocus();
            bindMobileInputPhoneFragment.b(bindMobileInputPhoneFragment.u);
        }
    }
}
