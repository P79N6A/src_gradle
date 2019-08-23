package com.alipay.sdk.j;

import android.app.Activity;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f5537a;

    public final void run() {
        this.f5537a.finish();
    }

    l(Activity activity) {
        this.f5537a = activity;
    }
}
