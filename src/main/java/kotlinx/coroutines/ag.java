package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.a.a;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\\\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\n2'\u0010\u000b\u001a#\b\u0001\u0012\u0004\u0012\u0002H\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0012¢\u0006\u0002\b\u00132\u0006\u0010\u0014\u001a\u0002H\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public enum ag {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    @InternalCoroutinesApi
    public final <T> void invoke(@NotNull Function1<? super c<? super T>, ? extends Object> function1, @NotNull c<? super T> cVar) {
        e context;
        Object a2;
        Intrinsics.checkParameterIsNotNull(function1, "block");
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        switch (ah.f83793a[ordinal()]) {
            case 1:
                Intrinsics.checkParameterIsNotNull(function1, "receiver$0");
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                try {
                    as.a(b.a(b.a(function1, cVar)), Unit.INSTANCE);
                    break;
                } catch (Throwable th) {
                    cVar.resumeWith(l.m673constructorimpl(m.a(th)));
                    return;
                }
            case 2:
                Intrinsics.checkParameterIsNotNull(function1, "$this$startCoroutine");
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                b.a(b.a(function1, cVar)).resumeWith(l.m673constructorimpl(Unit.INSTANCE));
                return;
            case 3:
                Intrinsics.checkParameterIsNotNull(function1, "receiver$0");
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                c a3 = g.a(cVar);
                try {
                    context = cVar.getContext();
                    a2 = v.a(context, null);
                    Object invoke = ((Function1) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(a3);
                    v.b(context, a2);
                    if (invoke != b.a()) {
                        a3.resumeWith(l.m673constructorimpl(invoke));
                    }
                    return;
                } catch (Throwable th2) {
                    a3.resumeWith(l.m673constructorimpl(m.a(th2)));
                    break;
                }
            case 4:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @InternalCoroutinesApi
    public final <R, T> void invoke(@NotNull Function2<? super R, ? super c<? super T>, ? extends Object> function2, R r, @NotNull c<? super T> cVar) {
        e context;
        Object a2;
        Intrinsics.checkParameterIsNotNull(function2, "block");
        Intrinsics.checkParameterIsNotNull(cVar, "completion");
        switch (ah.f83794b[ordinal()]) {
            case 1:
                a.a(function2, r, cVar);
                return;
            case 2:
                Intrinsics.checkParameterIsNotNull(function2, "$this$startCoroutine");
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                b.a(b.a(function2, r, cVar)).resumeWith(l.m673constructorimpl(Unit.INSTANCE));
                return;
            case 3:
                Intrinsics.checkParameterIsNotNull(function2, "receiver$0");
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                c a3 = g.a(cVar);
                try {
                    context = cVar.getContext();
                    a2 = v.a(context, null);
                    Object invoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, a3);
                    v.b(context, a2);
                    if (invoke != b.a()) {
                        a3.resumeWith(l.m673constructorimpl(invoke));
                    }
                    return;
                } catch (Throwable th) {
                    a3.resumeWith(l.m673constructorimpl(m.a(th)));
                    return;
                }
            case 4:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
