package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    private static final List<j> f84123d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    Object f84124a;

    /* renamed from: b  reason: collision with root package name */
    p f84125b;

    /* renamed from: c  reason: collision with root package name */
    j f84126c;

    static void a(j jVar) {
        jVar.f84124a = null;
        jVar.f84125b = null;
        jVar.f84126c = null;
        synchronized (f84123d) {
            if (f84123d.size() < 10000) {
                f84123d.add(jVar);
            }
        }
    }

    private j(Object obj, p pVar) {
        this.f84124a = obj;
        this.f84125b = pVar;
    }

    static j a(p pVar, Object obj) {
        synchronized (f84123d) {
            int size = f84123d.size();
            if (size <= 0) {
                return new j(obj, pVar);
            }
            j remove = f84123d.remove(size - 1);
            remove.f84124a = obj;
            remove.f84125b = pVar;
            remove.f84126c = null;
            return remove;
        }
    }
}
