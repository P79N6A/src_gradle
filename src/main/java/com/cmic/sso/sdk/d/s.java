package com.cmic.sso.sdk.d;

import android.content.Context;
import android.os.Bundle;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.lang.Thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f23087a;

    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Thread.UncaughtExceptionHandler f23088a;

        /* access modifiers changed from: protected */
        public abstract void a();

        protected a() {
            this.f23088a = new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                }
            };
        }

        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.f23088a);
            a();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }

        protected a(final Context context, final Bundle bundle) {
            this.f23088a = new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    AuthnHelper.getInstance(context).callBackResult("200025", "发生未知错误", bundle, null, th);
                }
            };
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
        f23087a = threadPoolExecutor;
    }

    public static void a(a aVar) {
        f23087a.execute(aVar);
    }
}
