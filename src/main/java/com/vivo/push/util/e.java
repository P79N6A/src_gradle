package com.vivo.push.util;

import java.util.concurrent.ThreadFactory;

public final class e implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81661a;

    e(String str) {
        this.f81661a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f81661a);
        thread.setDaemon(true);
        return thread;
    }
}
