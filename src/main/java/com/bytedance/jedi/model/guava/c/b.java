package com.bytedance.jedi.model.guava.c;

import com.bytedance.jedi.model.guava.a.c;
import com.bytedance.jedi.model.guava.annotations.CanIgnoreReturnValue;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Iterator;

@GwtCompatible
public final class b {
    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it2) {
        c.a(collection);
        c.a(it2);
        boolean z = false;
        while (it2.hasNext()) {
            z |= collection.add(it2.next());
        }
        return z;
    }
}
