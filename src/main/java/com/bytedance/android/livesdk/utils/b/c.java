package com.bytedance.android.livesdk.utils.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.ObservableConverter;

public class c<T> implements ObservableConverter<T, b<T>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17592a;

    public static <T> c<T> a() {
        if (PatchProxy.isSupport(new Object[0], null, f17592a, true, 13826, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f17592a, true, 13826, new Class[0], c.class);
        }
        return new c<>();
    }

    public /* synthetic */ Object apply(Observable observable) {
        Observable observable2 = observable;
        if (PatchProxy.isSupport(new Object[]{observable2}, this, f17592a, false, 13827, new Class[]{Observable.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{observable2}, this, f17592a, false, 13827, new Class[]{Observable.class}, b.class);
        }
        if (!PatchProxy.isSupport(new Object[]{observable2}, null, b.f17590a, true, 13811, new Class[]{Observable.class}, b.class)) {
            return new b(observable2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{observable2}, null, b.f17590a, true, 13811, new Class[]{Observable.class}, b.class);
    }
}
