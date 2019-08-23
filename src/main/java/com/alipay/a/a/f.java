package com.alipay.a.a;

import com.alipay.a.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.a.b;
import org.json.a.c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<j> f5233a;

    static {
        ArrayList arrayList = new ArrayList();
        f5233a = arrayList;
        arrayList.add(new l());
        f5233a.add(new d());
        f5233a.add(new c());
        f5233a.add(new h());
        f5233a.add(new b());
        f5233a.add(new a());
        f5233a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b2 = b(obj);
        if (a.a(b2.getClass())) {
            return c.b(b2.toString());
        }
        if (Collection.class.isAssignableFrom(b2.getClass())) {
            return new b((Collection) (List) b2).toString();
        }
        if (Map.class.isAssignableFrom(b2.getClass())) {
            return new c((Map) b2).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b2.getClass());
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        for (j next : f5233a) {
            if (next.a(obj.getClass())) {
                Object a2 = next.a(obj);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
