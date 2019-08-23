package com.ss.android.f.a;

import android.os.Debug;
import com.ss.android.common.applog.GlobalContext;
import java.io.File;
import java.lang.Thread;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f29095a;

    public final void uncaughtException(Thread thread, Throwable th) {
        if (th instanceof OutOfMemoryError) {
            File a2 = com.ss.android.f.a.a();
            try {
                Debug.dumpHprofData(a2.getAbsolutePath() + "/.dump.hprof");
                com.bytedance.d.a.a(a2, ".maps");
                com.bytedance.d.a.a(GlobalContext.getContext(), a2, ".fds");
                com.bytedance.d.a.b(GlobalContext.getContext(), a2, ".threads");
            } catch (Throwable unused) {
            }
        }
        if (f29095a != null) {
            f29095a.uncaughtException(thread, th);
        }
    }
}
