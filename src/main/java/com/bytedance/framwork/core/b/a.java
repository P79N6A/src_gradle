package com.bytedance.framwork.core.b;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<j> f20136a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList<b> f20137b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private int f20138c = 200;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20139d;

    public final void a(final h hVar) {
        if (!this.f20139d) {
            this.f20139d = true;
            com.bytedance.framwork.core.a.d.a.a().a((Runnable) new Runnable() {
                public final void run() {
                    LinkedList linkedList;
                    LinkedList linkedList2;
                    try {
                        synchronized (a.this.f20136a) {
                            linkedList = new LinkedList(a.this.f20136a);
                            a.this.f20136a.clear();
                        }
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            j jVar = (j) it2.next();
                            h hVar = hVar;
                            if (jVar != null) {
                                if (!TextUtils.isEmpty(jVar.f20168a)) {
                                    hVar.a(jVar.f20168a, jVar.f20169b, jVar.f20170c, jVar.f20171d, jVar.f20172e, jVar.f20173f, jVar.g);
                                }
                            }
                        }
                        synchronized (a.this.f20137b) {
                            linkedList2 = new LinkedList(a.this.f20137b);
                            a.this.f20137b.clear();
                        }
                        Iterator it3 = linkedList2.iterator();
                        while (it3.hasNext()) {
                            a.a(hVar, (b) it3.next());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public final void a(j jVar) {
        synchronized (this.f20136a) {
            if (this.f20136a.size() > this.f20138c) {
                this.f20136a.poll();
            }
            this.f20136a.add(jVar);
        }
    }

    public static void a(h hVar, b bVar) {
        if (bVar != null) {
            String str = bVar.f20142a;
            JSONObject jSONObject = bVar.f20143b;
            long j = bVar.f20144c;
            try {
                jSONObject.put("log_type", str);
                jSONObject.put("network_type", hVar.j());
                if (!TextUtils.isEmpty(hVar.k())) {
                    jSONObject.put("session_id", hVar.k());
                }
                if (jSONObject.isNull("timestamp")) {
                    jSONObject.put("timestamp", j);
                }
                if (hVar.f20150c != null) {
                    boolean z = false;
                    if (hVar.f20153f != null) {
                        if (!TextUtils.isEmpty(str)) {
                            if (hVar.f20153f.opt(str) != null) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        hVar.f20150c.a("common_log", "common_log", jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
