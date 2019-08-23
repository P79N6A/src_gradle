package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a.a;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\nø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\b\u0010\r\u001a\u00020\u000eH\u0014R6\u0010\u0005\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006¢\u0006\u0002\b\nX\u000eø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/LazyDeferredCoroutine;", "T", "Lkotlinx/coroutines/DeferredCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "onStart", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class bq<T> extends an<T> {

    /* renamed from: b  reason: collision with root package name */
    private Function2<? super af, ? super c<? super T>, ? extends Object> f83896b;

    /* access modifiers changed from: protected */
    public final void d() {
        Function2<? super af, ? super c<? super T>, ? extends Object> function2 = this.f83896b;
        if (function2 != null) {
            this.f83896b = null;
            a.a(function2, this, this);
            return;
        }
        throw new IllegalStateException("Already started".toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bq(@NotNull e eVar, @NotNull Function2<? super af, ? super c<? super T>, ? extends Object> function2) {
        super(eVar, false);
        Intrinsics.checkParameterIsNotNull(eVar, "parentContext");
        Intrinsics.checkParameterIsNotNull(function2, "block");
        this.f83896b = function2;
    }
}
