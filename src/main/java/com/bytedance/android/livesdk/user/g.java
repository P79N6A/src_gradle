package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.network.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class g<T> implements Observer<T>, SingleObserver<T> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f17443c;

    public void onComplete() {
    }

    public void onNext(T t) {
    }

    public void onSubscribe(Disposable disposable) {
    }

    public void onSuccess(T t) {
    }

    public void onError(Throwable th) {
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{th2}, this, f17443c, false, 13532, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th2}, this, f17443c, false, 13532, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        a.a("LiveEmptyObserver", th2);
        if (th2 instanceof b) {
            a.c("LiveEmptyObserver", "ApiServerException thrown, url: " + ((b) th2).getUrl());
        }
    }
}
