package com.bytedance.frameworks.plugin.f;

import com.bytedance.c.a.a;
import com.bytedance.frameworks.plugin.Mira;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.receiver.MiraErrorLogReceiver;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f2259a;

    /* renamed from: b  reason: collision with root package name */
    public static List<String> f2260b = new CopyOnWriteArrayList();

    private static String b() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = stackTrace[a(stackTrace)];
            return "\t\t[" + stackTraceElement.toString() + "]";
        } catch (Exception unused) {
            return "\t\t[No Trace Info]";
        }
    }

    public static boolean a() {
        return f2259a;
    }

    public static void a(String str) {
        b(str);
    }

    public static void b(String str) {
        if (f2259a) {
            d(str);
        }
    }

    public static void c(String str) {
        b(str, (Throwable) null);
    }

    private static int a(StackTraceElement[] stackTraceElementArr) {
        for (int i = 1; i < stackTraceElementArr.length; i++) {
            if (!stackTraceElementArr[i].getClassName().equals(g.class.getName())) {
                return i;
            }
        }
        return -1;
    }

    public static String d(String str) {
        if (!f2259a) {
            return str;
        }
        return str + b();
    }

    public static void a(String str, String str2) {
        b(str2, (Throwable) null);
    }

    public static void b(String str, String str2) {
        c(str2, null);
        b(str2, (Throwable) null);
    }

    public static void a(String str, Throwable th) {
        b(str, th);
    }

    private static void c(String str, Throwable th) {
        String str2 = "message=" + str;
        if (th != null) {
            str2 = str2 + " throwable=" + th.toString();
        }
        f2260b.add(str2);
    }

    private static void b(String str, Throwable th) {
        if (f.c(e.a())) {
            MiraErrorLogReceiver.a(str, th);
            return;
        }
        String d2 = d(str);
        if (Mira.c() != null && th == null) {
            th = new Throwable(d2);
        }
        if (Mira.d() != null) {
            if (th == null) {
                th = new Throwable(d2);
            }
            Mira.d().a(d2, th);
        }
        if (a.a().f2109c != null) {
            if (th == null) {
                th = new Throwable(d2);
            }
            a.a().f2109c.a(d2, th);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str2, th);
    }

    public static void b(String str, String str2, Throwable th) {
        c(str2, th);
        b(str2, th);
    }
}
