package com.ttnet.org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadUtils {
    private static final Object sLock = new Object();
    private static Handler sUiThreadHandler;
    private static boolean sWillOverride;

    public static void assertOnUiThread() {
    }

    public static Looper getUiThreadLooper() {
        return getUiThreadHandler().getLooper();
    }

    public static void setWillOverrideUiThread() {
        synchronized (sLock) {
            sWillOverride = true;
        }
    }

    public static boolean runningOnUiThread() {
        if (getUiThreadHandler().getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    private static Handler getUiThreadHandler() {
        Handler handler;
        synchronized (sLock) {
            if (sUiThreadHandler == null) {
                if (!sWillOverride) {
                    sUiThreadHandler = new Handler(Looper.getMainLooper());
                } else {
                    throw new RuntimeException("Did not yet override the UI thread");
                }
            }
            handler = sUiThreadHandler;
        }
        return handler;
    }

    public static <T> FutureTask<T> postOnUiThread(FutureTask<T> futureTask) {
        getUiThreadHandler().post(futureTask);
        return futureTask;
    }

    @CalledByNative
    public static void setThreadPriorityAudio(int i) {
        Process.setThreadPriority(i, -16);
    }

    @CalledByNative
    private static boolean isThreadPriorityAudio(int i) {
        if (Process.getThreadPriority(i) == -16) {
            return true;
        }
        return false;
    }

    public static void postOnUiThread(Runnable runnable) {
        getUiThreadHandler().post(runnable);
    }

    public static <T> FutureTask<T> runOnUiThread(Callable<T> callable) {
        return runOnUiThread(new FutureTask<>(callable));
    }

    @VisibleForTesting
    public static <T> T runOnUiThreadBlockingNoException(Callable<T> callable) {
        try {
            return runOnUiThreadBlocking(callable);
        } catch (ExecutionException e2) {
            throw new RuntimeException("Error occured waiting for callable", e2);
        }
    }

    public static <T> FutureTask<T> runOnUiThread(FutureTask<T> futureTask) {
        if (runningOnUiThread()) {
            futureTask.run();
        } else {
            postOnUiThread(futureTask);
        }
        return futureTask;
    }

    public static <T> T runOnUiThreadBlocking(Callable<T> callable) throws ExecutionException {
        FutureTask futureTask = new FutureTask(callable);
        runOnUiThread(futureTask);
        try {
            return futureTask.get();
        } catch (InterruptedException e2) {
            throw new RuntimeException("Interrupted waiting for callable", e2);
        }
    }

    public static void runOnUiThread(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
        } else {
            getUiThreadHandler().post(runnable);
        }
    }

    public static void runOnUiThreadBlocking(Runnable runnable) {
        if (runningOnUiThread()) {
            runnable.run();
            return;
        }
        FutureTask futureTask = new FutureTask(runnable, null);
        postOnUiThread(futureTask);
        try {
            futureTask.get();
        } catch (Exception e2) {
            throw new RuntimeException("Exception occured while waiting for runnable", e2);
        }
    }

    @VisibleForTesting
    public static void setUiThread(Looper looper) {
        synchronized (sLock) {
            if (sUiThreadHandler != null) {
                if (sUiThreadHandler.getLooper() != looper) {
                    throw new RuntimeException("UI thread looper is already set to " + sUiThreadHandler.getLooper() + " (Main thread looper is " + Looper.getMainLooper() + "), cannot set to new looper " + looper);
                }
            }
            sUiThreadHandler = new Handler(looper);
        }
    }

    @VisibleForTesting
    public static void postOnUiThreadDelayed(Runnable runnable, long j) {
        getUiThreadHandler().postDelayed(runnable, j);
    }
}
