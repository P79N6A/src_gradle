package com.bytedance.jedi.arch;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/arch/SmartHandlerScheduler;", "Lio/reactivex/Scheduler;", "handler", "Landroid/os/Handler;", "async", "", "(Landroid/os/Handler;Z)V", "createWorker", "Lio/reactivex/Scheduler$Worker;", "scheduleDirect", "Lio/reactivex/disposables/Disposable;", "rawRunnable", "Ljava/lang/Runnable;", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "HandlerWorker", "ScheduledRunnable", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class v extends Scheduler {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f21420a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21421b = false;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/arch/SmartHandlerScheduler$HandlerWorker;", "Lio/reactivex/Scheduler$Worker;", "handler", "Landroid/os/Handler;", "async", "", "(Landroid/os/Handler;Z)V", "disposed", "dispose", "", "isDisposed", "schedule", "Lio/reactivex/disposables/Disposable;", "rawRunnable", "Ljava/lang/Runnable;", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "arch_release"}, k = 1, mv = {1, 1, 15})
    static final class a extends Scheduler.Worker {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f21422a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f21423b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21424c;

        public final boolean isDisposed() {
            return this.f21422a;
        }

        public final void dispose() {
            this.f21422a = true;
            this.f21423b.removeCallbacksAndMessages(this);
        }

        public a(@NotNull Handler handler, boolean z) {
            Intrinsics.checkParameterIsNotNull(handler, "handler");
            this.f21423b = handler;
            this.f21424c = z;
        }

        @NotNull
        @SuppressLint({"NewApi"})
        public final Disposable schedule(@NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkParameterIsNotNull(runnable, "rawRunnable");
            Intrinsics.checkParameterIsNotNull(timeUnit, "unit");
            if (this.f21422a) {
                Disposable disposed = Disposables.disposed();
                Intrinsics.checkExpressionValueIsNotNull(disposed, "Disposables.disposed()");
                return disposed;
            }
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            Intrinsics.checkExpressionValueIsNotNull(onSchedule, "RxJavaPlugins.onSchedule(rawRunnable)");
            boolean b2 = w.b();
            b bVar = new b(this.f21423b, onSchedule, b2);
            if (b2) {
                bVar.run();
                return bVar;
            }
            Runnable runnable2 = bVar;
            Message obtain = Message.obtain(this.f21423b, runnable2);
            obtain.obj = this;
            if (this.f21424c) {
                Intrinsics.checkExpressionValueIsNotNull(obtain, "message");
                obtain.setAsynchronous(true);
            }
            this.f21423b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f21422a) {
                return bVar;
            }
            this.f21423b.removeCallbacks(runnable2);
            Disposable disposed2 = Disposables.disposed();
            Intrinsics.checkExpressionValueIsNotNull(disposed2, "Disposables.disposed()");
            return disposed2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/jedi/arch/SmartHandlerScheduler$ScheduledRunnable;", "Ljava/lang/Runnable;", "Lio/reactivex/disposables/Disposable;", "handler", "Landroid/os/Handler;", "delegate", "main", "", "(Landroid/os/Handler;Ljava/lang/Runnable;Z)V", "disposed", "dispose", "", "isDisposed", "run", "arch_release"}, k = 1, mv = {1, 1, 15})
    static final class b implements Disposable, Runnable {

        /* renamed from: a  reason: collision with root package name */
        private volatile boolean f21425a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f21426b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f21427c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f21428d;

        public final boolean isDisposed() {
            return this.f21425a;
        }

        public final void dispose() {
            if (!this.f21428d) {
                this.f21426b.removeCallbacks(this);
            }
            this.f21425a = true;
        }

        public final void run() {
            try {
                this.f21427c.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }

        public b(@NotNull Handler handler, @NotNull Runnable runnable, boolean z) {
            Intrinsics.checkParameterIsNotNull(handler, "handler");
            Intrinsics.checkParameterIsNotNull(runnable, "delegate");
            this.f21426b = handler;
            this.f21427c = runnable;
            this.f21428d = z;
        }
    }

    @NotNull
    public final Scheduler.Worker createWorker() {
        return new a(this.f21420a, this.f21421b);
    }

    public v(@NotNull Handler handler, boolean z) {
        Intrinsics.checkParameterIsNotNull(handler, "handler");
        this.f21420a = handler;
    }

    @NotNull
    public final Disposable scheduleDirect(@NotNull Runnable runnable, long j, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkParameterIsNotNull(runnable, "rawRunnable");
        Intrinsics.checkParameterIsNotNull(timeUnit, "unit");
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        Intrinsics.checkExpressionValueIsNotNull(onSchedule, "RxJavaPlugins.onSchedule(rawRunnable)");
        boolean b2 = w.b();
        b bVar = new b(this.f21420a, onSchedule, b2);
        if (b2) {
            bVar.run();
            return bVar;
        }
        this.f21420a.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
