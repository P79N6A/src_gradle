package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;

public final class ah implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81749a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String[] f92a;

    ah(String[] strArr, Context context) {
        this.f92a = strArr;
        this.f81749a = context;
    }

    public final void run() {
        try {
            for (String str : this.f92a) {
                if (!TextUtils.isEmpty(str)) {
                    PackageInfo packageInfo = this.f81749a.getPackageManager().getPackageInfo(str, 4);
                    if (packageInfo != null) {
                        MiPushClient.awakePushServiceByPackageInfo(this.f81749a, packageInfo);
                    }
                }
            }
        } catch (Throwable th) {
            b.a(th);
        }
    }
}
