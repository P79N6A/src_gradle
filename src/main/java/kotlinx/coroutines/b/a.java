package kotlinx.coroutines.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.aa;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0003EFGB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J!\u0010&\u001a\u00020'2\n\u0010(\u001a\u00060)j\u0002`*2\u0006\u0010+\u001a\u00020,H\u0000¢\u0006\u0002\b-J\u0011\u0010\u0014\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007H\bJ\t\u0010.\u001a\u00020$H\bJ\t\u0010/\u001a\u00020\u0004H\bJ&\u00100\u001a\u00020$2\n\u0010(\u001a\u00060)j\u0002`*2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u00101\u001a\u00020\u0019J\u0014\u00102\u001a\u00020$2\n\u00103\u001a\u00060)j\u0002`*H\u0016J\t\u00104\u001a\u00020$H\bJ\t\u00105\u001a\u00020\u0004H\bJ\u0014\u00106\u001a\u00020\u00042\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J\u000e\u00108\u001a\b\u0018\u00010 R\u00020\u0000H\u0002J\u0014\u00109\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u0000H\u0002J$\u0010:\u001a\u00020$2\n\u00107\u001a\u00060 R\u00020\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004H\u0002J\b\u0010=\u001a\u00020$H\u0002J\u0010\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020'H\u0002J\u000e\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u0007J\u0018\u0010B\u001a\u00020\u00042\u0006\u0010?\u001a\u00020'2\u0006\u00101\u001a\u00020\u0019H\u0002J\b\u0010C\u001a\u00020\tH\u0016J\b\u0010D\u001a\u00020\u0019H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0014\u001a\u00020\u00048Â\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0018\u00010 R\u00020\u00000\u001fX\u0004¢\u0006\u0004\n\u0002\u0010!¨\u0006H"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicInt;", "blockingWorkers", "getBlockingWorkers", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "cpuPermits", "Ljava/util/concurrent/Semaphore;", "createdWorkers", "getCreatedWorkers", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "isTerminated", "", "()Z", "parkedWorkersStack", "random", "Ljava/util/Random;", "workers", "", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "state", "close", "", "createNewWorker", "createTask", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "createTask$kotlinx_coroutines_core", "decrementBlockingWorkers", "decrementCreatedWorkers", "dispatch", "fair", "execute", "command", "incrementBlockingWorkers", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "requestCpuWorker", "runSafely", "task", "shutdown", "timeout", "submitToLocalQueue", "toString", "tryUnpark", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class a implements Closeable, Executor {

    /* renamed from: d  reason: collision with root package name */
    static final AtomicLongFieldUpdater f83833d = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final int i;
    public static final int j;
    public static final int k = ((int) TimeUnit.SECONDS.toNanos(1));
    public static final int l = ((int) RangesKt.coerceAtMost(RangesKt.coerceAtLeast(m.f83863a / 4, 10), (long) k));
    public static final t m = new t("NOT_IN_STACK");
    public static final C0899a n = new C0899a((byte) 0);
    private static final AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    private static final AtomicIntegerFieldUpdater p = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final e f83834a;

    /* renamed from: b  reason: collision with root package name */
    public final Semaphore f83835b;

    /* renamed from: c  reason: collision with root package name */
    public final b[] f83836c;
    volatile long controlState;

    /* renamed from: e  reason: collision with root package name */
    public final Random f83837e;

    /* renamed from: f  reason: collision with root package name */
    public final int f83838f;
    public final long g;
    public final String h;
    private volatile long parkedWorkersStack;
    private final int q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0002R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u00020\u00048\u0002X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0002R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "ADDED", "", "ADDED_REQUIRES_HELP", "ALLOWED", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "CREATED_MASK", "FORBIDDEN", "MAX_PARK_TIME_NS", "MAX_PARK_TIME_NS$annotations", "MAX_SPINS", "MAX_SUPPORTED_POOL_SIZE", "MAX_YIELDS", "MIN_PARK_TIME_NS", "MIN_PARK_TIME_NS$annotations", "MIN_SUPPORTED_POOL_SIZE", "NOT_ADDED", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    /* renamed from: kotlinx.coroutines.b.a$a  reason: collision with other inner class name */
    public static final class C0899a {
        private C0899a() {
        }

        public /* synthetic */ C0899a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00101\u001a\u00020\u0010H\u0002J\b\u00102\u001a\u00020\fH\u0002J\b\u00103\u001a\u00020-H\u0002J\b\u00104\u001a\u00020-H\u0002J\u0010\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\u0010H\u0002J\u000f\u00107\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0002\b9J\n\u0010:\u001a\u0004\u0018\u000108H\u0002J\u0010\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020/H\u0002J\u0006\u0010=\u001a\u00020-J\u0015\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u0003H\u0000¢\u0006\u0002\b@J\b\u0010A\u001a\u00020-H\u0016J\u0006\u0010B\u001a\u00020\fJ\u0006\u0010C\u001a\u00020\fJ\u0015\u0010D\u001a\u00020\f2\u0006\u0010E\u001a\u00020$H\u0000¢\u0006\u0002\bFJ\n\u0010G\u001a\u0004\u0018\u000108H\u0002J\b\u0010H\u001a\u00020-H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "isBlocking", "", "()Z", "isParking", "lastExhaustionTime", "", "lastStealIndex", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "getLocalQueue", "()Lkotlinx/coroutines/scheduling/WorkQueue;", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "parkTimeNs", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "spins", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "getState", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "setState", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)V", "terminationDeadline", "terminationState", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "Lkotlinx/coroutines/scheduling/TaskMode;", "beforeTask", "taskSubmissionTime", "blockingQuiescence", "blockingWorkerIdle", "cpuWorkerIdle", "doPark", "nanos", "findTask", "Lkotlinx/coroutines/scheduling/Task;", "findTask$kotlinx_coroutines_core", "findTaskWithCpuPermit", "idleReset", "mode", "idleResetBeforeUnpark", "nextInt", "upperBound", "nextInt$kotlinx_coroutines_core", "run", "tryAcquireCpuPermit", "tryForbidTermination", "tryReleaseCpu", "newState", "tryReleaseCpu$kotlinx_coroutines_core", "trySteal", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public final class b extends Thread {

        /* renamed from: c  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f83839c = AtomicIntegerFieldUpdater.newUpdater(b.class, "terminationState");
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public final o f83840a;

        /* renamed from: d  reason: collision with root package name */
        private long f83842d;

        /* renamed from: e  reason: collision with root package name */
        private long f83843e;

        /* renamed from: f  reason: collision with root package name */
        private int f83844f;
        private int g;
        private int h;
        public volatile int indexInArray;
        @Nullable
        public volatile Object nextParkedWorker;
        private volatile int spins;
        @NotNull
        public volatile c state;
        private volatile int terminationState;

        public final void d() {
            this.f83844f = a.l;
            this.spins = 0;
        }

        public final boolean a() {
            if (this.state == c.PARKING) {
                return true;
            }
            return false;
        }

        private final boolean g() {
            i a2 = a.this.f83834a.a(l.PROBABLY_BLOCKING);
            if (a2 == null) {
                return true;
            }
            this.f83840a.a(a2, a.this.f83834a);
            return false;
        }

        public final boolean c() {
            if (this.state == c.CPU_ACQUIRED) {
                return true;
            }
            if (!a.this.f83835b.tryAcquire()) {
                return false;
            }
            this.state = c.CPU_ACQUIRED;
            return true;
        }

        @Nullable
        public final i e() {
            if (c()) {
                return h();
            }
            i b2 = this.f83840a.b();
            if (b2 == null) {
                b2 = a.this.f83834a.a(l.PROBABLY_BLOCKING);
            }
            return b2;
        }

        private final i h() {
            boolean z;
            if (b(a.this.f83838f * 2) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i a2 = a.this.f83834a.a(l.NON_BLOCKING);
                if (a2 != null) {
                    return a2;
                }
            }
            i b2 = this.f83840a.b();
            if (b2 != null) {
                return b2;
            }
            if (!z) {
                i iVar = (i) a.this.f83834a.b();
                if (iVar != null) {
                    return iVar;
                }
            }
            return i();
        }

        private final i i() {
            int a2 = a.this.a();
            if (a2 < 2) {
                return null;
            }
            int i = this.h;
            if (i == 0) {
                i = b(a2);
            }
            int i2 = i + 1;
            if (i2 > a2) {
                i2 = 1;
            }
            this.h = i2;
            b bVar = a.this.f83836c[i2];
            if (bVar == null || bVar == this || !this.f83840a.a(bVar.f83840a, a.this.f83834a)) {
                return null;
            }
            return this.f83840a.b();
        }

        private final void f() {
            synchronized (a.this.f83836c) {
                if (!a.this.b()) {
                    if (a.this.a() > a.this.f83838f) {
                        if (g()) {
                            if (f83839c.compareAndSet(this, 0, 1)) {
                                int i = this.indexInArray;
                                a(0);
                                a.this.a(this, i, 0);
                                int andDecrement = (int) (a.f83833d.getAndDecrement(a.this) & 2097151);
                                if (andDecrement != i) {
                                    b bVar = a.this.f83836c[andDecrement];
                                    if (bVar == null) {
                                        Intrinsics.throwNpe();
                                    }
                                    a.this.f83836c[i] = bVar;
                                    bVar.a(i);
                                    a.this.a(bVar, andDecrement, i);
                                }
                                a.this.f83836c[andDecrement] = null;
                                this.state = c.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        public final boolean b() {
            int i = this.terminationState;
            switch (i) {
                case -1:
                    return false;
                case 0:
                    return f83839c.compareAndSet(this, 0, -1);
                case 1:
                    return false;
                default:
                    throw new IllegalStateException(("Invalid terminationState = " + i).toString());
            }
        }

        public final void run() {
            boolean z;
            boolean z2;
            boolean z3 = false;
            while (!a.this.b() && this.state != c.TERMINATED) {
                i e2 = e();
                if (e2 == null) {
                    if (this.state == c.CPU_ACQUIRED) {
                        int i = this.spins;
                        if (i <= a.j) {
                            this.spins = i + 1;
                            if (i >= a.i) {
                                Thread.yield();
                            }
                        } else {
                            if (this.f83844f < a.k) {
                                this.f83844f = RangesKt.coerceAtMost((this.f83844f * 3) >>> 1, a.k);
                            }
                            a(c.PARKING);
                            a((long) this.f83844f);
                        }
                    } else {
                        a(c.PARKING);
                        if (g()) {
                            this.terminationState = 0;
                            if (this.f83842d == 0) {
                                this.f83842d = System.nanoTime() + a.this.g;
                            }
                            if (a(a.this.g) && System.nanoTime() - this.f83842d >= 0) {
                                this.f83842d = 0;
                                f();
                            }
                        }
                    }
                    z3 = true;
                } else {
                    l e3 = e2.e();
                    if (z3) {
                        this.f83842d = 0;
                        this.h = 0;
                        if (this.state == c.PARKING) {
                            if (e3 == l.PROBABLY_BLOCKING) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!aa.f83419a || z2) {
                                this.state = c.BLOCKING;
                                this.f83844f = a.l;
                            } else {
                                throw new AssertionError("Assertion failed");
                            }
                        }
                        this.spins = 0;
                        z3 = false;
                    }
                    long j = e2.f83861f;
                    if (e3 != l.NON_BLOCKING) {
                        a.f83833d.addAndGet(a.this, 2097152);
                        if (a(c.BLOCKING)) {
                            a.this.c();
                        }
                    } else if (a.this.f83835b.availablePermits() != 0) {
                        long a2 = m.g.a();
                        if (a2 - j >= m.f83863a && a2 - this.f83843e >= m.f83863a * 5) {
                            this.f83843e = a2;
                            a.this.c();
                        }
                    }
                    a.a(e2);
                    if (e3 != l.NON_BLOCKING) {
                        a.f83833d.addAndGet(a.this, -2097152);
                        c cVar = this.state;
                        if (cVar == c.TERMINATED) {
                            continue;
                        } else {
                            if (cVar == c.BLOCKING) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!aa.f83419a || z) {
                                this.state = c.RETIRING;
                            } else {
                                throw new AssertionError("Expected BLOCKING state, but has " + cVar);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            a(c.TERMINATED);
        }

        private final boolean a(long j) {
            a.this.a(this);
            if (!g()) {
                return false;
            }
            LockSupport.parkNanos(j);
            return true;
        }

        private b() {
            setDaemon(true);
            this.f83840a = new o();
            this.state = c.RETIRING;
            this.terminationState = 0;
            this.nextParkedWorker = a.m;
            this.f83844f = a.l;
            this.g = a.this.f83837e.nextInt();
        }

        private void a(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.h);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        private int b(int i) {
            this.g ^= this.g << 13;
            this.g ^= this.g >> 17;
            this.g ^= this.g << 5;
            int i2 = i - 1;
            if ((i2 & i) == 0) {
                return this.g & i2;
            }
            return (this.g & Integer.MAX_VALUE) % i;
        }

        public final boolean a(@NotNull c cVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(cVar, "newState");
            c cVar2 = this.state;
            if (cVar2 == c.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a.this.f83835b.release();
            }
            if (cVar2 != cVar) {
                this.state = cVar;
            }
            return z;
        }

        public b(a aVar, int i) {
            this();
            a(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "RETIRING", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        RETIRING,
        TERMINATED
    }

    public final int a() {
        return (int) (this.controlState & 2097151);
    }

    public final boolean b() {
        if (this._isTerminated != 0) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        while (true) {
            b d2 = d();
            if (d2 == null) {
                return false;
            }
            d2.d();
            boolean a2 = d2.a();
            LockSupport.unpark(d2);
            if (a2 && d2.b()) {
                return true;
            }
        }
    }

    private final b d() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f83836c[(int) (2097151 & j2)];
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & -2097152;
            int b2 = b(bVar);
            if (b2 >= 0) {
                if (o.compareAndSet(this, j2, ((long) b2) | j3)) {
                    bVar.nextParkedWorker = m;
                    return bVar;
                }
            }
        }
    }

    public final void c() {
        if (this.f83835b.availablePermits() == 0) {
            e();
        } else if (!e()) {
            long j2 = this.controlState;
            if (((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)) < this.f83838f) {
                int f2 = f();
                if (f2 == 1 && this.f83838f > 1) {
                    f();
                }
                if (f2 > 0) {
                    return;
                }
            }
            e();
        }
    }

    static {
        int a2 = u.a("kotlinx.coroutines.scheduler.spins", (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, 1, 0, 8);
        i = a2;
        j = a2 + u.a("kotlinx.coroutines.scheduler.yields", 0, 0, 0, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int f() {
        /*
            r10 = this;
            kotlinx.coroutines.b.a$b[] r0 = r10.f83836c
            monitor-enter(r0)
            boolean r1 = r10.b()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)
            r0 = -1
            return r0
        L_0x000c:
            long r1 = r10.controlState     // Catch:{ all -> 0x0081 }
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r1 & r3
            int r5 = (int) r5     // Catch:{ all -> 0x0081 }
            r6 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r6
            r6 = 21
            long r1 = r1 >> r6
            int r1 = (int) r1     // Catch:{ all -> 0x0081 }
            int r1 = r5 - r1
            int r2 = r10.f83838f     // Catch:{ all -> 0x0081 }
            r6 = 0
            if (r1 < r2) goto L_0x0027
            monitor-exit(r0)
            return r6
        L_0x0027:
            int r2 = r10.q     // Catch:{ all -> 0x0081 }
            if (r5 >= r2) goto L_0x007f
            java.util.concurrent.Semaphore r2 = r10.f83835b     // Catch:{ all -> 0x0081 }
            int r2 = r2.availablePermits()     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0034
            goto L_0x007f
        L_0x0034:
            long r7 = r10.controlState     // Catch:{ all -> 0x0081 }
            long r7 = r7 & r3
            int r2 = (int) r7     // Catch:{ all -> 0x0081 }
            r5 = 1
            int r2 = r2 + r5
            if (r2 <= 0) goto L_0x0044
            kotlinx.coroutines.b.a$b[] r7 = r10.f83836c     // Catch:{ all -> 0x0081 }
            r7 = r7[r2]     // Catch:{ all -> 0x0081 }
            if (r7 != 0) goto L_0x0044
            r7 = 1
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x0071
            kotlinx.coroutines.b.a$b r7 = new kotlinx.coroutines.b.a$b     // Catch:{ all -> 0x0081 }
            r7.<init>(r10, r2)     // Catch:{ all -> 0x0081 }
            r7.start()     // Catch:{ all -> 0x0081 }
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = f83833d     // Catch:{ all -> 0x0081 }
            long r8 = r8.incrementAndGet(r10)     // Catch:{ all -> 0x0081 }
            long r3 = r3 & r8
            int r3 = (int) r3     // Catch:{ all -> 0x0081 }
            if (r2 != r3) goto L_0x005a
            r6 = 1
        L_0x005a:
            if (r6 == 0) goto L_0x0063
            kotlinx.coroutines.b.a$b[] r3 = r10.f83836c     // Catch:{ all -> 0x0081 }
            r3[r2] = r7     // Catch:{ all -> 0x0081 }
            int r1 = r1 + r5
            monitor-exit(r0)
            return r1
        L_0x0063:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x0071:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.<init>(r1)     // Catch:{ all -> 0x0081 }
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0081 }
            throw r2     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r0)
            return r6
        L_0x0081:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.f():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        if (r3 == null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 == 0) goto L_0x00ba
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.b.a.b
            if (r3 != 0) goto L_0x0013
            r0 = 0
        L_0x0013:
            kotlinx.coroutines.b.a$b r0 = (kotlinx.coroutines.b.a.b) r0
            kotlinx.coroutines.b.a$b[] r3 = r8.f83836c
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00b7 }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r4 <= 0) goto L_0x0072
            r3 = 1
        L_0x0023:
            kotlinx.coroutines.b.a$b[] r5 = r8.f83836c
            r5 = r5[r3]
            if (r5 != 0) goto L_0x002c
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x002c:
            if (r5 == r0) goto L_0x006d
        L_0x002e:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x0040
            r6 = r5
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x002e
        L_0x0040:
            kotlinx.coroutines.b.a$c r6 = r5.state
            kotlinx.coroutines.b.a$c r7 = kotlinx.coroutines.b.a.c.TERMINATED
            if (r6 != r7) goto L_0x0048
            r7 = 1
            goto L_0x0049
        L_0x0048:
            r7 = 0
        L_0x0049:
            if (r7 == 0) goto L_0x0053
            kotlinx.coroutines.b.o r5 = r5.f83840a
            kotlinx.coroutines.b.e r6 = r8.f83834a
            r5.a((kotlinx.coroutines.b.e) r6)
            goto L_0x006d
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected TERMINATED state, but found "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x006d:
            if (r3 == r4) goto L_0x0072
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0072:
            kotlinx.coroutines.b.e r3 = r8.f83834a
            r3.a()
        L_0x0077:
            if (r0 == 0) goto L_0x007f
            kotlinx.coroutines.b.i r3 = r0.e()
            if (r3 != 0) goto L_0x0087
        L_0x007f:
            kotlinx.coroutines.b.e r3 = r8.f83834a
            java.lang.Object r3 = r3.b()
            kotlinx.coroutines.b.i r3 = (kotlinx.coroutines.b.i) r3
        L_0x0087:
            if (r3 != 0) goto L_0x00b3
            if (r0 == 0) goto L_0x0090
            kotlinx.coroutines.b.a$c r3 = kotlinx.coroutines.b.a.c.TERMINATED
            r0.a((kotlinx.coroutines.b.a.c) r3)
        L_0x0090:
            java.util.concurrent.Semaphore r0 = r8.f83835b
            int r0 = r0.availablePermits()
            int r3 = r8.f83838f
            if (r0 != r3) goto L_0x009b
            r1 = 1
        L_0x009b:
            boolean r0 = kotlin.aa.f83419a
            if (r0 == 0) goto L_0x00ac
            if (r1 == 0) goto L_0x00a2
            goto L_0x00ac
        L_0x00a2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Assertion failed"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00ac:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
            goto L_0x00ba
        L_0x00b3:
            a((kotlinx.coroutines.b.i) r3)
            goto L_0x0077
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.close():void");
    }

    @NotNull
    public final String toString() {
        int i2;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (b bVar : this.f83836c) {
            if (bVar != null) {
                o oVar = bVar.f83840a;
                if (oVar.lastScheduledTask != null) {
                    i2 = oVar.a() + 1;
                } else {
                    i2 = oVar.a();
                }
                switch (b.f83845a[bVar.state.ordinal()]) {
                    case 1:
                        i5++;
                        break;
                    case 2:
                        i4++;
                        arrayList.add(String.valueOf(i2) + "b");
                        break;
                    case 3:
                        i3++;
                        arrayList.add(String.valueOf(i2) + "c");
                        break;
                    case 4:
                        i6++;
                        if (i2 <= 0) {
                            break;
                        } else {
                            arrayList.add(String.valueOf(i2) + "r");
                            break;
                        }
                    case 5:
                        i7++;
                        break;
                }
            }
        }
        long j2 = this.controlState;
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append('@');
        sb.append(ai.a((Object) this));
        sb.append('[');
        sb.append("Pool Size {core = ");
        sb.append(this.f83838f);
        sb.append(", max = ");
        sb.append(this.q);
        sb.append("}, Worker States {");
        sb.append("CPU = ");
        sb.append(i3);
        sb.append(", blocking = ");
        sb.append(i4);
        sb.append(", parked = ");
        sb.append(i5);
        sb.append(", retired = ");
        sb.append(i6);
        sb.append(", terminated = ");
        sb.append(i7);
        sb.append("}, running workers queues = ");
        sb.append(arrayList);
        sb.append(", global queue size = ");
        long j3 = ((k) this.f83834a._cur$internal)._state$internal;
        sb.append(1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j3) >> 0))));
        sb.append(", Control State Workers {");
        sb.append("created = ");
        sb.append((int) (2097151 & j2));
        sb.append(", blocking = ");
        sb.append((int) ((j2 & 4398044413952L) >> 21));
        sb.append('}');
        sb.append("]");
        return sb.toString();
    }

    public final void execute(@NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "command");
        a(runnable, (j) h.f83859a, false);
    }

    public static void a(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    private static int b(b bVar) {
        Object obj = bVar.nextParkedWorker;
        while (obj != m) {
            if (obj == null) {
                return 0;
            }
            b bVar2 = (b) obj;
            int i2 = bVar2.indexInArray;
            if (i2 != 0) {
                return i2;
            }
            obj = bVar2.nextParkedWorker;
        }
        return -1;
    }

    public final void a(b bVar) {
        long j2;
        long j3;
        int i2;
        boolean z;
        if (bVar.nextParkedWorker == m) {
            do {
                j2 = this.parkedWorkersStack;
                int i3 = (int) (2097151 & j2);
                j3 = (2097152 + j2) & -2097152;
                i2 = bVar.indexInArray;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!aa.f83419a || z) {
                    bVar.nextParkedWorker = this.f83836c[i3];
                } else {
                    throw new AssertionError("Assertion failed");
                }
            } while (!o.compareAndSet(this, j2, ((long) i2) | j3));
        }
    }

    @NotNull
    public static i a(@NotNull Runnable runnable, @NotNull j jVar) {
        Intrinsics.checkParameterIsNotNull(runnable, "block");
        Intrinsics.checkParameterIsNotNull(jVar, "taskContext");
        long a2 = m.g.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a2, jVar);
        }
        i iVar = (i) runnable;
        iVar.f83861f = a2;
        iVar.g = jVar;
        return iVar;
    }

    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r7.c() == false) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[RETURN] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull java.lang.Runnable r6, @org.jetbrains.annotations.NotNull kotlinx.coroutines.b.j r7, boolean r8) {
        /*
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "taskContext"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            kotlinx.coroutines.b.i r6 = a(r6, r7)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            boolean r0 = r7 instanceof kotlinx.coroutines.b.a.b
            if (r0 != 0) goto L_0x0017
            r7 = 0
        L_0x0017:
            kotlinx.coroutines.b.a$b r7 = (kotlinx.coroutines.b.a.b) r7
            r0 = -1
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x0020
        L_0x001e:
            r1 = 1
            goto L_0x006c
        L_0x0020:
            kotlinx.coroutines.b.a r3 = kotlinx.coroutines.b.a.this
            r4 = r5
            kotlinx.coroutines.b.a r4 = (kotlinx.coroutines.b.a) r4
            if (r3 == r4) goto L_0x0028
            goto L_0x001e
        L_0x0028:
            kotlinx.coroutines.b.a$c r3 = r7.state
            kotlinx.coroutines.b.a$c r4 = kotlinx.coroutines.b.a.c.TERMINATED
            if (r3 != r4) goto L_0x002f
            goto L_0x001e
        L_0x002f:
            kotlinx.coroutines.b.l r3 = r6.e()
            kotlinx.coroutines.b.l r4 = kotlinx.coroutines.b.l.NON_BLOCKING
            if (r3 != r4) goto L_0x004b
            kotlinx.coroutines.b.a$c r3 = r7.state
            kotlinx.coroutines.b.a$c r4 = kotlinx.coroutines.b.a.c.BLOCKING
            if (r3 != r4) goto L_0x003f
            r3 = 1
            goto L_0x0040
        L_0x003f:
            r3 = 0
        L_0x0040:
            if (r3 == 0) goto L_0x0044
            r3 = 0
            goto L_0x004c
        L_0x0044:
            boolean r3 = r7.c()
            if (r3 != 0) goto L_0x004b
            goto L_0x001e
        L_0x004b:
            r3 = -1
        L_0x004c:
            if (r8 == 0) goto L_0x0057
            kotlinx.coroutines.b.o r8 = r7.f83840a
            kotlinx.coroutines.b.e r4 = r5.f83834a
            boolean r8 = r8.b(r6, r4)
            goto L_0x005f
        L_0x0057:
            kotlinx.coroutines.b.o r8 = r7.f83840a
            kotlinx.coroutines.b.e r4 = r5.f83834a
            boolean r8 = r8.a((kotlinx.coroutines.b.i) r6, (kotlinx.coroutines.b.e) r4)
        L_0x005f:
            if (r8 == 0) goto L_0x006c
            kotlinx.coroutines.b.o r7 = r7.f83840a
            int r7 = r7.a()
            int r8 = kotlinx.coroutines.b.m.f83864b
            if (r7 > r8) goto L_0x006c
            r1 = r3
        L_0x006c:
            if (r1 == r0) goto L_0x009b
            if (r1 == r2) goto L_0x0074
            r5.c()
            return
        L_0x0074:
            kotlinx.coroutines.b.e r7 = r5.f83834a
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L_0x0080
            r5.c()
            return
        L_0x0080:
            java.util.concurrent.RejectedExecutionException r6 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r5.h
            r7.append(r8)
            java.lang.String r8 = " was terminated"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.a(java.lang.Runnable, kotlinx.coroutines.b.j, boolean):void");
    }

    public final void a(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & -2097152;
            if (i4 == i2) {
                if (i3 == 0) {
                    i4 = b(bVar);
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (o.compareAndSet(this, j2, j3 | ((long) i4))) {
                    return;
                }
            }
        }
    }

    public a(int i2, int i3, long j2, @NotNull String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(str, "schedulerName");
        this.f83838f = i2;
        this.q = i3;
        this.g = j2;
        this.h = str;
        if (this.f83838f > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.q >= this.f83838f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (this.q <= 2097150) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (this.g > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        this.f83834a = new e();
                        this.f83835b = new Semaphore(this.f83838f, false);
                        this.parkedWorkersStack = 0;
                        this.f83836c = new b[(this.q + 1)];
                        this.controlState = 0;
                        this.f83837e = new Random();
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + this.g + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + this.q + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + this.q + " should be greater than or equals to core pool size " + this.f83838f).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + this.f83838f + " should be at least 1").toString());
    }
}
