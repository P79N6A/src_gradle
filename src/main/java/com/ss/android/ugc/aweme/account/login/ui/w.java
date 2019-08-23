package com.ss.android.ugc.aweme.account.login.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment;

public final /* synthetic */ class w implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32651a;

    /* renamed from: b  reason: collision with root package name */
    private final PhonePassLoginFragment.AnonymousClass5 f32652b;

    w(PhonePassLoginFragment.AnonymousClass5 r1) {
        this.f32652b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32651a, false, 20718, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32651a, false, 20718, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a.a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_cancel");
    }
}
