package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/ThreadPoolDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcherBase;", "nThreads", "", "name", "", "(ILjava/lang/String;)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "threadNo", "Ljava/util/concurrent/atomic/AtomicInteger;", "close", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ce extends bc {

    /* renamed from: c  reason: collision with root package name */
    public final AtomicInteger f83907c = new AtomicInteger();

    /* renamed from: d  reason: collision with root package name */
    public final int f83908d;

    /* renamed from: e  reason: collision with root package name */
    public final String f83909e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Executor f83910f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/PoolThread;", "target", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "newThread"}, k = 3, mv = {1, 1, 13})
    static final class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ce f83911a;

        a(ce ceVar) {
            this.f83911a = ceVar;
        }

        public final /* synthetic */ Thread newThread(Runnable runnable) {
            String str;
            ce ceVar = this.f83911a;
            Intrinsics.checkExpressionValueIsNotNull(runnable, "target");
            if (this.f83911a.f83908d == 1) {
                str = this.f83911a.f83909e;
            } else {
                str = this.f83911a.f83909e + "-" + this.f83911a.f83907c.incrementAndGet();
            }
            return new bx(ceVar, runnable, str);
        }
    }

    @NotNull
    public final Executor a() {
        return this.f83910f;
    }

    public final void close() {
        Executor a2 = a();
        if (a2 != null) {
            ((ExecutorService) a2).shutdown();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.concurrent.ExecutorService");
    }

    @NotNull
    public final String toString() {
        return "ThreadPoolDispatcher[" + this.f83908d + ", " + this.f83909e + ']';
    }

    public ce(int i, @NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f83908d = i;
        this.f83909e = str;
        ScheduledExecutorService a2 = cf.a(this.f83908d, new a(this));
        Intrinsics.checkExpressionValueIsNotNull(a2, "Executors.newScheduledTh….incrementAndGet())\n    }");
        this.f83910f = a2;
        this.f83875a = e.a(a());
    }
}
