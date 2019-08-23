package com.bytedance.android.live.core.rxutils.autodispose.b;

import com.bytedance.android.live.core.rxutils.autodispose.ac;
import com.bytedance.android.live.core.rxutils.autodispose.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import java.util.Comparator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8019a;

    /* renamed from: b  reason: collision with root package name */
    private static final Comparator<Comparable<Object>> f8020b = h.f8027b;

    public static <E> CompletableSource a(d<E> dVar, boolean z) throws ac {
        Predicate predicate;
        if (PatchProxy.isSupport(new Object[]{dVar, (byte) 1}, null, f8019a, true, 827, new Class[]{d.class, Boolean.TYPE}, CompletableSource.class)) {
            return (CompletableSource) PatchProxy.accessDispatch(new Object[]{dVar, (byte) 1}, null, f8019a, true, 827, new Class[]{d.class, Boolean.TYPE}, CompletableSource.class);
        }
        Object d2 = dVar.d();
        a b2 = dVar.b();
        if (d2 != null) {
            try {
                Object apply = b2.apply(d2);
                Observable a2 = dVar.a();
                if (PatchProxy.isSupport(new Object[]{a2, apply}, null, f8019a, true, 828, new Class[]{Observable.class, Object.class}, CompletableSource.class)) {
                    return (CompletableSource) PatchProxy.accessDispatch(new Object[]{a2, apply}, null, f8019a, true, 828, new Class[]{Observable.class, Object.class}, CompletableSource.class);
                }
                Comparator<Comparable<Object>> comparator = null;
                if (apply instanceof Comparable) {
                    comparator = f8020b;
                }
                if (PatchProxy.isSupport(new Object[]{a2, apply, comparator}, null, f8019a, true, 829, new Class[]{Observable.class, Object.class, Comparator.class}, CompletableSource.class)) {
                    return (CompletableSource) PatchProxy.accessDispatch(new Object[]{a2, apply, comparator}, null, f8019a, true, 829, new Class[]{Observable.class, Object.class, Comparator.class}, CompletableSource.class);
                }
                if (comparator != null) {
                    predicate = new f(comparator, apply);
                } else {
                    predicate = new g(apply);
                }
                return a2.skip(1).takeUntil(predicate).ignoreElements();
            } catch (Exception e2) {
                Exception exc = e2;
                if (!(exc instanceof b)) {
                    return Completable.error((Throwable) exc);
                }
                Consumer a3 = q.a();
                if (a3 != null) {
                    try {
                        a3.accept((b) exc);
                        return Completable.complete();
                    } catch (Exception e3) {
                        return Completable.error((Throwable) e3);
                    }
                } else {
                    throw exc;
                }
            }
        } else {
            throw new c();
        }
    }
}
