package kotlinx.coroutines.b;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.aa;
import kotlinx.coroutines.internal.u;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/DefaultScheduler;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "()V", "IO", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIO", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "toDebugString", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class c extends d {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final aa f83846a;

    /* renamed from: c  reason: collision with root package name */
    public static final c f83847c;

    @NotNull
    public final String toString() {
        return "DefaultDispatcher";
    }

    private c() {
        super(0, 0, (String) null, 7);
    }

    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    static {
        c cVar = new c();
        f83847c = cVar;
        boolean z = false;
        int a2 = u.a("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, u.a()), 0, 0, 12);
        if (a2 > 0) {
            z = true;
        }
        if (z) {
            f83846a = new f(cVar, a2, l.PROBABLY_BLOCKING);
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but have " + a2).toString());
    }
}
