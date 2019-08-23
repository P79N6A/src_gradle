package com.ss.android.ugc.aweme.im.sdk.videofileplay.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52708a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f52709b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f52710c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f52711d;

    /* renamed from: e  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f52712e;

    public Surface getSurface() {
        return this.f52710c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f52708a, false, 53989, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52708a, false, 53989, new Class[0], Void.TYPE);
            return;
        }
        if (this.f52709b != null) {
            this.f52709b.release();
            this.f52709b = null;
        }
        if (this.f52710c != null) {
            this.f52710c.release();
            this.f52710c = null;
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f52712e = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    public void onWindowVisibilityChanged(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f52708a, false, 53988, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f52708a, false, 53988, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f52708a, false, 53987, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f52708a, false, 53987, new Class[0], Void.TYPE);
            } else if (this.f52709b == null || this.f52710c == null || !this.f52710c.isValid()) {
                a();
            } else if (!this.f52711d) {
                if (this.f52709b != getSurfaceTexture()) {
                    setSurfaceTexture(this.f52709b);
                    this.f52711d = true;
                    if (this.f52712e != null) {
                        this.f52712e.onSurfaceTextureAvailable(this.f52709b, getWidth(), getHeight());
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
        if (PatchProxy.isSupport(new Object[0], this, f52708a, false, 53986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52708a, false, 53986, new Class[0], Void.TYPE);
            return;
        }
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52713a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f52713a, false, 53993, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f52713a, false, 53993, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (KeepSurfaceTextureView.this.f52712e != null) {
                    KeepSurfaceTextureView.this.f52712e.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f52713a, false, 53992, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f52713a, false, 53992, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                KeepSurfaceTextureView.this.f52711d = false;
                if (KeepSurfaceTextureView.this.f52712e == null || !KeepSurfaceTextureView.this.f52712e.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                }
                if (z) {
                    KeepSurfaceTextureView.this.a();
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52713a, false, 53991, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52713a, false, 53991, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (KeepSurfaceTextureView.this.f52712e != null) {
                    int i3 = i;
                    KeepSurfaceTextureView.this.f52712e.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52713a, false, 53990, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f52713a, false, 53990, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                KeepSurfaceTextureView.this.a();
                if (KeepSurfaceTextureView.this.f52709b == null) {
                    KeepSurfaceTextureView.this.f52709b = surfaceTexture2;
                    KeepSurfaceTextureView.this.f52710c = new Surface(KeepSurfaceTextureView.this.f52709b);
                }
                KeepSurfaceTextureView.this.f52711d = true;
                if (KeepSurfaceTextureView.this.f52712e != null) {
                    int i3 = i;
                    KeepSurfaceTextureView.this.f52712e.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f52709b, i, i2);
                }
            }
        });
    }
}
