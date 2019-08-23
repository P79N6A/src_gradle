package com.ss.android.agilelogger;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f27886a;

    /* renamed from: b  reason: collision with root package name */
    public static Future<?> f27887b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Future<?> f27888c = null;

    /* renamed from: d  reason: collision with root package name */
    public static String f27889d;

    public static class a implements Runnable {
        private a() {
        }

        public final void run() {
            File file = new File(c.f27889d);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {
                    public final boolean accept(File file, String str) {
                        return str.endsWith(".hot");
                    }
                });
                if (listFiles != null && listFiles.length > 0) {
                    Arrays.sort(listFiles);
                    listFiles[0].delete();
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private long f27891a;

        public final void run() {
            File file = new File(c.f27889d);
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {
                    public final boolean accept(File file, String str) {
                        return str.endsWith(".hot");
                    }
                });
                if (listFiles != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (File file2 : listFiles) {
                        if (currentTimeMillis - file2.lastModified() > this.f27891a) {
                            file2.delete();
                        }
                    }
                }
            }
        }

        public b(long j) {
            this.f27891a = j;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new ThreadFactory() {
            public final Thread newThread(@NonNull Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("ALog-cleanup-" + thread.getId());
                thread.setDaemon(true);
                return thread;
            }
        }, new RejectedExecutionHandler() {
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
        f27886a = threadPoolExecutor;
    }
}
