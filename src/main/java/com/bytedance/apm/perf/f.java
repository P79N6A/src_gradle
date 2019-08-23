package com.bytedance.apm.perf;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.core.d;
import com.bytedance.apm.d.b.e;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.j;
import com.bytedance.apm.k.s;
import com.bytedance.common.utility.NetworkUtils;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends a {

    /* renamed from: a  reason: collision with root package name */
    String f2074a;

    /* renamed from: d  reason: collision with root package name */
    long f2075d;

    /* renamed from: e  reason: collision with root package name */
    long f2076e;

    /* renamed from: f  reason: collision with root package name */
    long f2077f;
    private Context g = c.a();
    private boolean h;
    private BroadcastReceiver i = new TrafficCollector$1(this);

    /* access modifiers changed from: protected */
    public final boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Context context = this.g;
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(this.i, intentFilter);
        } catch (Exception unused) {
        }
        if (s.a()) {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(14, 0);
            long timeInMillis = instance.getTimeInMillis();
            long j = timeInMillis - 86400000;
            long j2 = timeInMillis;
            long a2 = s.a(c.a(), j, j2, 1);
            long a3 = s.a(c.a(), j, j2, 0);
            long j3 = a2 + a3;
            if (j3 > 0) {
                a("net_stats_wifi_day", a2);
                a("net_stats_mobile_day", a3);
                a("net_stats_total_day", j3);
            }
        }
    }

    public final void a(Activity activity) {
        super.a(activity);
        b(true);
    }

    public final void b(Activity activity) {
        super.b(activity);
        b(false);
    }

    private void b(final boolean z) {
        b.a().a((Runnable) new Runnable() {
            public final void run() {
                f.this.a(z);
            }
        });
    }

    public static String a(Context context) {
        NetworkUtils.NetworkType c2 = j.c(context);
        if (c2 == NetworkUtils.NetworkType.WIFI) {
            return "WIFI";
        }
        if (c2 == NetworkUtils.NetworkType.MOBILE || c2 == NetworkUtils.NetworkType.MOBILE_2G || c2 == NetworkUtils.NetworkType.MOBILE_3G || c2 == NetworkUtils.NetworkType.MOBILE_4G) {
            return "MOBILE";
        }
        return "";
    }

    public final void a(boolean z) {
        try {
            SharedPreferences a2 = d.a(this.g, "traffic_monitor_info");
            String string = a2.getString("net_type", null);
            a2.getLong("timestamp", -1);
            long j = a2.getLong("last_total_traffic", -1);
            long j2 = a2.getLong("mobile_traffic", -1);
            long j3 = a2.getLong("wifi_traffic", -1);
            int i2 = a2.getInt("traffic_upload_switch", 0);
            if (string != null && i2 == 1) {
                if ("WIFI".equals(string)) {
                    j3 = (j3 + com.bytedance.apm.k.c.a(this.g)) - j;
                } else if ("MOBILE".equals(string)) {
                    j2 = (j2 + com.bytedance.apm.k.c.a(this.g)) - j;
                }
                if (z) {
                    if (j3 > 0) {
                        a("wifi_traffic_foreground", j3);
                    }
                    if (j2 > 0) {
                        a("mobile_traffic_foreground", j2);
                    }
                    this.h = false;
                } else if (!this.h) {
                    if (j3 > 0) {
                        a("wifi_traffic_background", j3);
                    }
                    if (j2 > 0) {
                        a("mobile_traffic_background", j2);
                    }
                    this.h = true;
                }
            }
            this.f2077f = com.bytedance.apm.k.c.a(this.g);
            this.f2074a = a(this.g);
            this.f2075d = 0;
            this.f2076e = 0;
            a(this.g, this.f2074a, this.f2075d, this.f2076e, this.f2077f, 1);
        } catch (Throwable unused) {
        }
    }

    private static void a(String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, j);
            e eVar = new e("traffic", "traffic_monitor", false, jSONObject, null, null);
            a(eVar);
        } catch (JSONException unused) {
        }
    }

    static void a(Context context, String str, long j, long j2, long j3, int i2) {
        if (context != null) {
            try {
                SharedPreferences.Editor edit = d.a(context, "traffic_monitor_info").edit();
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("net_type", str);
                }
                edit.putLong("mobile_traffic", j);
                edit.putLong("wifi_traffic", j2);
                edit.putLong("last_total_traffic", j3);
                edit.putLong("collect_traffic_time", System.currentTimeMillis());
                edit.putInt("traffic_upload_switch", 1);
                edit.putLong("timestamp", System.currentTimeMillis());
                edit.apply();
            } catch (Throwable unused) {
            }
        }
    }
}
