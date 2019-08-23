package com.ss.android.agilelogger;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.agilelogger.d.c;
import com.ss.android.agilelogger.e.a;
import com.ss.android.agilelogger.e.b;
import com.ss.android.agilelogger.f.b;
import com.ss.android.agilelogger.f.i;
import com.ss.android.agilelogger.f.k;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import java.util.Set;

public class ALog {
    private static volatile b sAlogThread;
    private static b sAndroidPrinter = new b();
    public static a sConfig;
    private static Context sContext;
    private static volatile boolean sDebug = true;
    private static volatile d sILogCacheCallback = null;
    private static volatile boolean sInitSuccess = false;
    public static String sPackageClassName = ALog.class.getCanonicalName();
    private static volatile boolean sPrintStackTrace = false;

    public static Context getContext() {
        return sContext;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static void destroy() {
        sContext = null;
        if (c.f27886a != null && !c.f27886a.isShutdown()) {
            c.f27886a.shutdownNow();
        }
    }

    public static void flush() {
        e a2 = e.a();
        a2.f27906a = 2;
        if (sAlogThread != null) {
            sAlogThread.f27876c.add(a2);
            sAlogThread.a();
        }
    }

    public static void forceLogSharding() {
        e a2 = e.a();
        a2.f27906a = 4;
        if (sAlogThread != null) {
            sAlogThread.f27876c.add(a2);
            sAlogThread.a();
        }
    }

    @Nullable
    public static Set<String> getBlackTagSet() {
        if (sAlogThread == null) {
            return null;
        }
        b bVar = sAlogThread;
        if (bVar.f27875b == null) {
            return null;
        }
        return bVar.f27875b.f27913b;
    }

    public static void release() {
        if (sAlogThread != null) {
            a aVar = sAlogThread.f27875b;
            if (!(aVar == null || aVar.f27912a == null)) {
                for (c b2 : aVar.f27912a) {
                    b2.b();
                }
            }
        }
        sAlogThread = null;
    }

    public static void setContext(Context context) {
        sContext = context;
    }

    public static void setDebug(boolean z) {
        sDebug = z;
    }

    public static void setILogCacheCallback(d dVar) {
        sILogCacheCallback = dVar;
    }

    public static void setPrintStackTrace(boolean z) {
        sPrintStackTrace = z;
    }

    public static void setsPackageClassName(String str) {
        sPackageClassName = str;
    }

    public static void changeLevel(int i) {
        e a2 = e.a();
        a2.f27906a = 3;
        a2.h = Integer.valueOf(i);
        if (sAlogThread != null) {
            sAlogThread.f27876c.add(a2);
            sAlogThread.a();
        }
    }

    public static void setBlackTagSet(Set<String> set) {
        if (sAlogThread != null) {
            b bVar = sAlogThread;
            if (bVar.f27875b != null) {
                bVar.f27875b.a(set);
                return;
            }
            bVar.f27877d = set;
        }
    }

    public static boolean init(@NonNull a aVar) {
        if (aVar == null) {
            throw new RuntimeException("alogConfig must not be null");
        } else if (!i.a(getContext(), "alog-lib")) {
            return false;
        } else {
            if (sAlogThread == null || sAlogThread.isInterrupted()) {
                synchronized (ALog.class) {
                    if (sAlogThread == null || sAlogThread.isInterrupted()) {
                        sConfig = aVar;
                        b bVar = new b("_ALOG_OPT_", aVar);
                        sAlogThread = bVar;
                        bVar.setPriority(1);
                        sAlogThread.start();
                    }
                }
            }
            if (sILogCacheCallback != null) {
                b bVar2 = sAlogThread;
                Queue a2 = sILogCacheCallback.a();
                if (!(a2 == null || a2.size() == 0)) {
                    bVar2.f27876c.addAll(a2);
                }
            }
            sInitSuccess = true;
            return true;
        }
    }

    @TargetApi(18)
    public static void println(e eVar) {
        String str;
        eVar.f27906a = 1;
        if (sDebug) {
            String str2 = "";
            switch (b.AnonymousClass1.f27916a[eVar.g.ordinal()]) {
                case 1:
                    str2 = (String) eVar.h;
                    break;
                case 2:
                    if (eVar.i != null) {
                        str2 = eVar.i + k.a((Throwable) eVar.h);
                        break;
                    } else {
                        str2 = k.a((Throwable) eVar.h);
                        break;
                    }
                case 3:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (String) eVar.h);
                    break;
                case 4:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (String) eVar.h);
                    break;
                case 5:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (Bundle) eVar.h);
                    break;
                case 6:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (Intent) eVar.h);
                    break;
                case e.l /*?: ONE_ARG  (7 int)*/:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (Throwable) eVar.h);
                    break;
                case 8:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (Thread) eVar.h);
                    break;
                case 9:
                    str2 = com.ss.android.agilelogger.f.b.a(eVar.g, (StackTraceElement[]) eVar.h);
                    break;
            }
            eVar.f27909d = str2;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[10];
            objArr[0] = "";
            objArr[1] = Integer.valueOf(Process.myPid());
            objArr[2] = Long.valueOf(eVar.f27910e);
            if (eVar.f27911f) {
                str = "*";
            } else {
                str = "";
            }
            objArr[3] = str;
            objArr[4] = f.a(eVar.f27907b);
            objArr[5] = "";
            objArr[6] = eVar.j;
            objArr[7] = eVar.k;
            objArr[8] = eVar.l;
            objArr[9] = eVar.f27909d;
            String.format(locale, "[%s][%d:%d%s][%s][%s][%s, %s, %s]%s\n", objArr);
        }
        if (sAlogThread != null && sAlogThread.f27874a != null && sAlogThread.f27874a.g <= eVar.f27907b) {
            sAlogThread.f27876c.add(eVar);
            sAlogThread.a();
        }
    }

    public static void d(String str, String str2) {
        println(3, str, str2, b.a.MSG);
    }

    public static void e(String str, String str2) {
        println(6, str, str2, b.a.MSG);
    }

    public static void i(String str, String str2) {
        println(4, str, str2, b.a.MSG);
    }

    public static void v(String str, String str2) {
        println(2, str, str2, b.a.MSG);
    }

    public static void w(String str, String str2) {
        println(5, str, str2, b.a.MSG);
    }

    public static void e(String str, Throwable th) {
        println(6, str, th, b.a.STACKTRACE_STR);
    }

    public static void w(String str, Throwable th) {
        println(5, str, th, b.a.STACKTRACE_STR);
    }

    @Nullable
    public static List<String> getALogFiles(long j, long j2) {
        if (sConfig == null || j >= j2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(sConfig.f27862d);
            if (file.exists() && file.listFiles() != null) {
                for (File file2 : file.listFiles()) {
                    if (file2.getName().endsWith(".hot")) {
                        long lastModified = file2.lastModified() / 1000;
                        if (j > lastModified || j2 < lastModified) {
                            String[] split = file2.getName().split("_");
                            if (split != null && split.length >= 4) {
                                long parseLong = Long.parseLong(split[3]) / 1000;
                                if (parseLong >= j && parseLong <= j2) {
                                    arrayList.add(file2.getAbsolutePath());
                                }
                            }
                        } else {
                            arrayList.add(file2.getAbsolutePath());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static void bundle(int i, String str, Bundle bundle) {
        println(i, str, bundle, b.a.BUNDLE);
    }

    public static void header(int i, String str, String str2) {
        println(i, str, str2, b.a.BORDER);
    }

    public static void intent(int i, String str, Intent intent) {
        println(i, str, intent, b.a.INTENT);
    }

    public static void json(int i, String str, String str2) {
        println(i, str, str2, b.a.JSON);
    }

    public static void statcktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        println(i, str, stackTraceElementArr, b.a.STACKTRACE);
    }

    public static void thread(int i, String str, Thread thread) {
        println(i, str, thread, b.a.THREAD);
    }

    public static void throwable(int i, String str, Throwable th) {
        println(i, str, th, b.a.THROWABLE);
    }

    public static void e(String str, String str2, Throwable th) {
        println(6, str, th, str2 + "\n", b.a.STACKTRACE_STR);
    }

    public static void w(String str, String str2, Throwable th) {
        println(5, str, th, str2 + "\n", b.a.STACKTRACE_STR);
    }

    public static void println(int i, String str, Object obj, b.a aVar) {
        println(i, str, obj, null, aVar);
    }

    @TargetApi(18)
    public static void println(int i, String str, Object obj, Object obj2, b.a aVar) {
        boolean z;
        String str2;
        String str3;
        String str4;
        long id = Thread.currentThread().getId();
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        e a2 = e.a();
        a2.f27907b = i;
        a2.f27908c = str;
        a2.f27909d = "";
        a2.f27910e = id;
        a2.f27911f = z;
        a2.g = aVar;
        a2.h = obj;
        a2.i = obj2;
        StackTraceElement stackTraceElement = null;
        if (!TextUtils.isEmpty(sPackageClassName) && sPrintStackTrace) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            int length = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (sPackageClassName.equals(stackTrace[i2].getClassName())) {
                    int i3 = i2 + 1;
                    if (i3 < length && !sPackageClassName.equals(stackTrace[i3].getClassName())) {
                        stackTraceElement = stackTrace[i3];
                        break;
                    }
                }
                i2++;
            }
        }
        if (stackTraceElement == null) {
            z2 = true;
        }
        if (z2) {
            str2 = "";
        } else {
            str2 = stackTraceElement.getClassName();
        }
        a2.j = str2;
        if (z2) {
            str3 = "";
        } else {
            str3 = stackTraceElement.getMethodName();
        }
        a2.k = str3;
        if (z2) {
            str4 = "";
        } else {
            str4 = String.valueOf(stackTraceElement.getLineNumber());
        }
        a2.l = str4;
        println(a2);
    }
}
