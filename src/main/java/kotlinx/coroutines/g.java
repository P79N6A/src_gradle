package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a.a;
import kotlinx.coroutines.a.b;
import kotlinx.coroutines.internal.r;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aH\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aO\u0010\u0014\u001a\u00020\u0015*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"RESUMED", "", "SUSPENDED", "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "launch", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 1, 13}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class g {
    /* JADX INFO: finally extract failed */
    @Nullable
    public static final <T> Object a(@NotNull e eVar, @NotNull Function2<? super af, ? super c<? super T>, ? extends Object> function2, @NotNull c<? super T> cVar) {
        Object obj;
        boolean z;
        e context = cVar.getContext();
        e plus = context.plus(eVar);
        if (plus == context) {
            r rVar = new r(plus, cVar);
            obj = b.a(rVar, rVar, function2);
        } else if (Intrinsics.areEqual((Object) (d) plus.get(d.f83521b), (Object) (d) context.get(d.f83521b))) {
            cj cjVar = new cj(plus, cVar);
            Object a2 = v.a(plus, null);
            try {
                Object a3 = b.a(cjVar, cjVar, function2);
                v.b(plus, a2);
                obj = a3;
            } catch (Throwable th) {
                v.b(plus, a2);
                throw th;
            }
        } else {
            ar arVar = new ar(plus, cVar);
            arVar.c();
            a.a(function2, arVar, arVar);
            while (true) {
                int i = arVar._decision;
                z = true;
                if (i == 0) {
                    if (ar.f83813b.compareAndSet(arVar, 0, 1)) {
                        break;
                    }
                } else if (i == 2) {
                    z = false;
                } else {
                    throw new IllegalStateException("Already suspended".toString());
                }
            }
            if (z) {
                obj = kotlin.coroutines.a.b.a();
            } else {
                obj = bp.b(arVar.n());
                if (obj instanceof u) {
                    throw ((u) obj).f83971b;
                }
            }
        }
        if (obj == kotlin.coroutines.a.b.a()) {
            kotlin.coroutines.jvm.internal.g.b(cVar);
        }
        return obj;
    }

    @NotNull
    public static /* synthetic */ bk a(af afVar, e eVar, ag agVar, Function2 function2, int i) {
        if ((i & 1) != 0) {
            eVar = f.INSTANCE;
        }
        if ((i & 2) != 0) {
            agVar = ag.DEFAULT;
        }
        return e.a(afVar, eVar, agVar, function2);
    }
}
