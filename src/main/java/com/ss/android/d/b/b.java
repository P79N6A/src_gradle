package com.ss.android.d.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.d.a.c;
import com.ss.android.d.d;
import com.ss.android.d.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.d.a.b f28379a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f28380b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static c f28381c;

    /* renamed from: e  reason: collision with root package name */
    public static final Bundle f28382e = new Bundle();

    /* renamed from: f  reason: collision with root package name */
    public static volatile boolean f28383f = false;
    public static volatile boolean g = false;
    public static long m = 0;
    public static volatile boolean r = false;
    static List<WeakReference<d.a>> v = Collections.synchronizedList(new ArrayList());
    public static final ThreadLocal<Boolean> w = new ThreadLocal<>();
    public static boolean x = false;

    /* renamed from: d  reason: collision with root package name */
    public final Object f28384d = new Object();
    public int h;
    public final com.ss.android.d.b.a.a i;
    public final Context j;
    public final SharedPreferences k;
    public JSONObject l;
    public long n = 0;
    public long o = 0;
    public long p = 0;
    public String q;
    public String s;
    public a t;
    public final d.b u;

    public class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        int f28385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(5:40|(3:42|43|(1:45)(2:47|48))|50|51|(1:66)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00dc */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00e0 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r14 = this;
                super.run()
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                org.json.JSONObject r0 = r0.l
                java.lang.String r1 = "device_id"
                r2 = 0
                java.lang.String r0 = r0.optString(r1, r2)
                boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
                r1 = 1
                r0 = r0 ^ r1
                java.util.List<java.lang.ref.WeakReference<com.ss.android.d.d$a>> r2 = com.ss.android.d.b.b.v
                int r2 = r2.size()
                r3 = 0
                r4 = 0
            L_0x001c:
                if (r4 >= r2) goto L_0x0036
                java.util.List<java.lang.ref.WeakReference<com.ss.android.d.d$a>> r5 = com.ss.android.d.b.b.v
                java.lang.Object r5 = r5.get(r4)
                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                if (r5 == 0) goto L_0x0033
                java.lang.Object r5 = r5.get()
                com.ss.android.d.d$a r5 = (com.ss.android.d.d.a) r5
                if (r5 == 0) goto L_0x0033
                r5.a(r0)     // Catch:{ Exception -> 0x0033 }
            L_0x0033:
                int r4 = r4 + 1
                goto L_0x001c
            L_0x0036:
                boolean r0 = com.ss.android.d.b.b.r
                if (r0 != 0) goto L_0x00ea
                long r4 = java.lang.System.currentTimeMillis()
                r6 = 21600000(0x1499700, double:1.0671818E-316)
                r8 = 30000(0x7530, double:1.4822E-319)
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                int r0 = r0.h
                int r2 = com.ss.android.d.a.d.b()
                if (r0 != r2) goto L_0x004f
                r0 = 1
                goto L_0x0050
            L_0x004f:
                r0 = 0
            L_0x0050:
                boolean r2 = com.ss.android.d.b.a.f28355d
                r10 = 0
                if (r2 != 0) goto L_0x0061
                long r12 = com.ss.android.d.b.b.m
                int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
                if (r2 >= 0) goto L_0x0061
                if (r0 == 0) goto L_0x0061
                r6 = 43200000(0x2932e00, double:2.1343636E-316)
            L_0x0061:
                if (r0 == 0) goto L_0x0066
                r8 = 180000(0x2bf20, double:8.8932E-319)
            L_0x0066:
                int r0 = r14.f28385a
                r2 = 2
                if (r0 >= r2) goto L_0x0083
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                java.lang.String r0 = r0.a()
                boolean r0 = com.ss.android.common.applog.NetUtil.isBadId(r0)
                if (r0 != 0) goto L_0x0081
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                java.lang.String r0 = r0.q
                boolean r0 = com.ss.android.common.applog.NetUtil.isBadId(r0)
                if (r0 == 0) goto L_0x0083
            L_0x0081:
                r0 = 1
                goto L_0x0084
            L_0x0083:
                r0 = 0
            L_0x0084:
                int r2 = r14.f28385a
                int r2 = r2 + r1
                r14.f28385a = r2
                if (r0 == 0) goto L_0x008d
                r8 = 15000(0x3a98, double:7.411E-320)
            L_0x008d:
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                long r12 = r0.n
                long r12 = r4 - r12
                long r6 = r6 - r12
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                long r12 = r0.o
                long r4 = r4 - r12
                long r8 = r8 - r4
                long r4 = java.lang.Math.max(r6, r8)
                int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r0 > 0) goto L_0x00a3
                goto L_0x00c0
            L_0x00a3:
                double r6 = (double) r4
                r8 = 4599075939470750515(0x3fd3333333333333, double:0.3)
                java.lang.Double.isNaN(r6)
                double r6 = r6 * r8
                long r6 = (long) r6
                double r8 = java.lang.Math.random()
                r12 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r8 = r8 * r12
                double r12 = (double) r6
                java.lang.Double.isNaN(r12)
                double r8 = r8 * r12
                long r8 = (long) r8
                long r8 = r8 - r6
                long r4 = r4 + r8
            L_0x00c0:
                com.bytedance.common.utility.Logger.debug()
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this
                java.lang.Object r0 = r0.f28384d
                monitor-enter(r0)
                int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r2 <= 0) goto L_0x00dc
                boolean r2 = com.ss.android.d.b.b.r     // Catch:{ InterruptedException -> 0x00dc }
                if (r2 == 0) goto L_0x00d2
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                goto L_0x00ea
            L_0x00d2:
                com.ss.android.d.b.b r2 = com.ss.android.d.b.b.this     // Catch:{ InterruptedException -> 0x00dc }
                java.lang.Object r2 = r2.f28384d     // Catch:{ InterruptedException -> 0x00dc }
                r2.wait(r4)     // Catch:{ InterruptedException -> 0x00dc }
                goto L_0x00dc
            L_0x00da:
                r1 = move-exception
                goto L_0x00e8
            L_0x00dc:
                boolean r2 = com.ss.android.d.b.b.r     // Catch:{ all -> 0x00da }
                if (r2 == 0) goto L_0x00e2
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                goto L_0x00ea
            L_0x00e2:
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                r14.a()
                goto L_0x0036
            L_0x00e8:
                monitor-exit(r0)     // Catch:{ all -> 0x00da }
                throw r1
            L_0x00ea:
                com.bytedance.common.utility.Logger.debug()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.b.b.a.run():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:55|56|57|58|59|60|61) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0121 */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x012b A[Catch:{ Exception -> 0x013e }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r6 = this;
                boolean r0 = com.ss.android.d.b.b.g
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013e }
                r0.o = r1     // Catch:{ Exception -> 0x013e }
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                android.content.Context r0 = r0.j     // Catch:{ Exception -> 0x013e }
                boolean r0 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r0)     // Catch:{ Exception -> 0x013e }
                if (r0 != 0) goto L_0x0018
                return
            L_0x0018:
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                android.content.Context r0 = r0.j     // Catch:{ Exception -> 0x013e }
                java.lang.String r0 = com.ss.android.d.a.d.b(r0)     // Catch:{ Exception -> 0x013e }
                boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x013e }
                if (r1 != 0) goto L_0x002f
                com.ss.android.d.b.b r1 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                org.json.JSONObject r1 = r1.l     // Catch:{ Exception -> 0x013e }
                java.lang.String r2 = "user_agent"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x013e }
            L_0x002f:
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                java.lang.String r0 = r0.s     // Catch:{ Exception -> 0x013e }
                boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x013e }
                if (r0 != 0) goto L_0x0046
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                org.json.JSONObject r0 = r0.l     // Catch:{ Exception -> 0x013e }
                java.lang.String r1 = "app_track"
                com.ss.android.d.b.b r2 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                java.lang.String r2 = r2.s     // Catch:{ Exception -> 0x013e }
                r0.put(r1, r2)     // Catch:{ Exception -> 0x013e }
            L_0x0046:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x013e }
                org.json.JSONTokener r1 = new org.json.JSONTokener     // Catch:{ Exception -> 0x013e }
                com.ss.android.d.b.b r2 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                org.json.JSONObject r2 = r2.l     // Catch:{ Exception -> 0x013e }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x013e }
                r1.<init>(r2)     // Catch:{ Exception -> 0x013e }
                r0.<init>(r1)     // Catch:{ Exception -> 0x013e }
                boolean r1 = com.ss.android.d.b.a.a()     // Catch:{ Exception -> 0x013e }
                if (r1 == 0) goto L_0x006b
                boolean r1 = com.ss.android.d.a.d.e()     // Catch:{ Exception -> 0x013e }
                if (r1 == 0) goto L_0x006b
                com.ss.android.d.b.b r1 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                android.content.Context r1 = r1.j     // Catch:{ Exception -> 0x013e }
                com.ss.android.d.a.a(r0, r1)     // Catch:{ Exception -> 0x013e }
            L_0x006b:
                android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Throwable -> 0x00e7 }
                r1.<init>()     // Catch:{ Throwable -> 0x00e7 }
                android.os.Bundle r2 = com.ss.android.d.b.b.f28382e     // Catch:{ Throwable -> 0x00e7 }
                monitor-enter(r2)     // Catch:{ Throwable -> 0x00e7 }
                android.os.Bundle r3 = com.ss.android.d.b.b.f28382e     // Catch:{ all -> 0x00e4 }
                r1.putAll(r3)     // Catch:{ all -> 0x00e4 }
                monitor-exit(r2)     // Catch:{ all -> 0x00e4 }
                int r2 = r1.size()     // Catch:{ Throwable -> 0x00e7 }
                if (r2 <= 0) goto L_0x00a5
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00e7 }
                r2.<init>()     // Catch:{ Throwable -> 0x00e7 }
                java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x00e7 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x00e7 }
            L_0x008c:
                boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x00e7 }
                if (r4 == 0) goto L_0x00a0
                java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x00e7 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x00e7 }
                java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x00e7 }
                r2.put(r4, r5)     // Catch:{ Throwable -> 0x00e7 }
                goto L_0x008c
            L_0x00a0:
                java.lang.String r1 = "custom"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00e7 }
            L_0x00a5:
                r1 = 0
                boolean r2 = com.ss.android.d.d.d()     // Catch:{ Throwable -> 0x00e7 }
                if (r2 == 0) goto L_0x00b0
                java.lang.String r1 = com.ss.android.d.c.c.g()     // Catch:{ Throwable -> 0x00e7 }
            L_0x00b0:
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00e7 }
                if (r2 == 0) goto L_0x00ba
                java.lang.String r1 = com.ss.android.a.a()     // Catch:{ Throwable -> 0x00e7 }
            L_0x00ba:
                java.lang.String r2 = com.ss.android.a.b()     // Catch:{ Throwable -> 0x00e7 }
                java.lang.String r3 = com.ss.android.a.c()     // Catch:{ Throwable -> 0x00e7 }
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00e7 }
                if (r4 != 0) goto L_0x00cd
                java.lang.String r4 = "google_aid"
                r0.put(r4, r1)     // Catch:{ Throwable -> 0x00e7 }
            L_0x00cd:
                boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Throwable -> 0x00e7 }
                if (r1 != 0) goto L_0x00d8
                java.lang.String r1 = "app_language"
                r0.put(r1, r2)     // Catch:{ Throwable -> 0x00e7 }
            L_0x00d8:
                boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x00e7 }
                if (r1 != 0) goto L_0x00e7
                java.lang.String r1 = "app_region"
                r0.put(r1, r3)     // Catch:{ Throwable -> 0x00e7 }
                goto L_0x00e7
            L_0x00e4:
                r1 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00e4 }
                throw r1     // Catch:{ Throwable -> 0x00e7 }
            L_0x00e7:
                com.ss.android.d.a.d.a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x013e }
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x013e }
                r1.<init>()     // Catch:{ Exception -> 0x013e }
                java.lang.String r2 = "magic_tag"
                java.lang.String r3 = "ss_app_log"
                r1.put(r2, r3)     // Catch:{ Exception -> 0x013e }
                java.lang.String r2 = "header"
                r1.put(r2, r0)     // Catch:{ Exception -> 0x013e }
                java.lang.String r0 = "_gen_time"
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x013e }
                r1.put(r0, r2)     // Catch:{ Exception -> 0x013e }
                r0 = 1
                com.ss.android.d.b.b.g = r0     // Catch:{ Exception -> 0x013e }
                java.lang.ThreadLocal<java.lang.Boolean> r2 = com.ss.android.d.b.b.w     // Catch:{ Exception -> 0x013e }
                java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x013e }
                r2.set(r3)     // Catch:{ Exception -> 0x013e }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x013e }
                boolean r1 = r6.a(r1)     // Catch:{ Exception -> 0x013e }
                java.lang.Object r2 = com.ss.android.d.b.b.f28380b     // Catch:{ Exception -> 0x013e }
                monitor-enter(r2)     // Catch:{ Exception -> 0x013e }
                r3 = 0
                com.ss.android.d.b.b.g = r3     // Catch:{ all -> 0x013b }
                java.lang.Object r4 = com.ss.android.d.b.b.f28380b     // Catch:{ Exception -> 0x0121 }
                r4.notifyAll()     // Catch:{ Exception -> 0x0121 }
            L_0x0121:
                monitor-exit(r2)     // Catch:{ all -> 0x013b }
                com.ss.android.d.b.b.f28383f = r0     // Catch:{ Exception -> 0x013e }
                java.lang.ThreadLocal<java.lang.Boolean> r0 = com.ss.android.d.b.b.w     // Catch:{ Exception -> 0x013e }
                r0.remove()     // Catch:{ Exception -> 0x013e }
                if (r1 != 0) goto L_0x013a
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x013e }
                com.ss.android.d.b.a.a r0 = r0.i     // Catch:{ Exception -> 0x013e }
                java.lang.String r0 = r0.e()     // Catch:{ Exception -> 0x013e }
                boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x013e }
                com.ss.android.d.b.b.a((boolean) r3, (boolean) r0)     // Catch:{ Exception -> 0x013e }
            L_0x013a:
                return
            L_0x013b:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x013b }
                throw r0     // Catch:{ Exception -> 0x013e }
            L_0x013e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.b.b.a.a():void");
        }

        public a() {
            super("DeviceRegisterThread");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(12:63|(1:65)(1:66)|67|(1:70)|(1:80)(3:74|(2:76|77)|78)|(3:82|83|(3:85|(8:87|88|(1:90)|91|(1:93)|94|(2:96|(1:100))|101)|102))|(2:105|106)|107|108|(1:110)|111|112) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x0278 */
        /* JADX WARNING: Removed duplicated region for block: B:110:0x027d A[Catch:{ Throwable -> 0x0296 }] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x011c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x011b A[Catch:{ Throwable -> 0x0296 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(java.lang.String r21) {
            /*
                r20 = this;
                r1 = r20
                r2 = 0
                java.lang.String r0 = "UTF-8"
                r3 = r21
                byte[] r9 = r3.getBytes(r0)     // Catch:{ Throwable -> 0x0296 }
                long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                long r5 = r0.p     // Catch:{ Throwable -> 0x0296 }
                r0 = 0
                long r5 = r3 - r5
                r7 = 600000(0x927c0, double:2.964394E-318)
                r10 = 1
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r0 >= 0) goto L_0x0020
                r11 = 1
                goto L_0x0021
            L_0x0020:
                r11 = 0
            L_0x0021:
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                r0.p = r3     // Catch:{ Throwable -> 0x0296 }
                java.lang.String[] r0 = com.ss.android.d.b.a.f28352a     // Catch:{ Throwable -> 0x0296 }
                if (r0 == 0) goto L_0x003c
                java.lang.String[] r0 = com.ss.android.d.b.a.f28352a     // Catch:{ Throwable -> 0x0296 }
                int r0 = r0.length     // Catch:{ Throwable -> 0x0296 }
                if (r0 <= 0) goto L_0x003c
                java.lang.String[] r0 = com.ss.android.d.b.a.f28352a     // Catch:{ Throwable -> 0x0296 }
                r0 = r0[r2]     // Catch:{ Throwable -> 0x0296 }
                boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0296 }
                if (r0 != 0) goto L_0x003c
                java.lang.String[] r0 = com.ss.android.d.b.a.f28352a     // Catch:{ Throwable -> 0x0296 }
            L_0x003a:
                r12 = r0
                goto L_0x006e
            L_0x003c:
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x0296 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = "https://"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = com.ss.android.d.b.a.f28354c     // Catch:{ Throwable -> 0x0296 }
                r3.append(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = "/service/2/device_register/"
                r3.append(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0296 }
                r0[r2] = r3     // Catch:{ Throwable -> 0x0296 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = "http://"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = com.ss.android.d.b.a.f28354c     // Catch:{ Throwable -> 0x0296 }
                r3.append(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r4 = "/service/2/device_register/"
                r3.append(r4)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0296 }
                r0[r10] = r3     // Catch:{ Throwable -> 0x0296 }
                goto L_0x003a
            L_0x006e:
                if (r12 == 0) goto L_0x028e
                int r13 = r12.length     // Catch:{ Throwable -> 0x0296 }
                r14 = 0
            L_0x0072:
                r0 = 0
                if (r14 >= r13) goto L_0x0121
                r3 = r12[r14]     // Catch:{ Throwable -> 0x0296 }
                java.lang.Object r4 = r9.clone()     // Catch:{ Throwable -> 0x0296 }
                byte[] r4 = (byte[]) r4     // Catch:{ Throwable -> 0x0296 }
                boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0296 }
                if (r5 != 0) goto L_0x011d
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                android.content.Context r5 = r5.j     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = com.ss.android.j.f.a((android.content.Context) r5, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = com.ss.android.common.applog.NetUtil.addCommonParams(r3, r10)     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.d$b r5 = r5.u     // Catch:{ Throwable -> 0x0296 }
                if (r5 == 0) goto L_0x009d
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.d$b r5 = r5.u     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = r5.b(r3)     // Catch:{ Throwable -> 0x0296 }
            L_0x009d:
                com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.a$a r5 = com.ss.android.d.b.a.f28353b     // Catch:{ Throwable -> 0x00fe }
                if (r5 == 0) goto L_0x00ab
                com.ss.android.d.b.a$a r5 = com.ss.android.d.b.a.f28353b     // Catch:{ Throwable -> 0x00fe }
                boolean r5 = r5.a()     // Catch:{ Throwable -> 0x00fe }
                goto L_0x00ac
            L_0x00ab:
                r5 = 1
            L_0x00ac:
                if (r5 == 0) goto L_0x00dc
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ RuntimeException -> 0x00b9 }
                android.content.Context r5 = r5.j     // Catch:{ RuntimeException -> 0x00b9 }
                java.lang.String r4 = com.ss.android.common.applog.NetUtil.sendEncryptLog(r3, r4, r5, r11)     // Catch:{ RuntimeException -> 0x00b9 }
                r3 = r4
                goto L_0x0122
            L_0x00b9:
                if (r11 == 0) goto L_0x00cd
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fe }
                r4.<init>()     // Catch:{ Throwable -> 0x00fe }
                r4.append(r3)     // Catch:{ Throwable -> 0x00fe }
                java.lang.String r3 = "&config_retry=b"
                r4.append(r3)     // Catch:{ Throwable -> 0x00fe }
                java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x00fe }
            L_0x00cd:
                r4 = r3
                com.bytedance.common.utility.NetworkClient r3 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x00fe }
                r6 = 1
                java.lang.String r7 = "application/json; charset=utf-8"
                r8 = 0
                r5 = r9
                java.lang.String r3 = r3.post(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x00fe }
                goto L_0x0122
            L_0x00dc:
                if (r11 == 0) goto L_0x00ef
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00fe }
                r4.<init>()     // Catch:{ Throwable -> 0x00fe }
                r4.append(r3)     // Catch:{ Throwable -> 0x00fe }
                java.lang.String r3 = "&config_retry=b"
                r4.append(r3)     // Catch:{ Throwable -> 0x00fe }
                java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x00fe }
            L_0x00ef:
                r4 = r3
                com.bytedance.common.utility.NetworkClient r3 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x00fe }
                r6 = 1
                java.lang.String r7 = "application/json; charset=utf-8"
                r8 = 0
                r5 = r9
                java.lang.String r3 = r3.post(r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x00fe }
                goto L_0x0122
            L_0x00fe:
                r0 = move-exception
                boolean r3 = r0 instanceof com.bytedance.common.utility.CommonHttpException     // Catch:{ Throwable -> 0x0296 }
                if (r3 == 0) goto L_0x0118
                r3 = r0
                com.bytedance.common.utility.CommonHttpException r3 = (com.bytedance.common.utility.CommonHttpException) r3     // Catch:{ Throwable -> 0x0296 }
                int r3 = r3.getResponseCode()     // Catch:{ Throwable -> 0x0296 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 < r4) goto L_0x0118
                r4 = 301(0x12d, float:4.22E-43)
                if (r3 == r4) goto L_0x0118
                r4 = 302(0x12e, float:4.23E-43)
                if (r3 == r4) goto L_0x0118
                r3 = 0
                goto L_0x0119
            L_0x0118:
                r3 = 1
            L_0x0119:
                if (r3 == 0) goto L_0x011c
                goto L_0x011d
            L_0x011c:
                throw r0     // Catch:{ Throwable -> 0x0296 }
            L_0x011d:
                int r14 = r14 + 1
                goto L_0x0072
            L_0x0121:
                r3 = r0
            L_0x0122:
                if (r3 == 0) goto L_0x028d
                int r4 = r3.length()     // Catch:{ Throwable -> 0x0296 }
                if (r4 != 0) goto L_0x012c
                goto L_0x028d
            L_0x012c:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0296 }
                r4.<init>(r3)     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r3 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                int r5 = com.ss.android.d.a.d.b()     // Catch:{ Throwable -> 0x0296 }
                r3.h = r5     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = "new_user"
                int r3 = r4.optInt(r3, r2)     // Catch:{ Throwable -> 0x0296 }
                if (r3 <= 0) goto L_0x0143
                r3 = 1
                goto L_0x0144
            L_0x0143:
                r3 = 0
            L_0x0144:
                com.ss.android.d.b.b.x = r3     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r3 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                android.content.SharedPreferences r3 = r3.k     // Catch:{ Throwable -> 0x0296 }
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r5 = "last_config_version"
                com.ss.android.d.b.b r6 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                int r6 = r6.h     // Catch:{ Throwable -> 0x0296 }
                r3.putInt(r5, r6)     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r5 = r5.q     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r6 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.a.a r6 = r6.i     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r6 = r6.e()     // Catch:{ Throwable -> 0x0296 }
                boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r8 = "install_id"
                java.lang.String r8 = r4.optString(r8, r0)     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r9 = "device_id"
                java.lang.String r0 = r4.optString(r9, r0)     // Catch:{ Throwable -> 0x0296 }
                boolean r4 = com.ss.android.common.applog.NetUtil.isBadId(r0)     // Catch:{ Throwable -> 0x0296 }
                boolean r9 = com.ss.android.common.applog.NetUtil.isBadId(r8)     // Catch:{ Throwable -> 0x0296 }
                if (r4 != 0) goto L_0x0190
                if (r9 != 0) goto L_0x0190
                com.ss.android.d.b.b r11 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0296 }
                r11.n = r12     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r11 = "last_config_time"
                com.ss.android.d.b.b r12 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                long r12 = r12.n     // Catch:{ Throwable -> 0x0296 }
                r3.putLong(r11, r12)     // Catch:{ Throwable -> 0x0296 }
            L_0x0190:
                if (r9 != 0) goto L_0x01c6
                com.ss.android.d.b.b r9 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r9 = r9.q     // Catch:{ Throwable -> 0x0296 }
                boolean r9 = r8.equals(r9)     // Catch:{ Throwable -> 0x0296 }
                if (r9 != 0) goto L_0x01c6
                com.ss.android.d.b.b r9 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                r9.q = r8     // Catch:{ Throwable -> 0x0296 }
                boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0296 }
                if (r9 != 0) goto L_0x01c4
                org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x01c4 }
                r9.<init>()     // Catch:{ Exception -> 0x01c4 }
                java.lang.String r11 = "old_id"
                r9.put(r11, r5)     // Catch:{ Exception -> 0x01c4 }
                java.lang.String r5 = "new_id"
                r9.put(r5, r8)     // Catch:{ Exception -> 0x01c4 }
                r11 = 0
                java.lang.String r12 = "umeng"
                java.lang.String r13 = "iid_change"
                r14 = 0
                r15 = 0
                r17 = 0
                r19 = r9
                com.ss.android.d.b.b.a(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ Exception -> 0x01c4 }
            L_0x01c4:
                r5 = 1
                goto L_0x01c7
            L_0x01c6:
                r5 = 0
            L_0x01c7:
                if (r4 != 0) goto L_0x0252
                boolean r4 = r0.equals(r6)     // Catch:{ Throwable -> 0x0296 }
                if (r4 != 0) goto L_0x0252
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0296 }
                if (r4 != 0) goto L_0x0251
                com.ss.android.d.b.b r4 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.a.a r4 = r4.i     // Catch:{ Exception -> 0x0251 }
                java.lang.String r4 = r4.a((boolean) r10)     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.b r5 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.a.a r5 = r5.i     // Catch:{ Exception -> 0x0251 }
                java.lang.String r5 = r5.d()     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.b r8 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.a.a r8 = r8.i     // Catch:{ Exception -> 0x0251 }
                java.lang.String r8 = r8.a()     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.b r9 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.a.a r9 = r9.i     // Catch:{ Exception -> 0x0251 }
                java.lang.String r9 = r9.b()     // Catch:{ Exception -> 0x0251 }
                org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x0251 }
                r15.<init>()     // Catch:{ Exception -> 0x0251 }
                java.lang.String r11 = "old_id"
                r15.put(r11, r6)     // Catch:{ Exception -> 0x0251 }
                java.lang.String r6 = "new_id"
                r15.put(r6, r0)     // Catch:{ Exception -> 0x0251 }
                java.lang.String r6 = "openudid"
                r15.put(r6, r4)     // Catch:{ Exception -> 0x0251 }
                java.lang.String r4 = "clientudid"
                r15.put(r4, r8)     // Catch:{ Exception -> 0x0251 }
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0251 }
                if (r4 != 0) goto L_0x0219
                java.lang.String r4 = "udid"
                r15.put(r4, r5)     // Catch:{ Exception -> 0x0251 }
            L_0x0219:
                boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0251 }
                if (r4 != 0) goto L_0x0224
                java.lang.String r4 = "serial_number"
                r15.put(r4, r9)     // Catch:{ Exception -> 0x0251 }
            L_0x0224:
                boolean r4 = com.ss.android.d.a.d.e()     // Catch:{ Exception -> 0x0251 }
                if (r4 == 0) goto L_0x0240
                com.ss.android.d.b.b r4 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0251 }
                com.ss.android.d.b.a.a r4 = r4.i     // Catch:{ Exception -> 0x0251 }
                java.lang.String[] r4 = r4.c()     // Catch:{ Exception -> 0x0251 }
                if (r4 == 0) goto L_0x0240
                int r5 = r4.length     // Catch:{ Exception -> 0x0251 }
                if (r5 <= 0) goto L_0x0240
                java.lang.String r5 = "sim_serial_number"
                java.lang.String r4 = java.util.Arrays.toString(r4)     // Catch:{ Exception -> 0x0251 }
                r15.put(r5, r4)     // Catch:{ Exception -> 0x0251 }
            L_0x0240:
                r11 = 0
                java.lang.String r12 = "umeng"
                java.lang.String r13 = "did_change"
                r14 = 0
                r4 = 0
                r17 = 0
                r6 = r15
                r15 = r4
                r19 = r6
                com.ss.android.d.b.b.a(r11, r12, r13, r14, r15, r17, r19)     // Catch:{ Exception -> 0x0251 }
            L_0x0251:
                r5 = 1
            L_0x0252:
                if (r5 == 0) goto L_0x0278
                com.ss.android.d.b.b r4 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0278 }
                org.json.JSONObject r4 = r4.l     // Catch:{ Exception -> 0x0278 }
                java.lang.String r6 = "install_id"
                com.ss.android.d.b.b r8 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0278 }
                java.lang.String r8 = r8.q     // Catch:{ Exception -> 0x0278 }
                r4.put(r6, r8)     // Catch:{ Exception -> 0x0278 }
                com.ss.android.d.b.b r4 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0278 }
                org.json.JSONObject r4 = r4.l     // Catch:{ Exception -> 0x0278 }
                java.lang.String r6 = "device_id"
                r4.put(r6, r0)     // Catch:{ Exception -> 0x0278 }
                java.lang.String r4 = "install_id"
                com.ss.android.d.b.b r6 = com.ss.android.d.b.b.this     // Catch:{ Exception -> 0x0278 }
                java.lang.String r6 = r6.q     // Catch:{ Exception -> 0x0278 }
                r3.putString(r4, r6)     // Catch:{ Exception -> 0x0278 }
                java.lang.String r4 = "device_id"
                r3.putString(r4, r0)     // Catch:{ Exception -> 0x0278 }
            L_0x0278:
                r3.commit()     // Catch:{ Throwable -> 0x0296 }
                if (r5 == 0) goto L_0x0289
                com.ss.android.d.b.b r3 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.a.a r3 = r3.i     // Catch:{ Throwable -> 0x0296 }
                r3.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x0296 }
                com.ss.android.d.b.b r0 = com.ss.android.d.b.b.this     // Catch:{ Throwable -> 0x0296 }
                r0.e()     // Catch:{ Throwable -> 0x0296 }
            L_0x0289:
                com.ss.android.d.b.b.a((boolean) r10, (boolean) r7)     // Catch:{ Throwable -> 0x0296 }
                return r10
            L_0x028d:
                return r2
            L_0x028e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x0296 }
                java.lang.String r3 = "url is null"
                r0.<init>(r3)     // Catch:{ Throwable -> 0x0296 }
                throw r0     // Catch:{ Throwable -> 0x0296 }
            L_0x0296:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.b.b.a.a(java.lang.String):boolean");
        }
    }

    public static void b() {
        m = System.currentTimeMillis();
    }

    public final String a() {
        return this.i.e();
    }

    public final String c() {
        return this.i.a(true);
    }

    public final String d() {
        return this.i.a();
    }

    public final void e() {
        a("install_id", (Object) this.q);
        a("device_id", (Object) this.i.e());
        int size = v.size();
        for (int i2 = 0; i2 < size; i2++) {
            WeakReference weakReference = v.get(i2);
            if (weakReference != null) {
                d.a aVar = (d.a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.a(this.i.e(), this.q);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public static void a(d.a aVar) {
        if (aVar != null) {
            v.add(new WeakReference(aVar));
        }
    }

    private static String b(Context context) {
        try {
            return f.a(context).e();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context) {
        if (w.get() == null && StringUtils.isEmpty(b(context))) {
            synchronized (f28380b) {
                if (!f28383f) {
                    long j2 = 1500;
                    if (g) {
                        j2 = 4000;
                    }
                    try {
                        f28380b.wait(j2);
                    } catch (Exception unused) {
                    }
                    f28383f = true;
                }
            }
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null && bundle.size() > 0) {
            synchronized (f28382e) {
                f28382e.putAll(bundle);
            }
        }
    }

    public b(Context context, d.b bVar) {
        this.j = context;
        this.i = f.a(context);
        this.k = com.ss.android.d.a.a.a(context);
        this.u = bVar;
    }

    private static void a(String str, Object obj) {
        if (str != null && obj != null) {
            Logger.debug();
            if (com.ss.android.d.a.d.j == null) {
                com.ss.android.d.a.d.j = new ConcurrentHashMap<>();
            }
            com.ss.android.d.a.d.j.put(str, obj);
        }
    }

    public static void a(boolean z, boolean z2) {
        int size = v.size();
        for (int i2 = 0; i2 < size; i2++) {
            WeakReference weakReference = v.get(i2);
            if (weakReference != null) {
                d.a aVar = (d.a) weakReference.get();
                if (aVar != null) {
                    try {
                        aVar.a(z, z2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public final void a(Context context, String str) {
        if (!StringUtils.isEmpty(str)) {
            try {
                this.s = str;
            } catch (Exception unused) {
            }
        }
        com.ss.android.d.a.d.a(context, str);
    }

    public static void a(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject) {
        if (f28381c != null) {
            f28381c.onDeviceRegisterEvent(null, str, str2, null, 0, 0, jSONObject);
        }
    }
}
