package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.v4.app.Fragment;
import android.view.View;
import com.bytedance.android.live.core.rxutils.autodispose.a.c;
import com.bytedance.android.live.core.rxutils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.parallel.ParallelFlowable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8028a;

    private static <T> m<T> a(CompletableSource completableSource, f<T> fVar) {
        final CompletableSource completableSource2 = completableSource;
        final f<T> fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{completableSource2, fVar2}, null, f8028a, true, 676, new Class[]{CompletableSource.class, f.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{completableSource2, fVar2}, null, f8028a, true, 676, new Class[]{CompletableSource.class, f.class}, m.class);
        }
        s.a(completableSource2, "scope == null");
        return new m<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8029a;

            public final /* synthetic */ Object apply(ParallelFlowable parallelFlowable) {
                ParallelFlowable parallelFlowable2 = parallelFlowable;
                if (!PatchProxy.isSupport(new Object[]{parallelFlowable2}, this, f8029a, false, 683, new Class[]{ParallelFlowable.class}, ad.class)) {
                    return new l(parallelFlowable2, completableSource2);
                }
                return (ad) PatchProxy.accessDispatch(new Object[]{parallelFlowable2}, this, f8029a, false, 683, new Class[]{ParallelFlowable.class}, ad.class);
            }

            public final /* synthetic */ Object apply(Completable completable) {
                final Completable completable2;
                if (PatchProxy.isSupport(new Object[]{completable}, this, f8029a, false, 684, new Class[]{Completable.class}, w.class)) {
                    return (w) PatchProxy.accessDispatch(new Object[]{completable}, this, f8029a, false, 684, new Class[]{Completable.class}, w.class);
                }
                if (fVar2 != null) {
                    completable2 = completable.compose(fVar2);
                } else {
                    completable2 = completable;
                }
                return new w() {
                };
            }

            public final /* synthetic */ Object apply(Flowable flowable) {
                final Flowable flowable2;
                if (PatchProxy.isSupport(new Object[]{flowable}, this, f8029a, false, 685, new Class[]{Flowable.class}, y.class)) {
                    return (y) PatchProxy.accessDispatch(new Object[]{flowable}, this, f8029a, false, 685, new Class[]{Flowable.class}, y.class);
                }
                if (fVar2 != null) {
                    flowable2 = flowable.compose(fVar2);
                } else {
                    flowable2 = flowable;
                }
                return new y<T>() {
                };
            }

            public final /* synthetic */ Object apply(Maybe maybe) {
                final Maybe maybe2;
                if (PatchProxy.isSupport(new Object[]{maybe}, this, f8029a, false, 686, new Class[]{Maybe.class}, aa.class)) {
                    return (aa) PatchProxy.accessDispatch(new Object[]{maybe}, this, f8029a, false, 686, new Class[]{Maybe.class}, aa.class);
                }
                if (fVar2 != null) {
                    maybe2 = maybe.compose(fVar2);
                } else {
                    maybe2 = maybe;
                }
                return new aa<T>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8036a;

                    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                        if (!PatchProxy.isSupport(new Object[]{consumer, consumer2}, this, f8036a, false, 709, new Class[]{Consumer.class, Consumer.class}, Disposable.class)) {
                            return new o(maybe2, completableSource2).subscribe(consumer, consumer2);
                        }
                        return (Disposable) PatchProxy.accessDispatch(new Object[]{consumer, consumer2}, this, f8036a, false, 709, new Class[]{Consumer.class, Consumer.class}, Disposable.class);
                    }
                };
            }

            public final /* synthetic */ Object apply(Observable observable) {
                final Observable observable2;
                if (PatchProxy.isSupport(new Object[]{observable}, this, f8029a, false, 687, new Class[]{Observable.class}, ab.class)) {
                    return (ab) PatchProxy.accessDispatch(new Object[]{observable}, this, f8029a, false, 687, new Class[]{Observable.class}, ab.class);
                }
                if (fVar2 != null) {
                    observable2 = observable.compose(fVar2);
                } else {
                    observable2 = observable;
                }
                return new ab<T>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8039a;

                    public final void a(Observer<? super T> observer) {
                        if (PatchProxy.isSupport(new Object[]{observer}, this, f8039a, false, 720, new Class[]{Observer.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{observer}, this, f8039a, false, 720, new Class[]{Observer.class}, Void.TYPE);
                            return;
                        }
                        new p(observable2, completableSource2).subscribe(observer);
                    }

                    public final Disposable a(Consumer<? super T> consumer) {
                        if (!PatchProxy.isSupport(new Object[]{consumer}, this, f8039a, false, 716, new Class[]{Consumer.class}, Disposable.class)) {
                            return new p(observable2, completableSource2).subscribe(consumer);
                        }
                        return (Disposable) PatchProxy.accessDispatch(new Object[]{consumer}, this, f8039a, false, 716, new Class[]{Consumer.class}, Disposable.class);
                    }

                    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                        if (!PatchProxy.isSupport(new Object[]{consumer, consumer2}, this, f8039a, false, 717, new Class[]{Consumer.class, Consumer.class}, Disposable.class)) {
                            return new p(observable2, completableSource2).subscribe(consumer, consumer2);
                        }
                        return (Disposable) PatchProxy.accessDispatch(new Object[]{consumer, consumer2}, this, f8039a, false, 717, new Class[]{Consumer.class, Consumer.class}, Disposable.class);
                    }
                };
            }

            public final /* synthetic */ Object apply(Single single) {
                final Single single2;
                if (PatchProxy.isSupport(new Object[]{single}, this, f8029a, false, 688, new Class[]{Single.class}, af.class)) {
                    return (af) PatchProxy.accessDispatch(new Object[]{single}, this, f8029a, false, 688, new Class[]{Single.class}, af.class);
                }
                if (fVar2 != null) {
                    single2 = single.compose(fVar2);
                } else {
                    single2 = single;
                }
                return new af<T>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8042a;

                    public final Disposable a(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
                        if (!PatchProxy.isSupport(new Object[]{consumer, consumer2}, this, f8042a, false, 727, new Class[]{Consumer.class, Consumer.class}, Disposable.class)) {
                            return new r(single2, completableSource2).subscribe(consumer, consumer2);
                        }
                        return (Disposable) PatchProxy.accessDispatch(new Object[]{consumer, consumer2}, this, f8042a, false, 727, new Class[]{Consumer.class, Consumer.class}, Disposable.class);
                    }
                };
            }
        };
    }

    static final /* synthetic */ CompletableSource b(ae aeVar) throws Exception {
        try {
            return aeVar.c();
        } catch (ac e2) {
            Consumer<? super ac> a2 = q.a();
            if (a2 == null) {
                return Completable.error((Throwable) e2);
            }
            a2.accept(e2);
            return Completable.complete();
        }
    }

    static final /* synthetic */ CompletableSource c(ae aeVar) throws Exception {
        try {
            return aeVar.c();
        } catch (ac e2) {
            Consumer<? super ac> a2 = q.a();
            if (a2 == null) {
                return Completable.error((Throwable) e2);
            }
            a2.accept(e2);
            return Completable.complete();
        }
    }

    public static <T> m<T> a(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner2}, null, f8028a, true, 672, new Class[]{LifecycleOwner.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{lifecycleOwner2}, null, f8028a, true, 672, new Class[]{LifecycleOwner.class}, m.class);
        } else if (lifecycleOwner2 == null) {
            return a(h.f8050b);
        } else {
            return a((ae) a.a(lifecycleOwner2, Lifecycle.Event.ON_DESTROY));
        }
    }

    public static <T> m<T> a(Fragment fragment) {
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{fragment2}, null, f8028a, true, 671, new Class[]{Fragment.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{fragment2}, null, f8028a, true, 671, new Class[]{Fragment.class}, m.class);
        } else if (fragment2 == null) {
            return a(g.f8048b);
        } else {
            return a((ae) a.a(fragment2, Lifecycle.Event.ON_DESTROY));
        }
    }

    public static <T> m<T> a(View view) {
        ae aeVar;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f8028a, true, 673, new Class[]{View.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{view2}, null, f8028a, true, 673, new Class[]{View.class}, m.class);
        } else if (view2 == null) {
            return a(i.f8052b);
        } else {
            if (PatchProxy.isSupport(new Object[]{view2}, null, c.f8015a, true, 821, new Class[]{View.class}, ae.class)) {
                aeVar = (ae) PatchProxy.accessDispatch(new Object[]{view2}, null, c.f8015a, true, 821, new Class[]{View.class}, ae.class);
            } else if (view2 != null) {
                aeVar = new c(view2);
            } else {
                throw new NullPointerException("view == null");
            }
            return a(aeVar);
        }
    }

    public static <T> m<T> a(ae aeVar) {
        ae aeVar2 = aeVar;
        if (PatchProxy.isSupport(new Object[]{aeVar2}, null, f8028a, true, 674, new Class[]{ae.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{aeVar2}, null, f8028a, true, 674, new Class[]{ae.class}, m.class);
        }
        s.a(aeVar2, "provider == null");
        return a((CompletableSource) Completable.defer(new j(aeVar2)), (f<T>) null);
    }

    public static <T> m<T> a(ae aeVar, f<T> fVar) {
        ae aeVar2 = aeVar;
        f<T> fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{aeVar2, fVar2}, null, f8028a, true, 675, new Class[]{ae.class, f.class}, m.class)) {
            return (m) PatchProxy.accessDispatch(new Object[]{aeVar2, fVar2}, null, f8028a, true, 675, new Class[]{ae.class, f.class}, m.class);
        }
        s.a(aeVar2, "provider == null");
        return a((CompletableSource) Completable.defer(new k(aeVar2)), fVar2);
    }
}
