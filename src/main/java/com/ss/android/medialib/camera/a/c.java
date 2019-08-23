package com.ss.android.medialib.camera.a;

import android.graphics.SurfaceTexture;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.a;
import com.ss.android.medialib.camera.j;
import com.ss.android.medialib.camera.l;

public final class c extends a {
    public static ChangeQuickRedirect h;
    private boolean i;
    private l j = new l();

    public final void a(boolean z, int i2) {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17049, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17049, new Class[0], Void.TYPE);
            return;
        }
        this.j.b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17046, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29471b != null) {
            this.f29471b.e();
        }
    }

    public final void a() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17047, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29470a != null) {
            if (this.f29471b.m() != 17) {
                i2 = 1;
            }
            this.f29470a.a(i2);
        }
        this.j.a();
        this.f29471b.b(this.j.f29615c);
        this.j.f29616d = new SurfaceTexture.OnFrameAvailableListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29479a;

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29479a, false, 17051, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29479a, false, 17051, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (c.this.f29471b.k() == 1) {
                    z = true;
                }
                if (c.this.f29475f != c.this.f29471b.k() || c.this.g != c.this.f29471b.b(z)) {
                    synchronized (c.this.f29474e) {
                        c.this.f29475f = c.this.f29471b.k();
                        c.this.g = c.this.f29471b.b(z);
                        c.this.f29473d = true;
                    }
                }
            }
        };
        if (this.f29470a != null) {
            this.f29470a.a(this.j.f29615c);
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17048, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 17048, new Class[0], Integer.TYPE)).intValue();
        }
        com.ss.android.medialib.presenter.c cVar = this.f29470a;
        if (this.f29471b == null || cVar == null) {
            return 0;
        }
        if (this.f29473d) {
            synchronized (this.f29474e) {
                boolean z = true;
                if (this.f29471b.k() != 1) {
                    z = false;
                }
                cVar.a(this.g, z);
                this.f29473d = false;
            }
        }
        if (this.i) {
            SurfaceTexture surfaceTexture = this.j.f29615c;
            if (surfaceTexture != null) {
                try {
                    surfaceTexture.updateTexImage();
                    cVar.a(this.j.d());
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    public c(final IESCameraInterface iESCameraInterface) {
        super(iESCameraInterface);
        this.i = iESCameraInterface instanceof a;
        iESCameraInterface.a((IESCameraInterface.c) new IESCameraInterface.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29476a;

            public final void a(int i, j jVar) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), jVar}, this, f29476a, false, 17050, new Class[]{Integer.TYPE, j.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), jVar}, this, f29476a, false, 17050, new Class[]{Integer.TYPE, j.class}, Void.TYPE);
                    return;
                }
                if (!(c.this.f29470a == null || iESCameraInterface == null)) {
                    c.this.f29470a.a(jVar);
                }
                if (c.this.f29472c != null) {
                    c.this.f29472c.a();
                }
            }
        });
    }
}
