package com.alipay.sdk.auth;

import android.content.DialogInterface;

public final class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f5466a;

    h(g gVar) {
        this.f5466a = gVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean unused = AuthActivity.this.f5454d = true;
        this.f5466a.f5464a.proceed();
        dialogInterface.dismiss();
    }
}
