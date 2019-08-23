package com.facebook.c.c;

import com.facebook.c.b.b;
import java.util.List;

public final class b {
    public static com.facebook.c.b.b a(List<com.facebook.c.b.b> list, b.C0250b bVar) {
        if (list == null) {
            return null;
        }
        int i = 0;
        int size = list.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (list.get(i).f23328b == bVar) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return null;
        }
        return list.remove(i);
    }
}
