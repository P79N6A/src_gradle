package com.bytedance.im.core.d;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class q {
    private static q g;

    /* renamed from: a  reason: collision with root package name */
    public int f21307a;

    /* renamed from: b  reason: collision with root package name */
    public long f21308b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21309c = true;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, b> f21310d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public List<n> f21311e;

    /* renamed from: f  reason: collision with root package name */
    public Set<Object> f21312f = new HashSet();

    private q() {
    }

    public static q a() {
        if (g == null) {
            synchronized (q.class) {
                if (g == null) {
                    g = new q();
                }
            }
        }
        return g;
    }

    public final void a(int i) {
        if (i != this.f21307a && i >= 0) {
            this.f21307a = i;
            Iterator<Object> it2 = this.f21312f.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
