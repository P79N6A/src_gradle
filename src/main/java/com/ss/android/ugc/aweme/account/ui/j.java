package com.ss.android.ugc.aweme.account.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class j implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33050a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileInputPhoneFragment f33051b;

    j(BaseBindMobileInputPhoneFragment baseBindMobileInputPhoneFragment) {
        this.f33051b = baseBindMobileInputPhoneFragment;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f33050a, false, 21087, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33050a, false, 21087, new Class[0], Object.class);
        }
        BaseBindMobileInputPhoneFragment baseBindMobileInputPhoneFragment = this.f33051b;
        baseBindMobileInputPhoneFragment.y().edit().putLong("last_show_bind_dialog_time", baseBindMobileInputPhoneFragment.z).commit();
        return null;
    }
}
