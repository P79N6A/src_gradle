package kotlinx.coroutines;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.aa;
import kotlin.coroutines.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.w;
import kotlinx.coroutines.internal.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u0002:\u0003123B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0019j\u0002`\u001aJ\u0012\u0010\u001f\u001a\u00020\u00172\n\u0010 \u001a\u00060\u0019j\u0002`\u001aJ\u0014\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u0019j\u0002`\u001aH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0016J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0004J\u0015\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0007H\u0000¢\u0006\u0002\b'J\u0010\u0010(\u001a\u00020)2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u001e\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u000f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170-H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0007H\u0002J\b\u0010/\u001a\u00020\u0017H\u0014J\b\u00100\u001a\u00020\u0017H\u0002R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8TX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8TX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u00064"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "Lkotlinx/coroutines/EventLoop;", "Lkotlinx/coroutines/Delay;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "_queue", "", "isCompleted", "", "isEmpty", "()Z", "nextTime", "", "getNextTime", "()J", "thread", "Ljava/lang/Thread;", "getThread", "()Ljava/lang/Thread;", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueue", "task", "enqueueImpl", "processNextEvent", "rescheduleAllDelayed", "resetAll", "schedule", "delayedTask", "schedule$kotlinx_coroutines_core", "scheduleImpl", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "shutdown", "unpark", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public abstract class az extends ay implements ao {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f83825a = AtomicReferenceFieldUpdater.newUpdater(az.class, Object.class, "_queue");

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f83826c = AtomicReferenceFieldUpdater.newUpdater(az.class, Object.class, "_delayed");
    volatile Object _delayed;
    volatile Object _queue;
    public volatile boolean isCompleted;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeMillis", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ az f83827a;

        /* renamed from: c  reason: collision with root package name */
        private final k<Unit> f83828c;

        public final void run() {
            this.f83828c.a(this.f83827a, Unit.INSTANCE);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(az azVar, long j, @NotNull k<? super Unit> kVar) {
            super(j);
            Intrinsics.checkParameterIsNotNull(kVar, "cont");
            this.f83827a = azVar;
            this.f83828c = kVar;
            m.a(this.f83828c, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u001c\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007J\b\u0010%\u001a\u00020&H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "timeMillis", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "nanoTime", "compareTo", "other", "dispose", "", "rescheduleOnShutdown", "schedule", "delayed", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "now", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static abstract class b implements Comparable<b>, Runnable, av, x {

        /* renamed from: a  reason: collision with root package name */
        private Object f83829a;
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public final long f83830b;

        /* renamed from: c  reason: collision with root package name */
        private int f83831c = -1;

        public final int c() {
            return this.f83831c;
        }

        @Nullable
        public final w<?> b() {
            Object obj = this.f83829a;
            if (!(obj instanceof w)) {
                obj = null;
            }
            return (w) obj;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f83830b + ']';
        }

        public final synchronized void a() {
            Object obj = this.f83829a;
            if (obj != ba.f83873a) {
                if (!(obj instanceof w)) {
                    obj = null;
                }
                w wVar = (w) obj;
                if (wVar != null) {
                    wVar.a(this);
                }
                this.f83829a = ba.f83873a;
            }
        }

        public final void a(int i) {
            this.f83831c = i;
        }

        public final void a(@Nullable w<?> wVar) {
            boolean z;
            if (this.f83829a != ba.f83873a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f83829a = wVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public /* synthetic */ int compareTo(Object obj) {
            b bVar = (b) obj;
            Intrinsics.checkParameterIsNotNull(bVar, "other");
            long j = this.f83830b - bVar.f83830b;
            if (j > 0) {
                return 1;
            }
            if (j < 0) {
                return -1;
            }
            return 0;
        }

        public b(long j) {
            long a2 = ch.a().a();
            long j2 = 0;
            if (j > 0) {
                if (j >= 9223372036854L) {
                    j2 = Long.MAX_VALUE;
                } else {
                    j2 = 1000000 * j;
                }
            }
            this.f83830b = a2 + j2;
        }

        public final synchronized int a(@NotNull w<b> wVar, @NotNull az azVar) {
            boolean z;
            boolean z2;
            Intrinsics.checkParameterIsNotNull(wVar, "delayed");
            Intrinsics.checkParameterIsNotNull(azVar, "eventLoop");
            if (this.f83829a == ba.f83873a) {
                return 2;
            }
            T t = this;
            synchronized (wVar) {
                if (!azVar.isCompleted) {
                    Intrinsics.checkParameterIsNotNull(t, "node");
                    if (t.b() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        t.a(wVar);
                        T[] tArr = wVar.f83954a;
                        if (tArr == null) {
                            tArr = new x[4];
                            wVar.f83954a = tArr;
                        } else if (wVar.size >= tArr.length) {
                            T[] copyOf = Arrays.copyOf(tArr, wVar.size * 2);
                            Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                            wVar.f83954a = (x[]) copyOf;
                            tArr = (x[]) copyOf;
                        }
                        int i = wVar.size;
                        wVar.size = i + 1;
                        tArr[i] = t;
                        t.a(i);
                        wVar.b(i);
                        z = true;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                return 0;
            }
            return 1;
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public abstract Thread a();

    private final void i() {
        Thread a2 = a();
        if (Thread.currentThread() != a2) {
            ch.a().a(a2);
        }
    }

    private final void j() {
        while (true) {
            w wVar = (w) this._delayed;
            if (wVar != null) {
                b bVar = (b) wVar.c();
                if (bVar != null) {
                    aj.f83797a.a(bVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c() {
        if (!g()) {
            return false;
        }
        w wVar = (w) this._delayed;
        if (wVar != null && !wVar.a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof k) {
            return ((k) obj).a();
        }
        if (obj == ba.f83874b) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        if (super.d() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof k) {
                if (!((k) obj).a()) {
                    return 0;
                }
            } else if (obj == ba.f83874b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        w wVar = (w) this._delayed;
        if (wVar == null) {
            return Long.MAX_VALUE;
        }
        b bVar = (b) wVar.b();
        if (bVar == null) {
            return Long.MAX_VALUE;
        }
        return RangesKt.coerceAtLeast(bVar.f83830b - ch.a().a(), 0);
    }

    /* access modifiers changed from: protected */
    public final void h() {
        cd.f83905a.set(null);
        this.isCompleted = true;
        boolean z = this.isCompleted;
        if (!aa.f83419a || z) {
            while (true) {
                Object obj = this._queue;
                if (obj != null) {
                    if (!(obj instanceof k)) {
                        if (obj == ba.f83874b) {
                            break;
                        }
                        k kVar = new k(8, true);
                        if (obj != null) {
                            kVar.a((Runnable) obj);
                            if (f83825a.compareAndSet(this, obj, kVar)) {
                                break;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                        }
                    } else {
                        ((k) obj).b();
                        break;
                    }
                } else if (f83825a.compareAndSet(this, null, ba.f83874b)) {
                    break;
                }
            }
            do {
            } while (b() <= 0);
            j();
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cc, code lost:
        r6 = r13;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fa A[EDGE_INSN: B:80:0x00fa->B:71:0x00fa ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b() {
        /*
            r15 = this;
            boolean r0 = r15.e()
            if (r0 == 0) goto L_0x000b
            long r0 = r15.d()
            return r0
        L_0x000b:
            java.lang.Object r0 = r15._delayed
            kotlinx.coroutines.internal.w r0 = (kotlinx.coroutines.internal.w) r0
            r1 = 0
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0056
            boolean r5 = r0.a()
            if (r5 != 0) goto L_0x0056
            kotlinx.coroutines.cg r5 = kotlinx.coroutines.ch.a()
            long r5 = r5.a()
        L_0x0023:
            monitor-enter(r0)
            kotlinx.coroutines.internal.x r7 = r0.d()     // Catch:{ all -> 0x0053 }
            if (r7 != 0) goto L_0x002d
            monitor-exit(r0)
            r7 = r4
            goto L_0x004e
        L_0x002d:
            kotlinx.coroutines.az$b r7 = (kotlinx.coroutines.az.b) r7     // Catch:{ all -> 0x0053 }
            long r8 = r7.f83830b     // Catch:{ all -> 0x0053 }
            r10 = 0
            long r8 = r5 - r8
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x003a
            r8 = 1
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            if (r8 == 0) goto L_0x0044
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0053 }
            boolean r7 = r15.b((java.lang.Runnable) r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x004c
            kotlinx.coroutines.internal.x r7 = r0.a((int) r3)     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x004c:
            r7 = r4
        L_0x004d:
            monitor-exit(r0)
        L_0x004e:
            kotlinx.coroutines.az$b r7 = (kotlinx.coroutines.az.b) r7
            if (r7 != 0) goto L_0x0023
            goto L_0x0056
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0056:
            java.lang.Object r0 = r15._queue
            if (r0 != 0) goto L_0x005c
            goto L_0x00fa
        L_0x005c:
            boolean r5 = r0 instanceof kotlinx.coroutines.internal.k
            if (r5 == 0) goto L_0x00e8
            if (r0 == 0) goto L_0x00e0
            r5 = r0
            kotlinx.coroutines.internal.k r5 = (kotlinx.coroutines.internal.k) r5
        L_0x0065:
            long r8 = r5._state$internal
            r6 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r6 & r8
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x0071
            kotlinx.coroutines.internal.t r6 = kotlinx.coroutines.internal.k.f83935e
            goto L_0x00cd
        L_0x0071:
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r8
            long r6 = r6 >> r3
            int r12 = (int) r6
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r8
            r10 = 30
            long r6 = r6 >> r10
            int r6 = (int) r6
            int r7 = r5.f83937a
            r6 = r6 & r7
            int r7 = r5.f83937a
            r7 = r7 & r12
            if (r6 != r7) goto L_0x008b
        L_0x0089:
            r6 = r4
            goto L_0x00cd
        L_0x008b:
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r6 = r5.f83938c
            int r7 = r5.f83937a
            r7 = r7 & r12
            java.lang.Object r13 = r6.get(r7)
            if (r13 != 0) goto L_0x009b
            boolean r6 = r5.f83939d
            if (r6 == 0) goto L_0x0065
            goto L_0x0089
        L_0x009b:
            boolean r6 = r13 instanceof kotlinx.coroutines.internal.k.b
            if (r6 == 0) goto L_0x00a0
            goto L_0x0089
        L_0x00a0:
            int r6 = r12 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r14 = r6 & r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = kotlinx.coroutines.internal.k.f83934b
            kotlinx.coroutines.internal.k$a r7 = kotlinx.coroutines.internal.k.f83936f
            long r10 = r7.a((long) r8, (int) r14)
            r7 = r5
            boolean r6 = r6.compareAndSet(r7, r8, r10)
            if (r6 == 0) goto L_0x00bf
            java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r6 = r5.f83938c
            int r7 = r5.f83937a
            r7 = r7 & r12
            r6.set(r7, r4)
            goto L_0x00cc
        L_0x00bf:
            boolean r6 = r5.f83939d
            if (r6 == 0) goto L_0x0065
            r6 = r5
            kotlinx.coroutines.internal.k r6 = (kotlinx.coroutines.internal.k) r6
        L_0x00c6:
            kotlinx.coroutines.internal.k r6 = r6.a((int) r12, (int) r14)
            if (r6 != 0) goto L_0x00c6
        L_0x00cc:
            r6 = r13
        L_0x00cd:
            kotlinx.coroutines.internal.t r7 = kotlinx.coroutines.internal.k.f83935e
            if (r6 == r7) goto L_0x00d5
            r4 = r6
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            goto L_0x00fa
        L_0x00d5:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f83825a
            kotlinx.coroutines.internal.k r5 = r5.c()
            r6.compareAndSet(r15, r0, r5)
            goto L_0x0056
        L_0x00e0:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */"
            r0.<init>(r1)
            throw r0
        L_0x00e8:
            kotlinx.coroutines.internal.t r5 = kotlinx.coroutines.ba.f83874b
            if (r0 != r5) goto L_0x00ed
            goto L_0x00fa
        L_0x00ed:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f83825a
            boolean r5 = r5.compareAndSet(r15, r0, r4)
            if (r5 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0104
            r4 = r0
            java.lang.Runnable r4 = (java.lang.Runnable) r4
        L_0x00fa:
            if (r4 == 0) goto L_0x00ff
            r4.run()
        L_0x00ff:
            long r0 = r15.d()
            return r0
        L_0x0104:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.az.b():long");
    }

    private final boolean b(b bVar) {
        b bVar2;
        w wVar = (w) this._delayed;
        if (wVar != null) {
            bVar2 = (b) wVar.b();
        } else {
            bVar2 = null;
        }
        if (bVar2 == bVar) {
            return true;
        }
        return false;
    }

    public final void a(@NotNull Runnable runnable) {
        az azVar = this;
        while (true) {
            Intrinsics.checkParameterIsNotNull(runnable, "task");
            if (azVar.b(runnable)) {
                azVar.i();
                return;
            }
            azVar = aj.f83797a;
        }
    }

    private final int c(b bVar) {
        if (this.isCompleted) {
            return 1;
        }
        w wVar = (w) this._delayed;
        if (wVar == null) {
            az azVar = this;
            f83826c.compareAndSet(azVar, null, new w());
            Object obj = azVar._delayed;
            if (obj == null) {
                Intrinsics.throwNpe();
            }
            wVar = (w) obj;
        }
        return bVar.a(wVar, this);
    }

    private final boolean b(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this.isCompleted) {
                return false;
            }
            if (obj == null) {
                if (f83825a.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof k) {
                if (obj != null) {
                    k kVar = (k) obj;
                    switch (kVar.a(runnable)) {
                        case 0:
                            return true;
                        case 1:
                            f83825a.compareAndSet(this, obj, kVar.c());
                            break;
                        case 2:
                            return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == ba.f83874b) {
                return false;
            } else {
                k kVar2 = new k(8, true);
                if (obj != null) {
                    kVar2.a((Runnable) obj);
                    kVar2.a(runnable);
                    if (f83825a.compareAndSet(this, obj, kVar2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    public final void a(@NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delayedTask");
        switch (c(bVar)) {
            case 0:
                if (b(bVar)) {
                    i();
                    return;
                }
                return;
            case 1:
                aj.f83797a.a(bVar);
                return;
            case 2:
                return;
            default:
                throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final void a(long j, @NotNull k<? super Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(kVar, "continuation");
        a((b) new a(this, j, kVar));
    }

    public final void a(@NotNull e eVar, @NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Intrinsics.checkParameterIsNotNull(runnable, "block");
        a(runnable);
    }
}
