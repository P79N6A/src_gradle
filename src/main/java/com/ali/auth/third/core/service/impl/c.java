package com.ali.auth.third.core.service.impl;

import com.ali.auth.third.core.trace.SDKLogger;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f4959a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f4960b;

    c(a aVar, Runnable runnable) {
        this.f4960b = aVar;
        this.f4959a = runnable;
    }

    public void run() {
        try {
            this.f4959a.run();
        } catch (Throwable th) {
            SDKLogger.e("kernel", th.getMessage(), th);
        }
    }
}
