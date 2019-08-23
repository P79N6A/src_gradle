package com.bytedance.apm.d;

import android.app.Activity;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.bytedance.apm.f.e;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.h;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d implements b.C0006b, c.a, com.bytedance.services.apm.api.c, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f1975a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1976b;

    /* renamed from: c  reason: collision with root package name */
    public long f1977c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.frameworks.core.apm.a f1978d;

    /* renamed from: e  reason: collision with root package name */
    private final LinkedList<e> f1979e;

    /* renamed from: f  reason: collision with root package name */
    private long f1980f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private long k;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1982a = new d((byte) 0);
    }

    public final void b(Activity activity) {
    }

    public final void c(Activity activity) {
    }

    public final void d(Activity activity) {
    }

    public static d a() {
        return a.f1982a;
    }

    public final int b() {
        return this.i;
    }

    public final int c() {
        return this.j;
    }

    public final void onReady() {
        c.f2137b = this;
        b.a().a((b.C0006b) this);
    }

    private d() {
        this.f1979e = new LinkedList<>();
        this.g = true;
        this.f1978d = com.bytedance.frameworks.core.apm.a.a();
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    @WorkerThread
    private static void b(e eVar) {
        com.bytedance.frameworks.core.apm.b.a().a(eVar);
    }

    public final void a(Activity activity) {
        b.a().a((Runnable) new Runnable() {
            public final void run() {
                d.this.a(true);
            }
        });
    }

    private void a(e eVar) {
        synchronized (this.f1979e) {
            if (this.f1979e.size() >= 2000) {
                this.f1979e.poll();
            }
            this.f1979e.add(eVar);
        }
    }

    private static void a(LinkedList<? extends e> linkedList) {
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            if (eVar != null) {
                if (eVar instanceof com.bytedance.apm.f.a) {
                    linkedList3.add((com.bytedance.apm.f.a) eVar);
                } else {
                    linkedList2.add(eVar);
                }
            }
        }
        if (!i.a((List<?>) linkedList2)) {
            com.bytedance.frameworks.core.apm.b.a().f2131b.b(linkedList2);
            if (com.bytedance.apm.c.d()) {
                a("savedb_default", linkedList2);
            }
        }
        if (!i.a((List<?>) linkedList3)) {
            com.bytedance.frameworks.core.apm.b.a().f2132c.b(linkedList3);
            if (com.bytedance.apm.c.d()) {
                a("savedb_api", linkedList3);
            }
        }
    }

    public final void a(long j2) {
        a(false);
        if (this.g) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.k >= 1200000) {
                this.k = currentTimeMillis;
                if (Environment.getDataDirectory().getFreeSpace() < this.h * 1024 * 1024) {
                    this.g = false;
                    com.bytedance.frameworks.core.apm.b a2 = com.bytedance.frameworks.core.apm.b.a();
                    Date date = new Date();
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(date);
                    instance.add(5, -5);
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    long timeInMillis = instance.getTimeInMillis();
                    a2.f2131b.a(timeInMillis);
                    a2.f2132c.a(timeInMillis);
                }
            }
        }
    }

    public final void a(boolean z) {
        LinkedList linkedList;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f1976b || currentTimeMillis - this.f1977c >= 60000) {
            int size = this.f1979e.size();
            if (size != 0) {
                if (z || size >= 5 || currentTimeMillis - this.f1980f > 120000) {
                    this.f1980f = currentTimeMillis;
                    synchronized (this.f1979e) {
                        linkedList = new LinkedList(this.f1979e);
                        this.f1979e.clear();
                    }
                    a(linkedList);
                }
            }
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        this.g = jSONObject.optBoolean("local_monitor_switch", true);
        this.h = jSONObject.optLong("local_monitor_min_free_disk_mb", 150);
        this.i = jSONObject.optInt("log_reserve_days", 7);
        this.j = jSONObject.optInt("log_max_size_mb", 100);
    }

    private static void a(String str, LinkedList<? extends e> linkedList) {
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < linkedList.size(); i2++) {
            jSONArray.put(((e) linkedList.get(i2)).i);
        }
        com.bytedance.apm.h.c.a(com.bytedance.apm.h.a.i, str, jSONArray.toString());
    }

    @WorkerThread
    private void a(String str, String str2, JSONObject jSONObject, boolean z) {
        if (!h.b(jSONObject) && !TextUtils.isEmpty(str)) {
            a(e.c(str).b(str2).a(jSONObject).a(z).b(System.currentTimeMillis()).a(this.f1978d.f2116a));
        }
    }

    public final void a(@NonNull String str, String str2, @NonNull JSONObject jSONObject, boolean z, boolean z2) {
        if (com.bytedance.apm.c.d()) {
            com.bytedance.apm.h.c.a(com.bytedance.apm.h.a.i, "logType", str, "subType", str2, "data", jSONObject, "sample", Boolean.valueOf(z));
        }
        if (!this.f1975a) {
            if (!z && !this.g) {
                return;
            }
            if (z2) {
                b(e.c(str).b(str2).a(jSONObject).a(z).b(jSONObject.optLong("timestamp", 0)));
                return;
            }
            a(str, str2, jSONObject, z);
        }
    }
}
