package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;

public class be implements av {

    /* renamed from: a  reason: collision with root package name */
    public int f80429a;

    /* renamed from: b  reason: collision with root package name */
    public int f80430b;

    /* renamed from: c  reason: collision with root package name */
    public long f80431c;

    /* renamed from: d  reason: collision with root package name */
    private final int f80432d = 3600000;

    /* renamed from: e  reason: collision with root package name */
    private int f80433e;

    /* renamed from: f  reason: collision with root package name */
    private long f80434f;
    private long g;
    private Context n;

    public void a() {
        i();
    }

    public void b() {
        j();
    }

    public void c() {
        g();
    }

    public void d() {
        h();
    }

    public long m() {
        return this.f80434f;
    }

    public void h() {
        this.f80430b++;
    }

    public void i() {
        this.f80434f = System.currentTimeMillis();
    }

    public int e() {
        if (this.f80433e > 3600000) {
            return 3600000;
        }
        return this.f80433e;
    }

    public void g() {
        this.f80429a++;
        this.f80431c = this.f80434f;
    }

    public void j() {
        this.f80433e = (int) (System.currentTimeMillis() - this.f80434f);
    }

    public boolean f() {
        boolean z;
        if (this.f80431c == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !cc.a(this.n).h();
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public void k() {
        ba.a(this.n).edit().putInt("successful_request", this.f80429a).putInt("failed_requests ", this.f80430b).putInt("last_request_spent_ms", this.f80433e).putLong("last_request_time", this.f80431c).putLong("last_req", this.f80434f).commit();
    }

    public long l() {
        SharedPreferences a2 = ba.a(this.n);
        this.g = ba.a(this.n).getLong("first_activate_time", 0);
        if (this.g == 0) {
            this.g = System.currentTimeMillis();
            a2.edit().putLong("first_activate_time", this.g).commit();
        }
        return this.g;
    }

    public be(Context context) {
        a(context);
    }

    private void a(Context context) {
        this.n = context.getApplicationContext();
        SharedPreferences a2 = ba.a(context);
        this.f80429a = a2.getInt("successful_request", 0);
        this.f80430b = a2.getInt("failed_requests ", 0);
        this.f80433e = a2.getInt("last_request_spent_ms", 0);
        this.f80431c = a2.getLong("last_request_time", 0);
        this.f80434f = a2.getLong("last_req", 0);
    }
}
