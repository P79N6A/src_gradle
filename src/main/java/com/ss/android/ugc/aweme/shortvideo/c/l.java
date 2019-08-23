package com.ss.android.ugc.aweme.shortvideo.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.effectplatform.UlikeBeautyPlatform;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.internal.m;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.j.d;

public final class l implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65924a;

    /* renamed from: b  reason: collision with root package name */
    private final d f65925b;

    /* renamed from: c  reason: collision with root package name */
    private int f65926c;

    /* renamed from: d  reason: collision with root package name */
    private int f65927d;

    /* renamed from: e  reason: collision with root package name */
    private int f65928e;

    /* renamed from: f  reason: collision with root package name */
    private int f65929f;
    private int g;
    private boolean h;
    private boolean i = true;
    private boolean j = true;
    private boolean k;
    private boolean l;

    public final void c(boolean z, boolean z2) {
    }

    public final int f() {
        return 0;
    }

    public final void f(int i2) {
    }

    public final void g(int i2) {
    }

    public final int b() {
        return this.f65927d;
    }

    public final int c() {
        return this.f65928e;
    }

    public final int d() {
        return this.g;
    }

    public final int e() {
        return this.f65926c;
    }

    public final int g() {
        return this.f65929f;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f65924a, false, 75241, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65924a, false, 75241, new Class[0], Void.TYPE);
            return;
        }
        m mVar = new m();
        if (PatchProxy.isSupport(new Object[0], mVar, m.f65930a, false, 75253, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], mVar, m.f65930a, false, 75253, new Class[0], Void.TYPE);
        } else {
            if (a.L.a(e.a.UlikeBeautyDownloadEnable)) {
                com.ss.android.ugc.aweme.common.g.a.a(a.f61119b, m.class);
                boolean a2 = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_UPLOAD_LOG, "3");
                boolean a3 = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                boolean a4 = UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG);
                float a5 = b.a(0, PushConstants.PUSH_TYPE_NOTIFY);
                float b2 = b.b(0, PushConstants.PUSH_TYPE_NOTIFY);
                if (!(!a3 || a5 == -1.0f || b2 == -1.0f)) {
                    m.f65932c[0] = a5;
                    m.f65933e[0] = b2;
                }
                float a6 = b.a(1, PushConstants.PUSH_TYPE_NOTIFY);
                float b3 = b.b(1, PushConstants.PUSH_TYPE_NOTIFY);
                if (!(!a4 || a6 == -1.0f || b3 == -1.0f)) {
                    m.f65932c[1] = a6;
                    m.f65933e[1] = b3;
                }
                float a7 = b.a(2, PushConstants.PUSH_TYPE_NOTIFY);
                float b4 = b.b(2, PushConstants.PUSH_TYPE_NOTIFY);
                if (!(!a4 || a7 == -1.0f || b4 == -1.0f)) {
                    m.f65932c[2] = a7;
                    m.f65933e[2] = b4;
                }
                float a8 = b.a(3, PushConstants.PUSH_TYPE_NOTIFY);
                float b5 = b.b(3, PushConstants.PUSH_TYPE_NOTIFY);
                if (!(!a2 || a8 == -1.0f || b5 == -1.0f)) {
                    m.f65932c[3] = a8;
                    m.f65933e[3] = b5;
                }
                float a9 = b.a(4, PushConstants.PUSH_TYPE_NOTIFY);
                float b6 = b.b(4, PushConstants.PUSH_TYPE_NOTIFY);
                if (!(!a2 || a9 == -1.0f || b6 == -1.0f)) {
                    m.f65932c[4] = a9;
                    m.f65933e[4] = b6;
                }
            }
            if (a.L.a(e.a.LoadOldUserLevel)) {
                mVar.f65934d[0] = a.L.b(e.a.UserUlikeSmoothSkinLevel);
                mVar.f65934d[1] = a.L.b(e.a.UserUlikeShapeLevel);
                mVar.f65934d[2] = a.L.b(e.a.UserUlikeBigEyeLevel);
                mVar.f65934d[3] = a.L.b(e.a.UserUlikeLipLevel);
                mVar.f65934d[4] = a.L.b(e.a.UserUlikeBlushLevel);
            } else {
                mVar.f65934d[0] = a.L.b(e.a.UserSmoothSkinLevel);
                mVar.f65934d[1] = a.L.b(e.a.UserShapeLevel);
                mVar.f65934d[2] = a.L.b(e.a.UserBigEyeLevel);
                mVar.f65934d[3] = a.L.b(e.a.UserLipLevel);
                mVar.f65934d[4] = a.L.b(e.a.UserBlushLevel);
            }
            a.L.a(e.a.LoadOldUserLevel, false);
            for (int i2 = 0; i2 < 5; i2++) {
                if (mVar.f65934d[i2] == -1 && m.f65933e[i2] != 0.0f) {
                    mVar.f65934d[i2] = (int) ((m.f65932c[i2] / m.f65933e[i2]) * 100.0f);
                }
            }
        }
        e(mVar.f65934d[0]);
        a(mVar.f65934d[1]);
        b(mVar.f65934d[2]);
        if (this.h) {
            c(mVar.f65934d[3]);
            d(mVar.f65934d[4]);
        }
        if (a.L.a(e.a.EnableBeautySharpen)) {
            m mVar2 = (m) com.ss.android.ugc.aweme.common.g.a.a(a.f61119b, m.class);
            if (!a.L.a(e.a.UlikeBeautyDownloadEnable) || mVar2.a(-1.0f) == -1.0f || !UlikeBeautyPlatform.a(PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                a(a.L.d(e.a.UlikeSharpenDefaultValue));
            } else {
                a(mVar2.a(-1.0f));
            }
        }
    }

    private void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f65924a, false, 75249, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f65924a, false, 75249, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.f65925b.a(f2);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75244, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75244, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65928e = i2;
        float f2 = ((float) i2) / 100.0f;
        float f3 = ((float) this.f65927d) / 100.0f;
        if (f2 == 0.0f && f3 == 0.0f) {
            this.f65925b.b(0.0f, 0.0f);
        } else {
            this.f65925b.b(f2, f3);
        }
        if (a.L.a(e.a.UserChangeBigEyeLevel)) {
            a.L.a(e.a.UserBigEyeLevel, i2);
        }
    }

    public final void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75245, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75245, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65929f = i2;
        if (a.L.a(e.a.UserChangeLipLevel)) {
            a.L.a(e.a.UserLipLevel, i2);
        }
        if (this.i && !this.k) {
            d dVar = this.f65925b;
            dVar.c(((float) i2) / 100.0f, ((float) this.g) / 100.0f);
        }
    }

    public final void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75246, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75246, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        if (a.L.a(e.a.UserChangeBlushLevel)) {
            a.L.a(e.a.UserBlushLevel, i2);
        }
        if (this.i && !this.k) {
            float f2 = ((float) this.f65929f) / 100.0f;
            this.f65925b.c(f2, ((float) i2) / 100.0f);
        }
    }

    public final void e(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75248, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75248, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65926c = i2;
        if (this.j) {
            this.f65925b.a(((float) i2) / 100.0f, 0.0f);
            if (a.L.a(e.a.UserChangeSkinLevel)) {
                a.L.a(e.a.UserSmoothSkinLevel, i2);
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75243, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65924a, false, 75243, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65927d = i2;
        float f2 = ((float) this.f65928e) / 100.0f;
        float f3 = ((float) i2) / 100.0f;
        if (f2 == 0.0f && f3 == 0.0f) {
            this.f65925b.b(0.0f, 0.0f);
        } else {
            this.f65925b.b(f2, f3);
        }
        if (a.L.a(e.a.UserChangeShapeLevel)) {
            a.L.a(e.a.UserShapeLevel, i2);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f65924a, false, 75252, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f65924a, false, 75252, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(true, true);
        b(true, true);
        c(true, true);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65924a, false, 75242, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65924a, false, 75242, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = z;
        if (z) {
            this.f65925b.c(0.0f, 0.0f);
            return;
        }
        if (this.i) {
            this.f65925b.c(((float) this.f65929f) / 100.0f, ((float) this.g) / 100.0f);
        }
    }

    public l(d dVar, boolean z) {
        this.f65925b = dVar;
        this.h = z;
    }

    public final void b(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65924a, false, 75250, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f65924a, false, 75250, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (this.j != z) {
            this.j = z;
            if (z2) {
                if (!this.j || com.ss.android.g.a.b()) {
                    this.f65925b.a(0.0f, 0.0f);
                } else {
                    e(this.f65926c);
                }
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f65924a, false, 75247, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f65924a, false, 75247, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.l = z;
        if (z2) {
            if (!this.l || com.ss.android.g.a.b()) {
                this.f65925b.b(0.0f, 0.0f);
            } else {
                a(this.f65927d);
            }
        }
    }
}
