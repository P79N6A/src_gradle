package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private static o f5118a = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f5119c = false;

    /* renamed from: d  reason: collision with root package name */
    private static long f5120d = 0;
    private static String h = "https://";
    private static String i;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f27a;

    /* renamed from: e  reason: collision with root package name */
    private int f5121e;

    /* renamed from: e  reason: collision with other field name */
    private long f28e;
    private ExecutorService pool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    private o() {
    }

    public static o a() {
        if (f5118a == null) {
            synchronized (o.class) {
                if (f5118a == null) {
                    f5118a = new o();
                }
            }
        }
        return f5118a;
    }

    private void d() {
        this.f5121e = this.f5121e < d.f24c.length + -1 ? this.f5121e + 1 : 0;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(Context context) {
        if (!f5119c) {
            synchronized (o.class) {
                if (!f5119c) {
                    if (context != null) {
                        this.f27a = c.a(context, "httpdns_config_cache", 0);
                    }
                    String string = this.f27a.getString("httpdns_server_ips", null);
                    i = string;
                    if (string != null) {
                        d.a(i.split(";"));
                    }
                    long j = this.f27a.getLong("schedule_center_last_request_time", 0);
                    f5120d = j;
                    if (j == 0 || System.currentTimeMillis() - f5120d >= 86400000) {
                        q.a().a(false);
                        c();
                    }
                    f5119c = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(p pVar) {
        this.f5121e = 0;
        HttpDns.switchDnsService(pVar.isEnabled());
        if (a(pVar.c())) {
            g.e("Scheduler center update success");
            this.f28e = System.currentTimeMillis();
            s.g();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean a(String[] strArr) {
        if (!d.a(strArr)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
            sb.append(";");
        }
        sb.deleteCharAt(sb.length() - 1);
        if (this.f27a == null) {
            return false;
        }
        SharedPreferences.Editor edit = this.f27a.edit();
        edit.putString("httpdns_server_ips", sb.toString());
        edit.putLong("schedule_center_last_request_time", System.currentTimeMillis());
        edit.commit();
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            d();
            if (this.f5121e == 0) {
                this.f28e = System.currentTimeMillis();
                g.f("Scheduler center update failed");
                s.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void c() {
        if (System.currentTimeMillis() - this.f28e >= 300000) {
            g.e("update server ips from schedule center.");
            this.f5121e = 0;
            this.pool.submit(new m(d.f24c.length - 1));
            return;
        }
        g.e("update server ips from schedule center too often, give up. ");
        s.h();
    }

    /* access modifiers changed from: package-private */
    public synchronized String f() {
        return h + d.f24c[this.f5121e] + "/sc/httpdns_config?account_id=" + d.f5095c + "&platform=android&sdk_version=1.1.3.1";
    }
}
