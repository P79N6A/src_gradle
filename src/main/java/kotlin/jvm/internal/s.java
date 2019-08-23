package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty0;
import kotlin.reflect.f;

public abstract class s extends r implements f {
    public s() {
    }

    public Object invoke() {
        return get();
    }

    @SinceKotlin
    public Object getDelegate() {
        return ((f) getReflected()).getDelegate();
    }

    public KProperty0.a getGetter() {
        return ((f) getReflected()).getGetter();
    }

    public f.a getSetter() {
        return ((f) getReflected()).getSetter();
    }

    @SinceKotlin
    public s(Object obj) {
        super(obj);
    }
}
