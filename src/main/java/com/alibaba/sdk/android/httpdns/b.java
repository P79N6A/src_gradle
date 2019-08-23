package com.alibaba.sdk.android.httpdns;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.sdk.android.httpdns.a.c;
import com.alibaba.sdk.android.httpdns.a.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f5088a;

    /* renamed from: a  reason: collision with other field name */
    private static b f20a = new b();

    /* renamed from: a  reason: collision with other field name */
    private static ConcurrentMap<String, c> f21a;

    /* renamed from: a  reason: collision with other field name */
    private static ConcurrentSkipListSet<String> f22a;

    private b() {
        f21a = new ConcurrentHashMap();
        f22a = new ConcurrentSkipListSet<>();
        HandlerThread handlerThread = new HandlerThread("DBUpdater");
        handlerThread.start();
        f5088a = new Handler(handlerThread.getLooper());
    }

    static b a() {
        return f20a;
    }

    private boolean a(e eVar) {
        return (System.currentTimeMillis() / 1000) - c.a(eVar.l) > 604800;
    }

    /* access modifiers changed from: private */
    public void b() {
        List<e> a2 = com.alibaba.sdk.android.httpdns.a.b.a();
        String g = com.alibaba.sdk.android.httpdns.a.b.g();
        for (e next : a2) {
            if (a(next)) {
                com.alibaba.sdk.android.httpdns.a.b.b(next);
            } else if (g.equals(next.k)) {
                next.l = String.valueOf(System.currentTimeMillis() / 1000);
                f21a.put(next.j, new c(next));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public int m4a() {
        return f21a.size();
    }

    /* access modifiers changed from: package-private */
    public c a(String str) {
        return (c) f21a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public ArrayList<String> m5a() {
        return new ArrayList<>(f21a.keySet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public void m6a() {
        if (com.alibaba.sdk.android.httpdns.a.b.a() != null) {
            f5088a.post(new Runnable() {
                public void run() {
                    b.this.b();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, c cVar) {
        f21a.put(str, cVar);
        if (com.alibaba.sdk.android.httpdns.a.b.a() != null) {
            e a2 = cVar.a();
            if (a2.f5085a == null || a2.f5085a.size() <= 0) {
                com.alibaba.sdk.android.httpdns.a.b.b(a2);
            } else {
                com.alibaba.sdk.android.httpdns.a.b.a(a2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: collision with other method in class */
    public boolean m7a(String str) {
        return f22a.contains(str);
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        f22a.add(str);
    }

    /* access modifiers changed from: package-private */
    public void c(String str) {
        f22a.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        f21a.clear();
        f22a.clear();
    }
}
