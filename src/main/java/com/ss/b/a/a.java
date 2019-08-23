package com.ss.b.a;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    protected static a f78269a;

    /* renamed from: b  reason: collision with root package name */
    protected static volatile boolean f78270b;

    protected a() {
        f78269a = this;
    }

    public static void a(a aVar) {
        f78269a = aVar;
    }

    public static void b(String str, String str2) {
        if (f78269a != null) {
            f78269a.g(str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void c(String str, String str2) {
        if (f78269a != null) {
            f78269a.h(str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void d(String str, String str2) {
        if (f78269a != null) {
            f78269a.i(str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void e(String str, String str2) {
        if (f78269a != null) {
            f78269a.j(str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, String str2) {
        if (f78269a != null) {
            f78269a.f(str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void b(String str, Throwable th) {
        if (f78269a != null) {
            f78269a.d(str, th);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, Throwable th) {
        if (f78269a != null) {
            f78269a.c(str, th);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(int i, String str, String str2) {
        if (f78269a != null) {
            f78269a.b(i, str, str2);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (f78269a != null) {
            f78269a.b(i, str, stackTraceElementArr);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f78269a != null) {
            f78269a.d(str, str2, th);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f78269a != null) {
            f78269a.c(str, str2, th);
        } else if (f78270b) {
            throw new RuntimeException("implement AlogService and set sInstance first");
        }
    }
}
