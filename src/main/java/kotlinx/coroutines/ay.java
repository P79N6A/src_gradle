package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.b;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0010J\u0010\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0004J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0006\u0010\u001a\u001a\u00020\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0014R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00048TX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0005R\u0014\u0010\t\u001a\u00020\n8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "isActive", "", "()Z", "isEmpty", "isUnconfinedLoopActive", "isUnconfinedQueueEmpty", "nextTime", "", "getNextTime", "()J", "shared", "unconfinedQueue", "Lkotlinx/coroutines/internal/ArrayQueue;", "Lkotlinx/coroutines/DispatchedTask;", "useCount", "decrementUseCount", "", "unconfined", "delta", "dispatchUnconfined", "task", "incrementUseCount", "processNextEvent", "processUnconfinedEvent", "shouldBeProcessedFromContext", "shutdown", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class ay extends aa {

    /* renamed from: a  reason: collision with root package name */
    private long f83822a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f83823c;

    /* renamed from: d  reason: collision with root package name */
    private b<at<?>> f83824d;

    private static long c(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        return g();
    }

    public final boolean f() {
        if (this.f83822a >= c(true)) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        b<at<?>> bVar = this.f83824d;
        if (bVar != null) {
            return bVar.a();
        }
        return true;
    }

    public long b() {
        if (!e()) {
            return Long.MAX_VALUE;
        }
        return d();
    }

    /* access modifiers changed from: protected */
    public long d() {
        b<at<?>> bVar = this.f83824d;
        if (bVar != null && !bVar.a()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    public final boolean e() {
        b<at<?>> bVar = this.f83824d;
        if (bVar == null) {
            return false;
        }
        at atVar = (at) bVar.b();
        if (atVar == null) {
            return false;
        }
        atVar.run();
        return true;
    }

    public final void a(boolean z) {
        this.f83822a += c(z);
        if (!z) {
            this.f83823c = true;
        }
    }

    public final void a(@NotNull at<?> atVar) {
        Intrinsics.checkParameterIsNotNull(atVar, "task");
        b<at<?>> bVar = this.f83824d;
        if (bVar == null) {
            bVar = new b<>();
            this.f83824d = bVar;
        }
        bVar.a(atVar);
    }

    public final void b(boolean z) {
        boolean z2;
        this.f83822a -= c(z);
        if (this.f83822a <= 0) {
            if (this.f83822a == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.f83823c) {
                    h();
                }
                return;
            }
            throw new IllegalStateException("Extra decrementUseCount".toString());
        }
    }
}
