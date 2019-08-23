package com.bytedance.jedi.arch;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001&B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0018\u001a\u00020\fH\u0016J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\u001c\u0010\u001b\u001a\u00020\f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J!\u0010!\u001a\u00020\f2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0002\b#H\u0016J\f\u0010$\u001a\u00020%*\u00020%H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/bytedance/jedi/arch/RxStore;", "S", "", "Lcom/bytedance/jedi/arch/Store;", "initialState", "scheduler", "Lio/reactivex/Scheduler;", "(Ljava/lang/Object;Lio/reactivex/Scheduler;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "flushQueueSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "jobs", "Lcom/bytedance/jedi/arch/RxStore$Jobs;", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "state", "getState", "()Ljava/lang/Object;", "subject", "dispose", "flushQueues", "flushSetStateQueue", "get", "block", "Lkotlin/Function1;", "handleError", "throwable", "", "set", "stateReducer", "Lkotlin/ExtensionFunctionType;", "registerDisposable", "Lio/reactivex/disposables/Disposable;", "Jobs", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class s<S> implements y<S> {

    /* renamed from: a  reason: collision with root package name */
    private final BehaviorSubject<S> f21404a;

    /* renamed from: b  reason: collision with root package name */
    private final CompositeDisposable f21405b = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    private final BehaviorSubject<Unit> f21406c;

    /* renamed from: d  reason: collision with root package name */
    private final a<S> f21407d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Observable<S> f21408e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\r\u001a\u001b\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\b\f\u0018\u00010\u000eJ#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006J)\u0010\u0010\u001a\u00020\n2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006J\u001f\u0010\u0012\u001a\u00020\n2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\b\fR/\u0010\u0004\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R%\u0010\u000b\u001a\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\b\f0\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/jedi/arch/RxStore$Jobs;", "S", "", "()V", "getStateQueue", "Ljava/util/LinkedList;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "", "setStateQueue", "Lkotlin/ExtensionFunctionType;", "dequeueAllSetStateBlocks", "", "dequeueGetStateBlock", "enqueueGetStateBlock", "block", "enqueueSetStateBlock", "arch_release"}, k = 1, mv = {1, 1, 15})
    static final class a<S> {

        /* renamed from: a  reason: collision with root package name */
        private final LinkedList<Function1<S, Unit>> f21410a = new LinkedList<>();

        /* renamed from: b  reason: collision with root package name */
        private LinkedList<Function1<S, S>> f21411b = new LinkedList<>();

        @Nullable
        public final synchronized Function1<S, Unit> a() {
            if (this.f21410a.isEmpty()) {
                return null;
            }
            return this.f21410a.removeFirst();
        }

        @Nullable
        public final synchronized List<Function1<S, S>> b() {
            if (this.f21411b.isEmpty()) {
                return null;
            }
            LinkedList<Function1<S, S>> linkedList = this.f21411b;
            this.f21411b = new LinkedList<>();
            return linkedList;
        }

        public final synchronized void a(@NotNull Function1<? super S, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            this.f21410a.add(function1);
        }

        public final synchronized void b(@NotNull Function1<? super S, ? extends S> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            this.f21411b.add(function1);
        }
    }

    @NotNull
    public final Observable<S> a() {
        return this.f21408e;
    }

    public final void d() {
        this.f21405b.dispose();
    }

    @NotNull
    public final S b() {
        S value = this.f21404a.getValue();
        if (value == null) {
            Intrinsics.throwNpe();
        }
        return value;
    }

    public final void c() {
        while (true) {
            List<Function1> b2 = this.f21407d.b();
            if (b2 != null) {
                Object b3 = b();
                for (Function1 invoke : b2) {
                    b3 = invoke.invoke(b3);
                }
                this.f21404a.onNext(b3);
            }
            Function1 a2 = this.f21407d.a();
            if (a2 != null) {
                a2.invoke(b());
            } else {
                return;
            }
        }
    }

    public final void a(@NotNull Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "block");
        this.f21407d.a(function1);
        this.f21406c.onNext(Unit.INSTANCE);
    }

    public final void b(@NotNull Function1<? super S, ? extends S> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "stateReducer");
        this.f21407d.b(function1);
        this.f21406c.onNext(Unit.INSTANCE);
    }

    public s(@NotNull S s, @NotNull Scheduler scheduler) {
        Intrinsics.checkParameterIsNotNull(s, "initialState");
        Intrinsics.checkParameterIsNotNull(scheduler, "scheduler");
        BehaviorSubject<S> createDefault = BehaviorSubject.createDefault(s);
        Intrinsics.checkExpressionValueIsNotNull(createDefault, "BehaviorSubject.createDefault(initialState)");
        this.f21404a = createDefault;
        BehaviorSubject<Unit> create = BehaviorSubject.create();
        Intrinsics.checkExpressionValueIsNotNull(create, "BehaviorSubject.create<Unit>()");
        this.f21406c = create;
        this.f21407d = new a<>();
        Observable<S> hide = this.f21404a.hide();
        Intrinsics.checkExpressionValueIsNotNull(hide, "subject.hide()");
        this.f21408e = hide;
        Disposable subscribe = this.f21406c.observeOn(scheduler).subscribe(new Consumer<Unit>(this) {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s f21409a;

            {
                this.f21409a = r1;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.f21409a.c();
            }
        }, new t(new Function1<Throwable, Unit>(this) {
            public final String getName() {
                return "handleError";
            }

            public final KDeclarationContainer getOwner() {
                return Reflection.getOrCreateKotlinClass(s.class);
            }

            public final String getSignature() {
                return "handleError(Ljava/lang/Throwable;)V";
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Throwable th2;
                Intrinsics.checkParameterIsNotNull(th, "p1");
                while (true) {
                    if (th != null) {
                        th2 = th.getCause();
                    } else {
                        th2 = null;
                    }
                    if (th2 == null) {
                        break;
                    }
                    th = th.getCause();
                }
                if (th != null) {
                    throw th;
                }
            }
        }));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "flushQueueSubject.observ…ueues() }, ::handleError)");
        this.f21405b.add(subscribe);
    }
}
