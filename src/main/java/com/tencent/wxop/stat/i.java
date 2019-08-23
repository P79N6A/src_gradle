package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.f;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.s;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import org.apache.http.HttpHost;
import org.json.JSONObject;

public class i {
    private static i h;

    /* renamed from: a  reason: collision with root package name */
    List<String> f79903a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f79904b = 2;

    /* renamed from: c  reason: collision with root package name */
    public volatile String f79905c = "";

    /* renamed from: d  reason: collision with root package name */
    public volatile HttpHost f79906d;

    /* renamed from: e  reason: collision with root package name */
    int f79907e;

    /* renamed from: f  reason: collision with root package name */
    Context f79908f;
    /* access modifiers changed from: private */
    public f g;
    private b i;

    public static i a(Context context) {
        if (h == null) {
            synchronized (i.class) {
                if (h == null) {
                    h = new i(context);
                }
            }
        }
        return h;
    }

    private static boolean b(String str) {
        return Pattern.compile("(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})").matcher(str).matches();
    }

    private String d() {
        try {
            if (!b("pingma.qq.com")) {
                return InetAddress.getByName("pingma.qq.com").getHostAddress();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private void f() {
        this.f79904b = 0;
        this.f79906d = null;
        this.f79905c = null;
    }

    public final void a(String str) {
        if (d.b()) {
            this.i.a("updateIpList ".concat(String.valueOf(str)));
        }
        try {
            if (n.c(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String string = jSONObject.getString(keys.next());
                        if (n.c(string)) {
                            for (String str2 : string.split(";")) {
                                if (n.c(str2)) {
                                    String[] split = str2.split(":");
                                    if (split.length > 1) {
                                        String str3 = split[0];
                                        if (b(str3) && !this.f79903a.contains(str3)) {
                                            if (d.b()) {
                                                this.i.a("add new ip:".concat(String.valueOf(str3)));
                                            }
                                            this.f79903a.add(str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        this.f79907e = new Random().nextInt(this.f79903a.size());
    }

    public final boolean a() {
        return this.f79904b == 1;
    }

    public final boolean b() {
        return this.f79904b != 0;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (s.e(this.f79908f)) {
            if (d.n) {
                e();
            }
            this.f79905c = n.g(this.f79908f);
            if (d.b()) {
                b bVar = this.i;
                bVar.a("NETWORK name:" + this.f79905c);
            }
            if (n.c(this.f79905c)) {
                this.f79904b = "WIFI".equalsIgnoreCase(this.f79905c) ? 1 : 2;
                this.f79906d = n.a(this.f79908f);
            }
            if (g.a()) {
                g.a(this.f79908f);
            }
        } else {
            if (d.b()) {
                this.i.a("NETWORK TYPE: network is close.");
            }
            f();
        }
    }

    private i(Context context) {
        this.f79908f = context.getApplicationContext();
        this.g = new f();
        aj.f79845e = context.getApplicationContext();
        this.i = n.c();
        f();
        this.f79903a = new ArrayList(10);
        this.f79903a.add("117.135.169.101");
        this.f79903a.add("140.207.54.125");
        this.f79903a.add("180.153.8.53");
        this.f79903a.add("120.198.203.175");
        this.f79903a.add("14.17.43.18");
        this.f79903a.add("163.177.71.186");
        this.f79903a.add("111.30.131.31");
        this.f79903a.add("123.126.121.167");
        this.f79903a.add("123.151.152.111");
        this.f79903a.add("113.142.45.79");
        this.f79903a.add("123.138.162.90");
        this.f79903a.add("103.7.30.94");
        c();
    }

    private void e() {
        String d2 = d();
        if (d.b()) {
            this.i.a("remoteIp ip is ".concat(String.valueOf(d2)));
        }
        if (n.c(d2)) {
            if (!this.f79903a.contains(d2)) {
                String str = this.f79903a.get(this.f79907e);
                if (d.b()) {
                    this.i.c(d2 + " not in ip list, change to:" + str);
                }
                d2 = str;
            }
            String str2 = "http://" + d2 + ":80/mstat/report";
            if (str2 == null || str2.length() == 0) {
                d.f79884a.d("statReportUrl cannot be null or empty.");
                return;
            }
            d.t = str2;
            try {
                d.s = new URI(d.t).getHost();
            } catch (Exception e2) {
                d.f79884a.c(e2);
            }
            if (d.b()) {
                d.f79884a.a("url:" + d.t + ", domain:" + d.s);
            }
        }
    }
}
