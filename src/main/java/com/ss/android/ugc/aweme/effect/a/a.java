package com.ss.android.ugc.aweme.effect.a;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.a.a.b;
import com.ss.android.ugc.aweme.effect.a.a.c;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.port.in.y;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 12\u00020\u0001:\u000212B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002J\u001c\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010!\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\b\u0010\"\u001a\u0004\u0018\u00010#J\u0010\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'J\u0010\u0010(\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'J\u0006\u0010)\u001a\u00020\u0018J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\tJ\u0006\u0010-\u001a\u00020\u0018J\b\u0010.\u001a\u00020\u0018H\u0002J\u0006\u0010/\u001a\u00020\u0018J\u0010\u00100\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010\tR2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;", "", "mConcurrency", "", "mStrategy", "Lcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadStrategy;", "(ILcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadStrategy;)V", "mCallbacks", "", "Lcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadCallback;", "kotlin.jvm.PlatformType", "", "mDownloadQueue", "Ljava/util/Queue;", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "mHighPriorityQueue", "mIsRunning", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsStarted", "mMainHandler", "Landroid/os/Handler;", "mSemaphore", "Ljava/util/concurrent/atomic/AtomicInteger;", "addDownloadQueue", "", "effect", "callbackDownloadFailed", "failedEffect", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "callbackDownloadSuccess", "rawEffect", "callbackDownloading", "enqueue", "getEffectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "inDownloadQueue", "", "model", "Lcom/ss/android/ugc/aweme/effect/EffectModel;", "inHighQueue", "onDestroy", "onRealStart", "registerCallback", "callback", "start", "startInternal", "stop", "unregisterCallback", "Companion", "EDCBuilder", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43645a;
    @Nullable
    public static EffectPlatform i;
    public static final C0545a j = new C0545a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public Queue<Effect> f43646b;

    /* renamed from: c  reason: collision with root package name */
    public Queue<Effect> f43647c;

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f43648d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f43649e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f43650f;
    public final AtomicInteger g;
    public final Handler h;
    private final c k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController$Companion;", "", "()V", "DEFAULT_CONCURRENCY", "", "mEffectPlatform", "Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "mEffectPlatform$annotations", "getMEffectPlatform", "()Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;", "setMEffectPlatform", "(Lcom/ss/android/ugc/aweme/effectplatform/EffectPlatform;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.effect.a.a$a  reason: collision with other inner class name */
    public static final class C0545a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43651a;

        private C0545a() {
        }

        @Nullable
        public final EffectPlatform a() {
            if (PatchProxy.isSupport(new Object[0], this, f43651a, false, 38839, new Class[0], EffectPlatform.class)) {
                return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, f43651a, false, 38839, new Class[0], EffectPlatform.class);
            }
            if (a.i == null) {
                y yVar = com.ss.android.ugc.aweme.port.in.a.h;
                Intrinsics.checkExpressionValueIsNotNull(yVar, "AVEnv.LOCATION_SERVICE");
                a.i = new EffectPlatform(com.ss.android.ugc.aweme.port.in.a.f61119b, yVar.c(), com.ss.android.ugc.aweme.port.in.a.D.getOKHttpClient());
            }
            return a.i;
        }

        public /* synthetic */ C0545a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController$EDCBuilder;", "", "()V", "concurrency", "", "Ljava/lang/Integer;", "downloadStrategy", "Lcom/ss/android/ugc/aweme/effect/download/config/IEffectDownloadStrategy;", "build", "Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController;", "withConcurrency", "size", "(Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController$EDCBuilder;", "withDownloadStrategy", "strategy", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43653a;

        /* renamed from: d  reason: collision with root package name */
        public static final C0546a f43654d = new C0546a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public Integer f43655b = 0;

        /* renamed from: c  reason: collision with root package name */
        public c f43656c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController$EDCBuilder$Companion;", "", "()V", "newBuilder", "Lcom/ss/android/ugc/aweme/effect/download/EffectDownloadController$EDCBuilder;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.effect.a.a$b$a  reason: collision with other inner class name */
        public static final class C0546a {
            private C0546a() {
            }

            public /* synthetic */ C0546a(byte b2) {
                this();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f43659c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.effectmanager.common.e.c f43660d;

        c(a aVar, Effect effect, com.ss.android.ugc.effectmanager.common.e.c cVar) {
            this.f43658b = aVar;
            this.f43659c = effect;
            this.f43660d = cVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43657a, false, 38843, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43657a, false, 38843, new Class[0], Void.TYPE);
                return;
            }
            List<b> list = this.f43658b.f43648d;
            Intrinsics.checkExpressionValueIsNotNull(list, "mCallbacks");
            for (b a2 : list) {
                a2.a(this.f43659c, this.f43660d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f43663c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Effect f43664d;

        d(a aVar, Effect effect, Effect effect2) {
            this.f43662b = aVar;
            this.f43663c = effect;
            this.f43664d = effect2;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43661a, false, 38844, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43661a, false, 38844, new Class[0], Void.TYPE);
                return;
            }
            List<b> list = this.f43662b.f43648d;
            Intrinsics.checkExpressionValueIsNotNull(list, "mCallbacks");
            for (b a2 : list) {
                a2.a(this.f43663c, this.f43664d);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f43667c;

        e(a aVar, Effect effect) {
            this.f43666b = aVar;
            this.f43667c = effect;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43665a, false, 38845, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43665a, false, 38845, new Class[0], Void.TYPE);
                return;
            }
            List<b> list = this.f43666b.f43648d;
            Intrinsics.checkExpressionValueIsNotNull(list, "mCallbacks");
            for (b a2 : list) {
                a2.a(this.f43667c);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/ss/android/ugc/aweme/effect/download/EffectDownloadController$enqueue$1$1"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43668a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43669b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f43670c;

        f(a aVar, Effect effect) {
            this.f43669b = aVar;
            this.f43670c = effect;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43668a, false, 38846, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43668a, false, 38846, new Class[0], Void.TYPE);
                return;
            }
            this.f43669b.f43650f.set(true);
            this.f43669b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/effect/download/EffectDownloadController$onRealStart$1", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchEffectListener;", "onFail", "", "failedEffect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onStart", "effect", "onSuccess", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43671a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f43672b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f43673c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.effect.a.a$g$a  reason: collision with other inner class name */
        static final class C0547a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43674a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ g f43675b;

            C0547a(g gVar) {
                this.f43675b = gVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f43674a, false, 38849, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f43674a, false, 38849, new Class[0], Void.TYPE);
                    return;
                }
                this.f43675b.f43672b.b();
            }
        }

        public final void b(@Nullable Effect effect) {
        }

        public final void a(@Nullable Effect effect) {
            if (PatchProxy.isSupport(new Object[]{effect}, this, f43671a, false, 38847, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, this, f43671a, false, 38847, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            this.f43672b.f43646b.remove(this.f43673c);
            this.f43672b.g.incrementAndGet();
            this.f43672b.a(this.f43673c, effect);
            this.f43672b.f43650f.set(true);
            this.f43672b.h.post(new C0547a(this));
        }

        g(a aVar, Effect effect) {
            this.f43672b = aVar;
            this.f43673c = effect;
        }

        public final void a(@Nullable Effect effect, @NotNull com.ss.android.ugc.effectmanager.common.e.c cVar) {
            Effect effect2 = effect;
            com.ss.android.ugc.effectmanager.common.e.c cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, this, f43671a, false, 38848, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, this, f43671a, false, 38848, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "e");
            this.f43672b.f43646b.remove(this.f43673c);
            this.f43672b.f43647c.offer(this.f43673c);
            this.f43672b.g.incrementAndGet();
            a aVar = this.f43672b;
            if (PatchProxy.isSupport(new Object[]{effect2, cVar2}, aVar, a.f43645a, false, 38830, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{effect2, cVar2}, aVar2, a.f43645a, false, 38830, new Class[]{Effect.class, com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
            } else {
                aVar.h.post(new c(aVar, effect2, cVar2));
            }
            this.f43672b.f43650f.set(!this.f43672b.f43646b.isEmpty());
        }
    }

    @Nullable
    public final EffectPlatform a() {
        if (!PatchProxy.isSupport(new Object[0], this, f43645a, false, 38823, new Class[0], EffectPlatform.class)) {
            return j.a();
        }
        return (EffectPlatform) PatchProxy.accessDispatch(new Object[0], this, f43645a, false, 38823, new Class[0], EffectPlatform.class);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43645a, false, 38825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43645a, false, 38825, new Class[0], Void.TYPE);
            return;
        }
        while (this.f43650f.get() && this.g.get() > 0) {
            if (!this.f43647c.isEmpty()) {
                Effect poll = this.f43647c.poll();
                b(poll);
                Intrinsics.checkExpressionValueIsNotNull(poll, "next");
                c(poll);
            } else {
                Effect a2 = this.k.a(this.f43646b);
                if (a2 == null) {
                    break;
                }
                b(a2);
                c(a2);
            }
            this.g.decrementAndGet();
        }
        this.f43650f.set(!this.f43646b.isEmpty());
    }

    private final void d(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43645a, false, 38828, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f43645a, false, 38828, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.h.post(new e(this, effect));
    }

    private final void b(Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43645a, false, 38826, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f43645a, false, 38826, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        if (effect != null && !this.f43646b.contains(effect)) {
            this.f43646b.add(effect);
        }
    }

    private final void c(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f43645a, false, 38827, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, this, f43645a, false, 38827, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        d(effect);
        EffectPlatform a2 = j.a();
        if (a2 != null) {
            a2.a(effect2, (i) new g(this, effect2));
        }
    }

    public final void a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f43645a, false, 38835, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f43645a, false, 38835, new Class[]{Effect.class}, Void.TYPE);
        } else if (effect != null) {
            if (!this.f43647c.contains(effect)) {
                this.f43647c.add(effect);
            }
            d(effect);
            if (!this.f43650f.get()) {
                this.h.post(new f(this, effect));
            }
        }
    }

    public final boolean a(@Nullable EffectModel effectModel) {
        String str;
        EffectModel effectModel2 = effectModel;
        if (PatchProxy.isSupport(new Object[]{effectModel2}, this, f43645a, false, 38836, new Class[]{EffectModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectModel2}, this, f43645a, false, 38836, new Class[]{EffectModel.class}, Boolean.TYPE)).booleanValue();
        } else if (effectModel2 == null) {
            return false;
        } else {
            for (Effect effect : this.f43646b) {
                if (effect != null) {
                    str = effect.name;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual((Object) str, (Object) effectModel2.name)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean b(@Nullable EffectModel effectModel) {
        String str;
        EffectModel effectModel2 = effectModel;
        if (PatchProxy.isSupport(new Object[]{effectModel2}, this, f43645a, false, 38837, new Class[]{EffectModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effectModel2}, this, f43645a, false, 38837, new Class[]{EffectModel.class}, Boolean.TYPE)).booleanValue();
        } else if (effectModel2 == null) {
            return false;
        } else {
            for (Effect effect : this.f43647c) {
                if (effect != null) {
                    str = effect.name;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual((Object) str, (Object) effectModel2.name)) {
                    return true;
                }
            }
            return false;
        }
    }

    private a(int i2, c cVar) {
        this.k = cVar;
        this.f43646b = new ConcurrentLinkedQueue();
        this.f43647c = new ConcurrentLinkedQueue();
        this.f43648d = Collections.synchronizedList(new ArrayList());
        this.f43649e = new AtomicBoolean(false);
        this.f43650f = new AtomicBoolean(false);
        this.g = new AtomicInteger(i2);
        this.h = new Handler(Looper.getMainLooper());
    }

    public final void a(@NotNull Effect effect, @Nullable Effect effect2) {
        if (PatchProxy.isSupport(new Object[]{effect, effect2}, this, f43645a, false, 38829, new Class[]{Effect.class, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect, effect2}, this, f43645a, false, 38829, new Class[]{Effect.class, Effect.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(effect, "rawEffect");
        this.h.post(new d(this, effect, effect2));
    }

    public /* synthetic */ a(int i2, c cVar, byte b2) {
        this(i2, cVar);
    }
}
