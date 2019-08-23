package com.ss.android.ugc.aweme.account.logindevicemanager.ui;

import android.content.DialogInterface;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.logindevicemanager.ui.LoginDeviceManagerFragment;
import com.ss.android.ugc.aweme.account.ui.VerificationActivity;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32696a;

    /* renamed from: b  reason: collision with root package name */
    private final LoginDeviceManagerFragment.AnonymousClass4.AnonymousClass1 f32697b;

    a(LoginDeviceManagerFragment.AnonymousClass4.AnonymousClass1 r1) {
        this.f32697b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32696a, false, 20855, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32696a, false, 20855, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        LoginDeviceManagerFragment.AnonymousClass4.AnonymousClass1 r1 = this.f32697b;
        Intent intent = new Intent(LoginDeviceManagerFragment.this.getActivity(), VerificationActivity.class);
        intent.putExtra("verify_type", 2048);
        LoginDeviceManagerFragment.this.getActivity().startActivityForResult(intent, 3072);
    }
}
