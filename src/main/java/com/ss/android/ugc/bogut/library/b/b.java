package com.ss.android.ugc.bogut.library.b;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.ss.android.ugc.bogut.library.a.a;
import com.ss.android.ugc.bogut.library.factory.c;

public final class b<P extends a> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.bogut.library.factory.b<P> f77167a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private P f77168b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private Bundle f77169c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f77170d;

    public final void c() {
        if (this.f77168b != null && this.f77170d) {
            this.f77168b.detachView();
            this.f77170d = false;
        }
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        a();
        if (this.f77168b != null) {
            Bundle bundle2 = new Bundle();
            this.f77168b.save(bundle2);
            bundle.putBundle("presenter", bundle2);
            bundle.putString("presenter_id", c.INSTANCE.getId(this.f77168b));
        }
        return bundle;
    }

    public final P a() {
        Bundle bundle;
        if (this.f77167a != null) {
            if (this.f77168b == null && this.f77169c != null) {
                this.f77168b = (a) c.INSTANCE.getPresenter(this.f77169c.getString("presenter_id"));
            }
            if (this.f77168b == null) {
                this.f77168b = this.f77167a.a();
                c.INSTANCE.add(this.f77168b);
                P p = this.f77168b;
                if (this.f77169c == null) {
                    bundle = null;
                } else {
                    bundle = this.f77169c.getBundle("presenter");
                }
                p.create(bundle);
            }
            this.f77169c = null;
        }
        return this.f77168b;
    }

    public b(@Nullable com.ss.android.ugc.bogut.library.factory.b<P> bVar) {
        this.f77167a = bVar;
    }

    public final void a(boolean z) {
        if (this.f77168b != null && z) {
            this.f77168b.destroy();
            this.f77168b = null;
        }
    }

    public final void a(Bundle bundle) {
        if (this.f77168b == null) {
            this.f77169c = (Bundle) a.a(a.a((Object) bundle));
            return;
        }
        throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
    }

    public final void a(Object obj) {
        a();
        if (this.f77168b != null && !this.f77170d) {
            this.f77168b.attachView(obj);
            this.f77170d = true;
        }
    }
}
