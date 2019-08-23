package com.amap.api.mapcore2d;

import java.util.ArrayList;
import java.util.Iterator;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static n f6251a = new n();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<a> f6252b = new ArrayList<>();

    public interface a {
        void t();
    }

    public static n a() {
        return f6251a;
    }

    n() {
    }

    public synchronized void b() {
        Iterator<a> it2 = this.f6252b.iterator();
        while (it2.hasNext()) {
            a next = it2.next();
            if (next != null) {
                next.t();
            }
        }
    }

    public synchronized void a(a aVar) {
        if (aVar != null) {
            this.f6252b.add(aVar);
        }
    }

    public synchronized void b(a aVar) {
        if (aVar != null) {
            this.f6252b.remove(aVar);
        }
    }
}
