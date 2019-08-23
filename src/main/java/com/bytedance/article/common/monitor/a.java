package com.bytedance.article.common.monitor;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.f.d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.j;
import com.bytedance.apm.k.n;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a implements b.C0006b, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    boolean f2088a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, d> f2089b;

    /* renamed from: c  reason: collision with root package name */
    private long f2090c;

    /* renamed from: d  reason: collision with root package name */
    private volatile List<String> f2091d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f2092e;

    /* renamed from: f  reason: collision with root package name */
    private volatile long f2093f;

    /* renamed from: com.bytedance.article.common.monitor.a$a  reason: collision with other inner class name */
    static class C0142a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19114a = new a((byte) 0);
    }

    public final void onReady() {
        this.f2092e = true;
    }

    public static a a() {
        return C0142a.f19114a;
    }

    private a() {
        this.f2090c = 120000;
        this.f2089b = new HashMap<>();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(long j) {
        b(j);
    }

    /* access modifiers changed from: package-private */
    public boolean a(@NonNull String str) {
        if (!this.f2092e || com.bytedance.framwork.core.c.a.a(this.f2091d) || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = Uri.parse(str).getHost();
            for (String equalsIgnoreCase : this.f2091d) {
                if (host.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void b(long j) {
        if (this.f2093f == 0) {
            this.f2093f = j;
            return;
        }
        if (j - this.f2093f > this.f2090c) {
            this.f2093f = j;
            b.a().a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        HashMap hashMap = new HashMap();
                        synchronized (a.this.f2089b) {
                            hashMap.putAll(a.this.f2089b);
                            a.this.f2089b.clear();
                        }
                        if (!hashMap.isEmpty()) {
                            for (Map.Entry value : hashMap.entrySet()) {
                                d dVar = (d) value.getValue();
                                if (dVar != null) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("log_type", "image_monitor");
                                        jSONObject.put("uri", dVar.f18992a);
                                        jSONObject.put("count", dVar.g);
                                        jSONObject.put("ip", dVar.f18994c);
                                        jSONObject.put("status", dVar.f18993b);
                                        jSONObject.put("duration", dVar.f18996e);
                                        jSONObject.put("timestamp", dVar.f18995d);
                                        jSONObject.put("network_type", j.c(c.a()).getValue());
                                        jSONObject.put("sid", c.c());
                                        String b2 = c.g().b();
                                        if (!TextUtils.isEmpty(b2)) {
                                            jSONObject.put("session_id", b2);
                                        }
                                        if (dVar.f18997f != null) {
                                            jSONObject.put(PushConstants.EXTRA, dVar.f18997f);
                                        }
                                        com.bytedance.apm.d.d.a().a("image_monitor", "image_monitor", jSONObject, ApmDelegate.getInstance().getLogTypeSwitch("image_monitor"), false);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            });
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.f2088a = jSONObject.optBoolean("pic_sla_switch", false);
        long optLong = jSONObject.optLong("image_sample_interval", -1);
        if (optLong > 0) {
            this.f2090c = optLong * 1000;
        }
        this.f2091d = n.a(jSONObject, "image_allow_list");
    }

    public final void a(String str, int i, String str2, long j, JSONObject jSONObject) {
        b a2 = b.a();
        final String str3 = str;
        final int i2 = i;
        final String str4 = str2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        AnonymousClass1 r1 = new Runnable() {
            public final void run() {
                long j;
                JSONObject jSONObject;
                long optLong;
                a aVar = a.this;
                String str = str3;
                int i = i2;
                String str2 = str4;
                long j2 = j2;
                JSONObject jSONObject2 = jSONObject2;
                try {
                    if (aVar.f2088a) {
                        if (jSONObject2 == null) {
                            optLong = 0;
                        } else {
                            optLong = jSONObject2.optLong("requestStart");
                        }
                        com.bytedance.apm.d.b.a aVar2 = r2;
                        jSONObject = jSONObject2;
                        j = j2;
                        com.bytedance.apm.d.b.a aVar3 = new com.bytedance.apm.d.b.a("api_all", j2, optLong, str, str2, "", i, jSONObject);
                        com.bytedance.apm.d.a.b.b().a(aVar2);
                    } else {
                        jSONObject = jSONObject2;
                        j = j2;
                    }
                    if (aVar.a(str)) {
                        Uri parse = Uri.parse(str);
                        String host = parse.getHost();
                        String scheme = parse.getScheme();
                        String str3 = scheme + host + i;
                        synchronized (aVar.f2089b) {
                            d dVar = aVar.f2089b.get(str3);
                            if (dVar == null) {
                                d dVar2 = new d(str, i, str2, System.currentTimeMillis(), j, jSONObject);
                                aVar.f2089b.put(str3, dVar2);
                            } else {
                                dVar.f18996e += j;
                                dVar.g++;
                                if (!TextUtils.isEmpty(str2)) {
                                    dVar.f18994c = str2;
                                }
                                dVar.f18992a = str;
                                dVar.f18995d = System.currentTimeMillis();
                                dVar.f18997f = jSONObject;
                            }
                        }
                        aVar.b(System.currentTimeMillis());
                    }
                } catch (Throwable unused) {
                }
            }
        };
        a2.a((Runnable) r1);
    }
}
