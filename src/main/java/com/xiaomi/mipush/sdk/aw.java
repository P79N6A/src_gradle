package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

public class aw implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81764a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ av f101a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String[] f102a;

    aw(av avVar, String[] strArr, Context context) {
        this.f101a = avVar;
        this.f102a = strArr;
        this.f81764a = context;
    }

    public void run() {
        int i = 0;
        while (i < this.f102a.length) {
            try {
                if (!TextUtils.isEmpty(this.f102a[i])) {
                    if (i > 0) {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                    }
                    PackageInfo packageInfo = this.f81764a.getPackageManager().getPackageInfo(this.f102a[i], 4);
                    if (packageInfo != null) {
                        this.f101a.a(this.f81764a, packageInfo);
                    }
                }
                i++;
            } catch (Throwable th) {
                b.a(th);
                return;
            }
        }
    }
}
