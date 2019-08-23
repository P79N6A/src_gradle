package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty1;
import kotlin.reflect.b;

public abstract class PropertyReference1 extends v implements KProperty1 {
    public PropertyReference1() {
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return Reflection.property1(this);
    }

    public KProperty1.a getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }

    @SinceKotlin
    public PropertyReference1(Object obj) {
        super(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }
}
