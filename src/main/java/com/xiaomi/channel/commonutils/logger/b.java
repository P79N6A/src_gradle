package com.xiaomi.channel.commonutils.logger;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static int f81718a = 2;

    /* renamed from: a  reason: collision with other field name */
    private static LoggerInterface f58a = new a();

    /* renamed from: a  reason: collision with other field name */
    private static final Integer f59a = -1;

    /* renamed from: a  reason: collision with other field name */
    private static final HashMap<Integer, Long> f60a = new HashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static AtomicInteger f61a = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<Integer, String> f81719b = new HashMap<>();

    public static int a() {
        return f81718a;
    }

    public static Integer a(String str) {
        if (f81718a > 1) {
            return f59a;
        }
        Integer valueOf = Integer.valueOf(f61a.incrementAndGet());
        f60a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
        f81719b.put(valueOf, str);
        LoggerInterface loggerInterface = f58a;
        loggerInterface.log(str + " starts");
        return valueOf;
    }

    public static void a(int i) {
        if (i < 0 || i > 5) {
            a(2, "set log level as " + i);
        }
        f81718a = i;
    }

    public static void a(int i, String str) {
        if (i >= f81718a) {
            f58a.log(str);
        }
    }

    public static void a(int i, String str, Throwable th) {
        if (i >= f81718a) {
            f58a.log(str, th);
        }
    }

    public static void a(int i, Throwable th) {
        if (i >= f81718a) {
            f58a.log("", th);
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f58a = loggerInterface;
    }

    public static void a(Integer num) {
        if (f81718a <= 1 && f60a.containsKey(num)) {
            long longValue = f60a.remove(num).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            LoggerInterface loggerInterface = f58a;
            loggerInterface.log(f81719b.remove(num) + " ends in " + (currentTimeMillis - longValue) + " ms");
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m23a(String str) {
        a(2, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    public static void a(String str, Throwable th) {
        a(4, str, th);
    }

    public static void a(Throwable th) {
        a(4, th);
    }

    public static void b(String str) {
        a(0, str);
    }

    public static void c(String str) {
        a(1, "[Thread:" + Thread.currentThread().getId() + "] " + str);
    }

    public static void d(String str) {
        a(4, str);
    }
}
