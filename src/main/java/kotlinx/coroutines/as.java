package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\b\u001a\"\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a;\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\b\u001a.\u0010\u0015\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0000\u001a%\u0010\u0019\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001a\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u001b\u001a \u0010\u001c\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a%\u0010\u001f\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001a\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\u001b\u001a \u0010 \u001a\u00020\u0005\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u001a\u0010\u0010!\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\fH\u0002\u001a\u0019\u0010\"\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\b\u001a\u0012\u0010#\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00050\u0011H\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006$"}, d2 = {"UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED$annotations", "()V", "runUnconfinedEventLoop", "", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "dispatch", "T", "Lkotlinx/coroutines/DispatchedTask;", "mode", "", "executeUnconfined", "", "Lkotlinx/coroutines/DispatchedContinuation;", "contState", "", "doYield", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "useMode", "resumeCancellable", "value", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "resumeCancellableWithException", "exception", "", "resumeDirect", "resumeDirectWithException", "resumeUnconfined", "resumeWithStackTrace", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class as {

    /* renamed from: a  reason: collision with root package name */
    public static final t f83814a = new t("UNDEFINED");

    private static final void a(@NotNull at<?> atVar) {
        ay a2 = cd.a();
        if (a2.f()) {
            a2.a(atVar);
            return;
        }
        a2.a(true);
        try {
            a(atVar, atVar.d(), 3);
            do {
            } while (a2.e());
            a2.b(true);
        } catch (Throwable th) {
            a2.b(true);
            throw th;
        }
    }

    public static final <T> void b(@NotNull c<? super T> cVar, T t) {
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        if (cVar instanceof aq) {
            ((aq) cVar).f83812d.resumeWith(l.m673constructorimpl(t));
        } else {
            cVar.resumeWith(l.m673constructorimpl(t));
        }
    }

    public static final <T> void b(@NotNull c<? super T> cVar, @NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(th, "exception");
        if (cVar instanceof aq) {
            c<T> cVar2 = ((aq) cVar).f83812d;
            cVar2.resumeWith(l.m673constructorimpl(m.a(s.a(th, cVar2))));
            return;
        }
        cVar.resumeWith(l.m673constructorimpl(m.a(s.a(th, cVar))));
    }

    public static final <T> void a(@NotNull at<? super T> atVar, int i) {
        Intrinsics.checkParameterIsNotNull(atVar, "receiver$0");
        c d2 = atVar.d();
        if (!bz.b(i) || !(d2 instanceof aq) || bz.a(i) != bz.a(atVar.f83815e)) {
            a(atVar, d2, i);
            return;
        }
        aa aaVar = ((aq) d2).f83811c;
        e context = d2.getContext();
        if (aaVar.a(context)) {
            aaVar.a(context, atVar);
        } else {
            a(atVar);
        }
    }

    public static final <T> void a(@NotNull c<? super T> cVar, T t) {
        boolean z;
        e context;
        Object a2;
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        if (cVar instanceof aq) {
            aq aqVar = (aq) cVar;
            if (aqVar.f83811c.a(aqVar.getContext())) {
                aqVar.f83809a = t;
                aqVar.f83815e = 1;
                aqVar.f83811c.a(aqVar.getContext(), aqVar);
                return;
            }
            ay a3 = cd.a();
            if (a3.f()) {
                aqVar.f83809a = t;
                aqVar.f83815e = 1;
                a3.a((at<?>) aqVar);
                return;
            }
            a3.a(true);
            try {
                bk bkVar = (bk) aqVar.getContext().get(bk.f4367c);
                if (bkVar == null || bkVar.b()) {
                    z = false;
                } else {
                    aqVar.resumeWith(l.m673constructorimpl(m.a(bkVar.k())));
                    z = true;
                }
                if (!z) {
                    context = aqVar.getContext();
                    a2 = v.a(context, aqVar.f83810b);
                    aqVar.f83812d.resumeWith(l.m673constructorimpl(t));
                    v.b(context, a2);
                }
                do {
                } while (a3.e());
                a3.b(true);
            } catch (Throwable th) {
                try {
                    throw new ap("Unexpected exception in unconfined event loop", th);
                } catch (Throwable th2) {
                    a3.b(true);
                    throw th2;
                }
            }
        } else {
            cVar.resumeWith(l.m673constructorimpl(t));
        }
    }

    public static final <T> void a(@NotNull c<? super T> cVar, @NotNull Throwable th) {
        boolean z;
        e context;
        Object a2;
        Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(th, "exception");
        if (cVar instanceof aq) {
            aq aqVar = (aq) cVar;
            e context2 = aqVar.f83812d.getContext();
            u uVar = new u(th);
            if (aqVar.f83811c.a(context2)) {
                aqVar.f83809a = new u(th);
                aqVar.f83815e = 1;
                aqVar.f83811c.a(context2, aqVar);
                return;
            }
            ay a3 = cd.a();
            if (a3.f()) {
                aqVar.f83809a = uVar;
                aqVar.f83815e = 1;
                a3.a((at<?>) aqVar);
                return;
            }
            a3.a(true);
            try {
                bk bkVar = (bk) aqVar.getContext().get(bk.f4367c);
                if (bkVar == null || bkVar.b()) {
                    z = false;
                } else {
                    aqVar.resumeWith(l.m673constructorimpl(m.a(bkVar.k())));
                    z = true;
                }
                if (!z) {
                    context = aqVar.getContext();
                    a2 = v.a(context, aqVar.f83810b);
                    c<T> cVar2 = aqVar.f83812d;
                    cVar2.resumeWith(l.m673constructorimpl(m.a(s.a(th, cVar2))));
                    v.b(context, a2);
                }
                do {
                } while (a3.e());
                a3.b(true);
            } catch (Throwable th2) {
                try {
                    throw new ap("Unexpected exception in unconfined event loop", th2);
                } catch (Throwable th3) {
                    a3.b(true);
                    throw th3;
                }
            }
        } else {
            cVar.resumeWith(l.m673constructorimpl(m.a(s.a(th, cVar))));
        }
    }

    private static <T> void a(@NotNull at<? super T> atVar, @NotNull c<? super T> cVar, int i) {
        Intrinsics.checkParameterIsNotNull(atVar, "receiver$0");
        Intrinsics.checkParameterIsNotNull(cVar, "delegate");
        Object a2 = atVar.a();
        Throwable b2 = at.b(a2);
        if (b2 != null) {
            bz.a(cVar, b2, i);
        } else {
            bz.a(cVar, atVar.a(a2), i);
        }
    }
}
