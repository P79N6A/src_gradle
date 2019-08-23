package com.meizu.cloud.pushsdk.base.a;

import com.meizu.cloud.pushsdk.base.h;
import java.lang.reflect.Constructor;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f27040a = "ReflectConstructor";

    /* renamed from: b  reason: collision with root package name */
    private a f27041b;

    /* renamed from: c  reason: collision with root package name */
    private Class<?>[] f27042c;

    b(a aVar, Class<?>... clsArr) {
        this.f27041b = aVar;
        this.f27042c = clsArr;
    }

    public <T> d<T> a(Object... objArr) {
        d<T> dVar = new d<>();
        try {
            Constructor<?> declaredConstructor = this.f27041b.a().getDeclaredConstructor(this.f27042c);
            declaredConstructor.setAccessible(true);
            dVar.f27049b = declaredConstructor.newInstance(objArr);
            dVar.f27048a = true;
        } catch (Exception e2) {
            h.b().a(this.f27040a, "newInstance", e2);
        }
        return dVar;
    }
}
