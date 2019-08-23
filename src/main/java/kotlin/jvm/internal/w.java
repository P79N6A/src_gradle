package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.h;

public abstract class w extends v implements h {
    public h.a getGetter() {
        return ((h) getReflected()).getGetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return a();
    }

    @SinceKotlin
    public Object getDelegate(Object obj, Object obj2) {
        return ((h) getReflected()).getDelegate(obj, obj2);
    }
}
