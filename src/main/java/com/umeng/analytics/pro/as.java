package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

public class as implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f80400a;

    /* renamed from: b  reason: collision with root package name */
    private ay f80401b;

    public as() {
        if (Thread.getDefaultUncaughtExceptionHandler() != this) {
            this.f80400a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void a(ay ayVar) {
        this.f80401b = ayVar;
    }

    private void a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f80401b.a(th);
        } else {
            this.f80401b.a(null);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        a(th);
        if (this.f80400a != null && this.f80400a != Thread.getDefaultUncaughtExceptionHandler()) {
            this.f80400a.uncaughtException(thread, th);
        }
    }
}
