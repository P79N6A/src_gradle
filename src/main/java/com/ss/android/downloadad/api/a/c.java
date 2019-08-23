package com.ss.android.downloadad.api.a;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.c.b;
import com.ss.android.download.api.c.g;
import com.ss.android.ugc.aweme.app.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class c implements com.ss.android.download.api.b.c {

    /* renamed from: a  reason: collision with root package name */
    public long f28638a;

    /* renamed from: b  reason: collision with root package name */
    private long f28639b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28640c;

    /* renamed from: d  reason: collision with root package name */
    private int f28641d;

    /* renamed from: e  reason: collision with root package name */
    private String f28642e;

    /* renamed from: f  reason: collision with root package name */
    private String f28643f;
    private String g;
    private b h;
    private List<String> i;
    private JSONObject j;
    private String k;
    private String l;
    private String m;
    private Map<String, String> n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private String s;
    private String t;
    private int u;
    private String v;
    private g w;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f28644a;

        /* renamed from: b  reason: collision with root package name */
        public long f28645b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28646c = true;

        /* renamed from: d  reason: collision with root package name */
        public int f28647d;

        /* renamed from: e  reason: collision with root package name */
        public String f28648e;

        /* renamed from: f  reason: collision with root package name */
        public String f28649f;
        public String g;
        public b h;
        public List<String> i;
        public JSONObject j;
        public String k;
        public String l;
        public String m;
        public Map<String, String> n;
        public boolean o = true;
        public boolean p = true;
        public boolean q;
        public boolean r = true;
        public String s;
        public String t;
        public int u;
        public String v;
        public g w;

        public final c a() {
            return new c(this, (byte) 0);
        }

        public final a a(int i2) {
            this.f28647d = i2;
            return this;
        }

        public final a b(long j2) {
            this.f28645b = j2;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a d(String str) {
            this.k = str;
            return this;
        }

        public final a e(String str) {
            this.l = str;
            return this;
        }

        public final a f(String str) {
            this.m = str;
            return this;
        }

        public final a a(long j2) {
            this.f28644a = j2;
            return this;
        }

        public final a b(String str) {
            this.f28649f = str;
            return this;
        }

        public final a a(b bVar) {
            this.h = bVar;
            return this;
        }

        public final a b(boolean z) {
            this.o = z;
            return this;
        }

        public final a a(String str) {
            this.f28648e = str;
            return this;
        }

        public final a a(List<String> list) {
            this.i = list;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.n = map;
            return this;
        }

        public final a a(JSONObject jSONObject) {
            this.j = jSONObject;
            return this;
        }

        public final a a(boolean z) {
            this.f28646c = z;
            return this;
        }
    }

    public final String a() {
        return this.k;
    }

    public final long b() {
        return this.f28639b;
    }

    public final long c() {
        return this.f28638a;
    }

    public final String d() {
        return this.l;
    }

    public final String e() {
        return this.m;
    }

    public final Map<String, String> f() {
        return this.n;
    }

    public final boolean g() {
        return this.o;
    }

    public final boolean h() {
        return this.p;
    }

    public final boolean i() {
        return this.q;
    }

    public final boolean j() {
        return this.r;
    }

    public final String k() {
        return this.s;
    }

    public final String l() {
        return this.t;
    }

    public final int m() {
        return this.u;
    }

    public final String n() {
        return this.v;
    }

    public final boolean o() {
        return this.f28640c;
    }

    public final String p() {
        return this.f28642e;
    }

    public final String q() {
        return this.f28643f;
    }

    public final b r() {
        return this.h;
    }

    public final List<String> s() {
        return this.i;
    }

    public final JSONObject t() {
        return this.j;
    }

    public final int u() {
        return this.f28641d;
    }

    public final g v() {
        return this.w;
    }

    public final JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ad_id", this.f28639b);
            jSONObject.put("model_type", this.f28641d);
            jSONObject.put("ext_value", this.f28638a);
            jSONObject.put("log_extra", this.f28642e);
            jSONObject.put("package_name", this.f28643f);
            jSONObject.put("download_url", this.k);
            jSONObject.put("app_name", this.l);
            jSONObject.put("show_toast", this.o ? 1 : 0);
            jSONObject.put("show_notification", this.p ? 1 : 0);
            jSONObject.put("need_wifi", this.q ? 1 : 0);
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("app_icon", this.g);
            }
            if (this.h != null && !TextUtils.isEmpty(this.h.f28464d)) {
                jSONObject.put(f.f34168b, this.h.f28464d);
            }
            if (!TextUtils.isEmpty(this.m)) {
                jSONObject.put("mime_type", this.m);
            }
            if (this.i != null && !this.i.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.i) {
                    jSONArray.put(put);
                }
                jSONObject.put("click_track_url", jSONArray);
            }
            if (this.j != null) {
                jSONObject.put(PushConstants.EXTRA, this.j);
            }
            if (this.n != null && !this.n.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                JSONArray jSONArray3 = new JSONArray();
                for (Map.Entry next : this.n.entrySet()) {
                    jSONArray2.put(next.getKey());
                    jSONArray3.put(next.getKey());
                }
                jSONObject.put("header_keys", jSONArray2);
                jSONObject.put("header_values", jSONArray3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private c(a aVar) {
        this.f28639b = aVar.f28644a;
        this.f28638a = aVar.f28645b;
        this.f28640c = aVar.f28646c;
        this.f28641d = aVar.f28647d;
        this.f28642e = aVar.f28648e;
        this.f28643f = aVar.f28649f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    public static c a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        if (jSONObject == null) {
            return null;
        }
        a aVar = new a();
        try {
            a f2 = aVar.a(com.ss.android.download.api.d.a.a(jSONObject, "ad_id")).a(jSONObject.optInt("model_type")).b(com.ss.android.download.api.d.a.a(jSONObject, "ext_value")).a(jSONObject.optString("log_extra")).b(jSONObject.optString("package_name")).d(jSONObject.optString("download_url")).e(jSONObject.optString("app_name")).c(jSONObject.optString("app_icon")).a(new b(jSONObject.optString(f.f34168b), "", "")).f(jSONObject.optString("mime_type"));
            boolean z3 = true;
            if (jSONObject.optInt("show_toast") == 1) {
                z = true;
            } else {
                z = false;
            }
            a b2 = f2.b(z);
            if (jSONObject.optInt("show_notification") == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            b2.p = z2;
            if (jSONObject.optInt("need_wifi") != 1) {
                z3 = false;
            }
            b2.q = z3;
            b2.a(jSONObject.optJSONObject(PushConstants.EXTRA));
            JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
                aVar.a((List<String>) arrayList);
            }
            a(jSONObject, aVar);
            return aVar.a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }

    private static void a(JSONObject jSONObject, a aVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray("header_keys");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("header_values");
        if (optJSONArray != null && optJSONArray2 != null) {
            HashMap hashMap = new HashMap();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                hashMap.put(optJSONArray.optString(i2), optJSONArray2.optString(i2));
            }
            aVar.a((Map<String, String>) hashMap);
        }
    }
}
