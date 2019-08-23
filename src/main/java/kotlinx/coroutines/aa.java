package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.a;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "plus", "other", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class aa extends a implements d {
    public abstract void a(@NotNull e eVar, @NotNull Runnable runnable);

    @ExperimentalCoroutinesApi
    public boolean a(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        return true;
    }

    public aa() {
        super(d.f83521b);
    }

    @NotNull
    public String toString() {
        return ai.b(this) + '@' + ai.a((Object) this);
    }

    @NotNull
    public final <T> c<T> a(@NotNull c<? super T> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "continuation");
        return new aq<>(this, cVar);
    }

    public final void b(@NotNull c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "continuation");
        Intrinsics.checkParameterIsNotNull(cVar, "continuation");
    }

    @Nullable
    public <E extends e.b> E get(@NotNull e.c<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        if (cVar == d.f83521b) {
            return this;
        }
        return null;
    }

    @NotNull
    public e minusKey(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        if (cVar == d.f83521b) {
            return f.INSTANCE;
        }
        return this;
    }
}
