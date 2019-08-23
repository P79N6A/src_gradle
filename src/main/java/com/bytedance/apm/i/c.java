package com.bytedance.apm.i;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.apm.d.d;
import com.bytedance.apm.f.e;
import com.bytedance.apm.f.i;
import com.bytedance.apm.i.a.b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.j.b;
import com.bytedance.services.apm.api.h;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements b, com.bytedance.apm.i.b.c, b.C0006b, com.bytedance.services.apm.api.c, com.bytedance.services.slardar.config.a {
    private static final List<String> v = Arrays.asList(new String[]{"timer", "count", "disk", "memory", "cpu", "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action"});
    private static final List<String> w = Arrays.asList(new String[]{"block_monitor", "drop_frame_stack"});

    /* renamed from: a  reason: collision with root package name */
    public List<String> f2010a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f2011b;

    /* renamed from: c  reason: collision with root package name */
    public long f2012c;

    /* renamed from: d  reason: collision with root package name */
    public List<com.bytedance.services.slardar.config.b> f2013d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f2014e;

    /* renamed from: f  reason: collision with root package name */
    private long f2015f;
    private int g;
    private final List<com.bytedance.frameworks.core.apm.a.a.a<? extends e>> h;
    private volatile boolean i;
    private int j;
    private long k;
    private boolean l;
    private boolean m;
    private long n;
    private long o;
    private int p;
    private int q;
    private volatile int r;
    private int s;
    private int t;
    private final List<String> u;
    private volatile com.bytedance.article.common.monitor.b.a x;
    private volatile com.bytedance.article.common.monitor.c.a y;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19023a = new c((byte) 0);
    }

    public final void c(Activity activity) {
    }

    public final void d(Activity activity) {
    }

    public static c a() {
        return a.f19023a;
    }

    public final int b() {
        return this.s;
    }

    public final int c() {
        return this.t;
    }

    public final long d() {
        return this.k;
    }

    public final void a(long j2) {
        if (this.o > 0 && j2 - this.n > this.o) {
            this.i = false;
            d.a().f1975a = false;
            a(true, 0);
        }
        a(false);
    }

    public final void a(boolean z) {
        if (this.f2014e && this.j == 1 && this.r >= 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f2012c <= 0 || currentTimeMillis - com.bytedance.apm.c.h() >= this.f2012c * 1000) {
                long f2 = f();
                if (f2 > 0) {
                    if (z || f2 > ((long) this.g) || currentTimeMillis - this.f2015f > ((long) (this.r * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE))) {
                        if (com.bytedance.apm.c.d()) {
                            new String[1][0] = "packAndSendLog, case: count > threshold ? count -> " + f2 + " threshold-> " + this.g + " , passedTime: " + ((currentTimeMillis - this.f2015f) / 1000) + " 秒，interval: " + this.r;
                        }
                        this.f2015f = currentTimeMillis;
                        for (String next : this.u) {
                            a(next, b(next), this.g);
                        }
                    }
                    return;
                }
                return;
            }
            this.f2012c = -1;
        }
    }

    public final void a(i iVar) {
        int i2;
        JSONArray jSONArray;
        e eVar;
        i iVar2 = iVar;
        if (ApmDelegate.getInstance().isStarted()) {
            try {
                long j2 = iVar2.f19006a;
                long j3 = iVar2.f19007b;
                List<String> list = iVar2.f19008c;
                HashMap hashMap = new HashMap(2);
                if (!com.bytedance.apm.k.i.a(list)) {
                    for (String next : list) {
                        String str = w.contains(next) ? "exception" : "monitor";
                        if (!TextUtils.isEmpty(str)) {
                            if (hashMap.containsKey(str)) {
                                List list2 = (List) hashMap.get(str);
                                if (list2 != null) {
                                    list2.add(next);
                                }
                                hashMap.put(str, list2);
                            } else {
                                ArrayList arrayList = new ArrayList(8);
                                arrayList.add(next);
                                hashMap.put(str, arrayList);
                            }
                        }
                    }
                } else if (this.u != null) {
                    for (String next2 : this.u) {
                        hashMap.put(next2, b(next2));
                    }
                } else {
                    return;
                }
                int i3 = 0;
                for (Map.Entry entry : hashMap.entrySet()) {
                    List list3 = (List) entry.getValue();
                    String str2 = (String) entry.getKey();
                    int i4 = i3;
                    do {
                        int i5 = i4;
                        List<e> a2 = a(j2, j3, list3, i4, 400);
                        if (!com.bytedance.apm.k.i.a(a2)) {
                            i2 = a2.size();
                            JSONArray jSONArray2 = new JSONArray();
                            LinkedList linkedList = new LinkedList();
                            JSONArray jSONArray3 = jSONArray2;
                            long j4 = -1;
                            for (e next3 : a2) {
                                try {
                                    if (j4 == -1) {
                                        j4 = next3.j;
                                    } else if (next3.j != j4) {
                                        e eVar2 = next3;
                                        LinkedList linkedList2 = linkedList;
                                        try {
                                            if (a(str2, jSONArray3, (JSONArray) null, j4, true)) {
                                                a((List<? extends e>) linkedList2);
                                                linkedList2.clear();
                                            }
                                            eVar = eVar2;
                                            long j5 = eVar.j;
                                            try {
                                                jSONArray = new JSONArray();
                                                j4 = j5;
                                                linkedList = linkedList2;
                                                linkedList.add(eVar);
                                                jSONArray.put(eVar.i);
                                                jSONArray3 = jSONArray;
                                            } catch (Exception unused) {
                                                j4 = j5;
                                                linkedList = linkedList2;
                                            }
                                        } catch (Exception unused2) {
                                            linkedList = linkedList2;
                                        }
                                    }
                                    eVar = next3;
                                    jSONArray = jSONArray3;
                                    try {
                                        linkedList.add(eVar);
                                        jSONArray.put(eVar.i);
                                    } catch (Exception unused3) {
                                    }
                                    jSONArray3 = jSONArray;
                                } catch (Exception unused4) {
                                }
                            }
                            JSONArray jSONArray4 = jSONArray3;
                            LinkedList linkedList3 = linkedList;
                            boolean z = true;
                            if (a(str2, jSONArray4, (JSONArray) null, j4, true) && a((List<? extends e>) linkedList3) > 0) {
                                z = false;
                            }
                            i4 = z ? i5 + 400 : i5;
                        } else {
                            i4 = i5;
                            i2 = 0;
                        }
                    } while (i2 == 400);
                    i3 = i4;
                }
            } catch (Throwable unused5) {
            }
        }
    }

    public final void a(Activity activity) {
        this.r = this.q;
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                c.this.a(true);
            }
        });
    }

    public final void onReady() {
        com.bytedance.apm.j.b.a().a((b.C0006b) this);
    }

    public final boolean e() {
        if (this.i) {
            return this.i;
        }
        return this.l;
    }

    private c() {
        this.f2014e = true;
        this.g = 100;
        this.f2010a = com.bytedance.apm.constant.a.f18938d;
        this.f2011b = com.bytedance.apm.constant.a.g;
        this.j = 1;
        this.m = true;
        this.u = Arrays.asList(new String[]{"monitor", "exception"});
        this.h = com.bytedance.frameworks.core.apm.b.a().f2130a;
    }

    private long f() {
        long j2 = 0;
        for (com.bytedance.frameworks.core.apm.a.a.a<? extends e> f2 : this.h) {
            j2 += f2.f();
        }
        if (com.bytedance.apm.c.d()) {
            new String[1][0] = "getLogSampledCount: " + j2;
        }
        return j2;
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void b(Activity activity) {
        this.r = this.p;
    }

    private void a(JSONObject jSONObject) {
        if (this.f2013d != null) {
            for (com.bytedance.services.slardar.config.b a2 : this.f2013d) {
                a2.a(jSONObject);
            }
        }
    }

    private static List<String> b(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return v;
        }
        if (TextUtils.equals(str, "exception")) {
            return w;
        }
        return null;
    }

    private static List<String> a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList(2);
                    int length = jSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String string = jSONArray.getString(i2);
                        if (!TextUtils.isEmpty(string) && string.indexOf(46) > 0) {
                            arrayList.add(string);
                        }
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
            }
        }
        return Collections.emptyList();
    }

    private static int a(List<? extends e> list) {
        int i2;
        if (com.bytedance.apm.k.i.a(list)) {
            return -1;
        }
        if (com.bytedance.apm.c.d()) {
            new String[1][0] = "need deleteUploadedLogs count: " + list.size();
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (e eVar : list) {
            if (eVar != null) {
                if (TextUtils.equals(eVar.g, "api_all")) {
                    linkedList.add(Long.valueOf(eVar.f1988f));
                } else {
                    linkedList2.add(Long.valueOf(eVar.f1988f));
                }
            }
        }
        if (!linkedList2.isEmpty()) {
            i2 = com.bytedance.frameworks.core.apm.b.a().a("", linkedList2) + 0;
        } else {
            i2 = 0;
        }
        if (!linkedList.isEmpty()) {
            i2 += com.bytedance.frameworks.core.apm.b.a().a("api_all", linkedList);
        }
        if (com.bytedance.apm.c.d()) {
            new String[1][0] = "finish deleteUploadedLogs count: " + i2;
        }
        com.bytedance.frameworks.core.apm.c.a();
        return i2;
    }

    public final List<String> a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "monitor")) {
            return this.f2010a;
        }
        if (TextUtils.equals(str, "exception")) {
            return this.f2011b;
        }
        return Collections.emptyList();
    }

    public final void a(boolean z, long j2) {
        this.f2014e = z;
        if (!z) {
            this.n = System.currentTimeMillis();
            this.o = j2;
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        List<String> a2 = a(jSONObject.optJSONArray("report_host_new"));
        if (!com.bytedance.apm.k.i.a(a2)) {
            this.f2010a = a2;
            h hVar = new h();
            hVar.f2319a = this.f2010a;
            ApmDelegate.getInstance().notifyPluginsParams(hVar);
        }
        List<String> a3 = a(jSONObject.optJSONArray("report_exception_host"));
        if (!com.bytedance.apm.k.i.a(a3)) {
            this.f2011b = a3;
        }
        int optInt = jSONObject.optInt("polling_interval", 120);
        if (optInt <= 0) {
            optInt = 120;
        }
        this.p = optInt;
        this.q = jSONObject.optInt("polling_interval_background", this.p);
        this.r = this.p;
        int optInt2 = jSONObject.optInt("once_max_count", 100);
        if (optInt2 <= 0) {
            optInt2 = 100;
        }
        this.g = optInt2;
        this.s = jSONObject.optInt("max_retry_count", 4);
        this.t = jSONObject.optInt("report_fail_base_time", 15);
        this.k = jSONObject.optLong("more_channel_stop_interval", 600);
        this.l = jSONObject.optBoolean("log_remvove_switch", false);
        this.m = jSONObject.optBoolean("monitor_encrypt_switch", true);
        this.j = jSONObject.optInt("log_send_switch", 1);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x042f A[Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0436 A[Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[ExcHandler: IOException | Exception | JSONException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:26:0x010e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.apm.i.b.e a(java.lang.String r24, byte[] r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            com.bytedance.apm.i.b.e r2 = new com.bytedance.apm.i.b.e
            r2.<init>()
            if (r1 == 0) goto L_0x0456
            int r3 = r1.length
            if (r3 != 0) goto L_0x0010
            goto L_0x0456
        L_0x0010:
            com.bytedance.apm.i.d r3 = new com.bytedance.apm.i.d     // Catch:{  }
            r4 = r24
            r3.<init>(r4, r1)     // Catch:{  }
            boolean r1 = r0.m     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            java.util.Map r5 = com.bytedance.apm.c.e()     // Catch:{  }
            java.lang.String r4 = com.bytedance.apm.k.t.a((java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{  }
            r3.f19024a = r4     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            byte[] r5 = r3.f19025b     // Catch:{  }
            java.lang.String r4 = com.bytedance.framwork.core.monitor.b.a((java.lang.String) r4, (byte[]) r5)     // Catch:{  }
            r3.f19024a = r4     // Catch:{  }
            r3.a()     // Catch:{  }
            java.lang.String r4 = "application/json; charset=utf-8"
            if (r1 == 0) goto L_0x00c3
            byte[] r1 = r3.f19025b     // Catch:{  }
            byte[] r5 = r3.f19025b     // Catch:{  }
            int r5 = r5.length     // Catch:{  }
            byte[] r1 = com.bytedance.frameworks.core.encrypt.TTEncryptUtils.a(r1, r5)     // Catch:{  }
            r3.f19025b = r1     // Catch:{  }
            byte[] r1 = r3.f19025b     // Catch:{  }
            if (r1 == 0) goto L_0x00ad
            java.net.URL r1 = new java.net.URL     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            r1.<init>(r4)     // Catch:{  }
            java.lang.String r1 = r1.getQuery()     // Catch:{  }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x0076
            java.lang.String r1 = r3.f19024a     // Catch:{  }
            java.lang.String r4 = "?"
            boolean r1 = r1.endsWith(r4)     // Catch:{  }
            if (r1 != 0) goto L_0x0095
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            r1.append(r4)     // Catch:{  }
            java.lang.String r4 = "?"
            r1.append(r4)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r3.f19024a = r1     // Catch:{  }
            goto L_0x0095
        L_0x0076:
            java.lang.String r1 = r3.f19024a     // Catch:{  }
            java.lang.String r4 = "&"
            boolean r1 = r1.endsWith(r4)     // Catch:{  }
            if (r1 != 0) goto L_0x0095
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            r1.append(r4)     // Catch:{  }
            java.lang.String r4 = "&"
            r1.append(r4)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r3.f19024a = r1     // Catch:{  }
        L_0x0095:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            r1.append(r4)     // Catch:{  }
            java.lang.String r4 = "tt_data=a"
            r1.append(r4)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r3.f19024a = r1     // Catch:{  }
            java.lang.String r1 = "application/octet-stream;tt-data=a"
            r4 = r1
        L_0x00ad:
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.lang.String r5 = r3.f19024a     // Catch:{  }
            java.lang.String r5 = com.bytedance.frameworks.core.encrypt.a.a((java.lang.String) r5, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r1)     // Catch:{  }
            r3.f19024a = r5     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.f19026c     // Catch:{  }
            java.util.Map r1 = com.bytedance.apm.k.i.b(r1)     // Catch:{  }
            r5.putAll(r1)     // Catch:{  }
        L_0x00c3:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f19026c     // Catch:{  }
            java.lang.String r5 = "Version-Code"
            java.lang.String r6 = "1"
            r1.put(r5, r6)     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f19026c     // Catch:{  }
            java.lang.String r5 = "Content-Type"
            r1.put(r5, r4)     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f19026c     // Catch:{  }
            java.lang.String r4 = "Accept-Encoding"
            java.lang.String r5 = "gzip"
            r1.put(r4, r5)     // Catch:{  }
            com.bytedance.apm.impl.a r1 = new com.bytedance.apm.impl.a     // Catch:{  }
            java.lang.String r4 = r3.f19024a     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.f19026c     // Catch:{  }
            byte[] r3 = r3.f19025b     // Catch:{  }
            r1.<init>(r4, r5, r3)     // Catch:{  }
            java.lang.String r3 = r1.f19027a     // Catch:{  }
            byte[] r4 = r1.f19029c     // Catch:{  }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f19028b     // Catch:{  }
            com.bytedance.services.apm.api.IHttpService r5 = com.bytedance.apm.c.f1923c     // Catch:{  }
            com.bytedance.services.apm.api.b r1 = r5.doPost(r3, r4, r1)     // Catch:{  }
            if (r1 != 0) goto L_0x00f6
            return r2
        L_0x00f6:
            int r3 = r1.f2317a     // Catch:{  }
            r2.f19020a = r3     // Catch:{  }
            int r3 = r1.f2317a     // Catch:{  }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0454
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{  }
            java.lang.String r4 = new java.lang.String     // Catch:{  }
            byte[] r1 = r1.f2318b     // Catch:{  }
            r4.<init>(r1)     // Catch:{  }
            r3.<init>(r4)     // Catch:{  }
            java.lang.String r1 = "data"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r4 = r1.isEmpty()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 != 0) goto L_0x0125
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            byte[] r1 = r1.getBytes()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r1 = com.bytedance.apm.k.d.a(r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r3.<init>(r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x0125:
            int r1 = r3.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 <= 0) goto L_0x0451
            java.lang.String r1 = "configs"
            org.json.JSONObject r1 = r3.optJSONObject(r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x0451
            int r4 = r1.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 > 0) goto L_0x013b
            goto L_0x0451
        L_0x013b:
            r0.a((org.json.JSONObject) r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r4 = "debug_settings"
            org.json.JSONObject r4 = r1.optJSONObject(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r8 = 0
            r9 = 1
            if (r4 == 0) goto L_0x0234
            int r10 = r4.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r10 <= 0) goto L_0x0234
            com.bytedance.article.common.monitor.c.a r10 = r0.y     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r10 != 0) goto L_0x015d
            com.bytedance.article.common.monitor.c.a r10 = new com.bytedance.article.common.monitor.c.a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            android.content.Context r11 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r10.<init>(r11)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r0.y = r10     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x015d:
            com.bytedance.article.common.monitor.c.a r10 = r0.y     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 == 0) goto L_0x0234
            int r11 = r4.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r11 > 0) goto L_0x0169
            goto L_0x0234
        L_0x0169:
            java.lang.String r11 = "should_submit_debugreal"
            int r11 = r4.optInt(r11, r8)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r11 == 0) goto L_0x0234
            java.lang.String r11 = "wifi_only"
            boolean r11 = r4.optBoolean(r11, r9)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r11 == 0) goto L_0x0181
            android.content.Context r11 = r10.f19138a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r11 = com.bytedance.framwork.core.monitor.b.a((android.content.Context) r11)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r11 == 0) goto L_0x0234
        L_0x0181:
            android.content.Context r10 = r10.f19138a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r10 = com.bytedance.framwork.core.monitor.b.c(r10)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r10 == 0) goto L_0x0234
            java.lang.String r10 = "fetch_start_time"
            long r10 = r4.optLong(r10)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r12 = "fetch_end_time"
            long r12 = r4.optLong(r12)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x0234
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x01a1
            goto L_0x0234
        L_0x01a1:
            java.lang.String r7 = "upload_type"
            java.util.List r4 = com.bytedance.apm.k.n.a((org.json.JSONObject) r4, (java.lang.String) r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 == 0) goto L_0x01b7
            int r7 = r4.size()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r7 != r9) goto L_0x01b7
            java.lang.String r7 = "debug_log"
            boolean r7 = r4.contains(r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r7 != 0) goto L_0x0234
        L_0x01b7:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r7 = com.bytedance.apm.k.i.a((java.util.List<?>) r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r7 == 0) goto L_0x01d2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7.<init>()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r16 = 0
            long r5 = r10 + r12
            r7.append(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = r7.toString()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            goto L_0x01ea
        L_0x01d2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r5.<init>()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6 = 0
            long r6 = r10 + r12
            r5.append(r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = ","
            java.lang.String r6 = android.text.TextUtils.join(r6, r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r5.append(r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x01ea:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x01f2
            r7 = 0
            goto L_0x020e
        L_0x01f2:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.apm.f.h> r6 = com.bytedance.article.common.monitor.c.a.f19137b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r6 = r6.containsKey(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x0204
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.apm.f.h> r6 = com.bytedance.article.common.monitor.c.a.f19137b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7 = r5
            com.bytedance.apm.f.h r7 = (com.bytedance.apm.f.h) r7     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            goto L_0x020e
        L_0x0204:
            com.bytedance.apm.f.h r7 = new com.bytedance.apm.f.h     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7.<init>(r5, r14)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.apm.f.h> r6 = com.bytedance.article.common.monitor.c.a.f19137b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6.put(r5, r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x020e:
            if (r7 == 0) goto L_0x0234
            long r5 = r7.f19005b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r14 = 0
            long r5 = r8 - r5
            r14 = 600000(0x927c0, double:2.964394E-318)
            int r16 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x0234
            r7.f19005b = r8     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.apm.i.c r5 = a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.apm.f.i r6 = new com.bytedance.apm.f.i     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r18 = r10 * r7
            long r20 = r12 * r7
            r17 = r6
            r22 = r4
            r17.<init>(r18, r20, r22)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r5.a((com.bytedance.apm.f.i) r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x0234:
            java.lang.String r4 = "file_settings"
            org.json.JSONObject r1 = r1.optJSONObject(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x0451
            int r4 = r1.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 <= 0) goto L_0x0451
            java.lang.String r4 = "type"
            java.lang.String r4 = r1.optString(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = "sp_file_back"
            boolean r5 = r1.optBoolean(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "sp_file_back"
            boolean r6 = r6.equals(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x027e
            if (r5 == 0) goto L_0x027e
            android.content.Context r5 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r6 = com.bytedance.article.common.monitor.a.d.f19122a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r6 = com.bytedance.article.common.monitor.a.b.a(r6, r8)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x027e
            boolean r6 = com.bytedance.article.common.monitor.a.d.a(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x027e
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.a.d.f19122a = r6     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "sp_file_back"
            com.bytedance.article.common.monitor.a.d$1 r7 = new com.bytedance.article.common.monitor.a.d$1     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7.<init>(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.b.b.a(r6, r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x027e:
            java.lang.String r5 = "sd_card_dir_back"
            boolean r5 = r1.optBoolean(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "sd_card_dir_back"
            boolean r6 = r6.equals(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x02b4
            if (r5 == 0) goto L_0x02b4
            android.content.Context r5 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r6 = com.bytedance.article.common.monitor.a.e.f19124a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r6 = com.bytedance.article.common.monitor.a.b.a(r6, r8)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x02b4
            boolean r5 = com.bytedance.article.common.monitor.a.e.a(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 == 0) goto L_0x02b4
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.a.e.f19124a = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = "sd_card_dir_back"
            com.bytedance.article.common.monitor.a.e$1 r6 = new com.bytedance.article.common.monitor.a.e$1     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6.<init>()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.b.b.a(r5, r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x02b4:
            java.lang.String r5 = "permission_back"
            boolean r5 = r1.optBoolean(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "permission_back"
            boolean r6 = r6.equals(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x02ea
            if (r5 == 0) goto L_0x02ea
            android.content.Context r5 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r6 = com.bytedance.article.common.monitor.a.c.f19120a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r6 = com.bytedance.article.common.monitor.a.b.a(r6, r8)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x02ea
            boolean r5 = com.bytedance.article.common.monitor.a.c.a(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 == 0) goto L_0x02ea
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.a.c.f19120a = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = "permission_back"
            com.bytedance.article.common.monitor.a.c$1 r6 = new com.bytedance.article.common.monitor.a.c$1     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6.<init>()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.b.b.a(r5, r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x02ea:
            java.lang.String r5 = "db_file_back"
            boolean r5 = r1.optBoolean(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "db_file_name"
            java.lang.String r6 = r1.optString(r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r7 = "db_file_back"
            boolean r4 = r7.equals(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 == 0) goto L_0x037f
            if (r5 == 0) goto L_0x037f
            android.content.Context r4 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r7 = com.bytedance.article.common.monitor.a.a.f19115a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r5 = com.bytedance.article.common.monitor.a.b.a(r7, r9)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 == 0) goto L_0x037f
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r7 = "yyyy-MM-dd-HH-mm"
            r5.<init>(r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            org.json.JSONObject r7 = com.bytedance.apm.c.f()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r7 = com.bytedance.article.common.monitor.a.b.a(r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r8 == 0) goto L_0x0341
            java.lang.String r7 = "%s_db.zip"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.util.Date r8 = new java.util.Date     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r8.<init>(r10)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = r5.format(r8)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r8 = 0
            r9[r8] = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = java.lang.String.format(r7, r9)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7 = r5
            r5 = 1
            goto L_0x035d
        L_0x0341:
            java.lang.String r8 = "%s_db_%s.zip"
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.util.Date r10 = new java.util.Date     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r10.<init>(r11)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = r5.format(r10)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r10 = 0
            r9[r10] = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r5 = 1
            r9[r5] = r7     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r7 = java.lang.String.format(r8, r9)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x035d:
            com.bytedance.article.common.monitor.a.a.f19118d = r7     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r7 != 0) goto L_0x0369
            com.bytedance.article.common.monitor.a.a.f19116b = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.a.a.f19117c = r6     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x0369:
            boolean r5 = com.bytedance.article.common.monitor.a.a.a(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 == 0) goto L_0x037f
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.a.a.f19115a = r5     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r5 = "db_file_back"
            com.bytedance.article.common.monitor.a.a$1 r6 = new com.bytedance.article.common.monitor.a.a$1     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6.<init>(r4)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.b.b.a(r5, r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x037f:
            com.bytedance.article.common.monitor.b.a r4 = r0.x     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r4 != 0) goto L_0x038e
            com.bytedance.article.common.monitor.b.a r4 = new com.bytedance.article.common.monitor.b.a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            android.content.Context r5 = com.bytedance.apm.c.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r4.<init>(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r0.x = r4     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x038e:
            com.bytedance.article.common.monitor.b.a r4 = r0.x     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x0451
            int r5 = r1.length()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 > 0) goto L_0x039a
            goto L_0x0451
        L_0x039a:
            java.lang.String r5 = "should_upload_file"
            r6 = 0
            int r5 = r1.optInt(r5, r6)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r5 == 0) goto L_0x0451
            java.lang.String r5 = "type"
            r12 = 0
            java.lang.String r5 = r1.optString(r5, r12)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "limit_file_size"
            r7 = 61644800(0x3aca000, double:3.0456578E-316)
            long r13 = r1.optLong(r6, r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.String r6 = "wifi_only"
            r7 = 1
            boolean r6 = r1.optBoolean(r6, r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 != 0) goto L_0x03c4
            java.lang.String r6 = "wifi_only"
            int r1 = r1.optInt(r6, r7)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 != r7) goto L_0x03cc
        L_0x03c4:
            android.content.Context r1 = com.bytedance.article.common.monitor.b.a.f19125a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r1 = com.bytedance.framwork.core.monitor.b.a((android.content.Context) r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x0451
        L_0x03cc:
            android.content.Context r1 = com.bytedance.article.common.monitor.b.a.f19125a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r1 = com.bytedance.framwork.core.monitor.b.c(r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x0451
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 != 0) goto L_0x0451
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x03e2
            r1 = r12
            goto L_0x0405
        L_0x03e2:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.article.common.monitor.b.a$a> r1 = com.bytedance.article.common.monitor.b.a.f19126b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r1 == 0) goto L_0x03f5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.article.common.monitor.b.a$a> r1 = com.bytedance.article.common.monitor.b.a.f19126b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r7 = r1
            com.bytedance.article.common.monitor.b.a$a r7 = (com.bytedance.article.common.monitor.b.a.C0143a) r7     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r1 = r7
            goto L_0x0405
        L_0x03f5:
            com.bytedance.article.common.monitor.b.a$a r1 = new com.bytedance.article.common.monitor.b.a$a     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r9 = 0
            r11 = 0
            r6 = r1
            r7 = r4
            r8 = r5
            r6.<init>(r8, r9, r11)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.article.common.monitor.b.a$a> r6 = com.bytedance.article.common.monitor.b.a.f19126b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6.put(r5, r1)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x0405:
            if (r1 == 0) goto L_0x0451
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 != 0) goto L_0x041c
            com.bytedance.article.common.monitor.b.c r6 = com.bytedance.article.common.monitor.b.b.a(r5)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 == 0) goto L_0x041c
            boolean r7 = r6 instanceof com.bytedance.article.common.monitor.b.d     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r7 == 0) goto L_0x041c
            r7 = r6
            com.bytedance.article.common.monitor.b.d r7 = (com.bytedance.article.common.monitor.b.d) r7     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r11 = r7
            goto L_0x041d
        L_0x041c:
            r11 = r12
        L_0x041d:
            long r6 = r1.f19133b     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            boolean r8 = r1.f19134c     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r12 = 0
            long r6 = r9 - r6
            r15 = 600000(0x927c0, double:2.964394E-318)
            int r12 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r12 < 0) goto L_0x0434
            if (r8 == 0) goto L_0x0432
            goto L_0x0434
        L_0x0432:
            r6 = 1
            goto L_0x043d
        L_0x0434:
            if (r11 == 0) goto L_0x0451
            boolean r6 = r11.d()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            if (r6 != 0) goto L_0x0432
            goto L_0x0451
        L_0x043d:
            r1.f19134c = r6     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r1.f19133b = r9     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.frameworks.core.b.a.a()     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.article.common.monitor.b.a$1 r15 = new com.bytedance.article.common.monitor.b.a$1     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            r6 = r15
            r7 = r4
            r8 = r5
            r9 = r13
            r12 = r1
            r6.<init>(r8, r9, r11, r12)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            com.bytedance.frameworks.core.b.a.a(r15)     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
        L_0x0451:
            r2.f19021b = r3     // Catch:{ IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455, IOException | Exception | JSONException -> 0x0455 }
            goto L_0x0455
        L_0x0454:
            return r2
        L_0x0455:
            return r2
        L_0x0456:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.i.c.a(java.lang.String, byte[]):com.bytedance.apm.i.b.e");
    }

    private void a(String str, List<String> list, int i2) {
        int i3 = i2;
        LinkedList<e> linkedList = new LinkedList<>();
        int i4 = i3;
        for (com.bytedance.frameworks.core.apm.a.a.a next : this.h) {
            if (next != null) {
                List a2 = next.a(list, i4);
                if (!com.bytedance.apm.k.i.a(a2)) {
                    linkedList.addAll(a2);
                    if (linkedList.size() >= i3) {
                        break;
                    }
                    i4 = i3 - linkedList.size();
                } else {
                    continue;
                }
            } else {
                List<String> list2 = list;
            }
        }
        if (!com.bytedance.apm.k.i.a((List<?>) linkedList)) {
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                LinkedList linkedList2 = new LinkedList();
                JSONArray jSONArray3 = jSONArray;
                JSONArray jSONArray4 = jSONArray2;
                long j2 = -1;
                for (e eVar : linkedList) {
                    if (j2 == -1) {
                        j2 = eVar.j;
                    } else if (eVar.j != j2) {
                        if (a(str, jSONArray3, jSONArray4, j2, false)) {
                            a((List<? extends e>) linkedList2);
                            linkedList2.clear();
                        }
                        long j3 = eVar.j;
                        JSONArray jSONArray5 = new JSONArray();
                        jSONArray4 = new JSONArray();
                        j2 = j3;
                        jSONArray3 = jSONArray5;
                    }
                    long j4 = eVar.f1988f;
                    String str2 = eVar.g;
                    linkedList2.add(eVar);
                    try {
                        JSONObject jSONObject = eVar.i;
                        char c2 = 65535;
                        if (str2.hashCode() == 110364485) {
                            if (str2.equals("timer")) {
                                c2 = 0;
                            }
                        }
                        if (c2 != 0) {
                            jSONObject.put("log_id", j4);
                            jSONObject.put("d_s_t", System.currentTimeMillis());
                            jSONArray3.put(jSONObject);
                        } else {
                            jSONArray4.put(jSONObject);
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (a(str, jSONArray3, jSONArray4, j2, false)) {
                    a((List<? extends e>) linkedList2);
                }
            } catch (Exception unused2) {
            }
        }
    }

    private List<e> a(long j2, long j3, List<String> list, int i2, int i3) {
        LinkedList linkedList = new LinkedList();
        int size = 400 - linkedList.size();
        for (com.bytedance.frameworks.core.apm.a.a.a<? extends e> a2 : this.h) {
            List a3 = a2.a(j2, j3, list, i2 + "," + size);
            if (!com.bytedance.apm.k.i.a(a3)) {
                linkedList.addAll(a3);
                if (linkedList.size() >= 400) {
                    return linkedList;
                }
                size = 400 - linkedList.size();
            }
        }
        return linkedList;
    }

    private static boolean a(String str, JSONArray jSONArray, JSONArray jSONArray2, long j2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (com.bytedance.apm.k.h.a(jSONArray)) {
                jSONObject.put("data", jSONArray);
            }
            if (com.bytedance.apm.k.h.a(jSONArray2)) {
                jSONObject.put("timer", jSONArray2);
            }
            if (com.bytedance.apm.k.h.b(jSONObject)) {
                return false;
            }
            if (com.bytedance.apm.c.f() == null) {
                return true;
            }
            JSONObject a2 = b.a(new JSONObject(com.bytedance.apm.c.f().toString()), com.bytedance.frameworks.core.apm.a.a().a(j2));
            a2.put("current_update_version_code", com.bytedance.apm.c.f().optString("update_version_code"));
            a2.put("debug_fetch", z ? 1 : 0);
            if (com.bytedance.apm.c.g() != null) {
                a2.put("uid", com.bytedance.apm.c.g().c());
            }
            jSONObject.put("header", a2);
            if (com.bytedance.apm.c.d()) {
                com.bytedance.apm.h.c.a(com.bytedance.apm.h.a.i, "report", jSONObject.toString());
            }
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(jSONObject2)) {
                    com.bytedance.apm.i.b.b bVar = com.bytedance.apm.i.b.d.f2008a.get(str);
                    if (bVar != null) {
                        if (!bVar.a()) {
                            return bVar.a(jSONObject2);
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
