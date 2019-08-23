package com.bytedance.jedi.model.i;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/model/util/SerialExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mActive", "Ljava/lang/Runnable;", "mTasks", "Ljava/util/concurrent/LinkedBlockingQueue;", "execute", "", "r", "scheduleNext", "Companion", "model_release"}, k = 1, mv = {1, 1, 15})
public final class j implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final Lazy f21739a = LazyKt.lazy(b.INSTANCE);

    /* renamed from: b  reason: collision with root package name */
    public static final a f21740b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f21741c = new LinkedBlockingQueue<>();

    /* renamed from: d  reason: collision with root package name */
    private Runnable f21742d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/model/util/SerialExecutor$Companion;", "", "()V", "CORE_POOL_SIZE", "", "getCORE_POOL_SIZE", "()I", "CPU_COUNT", "getCPU_COUNT", "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE", "THREAD_POOL_EXECUTOR", "Ljava/util/concurrent/ThreadPoolExecutor;", "getTHREAD_POOL_EXECUTOR", "()Ljava/util/concurrent/ThreadPoolExecutor;", "THREAD_POOL_EXECUTOR$delegate", "Lkotlin/Lazy;", "Q", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f21743a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "THREAD_POOL_EXECUTOR", "getTHREAD_POOL_EXECUTOR()Ljava/util/concurrent/ThreadPoolExecutor;"))};

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/jedi/model/util/SerialExecutor$Companion$Q;", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/lang/Runnable;", "()V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "offer", "", "e", "model_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.i.j$a$a  reason: collision with other inner class name */
        static final class C0221a extends LinkedBlockingQueue<Runnable> {
            @NotNull
            public ThreadPoolExecutor executor;

            public final int getSize() {
                return super.size();
            }

            public final int size() {
                return getSize();
            }

            @NotNull
            public final ThreadPoolExecutor getExecutor() {
                ThreadPoolExecutor threadPoolExecutor = this.executor;
                if (threadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                }
                return threadPoolExecutor;
            }

            public final /* bridge */ boolean contains(Runnable runnable) {
                return super.contains(runnable);
            }

            public final /* bridge */ boolean remove(Runnable runnable) {
                return super.remove(runnable);
            }

            public final void setExecutor(@NotNull ThreadPoolExecutor threadPoolExecutor) {
                Intrinsics.checkParameterIsNotNull(threadPoolExecutor, "<set-?>");
                this.executor = threadPoolExecutor;
            }

            public final /* bridge */ boolean contains(Object obj) {
                boolean z;
                if (obj != null) {
                    z = obj instanceof Runnable;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                return contains((Runnable) obj);
            }

            public final /* bridge */ boolean remove(Object obj) {
                boolean z;
                if (obj != null) {
                    z = obj instanceof Runnable;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
                return remove((Runnable) obj);
            }

            public final boolean offer(@Nullable Runnable runnable) {
                ThreadPoolExecutor threadPoolExecutor = this.executor;
                if (threadPoolExecutor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                }
                int poolSize = threadPoolExecutor.getPoolSize();
                int maximumPoolSize = threadPoolExecutor.getMaximumPoolSize();
                int activeCount = threadPoolExecutor.getActiveCount();
                if (poolSize <= activeCount && maximumPoolSize > activeCount) {
                    return false;
                }
                return super.offer(runnable);
            }
        }

        private a() {
        }

        static int a() {
            return Runtime.getRuntime().availableProcessors();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<ThreadPoolExecutor> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final ThreadPoolExecutor invoke() {
            int max = Math.max(2, Math.min(a.a() - 1, 4));
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, (a.a() * 2) + 1, 0, TimeUnit.SECONDS, new a.C0221a());
            BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
            if (queue != null) {
                ((a.C0221a) queue).setExecutor(threadPoolExecutor);
                return threadPoolExecutor;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.util.SerialExecutor.Companion.Q");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f21744a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f21745b;

        c(j jVar, Runnable runnable) {
            this.f21744a = jVar;
            this.f21745b = runnable;
        }

        public final void run() {
            try {
                this.f21745b.run();
            } finally {
                this.f21744a.a();
            }
        }
    }

    public final synchronized void a() {
        Runnable poll = this.f21741c.poll();
        if (poll != null) {
            ((ThreadPoolExecutor) f21739a.getValue()).execute(poll);
        } else {
            poll = null;
        }
        this.f21742d = poll;
    }

    public final synchronized void execute(@NotNull Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "r");
        this.f21741c.offer(new c(this, runnable));
        if (this.f21742d == null) {
            a();
        }
    }
}
