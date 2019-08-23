package kotlinx.coroutines.a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.as;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\b\u001a>\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0007*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\n\u001aR\u0010\u0006\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0007*\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\f2\u0006\u0010\r\u001a\u0002H\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0003H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"runSafely", "", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function0;", "startCoroutineCancellable", "T", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class a {
    public static final <R, T> void a(@NotNull Function2<? super R, ? super c<? super T>, ? extends Object> function2, R r, @NotNull c<? super T> cVar) {
        Intrinsics.checkParameterIsNotNull(function2, "receiver$0");
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        try {
            as.a(b.a(b.a(function2, r, cVar)), Unit.INSTANCE);
        } catch (Throwable th) {
            cVar.resumeWith(l.m673constructorimpl(m.a(th)));
        }
    }
}
