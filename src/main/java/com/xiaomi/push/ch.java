package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.Message;

public class ch {

    /* renamed from: a  reason: collision with root package name */
    private static final long f81902a = (bm.a() ? 30000 : 1800000);

    /* renamed from: a  reason: collision with other field name */
    private static final Object f221a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private BroadcastReceiver f222a = new cm(this);

    /* renamed from: a  reason: collision with other field name */
    private Context f223a;

    /* renamed from: a  reason: collision with other field name */
    private ConnectivityManager f224a;

    /* renamed from: a  reason: collision with other field name */
    private HandlerThread f225a;

    /* renamed from: a  reason: collision with other field name */
    private cd f226a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public cp f227a;

    /* renamed from: a  reason: collision with other field name */
    private cq f228a;

    static {
        bm.a();
    }

    public ch(Context context) {
        this.f223a = context;
    }

    private int a() {
        try {
            return ((bl) this.f223a).a();
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public void a(boolean z) {
        NetworkInfo networkInfo = null;
        try {
            if (!(this.f223a == null || this.f223a.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f223a.getPackageName()) != 0 || this.f224a == null)) {
                networkInfo = this.f224a.getActiveNetworkInfo();
            }
        } catch (Exception unused) {
        }
        if (this.f226a != null) {
            if (networkInfo == null || networkInfo.getType() != 1 || !networkInfo.isConnected()) {
                this.f226a.d();
                return;
            }
            String a2 = ck.a(this.f223a, 1);
            if (this.f226a.a() == null || !this.f226a.a().equals(a2)) {
                this.f226a.a(a2);
            }
            if (this.f227a.hasMessages(2)) {
                this.f227a.removeMessages(2);
            }
            Message obtainMessage = this.f227a.obtainMessage(2);
            long j = f81902a;
            obtainMessage.obj = Boolean.valueOf(z);
            if (z) {
                this.f227a.sendMessage(obtainMessage);
            } else {
                this.f227a.sendMessageDelayed(obtainMessage, j);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m161a() {
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = this.f226a.a();
        long c2 = bm.a().c();
        if (c2 == Long.MAX_VALUE) {
            c2 = f81902a;
        }
        String a3 = this.f226a.a();
        return a3 != null && a3.equals(ck.a(this.f223a, 1)) && currentTimeMillis - a2 >= c2;
    }

    /* access modifiers changed from: private */
    public void b(boolean z) {
        if (!bm.a().b()) {
            return;
        }
        if (z || (a() && c() && b())) {
            e();
            this.f226a.c();
            this.f226a.e();
        }
    }

    private boolean b() {
        if (!bm.a().c()) {
            return true;
        }
        long b2 = bm.a().b();
        if (b2 == Long.MAX_VALUE) {
            b2 = 172800000;
        }
        this.f226a.b();
        return this.f226a.b() > b2;
    }

    private boolean c() {
        long c2 = this.f226a.c();
        long a2 = bm.a().a();
        if (a2 == Long.MAX_VALUE) {
            a2 = 172800000;
        }
        return System.currentTimeMillis() - c2 > a2;
    }

    private void e() {
        this.f228a.a(this.f226a.a(), this.f226a.a(), this.f226a.b());
    }

    private void f() {
        this.f223a.registerReceiver(this.f222a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void g() {
        if (this.f227a.hasMessages(1)) {
            this.f227a.removeMessages(1);
        }
        if (this.f227a.hasMessages(2)) {
            this.f227a.removeMessages(2);
        }
        this.f223a.unregisterReceiver(this.f222a);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m162a() {
        a(true);
    }

    public void a(cq cqVar) {
        synchronized (f221a) {
            this.f228a = cqVar;
        }
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m163b() {
        this.f226a = new cd(this.f223a);
        this.f224a = (ConnectivityManager) this.f223a.getSystemService("connectivity");
        this.f225a = new HandlerThread("WifiCampStatics");
        this.f225a.start();
        this.f227a = new cp(this, this.f225a.getLooper());
        if (a() == 0) {
            f();
        }
    }

    /* renamed from: c  reason: collision with other method in class */
    public void m164c() {
        if (a() == 0) {
            g();
        }
        this.f224a = null;
        this.f226a.a();
        if (this.f225a != null) {
            this.f225a.quitSafely();
            this.f225a = null;
        }
    }

    public void d() {
        synchronized (f221a) {
            this.f228a = null;
        }
    }
}
