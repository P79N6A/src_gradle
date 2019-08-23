package com.alipay.sdk.auth;

import android.content.DialogInterface;

public final class i implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5467a;

    i(g gVar) {
        this.f5467a = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5467a.f5464a.cancel();
        boolean unused = AuthActivity.this.f5454d = false;
        j.a(AuthActivity.this, AuthActivity.this.f5452b + "?resultCode=150");
        AuthActivity.this.finish();
    }
}
