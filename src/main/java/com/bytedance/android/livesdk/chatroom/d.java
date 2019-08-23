package com.bytedance.android.livesdk.chatroom;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.livesdk.chatroom.a;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.utils.t;
import com.bytedance.b.a.a.f.a;
import com.bytedance.b.a.a.g.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.display.CameraDisplay;
import com.ss.ugc.live.a.i;
import javax.microedition.khronos.egl.EGLContext;

public final class d extends GLSurfaceView implements a.C0077a, y, CameraDisplay.FrameListener, i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9877a;

    /* renamed from: b  reason: collision with root package name */
    a f9878b;

    /* renamed from: c  reason: collision with root package name */
    t f9879c;

    /* renamed from: d  reason: collision with root package name */
    b f9880d;

    /* renamed from: e  reason: collision with root package name */
    private EGLContext f9881e;

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f9877a, false, 3898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9877a, false, 3898, new Class[0], Void.TYPE);
            return;
        }
        onPause();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9877a, false, 3899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9877a, false, 3899, new Class[0], Void.TYPE);
            return;
        }
        onResume();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f9877a, false, 3900, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9877a, false, 3900, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9879c != null) {
            this.f9879c.quitSafely();
        }
    }

    public final void a(b bVar) {
        this.f9880d = bVar;
    }

    public d(Context context) {
        this(context, null);
    }

    public final void a(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f9877a, false, 3901, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f9877a, false, 3901, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f9879c = new t(surface, a.f.f19200b.f19204f, a.f.f19200b.g);
        this.f9879c.start();
    }

    public final void setOutputFormat(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f9877a, false, 3897, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f9877a, false, 3897, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f9878b.a(i);
    }

    private d(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f9878b = new a(this);
        this.f9878b.f9694c = this;
        this.f9878b.a((i) this);
    }

    private void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        EGLContext eGLContext2 = eGLContext;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f9877a, false, 3904, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f9877a, false, 3904, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.f9880d != null) {
            if (this.f9881e != null) {
                this.f9881e.equals(eGLContext2);
            }
            this.f9881e = eGLContext2;
            this.f9880d.a(eGLContext, null, i, i3, i4, j);
        }
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f9877a, false, 3902, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f9877a, false, 3902, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(eGLContext, i, i2, i3, i4, j);
    }

    public final void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f9877a, false, 3903, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f9877a, false, 3903, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE);
            return;
        }
        a(eGLContext, i, i2, i3, i4, j);
    }
}
