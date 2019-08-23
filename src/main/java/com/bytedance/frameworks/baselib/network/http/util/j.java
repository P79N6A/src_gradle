package com.bytedance.frameworks.baselib.network.http.util;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f19879a;

    /* renamed from: b  reason: collision with root package name */
    public String f19880b;

    public final String toString() {
        return a();
    }

    public j() {
        this.f19879a = new LinkedHashMap();
        this.f19880b = null;
    }

    public final String a() {
        if (this.f19879a.isEmpty()) {
            return this.f19880b;
        }
        String format = UrlUtils.format(this.f19879a, "UTF-8");
        if (this.f19880b == null || this.f19880b.length() == 0) {
            return format;
        }
        if (this.f19880b.indexOf(63) >= 0) {
            return this.f19880b + "&" + format;
        }
        return this.f19880b + "?" + format;
    }

    public j(String str) {
        this.f19879a = new LinkedHashMap();
        this.f19880b = str;
    }

    public final void a(String str, double d2) {
        List list = this.f19879a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(d2));
        this.f19879a.put(str, list);
    }

    public final void a(String str, String str2) {
        List list = this.f19879a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(str2));
        this.f19879a.put(str, list);
    }
}
