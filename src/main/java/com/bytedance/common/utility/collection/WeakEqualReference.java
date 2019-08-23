package com.bytedance.common.utility.collection;

import java.lang.ref.WeakReference;

public class WeakEqualReference<T> extends WeakReference<T> {
    int hash;

    public int hashCode() {
        return this.hash;
    }

    public WeakEqualReference(T t) {
        super(t);
        int i;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        this.hash = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WeakEqualReference)) {
            return false;
        }
        Object obj2 = super.get();
        Object obj3 = ((WeakEqualReference) obj).get();
        if (obj2 != null) {
            return obj2.equals(obj3);
        }
        if (obj2 == obj3) {
            return true;
        }
        return false;
    }
}
