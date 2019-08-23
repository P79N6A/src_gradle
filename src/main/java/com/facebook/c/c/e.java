package com.facebook.c.c;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class e {
    public static List a(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return Collections.unmodifiableList(list);
    }

    public static void a(List list, Comparator comparator) {
        if (list != null && !list.isEmpty()) {
            Collections.sort(list, comparator);
        }
    }
}
