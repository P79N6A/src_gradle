package com.bytedance.android.livesdk.u;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.Subject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17426a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f17427c;

    /* renamed from: b  reason: collision with root package name */
    private final Subject<Object> f17428b = PublishSubject.create().toSerialized();

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f17426a, true, 13134, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f17426a, true, 13134, new Class[0], a.class);
        }
        if (f17427c == null) {
            synchronized (a.class) {
                if (f17427c == null) {
                    f17427c = new a();
                }
            }
        }
        return f17427c;
    }

    public final <T> Observable<T> a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f17426a, false, 13136, new Class[]{Class.class}, Observable.class)) {
            return this.f17428b.ofType(cls2).observeOn(AndroidSchedulers.mainThread());
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{cls2}, this, f17426a, false, 13136, new Class[]{Class.class}, Observable.class);
    }

    public final void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f17426a, false, 13135, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f17426a, false, 13135, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f17428b.onNext(obj2);
    }
}
