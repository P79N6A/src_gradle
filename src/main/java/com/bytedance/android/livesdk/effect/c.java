package com.bytedance.android.livesdk.effect;

import com.bytedance.android.livesdk.s;
import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;

public final class c extends a {
    public static ChangeQuickRedirect h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private a n;
    private a o;

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 8137, new Class[0], Void.TYPE);
            return;
        }
        j.q().o().a("beauty", this.n);
        a(this.k, this.f13711f);
        a(this.j, this.f13707b);
        a(this.j, this.f13710e);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 8138, new Class[0], Void.TYPE);
            return;
        }
        j.q().o().a("beauty", this.o);
        a(this.l, this.f13708c);
        a(this.m, this.f13709d);
    }

    public c() {
        if (com.bytedance.android.live.uikit.a.a.k()) {
            this.k = "";
            this.j = "smooth/frag/smoothIntensity";
            this.i = "smooth/frag/whitenIntensity";
        } else {
            this.k = "epm/frag/sharpen";
            this.j = "epm/frag/blurAlpha";
            this.i = "epm/frag/whiten";
        }
        if (com.bytedance.android.live.uikit.a.a.a()) {
            this.l = "DISTORTION_V3_ZOOM_EYE";
            this.m = "DISTORTION_V3_ZOOM_FACE";
        } else {
            this.l = "FaceDistortionEyeIntensity";
            this.m = "FaceDistortionCheekIntensity";
        }
        if (PatchProxy.isSupport(new Object[0], this, h, false, 8130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 8130, new Class[0], Void.TYPE);
        } else {
            this.n = new a();
            this.n.f17252d = 1111;
            this.n.i.addAll(Arrays.asList(new String[]{this.k, this.j, this.i}));
            this.n.r = s.INST.getBeautyComposerFilePath();
            this.o = new a();
            this.o.f17252d = 1112;
            this.o.i.addAll(Arrays.asList(new String[]{this.m, this.l}));
            this.o.r = s.INST.getReshapeComposerFilePath();
        }
        if (PatchProxy.isSupport(new Object[0], this, a.f13706a, false, 8106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, a.f13706a, false, 8106, new Class[0], Void.TYPE);
            return;
        }
        d(((Float) b.F.a()).floatValue());
        a(((Float) b.G.a()).floatValue());
        c(((Float) b.I.a()).floatValue());
        b(((Float) b.H.a()).floatValue());
    }

    public final void e(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, h, false, 8133, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, h, false, 8133, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!j.q().o().a("beauty").contains(this.n)) {
            b();
        } else {
            a(this.j, f2);
        }
    }

    public final void f(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, h, false, 8135, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, h, false, 8135, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!j.q().o().a("beauty").contains(this.o)) {
            c();
        } else {
            a(this.l, f2);
        }
    }

    public final void g(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, h, false, 8136, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, h, false, 8136, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!j.q().o().a("beauty").contains(this.o)) {
            c();
        } else {
            a(this.m, f2);
        }
    }

    public final void h(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, h, false, 8134, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, h, false, 8134, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!j.q().o().a("beauty").contains(this.n)) {
            b();
        } else {
            a(this.k, f2);
        }
    }

    public final void i(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, h, false, 8132, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, h, false, 8132, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (!j.q().o().a("beauty").contains(this.n)) {
            b();
        } else {
            a(this.i, f2);
        }
    }

    private void a(String str, float f2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(f2)}, this, h, false, 8131, new Class[]{String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(f2)}, this, h, false, 8131, new Class[]{String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        j.q().o().a(str2, f2);
    }
}
