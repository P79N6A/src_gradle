package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.JvmField;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.b.i;
import kotlinx.coroutines.b.j;
import kotlinx.coroutines.internal.s;
import kotlinx.coroutines.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001d\u0010\u000f\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000eH&R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate", "()Lkotlin/coroutines/Continuation;", "getExceptionalResult", "", "state", "", "getSuccessfulResult", "(Ljava/lang/Object;)Ljava/lang/Object;", "run", "", "takeState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class at<T> extends i {
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public int f83815e;

    @Nullable
    public abstract Object a();

    public <T> T a(@Nullable Object obj) {
        return obj;
    }

    @NotNull
    public abstract c<T> d();

    public final void run() {
        e context;
        bk bkVar;
        Object a2;
        j jVar = this.g;
        try {
            c d2 = d();
            if (d2 != null) {
                aq aqVar = (aq) d2;
                c<T> cVar = aqVar.f83812d;
                context = cVar.getContext();
                if (bz.a(this.f83815e)) {
                    bkVar = (bk) context.get(bk.f4367c);
                } else {
                    bkVar = null;
                }
                Object a3 = a();
                a2 = v.a(context, aqVar.f83810b);
                if (bkVar != null) {
                    if (!bkVar.b()) {
                        cVar.resumeWith(l.m673constructorimpl(m.a(bkVar.k())));
                        v.b(context, a2);
                        jVar.b();
                        return;
                    }
                }
                Throwable b2 = b(a3);
                if (b2 != null) {
                    cVar.resumeWith(l.m673constructorimpl(m.a(s.a(b2, cVar))));
                } else {
                    cVar.resumeWith(l.m673constructorimpl(a(a3)));
                }
                v.b(context, a2);
                jVar.b();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th) {
            try {
                throw new ap("Unexpected exception running " + this, th);
            } catch (Throwable th2) {
                jVar.b();
                throw th2;
            }
        }
    }

    public at(int i) {
        this.f83815e = i;
    }

    @Nullable
    public static Throwable b(@Nullable Object obj) {
        if (!(obj instanceof u)) {
            obj = null;
        }
        u uVar = (u) obj;
        if (uVar != null) {
            return uVar.f83971b;
        }
        return null;
    }
}
