package com.bytedance.apm.k;

import android.util.Pair;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i {

    public interface a<A, B> {
        boolean a(A a2, B b2);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static Map<String, String> b(List<Pair<String, String>> list) {
        if (a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair next : list) {
            if (!(next == null || next.first == null)) {
                hashMap.put(next.first, next.second);
            }
        }
        return hashMap;
    }

    public static String[] a(Set<String> set) {
        String[] strArr = new String[set.size()];
        int i = 0;
        for (String str : set) {
            strArr[i] = str;
            i++;
        }
        return strArr;
    }

    public static String a(Collection collection, String str) {
        if (collection == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object next : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(next.toString());
        }
        return sb.toString();
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
