package com.ss.android.vesdk;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import com.ss.android.ttve.nativePort.TELogcat;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.d;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f;
import com.ss.android.ttvecamera.f.b;
import com.ss.android.ttvecamera.f.c;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.a.a;
import com.ss.android.vesdk.af;
import com.ss.android.vesdk.l;
import java.util.List;

public class k implements TECameraSettings.f, d.a, a {
    private static final String i = "k";

    /* renamed from: a  reason: collision with root package name */
    protected l f78012a;

    /* renamed from: b  reason: collision with root package name */
    protected TECameraSettings f78013b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f78014c;

    /* renamed from: d  reason: collision with root package name */
    protected aj f78015d = new aj(1280, 720);

    /* renamed from: e  reason: collision with root package name */
    protected af.d f78016e;

    /* renamed from: f  reason: collision with root package name */
    protected VEListener.d f78017f;
    public com.ss.android.vesdk.b.a g;
    public boolean h;
    private a<com.ss.android.vesdk.b.a> j;
    private d k = new d(this);
    private boolean l = false;
    private b.a m = new b.a() {
        public final void onFrameCaptured(e eVar) {
            com.ss.android.vesdk.b.a aVar = k.this.g;
            if (!(aVar == null || aVar.f77925c == null)) {
                aVar.f77925c.onFrameCaptured(eVar);
            }
            if (!k.this.h) {
                VEListener.d dVar = k.this.f78017f;
                if (dVar != null) {
                    dVar.a(3, 0, "Camera first frame captured");
                }
                k.this.h = true;
            }
        }
    };

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onCaptureStopped(int i2) {
    }

    public final aj i() {
        return this.f78015d;
    }

    public final void a(af.d dVar) {
        this.f78016e = dVar;
    }

    public final boolean a() {
        return this.f78016e != null && this.f78016e.a();
    }

    public final void a(Bundle bundle) {
        f.INSTANCE.setFeatureParameters(this.k, bundle);
    }

    public final void a(@NonNull l.g gVar) {
        f.INSTANCE.lambda$process$14$TECameraServer(this.k, new TECameraSettings.c(gVar.f78030a));
    }

    public final int d() {
        return this.k.c();
    }

    public final void f() {
        this.f78016e = null;
        this.f78017f = null;
    }

    public final int e() {
        this.l = false;
        return this.k.a();
    }

    public final boolean g() {
        return f.INSTANCE.isTorchSupported(this.k);
    }

    public final int h() {
        return f.INSTANCE.lambda$queryZoomAbility$11$TECameraServer(this.k, this);
    }

    public final int b() {
        if (this.f78013b.j.f31335a <= 0 || this.f78013b.j.f31336b <= 0) {
            return -100;
        }
        if (!this.l) {
            com.ss.android.medialib.log.e.f29698a = System.currentTimeMillis();
        }
        this.l = true;
        return this.k.a(this.f78013b);
    }

    public final int c() {
        b.a aVar;
        c.a aVar2;
        if (this.j == null || this.j.a()) {
            y.d(i, "start with empty TECapturePipeline list");
            return -100;
        }
        boolean z = false;
        boolean equals = "landscape".equals(this.f78012a.k);
        for (com.ss.android.vesdk.b.a aVar3 : this.j.b()) {
            if (aVar3 == null || !aVar3.a()) {
                y.c(i, "pipeline is not valid");
            } else {
                if (aVar3.f77926d) {
                    aVar = this.m;
                    this.g = aVar3;
                } else {
                    aVar = aVar3.f77925c;
                }
                b.a aVar4 = aVar;
                if (aVar3.f77923a == e.b.PIXEL_FORMAT_OpenGL_OES) {
                    com.ss.android.vesdk.b.b bVar = (com.ss.android.vesdk.b.b) aVar3;
                    aVar2 = new c.a(bVar.f77924b, aVar4, bVar.f77926d, bVar.g, bVar.f77928f);
                } else {
                    aVar2 = new c.a(aVar3.f77924b, aVar4, aVar3.f77926d, aVar3.f77923a);
                }
                this.k.a(aVar2);
                z = true;
                aVar3.f77927e = equals;
            }
        }
        if (z) {
            return this.k.b();
        }
        return -1;
    }

    public final void a(VEListener.d dVar) {
        this.f78017f = dVar;
    }

    public final int a(float f2) {
        return f.INSTANCE.lambda$startZoom$12$TECameraServer(this.k, f2, this);
    }

