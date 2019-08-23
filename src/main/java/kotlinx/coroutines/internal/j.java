package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001aH\b¢\u0006\u0002\u0010\u001fR$\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "removeFirstOrNullIf", "predicate", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class j<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f83933a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal = new k(8, false);

    public final void a() {
        while (true) {
            k kVar = (k) this._cur$internal;
            if (!kVar.b()) {
                f83933a.compareAndSet(this, kVar, kVar.c());
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r7 = r9;
     */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E b() {
        /*
            r11 = this;
        L_0x0000:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.k) r0
        L_0x0004:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0013
            kotlinx.coroutines.internal.t r7 = kotlinx.coroutines.internal.k.f83935e
            goto L_0x006d
        L_0x0013:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r5 = 0
            long r1 = r1 >> r5
            int r8 = (int) r1
            r1 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r3
            r5 = 30
            long r1 = r1 >> r5
            int r1 = (int) r1
            int r2 = r0.f83937a
            r1 = r1 & r2
            int r2 = r0.f83937a
            r2 = r2 & r8
            if (r1 != r2) goto L_0x002d
            goto L_0x006d
        L_0x002d:
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f83938c
            int r2 = r0.f83937a
            r2 = r2 & r8
            java.lang.Object r9 = r1.get(r2)
            if (r9 != 0) goto L_0x003d
            boolean r1 = r0.f83939d
            if (r1 == 0) goto L_0x0004
            goto L_0x006d
        L_0x003d:
            boolean r1 = r9 instanceof kotlinx.coroutines.internal.k.b
            if (r1 == 0) goto L_0x0042
            goto L_0x006d
        L_0x0042:
            int r1 = r8 + 1
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r1 & r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.k.f83934b
            kotlinx.coroutines.internal.k$a r2 = kotlinx.coroutines.internal.k.f83936f
            long r5 = r2.a((long) r3, (int) r10)
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r0.f83938c
            int r2 = r0.f83937a
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L_0x006c
        L_0x0061:
            boolean r1 = r0.f83939d
            if (r1 == 0) goto L_0x0004
            r1 = r0
        L_0x0066:
            kotlinx.coroutines.internal.k r1 = r1.a((int) r8, (int) r10)
            if (r1 != 0) goto L_0x0066
        L_0x006c:
            r7 = r9
        L_0x006d:
            kotlinx.coroutines.internal.t r1 = kotlinx.coroutines.internal.k.f83935e
            if (r7 == r1) goto L_0x0072
            return r7
        L_0x0072:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f83933a
            kotlinx.coroutines.internal.k r2 = r0.c()
            r1.compareAndSet(r11, r0, r2)
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.j.b():java.lang.Object");
    }

    public j(boolean z) {
    }

    public final boolean a(@NotNull E e2) {
        Intrinsics.checkParameterIsNotNull(e2, "element");
        while (true) {
            k kVar = (k) this._cur$internal;
            switch (kVar.a(e2)) {
                case 0:
                    return true;
                case 1:
                    f83933a.compareAndSet(this, kVar, kVar.c());
                    break;
                case 2:
                    return false;
            }
        }
    }
}
