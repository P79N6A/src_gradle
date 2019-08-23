package com.meizu.cloud.pushsdk.c.a;

import com.meizu.cloud.pushsdk.c.f.e;
import java.util.HashMap;
import java.util.Map;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f27089a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Object> f27090b = new HashMap<>();

    public Map a() {
        return this.f27090b;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            String str2 = this.f27089a;
            com.meizu.cloud.pushsdk.c.f.c.c(str2, "The keys value is empty, returning without adding key: " + str, new Object[0]);
            return;
        }
        this.f27090b.put(str, obj);
    }

    public void a(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            String str3 = this.f27089a;
            com.meizu.cloud.pushsdk.c.f.c.c(str3, "The keys value is empty, returning without adding key: " + str, new Object[0]);
            return;
        }
        this.f27090b.put(str, str2);
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            com.meizu.cloud.pushsdk.c.f.c.c(this.f27089a, "Map passed in is null, returning without adding map.", new Object[0]);
        } else {
            this.f27090b.putAll(map);
        }
    }

    public long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.f27090b).toString();
    }
}
