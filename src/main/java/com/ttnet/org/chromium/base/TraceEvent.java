package com.ttnet.org.chromium.base;

import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.MainDex;

@MainDex
@JNINamespace("base::android")
public class TraceEvent {
    private static volatile boolean sATraceEnabled;
    public static volatile boolean sEnabled;

    static class BasicLooperMonitor implements Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<TraceEvent> cls = TraceEvent.class;
        }

        private BasicLooperMonitor() {
        }

        /* access modifiers changed from: package-private */
        public void beginHandling(String str) {
            if (TraceEvent.sEnabled) {
                TraceEvent.nativeBeginToplevel();
            }
        }

        /* access modifiers changed from: package-private */
        public void endHandling(String str) {
            if (TraceEvent.sEnabled) {
                TraceEvent.nativeEndToplevel();
            }
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                beginHandling(str);
            } else {
                endHandling(str);
            }
        }
    }

    static final class IdleTracingLooperMonitor extends BasicLooperMonitor implements MessageQueue.IdleHandler {
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private IdleTracingLooperMonitor() {
            super();
        }

        private final void syncIdleMonitoring() {
            if (!TraceEvent.sEnabled || this.mIdleMonitorAttached) {
                if (this.mIdleMonitorAttached && !TraceEvent.sEnabled) {
                    Looper.myQueue().removeIdleHandler(this);
                    this.mIdleMonitorAttached = false;
                }
                return;
            }
            this.mLastIdleStartedAt = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.mIdleMonitorAttached = true;
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtime;
            }
            long j = elapsedRealtime - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            TraceEvent.begin("Looper.queueIdle", this.mNumTasksSinceLastIdle + " tasks since last idle.");
            if (j > 48) {
                traceAndLog(3, this.mNumTasksSeen + " tasks and " + this.mNumIdlesSeen + " idles processed so far, " + this.mNumTasksSinceLastIdle + " tasks bursted and " + j + "ms elapsed since last idle");
            }
            this.mLastIdleStartedAt = elapsedRealtime;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void beginHandling(String str) {
            if (this.mNumTasksSinceLastIdle == 0) {
                TraceEvent.end("Looper.queueIdle");
            }
            this.mLastWorkStartedAt = SystemClock.elapsedRealtime();
            syncIdleMonitoring();
            super.beginHandling(str);
        }

        /* access modifiers changed from: package-private */
        public final void endHandling(String str) {
            if (SystemClock.elapsedRealtime() - this.mLastWorkStartedAt > 16) {
                traceAndLog(5, "observed a task that took " + r0 + "ms: " + str);
            }
            super.endHandling(str);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        private static void traceAndLog(int i, String str) {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", str);
        }
    }

    static final class LooperMonitorHolder {
        public static final BasicLooperMonitor sInstance;

        private LooperMonitorHolder() {
        }

        static {
            BasicLooperMonitor basicLooperMonitor;
            if (CommandLine.getInstance().hasSwitch("enable-idle-tracing")) {
                basicLooperMonitor = new IdleTracingLooperMonitor();
            } else {
                basicLooperMonitor = new BasicLooperMonitor();
            }
            sInstance = basicLooperMonitor;
        }
    }

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel();

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    public static boolean enabled() {
        return sEnabled;
    }

    public static void maybeEnableEarlyTracing() {
        EarlyTraceEvent.maybeEnable();
    }

    public static void registerNativeEnabledObserver() {
        nativeRegisterEnabledObserver();
    }

    public static void begin(String str) {
        begin(str, null);
    }

    public static void end(String str) {
        end(str, null);
    }

    public static void instant(String str) {
        if (sEnabled) {
            nativeInstant(str, null);
        }
    }

    public static void setATraceEnabled(boolean z) {
        if (sATraceEnabled != z) {
            sATraceEnabled = z;
            if (z) {
                nativeStartATrace();
            } else {
                nativeStopATrace();
            }
        }
    }

    @CalledByNative
    public static void setEnabled(boolean z) {
        BasicLooperMonitor basicLooperMonitor;
        if (z) {
            EarlyTraceEvent.disable();
        }
        if (sEnabled != z) {
            sEnabled = z;
            if (!sATraceEnabled) {
                Looper uiThreadLooper = ThreadUtils.getUiThreadLooper();
                if (z) {
                    basicLooperMonitor = LooperMonitorHolder.sInstance;
                } else {
                    basicLooperMonitor = null;
                }
                uiThreadLooper.setMessageLogging(basicLooperMonitor);
            }
        }
    }

    public static void finishAsync(String str, long j) {
        if (sEnabled) {
            nativeFinishAsync(str, j);
        }
    }

    public static void instant(String str, String str2) {
        if (sEnabled) {
            nativeInstant(str, str2);
        }
    }

    public static void startAsync(String str, long j) {
        if (sEnabled) {
            nativeStartAsync(str, j);
        }
    }

    public static void begin(String str, String str2) {
        EarlyTraceEvent.begin(str);
        if (sEnabled) {
            nativeBegin(str, str2);
        }
    }

    public static void end(String str, String str2) {
        EarlyTraceEvent.end(str);
        if (sEnabled) {
            nativeEnd(str, str2);
        }
    }
}
