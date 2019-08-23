package com.ss.android.ugc.graph;

import android.support.annotation.AnyThread;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static e f4328a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4329b;

    /* renamed from: c  reason: collision with root package name */
    private final c f4330c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f4331a;

        /* renamed from: b  reason: collision with root package name */
        public c f4332b;
    }

    public interface c {
        @AnyThread
        <T> T load(Object obj, Class<T> cls);
    }

    public static class a implements c {
        public final <T> T load(Object obj, Class<T> cls) {
            return obj;
        }
    }

    @AnyThread
    public static <T> T a(Class<T> cls) {
        if (f4328a != null) {
            return f4328a.f4330c.load(f4328a.f4329b, cls);
        }
        throw new RuntimeException("Graph not init");
    }

    private e(Object obj, c cVar) {
        this.f4329b = obj;
        this.f4330c = cVar == null ? new a() : cVar;
    }

    public /* synthetic */ e(Object obj, c cVar, byte b2) {
        this(obj, cVar);
    }
}
