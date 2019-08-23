package com.ss.android.ugc.aweme.lego;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/LegoExecutor;", "", "()V", "THREAD_PRIORITY_LEVEL", "", "executorP0", "Ljava/util/concurrent/ExecutorService;", "executorRequest", "executorWork", "handler", "Landroid/os/Handler;", "handlerThread", "Landroid/os/HandlerThread;", "getLegoHandler", "requestExecutor", "requestType", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "workExecutor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53062a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f53063b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static ExecutorService f53064c;

    /* renamed from: d  reason: collision with root package name */
    private static final ExecutorService f53065d;

    /* renamed from: e  reason: collision with root package name */
    private static final ExecutorService f53066e;

    /* renamed from: f  reason: collision with root package name */
    private static final HandlerThread f53067f = new HandlerThread("LegoHandler");
    private static Handler g = new Handler(f53067f.getLooper());

    private b() {
    }

    @NotNull
    public static ExecutorService a() {
        return f53064c;
    }

    @NotNull
    public static Handler b() {
        return g;
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f53064c = threadPoolExecutor;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 90, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f53065d = threadPoolExecutor2;
        ExecutorService c2 = h.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "ThreadPoolHelper.getIOExecutor()");
        f53066e = c2;
        ExecutorService executorService = f53064c;
        if (executorService != null) {
            ((ThreadPoolExecutor) executorService).allowCoreThreadTimeOut(true);
            f53067f.start();
            Process.setThreadPriority(f53067f.getThreadId(), -20);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ThreadPoolExecutor");
    }

    @NotNull
    public final ExecutorService a(@NotNull e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f53062a, false, 55123, new Class[]{e.class}, ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[]{eVar2}, this, f53062a, false, 55123, new Class[]{e.class}, ExecutorService.class);
        }
        Intrinsics.checkParameterIsNotNull(eVar2, "requestType");
        if (eVar2 == e.P0) {
            return f53066e;
        }
        return f53065d;
    }
}
