package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.r;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ'\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0010¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8PX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "defaultResumeMode", "", "getDefaultResumeMode$kotlinx_coroutines_core", "()I", "getResult", "", "onCompletionInternal", "", "state", "mode", "suppressed", "", "onCompletionInternal$kotlinx_coroutines_core", "tryResume", "trySuspend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class ar<T> extends r<T> {

    /* renamed from: b  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f83813b = AtomicIntegerFieldUpdater.newUpdater(ar.class, "_decision");
    volatile int _decision = 0;

    public final int f() {
        return 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ar(@NotNull e eVar, @NotNull c<? super T> cVar) {
        super(eVar, cVar);
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "uCont");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable java.lang.Object r4, int r5, boolean r6) {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0014;
                case 1: goto L_0x001e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Already resumed"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        L_0x0014:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f83813b
            r2 = 2
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001e:
            if (r1 == 0) goto L_0x0021
            return
        L_0x0021:
            super.a(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.ar.a(java.lang.Object, int, boolean):void");
    }
}
