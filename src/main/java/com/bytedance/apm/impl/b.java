package com.bytedance.apm.impl;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.annotation.WorkerThread;
import com.bytedance.apm.core.c;
import com.bytedance.apm.j.b;
import com.bytedance.apm.k.h;
import com.bytedance.apm.k.j;
import com.bytedance.apm.k.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements b.C0006b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f2017a;

    /* renamed from: b  reason: collision with root package name */
    volatile JSONObject f2018b;

    /* renamed from: c  reason: collision with root package name */
    volatile JSONObject f2019c;

    /* renamed from: d  reason: collision with root package name */
    volatile JSONObject f2020d;

    /* renamed from: e  reason: collision with root package name */
    List<String> f2021e = com.bytedance.apm.constant.a.f18935a;

    /* renamed from: f  reason: collision with root package name */
    SharedPreferences f2022f;
    c g;
    JSONObject h;
    boolean i;
    long j = -1;
    long k = -1;
    List<com.bytedance.services.slardar.config.a> l;
    private volatile boolean m = true;
    private volatile long n = 1200;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f19030a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f19031b = new HashMap();

        private void a() {
            this.f19030a = com.bytedance.framwork.core.monitor.b.a(this.f19030a, (byte[]) null);
        }

        private void b() {
            this.f19031b.put("Content-Type", "application/json; charset=utf-8");
        }

        a(String str) {
            this.f19030a = str;
        }

        private void b(Map<String, String> map) {
            this.f19030a = t.a(this.f19030a, map);
        }

        /* access modifiers changed from: package-private */
        public final a a(Map<String, String> map) throws Exception {
            b(map);
            a();
            b();
            return new a(this.f19030a, this.f19031b);
        }
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.f2022f.getString("monitor_net_config", "");
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (!this.f2017a) {
            this.f2017a = true;
            if (this.l != null) {
                for (com.bytedance.services.slardar.config.a onReady : this.l) {
                    onReady.onReady();
                }
            }
        }
    }

    public final void a(long j2) {
        a(false);
    }

    private boolean b(long j2) {
        if (j2 - this.k > this.n * 1000) {
            return true;
        }
        return false;
    }

    private boolean a(com.bytedance.services.apm.api.b bVar) throws JSONException {
        if (bVar != null && bVar.f2317a == 200) {
            byte[] bArr = bVar.f2318b;
            if (bArr != null) {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                this.i = false;
                this.j = jSONObject.optLong("id");
                this.k = System.currentTimeMillis();
                a(optJSONObject);
                a(optJSONObject, false);
                b();
                b(jSONObject);
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    @SuppressLint({"ApplySharedPref"})
    private void b(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            long optLong = jSONObject.optLong("id");
            String optString = jSONObject.optString("name");
            SharedPreferences.Editor edit = this.f2022f.edit();
            edit.putString("monitor_net_config", optJSONObject.toString());
            edit.putLong("monitor_net_config_id", optLong);
            edit.putString("monitor_net_config_name", optString);
            edit.putLong("monitor_configure_refresh_time", this.k);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        if (!h.b(jSONObject)) {
            this.m = jSONObject.optBoolean("monitor_encrypt_switch", true);
            this.f2018b = jSONObject.optJSONObject("allow_log_type");
            this.f2019c = jSONObject.optJSONObject("allow_metric_type");
            this.f2020d = jSONObject.optJSONObject("allow_service_name");
            this.n = jSONObject.optLong("fetch_setting_interval", 1200);
            if (this.n < 600) {
                this.n = 600;
            }
            this.h = jSONObject;
            com.bytedance.apm.c.a("config_id", this.j);
            com.bytedance.apm.c.a("config_time", this.k);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        boolean z2;
        if (z || b(System.currentTimeMillis())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && j.b(com.bytedance.apm.c.a()) && this.g != null && this.g.a() != null && !this.g.a().isEmpty()) {
            for (String aVar : this.f2021e) {
                try {
                    a a2 = new a(aVar).a(this.g.a());
                    if (a(com.bytedance.apm.c.a(a2.f19027a, a2.f19028b))) {
                        return;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, boolean z) {
        if (this.l != null) {
            for (com.bytedance.services.slardar.config.a onRefresh : this.l) {
                onRefresh.onRefresh(jSONObject, z);
            }
        }
    }
}
