package com.google.a.a.a.a.a;

import java.io.PrintStream;
import java.io.PrintWriter;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final C0018a f2354a;

    /* renamed from: b  reason: collision with root package name */
    static final int f2355b;

    /* renamed from: com.google.a.a.a.a.a.a$a  reason: collision with other inner class name */
    static abstract class C0018a {

        /* renamed from: a  reason: collision with root package name */
        protected static final Throwable[] f2356a = new Throwable[0];

        public abstract void a(Throwable th, PrintStream printStream);

        public abstract void a(Throwable th, PrintWriter printWriter);

        public abstract void a(Throwable th, Throwable th2);

        public abstract Throwable[] a(Throwable th);

        public abstract void b(Throwable th);

        C0018a() {
        }
    }

    static final class b extends C0018a {
        public final void a(Throwable th, Throwable th2) {
        }

        b() {
        }

        public final void b(Throwable th) {
            th.printStackTrace();
        }

        public final Throwable[] a(Throwable th) {
            return f2356a;
        }

        public final void a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        public final void a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }
    }

    static final class c extends C0018a {
        c() {
        }

        public final void b(Throwable th) {
            th.printStackTrace();
        }

        public final Throwable[] a(Throwable th) {
            return th.getSuppressed();
        }

        public final void a(Throwable th, PrintStream printStream) {
            th.printStackTrace(printStream);
        }

        public final void a(Throwable th, PrintWriter printWriter) {
            th.printStackTrace(printWriter);
        }

        public final void a(Throwable th, Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    private static Integer a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e2) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e2.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = a()     // Catch:{ Throwable -> 0x002c }
            if (r1 == 0) goto L_0x0017
            int r2 = r1.intValue()     // Catch:{ Throwable -> 0x0015 }
            r3 = 19
            if (r2 < r3) goto L_0x0017
            com.google.a.a.a.a.a.a$c r2 = new com.google.a.a.a.a.a.a$c     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x0015:
            r2 = move-exception
            goto L_0x002e
        L_0x0017:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ Throwable -> 0x0015 }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0026
            com.google.a.a.a.a.a.a$b r2 = new com.google.a.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x0026:
            com.google.a.a.a.a.a.a$b r2 = new com.google.a.a.a.a.a.a$b     // Catch:{ Throwable -> 0x0015 }
            r2.<init>()     // Catch:{ Throwable -> 0x0015 }
            goto L_0x0056
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy "
            r4.<init>(r5)
            java.lang.Class<com.google.a.a.a.a.a.a$b> r5 = com.google.a.a.a.a.a.a.b.class
            java.lang.String r5 = r5.getName()
            r4.append(r5)
            java.lang.String r5 = "will be used. The error is: "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.a.a.a.a.a.a$b r2 = new com.google.a.a.a.a.a.a$b
            r2.<init>()
        L_0x0056:
            f2354a = r2
            if (r1 != 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            int r0 = r1.intValue()
        L_0x005f:
            f2355b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.a.a.a.a.a.a.<clinit>():void");
    }

    public static void b(Throwable th) {
        f2354a.b(th);
    }

    public static Throwable[] a(Throwable th) {
        return f2354a.a(th);
    }

    public static void a(Throwable th, PrintStream printStream) {
        f2354a.a(th, printStream);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        f2354a.a(th, printWriter);
    }

    public static void a(Throwable th, Throwable th2) {
        f2354a.a(th, th2);
    }
}
