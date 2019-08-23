package com.alipay.a.a;

import com.alipay.a.b.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.a.b;
import org.json.a.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static List<i> f5232a;

    static {
        ArrayList arrayList = new ArrayList();
        f5232a = arrayList;
        arrayList.add(new l());
        f5232a.add(new d());
        f5232a.add(new c());
        f5232a.add(new h());
        f5232a.add(new k());
        f5232a.add(new b());
        f5232a.add(new a());
        f5232a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        for (i next : f5232a) {
            if (next.a(a.a(type))) {
                T a2 = next.a(obj, type);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        Object cVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            cVar = new b(trim);
        } else if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return a((Object) trim, type);
        } else {
            cVar = new c(trim);
        }
        return a(cVar, type);
    }
}
