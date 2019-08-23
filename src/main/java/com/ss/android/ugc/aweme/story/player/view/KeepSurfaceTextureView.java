package com.ss.android.ugc.aweme.story.player.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73268a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f73269b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f73270c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f73271d;

    /* renamed from: e  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f73272e;

    public Surface getSurface() {
        return this.f73270c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73268a, false, 84862, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73268a, false, 84862, new Class[0], Void.TYPE);
            return;
        }
        if (this.f73269b != null) {
            this.f73269b.release();
            this.f73269b = null;
        }
        if (this.f73270c != null) {
            this.f73270c.release();
            this.f73270c = null;
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f73272e = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    public void onWindowVisibilityChanged(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f73268a, false, 84861, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f73268a, false, 84861, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f73268a, false, 84860, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f73268a, false, 84860, new Class[0], Void.TYPE);
            } else if (this.f73269b == null || this.f73270c == null || !this.f73270c.isValid()) {
                a();
            } else if (!this.f73271d) {
                if (this.f73269b != getSurfaceTexture()) {
                    setSurfaceTexture(this.f73269b);
                    this.f73271d = true;
                    if (this.f73272e != null) {
                        this.f73272e.onSurfaceTextureAvailable(this.f73269b, getWidth(), getHeight());
                    }
                } else {
                    a();
                }
            }
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f73268a, false, 84859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73268a, false, 84859, new Class[0], Void.TYPE);
            return;
        }
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73273a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f73273a, false, 84866, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f73273a, false, 84866, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (KeepSurfaceTextureView.this.f73272e != null) {
                    KeepSurfaceTextureView.this.f73272e.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f73273a, false, 84865, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f73273a, false, 84865, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                KeepSurfaceTextureView.this.f73271d = false;
                if (KeepSurfaceTextureView.this.f73272e == null || !KeepSurfaceTextureView.this.f73272e.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                }
                if (z) {
                    KeepSurfaceTextureView.this.a();
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73273a, false, 84864, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73273a, false, 84864, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (KeepSurfaceTextureView.this.f73272e != null) {
                    int i3 = i;
                    KeepSurfaceTextureView.this.f73272e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73273a, false, 84863, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73273a, false, 84863, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                KeepSurfaceTextureView.this.a();
                if (KeepSurfaceTextureView.this.f73269b == null) {
                    KeepSurfaceTextureView.this.f73269b = surfaceTexture2;
                    KeepSurfaceTextureView.this.f73270c = new Surface(KeepSurfaceTextureView.this.f73269b);
                }
                KeepSurfaceTextureView.this.f73271d = true;
                if (KeepSurfaceTextureView.this.f73272e != null) {
                    int i3 = i;
                    KeepSurfaceTextureView.this.f73272e.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f73269b, i, i2);
                }
            }
        });
    }
}
