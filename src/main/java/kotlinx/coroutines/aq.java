package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\tJ\u0017\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0016J\u0016\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\b¢\u0006\u0002\u0010\u001dJ\u0011\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\bJ\t\u0010%\u001a\u00020&H\bJ\u0016\u0010'\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\b¢\u0006\u0002\u0010\u001dJ\u0011\u0010(\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$H\bJ\u001e\u0010)\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\n\u0010,\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u000b8\u0000X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "_state$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "countOrElement", "delegate", "getDelegate", "()Lkotlin/coroutines/Continuation;", "dispatchYield", "", "value", "dispatchYield$kotlinx_coroutines_core", "(Ljava/lang/Object;)V", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resumeCancellable", "resumeCancellableWithException", "exception", "", "resumeCancelled", "", "resumeUndispatched", "resumeUndispatchedWithException", "resumeWith", "result", "Lkotlin/Result;", "takeState", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class aq<T> extends at<T> implements c<T>, e {
    @Nullable
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public Object f83809a = as.f83814a;
    @NotNull
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public final Object f83810b;
    @NotNull
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final aa f83811c;
    @NotNull
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public final c<T> f83812d;
    @Nullable
    private final e h;

    @NotNull
    public final c<T> d() {
        return this;
    }

    @NotNull
    public final kotlin.coroutines.e getContext() {
        return this.f83812d.getContext();
    }

    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final e getCallerFrame() {
        return this.h;
    }

    @Nullable
    public final Object a() {
        boolean z;
        Object obj = this.f83809a;
        if (obj != as.f83814a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f83809a = as.f83814a;
            return obj;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final String toString() {
        return "DispatchedContinuation[" + this.f83811c + ", " + ai.a(this.f83812d) + ']';
    }

    public final void resumeWith(@NotNull Object obj) {
        kotlin.coroutines.e context;
        Object a2;
        kotlin.coroutines.e context2 = this.f83812d.getContext();
        Object a3 = v.a(obj);
        if (this.f83811c.a(context2)) {
            this.f83809a = a3;
            this.f83815e = 0;
            this.f83811c.a(context2, this);
            return;
        }
        ay a4 = cd.a();
        if (a4.f()) {
            this.f83809a = a3;
            this.f83815e = 0;
            a4.a((at<?>) this);
            return;
        }
        a4.a(true);
        try {
            context = getContext();
            a2 = v.a(context, this.f83810b);
            this.f83812d.resumeWith(obj);
            v.b(context, a2);
            do {
            } while (a4.e());
            a4.b(true);
        } catch (Throwable th) {
            try {
                throw new ap("Unexpected exception in unconfined event loop", th);
            } catch (Throwable th2) {
                a4.b(true);
                throw th2;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aq(@NotNull aa aaVar, @NotNull c<? super T> cVar) {
        super(0);
        Intrinsics.checkParameterIsNotNull(aaVar, "dispatcher");
        Intrinsics.checkParameterIsNotNull(cVar, "continuation");
        this.f83811c = aaVar;
        this.f83812d = cVar;
        this.h = (e) (!(this.f83812d instanceof e) ? null : this.f83812d);
        this.f83810b = v.a(getContext());
    }
}
