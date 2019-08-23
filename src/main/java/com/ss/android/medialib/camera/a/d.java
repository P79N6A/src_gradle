package com.ss.android.medialib.camera.a;

import android.graphics.SurfaceTexture;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.IESHwCamera;
import com.ss.android.medialib.camera.l;
import com.ss.android.medialib.common.a;
import com.ss.android.medialib.presenter.c;
import com.ss.android.vesdk.y;

public class d extends a {
    public static ChangeQuickRedirect h = null;
    public static final String i = "d";
    public l j = new l();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17056, new Class[0], Void.TYPE);
            return;
        }
        this.j.b();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17052, new Class[0], Void.TYPE);
        } else if (this.f29471b != null) {
            this.f29471b.a(this.j.f29615c);
        } else {
            y.d(i, "startPreview: camera is null!");
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 17054, new Class[0], Void.TYPE);
            return;
        }
        this.j.a();
        a.a("CreateTexture");
        this.j.f29616d = new SurfaceTexture.OnFrameAvailableListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29481a;

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29481a, false, 17057, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29481a, false, 17057, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (d.this.f29470a != null) {
                    d.this.f29470a.a(d.this.j.f29614b, d.this.j.f29617e);
                } else {
                    y.c(d.i, "onFrameAvailable: presenter is null!");
                }
                if (d.this.f29471b.k() == 1) {
                    z = true;
                }
                if (!(d.this.f29475f == d.this.f29471b.k() && d.this.g == d.this.f29471b.b(z))) {
                    synchronized (d.this.f29474e) {
                        d.this.f29475f = d.this.f29471b.k();
                        d.this.g = d.this.f29471b.b(z);
                        d.this.f29473d = true;
                    }
                }
                if (d.this.f29472c != null) {
                    d.this.f29472c.a();
                }
            }
        };
        if (this.f29470a != null) {
            this.f29470a.a(this.j.f29615c);
        } else {
            y.d(i, "onOpenGLCreate: presenter is null!");
        }
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 17055, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, h, false, 17055, new Class[0], Integer.TYPE)).intValue();
        }
        c cVar = this.f29470a;
        if (this.j.f29615c == null || cVar == null) {
            y.d(i, "SurfaceTexture is null");
            return -1;
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
        try {
            this.j.c();
            double d2 = this.j.d();
            this.f29470a.a(d2);
            cVar.a(d2);
            return 0;
        } catch (RuntimeException e2) {
            y.d(i, e2.getMessage());
            return -2;
        }
    }

    public d(IESCameraInterface iESCameraInterface) {
        super(iESCameraInterface);
    }

    public final void a(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, h, false, 17053, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, h, false, 17053, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 && (this.f29471b instanceof IESHwCamera)) {
            ((IESHwCamera) this.f29471b).c(z);
            ((IESHwCamera) this.f29471b).c(i2);
        }
    }
}
