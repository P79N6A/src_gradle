package com.ss.android.ugc.aweme.e;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/concurrent/AccountExecutor;", "", "()V", "executorRequest", "Ljava/util/concurrent/ExecutorService;", "executorWork", "requestExecutor", "workExecutor", "accountcommon_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43502a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static ExecutorService f43503b;

    /* renamed from: c  reason: collision with root package name */
    private static final ExecutorService f43504c;

    private a() {
    }

    @NotNull
    public static ExecutorService a() {
        return f43503b;
    }

    @NotNull
    public static ExecutorService b() {
        return f43504c;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f43503b = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f43504c = threadPoolExecutor2;
    }
}
