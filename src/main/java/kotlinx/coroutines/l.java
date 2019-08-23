package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.bk;
import kotlinx.coroutines.internal.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001b\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010&\u001a\u00020\u001a2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\u000fH\u0016J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020\tH\u0002J\b\u0010-\u001a\u00020$H\u0002J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u000200H\u0016J\n\u00101\u001a\u0004\u0018\u00010\u000fH\u0001J\u0010\u00102\u001a\n\u0018\u000103j\u0004\u0018\u0001`4H\u0016J\u001d\u00105\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u00106J\b\u00107\u001a\u00020$H\u0016J\b\u00108\u001a\u00020$H\u0002J\u0017\u00109\u001a\u00020$2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020$0;H\bJ1\u0010<\u001a\u00020$2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`AH\u0016J1\u0010B\u001a\u00020C2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`AH\u0002J;\u0010D\u001a\u00020$2'\u0010=\u001a#\u0012\u0015\u0012\u0013\u0018\u00010(¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b('\u0012\u0004\u0012\u00020$0>j\u0002`A2\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010E\u001a\u00020FH\u0014J\u001a\u0010G\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u001e\u0010H\u001a\u00020$2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000JH\u0016ø\u0001\u0000¢\u0006\u0002\u0010KJ\u001d\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020(2\u0006\u0010,\u001a\u00020\tH\u0000¢\u0006\u0002\bNJ\n\u0010O\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010P\u001a\u00020FH\u0016J\b\u0010Q\u001a\u00020\u001aH\u0002J!\u0010Q\u001a\u0004\u0018\u00010\u000f2\u0006\u0010R\u001a\u00028\u00002\b\u0010S\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u000f2\u0006\u0010M\u001a\u00020(H\u0016J\b\u0010V\u001a\u00020\u001aH\u0002J\u0019\u0010W\u001a\u00020$*\u00020X2\u0006\u0010R\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010YJ\u0014\u0010Z\u001a\u00020$*\u00020X2\u0006\u0010M\u001a\u00020(H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\u0004\u0018\u00010\u000f8@X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getDelegate", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "alreadyResumedError", "", "proposedUpdate", "cancel", "cause", "", "completeResume", "token", "dispatchResume", "mode", "disposeParentHandle", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getResult", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getSuccessfulResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "initCancellability", "installParentCancellationHandler", "invokeHandlerSafely", "block", "Lkotlin/Function0;", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "makeHandler", "Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "nameString", "", "resumeImpl", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeWithExceptionMode", "exception", "resumeWithExceptionMode$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "value", "idempotent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "tryResumeWithException", "trySuspend", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
@PublishedApi
public class l<T> extends at<T> implements e, k<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f83958b = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decision");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f83959c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile int _decision = 0;
    public volatile Object _state = b.f83832a;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final kotlin.coroutines.e f83960a = this.f83961d.getContext();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final c<T> f83961d;
    private volatile av parentHandle;

    /* access modifiers changed from: protected */
    @NotNull
    public String c() {
        return "CancellableContinuation";
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final Object a() {
        return this._state;
    }

    @NotNull
    public final c<T> d() {
        return this.f83961d;
    }

    @NotNull
    public kotlin.coroutines.e getContext() {
        return this.f83960a;
    }

    public final boolean a(@Nullable Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof bv)) {
                return false;
            }
            z = obj instanceof i;
        } while (!f83959c.compareAndSet(this, obj, new n(this, th, z)));
        if (z) {
            try {
                ((i) obj).a(th);
            } catch (Throwable th2) {
                kotlin.coroutines.e context = getContext();
                ac.a(context, new y("Exception in cancellation handler for " + this, th2), null);
            }
        }
        j();
        a(0);
        return true;
    }

    private boolean f() {
        if (!(this._state instanceof bv)) {
            return true;
        }
        return false;
    }

    private final void j() {
        av avVar = this.parentHandle;
        if (avVar != null) {
            avVar.a();
            this.parentHandle = bu.f83898a;
        }
    }

    @Nullable
    public e getCallerFrame() {
        c<T> cVar = this.f83961d;
        if (!(cVar instanceof e)) {
            cVar = null;
        }
        return (e) cVar;
    }

    private final boolean h() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f83958b.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean i() {
        do {
            switch (this._decision) {
                case 0:
                    break;
                case 1:
                    return false;
                default:
                    throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f83958b.compareAndSet(this, 0, 2));
        return true;
    }

    @Nullable
    @PublishedApi
    public final Object b() {
        g();
        if (h()) {
            return b.a();
        }
        Object obj = this._state;
        if (!(obj instanceof u)) {
            return a(obj);
        }
        throw s.a(((u) obj).f83971b, (c<?>) this);
    }

    @NotNull
    public String toString() {
        return c() + '(' + ai.a(this.f83961d) + "){" + this._state + "}@" + ai.a((Object) this);
    }

    private final void g() {
        if (!f()) {
            bk bkVar = (bk) this.f83961d.getContext().get(bk.f4367c);
            if (bkVar != null) {
                bkVar.l();
                av a2 = bk.a.a(bkVar, true, false, new o(bkVar, this), 2, null);
                this.parentHandle = a2;
                if (f()) {
                    a2.a();
                    this.parentHandle = bu.f83898a;
                }
            }
        }
    }

    private final void a(int i) {
        if (!i()) {
            as.a((at<? super T>) this, i);
        }
    }

    public void resumeWith(@NotNull Object obj) {
        a(v.a(obj), this.f83815e);
    }

    private static void c(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final <T> T a(@Nullable Object obj) {
        if (obj instanceof w) {
            return ((w) obj).f83972a;
        }
        return obj;
    }

    @NotNull
    public Throwable a(@NotNull bk bkVar) {
        Intrinsics.checkParameterIsNotNull(bkVar, "parent");
        return bkVar.k();
    }

    public final void a(@NotNull Function1<? super Throwable, Unit> function1) {
        Throwable th;
        Intrinsics.checkParameterIsNotNull(function1, "handler");
        i iVar = null;
        while (true) {
            Object obj = this._state;
            if (obj instanceof b) {
                if (iVar == null) {
                    if (function1 instanceof i) {
                        iVar = (i) function1;
                    } else {
                        iVar = new bh(function1);
                    }
                }
                if (f83959c.compareAndSet(this, obj, iVar)) {
                    return;
                }
            } else if (obj instanceof i) {
                a(function1, obj);
            } else if (obj instanceof n) {
                if (!n.f83962a.compareAndSet((n) obj, 0, 1)) {
                    a(function1, obj);
                }
                try {
                    if (!(obj instanceof u)) {
                        obj = null;
                    }
                    u uVar = (u) obj;
                    if (uVar != null) {
                        th = uVar.f83971b;
                    } else {
                        th = null;
                    }
                    function1.invoke(th);
                    return;
                } catch (Throwable th2) {
                    ac.a(getContext(), new y("Exception in cancellation handler for " + this, th2), null);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(@NotNull c<? super T> cVar, int i) {
        super(1);
        Intrinsics.checkParameterIsNotNull(cVar, "delegate");
        this.f83961d = cVar;
    }

    private final void a(Object obj, int i) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof bv) {
                if (f83959c.compareAndSet(this, obj2, obj)) {
                    j();
                    a(i);
                    return;
                }
            } else if (!(obj2 instanceof n) || !((n) obj2).a()) {
                c(obj);
            } else {
                return;
            }
        }
    }

    private static void a(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    public final void a(@NotNull Throwable th, int i) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
        a((Object) new u(th), 0);
    }

    public final void a(@NotNull aa aaVar, T t) {
        int i;
        Intrinsics.checkParameterIsNotNull(aaVar, "receiver$0");
        c<T> cVar = this.f83961d;
        aa aaVar2 = null;
        if (!(cVar instanceof aq)) {
            cVar = null;
        }
        aq aqVar = (aq) cVar;
        if (aqVar != null) {
            aaVar2 = aqVar.f83811c;
        }
        if (aaVar2 == aaVar) {
            i = 3;
        } else {
            i = this.f83815e;
        }
        a((Object) t, i);
    }
}
