package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.rxutils.autodispose.LifecycleEventsObservable;
import com.bytedance.android.live.core.rxutils.autodispose.b.d;
import com.bytedance.android.live.core.rxutils.autodispose.b.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;

public final class a implements d<Lifecycle.Event> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7998a;

    /* renamed from: b  reason: collision with root package name */
    private static final com.bytedance.android.live.core.rxutils.autodispose.b.a<Lifecycle.Event> f7999b = b.f8018b;

    /* renamed from: c  reason: collision with root package name */
    private final com.bytedance.android.live.core.rxutils.autodispose.b.a<Lifecycle.Event> f8000c;

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleEventsObservable f8001d;

    /* renamed from: com.bytedance.android.live.core.rxutils.autodispose.a$a  reason: collision with other inner class name */
    static class C0062a implements com.bytedance.android.live.core.rxutils.autodispose.b.a<Lifecycle.Event> {

        /* renamed from: a  reason: collision with root package name */
        private final Lifecycle.Event f8003a;

        public final /* bridge */ /* synthetic */ Object apply(Object obj) throws ac {
            return this.f8003a;
        }

        C0062a(Lifecycle.Event event) {
            this.f8003a = event;
        }
    }

    public final Observable<Lifecycle.Event> a() {
        return this.f8001d;
    }

    public final com.bytedance.android.live.core.rxutils.autodispose.b.a<Lifecycle.Event> b() {
        return this.f8000c;
    }

    public final CompletableSource c() {
        if (PatchProxy.isSupport(new Object[0], this, f7998a, false, 663, new Class[0], CompletableSource.class)) {
            return (CompletableSource) PatchProxy.accessDispatch(new Object[0], this, f7998a, false, 663, new Class[0], CompletableSource.class);
        }
        if (!PatchProxy.isSupport(new Object[]{this}, null, e.f8019a, true, 826, new Class[]{d.class}, CompletableSource.class)) {
            return e.a(this, true);
        }
        return (CompletableSource) PatchProxy.accessDispatch(new Object[]{this}, null, e.f8019a, true, 826, new Class[]{d.class}, CompletableSource.class);
    }

    public final /* synthetic */ Object d() {
        Lifecycle.Event event;
        if (PatchProxy.isSupport(new Object[0], this, f7998a, false, 662, new Class[0], Lifecycle.Event.class)) {
            return (Lifecycle.Event) PatchProxy.accessDispatch(new Object[0], this, f7998a, false, 662, new Class[0], Lifecycle.Event.class);
        }
        LifecycleEventsObservable lifecycleEventsObservable = this.f8001d;
        if (PatchProxy.isSupport(new Object[0], lifecycleEventsObservable, LifecycleEventsObservable.f7994a, false, 810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], lifecycleEventsObservable, LifecycleEventsObservable.f7994a, false, 810, new Class[0], Void.TYPE);
        } else {
            switch (LifecycleEventsObservable.AnonymousClass1.f7997a[lifecycleEventsObservable.f7995b.getCurrentState().ordinal()]) {
                case 1:
                    event = Lifecycle.Event.ON_CREATE;
                    break;
                case 2:
                    event = Lifecycle.Event.ON_START;
                    break;
                case 3:
                case 4:
                    event = Lifecycle.Event.ON_RESUME;
                    break;
                default:
                    event = Lifecycle.Event.ON_DESTROY;
                    break;
            }
            lifecycleEventsObservable.f7996c.onNext(event);
        }
        LifecycleEventsObservable lifecycleEventsObservable2 = this.f8001d;
        if (!PatchProxy.isSupport(new Object[0], lifecycleEventsObservable2, LifecycleEventsObservable.f7994a, false, 809, new Class[0], Lifecycle.Event.class)) {
            return (Lifecycle.Event) lifecycleEventsObservable2.f7996c.getValue();
        }
        return (Lifecycle.Event) PatchProxy.accessDispatch(new Object[0], lifecycleEventsObservable2, LifecycleEventsObservable.f7994a, false, 809, new Class[0], Lifecycle.Event.class);
    }

    private a(Lifecycle lifecycle, com.bytedance.android.live.core.rxutils.autodispose.b.a<Lifecycle.Event> aVar) {
        this.f8001d = new LifecycleEventsObservable(lifecycle);
        this.f8000c = aVar;
    }

    public static a a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = event;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, event2}, null, f7998a, true, 657, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{lifecycleOwner, event2}, null, f7998a, true, 657, new Class[]{LifecycleOwner.class, Lifecycle.Event.class}, a.class);
        }
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (PatchProxy.isSupport(new Object[]{lifecycle, event2}, null, f7998a, true, 659, new Class[]{Lifecycle.class, Lifecycle.Event.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{lifecycle, event2}, null, f7998a, true, 659, new Class[]{Lifecycle.class, Lifecycle.Event.class}, a.class);
        }
        C0062a aVar = new C0062a(event2);
        if (!PatchProxy.isSupport(new Object[]{lifecycle, aVar}, null, f7998a, true, 661, new Class[]{Lifecycle.class, com.bytedance.android.live.core.rxutils.autodispose.b.a.class}, a.class)) {
            return new a(lifecycle, aVar);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{lifecycle, aVar}, null, f7998a, true, 661, new Class[]{Lifecycle.class, com.bytedance.android.live.core.rxutils.autodispose.b.a.class}, a.class);
    }
}
