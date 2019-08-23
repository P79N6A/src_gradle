package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.b;
import kotlin.reflect.i;

public abstract class l implements Serializable, b {
    @SinceKotlin
    public static final Object NO_RECEIVER = a.INSTANCE;
    @SinceKotlin
    protected final Object receiver;
    private transient b reflected;

    @SinceKotlin
    static class a implements Serializable {
        public static final a INSTANCE = new a();

        private a() {
        }

        private Object readResolve() throws ObjectStreamException {
            return INSTANCE;
        }
    }

    /* access modifiers changed from: protected */
    public abstract b computeReflected();

    @SinceKotlin
    public Object getBoundReceiver() {
        return this.receiver;
    }

    public l() {
        this(NO_RECEIVER);
    }

    public String getName() {
        throw new AbstractMethodError();
    }

    public KDeclarationContainer getOwner() {
        throw new AbstractMethodError();
    }

    public String getSignature() {
        throw new AbstractMethodError();
    }

    @SinceKotlin
    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    @SinceKotlin
    public b getReflected() {
        b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new kotlin.jvm.b();
    }

    public i getReturnType() {
        return getReflected().getReturnType();
    }

    @SinceKotlin
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @SinceKotlin
    public kotlin.reflect.l getVisibility() {
        return getReflected().getVisibility();
    }

    @SinceKotlin
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @SinceKotlin
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @SinceKotlin
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @SinceKotlin
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @SinceKotlin
    protected l(Object obj) {
        this.receiver = obj;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }
}
