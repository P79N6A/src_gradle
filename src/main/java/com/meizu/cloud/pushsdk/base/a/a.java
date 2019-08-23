package com.meizu.cloud.pushsdk.base.a;

import java.util.HashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Class<?>> f27036a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private Class<?> f27037b;

    /* renamed from: c  reason: collision with root package name */
    private String f27038c;

    /* renamed from: d  reason: collision with root package name */
    private Object f27039d;

    private a(Object obj) {
        this.f27039d = obj;
    }

    private a(String str) {
        this.f27038c = str;
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    public static a a(String str) {
        return new a(str);
    }

    public b a(Class<?>... clsArr) {
        return new b(this, clsArr);
    }

    public c a(String str, Class<?>... clsArr) {
        return new c(this, str, clsArr);
    }

    /* access modifiers changed from: package-private */
    public Class<?> a() throws ClassNotFoundException {
        if (this.f27037b != null) {
            return this.f27037b;
        }
        if (this.f27039d != null) {
            return this.f27039d.getClass();
        }
        Class<?> cls = f27036a.get(this.f27038c);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(this.f27038c);
        f27036a.put(this.f27038c, cls2);
        return cls2;
    }
}
