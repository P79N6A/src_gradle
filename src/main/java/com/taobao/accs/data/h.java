package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.net.b;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f78955a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f78956b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Intent f78957c;

    public final void run() {
        g.a().b(this.f78955a, this.f78956b, this.f78957c);
    }

    h(Context context, b bVar, Intent intent) {
        this.f78955a = context;
        this.f78956b = bVar;
        this.f78957c = intent;
    }
}
