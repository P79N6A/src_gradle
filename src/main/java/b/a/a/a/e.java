package b.a.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import b.a.a.a.a;
import b.a.a.a.d;
import com.bytedance.frameworks.baselib.a.d;
import com.bytedance.frameworks.core.a.a.b;
import com.bytedance.frameworks.core.a.c.c;
import com.bytedance.frameworks.core.a.h;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class e implements b, c, h.a {
    static ConcurrentHashMap<String, List<String>> h = new ConcurrentHashMap<>();
    static ConcurrentHashMap<String, List<String>> i = new ConcurrentHashMap<>();
    private volatile boolean A;
    private volatile long B;
    private List<String> C;
    private List<String> D;
    private List<String> E = new ArrayList(Arrays.asList(new String[]{"http://mon.snssdk.com/monitor/collect/", "http://mon.toutiao.com/monitor/collect/", "http://mon.toutiaocloud.com/monitor/collect/", "http://mon.toutiaocloud.net/monitor/collect/"}));

    /* renamed from: a  reason: collision with root package name */
    Context f1616a;

    /* renamed from: b  reason: collision with root package name */
    public h f1617b;

    /* renamed from: c  reason: collision with root package name */
    public a f1618c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f1619d = new ArrayList(Arrays.asList(new String[]{"http://mon.snssdk.com/monitor/appmonitor/v2/settings", "http://monsetting.toutiao.com/monitor/appmonitor/v2/settings"}));

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f1620e = true;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f1621f;
    public a g;
    String j;
    private JSONObject k;
    private volatile long l;
    private volatile long m;
    private volatile int n;
    private volatile int o;
    private volatile int p;
    private volatile int q;
    private volatile JSONObject r;
    private volatile int s = 1;
    private volatile long t;
    private HashMap<String, String> u;
    private volatile boolean v;
    private volatile long w = 0;
    private volatile long x = 0;
    private volatile int y = 0;
    private volatile boolean z;

    public interface a {
    }

    public final String e() {
        return "monitor";
    }

    public final long f() {
        return this.B;
    }

    public final JSONObject g() {
        return this.k;
    }

    private String q() {
        return this.f1618c != null ? null : null;
    }

    private int o() {
        return d.a(this.f1616a.getApplicationContext()).getValue();
    }

    private void p() {
        d.a((d.b) new d.b() {
            public final boolean a(Context context) {
                return d.b(context);
            }
        });
    }

    public final int b() {
        if (this.n <= 0) {
            return 120;
        }
        return this.n;
    }

    public final int c() {
        if (this.o <= 0) {
            return 100;
        }
        return this.o;
    }

    public final int h() {
        if (this.p <= 0) {
            return 4;
        }
        return this.p;
    }

    public final int i() {
        if (this.q <= 0) {
            return 15;
        }
        return this.q;
    }

    public final boolean k() {
        if (this.z) {
            return this.z;
        }
        return this.v;
    }

    private boolean m() {
        if ((System.currentTimeMillis() - this.l) / 1000 > this.m) {
            return true;
        }
        return false;
    }

    public final long j() {
        if (this.t == 0) {
            return 1800000;
        }
        return this.t * 1000;
    }

    private void l() {
        Context context = this.f1616a;
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "monitor_config" + this.j, 0);
        String string = a2.getString("monitor_net_config", null);
        this.l = a2.getLong("monitor_configure_refresh_time", 0);
        if (string != null && !TextUtils.isEmpty(string)) {
            try {
                this.f1621f = true;
                a(new JSONObject(string));
            } catch (Exception unused) {
            }
        }
        a(false);
    }

    private void n() {
        if (this.f1617b != null) {
            try {
                this.f1617b.a(new com.bytedance.frameworks.core.a.b.e(this.k.optString("version_code"), this.k.optString("version_name"), this.k.optString("manifest_version_code"), this.k.optString("update_version_code")));
            } catch (Exception unused) {
            }
        }
    }

    public final List<String> d() {
        if (this.C == null) {
            this.C = Arrays.asList(new String[]{"monitor"});
        }
        return this.C;
    }

    public final void a() {
        if (System.currentTimeMillis() - this.w > this.x) {
            this.z = false;
            if (this.f1617b != null) {
                h hVar = this.f1617b;
                boolean z2 = true;
                if (this.s != 1) {
                    z2 = false;
                }
                hVar.a(z2);
            }
        }
        if (this.m > 0) {
            a(false);
        }
    }

    private boolean d(String str) {
        if (this.r == null || TextUtils.isEmpty(str) || this.r.opt(str) == null) {
            return false;
        }
        return true;
    }

    public final List<String> a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return this.E;
        }
        return Collections.emptyList();
    }

    @VisibleForTesting
    private void a(boolean z2) {
        if (this.m < 600) {
            this.m = 600;
        }
        if (m() && d.b(this.f1616a)) {
            synchronized (e.class) {
                this.l = System.currentTimeMillis();
            }
            try {
                com.bytedance.frameworks.core.b.a.a();
                com.bytedance.frameworks.core.b.a.a(new com.bytedance.frameworks.core.b.c() {
                    public final void run() {
                        byte[] bArr;
                        try {
                            if (e.this.f1618c != null) {
                                Iterator<String> it2 = e.this.f1619d.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    String c2 = e.this.c(it2.next());
                                    String str = c2 + "&encrypt=close";
                                    try {
                                        boolean z = e.this.f1620e;
                                        if (TextUtils.isDigitsOnly(str)) {
                                            bArr = null;
                                        } else {
                                            bArr = d.a(str, null, null, null, "GET", false, z);
                                        }
                                        if (bArr != null) {
                                            e eVar = e.this;
                                            JSONObject jSONObject = new JSONObject(new String(bArr));
                                            if (jSONObject.length() > 0) {
                                                try {
                                                    eVar.a(jSONObject.getJSONObject("data"));
                                                    SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(eVar.f1616a, "monitor_config" + eVar.j, 0).edit();
                                                    edit.putLong("monitor_configure_refresh_time", System.currentTimeMillis());
                                                    edit.putString("monitor_net_config", jSONObject.getJSONObject("data").toString());
                                                    edit.apply();
                                                    if (!eVar.f1621f) {
                                                        eVar.f1621f = true;
                                                        eVar.g.a(eVar);
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
                            if (!e.this.f1621f) {
                                e.this.f1621f = true;
                                e.this.g.a(e.this);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public final List<String> b(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "monitor")) {
            return null;
        }
        if (this.D == null) {
            this.D = Arrays.asList(new String[]{"service_monitor"});
        }
        return this.D;
    }

    public final String c(String str) {
        String str2;
        if (TextUtils.isDigitsOnly(str) || this.u == null) {
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
        HashMap<String, String> hashMap = this.u;
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

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:6|7|8|9|(2:13|(3:15|(2:19|40)|20))|21|22|(1:24)|25|(2:27|(1:29))) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(org.json.JSONObject r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r8 == 0) goto L_0x00ca
            int r0 = r8.length()     // Catch:{ all -> 0x00c8 }
            if (r0 > 0) goto L_0x000b
            goto L_0x00ca
        L_0x000b:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00c8 }
            r0.<init>()     // Catch:{ all -> 0x00c8 }
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
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x00c8 }
            if (r2 != 0) goto L_0x0046
            r7.E = r0     // Catch:{ all -> 0x00c8 }
        L_0x0046:
            java.lang.String r0 = "fetch_setting_interval"
            r2 = 1200(0x4b0, double:5.93E-321)
            long r2 = r8.optLong(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.m = r2     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "polling_interval"
            r2 = 120(0x78, float:1.68E-43)
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.n = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "once_max_count"
            r2 = 100
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.o = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "max_retry_count"
            r2 = 4
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.p = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "report_fail_base_time"
            r2 = 15
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.q = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "log_send_switch"
            r2 = 1
            int r0 = r8.optInt(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.s = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "more_channel_stop_interval"
            r3 = 1800(0x708, double:8.893E-321)
            long r3 = r8.optLong(r0, r3)     // Catch:{ all -> 0x00c8 }
            r7.t = r3     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "log_remvove_switch"
            boolean r0 = r8.optBoolean(r0, r1)     // Catch:{ all -> 0x00c8 }
            r7.v = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "allow_service_name"
            org.json.JSONObject r0 = r8.optJSONObject(r0)     // Catch:{ all -> 0x00c8 }
            r7.r = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "monitor_encrypt_switch"
            boolean r0 = r8.optBoolean(r0, r2)     // Catch:{ all -> 0x00c8 }
            r7.f1620e = r0     // Catch:{ all -> 0x00c8 }
            java.lang.String r0 = "monitor_log_max_save_count"
            r1 = 40000(0x9c40, double:1.97626E-319)
            long r0 = r8.optLong(r0, r1)     // Catch:{ all -> 0x00c8 }
            r7.B = r0     // Catch:{ all -> 0x00c8 }
            com.bytedance.frameworks.core.a.h r8 = r7.f1617b     // Catch:{ all -> 0x00c8 }
            if (r8 == 0) goto L_0x00c6
            com.bytedance.frameworks.core.a.h r8 = r7.f1617b     // Catch:{ all -> 0x00c8 }
            com.bytedance.frameworks.core.a.d r0 = r8.f19965a     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c6
            com.bytedance.frameworks.core.a.d r8 = r8.f19965a     // Catch:{ all -> 0x00c8 }
            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ all -> 0x00c8 }
            r1 = 8
            r0.what = r1     // Catch:{ all -> 0x00c8 }
            android.os.Handler r8 = r8.f19946b     // Catch:{ all -> 0x00c8 }
            r8.sendMessage(r0)     // Catch:{ all -> 0x00c8 }
        L_0x00c6:
            monitor-exit(r7)
            return
        L_0x00c8:
            r8 = move-exception
            goto L_0x00cf
        L_0x00ca:
            r8 = 0
            r7.E = r8     // Catch:{ all -> 0x00c8 }
            monitor-exit(r7)
            return
        L_0x00cf:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.e.a(org.json.JSONObject):void");
    }

    private static String a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:2|3)|4|5|(1:7)|8|(2:(1:11)|12)|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0182, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00a2 A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c3 A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ce A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x014d A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0167 A[Catch:{ Exception -> 0x0182 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x007b A[Catch:{ Exception -> 0x0182 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r5, org.json.JSONObject r6, b.a.a.a.e.a r7) {
        /*
            r4 = this;
            r0 = 1
            r4.A = r0
            android.content.Context r1 = r5.getApplicationContext()
            r4.f1616a = r1
            r4.k = r6
            org.json.JSONObject r6 = r4.k
            java.lang.String r1 = "package_name"
            java.lang.String r6 = r6.optString(r1)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x0024
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0024 }
            java.lang.String r1 = "package_name"
            java.lang.String r2 = r5.getPackageName()     // Catch:{ Exception -> 0x0024 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "aid"
            java.lang.String r2 = r4.j     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "os"
            java.lang.String r2 = "Android"
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "device_platform"
            java.lang.String r2 = "android"
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "os_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "os_api"
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "device_model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "device_brand"
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r6 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "device_manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0182 }
            r6.put(r1, r2)     // Catch:{ Exception -> 0x0182 }
            r6 = 0
            org.json.JSONObject r1 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r2 = "version_name"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0182 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0182 }
            if (r1 == 0) goto L_0x0094
            android.content.Context r6 = r4.f1616a     // Catch:{ Exception -> 0x0182 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0182 }
            android.content.Context r1 = r4.f1616a     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0182 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r0)     // Catch:{ Exception -> 0x0182 }
            org.json.JSONObject r1 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r2 = "version_name"
            java.lang.String r3 = r6.versionName     // Catch:{ Exception -> 0x0182 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0182 }
        L_0x0094:
            org.json.JSONObject r1 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r2 = "version_code"
            java.lang.String r1 = r1.optString(r2)     // Catch:{ Exception -> 0x0182 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0182 }
            if (r1 == 0) goto L_0x00bd
            if (r6 != 0) goto L_0x00b4
            android.content.Context r6 = r4.f1616a     // Catch:{ Exception -> 0x0182 }
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0182 }
            android.content.Context r1 = r4.f1616a     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0182 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r1, r0)     // Catch:{ Exception -> 0x0182 }
        L_0x00b4:
            org.json.JSONObject r0 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "version_code"
            int r6 = r6.versionCode     // Catch:{ Exception -> 0x0182 }
            r0.put(r1, r6)     // Catch:{ Exception -> 0x0182 }
        L_0x00bd:
            r4.f1618c = r7     // Catch:{ Exception -> 0x0182 }
            b.a.a.a.e$a r6 = r4.f1618c     // Catch:{ Exception -> 0x0182 }
            if (r6 != 0) goto L_0x00ca
            b.a.a.a.e$1 r6 = new b.a.a.a.e$1     // Catch:{ Exception -> 0x0182 }
            r6.<init>()     // Catch:{ Exception -> 0x0182 }
            r4.f1618c = r6     // Catch:{ Exception -> 0x0182 }
        L_0x00ca:
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            if (r6 != 0) goto L_0x00d5
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ Exception -> 0x0182 }
            r6.<init>()     // Catch:{ Exception -> 0x0182 }
            r4.u = r6     // Catch:{ Exception -> 0x0182 }
        L_0x00d5:
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "aid"
            java.lang.String r0 = r4.j     // Catch:{ Exception -> 0x0182 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "device_id"
            org.json.JSONObject r0 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "device_id"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x0182 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "device_platform"
            java.lang.String r0 = "android"
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "package_name"
            org.json.JSONObject r0 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "package_name"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x0182 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "channel"
            org.json.JSONObject r0 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "channel"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x0182 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r4.u     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = "app_version"
            org.json.JSONObject r0 = r4.k     // Catch:{ Exception -> 0x0182 }
            java.lang.String r1 = "app_version"
            java.lang.String r0 = r0.optString(r1)     // Catch:{ Exception -> 0x0182 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = r4.j     // Catch:{ Exception -> 0x0182 }
            com.bytedance.frameworks.core.a.a.c.a((java.lang.String) r6, (com.bytedance.frameworks.core.a.a.b) r4)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = r4.j     // Catch:{ Exception -> 0x0182 }
            com.bytedance.frameworks.core.a.c.d.a(r6, r4)     // Catch:{ Exception -> 0x0182 }
            r4.p()     // Catch:{ Exception -> 0x0182 }
            com.bytedance.frameworks.core.a.h r6 = new com.bytedance.frameworks.core.a.h     // Catch:{ Exception -> 0x0182 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Exception -> 0x0182 }
            java.lang.String r7 = r4.j     // Catch:{ Exception -> 0x0182 }
            r6.<init>(r5, r4, r7)     // Catch:{ Exception -> 0x0182 }
            r4.f1617b = r6     // Catch:{ Exception -> 0x0182 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r5 = h     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = r4.j     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x0182 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x0182 }
            boolean r6 = b.a.a.a.c.a(r5)     // Catch:{ Exception -> 0x0182 }
            if (r6 != 0) goto L_0x0157
            java.util.List<java.lang.String> r6 = r4.f1619d     // Catch:{ Exception -> 0x0182 }
            r6.clear()     // Catch:{ Exception -> 0x0182 }
            java.util.List<java.lang.String> r6 = r4.f1619d     // Catch:{ Exception -> 0x0182 }
            r6.addAll(r5)     // Catch:{ Exception -> 0x0182 }
        L_0x0157:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r5 = i     // Catch:{ Exception -> 0x0182 }
            java.lang.String r6 = r4.j     // Catch:{ Exception -> 0x0182 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ Exception -> 0x0182 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ Exception -> 0x0182 }
            boolean r6 = b.a.a.a.c.a(r5)     // Catch:{ Exception -> 0x0182 }
            if (r6 != 0) goto L_0x0171
            java.util.List<java.lang.String> r6 = r4.E     // Catch:{ Exception -> 0x0182 }
            r6.clear()     // Catch:{ Exception -> 0x0182 }
            java.util.List<java.lang.String> r6 = r4.E     // Catch:{ Exception -> 0x0182 }
            r6.addAll(r5)     // Catch:{ Exception -> 0x0182 }
        L_0x0171:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r5 = h     // Catch:{ Exception -> 0x0182 }
            r5.clear()     // Catch:{ Exception -> 0x0182 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<java.lang.String>> r5 = i     // Catch:{ Exception -> 0x0182 }
            r5.clear()     // Catch:{ Exception -> 0x0182 }
            r4.l()     // Catch:{ Exception -> 0x0182 }
            r4.n()     // Catch:{ Exception -> 0x0182 }
            return
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.e.a(android.content.Context, org.json.JSONObject, b.a.a.a.e$a):void");
    }

    protected e(Context context, String str, JSONObject jSONObject, a aVar) {
        this.j = str;
        this.f1621f = false;
        this.g = new a();
        if (jSONObject != null && jSONObject.length() > 0) {
            a(context, jSONObject, aVar);
            if (this.f1621f) {
                this.g.a(this);
            }
        }
    }

    private void b(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (Throwable unused) {
                return;
            }
        }
        jSONObject2.put("log_type", "service_monitor");
        jSONObject2.put("service", str);
        jSONObject2.put("status", i2);
        jSONObject2.put("network_type", o());
        jSONObject2.put("value", jSONObject);
        jSONObject2.put("timestamp", System.currentTimeMillis());
        if (!TextUtils.isEmpty(q())) {
            jSONObject2.put("session_id", q());
        }
        if (this.f1617b != null && d(str)) {
            this.f1617b.a("service_monitor", jSONObject2.toString(), true);
        }
    }

    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            if (!this.f1621f) {
                this.g.a(new a.C0003a(str, i2, jSONObject, jSONObject2));
            } else {
                b(str, i2, jSONObject, jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    public final com.bytedance.frameworks.core.a.c.e a(long j2, String str, byte[] bArr, int i2, String str2) {
        com.bytedance.frameworks.core.a.c.e eVar = new com.bytedance.frameworks.core.a.c.e();
        try {
            byte[] a2 = d.a(c(str), bArr, d.a.GZIP, str2, this.f1620e);
            this.y = 0;
            this.x = 0;
            eVar.f19942a = 200;
            eVar.f19943b = new JSONObject(new String(a2));
            return eVar;
        } catch (Throwable th) {
            if (th instanceof b) {
                eVar.f19942a = ((b) th).getStatusCode();
            } else {
                eVar.f19942a = -1;
            }
            if (eVar.f19942a == 503 || eVar.f19942a == 509) {
                this.z = true;
                this.w = System.currentTimeMillis();
                if (this.f1617b != null) {
                    this.f1617b.a(false);
                }
                if (this.y == 0) {
                    this.x = 300000;
                } else if (this.y == 1) {
                    this.x = 900000;
                } else {
                    this.x = 1800000;
                }
                this.y++;
            }
            return eVar;
        }
    }
}
