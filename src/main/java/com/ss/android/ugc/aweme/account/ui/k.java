package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.ui.BaseBindMobileInputPhoneFragment;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33052a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileInputPhoneFragment.AnonymousClass4 f33053b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33054c;

    k(BaseBindMobileInputPhoneFragment.AnonymousClass4 r1, String str) {
        this.f33053b = r1;
        this.f33054c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33052a, false, 21093, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33052a, false, 21093, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        BaseBindMobileInputPhoneFragment.AnonymousClass4 r0 = this.f33053b;
        BaseBindMobileInputPhoneFragment.this.d(this.f33054c);
    }
}
