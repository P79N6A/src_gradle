package com.meizu.cloud.pushsdk.c.a;

import com.meizu.cloud.pushsdk.c.f.c;
import com.meizu.cloud.pushsdk.c.f.d;
import com.meizu.cloud.pushsdk.c.f.e;
import java.util.HashMap;
import java.util.Map;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f27087a = b.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Object> f27088b = new HashMap<>();

    public b(String str, Object obj) {
        a(str);
        a(obj);
    }

    public b a(Object obj) {
        if (obj == null) {
            return this;
        }
        this.f27088b.put("dt", obj);
        return this;
    }

    public b a(String str) {
        d.a(str, (Object) "schema cannot be null");
        d.a(!str.isEmpty(), (Object) "schema cannot be empty.");
        this.f27088b.put("sa", str);
        return this;
    }

    public Map<String, Object> a() {
        return this.f27088b;
    }

    @Deprecated
    public void a(String str, String str2) {
        c.c(this.f27087a, "Payload: add(String, String) method called - Doing nothing.", new Object[0]);
    }

    public long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.f27088b).toString();
    }
}
