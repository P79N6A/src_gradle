package com.bytedance.ies.f.b;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class c<P, R> extends a<P, R> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20627a = true;

    /* renamed from: b  reason: collision with root package name */
    private a f20628b;

    /* renamed from: f  reason: collision with root package name */
    public f f20629f;

    interface a {
        void a(@Nullable Object obj);

        void a(@Nullable Throwable th);
    }

    public interface b {
        c a();
    }

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull P p, @NonNull f fVar) throws Exception;

    /* access modifiers changed from: protected */
    public abstract void d_();

    @CallSuper
    private void b() {
        this.f20627a = false;
        this.f20629f = null;
    }

    public final void c() {
        a(null);
    }

    public final void d() {
        b(null);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        d_();
        b();
    }

    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    private boolean f() {
        if (this.f20627a) {
            return true;
        }
        i.a(new IllegalStateException("Jsb async call already finished: " + getName() + ", hashcode: " + hashCode()));
        return false;
    }

    public final void a(@Nullable R r) {
        if (f()) {
            this.f20628b.a((Object) r);
            b();
        }
    }

    public final void b(Throwable th) {
        if (f()) {
            this.f20628b.a(th);
            b();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull P p, @NonNull f fVar, @NonNull a aVar) throws Exception {
        this.f20629f = fVar;
        this.f20628b = aVar;
        a(p, fVar);
    }
}
