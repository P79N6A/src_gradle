package com.amap.api.mapcore2d;

import java.util.ArrayList;
import java.util.Iterator;

public class bm {

    /* renamed from: a  reason: collision with root package name */
    private static bm f5763a = new bm();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f5764b = new ArrayList<>();

    public interface a {
        void u();
    }

    public static bm a() {
        return f5763a;
    }

    bm() {
    }

    public synchronized void b() {
        Iterator<a> it2 = this.f5764b.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next != null) {
                next.u();
            }
        }
    }

    public synchronized void a(a aVar) {
        if (aVar != null) {
            this.f5764b.remove(aVar);
        }
    }
}
