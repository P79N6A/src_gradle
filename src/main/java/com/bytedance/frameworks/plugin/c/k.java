package com.bytedance.frameworks.plugin.c;

import java.util.ArrayList;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f2180b;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<j> f2181a = new ArrayList<>();

    private k() {
    }

    public static k a() {
        if (f2180b == null) {
            synchronized (k.class) {
                if (f2180b == null) {
                    f2180b = new k();
                }
            }
        }
        return f2180b;
    }

    public void a(j jVar) throws Throwable {
        jVar.a();
        synchronized (this.f2181a) {
            this.f2181a.add(jVar);
        }
    }
}
