package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public abstract class d extends a {
    private final e _context;

    /* renamed from: a  reason: collision with root package name */
    private transient c<Object> f83528a;

    @NotNull
    public e getContext() {
        e eVar = this._context;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        c<Object> cVar = this.f83528a;
        if (!(cVar == null || cVar == this)) {
            e.b bVar = getContext().get(kotlin.coroutines.d.f83521b);
            if (bVar == null) {
                Intrinsics.throwNpe();
            }
            ((kotlin.coroutines.d) bVar).b(cVar);
        }
        this.f83528a = c.f83527a;
    }

    @NotNull
    public final c<Object> intercepted() {
        c<Object> cVar = this.f83528a;
        if (cVar == null) {
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.f83521b);
            if (dVar != null) {
                cVar = dVar.a(this);
            } else {
                cVar = this;
            }
            this.f83528a = cVar;
        }
        return cVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(@org.jetbrains.annotations.Nullable kotlin.coroutines.c<java.lang.Object> r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x0007
            kotlin.coroutines.e r0 = r2.getContext()
            goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.d.<init>(kotlin.coroutines.c):void");
    }

    public d(@Nullable c<Object> cVar, @Nullable e eVar) {
        super(cVar);
        this._context = eVar;
    }
}
