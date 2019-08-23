package com.ss.android.ugc.aweme.account.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.ui.BaseBindMobileInputPhoneFragment;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33055a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseBindMobileInputPhoneFragment.AnonymousClass5 f33056b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33057c;

    l(BaseBindMobileInputPhoneFragment.AnonymousClass5 r1, String str) {
        this.f33056b = r1;
        this.f33057c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33055a, false, 21096, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f33055a, false, 21096, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        BaseBindMobileInputPhoneFragment.AnonymousClass5 r0 = this.f33056b;
        BaseBindMobileInputPhoneFragment.this.e(this.f33057c);
    }
}
