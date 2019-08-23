package com.bytedance.b.a.a.e;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.b.a.a.f.a;
import com.bytedance.b.a.a.g.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    a f19188c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.b.a.a.b.a f19189d;

    /* renamed from: e  reason: collision with root package name */
    Context f19190e;

    /* renamed from: f  reason: collision with root package name */
    public int f19191f;
    public List<Integer> g;
    d h;
    com.bytedance.b.a.a.a.b i;
    com.bytedance.b.a.a.a.a j;
    Handler k;
    List<com.bytedance.b.a.a.f.b> l;
    Map<String, Boolean> m = new HashMap();
    long n;
    int o;
    int p;
    int q;
    public int r;
    public int s;
    a.C0147a t;

    public abstract void a();

    public abstract void a(List<com.bytedance.b.a.a.f.b> list);

    public abstract void a(boolean z);

    public abstract void b();

    public abstract void c();

    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract String e();

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.f19188c.p == a.b.ANCHOR) {
            Iterator<Integer> it2 = this.g.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i2) {
                    it2.remove();
                }
            }
            this.g.add(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.m.remove(String.valueOf(i2));
        if (this.f19188c.p == a.b.ANCHOR) {
            Iterator<Integer> it2 = this.g.iterator();
            while (it2.hasNext()) {
                if (it2.next().intValue() == i2) {
                    it2.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String b(List<com.bytedance.b.a.a.f.b> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ver", this.f19188c.x);
            jSONObject.put("vendor", e());
            jSONObject.put("timestamp", System.currentTimeMillis());
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.b.a.a.f.b next : list) {
                if (next.j) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", next.f19205a);
                    int i2 = 1;
                    jSONObject2.put("alpha", 1);
                    jSONObject2.put("w", next.f19210f);
                    jSONObject2.put("h", next.g);
                    jSONObject2.put("x", next.f19208d);
                    jSONObject2.put("y", next.f19209e);
                    jSONObject2.put("account", next.f19207c);
                    jSONObject2.put("uid", next.f19206b);
                    jSONObject2.put("zorder", 0);
                    jSONObject2.put("stat", next.h);
                    String valueOf = String.valueOf(next.f19206b);
                    if (!this.m.containsKey(valueOf) || !this.m.get(valueOf).booleanValue()) {
                        i2 = 0;
                    }
                    jSONObject2.put("talk", i2);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("grids", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", this.r);
            jSONObject3.put("height", this.s);
            jSONObject3.put("background", this.f19188c.r);
            jSONObject.put("canvas", jSONObject3);
            this.l = list;
            return jSONObject.toString();
        } catch (JSONException e2) {
            com.bytedance.b.a.a.b.a aVar = this.f19189d;
            aVar.a("create sei failed: " + e2.toString());
            return null;
        }
    }

    b(a aVar, d dVar, com.bytedance.b.a.a.a.b bVar, com.bytedance.b.a.a.b.a aVar2) {
        this.f19188c = aVar;
        this.h = dVar;
        this.i = bVar;
        this.f19190e = aVar.f19193a;
        this.f19189d = aVar2;
        this.o = aVar.v;
        if (aVar.p == a.b.ANCHOR) {
            this.f19191f = aVar.f19197e;
        }
        this.g = new ArrayList();
        this.k = new Handler(Looper.getMainLooper());
        this.r = this.f19188c.f19195c.f19204f;
        this.s = this.f19188c.f19195c.g;
        this.p = this.f19188c.f19195c.h;
        this.q = this.f19188c.f19195c.i;
        this.t = this.f19188c.o;
    }
}
