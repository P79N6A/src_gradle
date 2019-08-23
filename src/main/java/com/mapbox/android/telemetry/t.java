package com.mapbox.android.telemetry;

import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    final l<r> f26125a = new l<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f26126b;

    /* renamed from: c  reason: collision with root package name */
    private final z f26127c;

    /* access modifiers changed from: package-private */
    public final List<r> a() {
        return this.f26125a.a();
    }

    t(z zVar) {
        this.f26127c = zVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(r rVar) {
        boolean z;
        if (this.f26125a.f26115b >= 180) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return this.f26125a.a(rVar);
        }
        if (!this.f26126b) {
            l<r> lVar = this.f26125a;
            lVar.f26114a.remove();
            return lVar.f26114a.add(rVar);
        }
        this.f26127c.a(this.f26125a, rVar);
        return false;
    }
}
