package com.ss.android.ugc.aweme.shortvideo.s;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.IESCameraInterface;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f69136e;

    /* renamed from: f  reason: collision with root package name */
    public dmt.av.video.b.a.c f69137f;
    private final float g = 14.874f;

    public final boolean b() {
        return true;
    }

    public final boolean b(boolean z) {
        return z;
    }

    public final boolean c() {
        return true;
    }

    public c(dmt.av.video.b.a.c cVar) {
        this.f69137f = cVar;
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69136e, false, 81259, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69136e, false, 81259, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69129c = z;
        this.f69130d = new com.ss.android.medialib.camera.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69138a;

            public final void a(int i, int i2, String str) {
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69138a, false, 81263, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69138a, false, 81263, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (c.this.f69137f.f() == 1) {
                    c.this.f69137f.a((IESCameraInterface.a) new d(this, z));
                } else {
                    c.this.f69137f.a((IESCameraInterface.a) null);
                }
            }
        };
    }

    public final float a(float f2, int i) {
        float f3;
        float f4;
        float f5;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, f69136e, false, 81260, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i)}, this, f69136e, false, 81260, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        if (i == 1) {
            if (this.f69129c) {
                f5 = 0.0f;
            } else {
                f5 = f2;
            }
            f3 = f5;
            f4 = f2;
        } else {
            f4 = f2;
            f3 = f4;
        }
        return Math.min(f3, f4);
    }

    public final float b(float f2, int i) {
        float f3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(0.0f), Integer.valueOf(i)}, this, f69136e, false, 81261, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(0.0f), Integer.valueOf(i)}, this, f69136e, false, 81261, new Class[]{Float.TYPE, Integer.TYPE}, Float.TYPE)).floatValue();
        }
        if (i == 1) {
            if (!this.f69129c) {
                f3 = 14.874f;
                return Math.max(f3, 0.0f);
            }
        }
        f3 = 0.0f;
        return Math.max(f3, 0.0f);
    }

    public final void a(Context context, com.ss.android.medialib.camera.c cVar) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{context, null}, this, f69136e, false, 81262, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, null}, this, f69136e, false, 81262, new Class[]{Context.class, com.ss.android.medialib.camera.c.class}, Void.TYPE);
            return;
        }
        this.f69129c = !this.f69129c;
        dmt.av.video.b.a.c cVar2 = this.f69137f;
        if (this.f69129c) {
            f2 = 0.0f;
        } else {
            f2 = 14.874f;
        }
        cVar2.a(f2);
        f.a(this.f69129c);
    }
}
