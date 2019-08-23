package com.alipay.sdk.app;

import android.content.DialogInterface;

public final class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f5441a;

    g(e eVar) {
        this.f5441a = eVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5441a.f5438a.cancel();
        boolean unused = this.f5441a.f5439b.f5434c = false;
        j.f5444a = j.a();
        this.f5441a.f5439b.f5433b.finish();
    }
}
