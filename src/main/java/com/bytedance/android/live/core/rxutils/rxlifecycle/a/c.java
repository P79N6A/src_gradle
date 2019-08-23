package com.bytedance.android.live.core.rxutils.rxlifecycle.a;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

public final class c<T, R> implements ObservableTransformer<T, T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8119a;

    /* renamed from: b  reason: collision with root package name */
    private final Observable<R> f8120b;

    /* renamed from: c  reason: collision with root package name */
    private final R f8121c;

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f8119a, false, 863, new Class[0], Integer.TYPE)) {
            return (this.f8120b.hashCode() * 31) + this.f8121c.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8119a, false, 863, new Class[0], Integer.TYPE)).intValue();
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f8119a, false, 864, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f8119a, false, 864, new Class[0], String.class);
        }
        return "UntilEventObservableTransformer{lifecycle=" + this.f8120b + ", event=" + this.f8121c + '}';
    }

    public final boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8119a, false, 862, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f8119a, false, 862, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f8120b.equals(cVar.f8120b)) {
                return false;
            }
            return this.f8121c.equals(cVar.f8121c);
        }
    }

    public final ObservableSource<T> apply(Observable<T> observable) {
        Observable observable2;
        Observable<T> observable3 = observable;
        if (PatchProxy.isSupport(new Object[]{observable3}, this, f8119a, false, 861, new Class[]{Observable.class}, ObservableSource.class)) {
            return (ObservableSource) PatchProxy.accessDispatch(new Object[]{observable3}, this, f8119a, false, 861, new Class[]{Observable.class}, ObservableSource.class);
        }
        Observable<R> observable4 = this.f8120b;
        R r = this.f8121c;
        if (PatchProxy.isSupport(new Object[]{observable4, r}, null, a.f8116a, true, 859, new Class[]{Observable.class, Object.class}, Observable.class)) {
            observable2 = (Observable) PatchProxy.accessDispatch(new Object[]{observable4, r}, null, a.f8116a, true, 859, new Class[]{Observable.class, Object.class}, Observable.class);
        } else {
            observable2 = observable4.filter(new b(r)).take(1);
        }
        return observable3.takeUntil((ObservableSource<U>) observable2);
    }

    public c(@NonNull Observable<R> observable, @NonNull R r) {
        this.f8120b = observable;
        this.f8121c = r;
    }
}
