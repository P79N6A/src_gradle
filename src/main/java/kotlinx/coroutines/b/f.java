package kotlinx.coroutines.b;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bb;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u001c\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010 \u001a\u00060\u0016j\u0002`\u0017H\u0016J\u001c\u0010\u001d\u001a\u00020\u001b2\n\u0010 \u001a\u00060\u0016j\u0002`\u00172\u0006\u0010!\u001a\u00020\"H\u0002J\u0014\u0010#\u001a\u00020\u001b2\n\u0010$\u001a\u00060\u0016j\u0002`\u0017H\u0016J\b\u0010%\u001a\u00020&H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0016j\u0002`\u00170\u0015X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;", "Ljava/util/concurrent/Executor;", "dispatcher", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "parallelism", "", "taskMode", "Lkotlinx/coroutines/scheduling/TaskMode;", "(Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;ILkotlinx/coroutines/scheduling/TaskMode;)V", "getDispatcher", "()Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "executor", "getExecutor", "()Ljava/util/concurrent/Executor;", "inFlightTasks", "Lkotlinx/atomicfu/AtomicInt;", "getParallelism", "()I", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getTaskMode", "()Lkotlinx/coroutines/scheduling/TaskMode;", "afterTask", "", "close", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "fair", "", "execute", "command", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class f extends bb implements Executor, j {

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f83853e = AtomicIntegerFieldUpdater.newUpdater(f.class, "inFlightTasks");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final d f83854a;

    /* renamed from: c  reason: collision with root package name */
    public final int f83855c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f83856d = new ConcurrentLinkedQueue<>();
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final l f83857f;
    private volatile int inFlightTasks = 0;

    @NotNull
    public final Executor a() {
        return this;
    }

    @NotNull
    public final l c() {
        return this.f83857f;
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @NotNull
    public final String toString() {
        return super.toString() + "[dispatcher = " + this.f83854a + ']';
    }

    public final void b() {
        Runnable poll = this.f83856d.poll();
        if (poll != null) {
            this.f83854a.a(poll, this, true);
            return;
        }
        f83853e.decrementAndGet(this);
        Runnable poll2 = this.f83856d.poll();
        if (poll2 != null) {
            a(poll2, true);
        }
    }

    public final void execute(@NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "command");
        a(runnable, false);
    }

    public final void a(@NotNull e eVar, @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(runnable, "block");
        a(runnable, false);
    }

    private final void a(Runnable runnable, boolean z) {
        while (f83853e.incrementAndGet(this) > this.f83855c) {
            this.f83856d.add(runnable);
            if (f83853e.decrementAndGet(this) < this.f83855c) {
                runnable = this.f83856d.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f83854a.a(runnable, this, z);
    }

    public f(@NotNull d dVar, int i, @NotNull l lVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "dispatcher");
        Intrinsics.checkParameterIsNotNull(lVar, "taskMode");
        this.f83854a = dVar;
        this.f83855c = i;
        this.f83857f = lVar;
    }
}
