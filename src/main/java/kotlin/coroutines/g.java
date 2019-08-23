package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.coroutines.a.b;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin
@PublishedApi
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u001aB\u0015\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "(Lkotlin/coroutines/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "getOrThrow", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
public final class g<T> implements c<T>, e {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final a f83523a = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<g<?>, Object> f83524d = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "b");

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f83525b;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f83526c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002RZ\u0010\u0003\u001aF\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0006*\"\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0006*\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00040\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006\b"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "()V", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "RESULT$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @NotNull
    public final e getContext() {
        return this.f83526c.getContext();
    }

    @Nullable
    public final e getCallerFrame() {
        c<T> cVar = this.f83526c;
        if (!(cVar instanceof e)) {
            cVar = null;
        }
        return (e) cVar;
    }

    @NotNull
    public final String toString() {
        return "SafeContinuation for " + this.f83526c;
    }

    @Nullable
    @PublishedApi
    public final Object a() {
        Object obj = this.f83525b;
        if (obj == kotlin.coroutines.a.a.UNDECIDED) {
            if (f83524d.compareAndSet(this, kotlin.coroutines.a.a.UNDECIDED, b.a())) {
                return b.a();
            }
            obj = this.f83525b;
        }
        if (obj == kotlin.coroutines.a.a.RESUMED) {
            return b.a();
        }
        if (!(obj instanceof l.b)) {
            return obj;
        }
        throw ((l.b) obj).exception;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public g(@NotNull c<? super T> cVar) {
        this(cVar, kotlin.coroutines.a.a.UNDECIDED);
        Intrinsics.checkParameterIsNotNull(cVar, "delegate");
    }

    public final void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.f83525b;
            if (obj2 == kotlin.coroutines.a.a.UNDECIDED) {
                if (f83524d.compareAndSet(this, kotlin.coroutines.a.a.UNDECIDED, obj)) {
                    return;
                }
            } else if (obj2 != b.a()) {
                throw new IllegalStateException("Already resumed");
            } else if (f83524d.compareAndSet(this, b.a(), kotlin.coroutines.a.a.RESUMED)) {
                this.f83526c.resumeWith(obj);
                return;
            }
        }
    }

    private g(@NotNull c<? super T> cVar, @Nullable Object obj) {
        Intrinsics.checkParameterIsNotNull(cVar, "delegate");
        this.f83526c = cVar;
        this.f83525b = obj;
    }
}
