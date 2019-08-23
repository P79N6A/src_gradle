package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;

public final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81743a;

    aa(Context context) {
        this.f81743a = context;
    }

    public final void run() {
        try {
            PackageInfo packageInfo = this.f81743a.getPackageManager().getPackageInfo(this.f81743a.getPackageName(), 4612);
            z.c(this.f81743a);
            z.d(this.f81743a, packageInfo);
            z.c(this.f81743a, packageInfo);
        } catch (Throwable unused) {
        }
    }
}
