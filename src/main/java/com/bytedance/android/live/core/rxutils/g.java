package com.bytedance.android.live.core.rxutils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import org.a.b;

public class g<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8099a;

    public CompletableSource apply(Completable completable) {
        Completable completable2 = completable;
        if (!PatchProxy.isSupport(new Object[]{completable2}, this, f8099a, false, 624, new Class[]{Completable.class}, CompletableSource.class)) {
            return completable2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
        return (CompletableSource) PatchProxy.accessDispatch(new Object[]{completable2}, this, f8099a, false, 624, new Class[]{Completable.class}, CompletableSource.class);
    }

    public MaybeSource<T> apply(Maybe<T> maybe) {
        Maybe<T> maybe2 = maybe;
        if (!PatchProxy.isSupport(new Object[]{maybe2}, this, f8099a, false, 621, new Class[]{Maybe.class}, MaybeSource.class)) {
            return maybe2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
        return (MaybeSource) PatchProxy.accessDispatch(new Object[]{maybe2}, this, f8099a, false, 621, new Class[]{Maybe.class}, MaybeSource.class);
    }

    public ObservableSource<T> apply(Observable<T> observable) {
        Observable<T> observable2 = observable;
        if (!PatchProxy.isSupport(new Object[]{observable2}, this, f8099a, false, 622, new Class[]{Observable.class}, ObservableSource.class)) {
            return observable2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
        return (ObservableSource) PatchProxy.accessDispatch(new Object[]{observable2}, this, f8099a, false, 622, new Class[]{Observable.class}, ObservableSource.class);
    }

    public SingleSource<T> apply(Single<T> single) {
        Single<T> single2 = single;
        if (!PatchProxy.isSupport(new Object[]{single2}, this, f8099a, false, 623, new Class[]{Single.class}, SingleSource.class)) {
            return single2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
        return (SingleSource) PatchProxy.accessDispatch(new Object[]{single2}, this, f8099a, false, 623, new Class[]{Single.class}, SingleSource.class);
    }

    public b<T> apply(Flowable<T> flowable) {
        Flowable<T> flowable2 = flowable;
        if (!PatchProxy.isSupport(new Object[]{flowable2}, this, f8099a, false, 625, new Class[]{Flowable.class}, b.class)) {
            return flowable2.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }
        return (b) PatchProxy.accessDispatch(new Object[]{flowable2}, this, f8099a, false, 625, new Class[]{Flowable.class}, b.class);
    }
}
