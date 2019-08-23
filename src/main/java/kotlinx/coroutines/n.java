package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/CancelledContinuation;", "Lkotlinx/coroutines/CompletedExceptionally;", "continuation", "Lkotlin/coroutines/Continuation;", "cause", "", "handled", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;Z)V", "Lkotlinx/atomicfu/AtomicBoolean;", "resumed", "makeHandled", "makeResumed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class n extends u {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f83962a = AtomicIntegerFieldUpdater.newUpdater(n.class, "handled");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f83963c = AtomicIntegerFieldUpdater.newUpdater(n.class, "resumed");
    private volatile int handled;
    private volatile int resumed;

    public final boolean a() {
        return f83963c.compareAndSet(this, 0, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(@org.jetbrains.annotations.NotNull kotlin.coroutines.c<?> r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "continuation"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            if (r4 != 0) goto L_0x0021
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
        L_0x0021:
            r2.<init>(r4)
            r3 = 0
            r2.resumed = r3
            r2.handled = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.n.<init>(kotlin.coroutines.c, java.lang.Throwable, boolean):void");
    }
}
