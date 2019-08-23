package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;
import kotlin.reflect.b;

public abstract class MutablePropertyReference1 extends r implements KMutableProperty1 {
    public MutablePropertyReference1() {
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return Reflection.mutableProperty1(this);
    }

    public KProperty1.a getGetter() {
        return ((KMutableProperty1) getReflected()).getGetter();
    }

    public KMutableProperty1.a getSetter() {
        return ((KMutableProperty1) getReflected()).getSetter();
    }

    @SinceKotlin
    public MutablePropertyReference1(Object obj) {
        super(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) getReflected()).getDelegate(obj);
    }
}
