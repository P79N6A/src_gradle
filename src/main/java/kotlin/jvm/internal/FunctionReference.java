package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.b;
import kotlin.reflect.d;

public class FunctionReference extends l implements q, d {
    private final int arity;

    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    @SinceKotlin
    public b computeReflected() {
        return Reflection.function(this);
    }

    /* access modifiers changed from: protected */
    @SinceKotlin
    public d getReflected() {
        return (d) super.getReflected();
    }

    @SinceKotlin
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @SinceKotlin
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @SinceKotlin
    public boolean isInline() {
        return getReflected().isInline();
    }

    @SinceKotlin
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @SinceKotlin
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int i;
        if (getOwner() == null) {
            i = 0;
        } else {
            i = getOwner().hashCode() * 31;
        }
        return ((i + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i) {
        this.arity = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            if (getOwner() != null ? getOwner().equals(functionReference.getOwner()) : functionReference.getOwner() == null) {
                if (!getName().equals(functionReference.getName()) || !getSignature().equals(functionReference.getSignature()) || !Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver())) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (obj instanceof d) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    @SinceKotlin
    public FunctionReference(int i, Object obj) {
        super(obj);
        this.arity = i;
    }
}
