package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.RestrictTo;
import com.bytedance.android.live.core.rxutils.autodispose.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;
import io.reactivex.subjects.BehaviorSubject;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class LifecycleEventsObservable extends Observable<Lifecycle.Event> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7994a;

    /* renamed from: b  reason: collision with root package name */
    final Lifecycle f7995b;

    /* renamed from: c  reason: collision with root package name */
    final BehaviorSubject<Lifecycle.Event> f7996c = BehaviorSubject.create();

    static final class ArchLifecycleObserver extends MainThreadDisposable implements LifecycleObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f1824a;

        /* renamed from: b  reason: collision with root package name */
        private final Lifecycle f1825b;

        /* renamed from: c  reason: collision with root package name */
        private final Observer<? super Lifecycle.Event> f1826c;

        /* renamed from: d  reason: collision with root package name */
        private final BehaviorSubject<Lifecycle.Event> f1827d;

        public final void onDispose() {
            if (PatchProxy.isSupport(new Object[0], this, f1824a, false, 812, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f1824a, false, 812, new Class[0], Void.TYPE);
                return;
            }
            this.f1825b.removeObserver(this);
        }

        /* access modifiers changed from: package-private */
        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public final void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event}, this, f1824a, false, 813, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event}, this, f1824a, false, 813, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, Void.TYPE);
                return;
            }
            if (!isDisposed()) {
                if (!(event == Lifecycle.Event.ON_CREATE && this.f1827d.getValue() == event)) {
                    this.f1827d.onNext(event);
                }
                this.f1826c.onNext(event);
            }
        }

        ArchLifecycleObserver(Lifecycle lifecycle, Observer<? super Lifecycle.Event> observer, BehaviorSubject<Lifecycle.Event> behaviorSubject) {
            this.f1825b = lifecycle;
            this.f1826c = observer;
            this.f1827d = behaviorSubject;
        }
    }

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.LifecycleEventsObservable$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7997a = new int[Lifecycle.State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.arch.lifecycle.Lifecycle$State[] r0 = android.arch.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7997a = r0
                int[] r0 = f7997a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f7997a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f7997a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f7997a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f7997a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.arch.lifecycle.Lifecycle$State r1 = android.arch.lifecycle.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.rxutils.autodispose.LifecycleEventsObservable.AnonymousClass1.<clinit>():void");
        }
    }

    LifecycleEventsObservable(Lifecycle lifecycle) {
        this.f7995b = lifecycle;
    }

    public final void subscribeActual(Observer<? super Lifecycle.Event> observer) {
        if (PatchProxy.isSupport(new Object[]{observer}, this, f7994a, false, 811, new Class[]{Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{observer}, this, f7994a, false, 811, new Class[]{Observer.class}, Void.TYPE);
            return;
        }
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.f7995b, observer, this.f7996c);
        observer.onSubscribe(archLifecycleObserver);
        if (!a.a()) {
            observer.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
            return;
        }
        this.f7995b.addObserver(archLifecycleObserver);
        if (archLifecycleObserver.isDisposed()) {
            this.f7995b.removeObserver(archLifecycleObserver);
        }
    }
}
