package com.bytedance.frameworks.core.apm;

import android.text.TextUtils;
import com.bytedance.apm.f.e;
import com.bytedance.frameworks.core.apm.a.a.c;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public List<com.bytedance.frameworks.core.apm.a.a.a<? extends e>> f2130a;

    /* renamed from: b  reason: collision with root package name */
    public c f2131b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.frameworks.core.apm.a.a.b f2132c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.frameworks.core.apm.a.b.b f2133d;

    /* renamed from: e  reason: collision with root package name */
    private Map<Class<?>, com.bytedance.frameworks.core.apm.a.a.a<? extends e>> f2134e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f2135a = new b((byte) 0);
    }

    public static b a() {
        return a.f2135a;
    }

    private b() {
        this.f2130a = new LinkedList();
        this.f2134e = new HashMap();
        this.f2133d = new com.bytedance.frameworks.core.apm.a.b.b();
        this.f2131b = new c();
        this.f2130a.add(this.f2131b);
        this.f2134e.put(e.class, this.f2131b);
        this.f2132c = new com.bytedance.frameworks.core.apm.a.a.b();
        this.f2130a.add(this.f2132c);
        this.f2134e.put(com.bytedance.apm.f.a.class, this.f2132c);
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(e eVar) {
        this.f2131b.a(eVar);
    }

    public final com.bytedance.frameworks.core.apm.a.a.a<? extends e> a(Class<?> cls) {
        return this.f2134e.get(cls);
    }

    public final int a(String str, List<Long> list) {
        if (TextUtils.equals(str, "api_all")) {
            return this.f2132c.c(list);
        }
        return this.f2131b.c(list);
    }
}
