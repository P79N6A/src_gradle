package org.greenrobot.eventbus;

import java.io.PrintStream;
import java.util.logging.Level;

public interface g {

    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        static final boolean f84118a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84119b;

        public final void a(Level level, String str) {
        }

        public final void a(Level level, String str, Throwable th) {
        }

        public static boolean a() {
            return f84118a;
        }

        static {
            boolean z = false;
            try {
                if (Class.forName("android.util.Log") != null) {
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            }
            f84118a = z;
        }

        public a(String str) {
            this.f84119b = str;
        }
    }

    public static class b implements g {
        public final void a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        public final void a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            com.google.a.a.a.a.a.a.a(th, System.out);
        }
    }

    void a(Level level, String str);

    void a(Level level, String str, Throwable th);
}
