package io.fabric.sdk.android.services.a;

import android.content.Context;

public abstract class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c<T> f83158a;

    /* access modifiers changed from: protected */
    public abstract T a();

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public a(c<T> cVar) {
        this.f83158a = cVar;
    }

    public final synchronized T a(Context context, d<T> dVar) throws Exception {
        T a2;
        T t;
        a2 = a();
        if (a2 == null) {
            if (this.f83158a != null) {
                t = this.f83158a.a(context, dVar);
            } else {
                t = dVar.load(context);
            }
            a2 = t;
            if (a2 != null) {
                a(a2);
            } else {
                throw new NullPointerException();
            }
        }
        return a2;
    }
}
