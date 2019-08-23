package com.ss.android.agilelogger.f;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<a, com.ss.android.agilelogger.b.b> f27917a;

    public enum a {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR
    }

    static {
        ConcurrentHashMap<a, com.ss.android.agilelogger.b.b> concurrentHashMap = new ConcurrentHashMap<>();
        f27917a = concurrentHashMap;
        concurrentHashMap.put(a.MSG, new com.ss.android.agilelogger.b.b.a());
        f27917a.put(a.JSON, new com.ss.android.agilelogger.b.b.a.a());
        f27917a.put(a.BUNDLE, new com.ss.android.agilelogger.b.b.b.a());
        f27917a.put(a.INTENT, new com.ss.android.agilelogger.b.b.b.b());
        f27917a.put(a.BORDER, new com.ss.android.agilelogger.b.a.b());
        f27917a.put(a.STACKTRACE, new com.ss.android.agilelogger.b.c.a());
        f27917a.put(a.THREAD, new com.ss.android.agilelogger.b.d.a());
        f27917a.put(a.THROWABLE, new com.ss.android.agilelogger.b.b.c.a());
    }

    public static String a(a aVar, Intent intent) {
        f27917a.get(aVar);
        return com.ss.android.agilelogger.b.b.b.b.a(intent);
    }

    public static String a(a aVar, Bundle bundle) {
        f27917a.get(aVar);
        return com.ss.android.agilelogger.b.b.b.a.a(bundle);
    }

    public static String a(a aVar, String str) {
        com.ss.android.agilelogger.b.b bVar = f27917a.get(aVar);
        if (bVar == null) {
            return str;
        }
        if (aVar != a.BORDER) {
            return bVar.a(str);
        }
        return bVar.a(new String[]{str});
    }

    public static String a(a aVar, Thread thread) {
        return f27917a.get(aVar).a(thread);
    }

    public static String a(a aVar, Throwable th) {
        return f27917a.get(aVar).a(th);
    }

    public static String a(a aVar, StackTraceElement[] stackTraceElementArr) {
        return f27917a.get(aVar).a(stackTraceElementArr);
    }
}
