package com.ss.android.ugc.aweme.shortvideo.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.j.d;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65918a;

    /* renamed from: b  reason: collision with root package name */
    private final d f65919b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaRecordPresenter f65920c;

    /* renamed from: d  reason: collision with root package name */
    private int f65921d;

    /* renamed from: e  reason: collision with root package name */
    private int f65922e;

    /* renamed from: f  reason: collision with root package name */
    private int f65923f;
    private int g;
    private float h = 1.0f;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private int l;

    public final void a(boolean z) {
    }

    public final void a(boolean z, boolean z2) {
    }

    public final void b(boolean z) {
    }

    public final void b(boolean z, boolean z2) {
    }

    public final void c(int i2) {
    }

    public final void c(boolean z, boolean z2) {
    }

    public final int d() {
        return 0;
    }

    public final void d(int i2) {
    }

    public final int f() {
        return 0;
    }

    public final int g() {
        return 0;
    }

    public final void g(int i2) {
    }

    public final int b() {
        return this.f65922e;
    }

    public final int c() {
        return this.f65923f;
    }

    public final int e() {
        return this.f65921d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65918a, false, 75237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65918a, false, 75237, new Class[0], Void.TYPE);
            return;
        }
        this.j = a.M.d(a.C0682a.EyesMax);
        this.h = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.SmoothMax);
        this.i = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ShapeMax);
        this.k = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ContourMax);
        this.g = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserContourLevel);
        if (this.g == -1) {
            this.g = (int) (com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ContourDefault) * 100.0f);
        }
        this.f65922e = 10;
        this.f65923f = 10;
        this.f65921d = 30;
        g(this.g);
        a(this.f65922e);
        e(this.f65921d);
        b(this.f65923f);
    }

    public final void f(int i2) {
        this.l = i2;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75239, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75239, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65922e = i2;
        float f2 = (((float) this.f65923f) / 100.0f) * this.j;
        float f3 = (((float) i2) / 100.0f) * this.i;
        if (f2 == 0.0f && f3 == 0.0f) {
            this.f65919b.b(0.0f, 0.0f);
        } else {
            this.f65919b.b(f2, f3);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75240, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75240, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65923f = i2;
        float f2 = (((float) i2) / 100.0f) * this.j;
        float f3 = (((float) this.f65922e) / 100.0f) * this.i;
        if (f2 == 0.0f && f3 == 0.0f) {
            this.f65919b.b(0.0f, 0.0f);
        } else {
            this.f65919b.b(f2, f3);
        }
    }

    public final void e(int i2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75238, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65918a, false, 75238, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65921d = i2;
        float f3 = (((float) i2) / 100.0f) * this.h;
        d dVar = this.f65919b;
        if (this.l == 0) {
            f2 = 0.35f;
        } else {
            f2 = 0.0f;
        }
        dVar.a(f3, f2);
    }

    public k(d dVar, MediaRecordPresenter mediaRecordPresenter) {
        this.f65919b = dVar;
        this.f65920c = mediaRecordPresenter;
    }
}
