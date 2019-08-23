package com.ss.android.ugc.aweme.shortvideo.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.filter.u;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.j.d;

public final class a implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65855a;

    /* renamed from: b  reason: collision with root package name */
    private final d f65856b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaRecordPresenter f65857c;

    /* renamed from: d  reason: collision with root package name */
    private int f65858d;

    /* renamed from: e  reason: collision with root package name */
    private int f65859e;

    /* renamed from: f  reason: collision with root package name */
    private int f65860f;
    private int g;
    private float h = 1.0f;
    private float i = 1.0f;
    private float j = 1.0f;
    private float k = 1.0f;
    private boolean l = true;
    private boolean m = true;
    private boolean n;
    private boolean o;
    private int p;

    public final void a(boolean z) {
    }

    public final void c(int i2) {
    }

    public final int d() {
        return 0;
    }

    public final void d(int i2) {
    }

    public final int g() {
        return 0;
    }

    public final int b() {
        return this.f65859e;
    }

    public final int c() {
        return this.f65860f;
    }

    public final int e() {
        return this.f65858d;
    }

    public final int f() {
        return this.g;
    }

    public final void a() {
        float f2;
        float f3;
        float f4;
        if (PatchProxy.isSupport(new Object[0], this, f65855a, false, 75183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65855a, false, 75183, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.b() && com.ss.android.ugc.aweme.port.in.a.L.a(e.a.MusNeedResetShapeLevel)) {
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserBigEyeLevel, -1);
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserSmoothSkinLevel, -1);
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserShapeLevel, -1);
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserContourLevel, -1);
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.MusNeedResetShapeLevel, false);
        }
        boolean a2 = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        boolean a3 = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG);
        if (a2) {
            this.h = b.b(0, PushConstants.PUSH_TYPE_NOTIFY);
            f2 = b.a(0, PushConstants.PUSH_TYPE_NOTIFY);
        } else {
            f2 = -1.0f;
        }
        if (a3) {
            this.j = b.b(2, PushConstants.PUSH_TYPE_NOTIFY);
            this.i = b.b(1, PushConstants.PUSH_TYPE_NOTIFY);
            f4 = b.a(2, PushConstants.PUSH_TYPE_NOTIFY);
            f3 = b.a(1, PushConstants.PUSH_TYPE_NOTIFY);
        } else {
            f4 = -1.0f;
            f3 = -1.0f;
        }
        this.k = com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ContourMax);
        this.f65860f = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserBigEyeLevel);
        if (this.f65860f == -1) {
            if (f4 == -1.0f) {
                this.f65860f = 60;
            } else if (this.j != 0.0f) {
                this.f65860f = (int) ((f4 / this.j) * 100.0f);
            } else {
                this.f65860f = (int) (f4 * 100.0f);
            }
        }
        this.f65858d = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserSmoothSkinLevel);
        if (this.f65858d == -1) {
            if (f2 == -1.0f) {
                this.f65858d = 60;
            } else if (this.h != 0.0f) {
                this.f65858d = (int) ((f2 / this.h) * 100.0f);
            } else {
                this.f65858d = (int) (f2 * 100.0f);
            }
        }
        this.f65859e = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserShapeLevel);
        if (this.f65859e == -1) {
            if (f3 == -1.0f) {
                this.f65859e = 60;
            } else if (this.i != 0.0f) {
                this.f65859e = (int) ((f3 / this.i) * 100.0f);
            } else {
                this.f65859e = (int) (f3 * 100.0f);
            }
        }
        this.g = com.ss.android.ugc.aweme.port.in.a.L.b(e.a.UserContourLevel);
        if (this.g == -1) {
            this.g = (int) (com.ss.android.ugc.aweme.port.in.a.M.d(a.C0682a.ContourDefault) * 100.0f);
        }
        g(this.g);
        a(this.f65859e);
        e(this.f65858d);
        b(this.f65860f);
    }

    public final void f(int i2) {
        this.p = i2;
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75184, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75184, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.b()) {
            this.f65859e = i2;
            float f2 = ((float) this.f65860f) / 100.0f;
            float f3 = ((float) i2) / 100.0f;
            if (f2 == 0.0f && f3 == 0.0f) {
                this.f65856b.b(0.0f, 0.0f);
            } else {
                this.f65856b.b(f2, f3);
            }
            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeShapeLevel)) {
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserShapeLevel, i2);
            }
            com.ss.android.ugc.aweme.port.in.a.L.a(e.a.ReshapeIndex, i2);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75185, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75185, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.b()) {
            this.f65860f = i2;
            float f2 = ((float) i2) / 100.0f;
            float f3 = ((float) this.f65859e) / 100.0f;
            if (f2 == 0.0f && f3 == 0.0f) {
                this.f65856b.b(0.0f, 0.0f);
            } else {
                this.f65856b.b(f2, f3);
            }
            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeBigEyeLevel)) {
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserBigEyeLevel, i2);
            }
        }
    }

    public final void e(int i2) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75187, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75187, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.b()) {
            this.f65858d = i2;
            if (this.m) {
                float f3 = ((float) i2) / 100.0f;
                if (this.p == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                this.f65856b.a(f3, f2);
                if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeSkinLevel)) {
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserSmoothSkinLevel, i2);
                }
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SmoothSkinIndex, i2);
            }
        }
    }

    public final void g(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75189, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65855a, false, 75189, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.o && this.n) {
            this.g = i2;
            float f2 = (((float) i2) / 100.0f) * this.k;
            this.f65857c.b(u.c());
            this.f65857c.c(f2);
            if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserChangeContourLevel)) {
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.UserContourLevel, i2);
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f65855a, false, 75191, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f65855a, false, 75191, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(true, true);
        b(true, true);
        c(true, true);
    }

    public final void c(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65855a, false, 75190, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f65855a, false, 75190, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.n = z;
        if (z2) {
            if (this.n) {
                g(this.g);
            } else {
                this.f65857c.b(u.c());
                this.f65857c.c(0.0f);
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65855a, false, 75186, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f65855a, false, 75186, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l = z;
        if (z2) {
            if (!this.l || com.ss.android.g.a.b()) {
                this.f65856b.b(0.0f, 0.0f);
            } else {
                a(this.f65859e);
            }
        }
    }

    public final void b(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65855a, false, 75188, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f65855a, false, 75188, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.m != z) {
            this.m = z;
            if (z2) {
                if (!this.m || com.ss.android.g.a.b()) {
                    this.f65856b.a(0.0f, 0.0f);
                } else {
                    e(this.f65858d);
                }
            }
        }
    }

    public a(d dVar, MediaRecordPresenter mediaRecordPresenter, boolean z) {
        this.f65856b = dVar;
        this.f65857c = mediaRecordPresenter;
        this.n = z;
    }
}
