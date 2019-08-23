package com.ss.android.ugc.aweme.account.login.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment;
import com.ss.android.ugc.aweme.account.util.i;

public final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32649a;

    /* renamed from: b  reason: collision with root package name */
    private final PhonePassLoginFragment.AnonymousClass5 f32650b;

    v(PhonePassLoginFragment.AnonymousClass5 r1) {
        this.f32650b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32649a, false, 20717, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32649a, false, 20717, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PhonePassLoginFragment.AnonymousClass5 r1 = this.f32650b;
        a.a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_confirm");
        PhonePassLoginFragment.this.l().c(i.a(ResetPasswordFragment.class, PhonePassLoginFragment.this.getArguments()).a("phone_number", PhonePassLoginFragment.this.r()).a("mask_phone_number", PhonePassLoginFragment.this.s()).a("enter_from", PhonePassLoginFragment.this.m).a("enter_method", PhonePassLoginFragment.this.n).a(), false);
    }
}
