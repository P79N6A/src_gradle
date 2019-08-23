package com.bytedance.framwork.core.a.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b {

    public interface a<A, B> {
        boolean a(A a2, B b2);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static <L, O> boolean a(Collection<L> collection, O o, a<? super L, O> aVar) {
        Iterator<L> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (aVar.a(it2.next(), o)) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
