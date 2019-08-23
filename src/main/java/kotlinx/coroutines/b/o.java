package kotlinx.coroutines.b;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005J!\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u001dH\bJ\r\u0010\u001e\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J \u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize$kotlinx_coroutines_core", "()I", "consumerIndex", "Lkotlinx/atomicfu/AtomicInt;", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "add", "", "task", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "addLast", "addToGlobalQueue", "", "offloadAllWork", "offloadAllWork$kotlinx_coroutines_core", "offloadWork", "poll", "pollExternal", "predicate", "Lkotlin/Function1;", "size", "size$kotlinx_coroutines_core", "tryAddLast", "trySteal", "victim", "tryStealLastScheduled", "time", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class o {

    /* renamed from: b  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f83869b = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex");

    /* renamed from: c  reason: collision with root package name */
    static final AtomicIntegerFieldUpdater f83870c = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f83871d = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<i> f83872a = new AtomicReferenceArray<>(SearchJediMixFeedAdapter.f42517f);
    volatile int consumerIndex = 0;
    volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;

    public final int a() {
        return this.producerIndex - this.consumerIndex;
    }

    @Nullable
    public final i b() {
        i iVar = (i) f83871d.getAndSet(this, null);
        if (iVar != null) {
            return iVar;
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (this.f83872a.get(i2) != null && f83870c.compareAndSet(this, i, i + 1)) {
                return this.f83872a.getAndSet(i2, null);
            }
        }
    }

    private final boolean a(i iVar) {
        if (a() == 127) {
            return false;
        }
        int i = this.producerIndex & 127;
        if (this.f83872a.get(i) != null) {
            return false;
        }
        this.f83872a.lazySet(i, iVar);
        f83869b.incrementAndGet(this);
        return true;
    }

    private final void b(e eVar) {
        i iVar;
        int coerceAtLeast = RangesKt.coerceAtLeast(a() / 2, 1);
        int i = 0;
        while (i < coerceAtLeast) {
            while (true) {
                int i2 = this.consumerIndex;
                iVar = null;
                if (i2 - this.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                if (this.f83872a.get(i3) != null && f83870c.compareAndSet(this, i2, i2 + 1)) {
                    iVar = this.f83872a.getAndSet(i3, null);
                    break;
                }
            }
            if (iVar != null) {
                a(eVar, iVar);
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(@NotNull e eVar) {
        i iVar;
        Intrinsics.checkParameterIsNotNull(eVar, "globalQueue");
        i iVar2 = (i) f83871d.getAndSet(this, null);
        if (iVar2 != null) {
            a(eVar, iVar2);
        }
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                iVar = null;
            } else {
                int i2 = i & 127;
                if (this.f83872a.get(i2) != null && f83870c.compareAndSet(this, i, i + 1)) {
                    iVar = this.f83872a.getAndSet(i2, null);
                }
            }
            if (iVar != null) {
                a(eVar, iVar);
            } else {
                return;
            }
        }
    }

    private static void a(e eVar, i iVar) {
        if (!eVar.a(iVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    public final boolean b(@NotNull i iVar, @NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "task");
        Intrinsics.checkParameterIsNotNull(eVar, "globalQueue");
        boolean z = true;
        while (!a(iVar)) {
            b(eVar);
            z = false;
        }
        return z;
    }

    public final boolean a(@NotNull i iVar, @NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "task");
        Intrinsics.checkParameterIsNotNull(eVar, "globalQueue");
        i iVar2 = (i) f83871d.getAndSet(this, iVar);
        if (iVar2 == null) {
            return true;
        }
        return b(iVar2, eVar);
    }

    public final boolean a(@NotNull o oVar, @NotNull e eVar) {
        i iVar;
        boolean z;
        o oVar2 = oVar;
        e eVar2 = eVar;
        Intrinsics.checkParameterIsNotNull(oVar2, "victim");
        Intrinsics.checkParameterIsNotNull(eVar2, "globalQueue");
        long a2 = m.g.a();
        int a3 = oVar.a();
        if (a3 == 0) {
            return a(a2, oVar2, eVar2);
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(a3 / 2, 1);
        int i = 0;
        boolean z2 = false;
        while (i < coerceAtLeast) {
            while (true) {
                int i2 = oVar2.consumerIndex;
                iVar = null;
                if (i2 - oVar2.producerIndex == 0) {
                    break;
                }
                int i3 = i2 & 127;
                i iVar2 = oVar2.f83872a.get(i3);
                if (iVar2 != null) {
                    if (a2 - iVar2.f83861f >= m.f83863a || oVar.a() > m.f83864b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else if (f83870c.compareAndSet(oVar2, i2, i2 + 1)) {
                        iVar = oVar2.f83872a.getAndSet(i3, null);
                        break;
                    }
                }
            }
            if (iVar == null) {
                return z2;
            }
            a(iVar, eVar2);
            i++;
            z2 = true;
        }
        return z2;
    }

    private final boolean a(long j, o oVar, e eVar) {
        i iVar = (i) oVar.lastScheduledTask;
        if (iVar == null || j - iVar.f83861f < m.f83863a || !f83871d.compareAndSet(oVar, iVar, null)) {
            return false;
        }
        a(iVar, eVar);
        return true;
    }
}
