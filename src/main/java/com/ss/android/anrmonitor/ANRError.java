package com.ss.android.anrmonitor;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    private final Map<Thread, StackTraceElement[]> stackTraces;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f27928a;

        /* renamed from: b  reason: collision with root package name */
        public final StackTraceElement[] f27929b;

        /* renamed from: com.ss.android.anrmonitor.ANRError$a$a  reason: collision with other inner class name */
        class C0326a extends Throwable {
            public final Throwable fillInStackTrace() {
                setStackTrace(a.this.f27929b);
                return this;
            }

            private C0326a(C0326a aVar) {
                super(a.this.f27928a, aVar);
            }

            /* synthetic */ C0326a(a aVar, C0326a aVar2, byte b2) {
                this(null);
            }
        }

        private a(String str, StackTraceElement[] stackTraceElementArr) {
            this.f27928a = str;
            this.f27929b = stackTraceElementArr;
        }

        /* synthetic */ a(String str, StackTraceElement[] stackTraceElementArr, byte b2) {
            this(str, stackTraceElementArr);
        }
    }

    public Map<Thread, StackTraceElement[]> getStackTraces() {
        return this.stackTraces;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public static ANRError NewMainOnly() {
        Thread thread = Looper.getMainLooper().getThread();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        HashMap hashMap = new HashMap(1);
        hashMap.put(thread, stackTrace);
        a aVar = new a(thread.getName(), stackTrace, (byte) 0);
        aVar.getClass();
        return new ANRError(new a.C0326a(aVar, null, (byte) 0), hashMap);
    }

    public ANRError(a.C0326a aVar, Map<Thread, StackTraceElement[]> map) {
        super("Application Not Responding", aVar);
        this.stackTraces = map;
    }
}
