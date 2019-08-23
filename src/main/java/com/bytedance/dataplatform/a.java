package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19594a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19595b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f19596c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f19597d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f19598e = new ConcurrentHashMap();

    /* renamed from: f  reason: collision with root package name */
    private f f19599f;
    private e g;
    private SharedPreferences h;
    private SharedPreferences i;
    private c j;
    private Context k;
    private Future l;

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (this.l != null) {
            this.l.cancel(true);
        }
        this.l = i.a(new Runnable() {
            public final void run() {
                a.this.a();
            }
        }, 0, 3600000);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean c() {
        boolean z;
        if (!this.i.getAll().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final void a() {
        try {
            JSONObject jSONObject = new JSONObject(this.g.a(this.f19595b));
            if (jSONObject.has("code")) {
                if (jSONObject.has("data")) {
                    if (jSONObject.optInt("code", -1) == 0) {
                        a(jSONObject.getJSONObject("data"));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                jSONObject2.put(next, jSONObject3.get("val"));
                String string = jSONObject3.getString("vid");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(next, string);
                    long j2 = jSONObject3.getLong("et");
                    if (j2 > 0) {
                        hashMap2.put(string, Long.valueOf(j2));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        synchronized (this) {
            this.f19598e.clear();
            this.f19597d = jSONObject2;
            c.a(this.k, "SP_EXPERIMENT_CACHE", 0).edit().putString("SP_EXPERIMENT_CACHE", jSONObject2.toString()).apply();
        }
        this.j.a(hashMap);
    }

    a(Context context, boolean z, String str, boolean z2, f fVar, d dVar, e eVar) {
        this.f19595b = str;
        this.j = new c(context, dVar);
        this.h = c.a(context, "EXPERIMENT_CACHE_LOCAL", 0);
        this.i = c.a(context, "CLIENT_EXPERIMENT_CACHE_TAG", 0);
        this.f19594a = z;
        this.f19599f = fVar;
        this.g = eVar;
        this.k = context;
        try {
            this.f19597d = new JSONObject(c.a(context, "SP_EXPERIMENT_CACHE", 0).getString("SP_EXPERIMENT_CACHE", ""));
        } catch (JSONException unused) {
            this.f19597d = new JSONObject();
        }
        if (z2) {
            this.l = i.a(new Runnable() {
                public final void run() {
                    a.this.a();
                }
            }, 2000, 3600000);
        }
    }
}
