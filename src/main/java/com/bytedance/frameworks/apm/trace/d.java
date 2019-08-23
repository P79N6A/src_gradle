package com.bytedance.frameworks.apm.trace;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    static a f19652a;

    /* renamed from: b  reason: collision with root package name */
    private static a f19653b;

    public interface a {
        void a(String str, Object... objArr);

        void b(String str, Object... objArr);

        void c(String str, Object... objArr);

        void d(String str, Object... objArr);
    }

    static {
        AnonymousClass1 r0 = new a() {
            public final void a(String str, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    String.format(str, objArr);
                }
            }

            public final void b(String str, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    String.format(str, objArr);
                }
            }

            public final void c(String str, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    String.format(str, objArr);
                }
            }

            public final void d(String str, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    String.format(str, objArr);
                }
            }
        };
        f19653b = r0;
        f19652a = r0;
    }

    public static void a(String str, String str2, Object... objArr) {
        if (f19652a != null) {
            f19652a.d(str2, objArr);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f19652a != null) {
            f19652a.c(str2, objArr);
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (f19652a != null) {
            f19652a.a(str2, objArr);
        }
    }
}
