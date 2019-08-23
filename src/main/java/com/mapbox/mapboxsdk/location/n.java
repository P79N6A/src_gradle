package com.mapbox.mapboxsdk.location;

import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.android.gestures.c;
import com.mapbox.mapboxsdk.camera.a;
import com.mapbox.mapboxsdk.camera.b;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.r;
import com.mapbox.mapboxsdk.maps.o;

public final class n implements r.a {

    /* renamed from: a  reason: collision with root package name */
    public int f26508a;

    /* renamed from: b  reason: collision with root package name */
    final o f26509b;

    /* renamed from: c  reason: collision with root package name */
    final w f26510c;

    /* renamed from: d  reason: collision with root package name */
    public p f26511d;

    /* renamed from: e  reason: collision with root package name */
    final AndroidGesturesManager f26512e;

    /* renamed from: f  reason: collision with root package name */
    final AndroidGesturesManager f26513f;
    private boolean g;
    private final c h;
    private final v i;

    public final void a() {
        if (this.f26511d.B) {
            if (c()) {
                this.g = true;
                this.h.i = this.f26511d.C;
                return;
            }
            this.h.i = 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.f26508a == 32 || this.f26508a == 16) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.f26508a == 24 || this.f26508a == 32 || this.f26508a == 34 || this.f26508a == 36) {
            return true;
        }
        return false;
    }

    public final void b(float f2) {
        if (this.f26508a == 32 || this.f26508a == 16) {
            c(f2);
        }
    }

    private void c(float f2) {
        o oVar = this.f26509b;
        b.C0306b bVar = new b.C0306b((double) f2, null, -1.0d, -1.0d);
        oVar.a((a) bVar);
        this.i.a();
    }

    public final void a(float f2) {
        boolean z;
        if (this.f26508a != 36 || this.f26509b.g().bearing == 0.0d) {
            z = false;
        } else {
            z = true;
        }
        if (this.f26508a == 34 || this.f26508a == 22 || z) {
            c(f2);
        }
    }

    public final void a(LatLng latLng) {
        if (this.f26508a == 24 || this.f26508a == 32 || this.f26508a == 34 || this.f26508a == 36) {
            o oVar = this.f26509b;
            b.C0306b bVar = new b.C0306b(-1.0d, latLng, -1.0d, -1.0d);
            oVar.a((a) bVar);
            this.i.a();
            if (this.g) {
                this.f26509b.f26696b.a(this.f26509b.f26697c.a(latLng));
                this.g = false;
            }
        }
    }
}
