package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ac;
import com.xiaomi.push.m;
import java.util.ArrayList;
import java.util.List;

public class ax {

    /* renamed from: a  reason: collision with root package name */
    private static ax f82532a;

    /* renamed from: a  reason: collision with other field name */
    private static String f955a;

    /* renamed from: a  reason: collision with other field name */
    private Context f956a;

    /* renamed from: a  reason: collision with other field name */
    private Messenger f957a;

    /* renamed from: a  reason: collision with other field name */
    private List<Message> f958a = new ArrayList();

    /* renamed from: a  reason: collision with other field name */
    private boolean f959a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Messenger f82533b;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with other field name */
    public boolean f960b = false;

    private ax(Context context) {
        this.f956a = context.getApplicationContext();
        this.f957a = new Messenger(new ay(this, Looper.getMainLooper()));
        if (a()) {
            b.c("use miui push service");
            this.f959a = true;
        }
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    public static ax a(Context context) {
        if (f82532a == null) {
            f82532a = new ax(context);
        }
        return f82532a;
    }

    /* renamed from: a  reason: collision with other method in class */
    private void m617a(Intent intent) {
        Message a2;
        List<Message> list;
        synchronized (this) {
            if (this.f960b) {
                a2 = a(intent);
                if (this.f958a.size() >= 50) {
                    this.f958a.remove(0);
                }
                list = this.f958a;
            } else if (this.f82533b == null) {
                this.f956a.bindService(intent, new az(this), 1);
                this.f960b = true;
                this.f958a.clear();
                a2 = a(intent);
                list = this.f958a;
            } else {
                try {
                    this.f82533b.send(a(intent));
                } catch (RemoteException unused) {
                    this.f82533b = null;
                    this.f960b = false;
                }
            }
            list.add(a2);
        }
        return;
    }

    private boolean a() {
        if (ac.f81819e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f956a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m618a(Intent intent) {
        try {
            if (m.a() || Build.VERSION.SDK_INT < 26) {
                this.f956a.startService(intent);
            } else {
                a(intent);
            }
            return true;
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return false;
        }
    }
}
