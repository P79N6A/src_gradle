package com.amap.api.mapcore2d;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class da extends ev {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f5918a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private String f5919b;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, String> f5920f = new HashMap();

    public Map<String, String> e() {
        return this.f5918a;
    }

    public Map<String, String> f() {
        return this.f5920f;
    }

    public String g() {
        return this.f5919b;
    }

    da() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f5919b = str;
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, String> map) {
        this.f5918a.clear();
        this.f5918a.putAll(map);
    }

    /* access modifiers changed from: package-private */
    public void b(Map<String, String> map) {
        this.f5920f.clear();
        this.f5920f.putAll(map);
    }
}
