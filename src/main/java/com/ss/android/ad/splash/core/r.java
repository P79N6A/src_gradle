package com.ss.android.ad.splash.core;

import android.content.SharedPreferences;
import com.ss.android.ad.splash.core.c.d;
import com.ss.android.ad.splash.utils.a;
import com.ss.android.ad.splash.utils.g;
import com.ss.android.ugc.aweme.q.c;
import java.util.Calendar;

public class r {

    /* renamed from: c  reason: collision with root package name */
    private static volatile r f27730c;

    /* renamed from: d  reason: collision with root package name */
    private static Calendar f27731d = Calendar.getInstance();

    /* renamed from: a  reason: collision with root package name */
    SharedPreferences f27732a = c.a(e.F(), "splash_ad_sp", 0);

    /* renamed from: b  reason: collision with root package name */
    SharedPreferences.Editor f27733b = this.f27732a.edit();

    public final void d() {
        this.f27733b.apply();
    }

    private int r() {
        return this.f27732a.getInt("show_splash_ad_day", 0);
    }

    public final String c() {
        return this.f27732a.getString("splash_ad_local_cache_data", "");
    }

    public final String e() {
        return this.f27732a.getString("splash_ad_full_data", "");
    }

    public final long f() {
        return this.f27732a.getLong("splash_ad_fetch_time", 0);
    }

    public final long g() {
        return this.f27732a.getLong("splash_ad_leave_interval", 0);
    }

    public final long h() {
        return this.f27732a.getLong("splash_ad_splash_interval", 0);
    }

    public final int i() {
        return this.f27732a.getInt("splash_ad_show_limit", 0);
    }

    public final String j() {
        return this.f27732a.getString("splash_ad_did", "");
    }

    public final boolean k() {
        return this.f27732a.getBoolean("key_splash_ad_need_ack", false);
    }

    public final boolean m() {
        return this.f27732a.getBoolean("key_splash_ad_empty", false);
    }

    public final String n() {
        return this.f27732a.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    public final String o() {
        return this.f27732a.getString("key_splash_ad_penalty_period", "");
    }

    public final String p() {
        return this.f27732a.getString("key_empty_log_extra_substitute", "");
    }

    private r() {
    }

    public static r a() {
        if (f27730c == null) {
            synchronized (r.class) {
                if (f27730c == null) {
                    f27730c = new r();
                }
            }
        }
        return f27730c;
    }

    private void q() {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        f27731d.setTimeInMillis(System.currentTimeMillis());
        this.f27733b.putInt("show_splash_ad_day", f27731d.get(5) + f27731d.get(2) + f27731d.get(1)).apply();
    }

    public final int l() {
        f27731d.setTimeInMillis(System.currentTimeMillis());
        if (f27731d.get(5) + f27731d.get(2) + f27731d.get(1) == r()) {
            return this.f27732a.getInt("splash_ad_show_count", 0);
        }
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putInt("splash_ad_show_count", 0).apply();
        q();
        return 0;
    }

    public final boolean b() {
        f27731d.setTimeInMillis(System.currentTimeMillis());
        if (f27731d.get(5) + f27731d.get(2) + f27731d.get(1) == r()) {
            return this.f27732a.getBoolean("splash_ad_has_first_refresh", false);
        }
        q();
        b(false).d();
        return false;
    }

    public final r b(long j) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putLong("splash_ad_leave_interval", j);
        return this;
    }

    public final r c(long j) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putLong("splash_ad_splash_interval", j);
        return this;
    }

    public final void e(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("key_splash_ad_rt_necessary_device_params", str).apply();
    }

    public final r h(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("splash_ad_local_cache_data", str);
        return this;
    }

    public final r i(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("key_splash_ad_penalty_period", str);
        return this;
    }

    public final r j(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("key_empty_log_extra_substitute", str);
        return this;
    }

    public final r a(int i) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putInt("splash_ad_show_limit", i);
        return this;
    }

    public final r b(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("splash_ad_full_data", str);
        return this;
    }

    public final r c(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("splash_ad_did", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        if (!g.a(str)) {
            if (this.f27733b == null) {
                this.f27733b = this.f27732a.edit();
            }
            SharedPreferences.Editor editor = this.f27733b;
            editor.putBoolean("splash_ad_url_has_download_" + a.a(str), true).apply();
        }
    }

    public final void f(String str) {
        if (!g.a(str)) {
            if (this.f27733b == null) {
                this.f27733b = this.f27732a.edit();
            }
            SharedPreferences.Editor editor = this.f27733b;
            editor.remove("splash_ad_url_has_download_" + a.a(str)).apply();
        }
    }

    public final boolean g(String str) {
        if (g.a(str)) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f27732a;
        return sharedPreferences.getBoolean("splash_ad_url_has_download_" + a.a(str), false);
    }

    public final r a(long j) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putLong("splash_ad_fetch_time", j);
        return this;
    }

    public final r b(boolean z) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    public final r c(boolean z) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    public final r a(String str) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putString("splash_ad_data", str);
        return this;
    }

    public final r a(boolean z) {
        if (this.f27733b == null) {
            this.f27733b = this.f27732a.edit();
        }
        this.f27733b.putBoolean("key_splash_ad_empty", z);
        return this;
    }

    public final void a(d dVar) {
        if (dVar != null && !g.a(dVar.f27628d)) {
            d(dVar.f27628d);
        }
    }
}
