package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.ag;

public class er {

    /* renamed from: a  reason: collision with root package name */
    private static volatile er f81987a;

    /* renamed from: a  reason: collision with other field name */
    private Context f320a;

    private er(Context context) {
        this.f320a = context;
    }

    private int a(int i) {
        return Math.max(60, i);
    }

    public static er a(Context context) {
        if (f81987a == null) {
            synchronized (er.class) {
                try {
                    if (f81987a == null) {
                        f81987a = new er(context);
                    }
                } catch (Throwable th) {
                    Class<er> cls = er.class;
                    throw th;
                }
            }
        }
        return f81987a;
    }

    private boolean a() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        try {
            ((Application) (this.f320a instanceof Application ? this.f320a : this.f320a.getApplicationContext())).registerActivityLifecycleCallbacks(new ei(this.f320a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        aj a2 = aj.a(this.f320a);
        ag a3 = ag.a(this.f320a);
        SharedPreferences a4 = c.a(this.f320a, "mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = a4.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            a4.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) >= 172800000) {
            boolean a5 = a3.a(ip.ScreenSizeCollectionSwitch.a(), true);
            boolean a6 = a3.a(ip.AndroidVnCollectionSwitch.a(), true);
            boolean a7 = a3.a(ip.AndroidVcCollectionSwitch.a(), true);
            boolean a8 = a3.a(ip.AndroidIdCollectionSwitch.a(), true);
            boolean a9 = a3.a(ip.OperatorSwitch.a(), true);
            if (a5 || a6 || a7 || a8 || a9) {
                int a10 = a(a3.a(ip.DeviceInfoCollectionFrequency.a(), 1209600));
                ez ezVar = r6;
                ez ezVar2 = new ez(this.f320a, a10, a5, a6, a7, a8, a9);
                a2.a(ezVar, a10, 30);
            }
            boolean a11 = a3.a(ip.MacCollectionSwitch.a(), true);
            boolean a12 = a3.a(ip.IMSICollectionSwitch.a(), true);
            boolean a13 = a3.a(ip.IccidCollectionSwitch.a(), true);
            boolean a14 = a3.a(ip.DeviceIdSwitch.a(), true);
            if (a11 || a12 || a13 || a14) {
                int a15 = a(a3.a(ip.DeviceBaseInfoCollectionFrequency.a(), 1209600));
                ey eyVar = new ey(this.f320a, a15, a11, a12, a13, a14);
                a2.a(eyVar, a15, 30);
            }
            if (a3.a(ip.AppInstallListCollectionSwitch.a(), true)) {
                int a16 = a(a3.a(ip.AppInstallListCollectionFrequency.a(), 86400));
                a2.a(new eu(this.f320a, a16), a16, 30);
            }
            if (Build.VERSION.SDK_INT < 21 && a3.a(ip.AppActiveListCollectionSwitch.a(), true)) {
                int a17 = a(a3.a(ip.AppActiveListCollectionFrequency.a(), 900));
                a2.a(new et(this.f320a, a17), a17, 30);
            }
            if (a3.a(ip.StorageCollectionSwitch.a(), true)) {
                int a18 = a(a3.a(ip.StorageCollectionFrequency.a(), 86400));
                a2.a(new fa(this.f320a, a18), a18, 30);
            }
            if (a3.a(ip.WifiCollectionSwitch.a(), true)) {
                int a19 = a(a3.a(ip.WifiCollectionFrequency.a(), 900));
                a2.a(new fd(this.f320a, a19), a19, 30);
            }
            if (a3.a(ip.TopAppCollectionSwitch.a(), true)) {
                int a20 = a(a3.a(ip.TopAppCollectionFrequency.a(), (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f));
                a2.a(new fb(this.f320a, a20), a20, 30);
            }
            if (a3.a(ip.BroadcastActionCollectionSwitch.a(), true)) {
                int a21 = a(a3.a(ip.BroadcastActionCollectionFrequency.a(), 900));
                a2.a(new ew(this.f320a, a21), a21, 30);
            }
            if (a3.a(ip.WifiDevicesMacCollectionSwitch.a(), false)) {
                int a22 = a(a3.a(ip.WifiDevicesMacCollectionFrequency.a(), 900));
                a2.a(new ff(this.f320a, a22), a22, 30);
            }
            if (a3.a(ip.ActivityTSSwitch.a(), false)) {
                a();
            }
            if (a3.a(ip.UploadSwitch.a(), true)) {
                a2.a(new fc(this.f320a), a(a3.a(ip.UploadFrequency.a(), 86400)), 60);
            }
            if (a3.a(ip.BatteryCollectionSwitch.a(), false)) {
                int a23 = a(a3.a(ip.BatteryCollectionFrequency.a(), 3600));
                a2.a(new ev(this.f320a, a23), a23, 30);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m204a() {
        aj.a(this.f320a).a((Runnable) new es(this), 30);
    }
}
