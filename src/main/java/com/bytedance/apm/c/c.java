package com.bytedance.apm.c;

import android.text.TextUtils;
import com.bytedance.apm.core.b;
import com.bytedance.apm.k.p;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f1930a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f1931b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f1932c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1933d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1934e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1935f;
    public final JSONObject g;
    public final b h;
    public final IHttpService i;
    public final Set<g> j;
    public final long k;
    public final com.bytedance.apm.g.b l;
    public final com.bytedance.apm.g.a m;
    public final ExecutorService n;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1936a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1937b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1938c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f1939d = com.bytedance.apm.constant.a.f18935a;

        /* renamed from: e  reason: collision with root package name */
        List<String> f1940e = com.bytedance.apm.constant.a.f18938d;

        /* renamed from: f  reason: collision with root package name */
        List<String> f1941f = com.bytedance.apm.constant.a.g;
        final JSONObject g = new JSONObject();
        public b h;
        public IHttpService i;
        public final Set<g> j = new HashSet();
        public long k = 10;
        public com.bytedance.apm.g.b l;
        com.bytedance.apm.g.a m;
        ExecutorService n;

        public final c a() {
            if (!TextUtils.isEmpty(this.g.optString("aid"))) {
                p.a(this.g.optString("app_version"));
                p.a(this.g.optString("update_version_code"));
                p.a(this.g.optString("device_id"));
                return new c(this, (byte) 0);
            }
            throw new IllegalArgumentException("aid" + " must not be empty");
        }

        public final a a(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2 = this.g;
                if (jSONObject2 != null) {
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        if (keys != null) {
                            while (keys.hasNext()) {
                                String next = keys.next();
                                if (!jSONObject.isNull(next)) {
                                    jSONObject2.put(next, jSONObject.opt(next));
                                }
                            }
                        }
                    }
                }
                return this;
            } catch (JSONException unused) {
                return this;
            }
        }

        public final a a(String str, int i2) {
            try {
                this.g.put(str, i2);
            } catch (JSONException unused) {
            }
            return this;
        }

        public final a a(String str, String str2) {
            try {
                this.g.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private c(a aVar) {
        this.g = aVar.g;
        this.h = aVar.h;
        this.f1930a = aVar.f1939d;
        this.i = aVar.i;
        this.f1933d = aVar.f1938c;
        this.f1934e = aVar.f1936a;
        this.j = aVar.j;
        this.f1931b = aVar.f1940e;
        this.f1932c = aVar.f1941f;
        this.k = aVar.k;
        this.f1935f = aVar.f1937b;
        this.m = aVar.m;
        this.l = aVar.l;
        this.n = aVar.n;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
