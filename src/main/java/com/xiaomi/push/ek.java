package com.xiaomi.push;

public class ek {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ek f81983a;

    /* renamed from: a  reason: collision with other field name */
    private ej f316a;

    public static ek a() {
        if (f81983a == null) {
            synchronized (ek.class) {
                try {
                    if (f81983a == null) {
                        f81983a = new ek();
                    }
                } catch (Throwable th) {
                    Class<ek> cls = ek.class;
                    throw th;
                }
            }
        }
        return f81983a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ej m202a() {
        return this.f316a;
    }

    public void a(ej ejVar) {
        this.f316a = ejVar;
    }
}
