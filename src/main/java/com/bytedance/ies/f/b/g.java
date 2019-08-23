package com.bytedance.ies.f.b;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.ies.f.b.c;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public e f20644a;

    /* renamed from: b  reason: collision with root package name */
    public h f20645b;

    /* renamed from: c  reason: collision with root package name */
    Map<String, a> f20646c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    Map<String, c.b> f20647d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public Set<c> f20648e = new HashSet();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f20654a;

        /* renamed from: b  reason: collision with root package name */
        String f20655b;

        private a(boolean z, String str) {
            this.f20654a = z;
            this.f20655b = str;
        }

        /* synthetic */ a(boolean z, String str, byte b2) {
            this(z, str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (c e2 : this.f20648e) {
            e2.e();
        }
        this.f20648e.clear();
        this.f20646c.clear();
        this.f20647d.clear();
    }

    @NonNull
    private static Type[] a(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }

    g(j jVar) {
        this.f20645b = new h(jVar.f20662e);
    }

    /* access modifiers changed from: package-private */
    public Object a(String str, a aVar) throws JSONException {
        return this.f20645b.a(str, a(aVar)[0]);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, @NonNull b bVar) {
        bVar.name = str;
        this.f20646c.put(str, bVar);
        new StringBuilder("JsBridge raw method registered: ").append(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, @NonNull c.b bVar) {
        this.f20647d.put(str, bVar);
        new StringBuilder("JsBridge stateful method registered: ").append(str);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, @NonNull d<?, ?> dVar) {
        dVar.name = str;
        this.f20646c.put(str, dVar);
        new StringBuilder("JsBridge stateless method registered: ").append(str);
    }

    public final <T> void a(String str, @Nullable T t) {
        this.f20644a.b(str, this.f20645b.a(t));
    }
}
