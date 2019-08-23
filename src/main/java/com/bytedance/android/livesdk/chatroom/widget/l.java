package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.a;
import com.bytedance.android.livesdk.chatroom.interact.y;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.b.a.a.g.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.display.CameraDisplay;
import com.ss.ugc.live.a.i;
import javax.microedition.khronos.egl.EGLContext;

public final class l extends GLSurfaceView implements a.C0077a, y, CameraDisplay.FrameListener, i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13503a;

    /* renamed from: b  reason: collision with root package name */
    a f13504b;

    /* renamed from: c  reason: collision with root package name */
    h f13505c;

    /* renamed from: d  reason: collision with root package name */
    b f13506d;

    public final void d() {
    }

    public final void e() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13503a, false, 7855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13503a, false, 7855, new Class[0], Void.TYPE);
            return;
        }
        onPause();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f13503a, false, 7856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13503a, false, 7856, new Class[0], Void.TYPE);
            return;
        }
        onResume();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f13503a, false, 7858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13503a, false, 7858, new Class[0], Void.TYPE);
            return;
        }
        if (this.f13505c != null) {
            this.f13505c.quitSafely();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f13503a, false, 7857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13503a, false, 7857, new Class[0], Void.TYPE);
            return;
        }
        if (this.f13505c != null) {
            h hVar = this.f13505c;
            if (PatchProxy.isSupport(new Object[0], hVar, h.f17601a, false, 13627, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hVar, h.f17601a, false, 13627, new Class[0], Void.TYPE);
            } else if (hVar.f17603c != null) {
                hVar.f17603c.sendEmptyMessage(234);
            }
        }
    }

    public final void a(b bVar) {
        this.f13506d = bVar;
    }

    public l(Context context) {
        this(context, null);
    }

    public final void a(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f13503a, false, 7859, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f13503a, false, 7859, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        h.a aVar = new h.a();
        aVar.f17609a = TTLiveSDKContext.getHostService().k().a().getAvatarThumb().getUrls().get(0);
        aVar.f17611c = getHeight();
        aVar.f17610b = getWidth();
        this.f13505c = new h(surface, aVar);
        this.f13505c.start();
    }

    public final void setOutputFormat(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13503a, false, 7854, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13503a, false, 7854, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f13504b.a(i);
    }

    private l(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.f13504b = new a(this);
        this.f13504b.f9694c = this;
        this.f13504b.a((i) this);
    }

    public final void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f13503a, false, 7860, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2)}, this, f13503a, false, 7860, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE}, Void.TYPE);
        } else if (this.f13506d != null) {
            this.f13506d.a(eGLContext, null, i, i3, i4, j);
        }
    }

    public final void a(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f13503a, false, 7861, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eGLContext, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), new Long(j2), bundle}, this, f13503a, false, 7861, new Class[]{EGLContext.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Bundle.class}, Void.TYPE);
        } else if (this.f13506d != null) {
            this.f13506d.a(eGLContext, null, i, i3, i4, j);
        }
    }
}
