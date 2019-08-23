package com.google.android.gms.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzbef {
    private static final ExecutorService zzaEb;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbgv("GAC_Transform"));
        zzaEb = threadPoolExecutor;
    }

    public static ExecutorService zzqj() {
        return zzaEb;
    }
}