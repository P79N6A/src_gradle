package com.tencent.a.a.a.a;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static g f79218c;

    /* renamed from: a  reason: collision with root package name */
    private Map<Integer, f> f79219a = new HashMap(3);

    /* renamed from: b  reason: collision with root package name */
    private Context f79220b;

    private g(Context context) {
        this.f79220b = context.getApplicationContext();
        this.f79219a.put(1, new e(context));
        this.f79219a.put(2, new b(context));
        this.f79219a.put(4, new d(context));
    }

    private c a(List<Integer> list) {
        if (list.size() >= 0) {
            for (Integer num : list) {
                f fVar = this.f79219a.get(num);
                if (fVar != null) {
                    c c2 = fVar.c();
                    if (c2 != null && h.b(c2.f79215c)) {
                        return c2;
                    }
                }
            }
        }
        return new c();
    }

    public static synchronized g a(Context context) {
        g gVar;
        synchronized (g.class) {
            if (f79218c == null) {
                f79218c = new g(context);
            }
            gVar = f79218c;
        }
        return gVar;
    }

    public final c a() {
        return a((List<Integer>) new ArrayList<Integer>(Arrays.asList(new Integer[]{1, 2, 4})));
    }

    public final void a(String str) {
        c a2 = a();
        a2.f79215c = str;
        if (!h.a(a2.f79213a)) {
            a2.f79213a = h.a(this.f79220b);
        }
        if (!h.a(a2.f79214b)) {
            a2.f79214b = h.b(this.f79220b);
        }
        a2.f79216d = System.currentTimeMillis();
        for (Map.Entry<Integer, f> value : this.f79219a.entrySet()) {
            ((f) value.getValue()).a(a2);
        }
    }
}
