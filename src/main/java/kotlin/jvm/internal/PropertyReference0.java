package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty0;
import kotlin.reflect.b;

public abstract class PropertyReference0 extends v implements KProperty0 {
    public PropertyReference0() {
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return Reflection.property0(this);
    }

    public Object invoke() {
        return get();
    }

    @SinceKotlin
    public Object getDelegate() {
        return ((KProperty0) getReflected()).getDelegate();
    }

    public KProperty0.a getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }

    @SinceKotlin
    public PropertyReference0(Object obj) {
        super(obj);
    }
}
