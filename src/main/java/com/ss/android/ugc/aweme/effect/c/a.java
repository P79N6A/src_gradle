package com.ss.android.ugc.aweme.effect.c;

import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ay;
import com.google.common.collect.be;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.c.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\u0018\u0000 a*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003:\u0001aB#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0002\u0010\bJ-\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\"¢\u0006\u0002\u0010;J-\u0010<\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00018\u00002\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\"¢\u0006\u0002\u0010;J!\u0010=\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u00109\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010>J\u001c\u0010?\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u0016\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011H\u0002J\u0015\u0010B\u001a\u00020\u00172\b\u00109\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010CJ#\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u00109\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010>J\u0015\u0010E\u001a\u00020\u00172\b\u00109\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010CJ\b\u0010F\u001a\u000208H\u0002J\u0015\u0010G\u001a\u00020\u00172\u0006\u00109\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010CJ\b\u0010H\u001a\u00020\u0017H\u0002J\u001c\u0010I\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u001c\u0010J\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u001c\u0010K\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u001c\u0010L\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016J\u0018\u0010M\u001a\u0002082\u0010\u0010N\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0015JA\u0010O\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00018\u00002\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\"2\u0012\b\u0002\u0010P\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010R\u0018\u00010QH\u0007¢\u0006\u0002\u0010SJ\u001c\u0010T\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u001c\u0010U\u001a\u0002082\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0002J\u0006\u0010V\u001a\u000208J\u001a\u0010W\u001a\u0002082\u0010\u0010X\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010R\u0018\u00010QH\u0002J\u0018\u0010Y\u001a\u0002082\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010R0QH\u0002J\b\u0010Z\u001a\u000208H\u0002J\b\u0010[\u001a\u000208H\u0002J\b\u0010\\\u001a\u00020\u0017H\u0007J\u0006\u0010]\u001a\u000208J\u0015\u0010^\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010_J+\u0010^\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00018\u00002\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\"¢\u0006\u0002\u0010;J\u001a\u0010`\u001a\u00020\u0017*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0012\u001a&\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000 \u0014*\u0012\u0012\f\u0012\n \u0014*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\u00150\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R#\u0010\u001a\u001a\n \u0014*\u0004\u0018\u00010\u001b0\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR3\u0010 \u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0!8BX\u0002¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b#\u0010$R \u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R \u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006b"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler;", "Param", "Target", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskExecCallback;", "concurrency", "", "taskGenerator", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTaskFactory;", "(ILcom/ss/android/ugc/aweme/effect/persistence/task/SerialTaskFactory;)V", "errorHandler", "Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionHandler;", "getErrorHandler", "()Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionHandler;", "setErrorHandler", "(Lcom/ss/android/ugc/aweme/effect/persistence/task/TaskExceptionHandler;)V", "mHighPriorityQueue", "Ljava/util/Queue;", "Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "mInitParam", "", "kotlin.jvm.PlatformType", "", "mIsRunning", "", "mMainHandler", "Landroid/os/Handler;", "mMainThread", "Ljava/lang/Thread;", "getMMainThread", "()Ljava/lang/Thread;", "mMainThread$delegate", "Lkotlin/Lazy;", "mMultiCallbacks", "Lcom/google/common/collect/ListMultimap;", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskCallback;", "getMMultiCallbacks", "()Lcom/google/common/collect/ListMultimap;", "mMultiCallbacks$delegate", "mNormalQueue", "mRunningQueue", "mSemaphore", "Ljava/util/concurrent/atomic/AtomicInteger;", "maxRetryCount", "getMaxRetryCount", "()I", "setMaxRetryCount", "(I)V", "onStartImmediately", "getOnStartImmediately", "()Z", "setOnStartImmediately", "(Z)V", "skipIfAdded", "getSkipIfAdded", "setSkipIfAdded", "addNormalTask", "", "param", "callback", "(Ljava/lang/Object;Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskCallback;)V", "addPriorityTask", "createTask", "(Ljava/lang/Object;)Lcom/ss/android/ugc/aweme/effect/persistence/task/SerialTask;", "dispatchTaskStateChanged", "task", "getNextTaskToRun", "inHighPriorityQueue", "(Ljava/lang/Object;)Z", "inNormalQueue", "inRunningQueue", "initNormalQueue", "isAdded", "isMainThread", "onFailed", "onRunNextTask", "onStart", "onSuccess", "prepare", "paramList", "registerCallback", "finallyBlock", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskCallback;Lkotlin/jvm/functions/Function0;)V", "removeFailedTaskIfNeeded", "removeRunningTask", "reset", "runOnUiThreadSafely", "block", "runSafely", "serialExec", "serialExecInMain", "shutdown", "start", "unregisterCallback", "(Ljava/lang/Object;)V", "isTaskFinished", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a<Param, Target> implements b<Param, Target> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43716a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f43717b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mMultiCallbacks", "getMMultiCallbacks()Lcom/google/common/collect/ListMultimap;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mMainThread", "getMMainThread()Ljava/lang/Thread;"))};
    public static final C0548a j = new C0548a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public int f43718c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43719d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43720e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.effect.c.b.d f43721f;
    public boolean g;
    final Queue<com.ss.android.ugc.aweme.effect.c.b.b<Param, Target>> h = new ConcurrentLinkedQueue();
    public final List<Param> i = Collections.synchronizedList(new ArrayList());
    private final Queue<com.ss.android.ugc.aweme.effect.c.b.b<Param, Target>> k = new ConcurrentLinkedQueue();
    private final Queue<com.ss.android.ugc.aweme.effect.c.b.b<Param, Target>> l = new ConcurrentLinkedQueue();
    private final Lazy m = LazyKt.lazy(f.INSTANCE);
    private final Handler n = new Handler(Looper.getMainLooper());
    private final Lazy o = LazyKt.lazy(e.INSTANCE);
    private AtomicInteger p = new AtomicInteger(3);
    private final com.ss.android.ugc.aweme.effect.c.b.c<Param, Target> q;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler$Companion;", "", "()V", "DEFAULT_CONCURRENCY", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.effect.c.a$a  reason: collision with other inner class name */
    public static final class C0548a {
        private C0548a() {
        }

        public /* synthetic */ C0548a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.b.b $task;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, com.ss.android.ugc.aweme.effect.c.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38886, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38886, new Class[0], Void.TYPE);
                return;
            }
            if (this.this$0.f43720e) {
                this.this$0.a(this.$task);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.b.b $task;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, com.ss.android.ugc.aweme.effect.c.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38887, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38887, new Class[0], Void.TYPE);
                return;
            }
            if (this.this$0.f43720e) {
                this.this$0.a(this.$task);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.b.b $task;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, com.ss.android.ugc.aweme.effect.c.b.b bVar) {
            super(0);
            this.this$0 = aVar;
            this.$task = bVar;
        }

        @Nullable
        public final Unit invoke() {
            Integer num;
            String str;
            Exception exc;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38888, new Class[0], Unit.class)) {
                return (Unit) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38888, new Class[0], Unit.class);
            }
            switch (this.$task.b()) {
                case 2:
                    List<com.ss.android.ugc.aweme.effect.c.a.a> list = this.this$0.a().get(this.$task.f43733f);
                    if (list == null) {
                        return null;
                    }
                    for (com.ss.android.ugc.aweme.effect.c.a.a aVar : list) {
                        if (aVar != null) {
                            aVar.a(this.$task.f43733f);
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    List<com.ss.android.ugc.aweme.effect.c.a.a> list2 = this.this$0.a().get(this.$task.f43733f);
                    if (list2 == null) {
                        return null;
                    }
                    for (com.ss.android.ugc.aweme.effect.c.a.a aVar2 : list2) {
                        if (aVar2 != null) {
                            aVar2.a(this.$task.f43733f, this.$task.f43731d);
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    List<com.ss.android.ugc.aweme.effect.c.a.a> list3 = this.this$0.a().get(this.$task.f43733f);
                    if (list3 == null) {
                        return null;
                    }
                    for (com.ss.android.ugc.aweme.effect.c.a.a aVar3 : list3) {
                        if (aVar3 != null) {
                            Param param = this.$task.f43733f;
                            com.ss.android.ugc.aweme.effect.c.b.e eVar = this.$task.f43732e;
                            if (eVar != null) {
                                num = eVar.f43736a;
                            } else {
                                num = null;
                            }
                            com.ss.android.ugc.aweme.effect.c.b.e eVar2 = this.$task.f43732e;
                            if (eVar2 != null) {
                                str = eVar2.f43737b;
                            } else {
                                str = null;
                            }
                            com.ss.android.ugc.aweme.effect.c.b.e eVar3 = this.$task.f43732e;
                            if (eVar3 != null) {
                                exc = eVar3.f43738c;
                            } else {
                                exc = null;
                            }
                            aVar3.a(param, num, str, exc);
                        }
                    }
                    return Unit.INSTANCE;
                default:
                    return Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<Thread> {
        public static final e INSTANCE = new e();
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
            super(0);
        }

        public final Thread invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38889, new Class[0], Thread.class)) {
                return (Thread) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38889, new Class[0], Thread.class);
            }
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkExpressionValueIsNotNull(mainLooper, "Looper.getMainLooper()");
            return mainLooper.getThread();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001ar\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0005 \u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00040\u0004 \u0003*8\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0002H\u0002\u0012$\u0012\"\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0005 \u0003*\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/google/common/collect/ListMultimap;", "Param", "kotlin.jvm.PlatformType", "Lcom/ss/android/ugc/aweme/effect/persistence/callback/ISerialTaskCallback;", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<ay<Param, com.ss.android.ugc.aweme.effect.c.a.a<Param, Target>>> {
        public static final f INSTANCE = new f();
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
            super(0);
        }

        public final ay<Param, com.ss.android.ugc.aweme.effect.c.a.a<Param, Target>> invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38890, new Class[0], ay.class)) {
                return be.a().b().b();
            }
            return (ay) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38890, new Class[0], ay.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "call"}, k = 3, mv = {1, 1, 15})
    static final class g<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43723b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.b.b f43724c;

        g(a aVar, com.ss.android.ugc.aweme.effect.c.b.b bVar) {
            this.f43723b = aVar;
            this.f43724c = bVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f43722a, false, 38891, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43722a, false, 38891, new Class[0], Void.TYPE);
            } else {
                try {
                    com.ss.android.ugc.aweme.effect.c.b.b bVar = this.f43724c;
                    b bVar2 = this.f43723b;
                    if (PatchProxy.isSupport(new Object[]{bVar2}, bVar, com.ss.android.ugc.aweme.effect.c.b.b.f43728a, false, 38898, new Class[]{b.class}, Void.TYPE)) {
                        com.ss.android.ugc.aweme.effect.c.b.b bVar3 = bVar;
                        PatchProxy.accessDispatch(new Object[]{bVar2}, bVar3, com.ss.android.ugc.aweme.effect.c.b.b.f43728a, false, 38898, new Class[]{b.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(bVar2, "callback");
                        bVar2.a(bVar);
                        if (bVar.a()) {
                            bVar.a(3);
                            bVar.b(bVar2);
                        } else {
                            bVar.a(2);
                            bVar.a(bVar2);
                        }
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.effect.c.b.d dVar = this.f43723b.f43721f;
                    if (dVar != null) {
                        dVar.a(e2);
                    }
                    this.f43723b.c(this.f43724c);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Function0;", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function0<Function0<? extends Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.a.a $callback;
        final /* synthetic */ Function0 $finallyBlock;
        final /* synthetic */ Object $param;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, Object obj, com.ss.android.ugc.aweme.effect.c.a.a aVar2, Function0 function0) {
            super(0);
            this.this$0 = aVar;
            this.$param = obj;
            this.$callback = aVar2;
            this.$finallyBlock = function0;
        }

        @Nullable
        public final Function0<Object> invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38892, new Class[0], Function0.class)) {
                return (Function0) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38892, new Class[0], Function0.class);
            }
            Object obj = this.$param;
            if (obj != null) {
                com.ss.android.ugc.aweme.effect.c.a.a aVar = this.$callback;
                if (aVar != null) {
                    this.this$0.a().put(obj, aVar);
                }
            }
            Function0<Object> function0 = this.$finallyBlock;
            if (function0 == null) {
                return null;
            }
            function0.invoke();
            return function0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "Param", "Target", "run", "com/ss/android/ugc/aweme/effect/persistence/PrioritySerialTaskScheduler$runOnUiThreadSafely$1$1"}, k = 3, mv = {1, 1, 15})
    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43725a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43726b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f43727c;

        i(a aVar, Function0 function0) {
            this.f43726b = aVar;
            this.f43727c = function0;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43725a, false, 38893, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43725a, false, 38893, new Class[0], Void.TYPE);
                return;
            }
            this.f43726b.b(this.f43727c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38894, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38894, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class k extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        public final void invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38895, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38895, new Class[0], Void.TYPE);
                return;
            }
            this.this$0.g = true;
            a aVar = this.this$0;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f43716a, false, 38863, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f43716a, false, 38863, new Class[0], Void.TYPE);
            } else {
                aVar.h.clear();
                List<Param> list = aVar.i;
                Intrinsics.checkExpressionValueIsNotNull(list, "mInitParam");
                for (Param a2 : list) {
                    com.ss.android.ugc.aweme.effect.c.b.b a3 = aVar.a(a2);
                    a3.f43730c = false;
                    aVar.h.offer(a3);
                }
                aVar.i.clear();
            }
            this.this$0.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Param", "Target", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class l extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.ss.android.ugc.aweme.effect.c.a.a $callback;
        final /* synthetic */ Object $param;
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(a aVar, Object obj, com.ss.android.ugc.aweme.effect.c.a.a aVar2) {
            super(0);
            this.this$0 = aVar;
            this.$param = obj;
            this.$callback = aVar2;
        }

        public final boolean invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38896, new Class[0], Boolean.TYPE)) {
                return this.this$0.a().remove(this.$param, this.$callback);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38896, new Class[0], Boolean.TYPE)).booleanValue();
        }
    }

    public final ay<Param, com.ss.android.ugc.aweme.effect.c.a.a<Param, Target>> a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38855, new Class[0], ay.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38855, new Class[0], ay.class);
        } else {
            value = this.m.getValue();
        }
        return (ay) value;
    }

    private final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38864, new Class[0], Void.TYPE);
            return;
        }
        a((Function0<? extends Object>) new j<Object>(this));
    }

    private final com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> e() {
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38873, new Class[0], com.ss.android.ugc.aweme.effect.c.b.b.class)) {
            return (com.ss.android.ugc.aweme.effect.c.b.b) PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38873, new Class[0], com.ss.android.ugc.aweme.effect.c.b.b.class);
        } else if (!this.k.isEmpty()) {
            return this.k.poll();
        } else {
            if (!this.h.isEmpty()) {
                return this.h.poll();
            }
            return null;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38866, new Class[0], Void.TYPE);
            return;
        }
        while (this.g && this.p.get() > 0) {
            com.ss.android.ugc.aweme.effect.c.b.b e2 = e();
            if (e2 != null) {
                d(e2);
                this.p.decrementAndGet();
            } else {
                return;
            }
        }
    }

    private final boolean d() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38865, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38865, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f43716a, false, 38856, new Class[0], Thread.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f43716a, false, 38856, new Class[0], Thread.class);
        } else {
            value = this.o.getValue();
        }
        return Intrinsics.areEqual((Object) (Thread) value, (Object) Thread.currentThread());
    }

    private final void e(com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar) {
        com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f43716a, false, 38872, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f43716a, false, 38872, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
            return;
        }
        this.l.remove(bVar2);
    }

    private final void f(com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43716a, false, 38874, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f43716a, false, 38874, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
            return;
        }
        a((Function0<? extends Object>) new d<Object>(this, bVar));
    }

    private final void d(com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43716a, false, 38867, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f43716a, false, 38867, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
            return;
        }
        this.l.offer(bVar);
        a.i.a((Callable<TResult>) new g<TResult>(this, bVar));
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> a(Param param) {
        Param param2 = param;
        if (!PatchProxy.isSupport(new Object[]{param2}, this, f43716a, false, 38861, new Class[]{Object.class}, com.ss.android.ugc.aweme.effect.c.b.b.class)) {
            return this.q.a(param2);
        }
        return (com.ss.android.ugc.aweme.effect.c.b.b) PatchProxy.accessDispatch(new Object[]{param2}, this, f43716a, false, 38861, new Class[]{Object.class}, com.ss.android.ugc.aweme.effect.c.b.b.class);
    }

    public final boolean c(@Nullable Param param) {
        Object obj;
        boolean z;
        Param param2 = param;
        if (PatchProxy.isSupport(new Object[]{param2}, this, f43716a, false, 38877, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{param2}, this, f43716a, false, 38877, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (param2 == null) {
            return false;
        } else {
            Iterator it2 = this.k.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Param param3 = ((com.ss.android.ugc.aweme.effect.c.b.b) obj).f43733f;
                if (param3 == null || !param3.equals(param2)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (((com.ss.android.ugc.aweme.effect.c.b.b) obj) != null) {
                return true;
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
        if (4 != r2) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f43716a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.b.b> r3 = com.ss.android.ugc.aweme.effect.c.b.b.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 38868(0x97d4, float:5.4466E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f43716a
            r13 = 0
            r14 = 38868(0x97d4, float:5.4466E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.b.b> r0 = com.ss.android.ugc.aweme.effect.c.b.b.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            java.lang.String r2 = "task"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f43716a
            r13 = 0
            r14 = 38885(0x97e5, float:5.449E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.b.b> r2 = com.ss.android.ugc.aweme.effect.c.b.b.class
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0074
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f43716a
            r13 = 0
            r14 = 38885(0x97e5, float:5.449E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.effect.c.b.b> r1 = com.ss.android.ugc.aweme.effect.c.b.b.class
            r15[r9] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0082
        L_0x0074:
            if (r0 != 0) goto L_0x0078
        L_0x0076:
            r1 = 0
            goto L_0x0082
        L_0x0078:
            int r2 = r18.b()
            r3 = 3
            if (r3 == r2) goto L_0x0082
            r3 = 4
            if (r3 != r2) goto L_0x0076
        L_0x0082:
            if (r1 != 0) goto L_0x0088
            r1 = 2
            r0.a((int) r1)
        L_0x0088:
            r17.f(r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.c.a.a(com.ss.android.ugc.aweme.effect.c.b.b):void");
    }

    public final void b(@NotNull com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar) {
        com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f43716a, false, 38869, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f43716a, false, 38869, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "task");
        bVar2.a(3);
        e(bVar);
        f(bVar);
        this.p.incrementAndGet();
        c();
    }

    public final void c(@NotNull com.ss.android.ugc.aweme.effect.c.b.b<Param, Target> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43716a, false, 38870, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f43716a, false, 38870, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "task");
        bVar.a(4);
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f43716a, false, 38871, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f43716a, false, 38871, new Class[]{com.ss.android.ugc.aweme.effect.c.b.b.class}, Void.TYPE);
        } else {
            e(bVar);
            if (bVar.f43729b < this.f43718c) {
                bVar.f43729b++;
                this.h.offer(bVar);
            }
        }
        f(bVar);
        this.p.incrementAndGet();
        c();
    }

    public final void b(Function0<? extends Object> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f43716a, false, 38884, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f43716a, false, 38884, new Class[]{Function0.class}, Void.TYPE);
            return;
        }
        try {
            function0.invoke();
        } catch (Exception e2) {
            Exception exc = e2;
            com.ss.android.ugc.aweme.effect.c.b.d dVar = this.f43721f;
            if (dVar != null) {
                dVar.a(exc);
            }
        }
    }

    public final void a(Function0<? extends Object> function0) {
        if (PatchProxy.isSupport(new Object[]{function0}, this, f43716a, false, 38883, new Class[]{Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{function0}, this, f43716a, false, 38883, new Class[]{Function0.class}, Void.TYPE);
        } else if (d()) {
            b(function0);
        } else {
            this.n.post(new i(this, function0));
        }
    }

    public final boolean b(@Nullable Param param) {
        Object obj;
        boolean z;
        Param param2 = param;
        if (PatchProxy.isSupport(new Object[]{param2}, this, f43716a, false, 38875, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{param2}, this, f43716a, false, 38875, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (param2 == null) {
            return false;
        } else {
            Iterator it2 = this.l.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                Param param3 = ((com.ss.android.ugc.aweme.effect.c.b.b) obj).f43733f;
                if (param3 == null || !param3.equals(param2)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (((com.ss.android.ugc.aweme.effect.c.b.b) obj) != null) {
                return true;
            }
            return false;
        }
    }

    public a(int i2, @NotNull com.ss.android.ugc.aweme.effect.c.b.c<Param, Target> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "taskGenerator");
        this.q = cVar;
    }

    public final void a(@Nullable Param param, @Nullable com.ss.android.ugc.aweme.effect.c.a.a<Param, Target> aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{param, aVar}, this, f43716a, false, 38858, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{param, aVar}, this, f43716a, false, 38858, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
        } else if (param != null) {
            if (this.f43719d) {
                if (PatchProxy.isSupport(new Object[]{param}, this, f43716a, false, 38860, new Class[]{Object.class}, Boolean.TYPE)) {
                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{param}, this, f43716a, false, 38860, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                } else {
                    Iterator it2 = this.h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        Param param2 = ((com.ss.android.ugc.aweme.effect.c.b.b) obj).f43733f;
                        if (param2 == null || !param2.equals(param)) {
                            z3 = false;
                            continue;
                        } else {
                            z3 = true;
                            continue;
                        }
                        if (z3) {
                            break;
                        }
                    }
                    if (((com.ss.android.ugc.aweme.effect.c.b.b) obj) == null) {
                        Iterator it3 = this.k.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it3.next();
                            Param param3 = ((com.ss.android.ugc.aweme.effect.c.b.b) obj2).f43733f;
                            if (param3 == null || !param3.equals(param)) {
                                z2 = false;
                                continue;
                            } else {
                                z2 = true;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                        if (((com.ss.android.ugc.aweme.effect.c.b.b) obj2) == null) {
                            Iterator it4 = this.l.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = it4.next();
                                Param param4 = ((com.ss.android.ugc.aweme.effect.c.b.b) obj3).f43733f;
                                if (param4 == null || !param4.equals(param)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            if (((com.ss.android.ugc.aweme.effect.c.b.b) obj3) == null) {
                                z4 = false;
                            }
                        }
                    }
                }
                if (z4) {
                    return;
                }
            }
            com.ss.android.ugc.aweme.effect.c.b.b a2 = a(param);
            a2.f43730c = false;
            this.h.offer(a2);
            a(param, aVar, new b(this, a2));
            b();
        }
    }

    public final void b(@Nullable Param param, @Nullable com.ss.android.ugc.aweme.effect.c.a.a<Param, Target> aVar) {
        Object obj;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{param, aVar}, this, f43716a, false, 38859, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{param, aVar}, this, f43716a, false, 38859, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class}, Void.TYPE);
        } else if (param != null) {
            if (!this.f43719d || (!c(param) && !b(param))) {
                if (!PatchProxy.isSupport(new Object[]{param}, this, f43716a, false, 38876, new Class[]{Object.class}, com.ss.android.ugc.aweme.effect.c.b.b.class)) {
                    Iterator it2 = this.h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next = it2.next();
                        Param param2 = ((com.ss.android.ugc.aweme.effect.c.b.b) next).f43733f;
                        if (param2 == null || !param2.equals(param)) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            obj = next;
                            break;
                        }
                    }
                } else {
                    obj = PatchProxy.accessDispatch(new Object[]{param}, this, f43716a, false, 38876, new Class[]{Object.class}, com.ss.android.ugc.aweme.effect.c.b.b.class);
                }
                com.ss.android.ugc.aweme.effect.c.b.b bVar = (com.ss.android.ugc.aweme.effect.c.b.b) obj;
                if (bVar != null) {
                    this.h.remove(bVar);
                } else {
                    bVar = a(param);
                }
                bVar.f43730c = true;
                this.k.offer(bVar);
                a(param, aVar, new c(this, bVar));
                b();
            }
        }
    }

    @JvmOverloads
    public final void a(@Nullable Param param, @Nullable com.ss.android.ugc.aweme.effect.c.a.a<Param, Target> aVar, @Nullable Function0<? extends Object> function0) {
        Param param2 = param;
        com.ss.android.ugc.aweme.effect.c.a.a<Param, Target> aVar2 = aVar;
        Function0<? extends Object> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{param2, aVar2, function02}, this, f43716a, false, 38878, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class, Function0.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{param2, aVar2, function02}, this, f43716a, false, 38878, new Class[]{Object.class, com.ss.android.ugc.aweme.effect.c.a.a.class, Function0.class}, Void.TYPE);
            return;
        }
        a((Function0<? extends Object>) new h<Object>(this, param2, aVar2, function02));
    }
}
