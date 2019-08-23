package org.android.agoo.control;

import android.content.Intent;

public class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f84015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f84016b;

    public void run() {
        this.f84016b.f84014a.onHandleIntent(this.f84015a);
    }

    h(g gVar, Intent intent) {
        this.f84016b = gVar;
        this.f84015a = intent;
    }
}
