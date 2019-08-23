package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.a.b;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.m;
import kotlinx.coroutines.a;
import kotlinx.coroutines.as;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0011\u001a\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013J'\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0010¢\u0006\u0002\b\u001bR\u0019\u0010\n\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8PX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "defaultResumeMode", "", "getDefaultResumeMode$kotlinx_coroutines_core", "()I", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "onCompletionInternal", "", "state", "", "mode", "suppressed", "", "onCompletionInternal$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class r<T> extends a<T> implements e {
    @NotNull
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public final c<T> f83946e;

    public int f() {
        return 2;
    }

    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Nullable
    public final e getCallerFrame() {
        return (e) this.f83946e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(@NotNull kotlin.coroutines.e eVar, @NotNull c<? super T> cVar) {
        super(eVar, true);
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "uCont");
        this.f83946e = cVar;
    }

    public void a(@Nullable Object obj, int i, boolean z) {
        Throwable th;
        if (obj instanceof u) {
            if (i == 4) {
                th = ((u) obj).f83971b;
            } else {
                th = s.a(((u) obj).f83971b, this.f83946e);
            }
            c<T> cVar = this.f83946e;
            Intrinsics.checkParameterIsNotNull(cVar, "receiver$0");
            Intrinsics.checkParameterIsNotNull(th, "exception");
            switch (i) {
                case 0:
                    b.a(cVar).resumeWith(l.m673constructorimpl(m.a(th)));
                    break;
                case 1:
                    as.a(b.a(cVar), th);
                    break;
                case 2:
                    cVar.resumeWith(l.m673constructorimpl(m.a(th)));
                    break;
                case 3:
                    kotlin.coroutines.e context = cVar.getContext();
                    Object a2 = v.a(context, null);
                    try {
                        cVar.resumeWith(l.m673constructorimpl(m.a(th)));
                        return;
                    } finally {
                        v.b(context, a2);
                    }
                case 4:
                    break;
                default:
                    throw new IllegalStateException(("Invalid mode " + i).toString());
            }
        } else {
            bz.b(this.f83946e, obj, i);
        }
    }
}
