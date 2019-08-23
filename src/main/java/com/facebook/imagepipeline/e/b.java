package com.facebook.imagepipeline.e;

public class b {
    public static final a NO_OP_ARGS_BUILDER = new C0265b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f23935a = null;

    public interface a {
    }

    /* renamed from: com.facebook.imagepipeline.e.b$b  reason: collision with other inner class name */
    static final class C0265b implements a {
        private C0265b() {
        }

        /* synthetic */ C0265b(byte b2) {
            this();
        }
    }

    public interface c {
        void beginSection(String str);

        void endSection();

        boolean isTracing();
    }

    private b() {
    }

    public static void endSection() {
        a().endSection();
    }

    public static boolean isTracing() {
        return a().isTracing();
    }

    private static c a() {
        if (f23935a == null) {
            synchronized (b.class) {
                if (f23935a == null) {
                    f23935a = new a();
                }
            }
        }
        return f23935a;
    }

    public static void beginSection(String str) {
        a().beginSection(str);
    }
}
