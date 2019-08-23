package com.bytedance.frameworks.core.a;

import android.text.TextUtils;
import com.bytedance.frameworks.core.a.b.a;
import com.bytedance.frameworks.core.a.b.b;
import com.bytedance.frameworks.core.a.b.c;
import com.bytedance.frameworks.core.a.b.d;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    final HashMap<String, a> f19953a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    final HashMap<String, com.bytedance.frameworks.core.a.b.f> f19954b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedList<d> f19955c = new LinkedList<>();

    /* renamed from: d  reason: collision with root package name */
    private c f19956d;

    /* renamed from: e  reason: collision with root package name */
    private int f19957e = 120;

    /* renamed from: f  reason: collision with root package name */
    private final int f19958f = 5;
    private long g = 0;
    private final int h = 120000;
    private e i;

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (!this.f19953a.isEmpty()) {
                Iterator<Map.Entry<String, a>> it2 = this.f19953a.entrySet().iterator();
                while (it2.hasNext()) {
                    a aVar = (a) it2.next().getValue();
                    if (currentTimeMillis - aVar.f19892d > ((long) this.f19957e)) {
                        it2.remove();
                        JSONObject a2 = a("count", aVar, null);
                        if (a2 != null) {
                            a("count", aVar.f19894f, a2.toString(), aVar.f19893e);
                        }
                    }
                }
            }
            if (!this.f19954b.isEmpty()) {
                Iterator<Map.Entry<String, com.bytedance.frameworks.core.a.b.f>> it3 = this.f19954b.entrySet().iterator();
                while (it3.hasNext()) {
                    com.bytedance.frameworks.core.a.b.f fVar = (com.bytedance.frameworks.core.a.b.f) it3.next().getValue();
                    if (currentTimeMillis - fVar.f19917e > ((long) this.f19957e)) {
                        it3.remove();
                        JSONObject a3 = a("timer", null, fVar);
                        if (a3 != null) {
                            a("timer", fVar.f19918f, a3.toString(), fVar.g);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void b(d dVar) {
        if (this.f19956d != null) {
            try {
                this.f19956d.a(dVar);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(d dVar) {
        if (this.f19955c.size() >= 2000) {
            this.f19955c.poll();
        }
        this.f19955c.add(dVar);
    }

    /* access modifiers changed from: protected */
    public final void a(b bVar) {
        if (bVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log_type", "debug_real");
                jSONObject.put("value", bVar.f19895a);
                jSONObject.put("trace_code", bVar.f19896b);
                a("debug_real", "", jSONObject.toString(), true);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void b(c cVar) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", cVar.f19897a);
                jSONObject.put("key", cVar.f19899c);
                jSONObject.put("value", (double) cVar.f19900d);
                a("timer", "", jSONObject.toString(), cVar.f19901e);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar) {
        if (cVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", cVar.f19897a);
                jSONObject.put("key", cVar.f19899c);
                jSONObject.put("value", (double) cVar.f19900d);
                a("count", cVar.f19898b, jSONObject.toString(), cVar.f19901e);
            } catch (Exception unused) {
            }
        }
    }

    public final boolean a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        int size = this.f19955c.size();
        if (size <= 0 || (!z && size < 5 && currentTimeMillis - this.g <= 120000)) {
            return false;
        }
        this.g = currentTimeMillis;
        LinkedList linkedList = new LinkedList(this.f19955c);
        this.f19955c.clear();
        try {
            this.f19956d.a((List) linkedList);
        } catch (Exception unused) {
        }
        return true;
    }

    public f(c cVar, e eVar) {
        this.f19956d = cVar;
        this.i = eVar;
    }

    private static JSONObject a(String str, a aVar, com.bytedance.frameworks.core.a.b.f fVar) {
        JSONObject jSONObject = new JSONObject();
        if ("count".equals(str)) {
            try {
                jSONObject.put("type", aVar.f19890b);
                jSONObject.put("key", aVar.f19889a);
                jSONObject.put("value", (double) aVar.f19891c);
                return jSONObject;
            } catch (Exception unused) {
                return null;
            }
        } else if (!"timer".equals(str)) {
            return null;
        } else {
            try {
                jSONObject.put("type", fVar.f19914b);
                jSONObject.put("key", fVar.f19913a);
                jSONObject.put("value", (double) (fVar.f19916d / ((float) fVar.f19915c)));
                return jSONObject;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, String str3, boolean z) {
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str)) {
            a(new d().a(str).b(str2).c(str3).a(z).b(System.currentTimeMillis() / 1000).a(this.i.f19949a));
        }
    }
}
