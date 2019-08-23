package com.alipay.sdk.app;

import android.content.DialogInterface;

public final class f implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f5440a;

    f(e eVar) {
        this.f5440a = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean unused = this.f5440a.f5439b.f5434c = true;
        this.f5440a.f5438a.proceed();
        dialogInterface.dismiss();
    }
}
