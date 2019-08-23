package com.facebook.c.c;

import com.facebook.c.b.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public final class a {
    public static List<d> a(List<d> list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        Iterator<d> it2 = list.iterator();
        while (it2.hasNext()) {
            d next = it2.next();
            if (next.f23342b == 0) {
                stack.push(next);
                it2.remove();
            }
        }
        while (!stack.isEmpty()) {
            d dVar = (d) stack.pop();
            arrayList.add(dVar);
            for (d next2 : list) {
                if (next2.f23342b == dVar.f23341a) {
                    stack.push(next2);
                }
            }
        }
        return arrayList;
    }
}
