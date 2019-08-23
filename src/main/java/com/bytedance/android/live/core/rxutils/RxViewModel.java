package com.bytedance.android.live.core.rxutils;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.CallSuper;
import android.util.Pair;
import com.bytedance.android.live.core.rxutils.rxlifecycle.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;

public class RxViewModel extends ViewModel {
    public static ChangeQuickRedirect j;

    /* renamed from: a  reason: collision with root package name */
    private final CompositeDisposable f7990a = new CompositeDisposable();

    /* renamed from: b  reason: collision with root package name */
    private final List<Pair<LiveData, Observer>> f7991b = new ArrayList();
    public final BehaviorSubject<a> k = BehaviorSubject.create();

    @CallSuper
    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 652, new Class[0], Void.TYPE);
            return;
        }
        this.f7990a.clear();
        for (Pair next : this.f7991b) {
            ((LiveData) next.first).removeObserver((Observer) next.second);
        }
        this.f7991b.clear();
        this.k.onNext(a.DESTROY);
    }

    public final void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, j, false, 653, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, j, false, 653, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.f7990a.add(disposable2);
    }
}
