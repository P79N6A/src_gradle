package com.bytedance.ttnet.config;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.webkit.CookieManager;
import com.bytedance.common.httpdns.HttpDnsService;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.frameworks.baselib.network.a.c;
import com.bytedance.frameworks.baselib.network.http.cronet.a.c;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.util.g;
import com.bytedance.frameworks.baselib.network.http.util.i;
import com.bytedance.frameworks.core.encrypt.a;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.b;
import com.bytedance.ttnet.config.c;
import com.bytedance.ttnet.encrypt.c;
import com.bytedance.ttnet.hostmonitor.ConnectivityReceiver;
import com.bytedance.ttnet.hostmonitor.HostMonitor;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.hostmonitor.d;
import com.bytedance.ttnet.utils.f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements WeakHandler.IHandler, c.b, c.b, e.c, e.C0162e, e.g, e.h, a.C0163a, SsHttpCall.a, b.C0235b, c.a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f22576a = false;
    private static int aj = 1;
    private static int ak = 1;
    private static int al = 1;
    private static int am = 1;
    private static int an = 1;
    private static int ao = -1;
    private static int ap = -1;
    private static int as = -1;
    private static boolean at = false;
    private static boolean au = false;

    /* renamed from: b  reason: collision with root package name */
    public static a f22577b = null;
    public static int g = 3;
    public static boolean o;
    static boolean p;
    private static int q;
    private static int r;
    private Map<String, String> A = new HashMap();
    private HashMap<String, InetAddress[]> B;
    private HashMap<C0236a, C0236a> C;
    private HashMap<String, String> D = new HashMap<>();
    private HashMap<String, String> E = new HashMap<>();
    private String F = "";
    private int G = 0;
    private int H = 0;
    private int I = 0;
    private int J = 0;
    private long K = 0;
    private int L = 0;
    private int M = 0;
    private int N = 1;
    private int O = 1;
    private int P = 0;
    private int Q = 1;
    private int R = 1;
    private int S = 0;
    private int T = 1;
    private int U = 1;
    private int V = 1;
    private int W = 1;
    private int X = 1;
    private int Y = 1;
    private int Z = 1;
    private int aa = 1;
    private int ab = 0;
    private Set<String> ac;
    private int ad = 600000;
    private String ae = "";
    private String af = "";
    private Set<String> ag = new HashSet();
    private List<String> ah = new CopyOnWriteArrayList();
    private int ai = 0;
    private volatile int aq;
    private volatile HttpDnsService ar = null;

    /* renamed from: c  reason: collision with root package name */
    boolean f22578c;

    /* renamed from: d  reason: collision with root package name */
    AtomicBoolean f22579d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public final Context f22580e;

    /* renamed from: f  reason: collision with root package name */
    public Map<C0236a, C0236a> f22581f;
    public int h = 0;
    public volatile c i = null;
    public final WeakHandler j = new WeakHandler(Looper.getMainLooper(), this);
    d k;
    com.bytedance.ttnet.hostmonitor.c l;
    public int m;
    final HostMonitorBroadcastReceiver n = new AppConfig$1(this);
    private final boolean s;
    private volatile boolean t;
    private boolean u = true;
    private long v;
    private long w;
    private volatile boolean x = false;
    private HashMap<String, String> y = new HashMap<>();
    private HashMap<String, String> z = new HashMap<>();

    /* renamed from: com.bytedance.ttnet.config.a$a  reason: collision with other inner class name */
    static class C0236a {

        /* renamed from: a  reason: collision with root package name */
        static String f22588a = "url_regex";

        /* renamed from: b  reason: collision with root package name */
        static String f22589b = "err_count";

        /* renamed from: c  reason: collision with root package name */
        String f22590c;

        /* renamed from: d  reason: collision with root package name */
        Matcher f22591d;

        /* renamed from: e  reason: collision with root package name */
        int f22592e;

        C0236a() {
        }

        public final int hashCode() {
            return this.f22590c.hashCode();
        }

        /* access modifiers changed from: package-private */
        public final void a(String str) {
            if (!StringUtils.isEmpty(str)) {
                this.f22590c = str;
                this.f22591d = Pattern.compile(str).matcher("");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f22590c.equals(((C0236a) obj).f22590c);
        }
    }

    public final Set<String> m() {
        return this.ac;
    }

    public final void a(boolean z2) {
        if (this.s) {
            d(z2);
            if (this.i != null) {
                this.i.b(this.f22580e);
            }
        } else if (this.v <= 0) {
            try {
                new ThreadPlus("LoadDomainConfig4Other-Thread") {
                    public final void run() {
                        a.this.i();
                    }
                }.start();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return i(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.net.InetAddress> a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0040
            boolean r0 = r2.s
            if (r0 != 0) goto L_0x000c
            goto L_0x0040
        L_0x000c:
            r2.j()
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.B     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.B     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003d }
            r1 = r0
            java.net.InetAddress[] r1 = (java.net.InetAddress[]) r1     // Catch:{ all -> 0x003d }
        L_0x001d:
            if (r1 == 0) goto L_0x0037
            int r0 = r1.length     // Catch:{ all -> 0x003d }
            if (r0 <= 0) goto L_0x0037
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x003d }
            r3.addAll(r0)     // Catch:{ all -> 0x003d }
            int r0 = as     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            java.util.Collections.shuffle(r3)     // Catch:{ all -> 0x003d }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return r3
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            java.util.List r3 = r2.i(r3)
            return r3
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:15|16|(1:18)(1:19)|(1:24)(1:23)|25|26|(2:33|(5:35|36|37|38|39))|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ Throwable -> 0x00d9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r10, com.bytedance.frameworks.baselib.network.http.b r11) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.i.a(r10)     // Catch:{ Throwable -> 0x00d9 }
            r1 = 0
            java.net.URI r0 = r9.a((java.net.URI) r0, (boolean) r1)     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00d9 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String[] r5 = p()     // Catch:{ Throwable -> 0x00d9 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00d9 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00d9 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00d9 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            boolean r5 = r9.s     // Catch:{ Throwable -> 0x00d9 }
            if (r5 == 0) goto L_0x0038
            r9.j()     // Catch:{ Throwable -> 0x00d9 }
            goto L_0x003b
        L_0x0038:
            r9.i()     // Catch:{ Throwable -> 0x00d9 }
        L_0x003b:
            monitor-enter(r9)     // Catch:{ Throwable -> 0x00d9 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.A     // Catch:{ all -> 0x00d6 }
            r6 = 0
            if (r5 == 0) goto L_0x004a
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.A     // Catch:{ all -> 0x00d6 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d6 }
            goto L_0x004b
        L_0x004a:
            r5 = r6
        L_0x004b:
            if (r5 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.y     // Catch:{ all -> 0x00d6 }
            if (r7 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.y     // Catch:{ all -> 0x00d6 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00d6 }
            goto L_0x005b
        L_0x005a:
            r5 = r6
        L_0x005b:
            java.lang.String r7 = com.bytedance.ttnet.a.a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = com.bytedance.ttnet.a.a(r7)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x008f }
            if (r2 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x008f
            java.lang.String r2 = com.bytedance.ttnet.a.a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = com.bytedance.ttnet.a.a(r2)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
        L_0x0079:
            com.bytedance.ttnet.config.c r2 = r9.i     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            com.bytedance.ttnet.config.c r2 = r9.i     // Catch:{ Throwable -> 0x008f }
            android.util.Pair r2 = r2.a()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            java.lang.Object r7 = r2.first     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x008e }
            r5 = r2
        L_0x008e:
            r6 = r7
        L_0x008f:
            monitor-exit(r9)     // Catch:{ all -> 0x00d6 }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00d9 }
            if (r2 != 0) goto L_0x009f
            com.bytedance.frameworks.baselib.network.http.util.c r2 = new com.bytedance.frameworks.baselib.network.http.util.c     // Catch:{ Throwable -> 0x00d9 }
            r2.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00d9 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.i.a(r0, r2)     // Catch:{ Throwable -> 0x00d9 }
        L_0x009f:
            java.lang.String r11 = r9.a(r0, r11, r6, r1)     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r0 = "?"
            boolean r0 = r11.contains(r0)     // Catch:{ Throwable -> 0x00d9 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "?"
            boolean r0 = r10.contains(r0)     // Catch:{ Throwable -> 0x00d9 }
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d9 }
            r0.<init>()     // Catch:{ Throwable -> 0x00d9 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r11 = "?"
            int r11 = r10.indexOf(r11)     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r11 = r10.substring(r11)     // Catch:{ Throwable -> 0x00d9 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r11 = r0.toString()     // Catch:{ Throwable -> 0x00d9 }
        L_0x00cc:
            r10 = r11
            com.bytedance.ttnet.c.c r11 = com.bytedance.ttnet.c.c.a()     // Catch:{ Throwable -> 0x00d9 }
            java.lang.String r11 = r11.a(r10)     // Catch:{ Throwable -> 0x00d9 }
            goto L_0x00da
        L_0x00d6:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d6 }
            throw r11     // Catch:{ Throwable -> 0x00d9 }
        L_0x00d9:
            r11 = r10
        L_0x00da:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.a(java.lang.String, com.bytedance.frameworks.baselib.network.http.b):java.lang.String");
    }

    private static boolean a(HashMap<String, String> hashMap, JSONObject jSONObject) throws JSONException {
        Matcher matcher = Pattern.compile("^([0-9a-zA-Z-]{1,40}\\.){1,5}[0-9a-zA-Z]{1,20}$").matcher("");
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String string = jSONObject.getString(next);
            if (StringUtils.isEmpty(next) || !matcher.reset(string).matches()) {
                return false;
            }
            hashMap.put(next, string);
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(21:126|127|(2:129|(1:131))(1:132)|133|(1:135)(1:136)|137|(1:139)|140|(1:142)|143|(3:145|(2:147|231)(2:148|230)|149)|229|150|(1:154)|155|156|157|(1:161)|162|163|164) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x0577 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b0  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02d8 A[SYNTHETIC, Splitter:B:121:0x02d8] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02f9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.Object r62) throws java.lang.Exception {
        /*
            r61 = this;
            r1 = r61
            r0 = r62
            boolean r2 = r0 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0012
            return r3
        L_0x0012:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r0 = "message"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r4 = "success"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002f
            return r3
        L_0x0026:
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L_0x002e
            r2 = r0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            return r3
        L_0x0032:
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r0)
            java.lang.String r0 = "mapping"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0045:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r5 = a((java.util.HashMap<java.lang.String, java.lang.String>) r4, (org.json.JSONObject) r0)
            r6 = 1
            if (r5 == 0) goto L_0x0064
            monitor-enter(r61)
            r1.y = r4     // Catch:{ all -> 0x0061 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            r5.putAll(r4)     // Catch:{ all -> 0x0061 }
            r1.z = r5     // Catch:{ all -> 0x0061 }
            monitor-exit(r61)     // Catch:{ all -> 0x0061 }
            r4 = 1
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            r4 = 0
        L_0x0065:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "dns_mapping"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            b(r7, r0)
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0085
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x0085
            java.lang.String r8 = r0.toString()
        L_0x0085:
            java.lang.String r0 = "shuffle_dns"
            int r0 = r2.optInt(r0)
            as = r0
            java.lang.String r0 = "use_dns_mapping"
            r9 = -1
            int r0 = r2.optInt(r0, r9)
            com.bytedance.frameworks.baselib.network.http.e.a((int) r0)
            java.lang.String r0 = "use_http_dns"
            int r0 = r2.optInt(r0, r9)
            ao = r0
            java.lang.String r0 = "collect_recent_page_info_enable"
            int r0 = r2.optInt(r0, r9)
            ap = r0
            monitor-enter(r61)
            r1.B = r7     // Catch:{ all -> 0x0688 }
            monitor-exit(r61)     // Catch:{ all -> 0x0688 }
            java.lang.String r0 = "https_dns_err_max"
            r7 = 3
            int r7 = r2.optInt(r0, r7)
            java.lang.String r0 = "https_dns_err_policy"
            int r9 = r2.optInt(r0, r3)
            java.lang.String r0 = "hs_open"
            int r10 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http_open"
            int r11 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http3_open"
            int r12 = r2.optInt(r0, r3)
            java.lang.String r0 = "chromium_open"
            int r13 = r2.optInt(r0, r3)
            java.lang.String r0 = "http_dns_enabled"
            int r14 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_open"
            int r15 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_native_page"
            int r3 = r2.optInt(r0, r6)
            java.lang.String r0 = "collect_recent_page_info_enable"
            r16 = r8
            int r8 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open"
            r17 = r5
            r6 = 0
            int r5 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open_v2"
            r19 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "replace_url_open"
            r20 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_open"
            r21 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_header_open"
            r22 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r23 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_device_fingerprint_open"
            r24 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "image_ttnet_enabled"
            r25 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r26 = r0
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r27 = r0
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r0 = r2.optInt(r0, r6)
            r28 = r0
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r29 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_enabled"
            r30 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_api"
            java.lang.String r6 = "[]"
            java.lang.String r6 = r2.optString(r0, r6)
            java.lang.String r0 = "send_api_exception_sample"
            r31 = r6
            r6 = 1
            int r0 = r2.optInt(r0, r6)
            q = r0
            java.lang.String r0 = "send_ss_etag_sample"
            int r0 = r2.optInt(r0, r6)
            r = r0
            monitor-enter(r61)
            g = r7     // Catch:{ all -> 0x0685 }
            r1.ai = r9     // Catch:{ all -> 0x0685 }
            r1.G = r10     // Catch:{ all -> 0x0685 }
            r1.H = r11     // Catch:{ all -> 0x0685 }
            r1.I = r12     // Catch:{ all -> 0x0685 }
            r1.h = r13     // Catch:{ all -> 0x0685 }
            r1.L = r14     // Catch:{ all -> 0x0685 }
            r1.M = r15     // Catch:{ all -> 0x0685 }
            r1.N = r3     // Catch:{ all -> 0x0685 }
            r1.O = r8     // Catch:{ all -> 0x0685 }
            r1.P = r5     // Catch:{ all -> 0x0685 }
            r6 = r20
            r1.Q = r6     // Catch:{ all -> 0x0685 }
            r32 = r6
            r6 = r21
            r1.R = r6     // Catch:{ all -> 0x0685 }
            r33 = r6
            r6 = r22
            r1.S = r6     // Catch:{ all -> 0x0685 }
            r34 = r6
            r6 = r23
            r1.T = r6     // Catch:{ all -> 0x0685 }
            r35 = r6
            r6 = r24
            r1.U = r6     // Catch:{ all -> 0x0685 }
            r36 = r6
            r6 = r25
            r1.Z = r6     // Catch:{ all -> 0x0685 }
            r37 = r6
            r6 = r30
            r1.aa = r6     // Catch:{ all -> 0x0685 }
            r1.ab = r4     // Catch:{ all -> 0x0685 }
            r38 = r4
            r4 = r29
            r1.V = r4     // Catch:{ all -> 0x0685 }
            r0 = r26
            r1.W = r0     // Catch:{ all -> 0x0685 }
            r0 = r27
            r1.X = r0     // Catch:{ all -> 0x0685 }
            r0 = r28
            r1.Y = r0     // Catch:{ all -> 0x0685 }
            monitor-exit(r61)     // Catch:{ all -> 0x0685 }
            int r0 = r1.aa
            if (r0 <= 0) goto L_0x01cc
            r0 = 1
            goto L_0x01cd
        L_0x01cc:
            r0 = 0
        L_0x01cd:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.setDynamicAdjustThreadPoolSizeOpen(r0)
            int r0 = r1.Y
            if (r0 <= 0) goto L_0x01d6
            r0 = 1
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            com.bytedance.frameworks.baselib.network.http.e.a((boolean) r0)
            java.lang.String r0 = ""
            r39 = r0
            java.lang.String r0 = "https_dns"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x0207 }
            r40 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0209 }
            r4.<init>()     // Catch:{ Throwable -> 0x0209 }
            r41 = r6
            r6 = 0
            r1.a((java.util.Map<com.bytedance.ttnet.config.a.C0236a, com.bytedance.ttnet.config.a.C0236a>) r4, (org.json.JSONArray) r0, (boolean) r6)     // Catch:{ Throwable -> 0x020b }
            java.lang.String r6 = a((java.util.Map<com.bytedance.ttnet.config.a.C0236a, com.bytedance.ttnet.config.a.C0236a>) r4)     // Catch:{ Throwable -> 0x020b }
            monitor-enter(r61)     // Catch:{ Throwable -> 0x020d }
            r1.f22581f = r4     // Catch:{ all -> 0x0204 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0204 }
            r0.<init>()     // Catch:{ all -> 0x0204 }
            r0.putAll(r4)     // Catch:{ all -> 0x0204 }
            r1.C = r0     // Catch:{ all -> 0x0204 }
            monitor-exit(r61)     // Catch:{ all -> 0x0204 }
            goto L_0x020d
        L_0x0204:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x0204 }
            throw r0     // Catch:{ Throwable -> 0x020d }
        L_0x0207:
            r40 = r4
        L_0x0209:
            r41 = r6
        L_0x020b:
            r6 = r39
        L_0x020d:
            java.lang.String r0 = ""
            java.lang.String r4 = "url_replace_mapping"
            org.json.JSONArray r4 = r2.optJSONArray(r4)     // Catch:{ Throwable -> 0x023f }
            r42 = r0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x0241 }
            r0.<init>()     // Catch:{ Throwable -> 0x0241 }
            a((java.util.HashMap<java.lang.String, java.lang.String>) r0, (org.json.JSONArray) r4)     // Catch:{ Throwable -> 0x0241 }
            if (r4 == 0) goto L_0x022d
            int r18 = r0.size()     // Catch:{ Throwable -> 0x0241 }
            if (r18 <= 0) goto L_0x022d
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0241 }
            r42 = r4
        L_0x022d:
            monitor-enter(r61)     // Catch:{ Throwable -> 0x0241 }
            r1.D = r0     // Catch:{ all -> 0x023c }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x023c }
            r4.<init>()     // Catch:{ all -> 0x023c }
            r4.putAll(r0)     // Catch:{ all -> 0x023c }
            r1.E = r4     // Catch:{ all -> 0x023c }
            monitor-exit(r61)     // Catch:{ all -> 0x023c }
            goto L_0x0241
        L_0x023c:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x023c }
            throw r0     // Catch:{ Throwable -> 0x0241 }
        L_0x023f:
            r42 = r0
        L_0x0241:
            r0 = r42
            java.util.Set r4 = f(r31)
            r1.ac = r4
            java.lang.String r4 = "https_to_http"
            r43 = r5
            r5 = 1
            int r4 = r2.optInt(r4, r5)
            r44 = r8
            java.lang.String r8 = "http_to_https"
            int r8 = r2.optInt(r8, r5)
            r45 = r3
            java.lang.String r3 = "https_retry_http"
            int r3 = r2.optInt(r3, r5)
            r46 = r15
            java.lang.String r15 = "http_show_hijack"
            int r15 = r2.optInt(r15, r5)
            r47 = r14
            java.lang.String r14 = "http_verify_sign"
            int r14 = r2.optInt(r14, r5)
            monitor-enter(r61)
            aj = r4     // Catch:{ all -> 0x0682 }
            ak = r8     // Catch:{ all -> 0x0682 }
            al = r3     // Catch:{ all -> 0x0682 }
            am = r15     // Catch:{ all -> 0x0682 }
            an = r14     // Catch:{ all -> 0x0682 }
            monitor-exit(r61)     // Catch:{ all -> 0x0682 }
            java.lang.String r5 = "enable_req_ticket"
            r48 = r14
            r14 = 1
            int r5 = r2.optInt(r5, r14)
            if (r5 <= 0) goto L_0x028b
            r5 = 1
            goto L_0x028c
        L_0x028b:
            r5 = 0
        L_0x028c:
            com.bytedance.ttnet.utils.e.f22673b = r5
            java.lang.String r5 = "frontier_urls"
            java.lang.String r14 = ""
            java.lang.String r5 = r2.optString(r5, r14)
            java.lang.String r14 = "share_cookie_host_list"
            r49 = r5
            java.lang.String r5 = ""
            java.lang.String r5 = r2.optString(r14, r5)
            java.lang.String r14 = "disable_encrypt_switch"
            r50 = r15
            r15 = 0
            int r14 = r2.optInt(r14, r15)
            r1.aq = r14
            int r14 = r1.aq
            r15 = 2
            if (r14 != r15) goto L_0x02cd
            monitor-enter(r61)
            android.content.Context r14 = r1.f22580e     // Catch:{ all -> 0x02ca }
            java.lang.String r15 = "app_log_encrypt_switch_count"
            r51 = r3
            r3 = 0
            android.content.SharedPreferences r14 = com.ss.android.ugc.aweme.q.c.a(r14, r15, r3)     // Catch:{ all -> 0x02ca }
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ all -> 0x02ca }
            java.lang.String r15 = "app_log_encrypt_faild_count"
            r14.putInt(r15, r3)     // Catch:{ all -> 0x02ca }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r14)     // Catch:{ all -> 0x02ca }
            monitor-exit(r61)     // Catch:{ all -> 0x02ca }
            goto L_0x02cf
        L_0x02ca:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x02ca }
            throw r0
        L_0x02cd:
            r51 = r3
        L_0x02cf:
            java.lang.String r3 = "disable_framed_transport"
            r14 = 0
            int r3 = r2.optInt(r3, r14)
            if (r3 <= 0) goto L_0x02db
            com.bytedance.frameworks.baselib.network.http.c.a.b.a((int) r3)     // Catch:{ Throwable -> 0x02db }
        L_0x02db:
            java.lang.String r14 = "request_max_delay_time"
            r15 = 600000(0x927c0, float:8.40779E-40)
            int r14 = r2.optInt(r14, r15)
            java.lang.String r15 = "request_random_delay_apis"
            r52 = r3
            java.lang.String r3 = ""
            java.lang.String r3 = r2.optString(r15, r3)
            java.lang.String r15 = "request_delay_time_range"
            r53 = r8
            java.lang.String r8 = ""
            java.lang.String r8 = r2.optString(r15, r8)
            monitor-enter(r61)
            android.content.Context r15 = r1.f22580e     // Catch:{ all -> 0x067f }
            r54 = r2
            java.lang.String r2 = "ss_app_config"
            r55 = r4
            r4 = 0
            android.content.SharedPreferences r2 = com.ss.android.ugc.aweme.q.c.a(r15, r2, r4)     // Catch:{ all -> 0x067f }
            java.util.List<java.lang.String> r4 = r1.ah     // Catch:{ all -> 0x067f }
            r4.clear()     // Catch:{ all -> 0x067f }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ all -> 0x067f }
            if (r4 != 0) goto L_0x0329
            com.bytedance.ttnet.config.i r4 = com.bytedance.ttnet.config.i.a()     // Catch:{ all -> 0x067f }
            java.lang.String r15 = "share_cookie_host_list"
            r56 = r8
            java.lang.String r8 = ""
            java.lang.String r8 = r2.getString(r15, r8)     // Catch:{ all -> 0x067f }
            boolean r15 = r5.equals(r8)     // Catch:{ all -> 0x067f }
            if (r15 != 0) goto L_0x032b
            r4.a(r8, r5)     // Catch:{ all -> 0x067f }
            goto L_0x032b
        L_0x0329:
            r56 = r8
        L_0x032b:
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x067f }
            if (r19 == 0) goto L_0x0339
            java.lang.String r4 = "config_mapping"
            r8 = r17
            r2.putString(r4, r8)     // Catch:{ all -> 0x067f }
            goto L_0x033b
        L_0x0339:
            r8 = r17
        L_0x033b:
            java.lang.String r4 = "static_dns_mapping"
            r15 = r16
            r2.putString(r4, r15)     // Catch:{ all -> 0x067f }
            java.lang.String r4 = "https_dns"
            r2.putString(r4, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r4 = "url_replace_mapping"
            r2.putString(r4, r0)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "https_dns_err_max"
            r2.putInt(r0, r7)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "https_dns_err_policy"
            r2.putInt(r0, r9)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "hs_open"
            r2.putInt(r0, r10)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "ok_http_open"
            r2.putInt(r0, r11)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "ok_http3_open"
            r2.putInt(r0, r12)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "chromium_open"
            r2.putInt(r0, r13)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "http_dns_enabled"
            r4 = r47
            r2.putInt(r0, r4)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "detect_open"
            r6 = r46
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "detect_native_page"
            r6 = r45
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "collect_recent_page_info_enable"
            r6 = r44
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "i_host_select_open"
            r6 = r43
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            com.bytedance.ttnet.config.c r0 = r1.i     // Catch:{ all -> 0x067f }
            if (r0 == 0) goto L_0x0396
            com.bytedance.ttnet.config.c r0 = r1.i     // Catch:{ all -> 0x067f }
            r0.a((android.content.SharedPreferences.Editor) r2)     // Catch:{ all -> 0x067f }
        L_0x0396:
            java.lang.String r0 = "i_host_select_open_v2"
            r6 = r32
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "replace_url_open"
            r6 = r33
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "add_ss_queries_open"
            r6 = r34
            r2.putInt(r0, r6)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "add_ss_queries_header_open"
            r7 = r35
            r2.putInt(r0, r7)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r9 = r36
            r2.putInt(r0, r9)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "add_device_fingerprint_open"
            r10 = r37
            r2.putInt(r0, r10)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r10 = r41
            r2.putInt(r0, r10)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "ttnet_token_enabled"
            r10 = r38
            r2.putInt(r0, r10)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "ttnet_token_api"
            r11 = r31
            r2.putString(r0, r11)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "request_max_delay_time"
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "request_random_delay_apis"
            r2.putString(r0, r3)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "request_delay_time_range"
            r12 = r56
            r2.putString(r0, r12)     // Catch:{ all -> 0x067f }
            r1.ad = r14     // Catch:{ all -> 0x067f }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)     // Catch:{ all -> 0x067f }
            com.bytedance.ttnet.config.a$6 r15 = new com.bytedance.ttnet.config.a$6     // Catch:{ all -> 0x067f }
            r15.<init>(r0)     // Catch:{ all -> 0x067f }
            r1.ag = r15     // Catch:{ all -> 0x067f }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r12.split(r0)     // Catch:{ all -> 0x067f }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x067f }
            int r15 = r0.size()     // Catch:{ all -> 0x067f }
            r57 = r8
            r8 = 2
            if (r15 != r8) goto L_0x041a
            r8 = 0
            java.lang.Object r15 = r0.get(r8)     // Catch:{ all -> 0x067f }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x067f }
            r1.ae = r15     // Catch:{ all -> 0x067f }
            r8 = 1
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x067f }
            r1.af = r0     // Catch:{ all -> 0x067f }
        L_0x041a:
            java.lang.String r0 = "image_ttnet_enabled"
            r8 = r40
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "send_api_exception_sample"
            int r8 = q     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "send_ss_etag_sample"
            int r8 = r     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "shuffle_dns"
            int r8 = as     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "use_http_dns"
            int r8 = ao     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "use_http_dns_refetch_on_expire"
            int r8 = ap     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            r58 = r14
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "last_refresh_time"
            r2.putLong(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "https_to_http"
            r8 = r55
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "http_to_https"
            r8 = r53
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "https_retry_http"
            r8 = r51
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "http_show_hijack"
            r8 = r50
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "http_verify_sign"
            r8 = r48
            r2.putInt(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "frontier_urls"
            r8 = r49
            r2.putString(r0, r8)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "share_cookie_host_list"
            r2.putString(r0, r5)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)     // Catch:{ all -> 0x067f }
            int r14 = r0.length     // Catch:{ all -> 0x067f }
            r15 = 0
        L_0x0486:
            if (r15 >= r14) goto L_0x04a3
            r59 = r14
            r14 = r0[r15]     // Catch:{ all -> 0x067f }
            boolean r16 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ all -> 0x067f }
            if (r16 != 0) goto L_0x049a
            r60 = r0
            java.util.List<java.lang.String> r0 = r1.ah     // Catch:{ all -> 0x067f }
            r0.add(r14)     // Catch:{ all -> 0x067f }
            goto L_0x049c
        L_0x049a:
            r60 = r0
        L_0x049c:
            int r15 = r15 + 1
            r14 = r59
            r0 = r60
            goto L_0x0486
        L_0x04a3:
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ all -> 0x067f }
            java.lang.String r0 = r0.f()     // Catch:{ all -> 0x067f }
            boolean r14 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ all -> 0x067f }
            if (r14 != 0) goto L_0x04be
            java.util.List<java.lang.String> r14 = r1.ah     // Catch:{ all -> 0x067f }
            boolean r14 = com.bytedance.ttnet.utils.f.a(r0, r14)     // Catch:{ all -> 0x067f }
            if (r14 != 0) goto L_0x04be
            java.util.List<java.lang.String> r14 = r1.ah     // Catch:{ all -> 0x067f }
            r14.add(r0)     // Catch:{ all -> 0x067f }
        L_0x04be:
            java.lang.String r0 = "android_log_encrypt_switch"
            int r14 = r1.aq     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "image_ttnet_enabled"
            int r14 = r1.V     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "sample_band_width_enabled"
            int r14 = r1.W     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r14 = r1.X     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r14 = r1.Y     // Catch:{ all -> 0x067f }
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            java.lang.String r0 = "disable_framed_transport"
            r14 = r52
            r2.putInt(r0, r14)     // Catch:{ all -> 0x067f }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r2)     // Catch:{ all -> 0x067f }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0577 }
            r0.<init>()     // Catch:{ Throwable -> 0x0577 }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0577 }
            if (r2 != 0) goto L_0x0505
            java.lang.String r2 = r1.F     // Catch:{ Throwable -> 0x0577 }
            boolean r2 = r8.equals(r2)     // Catch:{ Throwable -> 0x0577 }
            if (r2 != 0) goto L_0x0505
            r1.F = r8     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "frontier_urls"
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x0577 }
        L_0x0505:
            java.lang.String r2 = "chromium_open"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "http_dns_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "add_ss_queries_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "add_ss_queries_header_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "add_ss_queries_plaintext_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "ttnet_token_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "ttnet_token_api"
            r0.put(r2, r11)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "ttnet_token_config_time"
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "request_max_delay_time"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r58)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "request_random_delay_apis"
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "request_delay_time_range"
            r0.put(r2, r12)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "share_cookie_host_list"
            r0.put(r2, r5)     // Catch:{ Throwable -> 0x0577 }
            java.lang.String r2 = "disable_framed_transport"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x0577 }
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x0577 }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x0577 }
            android.content.Context r3 = r1.f22580e     // Catch:{ Throwable -> 0x0577 }
            r2.a((android.content.Context) r3, (java.util.Map<java.lang.String, ?>) r0)     // Catch:{ Throwable -> 0x0577 }
        L_0x0577:
            monitor-exit(r61)     // Catch:{ all -> 0x067f }
            com.bytedance.ttnet.config.b r0 = com.bytedance.ttnet.config.b.a()
            if (r0 == 0) goto L_0x05e4
            com.bytedance.ttnet.config.b r0 = com.bytedance.ttnet.config.b.a()
            if (r54 == 0) goto L_0x05e4
            int r2 = r54.length()     // Catch:{ Throwable -> 0x05e4 }
            if (r2 > 0) goto L_0x058b
            goto L_0x05e4
        L_0x058b:
            java.lang.String r2 = "image_opt_switch"
            r3 = r54
            r4 = 0
            int r2 = r3.optInt(r2, r4)     // Catch:{ Throwable -> 0x05e2 }
            java.lang.String r5 = "image_opt_black_interval"
            r6 = 0
            long r5 = r3.optLong(r5, r6)     // Catch:{ Throwable -> 0x05e2 }
            java.lang.String r7 = "image_opt_failed_times"
            int r7 = r3.optInt(r7, r4)     // Catch:{ Throwable -> 0x05e2 }
            java.lang.String r8 = "image_opt_limit_count"
            int r8 = r3.optInt(r8, r4)     // Catch:{ Throwable -> 0x05e2 }
            android.content.SharedPreferences r4 = r0.b()     // Catch:{ Throwable -> 0x05e2 }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x05e2 }
            int r9 = r0.f22595a     // Catch:{ Throwable -> 0x05e2 }
            if (r2 == r9) goto L_0x05b9
            java.lang.String r9 = "image_opt_switch"
            r4.putInt(r9, r2)     // Catch:{ Throwable -> 0x05e2 }
        L_0x05b9:
            long r9 = r0.f22596b     // Catch:{ Throwable -> 0x05e2 }
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x05c4
            java.lang.String r9 = "image_opt_black_interval"
            r4.putLong(r9, r5)     // Catch:{ Throwable -> 0x05e2 }
        L_0x05c4:
            int r9 = r0.f22597c     // Catch:{ Throwable -> 0x05e2 }
            if (r7 == r9) goto L_0x05cd
            java.lang.String r9 = "image_opt_failed_times"
            r4.putInt(r9, r7)     // Catch:{ Throwable -> 0x05e2 }
        L_0x05cd:
            int r9 = r0.f22598d     // Catch:{ Throwable -> 0x05e2 }
            if (r8 == r9) goto L_0x05d6
            java.lang.String r9 = "image_opt_limit_count"
            r4.putInt(r9, r8)     // Catch:{ Throwable -> 0x05e2 }
        L_0x05d6:
            r4.apply()     // Catch:{ Throwable -> 0x05e2 }
            r0.f22595a = r2     // Catch:{ Throwable -> 0x05e2 }
            r0.f22596b = r5     // Catch:{ Throwable -> 0x05e2 }
            r0.f22597c = r7     // Catch:{ Throwable -> 0x05e2 }
            r0.f22598d = r8     // Catch:{ Throwable -> 0x05e2 }
            goto L_0x05e6
        L_0x05e2:
            goto L_0x05e6
        L_0x05e4:
            r3 = r54
        L_0x05e6:
            com.bytedance.ttnet.c.c r0 = com.bytedance.ttnet.c.c.a()
            com.bytedance.ttnet.c.b r0 = r0.f22571c
            if (r0 == 0) goto L_0x0675
            com.bytedance.ttnet.c.c r0 = com.bytedance.ttnet.c.c.a()
            com.bytedance.ttnet.c.b r0 = r0.f22571c
            boolean r2 = r0.f22567c
            if (r2 != 0) goto L_0x05fd
            com.bytedance.common.utility.Logger.debug()
            goto L_0x0675
        L_0x05fd:
            r2 = 4
            java.lang.String r4 = "tnc_config"
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch:{ Throwable -> 0x064f }
            com.bytedance.ttnet.c.a r4 = com.bytedance.ttnet.c.b.a(r3)     // Catch:{ Throwable -> 0x064f }
            boolean r5 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x064f }
            if (r5 == 0) goto L_0x062a
            java.lang.String r5 = "TNCConfigHandler"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x064f }
            java.lang.String r7 = "handleConfigChanged, newConfig: "
            r6.<init>(r7)     // Catch:{ Throwable -> 0x064f }
            if (r4 != 0) goto L_0x061c
            java.lang.String r7 = "null"
            goto L_0x0620
        L_0x061c:
            java.lang.String r7 = r4.toString()     // Catch:{ Throwable -> 0x064f }
        L_0x0620:
            r6.append(r7)     // Catch:{ Throwable -> 0x064f }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x064f }
            com.bytedance.common.utility.Logger.d(r5, r6)     // Catch:{ Throwable -> 0x064f }
        L_0x062a:
            if (r4 != 0) goto L_0x062d
            goto L_0x0675
        L_0x062d:
            r0.f22566b = r4     // Catch:{ Throwable -> 0x064f }
            android.content.Context r4 = r0.f22565a     // Catch:{ Throwable -> 0x064f }
            java.lang.String r5 = "ttnet_tnc_config"
            r6 = 0
            android.content.SharedPreferences r4 = com.ss.android.ugc.aweme.q.c.a(r4, r5, r6)     // Catch:{ Throwable -> 0x064f }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Throwable -> 0x064f }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x064f }
            java.lang.String r5 = "tnc_config_str"
            android.content.SharedPreferences$Editor r4 = r4.putString(r5, r3)     // Catch:{ Throwable -> 0x064f }
            r4.apply()     // Catch:{ Throwable -> 0x064f }
            android.content.Context r4 = r0.f22565a     // Catch:{ Throwable -> 0x064f }
            com.bytedance.ttnet.utils.d.a(r4, r2, r3)     // Catch:{ Throwable -> 0x064f }
            goto L_0x0675
        L_0x064f:
            com.bytedance.ttnet.c.a r3 = new com.bytedance.ttnet.c.a
            r3.<init>()
            r0.f22566b = r3
            android.content.Context r3 = r0.f22565a
            java.lang.String r4 = "ttnet_tnc_config"
            r5 = 0
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r3, r4, r5)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = "tnc_config_str"
            java.lang.String r5 = ""
            android.content.SharedPreferences$Editor r3 = r3.putString(r4, r5)
            r3.apply()
            android.content.Context r0 = r0.f22565a
            java.lang.String r3 = ""
            com.bytedance.ttnet.utils.d.a(r0, r2, r3)
        L_0x0675:
            android.content.Context r0 = r1.f22580e
            r2 = r57
            r3 = 2
            com.bytedance.ttnet.utils.d.a(r0, r3, r2)
            r2 = 1
            return r2
        L_0x067f:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x067f }
            throw r0
        L_0x0682:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x0682 }
            throw r0
        L_0x0685:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x0685 }
            throw r0
        L_0x0688:
            r0 = move-exception
            monitor-exit(r61)     // Catch:{ all -> 0x0688 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.a(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:3|4|5|6|7|(2:13|(1:15))|16|(3:18|(1:20)|21)|22|23|(1:25)(1:26)|27|28|29|(1:31)(2:32|(3:45|35|36))|34|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[Catch:{ Throwable -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c2 A[Catch:{ Throwable -> 0x00db }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            r12 = this;
            java.lang.String[] r0 = p()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r3
            r4 = 0
        L_0x0009:
            if (r4 >= r1) goto L_0x0101
            r6 = r0[r4]
            com.bytedance.ttnet.b.a r7 = new com.bytedance.ttnet.b.a     // Catch:{ Throwable -> 0x00dd }
            r7.<init>()     // Catch:{ Throwable -> 0x00dd }
            r5 = 1
            r7.h = r5     // Catch:{ Throwable -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00db }
            r5.<init>()     // Catch:{ Throwable -> 0x00db }
            java.lang.String r8 = "https://"
            r5.append(r8)     // Catch:{ Throwable -> 0x00db }
            r5.append(r6)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r6 = "/get_domains/v4/"
            r5.append(r6)     // Catch:{ Throwable -> 0x00db }
            com.bytedance.ttnet.c r6 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x00db }
            android.content.Context r8 = r12.f22580e     // Catch:{ Throwable -> 0x00db }
            android.location.Address r6 = r6.a(r8)     // Catch:{ Throwable -> 0x00db }
            com.bytedance.frameworks.baselib.network.http.util.j r8 = new com.bytedance.frameworks.baselib.network.http.util.j     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x00db }
            r8.<init>(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 == 0) goto L_0x006d
            boolean r5 = r6.hasLatitude()     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x006d
            boolean r5 = r6.hasLongitude()     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x006d
            java.lang.String r5 = "latitude"
            double r9 = r6.getLatitude()     // Catch:{ Throwable -> 0x00db }
            r8.a((java.lang.String) r5, (double) r9)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = "longitude"
            double r9 = r6.getLongitude()     // Catch:{ Throwable -> 0x00db }
            r8.a((java.lang.String) r5, (double) r9)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = r6.getLocality()     // Catch:{ Throwable -> 0x00db }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 != 0) goto L_0x006d
            java.lang.String r6 = "city"
            java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Throwable -> 0x00db }
            r8.a((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ Throwable -> 0x00db }
        L_0x006d:
            boolean r5 = r12.t     // Catch:{ Throwable -> 0x00db }
            if (r5 == 0) goto L_0x008c
            java.lang.String r5 = "force"
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6 = r8.f19879a     // Catch:{ Throwable -> 0x00db }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Throwable -> 0x00db }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Throwable -> 0x00db }
            if (r6 != 0) goto L_0x0082
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ Throwable -> 0x00db }
            r6.<init>()     // Catch:{ Throwable -> 0x00db }
        L_0x0082:
            java.lang.String r9 = "1"
            r6.add(r9)     // Catch:{ Throwable -> 0x00db }
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9 = r8.f19879a     // Catch:{ Throwable -> 0x00db }
            r9.put(r5, r6)     // Catch:{ Throwable -> 0x00db }
        L_0x008c:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x009e }
            r6 = 21
            if (r5 >= r6) goto L_0x0095
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x009e }
            goto L_0x0099
        L_0x0095:
            java.lang.String[] r5 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x009e }
            r5 = r5[r2]     // Catch:{ Throwable -> 0x009e }
        L_0x0099:
            java.lang.String r6 = "abi"
            r8.a((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ Throwable -> 0x009e }
        L_0x009e:
            java.lang.String r5 = r8.toString()     // Catch:{ Throwable -> 0x00db }
            r7.f22550b = r5     // Catch:{ Throwable -> 0x00db }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = com.bytedance.ttnet.b.c.a(r5, r3, r3, r7)     // Catch:{ Throwable -> 0x00db }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00db }
            r6 = 0
            long r10 = r10 - r8
            r7.f22551c = r10     // Catch:{ Throwable -> 0x00db }
            org.json.JSONObject r6 = r7.a()     // Catch:{ Throwable -> 0x00db }
            r13.put(r6)     // Catch:{ Throwable -> 0x00db }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00db }
            if (r6 == 0) goto L_0x00c2
            goto L_0x00d5
        L_0x00c2:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00db }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r5 = "message"
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Throwable -> 0x00db }
            java.lang.String r8 = "success"
            boolean r5 = r8.equals(r5)     // Catch:{ Throwable -> 0x00db }
            if (r5 != 0) goto L_0x00d6
        L_0x00d5:
            goto L_0x00fc
        L_0x00d6:
            boolean r5 = r12.a((java.lang.Object) r6)     // Catch:{ Throwable -> 0x00db }
            return r5
        L_0x00db:
            r5 = move-exception
            goto L_0x00e0
        L_0x00dd:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L_0x00e0:
            if (r7 == 0) goto L_0x00fc
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            java.io.PrintWriter r8 = new java.io.PrintWriter
            r8.<init>(r6)
            com.google.a.a.a.a.a.a.a((java.lang.Throwable) r5, (java.io.PrintWriter) r8)
            java.lang.String r5 = r6.toString()
            r7.f22552d = r5
            org.json.JSONObject r5 = r7.a()
            r13.put(r5)
        L_0x00fc:
            r5 = r7
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0101:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.a(org.json.JSONArray):boolean");
    }

    public final List<String> a(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.b.a aVar, URI uri) {
        String str;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        if (StringUtils.isEmpty(str) || !f.a(str, this.ah) || StringUtils.isEmpty(TTNetInit.getTTNetDepend().f())) {
            return null;
        }
        List arrayList = new ArrayList();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(TTNetInit.getTTNetDepend().f());
            if (!StringUtils.isEmpty(cookie)) {
                arrayList.add(cookie);
                return arrayList;
            }
        }
        if (Lists.isEmpty(arrayList) && aVar != null) {
            try {
                Map<String, List<String>> map = aVar.get(URI.create(uri.getScheme() + "://" + TTNetInit.getTTNetDepend().f()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList = map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList;
    }

    public final int f() {
        return com.bytedance.ttnet.retrofit.a.a(this.ad);
    }

    public final void h() {
        a(false);
    }

    public final boolean l() {
        if (this.ab > 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.P > 0) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (!at && this.L > 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (!au && this.S <= 0) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (!au && this.T > 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        return com.bytedance.ttnet.retrofit.a.a(this.ae, this.af);
    }

    private static String[] p() {
        String[] b2 = TTNetInit.getTTNetDepend().b();
        if (b2 == null || b2.length <= 0) {
            return new String[0];
        }
        return b2;
    }

    public final boolean d() {
        if (!au && this.U <= 0) {
            return false;
        }
        return true;
    }

    public static boolean k() {
        String str;
        try {
            if (Build.VERSION.SDK_INT < 21) {
                return true;
            }
            str = Build.SUPPORTED_ABIS[0];
            if ("x86".equalsIgnoreCase(str) || "x86_64".equalsIgnoreCase(str)) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            str = null;
        }
    }

    public final boolean g() {
        if (o || k() || this.J > 3) {
            return false;
        }
        if (Logger.debug() || p) {
            TTNetInit.getTTNetDepend();
            return true;
        } else if (this.h > 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void o() {
        try {
            if (ao > 0 && !b.a()) {
                if (this.A != null) {
                    for (Map.Entry next : this.A.entrySet()) {
                        if (next != null) {
                            i((String) next.getKey());
                        }
                    }
                }
                if (this.i != null) {
                    Map<String, c.a> map = this.i.f22603e;
                    if (map != null) {
                        for (Map.Entry next2 : map.entrySet()) {
                            if (next2 != null) {
                                i((String) next2.getKey());
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        com.bytedance.common.utility.Logger.debug();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0032 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0081 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ Exception -> 0x0086 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void i() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0088 }
            long r2 = r5.v     // Catch:{ all -> 0x0088 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0086
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0088 }
            r5.v = r0     // Catch:{ all -> 0x0088 }
            android.content.Context r0 = r5.f22580e     // Catch:{ Exception -> 0x0086 }
            r1 = 2
            java.lang.String r0 = com.bytedance.ttnet.utils.d.a(r0, r1)     // Catch:{ Exception -> 0x0086 }
            r5.h(r0)     // Catch:{ Exception -> 0x0086 }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Exception -> 0x0086 }
            android.content.Context r1 = r5.f22580e     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "disable_framed_transport"
            r3 = 0
            int r0 = r0.a((android.content.Context) r1, (java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x0086 }
            if (r0 <= 0) goto L_0x0032
            com.bytedance.frameworks.baselib.network.http.c.a.b.a((int) r0)     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            com.bytedance.ttnet.c.c r0 = com.bytedance.ttnet.c.c.a()     // Catch:{ Exception -> 0x0086 }
            com.bytedance.ttnet.c.b r0 = r0.f22571c     // Catch:{ Exception -> 0x0086 }
            if (r0 == 0) goto L_0x0084
            com.bytedance.ttnet.c.c r0 = com.bytedance.ttnet.c.c.a()     // Catch:{ Exception -> 0x0086 }
            com.bytedance.ttnet.c.b r0 = r0.f22571c     // Catch:{ Exception -> 0x0086 }
            android.content.Context r1 = r0.f22565a     // Catch:{ Throwable -> 0x0081 }
            r2 = 4
            java.lang.String r1 = com.bytedance.ttnet.utils.d.a(r1, r2)     // Catch:{ Throwable -> 0x0081 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0081 }
            if (r2 == 0) goto L_0x0051
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0086
        L_0x0051:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0081 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0081 }
            com.bytedance.ttnet.c.a r1 = com.bytedance.ttnet.c.b.a(r2)     // Catch:{ Throwable -> 0x0081 }
            boolean r2 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0081 }
            if (r2 == 0) goto L_0x007c
            java.lang.String r2 = "TNCConfigHandler"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r4 = "loadLocalConfigForOtherProcess, config: "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0081 }
            if (r1 != 0) goto L_0x006e
            java.lang.String r4 = "null"
            goto L_0x0072
        L_0x006e:
            java.lang.String r4 = r1.toString()     // Catch:{ Throwable -> 0x0081 }
        L_0x0072:
            r3.append(r4)     // Catch:{ Throwable -> 0x0081 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0081 }
            com.bytedance.common.utility.Logger.d(r2, r3)     // Catch:{ Throwable -> 0x0081 }
        L_0x007c:
            if (r1 == 0) goto L_0x0086
            r0.f22566b = r1     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0086
        L_0x0081:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0086 }
        L_0x0084:
            monitor-exit(r5)
            return
        L_0x0086:
            monitor-exit(r5)
            return
        L_0x0088:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.i():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        com.bytedance.common.utility.Logger.debug();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ab, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:112:0x02e5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x03ca */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x03d9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x029b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x02c0 */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03dd A[SYNTHETIC, Splitter:B:157:0x03dd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void j() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            boolean r0 = r1.x     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r20)
            return
        L_0x0009:
            r2 = 1
            r1.x = r2     // Catch:{ all -> 0x04ae }
            android.content.Context r0 = r1.f22580e     // Catch:{ all -> 0x04ae }
            java.lang.String r3 = "ss_app_config"
            r4 = 0
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r4)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "config_mapping"
            r5 = 0
            java.lang.String r0 = r3.getString(r0, r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = "last_refresh_time"
            r7 = 0
            long r9 = r3.getLong(r6, r7)     // Catch:{ all -> 0x04ae }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 <= 0) goto L_0x002d
            r9 = r11
        L_0x002d:
            r1.v = r9     // Catch:{ all -> 0x04ae }
            r1.h(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "static_dns_mapping"
            java.lang.String r6 = r3.getString(r0, r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "https_dns"
            java.lang.String r9 = r3.getString(r0, r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "url_replace_mapping"
            java.lang.String r10 = r3.getString(r0, r5)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "https_dns_err_max"
            r11 = 3
            int r0 = r3.getInt(r0, r11)     // Catch:{ all -> 0x04ae }
            g = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "https_dns_err_policy"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.ai = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "hs_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.G = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "ok_http_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.H = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "ok_http3_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.I = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "chromium_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.h = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "chromium_boot_failures"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.J = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "chromium_boot_failures_timestamp"
            long r12 = r3.getLong(r0, r7)     // Catch:{ all -> 0x04ae }
            r1.K = r12     // Catch:{ all -> 0x04ae }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04ae }
            long r14 = r1.K     // Catch:{ all -> 0x04ae }
            r0 = 0
            long r12 = r12 - r14
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x04ae }
            r14 = 1
            long r14 = r0.toMillis(r14)     // Catch:{ all -> 0x04ae }
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
            int r0 = r1.J     // Catch:{ all -> 0x04ae }
            if (r0 <= r11) goto L_0x009f
            r1.J = r11     // Catch:{ all -> 0x04ae }
        L_0x009f:
            java.lang.String r0 = "http_dns_enabled"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.L = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "detect_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.M = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "detect_native_page"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.N = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "collect_recent_page_info_enable"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.O = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "i_host_select_open"
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.P = r0     // Catch:{ all -> 0x04ae }
            boolean r0 = r20.n()     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x00d5
            android.content.Context r0 = r1.f22580e     // Catch:{ all -> 0x04ae }
            com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.a((android.content.Context) r0)     // Catch:{ all -> 0x04ae }
            r1.i = r0     // Catch:{ all -> 0x04ae }
        L_0x00d5:
            android.content.Context r0 = r1.f22580e     // Catch:{ all -> 0x04ae }
            com.bytedance.ttnet.config.c r0 = com.bytedance.ttnet.config.c.a((android.content.Context) r0)     // Catch:{ all -> 0x04ae }
            android.content.Context r11 = r1.f22580e     // Catch:{ all -> 0x04ae }
            r12 = 2
            r13 = -1
            if (r3 == 0) goto L_0x017a
            java.lang.String r14 = "i_host_select"
            java.lang.String r14 = r3.getString(r14, r5)     // Catch:{ Throwable -> 0x017a }
            java.lang.String r15 = "i_host_select_interval"
            r4 = 1800(0x708, float:2.522E-42)
            int r4 = r3.getInt(r15, r4)     // Catch:{ Throwable -> 0x017a }
            r0.f22599a = r4     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_select_interval_http_timeout"
            r15 = 60
            int r4 = r3.getInt(r4, r15)     // Catch:{ Throwable -> 0x017a }
            r0.f22600b = r4     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_max_fail"
            int r4 = r3.getInt(r4, r12)     // Catch:{ Throwable -> 0x017a }
            r0.f22601c = r4     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_last_select_time"
            long r7 = r3.getLong(r4, r7)     // Catch:{ Throwable -> 0x017a }
            r0.f22602d = r7     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_atomic_long"
            r7 = -1
            long r16 = r3.getLong(r4, r7)     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_last_bssid"
            java.lang.String r4 = r3.getString(r4, r5)     // Catch:{ Throwable -> 0x017a }
            r0.i = r4     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "i_host_last_net_type"
            int r4 = r3.getInt(r4, r13)     // Catch:{ Throwable -> 0x017a }
            r0.j = r4     // Catch:{ Throwable -> 0x017a }
            r18 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r4 < 0) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r7 = r16
        L_0x012f:
            java.util.concurrent.atomic.AtomicLong r4 = r0.h     // Catch:{ Throwable -> 0x017a }
            if (r4 == 0) goto L_0x0138
            java.util.concurrent.atomic.AtomicLong r4 = r0.h     // Catch:{ Throwable -> 0x017a }
            r4.getAndSet(r7)     // Catch:{ Throwable -> 0x017a }
        L_0x0138:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r14)     // Catch:{ Throwable -> 0x017a }
            if (r4 == 0) goto L_0x013f
            goto L_0x017a
        L_0x013f:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0147 }
            r4.<init>(r14)     // Catch:{ Throwable -> 0x0147 }
            r0.a((android.content.Context) r11, (org.json.JSONObject) r4)     // Catch:{ Throwable -> 0x0147 }
        L_0x0147:
            java.lang.String r4 = "i_host_select_netchannel_host"
            java.lang.String r7 = ""
            java.lang.String r4 = r3.getString(r4, r7)     // Catch:{ Throwable -> 0x017a }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x017a }
            if (r7 != 0) goto L_0x0168
            java.lang.Class<com.bytedance.ttnet.config.c> r7 = com.bytedance.ttnet.config.c.class
            monitor-enter(r7)     // Catch:{ Throwable -> 0x017a }
            java.util.Map<java.lang.String, com.bytedance.ttnet.config.c$a> r8 = r0.f22603e     // Catch:{ all -> 0x0165 }
            java.lang.Object r4 = r8.get(r4)     // Catch:{ all -> 0x0165 }
            com.bytedance.ttnet.config.c$a r4 = (com.bytedance.ttnet.config.c.a) r4     // Catch:{ all -> 0x0165 }
            r0.a((com.bytedance.ttnet.config.c.a) r4)     // Catch:{ all -> 0x0165 }
            monitor-exit(r7)     // Catch:{ all -> 0x0165 }
            goto L_0x0168
        L_0x0165:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0165 }
            throw r0     // Catch:{ Throwable -> 0x017a }
        L_0x0168:
            com.bytedance.ttnet.config.a r4 = a((android.content.Context) r11)     // Catch:{ Throwable -> 0x017a }
            boolean r4 = r4.n()     // Catch:{ Throwable -> 0x017a }
            if (r4 == 0) goto L_0x017a
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x017a }
            java.lang.String r4 = "onInit"
            r0.a((android.content.Context) r11, (java.lang.String) r4)     // Catch:{ Throwable -> 0x017a }
        L_0x017a:
            java.lang.String r0 = "i_host_select_open_v2"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.Q = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "replace_url_open"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.R = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "add_ss_queries_open"
            r4 = 0
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.S = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "add_ss_queries_header_open"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.T = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.U = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "add_device_fingerprint_open"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.Z = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.aa = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "ttnet_token_enabled"
            r4 = 0
            int r0 = r3.getInt(r0, r4)     // Catch:{ all -> 0x04ae }
            r1.ab = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "ttnet_token_api"
            java.lang.String r4 = "[]"
            java.lang.String r4 = r3.getString(r0, r4)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "request_max_delay_time"
            r7 = 600000(0x927c0, float:8.40779E-40)
            int r0 = r3.getInt(r0, r7)     // Catch:{ all -> 0x04ae }
            r1.ad = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "request_random_delay_apis"
            java.lang.String r7 = ""
            java.lang.String r7 = r3.getString(r0, r7)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r7.split(r0)     // Catch:{ all -> 0x04ae }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x04ae }
            r8.<init>()     // Catch:{ all -> 0x04ae }
            r1.ag = r8     // Catch:{ all -> 0x04ae }
            int r8 = r0.length     // Catch:{ all -> 0x04ae }
            r11 = 0
        L_0x01e6:
            if (r11 >= r8) goto L_0x01f2
            r14 = r0[r11]     // Catch:{ all -> 0x04ae }
            java.util.Set<java.lang.String> r15 = r1.ag     // Catch:{ all -> 0x04ae }
            r15.add(r14)     // Catch:{ all -> 0x04ae }
            int r11 = r11 + 1
            goto L_0x01e6
        L_0x01f2:
            java.lang.String r0 = "request_delay_time_range"
            java.lang.String r8 = ""
            java.lang.String r8 = r3.getString(r0, r8)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r8.split(r0)     // Catch:{ all -> 0x04ae }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x04ae }
            int r11 = r0.size()     // Catch:{ all -> 0x04ae }
            if (r11 != r12) goto L_0x021b
            r11 = 0
            java.lang.Object r12 = r0.get(r11)     // Catch:{ all -> 0x04ae }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x04ae }
            r1.ae = r12     // Catch:{ all -> 0x04ae }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04ae }
            r1.af = r0     // Catch:{ all -> 0x04ae }
        L_0x021b:
            int r0 = r1.aa     // Catch:{ all -> 0x04ae }
            if (r0 <= 0) goto L_0x0221
            r0 = 1
            goto L_0x0222
        L_0x0221:
            r0 = 0
        L_0x0222:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.setDynamicAdjustThreadPoolSizeOpen(r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "image_ttnet_enabled"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.V = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "sample_band_width_enabled"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.W = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.X = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r1.Y = r0     // Catch:{ all -> 0x04ae }
            int r0 = r1.Y     // Catch:{ all -> 0x04ae }
            if (r0 <= 0) goto L_0x024b
            r0 = 1
            goto L_0x024c
        L_0x024b:
            r0 = 0
        L_0x024c:
            com.bytedance.frameworks.baselib.network.http.e.a((boolean) r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "send_api_exception_sample"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            q = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "send_ss_etag_sample"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            r = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "shuffle_dns"
            int r0 = r3.getInt(r0, r13)     // Catch:{ all -> 0x04ae }
            as = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "use_dns_mapping"
            int r0 = r3.getInt(r0, r13)     // Catch:{ all -> 0x04ae }
            com.bytedance.frameworks.baselib.network.http.e.a((int) r0)     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "use_http_dns"
            int r0 = r3.getInt(r0, r13)     // Catch:{ all -> 0x04ae }
            ao = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "use_http_dns_refetch_on_expire"
            int r0 = r3.getInt(r0, r13)     // Catch:{ all -> 0x04ae }
            ap = r0     // Catch:{ all -> 0x04ae }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ all -> 0x04ae }
            if (r11 != 0) goto L_0x029b
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x029b }
            r11.<init>(r6)     // Catch:{ Exception -> 0x029b }
            b(r0, r11)     // Catch:{ Exception -> 0x029b }
            monitor-enter(r20)     // Catch:{ Exception -> 0x029b }
            r1.B = r0     // Catch:{ all -> 0x0298 }
            monitor-exit(r20)     // Catch:{ all -> 0x0298 }
            goto L_0x029b
        L_0x0298:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0298 }
            throw r0     // Catch:{ Exception -> 0x029b }
        L_0x029b:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r10)     // Catch:{ all -> 0x04ae }
            if (r6 != 0) goto L_0x02c0
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02c0 }
            r6.<init>(r10)     // Catch:{ Exception -> 0x02c0 }
            a((java.util.HashMap<java.lang.String, java.lang.String>) r0, (org.json.JSONArray) r6)     // Catch:{ Exception -> 0x02c0 }
            monitor-enter(r20)     // Catch:{ Exception -> 0x02c0 }
            r1.D = r0     // Catch:{ all -> 0x02bd }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x02bd }
            r6.<init>()     // Catch:{ all -> 0x02bd }
            r6.putAll(r0)     // Catch:{ all -> 0x02bd }
            r1.E = r6     // Catch:{ all -> 0x02bd }
            monitor-exit(r20)     // Catch:{ all -> 0x02bd }
            goto L_0x02c0
        L_0x02bd:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x02bd }
            throw r0     // Catch:{ Exception -> 0x02c0 }
        L_0x02c0:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ all -> 0x04ae }
            if (r6 != 0) goto L_0x02e5
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Exception -> 0x02e5 }
            r6.<init>(r9)     // Catch:{ Exception -> 0x02e5 }
            r1.a((java.util.Map<com.bytedance.ttnet.config.a.C0236a, com.bytedance.ttnet.config.a.C0236a>) r0, (org.json.JSONArray) r6, (boolean) r2)     // Catch:{ Exception -> 0x02e5 }
            monitor-enter(r20)     // Catch:{ Exception -> 0x02e5 }
            r1.f22581f = r0     // Catch:{ all -> 0x02e2 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x02e2 }
            r6.<init>()     // Catch:{ all -> 0x02e2 }
            r6.putAll(r0)     // Catch:{ all -> 0x02e2 }
            r1.C = r6     // Catch:{ all -> 0x02e2 }
            monitor-exit(r20)     // Catch:{ all -> 0x02e2 }
            goto L_0x02e5
        L_0x02e2:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x02e2 }
            throw r0     // Catch:{ Exception -> 0x02e5 }
        L_0x02e5:
            java.util.Set r0 = f(r4)     // Catch:{ all -> 0x04ae }
            r1.ac = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "https_to_http"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            aj = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "http_to_https"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            ak = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "https_retry_http"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            al = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "http_show_hijack"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            am = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "http_verify_sign"
            int r0 = r3.getInt(r0, r2)     // Catch:{ all -> 0x04ae }
            an = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "frontier_urls"
            java.lang.String r6 = ""
            java.lang.String r0 = r3.getString(r0, r6)     // Catch:{ all -> 0x04ae }
            r1.F = r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = "share_cookie_host_list"
            java.lang.String r6 = ""
            java.lang.String r0 = r3.getString(r0, r6)     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = ","
            java.lang.String[] r6 = r0.split(r6)     // Catch:{ all -> 0x04ae }
            int r9 = r6.length     // Catch:{ all -> 0x04ae }
            r10 = 0
        L_0x032d:
            if (r10 >= r9) goto L_0x0340
            r11 = r6[r10]     // Catch:{ all -> 0x04ae }
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r11)     // Catch:{ all -> 0x04ae }
            if (r11 != 0) goto L_0x033d
            java.util.List<java.lang.String> r9 = r1.ah     // Catch:{ all -> 0x04ae }
            r9.clear()     // Catch:{ all -> 0x04ae }
            goto L_0x0340
        L_0x033d:
            int r10 = r10 + 1
            goto L_0x032d
        L_0x0340:
            int r9 = r6.length     // Catch:{ all -> 0x04ae }
            r10 = 0
        L_0x0342:
            if (r10 >= r9) goto L_0x0354
            r11 = r6[r10]     // Catch:{ all -> 0x04ae }
            boolean r12 = com.bytedance.common.utility.StringUtils.isEmpty(r11)     // Catch:{ all -> 0x04ae }
            if (r12 != 0) goto L_0x0351
            java.util.List<java.lang.String> r12 = r1.ah     // Catch:{ all -> 0x04ae }
            r12.add(r11)     // Catch:{ all -> 0x04ae }
        L_0x0351:
            int r10 = r10 + 1
            goto L_0x0342
        L_0x0354:
            com.bytedance.ttnet.c r6 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ all -> 0x04ae }
            java.lang.String r6 = r6.f()     // Catch:{ all -> 0x04ae }
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ all -> 0x04ae }
            if (r9 != 0) goto L_0x036f
            java.util.List<java.lang.String> r9 = r1.ah     // Catch:{ all -> 0x04ae }
            boolean r9 = com.bytedance.ttnet.utils.f.a(r6, r9)     // Catch:{ all -> 0x04ae }
            if (r9 != 0) goto L_0x036f
            java.util.List<java.lang.String> r9 = r1.ah     // Catch:{ all -> 0x04ae }
            r9.add(r6)     // Catch:{ all -> 0x04ae }
        L_0x036f:
            com.bytedance.ttnet.c.c r6 = com.bytedance.ttnet.c.c.a()     // Catch:{ all -> 0x04ae }
            com.bytedance.ttnet.c.b r6 = r6.f22571c     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x03cd
            com.bytedance.ttnet.c.c r6 = com.bytedance.ttnet.c.c.a()     // Catch:{ all -> 0x04ae }
            com.bytedance.ttnet.c.b r6 = r6.f22571c     // Catch:{ all -> 0x04ae }
            boolean r9 = r6.f22567c     // Catch:{ all -> 0x04ae }
            if (r9 == 0) goto L_0x03cd
            android.content.Context r9 = r6.f22565a     // Catch:{ all -> 0x04ae }
            java.lang.String r10 = "ttnet_tnc_config"
            r11 = 0
            android.content.SharedPreferences r9 = com.ss.android.ugc.aweme.q.c.a(r9, r10, r11)     // Catch:{ all -> 0x04ae }
            java.lang.String r10 = "tnc_config_str"
            java.lang.String r5 = r9.getString(r10, r5)     // Catch:{ all -> 0x04ae }
            boolean r9 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x04ae }
            if (r9 == 0) goto L_0x039a
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x04ae }
            goto L_0x03cd
        L_0x039a:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Throwable -> 0x03ca }
            r9.<init>(r5)     // Catch:{ Throwable -> 0x03ca }
            com.bytedance.ttnet.c.a r5 = com.bytedance.ttnet.c.b.a(r9)     // Catch:{ Throwable -> 0x03ca }
            if (r5 == 0) goto L_0x03a7
            r6.f22566b = r5     // Catch:{ Throwable -> 0x03ca }
        L_0x03a7:
            boolean r6 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x03ca }
            if (r6 == 0) goto L_0x03cd
            java.lang.String r6 = "TNCConfigHandler"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03ca }
            java.lang.String r10 = "loadLocalConfig: "
            r9.<init>(r10)     // Catch:{ Throwable -> 0x03ca }
            if (r5 != 0) goto L_0x03bb
            java.lang.String r5 = "null"
            goto L_0x03bf
        L_0x03bb:
            java.lang.String r5 = r5.toString()     // Catch:{ Throwable -> 0x03ca }
        L_0x03bf:
            r9.append(r5)     // Catch:{ Throwable -> 0x03ca }
            java.lang.String r5 = r9.toString()     // Catch:{ Throwable -> 0x03ca }
            com.bytedance.common.utility.Logger.d(r6, r5)     // Catch:{ Throwable -> 0x03ca }
            goto L_0x03cd
        L_0x03ca:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x04ae }
        L_0x03cd:
            java.lang.String r5 = "disable_framed_transport"
            r6 = 0
            int r5 = r3.getInt(r5, r6)     // Catch:{ all -> 0x04ae }
            if (r5 <= 0) goto L_0x03d9
            com.bytedance.frameworks.baselib.network.http.c.a.b.a((int) r5)     // Catch:{ Throwable -> 0x03d9 }
        L_0x03d9:
            boolean r6 = r1.s     // Catch:{ all -> 0x04ae }
            if (r6 == 0) goto L_0x04ac
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x04ac }
            r6.<init>()     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = r1.F     // Catch:{ Throwable -> 0x04ac }
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x04ac }
            if (r9 != 0) goto L_0x03f1
            java.lang.String r9 = "frontier_urls"
            java.lang.String r10 = r1.F     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
        L_0x03f1:
            java.lang.String r9 = "chromium_open"
            int r10 = r1.h     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "chromium_boot_failures"
            int r10 = r1.J     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "http_dns_enabled"
            int r10 = r1.L     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "add_ss_queries_open"
            int r10 = r1.S     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "add_ss_queries_header_open"
            int r10 = r1.T     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "add_ss_queries_plaintext_open"
            int r10 = r1.U     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "ttnet_token_enabled"
            int r10 = r1.ab     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r9, r10)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = "ttnet_token_api"
            r6.put(r9, r4)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r4 = "ttnet_token_config_time"
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r4, r9)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r4 = "request_max_delay_time"
            int r9 = r1.ad     // Catch:{ Throwable -> 0x04ac }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r4, r9)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r4 = "request_random_delay_apis"
            r6.put(r4, r7)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r4 = "request_delay_time_range"
            r6.put(r4, r8)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r4 = "share_cookie_host_list"
            r6.put(r4, r0)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r0 = "disable_framed_transport"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x04ac }
            r6.put(r0, r4)     // Catch:{ Throwable -> 0x04ac }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.TTNetInit.getTTNetDepend()     // Catch:{ Throwable -> 0x04ac }
            android.content.Context r4 = r1.f22580e     // Catch:{ Throwable -> 0x04ac }
            r0.a((android.content.Context) r4, (java.util.Map<java.lang.String, ?>) r6)     // Catch:{ Throwable -> 0x04ac }
            boolean r0 = r20.g()     // Catch:{ Throwable -> 0x04ac }
            if (r0 == 0) goto L_0x04aa
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r3 = "chromium_boot_failures"
            int r4 = r1.J     // Catch:{ Throwable -> 0x04ac }
            int r4 = r4 + r2
            r0.putInt(r3, r4)     // Catch:{ Throwable -> 0x04ac }
            java.lang.String r2 = "chromium_boot_failures_timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x04ac }
            r0.putLong(r2, r3)     // Catch:{ Throwable -> 0x04ac }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r0)     // Catch:{ Throwable -> 0x04ac }
            java.util.concurrent.ScheduledExecutorService r0 = com.bytedance.common.utility.concurrent.TTExecutors.getScheduledThreadPool()     // Catch:{ Throwable -> 0x04ac }
            com.bytedance.ttnet.config.a$4 r2 = new com.bytedance.ttnet.config.a$4     // Catch:{ Throwable -> 0x04ac }
            r2.<init>()     // Catch:{ Throwable -> 0x04ac }
            r3 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ Throwable -> 0x04ac }
            r0.schedule(r2, r3, r5)     // Catch:{ Throwable -> 0x04ac }
        L_0x04aa:
            monitor-exit(r20)
            return
        L_0x04ac:
            monitor-exit(r20)
            return
        L_0x04ae:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.j():void");
    }

    public static void c(boolean z2) {
        p = true;
    }

    public final void a(com.bytedance.frameworks.baselib.network.a.d dVar) {
        Logger.debug();
    }

    public final boolean e(String str) {
        return com.bytedance.ttnet.retrofit.a.a(str, this.ag);
    }

    public final List<String> d(String str) {
        if (f.a(str, this.ah)) {
            return this.ah;
        }
        return null;
    }

    public final boolean b(final boolean z2) {
        if (!this.f22579d.compareAndSet(false, true)) {
            return false;
        }
        if (z2) {
            this.w = System.currentTimeMillis();
        }
        new ThreadPlus("AppConfigThread") {
            public final void run() {
                a aVar = a.this;
                boolean z = z2;
                Logger.debug();
                aVar.j();
                if (aVar.g()) {
                    aVar.f22579d.set(false);
                    return;
                }
                int i = 1;
                aVar.f22578c = true;
                int i2 = 102;
                if (!z) {
                    aVar.j.sendEmptyMessage(102);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (aVar.a(jSONArray)) {
                        i2 = BaseLoginOrRegisterActivity.o;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("https", jSONArray);
                    jSONObject.put("from", PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
                    jSONObject.put("available_state", i);
                } catch (JSONException unused) {
                    aVar.f22579d.set(false);
                }
                TTNetInit.getTTNetDepend();
                aVar.j.sendEmptyMessage(i2);
            }
        }.start();
        return true;
    }

    private static String a(Map<C0236a, C0236a> map) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (map.size() > 0) {
                for (C0236a next : map.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0236a.f22588a, next.f22590c);
                    jSONObject.put(C0236a.f22589b, next.f22592e);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    static Set<String> f(String str) {
        Set<String> set;
        if (StringUtils.isEmpty(str)) {
            return Collections.emptySet();
        }
        Set<String> emptySet = Collections.emptySet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                set = new LinkedHashSet<>();
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    try {
                        set.add(jSONArray.getString(i2));
                        i2++;
                    } catch (Throwable unused) {
                    }
                }
                return set;
            }
        } catch (Throwable unused2) {
        }
        set = emptySet;
        return set;
    }

    private void h(String str) {
        if (!StringUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap<String, String> hashMap = new HashMap<>();
                if (a(hashMap, jSONObject)) {
                    this.y = hashMap;
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.putAll(hashMap);
                    this.z = hashMap2;
                }
            } catch (Exception unused) {
            }
        }
    }

    public final boolean b(String str) {
        if (StringUtils.isEmpty(str) || this.X <= 0) {
            return false;
        }
        try {
            URI a2 = i.a(str);
            if (a2 == null || StringUtils.isEmpty(a2.getHost())) {
                return false;
            }
            TTNetInit.getTTNetDepend();
            throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean c(String str) {
        if (StringUtils.isEmpty(str) || this.W <= 0) {
            return false;
        }
        try {
            URI a2 = i.a(str);
            if (a2 == null) {
                return false;
            }
            String host = a2.getHost();
            if (!StringUtils.isEmpty(host) && host.endsWith(com.bytedance.ttnet.a.b())) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    private void d(boolean z2) {
        long j2;
        if (!this.f22578c) {
            if (this.u) {
                this.u = false;
                this.v = 0;
                this.w = 0;
            }
            if (z2) {
                j2 = 10800000;
            } else {
                j2 = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.v > j2 && currentTimeMillis - this.w > 120000) {
                boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(this.f22580e);
                if (!this.x || isNetworkAvailable) {
                    b(isNetworkAvailable);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.net.InetAddress> i(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            int r1 = ao     // Catch:{ Throwable -> 0x006e }
            if (r1 > 0) goto L_0x000e
            boolean r1 = com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x006e }
            if (r1 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r1 = r0
            goto L_0x003a
        L_0x000e:
            monitor-enter(r7)     // Catch:{ Throwable -> 0x006e }
            com.bytedance.common.httpdns.HttpDnsService r1 = r7.ar     // Catch:{ all -> 0x006b }
            if (r1 != 0) goto L_0x0037
            android.content.Context r1 = r7.f22580e     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "131950"
            r3 = 300(0x12c, double:1.48E-321)
            int r5 = ap     // Catch:{ all -> 0x006b }
            r6 = 1
            if (r5 <= 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            com.bytedance.common.httpdns.HttpDnsService r1 = com.bytedance.common.httpdns.HttpDns.getService(r1, r2, r3, r5)     // Catch:{ all -> 0x006b }
            r7.ar = r1     // Catch:{ all -> 0x006b }
            com.bytedance.common.httpdns.HttpDnsService r1 = r7.ar     // Catch:{ all -> 0x006b }
            r1.setExpiredIPEnabled(r6)     // Catch:{ all -> 0x006b }
            boolean r1 = com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x0037
            com.bytedance.common.httpdns.HttpDnsService r1 = r7.ar     // Catch:{ all -> 0x006b }
            r1.setLogEnabled(r6)     // Catch:{ all -> 0x006b }
        L_0x0037:
            com.bytedance.common.httpdns.HttpDnsService r1 = r7.ar     // Catch:{ all -> 0x006b }
            monitor-exit(r7)     // Catch:{ all -> 0x006b }
        L_0x003a:
            if (r1 != 0) goto L_0x003d
            return r0
        L_0x003d:
            java.lang.String r2 = com.bytedance.ttnet.a.b()     // Catch:{ Throwable -> 0x006e }
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x006e }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".pstatp.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x006e }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".bytecdn.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x006e }
            if (r2 == 0) goto L_0x006e
        L_0x0057:
            java.util.List r8 = r1.getAddrsByHostAsync(r8)     // Catch:{ Throwable -> 0x006e }
            if (r8 == 0) goto L_0x0067
            int r1 = r8.size()     // Catch:{ Throwable -> 0x006e }
            if (r1 <= 0) goto L_0x0067
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x006e }
            return r8
        L_0x0067:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x006e }
            goto L_0x006e
        L_0x006b:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x006b }
            throw r8     // Catch:{ Throwable -> 0x006e }
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.i(java.lang.String):java.util.List");
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case BaseLoginOrRegisterActivity.o /*101*/:
                this.f22578c = false;
                this.v = System.currentTimeMillis();
                Logger.debug();
                if (this.u) {
                    h();
                }
                try {
                    o();
                    if (ao <= 0 && this.ar != null) {
                        this.ar.clear();
                    }
                } catch (Throwable unused) {
                }
                this.f22579d.set(false);
                return;
            case 102:
                this.f22578c = false;
                if (this.u) {
                    h();
                }
                Logger.debug();
                this.f22579d.set(false);
                break;
        }
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (f22577b == null) {
                boolean a2 = g.a(context);
                f22577b = new a(context.getApplicationContext(), a2);
                if (a2) {
                    com.bytedance.frameworks.core.encrypt.a.a(f22577b);
                    com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((c.b) f22577b);
                    b.a(f22577b);
                    com.bytedance.frameworks.baselib.network.a.c b2 = com.bytedance.frameworks.baselib.network.a.c.b();
                    a aVar2 = f22577b;
                    if (aVar2 != null) {
                        b2.f19702b.add(aVar2);
                    }
                    com.bytedance.frameworks.baselib.network.a.d dVar = b2.f19701a.get();
                    e.f19853b = f22577b;
                    e.f19854c = f22577b;
                    com.bytedance.ttnet.encrypt.c.a((c.a) f22577b);
                    SsHttpCall.setThrottleControl(f22577b);
                    if (e.i() == null) {
                        e.a((e.h) f22577b);
                    }
                } else {
                    com.bytedance.frameworks.core.encrypt.a.a(new e());
                    f fVar = new f();
                    com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((c.b) fVar);
                    b.a(fVar);
                    com.bytedance.ttnet.encrypt.c.a((c.a) new h());
                    SsHttpCall.setThrottleControl(new g());
                    if (e.i() == null) {
                        e.a((e.h) new d());
                    }
                }
                e.i = f22577b;
                b.a(context);
            }
            aVar = f22577b;
        }
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|(2:6|(2:49|8)(1:9))|48|10|(1:15)(1:14)|16|17|(3:24|(1:26)(1:27)|(11:29|30|31|32|35|36|(1:38)|39|(1:43)|44|47))|33|35|36|(0)|39|41|43|44|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[Catch:{ Throwable -> 0x00d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.i.a(r10)     // Catch:{ Throwable -> 0x00d6 }
            r1 = 1
            java.net.URI r0 = r9.a((java.net.URI) r0, (boolean) r1)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00d6 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String[] r5 = p()     // Catch:{ Throwable -> 0x00d6 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00d6 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00d6 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00d6 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.A     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00d6 }
            r6 = 0
            if (r5 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.z     // Catch:{ Throwable -> 0x00d6 }
            if (r7 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.z     // Catch:{ Throwable -> 0x00d6 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x0049
        L_0x0048:
            r5 = r6
        L_0x0049:
            java.lang.String r7 = com.bytedance.ttnet.a.a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = com.bytedance.ttnet.a.a(r7)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x008f }
            if (r2 != 0) goto L_0x0067
            if (r5 == 0) goto L_0x008f
            java.lang.String r2 = com.bytedance.ttnet.a.a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = com.bytedance.ttnet.a.a(r2)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
        L_0x0067:
            com.bytedance.ttnet.config.c r2 = r9.i     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            com.bytedance.ttnet.config.c r2 = r9.i     // Catch:{ Throwable -> 0x008f }
            com.bytedance.ttnet.config.c$a r7 = r2.g     // Catch:{ Throwable -> 0x008f }
            if (r7 == 0) goto L_0x0082
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x008f }
            android.util.Pair r7 = new android.util.Pair     // Catch:{ Throwable -> 0x008f }
            com.bytedance.ttnet.config.c$a r8 = r2.g     // Catch:{ Throwable -> 0x008f }
            java.lang.String r8 = r8.j     // Catch:{ Throwable -> 0x008f }
            com.bytedance.ttnet.config.c$a r2 = r2.g     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = r2.f22609a     // Catch:{ Throwable -> 0x008f }
            r7.<init>(r8, r2)     // Catch:{ Throwable -> 0x008f }
            goto L_0x0083
        L_0x0082:
            r7 = r6
        L_0x0083:
            if (r7 == 0) goto L_0x008f
            java.lang.Object r2 = r7.first     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r7 = r7.second     // Catch:{ Throwable -> 0x0090 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x0090 }
            r5 = r7
            goto L_0x0090
        L_0x008f:
            r2 = r6
        L_0x0090:
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x00d6 }
            if (r7 != 0) goto L_0x009f
            com.bytedance.frameworks.baselib.network.http.util.c r7 = new com.bytedance.frameworks.baselib.network.http.util.c     // Catch:{ Throwable -> 0x00d6 }
            r7.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.i.a(r0, r7)     // Catch:{ Throwable -> 0x00d6 }
        L_0x009f:
            java.lang.String r0 = r9.a(r0, r6, r2, r1)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r1 = "?"
            boolean r1 = r0.contains(r1)     // Catch:{ Throwable -> 0x00d6 }
            if (r1 != 0) goto L_0x00cc
            java.lang.String r1 = "?"
            boolean r1 = r10.contains(r1)     // Catch:{ Throwable -> 0x00d6 }
            if (r1 == 0) goto L_0x00cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d6 }
            r1.<init>()     // Catch:{ Throwable -> 0x00d6 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r0 = "?"
            int r0 = r10.indexOf(r0)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r0 = r10.substring(r0)     // Catch:{ Throwable -> 0x00d6 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x00d6 }
        L_0x00cc:
            r10 = r0
            com.bytedance.ttnet.c.c r0 = com.bytedance.ttnet.c.c.a()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r0 = r0.a(r10)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x00d7
        L_0x00d6:
            r0 = r10
        L_0x00d7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.g(java.lang.String):java.lang.String");
    }

    private static void a(HashMap<String, String> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                    String optString = optJSONObject.optString("origin");
                    if (!StringUtils.isEmpty(optString)) {
                        String optString2 = optJSONObject.optString("target");
                        if (!StringUtils.isEmpty(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void b(HashMap<String, InetAddress[]> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        arrayList.clear();
                        JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                        String string = optJSONObject.getString("host");
                        if (!StringUtils.isEmpty(string)) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("ip");
                            int min = Math.min(optJSONArray.length(), 3);
                            for (int i3 = 0; i3 < min; i3++) {
                                String string2 = optJSONArray.getString(i3);
                                if (com.bytedance.frameworks.baselib.network.http.util.e.f19874a.matcher(string2).matches()) {
                                    InetAddress byAddress = InetAddress.getByAddress(string, InetAddress.getByName(string2).getAddress());
                                    if (byAddress != null) {
                                        arrayList.add(byAddress);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                InetAddress[] inetAddressArr = new InetAddress[arrayList.size()];
                                arrayList.toArray(inetAddressArr);
                                hashMap.put(string, inetAddressArr);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private a(Context context, boolean z2) {
        this.f22580e = context;
        this.A = TTNetInit.getTTNetDepend().e();
        String a2 = com.bytedance.ttnet.a.a(com.bytedance.ttnet.a.a());
        this.s = z2;
        if (this.s) {
            new ThreadPlus("AppConfig-WaitConfigTimesTask") {
                public final void run() {
                    SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(a.this.f22580e, "ss_app_config", 0);
                    a.this.m = a2.getInt("wait_config_times", 0);
                    a.this.h = a2.getInt("chromium_open", 0);
                    Logger.debug();
                    if (a.this.h <= 0) {
                        a.this.m = 0;
                    } else {
                        if (a.this.m >= 3) {
                            a.this.h = 0;
                            a.this.m = 0;
                        }
                        a.this.m++;
                    }
                    synchronized (a.this) {
                        SharedPreferences.Editor edit = a2.edit();
                        edit.putInt("chromium_open", a.this.h);
                        edit.putInt("wait_config_times", a.this.m);
                        SharedPrefsEditorCompat.apply(edit);
                    }
                }
            }.start();
            try {
                this.l = new com.bytedance.ttnet.hostmonitor.c(a2, 80);
                d dVar = new d(this.f22580e);
                dVar.f22643e = 1800000;
                com.bytedance.ttnet.hostmonitor.c cVar = this.l;
                if (cVar != null) {
                    if (!dVar.b().keySet().contains(cVar)) {
                        dVar.f22640b.put(cVar, new com.bytedance.ttnet.hostmonitor.g());
                    }
                }
                this.k = dVar;
                this.n.a(this.f22580e);
                d dVar2 = this.k;
                try {
                    com.bytedance.ttnet.hostmonitor.f.b("HostMonitor", "saving configuration");
                    SharedPreferences.Editor edit = dVar2.a().edit();
                    if (dVar2.f22640b != null && !dVar2.f22640b.isEmpty()) {
                        edit.putString("host_status", d.a(dVar2.f22640b).toString());
                    }
                    if (dVar2.f22641c != null && !dVar2.f22641c.isEmpty()) {
                        edit.putString("broadcastAction", dVar2.f22641c);
                    }
                    if (dVar2.f22642d > 0) {
                        edit.putInt("socketTimeout", dVar2.f22642d);
                    }
                    if (dVar2.f22643e >= 0) {
                        edit.putInt("checkInterval", dVar2.f22643e);
                    }
                    if (dVar2.f22644f > 0) {
                        edit.putInt("maxAttempts", dVar2.f22644f);
                    }
                    edit.apply();
                    boolean z3 = !dVar2.b().isEmpty();
                    f.a(dVar2.f22639a, ConnectivityReceiver.class, z3);
                    AlarmManager alarmManager = (AlarmManager) dVar2.f22639a.getSystemService("alarm");
                    Context context2 = dVar2.f22639a;
                    Intent intent = new Intent(context2, HostMonitor.class);
                    intent.setAction("com.bytedance.ttnet.hostmonitor.check");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent, 0);
                    com.bytedance.ttnet.hostmonitor.f.b("HostMonitor", "cancelling scheduled checks");
                    alarmManager.cancel(broadcast);
                    if (z3) {
                        if (dVar2.d() > 0) {
                            com.bytedance.ttnet.hostmonitor.f.b("HostMonitor", "scheduling periodic checks every " + (dVar2.d() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + " seconds");
                            alarmManager.setRepeating(1, ((long) dVar2.d()) + System.currentTimeMillis(), (long) dVar2.d(), broadcast);
                        }
                        com.bytedance.ttnet.hostmonitor.f.b("HostMonitor", "triggering reachability check");
                    }
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        }
    }

    private URI a(URI uri, boolean z2) {
        if (this.R <= 0 || uri == null) {
            return uri;
        }
        try {
            HashMap<String, String> hashMap = this.D;
            if (z2) {
                hashMap = this.E;
            }
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    String host = uri.getHost();
                    int port = uri.getPort();
                    String rawPath = uri.getRawPath();
                    if (host != null) {
                        sb.append(host);
                        if (port > 0) {
                            sb.append(':');
                            sb.append(port);
                        }
                    }
                    if (rawPath == null || !rawPath.startsWith("/")) {
                        sb.append('/');
                    }
                    if (rawPath != null) {
                        sb.append(rawPath);
                    }
                    String sb2 = sb.toString();
                    Logger.debug();
                    String str = hashMap.get(sb2);
                    if (StringUtils.isEmpty(str)) {
                        Iterator<Map.Entry<String, String>> it2 = hashMap.entrySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Map.Entry next = it2.next();
                            if (next != null) {
                                String str2 = (String) next.getKey();
                                String str3 = (String) next.getValue();
                                if (sb2.startsWith(str2)) {
                                    str = sb2.replaceFirst(str2, str3);
                                    break;
                                }
                            }
                        }
                    }
                    if (!StringUtils.isEmpty(str)) {
                        StringBuilder sb3 = new StringBuilder();
                        if (uri.getScheme() != null) {
                            sb3.append(uri.getScheme());
                            sb3.append("://");
                        }
                        sb3.append(str);
                        URI uri2 = new URI(sb3.toString());
                        URI a2 = i.a(uri2.getScheme(), uri2.getHost(), uri2.getPort(), uri2.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
                        Logger.debug();
                        return a2;
                    }
                    return uri;
                }
            }
            return uri;
        } catch (Throwable unused) {
        }
    }

    private void a(Map<C0236a, C0236a> map, JSONArray jSONArray, boolean z2) {
        if (jSONArray != null) {
            try {
                Logger.debug();
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        C0236a aVar = new C0236a();
                        if (z2) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            aVar.a(optJSONObject.optString(C0236a.f22588a));
                            int optInt = optJSONObject.optInt(C0236a.f22589b);
                            if (this.ai > 0) {
                                Logger.debug();
                                aVar.f22592e = optInt;
                            } else {
                                Logger.debug();
                                aVar.f22592e = 0;
                            }
                        } else {
                            aVar.a(jSONArray.optString(i2));
                            aVar.f22592e = 0;
                        }
                        map.put(aVar, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (this) {
                    if (this.f22581f != null && this.f22581f.size() > 0) {
                        for (C0236a next : this.f22581f.keySet()) {
                            if (map.containsKey(next)) {
                                map.remove(next);
                                map.put(next, next);
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b8 A[Catch:{ Throwable -> 0x00fd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.net.URI r6, com.bytedance.frameworks.baselib.network.http.b r7, java.lang.String r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof com.bytedance.ttnet.b.d
            if (r1 == 0) goto L_0x000b
            r0 = r7
            com.bytedance.ttnet.b.d r0 = (com.bytedance.ttnet.b.d) r0
        L_0x000b:
            if (r0 == 0) goto L_0x0016
            boolean r7 = r0.o
            if (r7 == 0) goto L_0x0016
            java.lang.String r6 = r6.toString()
            return r6
        L_0x0016:
            boolean r7 = f22576a
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x0022
            int r7 = r5.G
            if (r7 <= 0) goto L_0x0022
            r7 = 1
            goto L_0x0023
        L_0x0022:
            r7 = 0
        L_0x0023:
            if (r7 != 0) goto L_0x002a
            java.lang.String r6 = r6.toString()
            return r6
        L_0x002a:
            java.lang.String r7 = r6.toString()
            android.content.Context r3 = r5.f22580e     // Catch:{ Throwable -> 0x00fd }
            boolean r3 = com.bytedance.common.utility.NetworkUtils.is2G(r3)     // Catch:{ Throwable -> 0x00fd }
            if (r3 == 0) goto L_0x0037
            return r7
        L_0x0037:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00fd }
            int r3 = r5.Q     // Catch:{ Throwable -> 0x00fd }
            if (r3 <= 0) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x006f
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00fd }
            if (r3 != 0) goto L_0x006f
            com.bytedance.frameworks.baselib.network.http.util.c r9 = new com.bytedance.frameworks.baselib.network.http.util.c     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r2 = r6.getHost()     // Catch:{ Throwable -> 0x00fd }
            int r3 = r6.getPort()     // Catch:{ Throwable -> 0x00fd }
            r9.<init>(r2, r3, r8)     // Catch:{ Throwable -> 0x00fd }
            java.net.URI r6 = com.bytedance.frameworks.baselib.network.http.util.i.a(r6, r9)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00fd }
            if (r0 == 0) goto L_0x006a
            java.lang.String r7 = "https"
            boolean r7 = r8.equals(r7)     // Catch:{ Throwable -> 0x00fe }
            if (r7 == 0) goto L_0x006a
            r0.p = r1     // Catch:{ Throwable -> 0x00fe }
        L_0x006a:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00fe }
            goto L_0x00fe
        L_0x006f:
            com.bytedance.ttnet.config.a$a[] r6 = new com.bytedance.ttnet.config.a.C0236a[r1]     // Catch:{ Throwable -> 0x00fd }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00fd }
            if (r3 != 0) goto L_0x00b5
            java.util.Map<com.bytedance.ttnet.config.a$a, com.bytedance.ttnet.config.a$a> r3 = r5.f22581f     // Catch:{ Throwable -> 0x00fd }
            if (r9 == 0) goto L_0x007d
            java.util.HashMap<com.bytedance.ttnet.config.a$a, com.bytedance.ttnet.config.a$a> r3 = r5.C     // Catch:{ Throwable -> 0x00fd }
        L_0x007d:
            if (r3 == 0) goto L_0x00b5
            int r9 = r3.size()     // Catch:{ Throwable -> 0x00fd }
            if (r9 <= 0) goto L_0x00b5
            java.util.Set r9 = r3.keySet()     // Catch:{ Throwable -> 0x00fd }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x00fd }
        L_0x008d:
            boolean r3 = r9.hasNext()     // Catch:{ Throwable -> 0x00fd }
            if (r3 == 0) goto L_0x00b5
            java.lang.Object r3 = r9.next()     // Catch:{ Throwable -> 0x00fd }
            com.bytedance.ttnet.config.a$a r3 = (com.bytedance.ttnet.config.a.C0236a) r3     // Catch:{ Throwable -> 0x00fd }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00fd }
            if (r4 != 0) goto L_0x00ae
            java.util.regex.Matcher r4 = r3.f22591d     // Catch:{ Throwable -> 0x00fd }
            if (r4 == 0) goto L_0x00ae
            java.util.regex.Matcher r4 = r3.f22591d     // Catch:{ Throwable -> 0x00fd }
            java.util.regex.Matcher r4 = r4.reset(r7)     // Catch:{ Throwable -> 0x00fd }
            boolean r4 = r4.matches()     // Catch:{ Throwable -> 0x00fd }
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            if (r4 == 0) goto L_0x008d
            r6[r2] = r3     // Catch:{ Throwable -> 0x00fd }
            r9 = 1
            goto L_0x00b6
        L_0x00b5:
            r9 = 0
        L_0x00b6:
            if (r9 == 0) goto L_0x00fd
            r6 = r6[r2]     // Catch:{ Throwable -> 0x00fd }
            if (r6 == 0) goto L_0x00cb
            int r9 = r6.f22592e     // Catch:{ Throwable -> 0x00fd }
            int r3 = g     // Catch:{ Throwable -> 0x00fd }
            if (r9 > r3) goto L_0x00c4
            r9 = 1
            goto L_0x00c5
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00fd }
            if (r9 == 0) goto L_0x00cb
            r2 = 1
        L_0x00cb:
            if (r0 == 0) goto L_0x00d5
            if (r6 != 0) goto L_0x00d1
            r6 = -1
            goto L_0x00d3
        L_0x00d1:
            int r6 = r6.f22592e     // Catch:{ Throwable -> 0x00fd }
        L_0x00d3:
            r0.q = r6     // Catch:{ Throwable -> 0x00fd }
        L_0x00d5:
            java.lang.String r6 = "http"
            boolean r6 = r7.startsWith(r6)     // Catch:{ Throwable -> 0x00fd }
            if (r6 == 0) goto L_0x00fd
            if (r2 == 0) goto L_0x00fa
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x00fd }
            if (r6 != 0) goto L_0x00ed
            java.lang.String r6 = "http"
            boolean r6 = r6.equals(r8)     // Catch:{ Throwable -> 0x00fd }
            if (r6 != 0) goto L_0x00fa
        L_0x00ed:
            java.lang.String r6 = "http"
            java.lang.String r8 = "https"
            java.lang.String r6 = r7.replaceFirst(r6, r8)     // Catch:{ Throwable -> 0x00fd }
            if (r0 == 0) goto L_0x00f9
            r0.p = r1     // Catch:{ Throwable -> 0x00fe }
        L_0x00f9:
            r7 = r6
        L_0x00fa:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00fd }
        L_0x00fd:
            r6 = r7
        L_0x00fe:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.config.a.a(java.net.URI, com.bytedance.frameworks.baselib.network.http.b, java.lang.String, boolean):java.lang.String");
    }
}
