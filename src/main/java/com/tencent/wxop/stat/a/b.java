package com.tencent.wxop.stat.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f79781a = "default";

    /* renamed from: b  reason: collision with root package name */
    public boolean f79782b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f79783c = 2;

    public b() {
    }

    public b(String str) {
        this.f79781a = str;
    }

    private String a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.isNativeMethod() || stackTraceElement.getClassName().equals(Thread.class.getName()) || stackTraceElement.getClassName().equals(getClass().getName())) {
                i++;
            } else {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    private void h(Object obj) {
        if (this.f79783c <= 4) {
            String a2 = a();
            if (a2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" - ");
                sb.append(obj);
            }
        }
    }

    public final void a(Object obj) {
        if (this.f79782b) {
            h(obj);
        }
    }

    public final void b(Object obj) {
        if (this.f79783c <= 5) {
            String a2 = a();
            if (a2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" - ");
                sb.append(obj);
            }
        }
    }

    public final void c(Object obj) {
        if (this.f79782b) {
            b(obj);
        }
    }

    public final void d(Object obj) {
        if (this.f79783c <= 6) {
            String a2 = a();
            if (a2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" - ");
                sb.append(obj);
            }
        }
    }

    public final void e(Object obj) {
        if (this.f79782b) {
            d(obj);
        }
    }

    public final void f(Object obj) {
        if (this.f79783c <= 3) {
            String a2 = a();
            if (a2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" - ");
                sb.append(obj);
            }
        }
    }

    public final void g(Object obj) {
        if (this.f79782b) {
            f(obj);
        }
    }
}
