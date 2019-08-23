package com.bytedance.android.live.core.rxutils.rxlifecycle;

import android.support.annotation.NonNull;
import com.bytedance.android.live.core.rxutils.rxlifecycle.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;

public class b<V> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8122a;

    /* renamed from: b  reason: collision with root package name */
    private final Observable<V> f8123b;

    private b(Observable<V> observable) {
        this.f8123b = observable;
    }

    public static <T> b<T> a(@NonNull Observable<T> observable) {
        Observable<T> observable2 = observable;
        if (!PatchProxy.isSupport(new Object[]{observable2}, null, f8122a, true, 851, new Class[]{Observable.class}, b.class)) {
            return new b<>(observable2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{observable2}, null, f8122a, true, 851, new Class[]{Observable.class}, b.class);
    }

    @NonNull
    public final <T> ObservableTransformer<T, T> a(@NonNull V v) {
        V v2 = v;
        if (PatchProxy.isSupport(new Object[]{v2}, this, f8122a, false, 854, new Class[]{Object.class}, ObservableTransformer.class)) {
            return (ObservableTransformer) PatchProxy.accessDispatch(new Object[]{v2}, this, f8122a, false, 854, new Class[]{Object.class}, ObservableTransformer.class);
        }
        a(v2, "event == null");
        return new c(this.f8123b, v2);
    }

    private static <T> T a(T t, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{t, str2}, null, f8122a, true, 858, new Class[]{Object.class, String.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{t, str2}, null, f8122a, true, 858, new Class[]{Object.class, String.class}, Object.class);
        } else if (t != null) {
            return t;
        } else {
            throw new NullPointerException(str2);
        }
    }
}
