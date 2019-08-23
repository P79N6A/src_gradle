package com.bytedance.framwork.core.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.framwork.core.a.a.b;
import com.bytedance.framwork.core.a.c.c;
import com.bytedance.framwork.core.a.d;
import com.bytedance.framwork.core.a.d.a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class h implements b, c, a.b {
    static ConcurrentHashMap<String, List<String>> o = new ConcurrentHashMap<>();
    static ConcurrentHashMap<String, List<String>> p = new ConcurrentHashMap<>();
    private volatile long A = 0;
    private volatile long B = 0;
    private volatile int C = 0;
    private volatile boolean D;
    private volatile long E;

    /* renamed from: a  reason: collision with root package name */
    Context f20148a;

    /* renamed from: b  reason: collision with root package name */
    JSONObject f20149b;

    /* renamed from: c  reason: collision with root package name */
    d f20150c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.framwork.core.a.b f20151d;

    /* renamed from: e  reason: collision with root package name */
    volatile long f20152e;

    /* renamed from: f  reason: collision with root package name */
    volatile JSONObject f20153f;
    public a g;
    HashMap<String, String> h;
    public List<String> i = new ArrayList(Arrays.asList(new String[]{"http://mon.snssdk.com/monitor/appmonitor/v2/settings", "http://monsetting.toutiao.com/monitor/appmonitor/v2/settings"}));
    public volatile boolean j = true;
    volatile boolean k;
    public volatile boolean l;
    List<String> m = new ArrayList(Arrays.asList(new String[]{"http://mon.snssdk.com/monitor/collect/", "http://mon.toutiao.com/monitor/collect/", "http://mon.toutiaocloud.com/monitor/collect/", "http://mon.toutiaocloud.net/monitor/collect/"}));
    public a n;
    String q;
    private volatile long r;
    private volatile int s;
    private volatile int t;
    private volatile int u;
    private volatile int v;
    private volatile JSONObject w;
    private volatile int x = 1;
    private volatile long y;
    private volatile boolean z;

    public interface a {
    }

    public final List<String> c() {
        return this.m;
    }

    public final JSONObject d() {
        return this.f20149b;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final void a(boolean z2) {
        if (this.r < 600) {
            this.r = 600;
        }
        if (l() && g.a(this.f20148a)) {
            synchronized (h.class) {
                this.f20152e = System.currentTimeMillis();
            }
            try {
                com.bytedance.framwork.core.a.d.a.a().a((Runnable) new Runnable() {
                    public final void run() {
                        byte[] bArr;
                        try {
                            if (h.this.g != null) {
                                Iterator<String> it2 = h.this.i.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String a2 = h.this.a(it2.next());
                                    String str = a2 + "&encrypt=close";
                                    try {
                                        boolean z = h.this.j;
                                        if (TextUtils.isDigitsOnly(str)) {
                                            bArr = null;
                                        } else {
                                            bArr = g.a(str, null, null, null, "GET", false, z);
                                        }
                                        if (bArr != null) {
                                            h hVar = h.this;
                                            JSONObject jSONObject = new JSONObject(new String(bArr));
                                            if (jSONObject.length() > 0) {
                                                try {
                                                    hVar.a(jSONObject.getJSONObject("data"));
                                                    SharedPreferences.Editor edit = hVar.i().edit();
                                                    edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                                                    edit.putString("monitor_net_config", jSONObject.getJSONObject("data").toString());
                                                    edit.apply();
                                                    if (!hVar.l) {
                                                        hVar.l = true;
                                                        hVar.n.a(hVar);
                                                    }
                                                } catch (Throwable unused) {
                                                    return;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            if (!h.this.l) {
                                h.this.l = true;
                                h.this.n.a(h.this);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:6|7|8|9|(2:13|(3:15|(2:19|58)|20))|21|22|(1:24)|25|(1:30)(1:29)|(1:32)|33|(1:38)(1:37)|(1:40)|41|(1:46)(1:45)|47|48|49) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0102  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(org.json.JSONObject r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x012d
            int r0 = r8.length()     // Catch:{ all -> 0x012b }
            if (r0 > 0) goto L_0x000b
            goto L_0x012d
        L_0x000b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x012b }
            r0.<init>()     // Catch:{ all -> 0x012b }
            r1 = 0
            java.lang.String r2 = "report_host_new"
            org.json.JSONArray r2 = r8.optJSONArray(r2)     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x003e
            int r3 = r2.length()     // Catch:{ Exception -> 0x003e }
            if (r3 <= 0) goto L_0x003e
            int r3 = r2.length()     // Catch:{ Exception -> 0x003e }
            r4 = 0
        L_0x0024:
            if (r4 >= r3) goto L_0x003e
            java.lang.String r5 = r2.getString(r4)     // Catch:{ Exception -> 0x003e }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x003e }
            if (r6 != 0) goto L_0x003b
            r6 = 46
            int r6 = r5.indexOf(r6)     // Catch:{ Exception -> 0x003e }
            if (r6 <= 0) goto L_0x003b
            r0.add(r5)     // Catch:{ Exception -> 0x003e }
        L_0x003b:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x003e:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x012b }
            if (r2 != 0) goto L_0x0046
            r7.m = r0     // Catch:{ all -> 0x012b }
        L_0x0046:
            java.lang.String r0 = "fetch_setting_interval"
            r2 = 1200(0x4b0, double:5.93E-321)
            long r2 = r8.optLong(r0, r2)     // Catch:{ all -> 0x012b }
            r7.r = r2     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "polling_interval"
            r2 = 120(0x78, float:1.68E-43)
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x012b }
            r7.s = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "once_max_count"
            r2 = 100
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x012b }
            r7.t = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "max_retry_count"
            r2 = 4
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x012b }
            r7.u = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "report_fail_base_time"
            r2 = 15
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x012b }
            r7.v = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "log_send_switch"
            r2 = 1
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x012b }
            r7.x = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "more_channel_stop_interval"
            r3 = 1800(0x708, double:8.893E-321)
            long r3 = r8.optLong(r0, r3)     // Catch:{ all -> 0x012b }
            r7.y = r3     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "log_remvove_switch"
            boolean r0 = r8.optBoolean(r0, r1)     // Catch:{ all -> 0x012b }
            r7.z = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "allow_service_name"
            org.json.JSONObject r0 = r8.optJSONObject(r0)     // Catch:{ all -> 0x012b }
            r7.w = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "allow_log_type"
            org.json.JSONObject r0 = r8.optJSONObject(r0)     // Catch:{ all -> 0x012b }
            r7.f20153f = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "monitor_encrypt_switch"
            boolean r0 = r8.optBoolean(r0, r2)     // Catch:{ all -> 0x012b }
            r7.j = r0     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "monitor_log_max_save_count"
            r1 = 2000(0x7d0, double:9.88E-321)
            long r0 = r8.optLong(r0, r1)     // Catch:{ all -> 0x012b }
            r7.E = r0     // Catch:{ all -> 0x012b }
            com.bytedance.framwork.core.a.b r8 = r7.f20151d     // Catch:{ all -> 0x012b }
            java.lang.String r0 = r8.f20083d     // Catch:{ all -> 0x012b }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012b }
            if (r1 != 0) goto L_0x00d3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x00d3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x012b }
            com.bytedance.framwork.core.a.a.b r0 = (com.bytedance.framwork.core.a.a.b) r0     // Catch:{ all -> 0x012b }
            int r0 = r0.a()     // Catch:{ all -> 0x012b }
            goto L_0x00d9
        L_0x00d3:
            com.bytedance.framwork.core.a.a.b r0 = com.bytedance.framwork.core.a.a.c.f20078a     // Catch:{ all -> 0x012b }
            int r0 = r0.a()     // Catch:{ all -> 0x012b }
        L_0x00d9:
            if (r0 <= 0) goto L_0x00dd
            r8.f20081b = r0     // Catch:{ all -> 0x012b }
        L_0x00dd:
            java.lang.String r0 = r8.f20083d     // Catch:{ all -> 0x012b }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012b }
            if (r1 != 0) goto L_0x00fa
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x00fa
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x012b }
            com.bytedance.framwork.core.a.a.b r0 = (com.bytedance.framwork.core.a.a.b) r0     // Catch:{ all -> 0x012b }
            int r0 = r0.b()     // Catch:{ all -> 0x012b }
            goto L_0x0100
        L_0x00fa:
            com.bytedance.framwork.core.a.a.b r0 = com.bytedance.framwork.core.a.a.c.f20078a     // Catch:{ all -> 0x012b }
            int r0 = r0.b()     // Catch:{ all -> 0x012b }
        L_0x0100:
            if (r0 <= 0) goto L_0x0104
            r8.f20082c = r0     // Catch:{ all -> 0x012b }
        L_0x0104:
            java.lang.String r0 = r8.f20083d     // Catch:{ all -> 0x012b }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x012b }
            if (r1 != 0) goto L_0x0121
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x012b }
            if (r1 == 0) goto L_0x0121
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.framwork.core.a.a.b> r1 = com.bytedance.framwork.core.a.a.c.f20079b     // Catch:{ all -> 0x012b }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x012b }
            com.bytedance.framwork.core.a.a.b r0 = (com.bytedance.framwork.core.a.a.b) r0     // Catch:{ all -> 0x012b }
            org.json.JSONObject r0 = r0.d()     // Catch:{ all -> 0x012b }
            goto L_0x0127
        L_0x0121:
            com.bytedance.framwork.core.a.a.b r0 = com.bytedance.framwork.core.a.a.c.f20078a     // Catch:{ all -> 0x012b }
            org.json.JSONObject r0 = r0.d()     // Catch:{ all -> 0x012b }
        L_0x0127:
            r8.f20085f = r0     // Catch:{ all -> 0x012b }
            monitor-exit(r7)
            return
        L_0x012b:
            r8 = move-exception
            goto L_0x0132
        L_0x012d:
            r8 = 0
            r7.m = r8     // Catch:{ all -> 0x012b }
            monitor-exit(r7)
            return
        L_0x0132:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.b.h.a(org.json.JSONObject):void");
    }

    /* access modifiers changed from: package-private */
    public String k() {
        return this.g != null ? null : null;
    }

    public final int b() {
        if (this.t <= 0) {
            return 100;
        }
        return this.t;
    }

    public final int e() {
        if (this.u <= 0) {
            return 4;
        }
        return this.u;
    }

    public final int f() {
        if (this.v <= 0) {
            return 15;
        }
        return this.v;
    }

    public final boolean h() {
        if (this.D) {
            return this.D;
        }
        return this.z;
    }

    public final int j() {
        return NetworkUtils.getNetworkTypeFast(this.f20148a).getValue();
    }

    private boolean l() {
        if ((System.currentTimeMillis() - this.f20152e) / 1000 > this.r) {
            return true;
        }
        return false;
    }

    public final int a() {
        if (this.s <= 0) {
            return 120;
        }
        return this.s;
    }

    public final long g() {
        if (this.y == 0) {
            return 1800000;
        }
        return this.y * 1000;
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences i() {
        String a2 = f.a(this.f20148a);
        Context context = this.f20148a;
        return com.ss.android.ugc.aweme.q.c.a(context, "monitor_config" + this.q + a2, 0);
    }

    private boolean b(String str) {
        if (this.w == null || TextUtils.isEmpty(str) || this.w.opt(str) == null) {
            return false;
        }
        return true;
    }

    public final void a(long j2) {
        if (System.currentTimeMillis() - this.A > this.B) {
            this.D = false;
            if (this.f20150c != null) {
                d dVar = this.f20150c;
                boolean z2 = true;
                if (this.x != 1) {
                    z2 = false;
                }
                dVar.f20113a = z2;
            }
        }
        if (this.r > 0) {
            a(false);
        }
    }

    protected h(String str) {
        this.q = str;
        this.l = false;
        this.n = new a();
    }

    public final String a(String str) {
        String str2;
        if (TextUtils.isDigitsOnly(str) || this.h == null) {
            return str;
        }
        if (str.indexOf("?") < 0) {
            str = str + "?";
        }
        if (str.endsWith("?")) {
            str2 = str + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8");
        } else {
            str2 = str + "&" + a("sdk_version", "UTF-8") + "=" + a("400", "UTF-8");
        }
        HashMap<String, String> hashMap = this.h;
        if (hashMap != null && hashMap.size() > 0) {
            for (Map.Entry key : hashMap.entrySet()) {
                if (hashMap.get(key.getKey()) != null) {
                    if (str2.endsWith("?")) {
                        str2 = str2 + a(key.getKey().toString(), "UTF-8") + "=" + a(hashMap.get(key.getKey()).toString(), "UTF-8");
                    } else {
                        str2 = str2 + "&" + a(key.getKey().toString(), "UTF-8") + "=" + a(hashMap.get(key.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str2;
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void a(String str, int i2, JSONObject jSONObject) {
        a(str, i2, null, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        a(str, 0, jSONObject, jSONObject2);
    }

    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.l) {
                a aVar = this.n;
                j jVar = new j(str, i2, jSONObject, null, null, jSONObject2, System.currentTimeMillis());
                aVar.a(jVar);
                return;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.framwork.core.a.d.a a2 = com.bytedance.framwork.core.a.d.a.a();
            final String str2 = str;
            final int i3 = i2;
            final JSONObject jSONObject3 = jSONObject;
            final JSONObject jSONObject4 = jSONObject2;
            AnonymousClass5 r0 = new Runnable(null, null) {

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ JSONObject f20164d;

                public final void run() {
                    h.this.a(str2, i3, jSONObject3, this.f20164d, null, jSONObject4, currentTimeMillis);
                }

                {
                    this.f20164d = r5;
                }
            };
            a2.a((Runnable) r0);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|(1:7)|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.framwork.core.a.c.e a(long r2, java.lang.String r4, byte[] r5, int r6, java.lang.String r7) {
        /*
            r1 = this;
            com.bytedance.framwork.core.a.c.e r2 = new com.bytedance.framwork.core.a.c.e
            r2.<init>()
            r3 = 0
            java.lang.String r4 = r1.a((java.lang.String) r4)     // Catch:{ Throwable -> 0x0045 }
            com.bytedance.framwork.core.b.g$a r6 = com.bytedance.framwork.core.b.g.a.GZIP     // Catch:{ Throwable -> 0x0045 }
            boolean r0 = r1.j     // Catch:{ Throwable -> 0x0045 }
            byte[] r4 = com.bytedance.framwork.core.b.g.a(r4, r5, r6, r7, r0)     // Catch:{ Throwable -> 0x0045 }
            r1.C = r3     // Catch:{ Throwable -> 0x0045 }
            r5 = 0
            r1.B = r5     // Catch:{ Throwable -> 0x0045 }
            r5 = 200(0xc8, float:2.8E-43)
            r2.f20111a = r5     // Catch:{ Throwable -> 0x0045 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0045 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Throwable -> 0x0045 }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x0045 }
            r5.<init>(r6)     // Catch:{ Throwable -> 0x0045 }
            java.lang.String r4 = "data"
            java.lang.String r4 = r5.optString(r4)     // Catch:{ Throwable -> 0x0042 }
            boolean r6 = r4.isEmpty()     // Catch:{ Throwable -> 0x0042 }
            if (r6 != 0) goto L_0x0040
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0042 }
            byte[] r4 = r4.getBytes()     // Catch:{ Throwable -> 0x0042 }
            java.lang.String r4 = com.bytedance.framwork.core.a.e.a.a(r4)     // Catch:{ Throwable -> 0x0042 }
            r6.<init>(r4)     // Catch:{ Throwable -> 0x0042 }
            r5 = r6
        L_0x0040:
            r2.f20112b = r5     // Catch:{ Throwable -> 0x0042 }
        L_0x0042:
            r2.f20112b = r5     // Catch:{ Throwable -> 0x0045 }
            return r2
        L_0x0045:
            r4 = move-exception
            boolean r5 = r4 instanceof com.bytedance.framwork.core.b.c
            if (r5 == 0) goto L_0x0053
            com.bytedance.framwork.core.b.c r4 = (com.bytedance.framwork.core.b.c) r4
            int r4 = r4.getStatusCode()
            r2.f20111a = r4
            goto L_0x0056
        L_0x0053:
            r4 = -1
            r2.f20111a = r4
        L_0x0056:
            int r4 = r2.f20111a
            r5 = 503(0x1f7, float:7.05E-43)
            if (r4 == r5) goto L_0x0062
            int r4 = r2.f20111a
            r5 = 509(0x1fd, float:7.13E-43)
            if (r4 != r5) goto L_0x0091
        L_0x0062:
            r4 = 1
            r1.D = r4
            long r5 = java.lang.System.currentTimeMillis()
            r1.A = r5
            com.bytedance.framwork.core.a.d r5 = r1.f20150c
            r5.f20113a = r3
            com.bytedance.framwork.core.a.b r5 = r1.f20151d
            r5.f20080a = r3
            int r3 = r1.C
            if (r3 != 0) goto L_0x007d
            r5 = 300000(0x493e0, double:1.482197E-318)
            r1.B = r5
            goto L_0x008c
        L_0x007d:
            int r3 = r1.C
            if (r3 != r4) goto L_0x0087
            r5 = 900000(0xdbba0, double:4.44659E-318)
            r1.B = r5
            goto L_0x008c
        L_0x0087:
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            r1.B = r5
        L_0x008c:
            int r3 = r1.C
            int r3 = r3 + r4
            r1.C = r3
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.b.h.a(long, java.lang.String, byte[], int, java.lang.String):com.bytedance.framwork.core.a.c.e");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, long j2) {
        if (jSONObject4 == null) {
            try {
                jSONObject4 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject4.put("log_type", "service_monitor");
        jSONObject4.put("service", str);
        jSONObject4.put("status", i2);
        jSONObject4.put("network_type", j());
        jSONObject4.put("value", jSONObject);
        if (jSONObject2 != null) {
            jSONObject4.put("category", jSONObject2);
        }
        if (jSONObject3 != null) {
            jSONObject4.put("metric", jSONObject3);
        }
        if (jSONObject4.isNull("timestamp")) {
            jSONObject4.put("timestamp", j2);
        }
        if (!TextUtils.isEmpty(k())) {
            jSONObject4.put("session_id", k());
        }
        if (this.f20150c != null && b(str)) {
            this.f20150c.a("service_monitor", "service_monitor", jSONObject4);
        }
    }
}