    private TECameraSettings b(l lVar) {
        if (lVar == null) {
            return null;
        }
        TECameraSettings tECameraSettings = new TECameraSettings(this.f78014c);
        tECameraSettings.f31292c = lVar.i.ordinal();
        tECameraSettings.f31294e = lVar.j.ordinal();
        tECameraSettings.o = lVar.h.ordinal();
        tECameraSettings.j.f31335a = lVar.f78028f.f77891b;
        tECameraSettings.j.f31336b = lVar.f78028f.f77890a;
        tECameraSettings.v = lVar.f78027e;
        tECameraSettings.w = lVar.l;
        tECameraSettings.p = lVar.q;
        this.f78015d.f77890a = tECameraSettings.j.f31335a;
        this.f78015d.f77891b = tECameraSettings.j.f31336b;
        tECameraSettings.u = lVar.p;
        return tECameraSettings;
    }

    public final int a(a<com.ss.android.vesdk.b.a> aVar) {
        this.j = aVar;
        if (this.j != null && !this.j.a()) {
            return c();
        }
        y.d(i, "start with empty TECapturePipeline list");
        return -100;
    }

    public final int a(l.c cVar) {
        int i2;
        if (cVar == l.c.CAMERA_FLASH_OFF) {
            i2 = 0;
        } else if (cVar == l.c.CAMERA_FLASH_ON) {
            i2 = 1;
        } else if (cVar == l.c.CAMERA_FLASH_AUTO) {
            i2 = 3;
        } else if (cVar == l.c.CAMERA_FLASH_TORCH) {
            i2 = 2;
        } else if (cVar != l.c.CAMERA_FLASH_RED_EYE) {
            return -100;
        } else {
            i2 = 4;
        }
        return f.INSTANCE.lambda$switchFlashMode$19$TECameraServer(this.k, i2);
    }

    public final int a(l lVar) {
        this.f78012a = lVar;
        this.f78013b = b(lVar);
        return this.k.b(this.f78013b);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onError(int i2, String str) {
        if (this.f78017f != null) {
            this.f78017f.a(i2, str);
        }
    }

    public final int a(Context context, @NonNull l lVar) {
        this.f78014c = context;
        this.f78012a = lVar;
        this.f78013b = b(lVar);
        byte b2 = y.f78140b;
        ad.f31339c = new ad.a() {
            public final void a(byte b2, String str, String str2) {
                TELogcat.Log(b2, str, str2);
            }
        };
        if ("VESDK".length() > 0) {
            ad.f31337a = "VESDK" + "-";
        }
        ad.f31338b = b2;
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void onCaptureStarted(int i2, int i3) {
        l.b bVar;
        synchronized (this) {
            l lVar = this.f78012a;
            int i4 = this.f78013b.f31294e;
            if (i4 != 0) {
                if (i4 == 1) {
                    bVar = l.b.FACING_FRONT;
                } else if (i4 == 2) {
                    bVar = l.b.FACING_WIDE_ANGLE;
                }
                lVar.j = bVar;
            }
            bVar = l.b.FACING_BACK;
            lVar.j = bVar;
        }
        VEListener.d dVar = this.f78017f;
        if (i3 == 0) {
            c();
            if (dVar != null) {
                dVar.a(2, i2, "Camera type: " + i2);
            }
        } else {
            if (dVar != null) {
                dVar.a(i2);
            }
            e();
        }
    }

    public static void a(Context context, l.f fVar, Bundle bundle) {
        d.a(context, fVar.ordinal(), bundle);
    }

    public void onInfo(int i2, int i3, String str) {
        if (this.f78017f != null) {
            this.f78017f.a(i2, i3, str);
        }
        if (i2 == 0) {
            this.h = false;
        }
    }

    public final int a(int i2, int i3, TECameraSettings.e eVar) {
        return f.INSTANCE.lambda$takePicture$8$TECameraServer(this.k, i2, i3, eVar);
    }

    public final void a(int i2, float f2, boolean z) {
        if (this.f78016e != null) {
            this.f78016e.a(i2, f2, z);
        }
    }

    public final int a(int i2, int i3, float f2, int i4, int i5) {
        return this.k.a(i2, i3, f2, i4, i5);
    }

    public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
        if (this.f78016e != null) {
            this.f78016e.a(i2, z, z2, f2, list);
        }
    }
}
