package com.ss.c.a.c;

import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f78341a = -1;

    /* renamed from: b  reason: collision with root package name */
    private static String f78342b;

    /* renamed from: c  reason: collision with root package name */
    private static b f78343c;

    /* renamed from: d  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f78344d = new ConcurrentHashMap<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f78345a;

        /* renamed from: b  reason: collision with root package name */
        public long f78346b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f78347c;

        a() {
        }
    }

    public static int c() {
        return f78341a;
    }

    public static String d() {
        return f78342b;
    }

    private b() {
    }

    public final void b() {
        if (this.f78344d != null) {
            this.f78344d.clear();
        }
    }

    public static b a() {
        if (f78343c == null) {
            synchronized (b.class) {
                if (f78343c == null) {
                    f78343c = new b();
                }
            }
        }
        return f78343c;
    }

    public static void a(int i) {
        f78341a = i;
    }

    public static void c(String str) {
        f78342b = str;
    }

    public final a a(String str) {
        if (this.f78344d != null) {
            return this.f78344d.get(str);
        }
        return null;
    }

    public final void b(String str) {
        if (str != null) {
            a aVar = null;
            if (this.f78344d != null) {
                aVar = this.f78344d.get(str);
            }
            if (aVar != null) {
                aVar.f78347c = true;
            }
        }
    }

    public final void a(String str, a aVar) {
        if (this.f78344d != null) {
            this.f78344d.put(str, aVar);
        }
    }
}
