package com.bytedance.android.live.excitingvideoad.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.bytedance.android.live.excitingvideoad.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends RelativeLayout implements TextureView.SurfaceTextureListener, c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8394a;

    /* renamed from: b  reason: collision with root package name */
    public g f8395b;

    /* renamed from: c  reason: collision with root package name */
    private d f8396c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f8397d;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setSurfaceViewVisibility(int i) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8394a, false, 1652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8394a, false, 1652, new Class[0], Void.TYPE);
            return;
        }
        this.f8397d.setVisibility(0);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8394a, false, 1653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8394a, false, 1653, new Class[0], Void.TYPE);
            return;
        }
        this.f8397d.setVisibility(8);
    }

    public final Context getApplicationContext() {
        if (!PatchProxy.isSupport(new Object[0], this, f8394a, false, 1659, new Class[0], Context.class)) {
            return getContext().getApplicationContext();
        }
        return (Context) PatchProxy.accessDispatch(new Object[0], this, f8394a, false, 1659, new Class[0], Context.class);
    }

    public final Surface getSurface() {
        if (PatchProxy.isSupport(new Object[0], this, f8394a, false, 1657, new Class[0], Surface.class)) {
            return (Surface) PatchProxy.accessDispatch(new Object[0], this, f8394a, false, 1657, new Class[0], Surface.class);
        } else if (this.f8395b != null) {
            return this.f8395b.getSurface();
        } else {
            return null;
        }
    }

    public final void setVideoViewCallback(d dVar) {
        this.f8396c = dVar;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f8394a, false, 1658, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f8394a, false, 1658, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f8395b != null) {
            this.f8395b.a(false);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f8394a, false, 1655, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f8394a, false, 1655, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
        }
        this.f8395b.setKeepScreenOn(false);
        g gVar = this.f8395b;
        if (!gVar.f8413c || !gVar.f8415e) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public a(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f8394a, false, 1651, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8394a, false, 1651, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f8395b = new g(context);
        this.f8395b.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.f8395b, layoutParams);
        this.f8397d = new ProgressBar(context);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8397d.setIndeterminateDrawable(com.ss.android.ugc.bytex.a.a.a.a(context, 2130838652));
        } else {
            this.f8397d.setIndeterminateDrawable(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130838652));
        }
        int a2 = (int) c.a(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams2.addRule(13, -1);
        this.f8397d.setVisibility(8);
        addView(this.f8397d, layoutParams2);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8394a, false, 1654, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8394a, false, 1654, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f8395b.setKeepScreenOn(true);
        if (this.f8396c != null) {
            int i3 = i;
            this.f8396c.a(surfaceTexture, i, i2);
        }
    }
}
