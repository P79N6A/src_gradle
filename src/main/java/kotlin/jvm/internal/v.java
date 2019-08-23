package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KProperty;
import kotlin.reflect.b;

public abstract class v extends l implements KProperty {
    public v() {
    }

    /* access modifiers changed from: protected */
    @SinceKotlin
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    @SinceKotlin
    public boolean isConst() {
        return getReflected().isConst();
    }

    @SinceKotlin
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @SinceKotlin
    public v(Object obj) {
        super(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (!getOwner().equals(vVar.getOwner()) || !getName().equals(vVar.getName()) || !getSignature().equals(vVar.getSignature()) || !Intrinsics.areEqual(getBoundReceiver(), vVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof KProperty) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }
}
