package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u00028\u0000¢\u0006\u0002\u0010\u000bJ'\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0010¢\u0006\u0002\b\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "joinBlocking", "()Ljava/lang/Object;", "onCompletionInternal", "", "state", "", "mode", "", "suppressed", "", "onCompletionInternal$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class c<T> extends a<T> {

    /* renamed from: b  reason: collision with root package name */
    private final Thread f83901b;

    /* renamed from: e  reason: collision with root package name */
    private final ay f83902e;

    public final T at_() {
        long j;
        ay ayVar = this.f83902e;
        T t = null;
        if (ayVar != null) {
            ayVar.a(false);
        }
        while (!Thread.interrupted()) {
            try {
                ay ayVar2 = this.f83902e;
                if (ayVar2 != null) {
                    j = ayVar2.b();
                } else {
                    j = Long.MAX_VALUE;
                }
                if (!i()) {
                    ch.a().a(this, j);
                } else {
                    T b2 = bp.b(n());
                    if (b2 instanceof u) {
                        t = b2;
                    }
                    u uVar = (u) t;
                    if (uVar == null) {
                        return b2;
                    }
                    throw uVar.f83971b;
                }
            } finally {
                ay ayVar3 = this.f83902e;
                if (ayVar3 != null) {
                    ayVar3.b(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        b((Throwable) interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(@NotNull e eVar, @NotNull Thread thread, @Nullable ay ayVar) {
        super(eVar, true);
        Intrinsics.checkParameterIsNotNull(eVar, "parentContext");
        Intrinsics.checkParameterIsNotNull(thread, "blockedThread");
        this.f83901b = thread;
        this.f83902e = ayVar;
    }

    public final void a(@Nullable Object obj, int i, boolean z) {
        if (!Intrinsics.areEqual((Object) Thread.currentThread(), (Object) this.f83901b)) {
            LockSupport.unpark(this.f83901b);
        }
    }
}
