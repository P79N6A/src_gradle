package com.taobao.applink.g;

import com.taobao.applink.h.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static d f79197a;

    public static synchronized d a() {
        d dVar;
        synchronized (a.class) {
            dVar = f79197a;
        }
        return dVar;
    }

    public static synchronized void a(d dVar) {
        synchronized (a.class) {
            f79197a = dVar;
        }
    }
}
