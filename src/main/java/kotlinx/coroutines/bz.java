package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a-\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0002\u0010\u0016\u001a(\u0010\u0018\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a(\u0010\u001b\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000XT¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e\"\u0018\u0010\u000f\u001a\u00020\r*\u00020\u00018@X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"MODE_ATOMIC_DEFAULT", "", "MODE_ATOMIC_DEFAULT$annotations", "()V", "MODE_CANCELLABLE", "MODE_CANCELLABLE$annotations", "MODE_DIRECT", "MODE_DIRECT$annotations", "MODE_IGNORE", "MODE_IGNORE$annotations", "MODE_UNDISPATCHED", "MODE_UNDISPATCHED$annotations", "isCancellableMode", "", "(I)Z", "isDispatchedMode", "resumeMode", "", "T", "Lkotlin/coroutines/Continuation;", "value", "mode", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;I)V", "resumeUninterceptedMode", "resumeUninterceptedWithExceptionMode", "exception", "", "resumeWithExceptionMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class bz {
    public static final boolean a(int i) {
        return i == 1;
    }

    public static final boolean b(int i) {
        return i == 0 || i == 1;
    }

    public static final <T> void a(@NotNull c<? super T> cVar, T t, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        switch (i) {
            case 0:
                cVar.resumeWith(l.m673constructorimpl(t));
                return;
            case 1:
                as.a(cVar, t);
                return;
            case 2:
                as.b(cVar, t);
                return;
            case 3:
                aq aqVar = (aq) cVar;
                e context = aqVar.getContext();
                Object a2 = v.a(context, aqVar.f83810b);
                try {
                    aqVar.f83812d.resumeWith(l.m673constructorimpl(t));
                    return;
                } finally {
                    v.b(context, a2);
                }
            case 4:
                return;
            default:
                throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    public static final <T> void b(@NotNull c<? super T> cVar, T t, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        switch (i) {
            case 0:
                b.a(cVar).resumeWith(l.m673constructorimpl(t));
                return;
            case 1:
                as.a(b.a(cVar), t);
                return;
            case 2:
                cVar.resumeWith(l.m673constructorimpl(t));
                return;
            case 3:
                e context = cVar.getContext();
                Object a2 = v.a(context, null);
                try {
                    cVar.resumeWith(l.m673constructorimpl(t));
                    return;
                } finally {
                    v.b(context, a2);
                }
            case 4:
                return;
            default:
                throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }

    public static final <T> void a(@NotNull c<? super T> cVar, @NotNull Throwable th, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(th, "exception");
        switch (i) {
            case 0:
                cVar.resumeWith(l.m673constructorimpl(m.a(th)));
                return;
            case 1:
                as.a(cVar, th);
                return;
            case 2:
                as.b(cVar, th);
                return;
            case 3:
                aq aqVar = (aq) cVar;
                e context = aqVar.getContext();
                Object a2 = v.a(context, aqVar.f83810b);
                try {
                    c<T> cVar2 = aqVar.f83812d;
                    cVar2.resumeWith(l.m673constructorimpl(m.a(s.a(th, cVar2))));
                    return;
                } finally {
                    v.b(context, a2);
                }
            case 4:
                return;
            default:
                throw new IllegalStateException(("Invalid mode " + i).toString());
        }
    }
}
