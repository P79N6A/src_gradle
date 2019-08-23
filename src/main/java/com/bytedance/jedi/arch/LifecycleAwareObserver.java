package com.bytedance.jedi.arch;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00020\u0003B5\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0007J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0007H\u0007J\u0015\u0010\u000b\u001a\u00020\r2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0003H\u0016J\b\u0010%\u001a\u00020\u0007H\u0002J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0002J\u001e\u0010'\u001a\u00020\t2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010$\u001a\u00020\u0003H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006)"}, d2 = {"Lcom/bytedance/jedi/arch/LifecycleAwareObserver;", "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/reactivex/disposables/Disposable;", "Landroid/arch/lifecycle/LifecycleObserver;", "Lio/reactivex/Observer;", "owner", "Landroid/arch/lifecycle/LifecycleOwner;", "alwaysDeliverLastValueWhenActivate", "", "force", "onNext", "Lkotlin/Function1;", "", "(Landroid/arch/lifecycle/LifecycleOwner;ZZLkotlin/jvm/functions/Function1;)V", "isActive", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastValue", "Ljava/lang/Object;", "sourceObserver", "undeliveredValue", "activate", "isEventEmittedByParent", "deactivate", "dispose", "isDisposed", "onComplete", "onDestroy", "onError", "e", "", "onLifecycleEvent", "realOwner", "t", "(Ljava/lang/Object;)V", "onSubscribe", "d", "requireOwner", "requireSourceObserver", "setOnce", "field", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class LifecycleAwareObserver<T> extends AtomicReference<Disposable> implements LifecycleObserver, Observer<T>, Disposable {
    private final boolean alwaysDeliverLastValueWhenActivate;
    private final boolean force;
    private final AtomicBoolean isActive;
    private T lastValue;
    private LifecycleOwner owner;
    private Observer<T> sourceObserver;
    private T undeliveredValue;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "t", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 1, 15})
    static final class a<T> implements Consumer<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Function1 f21340a;

        a(Function1 function1) {
            this.f21340a = function1;
        }

        public final void accept(T t) {
            this.f21340a.invoke(t);
        }
    }

    public final void onComplete() {
        a().onComplete();
    }

    public final boolean isDisposed() {
        if (((Disposable) get()) == j.f21393a) {
            return true;
        }
        return false;
    }

    private final Observer<T> a() {
        Observer<T> observer = this.sourceObserver;
        if (observer != null) {
            return observer;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    private final LifecycleOwner b() {
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    public final void dispose() {
        Disposable disposable = (Disposable) get();
        Disposable disposable2 = j.f21393a;
        if (disposable != disposable2) {
            Disposable disposable3 = (Disposable) getAndSet(disposable2);
            if (!(disposable3 == disposable2 || disposable3 == null)) {
                disposable3.dispose();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        b().getLifecycle().removeObserver(this);
        if (!isDisposed()) {
            dispose();
        }
        this.owner = null;
        this.sourceObserver = null;
    }

    public final void onError(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        if (!isDisposed()) {
            lazySet(j.f21393a);
            a().onError(th);
        }
    }

    public final void onNext(T t) {
        if (this.force) {
            a().onNext(t);
        } else if (this.isActive.get()) {
            a().onNext(t);
        } else {
            this.undeliveredValue = t;
        }
        this.lastValue = t;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public final void onLifecycleEvent(@NotNull LifecycleOwner lifecycleOwner) {
        boolean z;
        T t;
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "realOwner");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "realOwner.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (lifecycleOwner instanceof q) {
                z = ((q) lifecycleOwner).a();
            } else {
                z = true;
            }
            if (!this.isActive.getAndSet(true) && !isDisposed()) {
                if (z || !this.alwaysDeliverLastValueWhenActivate || this.lastValue == null) {
                    t = this.undeliveredValue;
                } else {
                    t = this.lastValue;
                }
                this.undeliveredValue = null;
                if (t != null) {
                    onNext(t);
                }
            }
            return;
        }
        this.isActive.set(false);
    }

    public final void onSubscribe(@NotNull Disposable disposable) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(disposable, "d");
        AtomicReference atomicReference = this;
        if (!compareAndSet(null, disposable)) {
            disposable.dispose();
            if (((Disposable) atomicReference.get()) != j.f21393a) {
                RxJavaPlugins.onError(new ProtocolViolationException("Disposable already set!"));
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            b().getLifecycle().addObserver(this);
            a().onSubscribe(this);
        }
    }

    public LifecycleAwareObserver(@NotNull LifecycleOwner lifecycleOwner, boolean z, boolean z2, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "owner");
        Intrinsics.checkParameterIsNotNull(function1, "onNext");
        this.alwaysDeliverLastValueWhenActivate = z;
        this.force = z2;
        this.owner = lifecycleOwner;
        this.sourceObserver = new LambdaObserver(new a(function1), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, Functions.emptyConsumer());
        this.isActive = new AtomicBoolean(false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, function1);
    }
}
