package com.bytedance.im.core.c;

import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private String f21245a;

    /* renamed from: b  reason: collision with root package name */
    private String f21246b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, Object> f21247c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Object> f21248d = new HashMap<>();

    public static c a() {
        return new c();
    }

    public final void b() {
        d.a(this.f21245a, this.f21246b, this.f21247c, this.f21248d);
    }

    private c() {
    }

    public final c a(String str) {
        this.f21245a = str;
        return this;
    }

    public final c b(String str) {
        this.f21246b = str;
        return this;
    }

    public final c b(String str, Object obj) {
        this.f21248d.put(str, obj);
        return this;
    }

    public final c a(String str, Object obj) {
        this.f21247c.put(str, obj);
        return this;
    }
}
