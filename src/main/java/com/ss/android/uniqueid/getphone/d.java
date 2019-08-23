package com.ss.android.uniqueid.getphone;

import android.content.Context;
import android.content.Intent;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static Context f77832a;

    public final void run() {
        try {
            f77832a.startService(new Intent(f77832a, RequestMobileService.class));
        } catch (Throwable unused) {
        }
    }

    public d(Context context) {
        f77832a = context;
    }
}
