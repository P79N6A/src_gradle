package com.bytedance.jedi.arch.ext.list.differ;

import android.support.v7.util.DiffUtil;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u001f\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "T", "", "diffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "mainThreadExecutor", "Ljava/util/concurrent/Executor;", "(Landroid/support/v7/util/DiffUtil$ItemCallback;Ljava/util/concurrent/Executor;)V", "backgroundThreadExecutor", "getBackgroundThreadExecutor$ext_list_release", "()Ljava/util/concurrent/Executor;", "getDiffCallback$ext_list_release", "()Landroid/support/v7/util/DiffUtil$ItemCallback;", "getMainThreadExecutor$ext_list_release", "Builder", "SerialExecutor", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class c<T> {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21368a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final DiffUtil.ItemCallback<T> f21369b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Executor f21370c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000b\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig$Builder;", "T", "", "mDiffCallback", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "(Landroid/support/v7/util/DiffUtil$ItemCallback;)V", "mMainThreadExecutor", "Ljava/util/concurrent/Executor;", "build", "Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig;", "setMainThreadExecutor", "executor", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Executor f21371a;

        /* renamed from: b  reason: collision with root package name */
        private final DiffUtil.ItemCallback<T> f21372b;

        @NotNull
        public final c<T> a() {
            return new c<>(this.f21372b, this.f21371a, (byte) 0);
        }

        public a(@NotNull DiffUtil.ItemCallback<T> itemCallback) {
            Intrinsics.checkParameterIsNotNull(itemCallback, "mDiffCallback");
            this.f21372b = itemCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig$SerialExecutor;", "Ljava/util/concurrent/Executor;", "()V", "mActive", "Ljava/lang/Runnable;", "mTasks", "Ljava/util/concurrent/LinkedBlockingQueue;", "execute", "", "r", "scheduleNext", "Companion", "ext_list_release"}, k = 1, mv = {1, 1, 15})
    public static final class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public static final Lazy f21373a = LazyKt.lazy(C0197b.INSTANCE);

        /* renamed from: b  reason: collision with root package name */
        public static final a f21374b = new a((byte) 0);

        /* renamed from: c  reason: collision with root package name */
        private final LinkedBlockingQueue<Runnable> f21375c = new LinkedBlockingQueue<>();

        /* renamed from: d  reason: collision with root package name */
        private Runnable f21376d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig$SerialExecutor$Companion;", "", "()V", "CORE_POOL_SIZE", "", "getCORE_POOL_SIZE", "()I", "CPU_COUNT", "getCPU_COUNT", "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE", "THREAD_POOL_EXECUTOR", "Ljava/util/concurrent/ThreadPoolExecutor;", "getTHREAD_POOL_EXECUTOR", "()Ljava/util/concurrent/ThreadPoolExecutor;", "THREAD_POOL_EXECUTOR$delegate", "Lkotlin/Lazy;", "Q", "ext_list_release"}, k = 1, mv = {1, 1, 15})
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ KProperty[] f21377a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "THREAD_POOL_EXECUTOR", "getTHREAD_POOL_EXECUTOR()Ljava/util/concurrent/ThreadPoolExecutor;"))};

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/differ/JediDifferConfig$SerialExecutor$Companion$Q;", "Ljava/util/concurrent/LinkedBlockingQueue;", "Ljava/lang/Runnable;", "()V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "setExecutor", "(Ljava/util/concurrent/ThreadPoolExecutor;)V", "offer", "", "e", "ext_list_release"}, k = 1, mv = {1, 1, 15})
            /* renamed from: com.bytedance.jedi.arch.ext.list.differ.c$b$a$a  reason: collision with other inner class name */
            static final class C0196a extends LinkedBlockingQueue<Runnable> {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ThreadPoolExecutor;", "T", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.arch.ext.list.differ.c$b$b  reason: collision with other inner class name */
        static final class C0197b extends Lambda implements Function0<ThreadPoolExecutor> {
            public static final C0197b INSTANCE = new C0197b();

            C0197b() {
                super(0);
            }

            @NotNull
            public final ThreadPoolExecutor invoke() {
                int max = Math.max(2, Math.min(a.a() - 1, 4));
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(max, (a.a() * 2) + 1, 0, TimeUnit.SECONDS, new a.C0196a());
                BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
                if (queue != null) {
                    ((a.C0196a) queue).setExecutor(threadPoolExecutor);
                    return threadPoolExecutor;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ext.list.differ.JediDifferConfig.SerialExecutor.Companion.Q");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.arch.ext.list.differ.c$b$c  reason: collision with other inner class name */
        static final class C0198c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f21378a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Runnable f21379b;

            C0198c(b bVar, Runnable runnable) {
                this.f21378a = bVar;
                this.f21379b = runnable;
            }

            public final void run() {
                try {
                    this.f21379b.run();
                } finally {
                    this.f21378a.a();
                }
            }
        }

        public final synchronized void a() {
            Runnable poll = this.f21375c.poll();
            if (poll != null) {
                ((ThreadPoolExecutor) f21373a.getValue()).execute(poll);
            } else {
                poll = null;
            }
            this.f21376d = poll;
        }

        public final synchronized void execute(@NotNull Runnable runnable) {
            Intrinsics.checkParameterIsNotNull(runnable, "r");
            this.f21375c.offer(new C0198c(this, runnable));
            if (this.f21376d == null) {
                a();
            }
        }
    }

    private c(DiffUtil.ItemCallback<T> itemCallback, Executor executor) {
        this.f21369b = itemCallback;
        this.f21370c = executor;
        this.f21368a = new b();
    }

    public /* synthetic */ c(DiffUtil.ItemCallback itemCallback, Executor executor, byte b2) {
        this(itemCallback, executor);
    }
}
