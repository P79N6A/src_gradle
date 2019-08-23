package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.g;
import kotlin.reflect.h;

public abstract class t extends r implements g {
    public h.a getGetter() {
        return ((g) getReflected()).getGetter();
    }

    public g.a getSetter() {
        return ((g) getReflected()).getSetter();
    }

    public Object invoke(Object obj, Object obj2) {
        return a();
    }

    @SinceKotlin
    public Object getDelegate(Object obj, Object obj2) {
        return ((g) getReflected()).getDelegate(obj, obj2);
    }
}
