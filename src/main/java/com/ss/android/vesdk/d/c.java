package com.ss.android.vesdk.d;

import android.support.annotation.NonNull;
import android.view.Surface;
import com.ss.android.vesdk.a;

public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private a<d> f77934a;

    /* renamed from: c  reason: collision with root package name */
    public int f77935c;

    /* renamed from: d  reason: collision with root package name */
    public int f77936d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f77937e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f77938f;

    public final boolean a(@NonNull d dVar) {
        return this.f77934a.a(dVar);
    }

    public final boolean b(d dVar) {
        return this.f77934a.b(dVar);
    }

    public final void a(Surface surface) {
        this.f77937e = surface;
        this.f77938f = false;
        for (d a2 : this.f77934a.b()) {
            a2.a(surface);
        }
    }

    public final void b(Surface surface) {
        for (d b2 : this.f77934a.b()) {
            b2.b(surface);
        }
    }

    public final void a(Surface surface, int i, int i2, int i3) {
        if (this.f77935c == i3 && this.f77936d == i3 && surface == this.f77937e) {
            this.f77938f = false;
        } else {
            this.f77938f = true;
            this.f77935c = i2;
            this.f77936d = i3;
        }
        for (d a2 : this.f77934a.b()) {
            a2.a(surface, i, i2, i3);
        }
    }
}
