package org.android.agoo.control;

import android.content.Intent;

public class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f84019a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseIntentService f84020b;

    public void run() {
        this.f84020b.onHandleIntent(this.f84019a);
    }

    k(BaseIntentService baseIntentService, Intent intent) {
        this.f84020b = baseIntentService;
        this.f84019a = intent;
    }
}
