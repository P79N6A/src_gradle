package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.CompletableTransformer;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.MaybeTransformer;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.disposables.CompositeDisposable;

public final class a<T> implements CompletableTransformer, MaybeTransformer<T, T>, ObservableTransformer<T, T>, SingleTransformer<T, T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7992a;

    /* renamed from: b  reason: collision with root package name */
    CompositeDisposable f7993b;

    public a(CompositeDisposable compositeDisposable) {
        this.f7993b = compositeDisposable;
    }

    public final CompletableSource apply(Completable completable) {
        Completable completable2 = completable;
        if (!PatchProxy.isSupport(new Object[]{completable2}, this, f7992a, false, 615, new Class[]{Completable.class}, CompletableSource.class)) {
            return completable2.doOnSubscribe(new d(this));
        }
        return (CompletableSource) PatchProxy.accessDispatch(new Object[]{completable2}, this, f7992a, false, 615, new Class[]{Completable.class}, CompletableSource.class);
    }

    public final MaybeSource<T> apply(Maybe<T> maybe) {
        Maybe<T> maybe2 = maybe;
        if (!PatchProxy.isSupport(new Object[]{maybe2}, this, f7992a, false, 616, new Class[]{Maybe.class}, MaybeSource.class)) {
            return maybe2.doOnSubscribe(new e(this));
        }
        return (MaybeSource) PatchProxy.accessDispatch(new Object[]{maybe2}, this, f7992a, false, 616, new Class[]{Maybe.class}, MaybeSource.class);
    }

    public final ObservableSource<T> apply(Observable<T> observable) {
        Observable<T> observable2 = observable;
        if (!PatchProxy.isSupport(new Object[]{observable2}, this, f7992a, false, 613, new Class[]{Observable.class}, ObservableSource.class)) {
            return observable2.doOnSubscribe(new b(this));
        }
        return (ObservableSource) PatchProxy.accessDispatch(new Object[]{observable2}, this, f7992a, false, 613, new Class[]{Observable.class}, ObservableSource.class);
    }

    public final SingleSource<T> apply(Single<T> single) {
        Single<T> single2 = single;
        if (!PatchProxy.isSupport(new Object[]{single2}, this, f7992a, false, 614, new Class[]{Single.class}, SingleSource.class)) {
            return single2.doOnSubscribe(new c(this));
        }
        return (SingleSource) PatchProxy.accessDispatch(new Object[]{single2}, this, f7992a, false, 614, new Class[]{Single.class}, SingleSource.class);
    }
}
