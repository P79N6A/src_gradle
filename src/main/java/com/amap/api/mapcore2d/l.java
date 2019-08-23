package com.amap.api.mapcore2d;

import java.util.ArrayList;
import java.util.Iterator;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f6246a = new l();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f6247b = new ArrayList<>();

    public interface a {
        void v();
    }

    public static l a() {
        return f6246a;
    }

    l() {
    }

    public void b() {
        Iterator<a> it2 = this.f6247b.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next != null) {
                next.v();
            }
        }
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f6247b.add(aVar);
        }
    }

    public void b(a aVar) {
        if (aVar != null) {
            this.f6247b.remove(aVar);
        }
    }
}
