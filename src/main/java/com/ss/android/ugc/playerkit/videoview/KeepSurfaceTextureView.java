package com.ss.android.ugc.playerkit.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import com.ss.android.ugc.playerkit.c.a;

public class KeepSurfaceTextureView extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public SurfaceTexture f77736a;

    /* renamed from: b  reason: collision with root package name */
    public Surface f77737b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77738c;

    /* renamed from: d  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f77739d;

    public Surface getSurface() {
        return this.f77737b;
    }

    public final void b() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (c()) {
            b();
        }
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT > 19 || !a.r().n()) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (this.f77736a == null || this.f77737b == null || !this.f77737b.isValid()) {
            a(!c());
        } else if (!this.f77738c) {
            if (this.f77736a != getSurfaceTexture()) {
                setSurfaceTexture(this.f77736a);
                this.f77738c = true;
                if (this.f77739d != null) {
                    this.f77739d.onSurfaceTextureAvailable(this.f77736a, getWidth(), getHeight());
                }
            } else {
                a(!c());
            }
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f77739d = surfaceTextureListener;
    }

    public KeepSurfaceTextureView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            a();
        }
    }

    private void a(boolean z) {
        if (this.f77736a != null && z) {
            this.f77736a.release();
            this.f77736a = null;
        }
        if (this.f77737b != null) {
            this.f77737b.release();
            this.f77737b = null;
        }
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeepSurfaceTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (KeepSurfaceTextureView.this.f77739d != null) {
                    KeepSurfaceTextureView.this.f77739d.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                boolean z2 = false;
                KeepSurfaceTextureView.this.f77738c = false;
                if (KeepSurfaceTextureView.this.f77739d == null || !KeepSurfaceTextureView.this.f77739d.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && !KeepSurfaceTextureView.c()) {
                    z2 = true;
                }
                if (z2) {
                    KeepSurfaceTextureView.this.b();
                }
                return z2;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (KeepSurfaceTextureView.this.f77739d != null) {
                    KeepSurfaceTextureView.this.f77739d.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                KeepSurfaceTextureView.this.b();
                if (KeepSurfaceTextureView.this.f77736a == null) {
                    KeepSurfaceTextureView.this.f77736a = surfaceTexture;
                    KeepSurfaceTextureView.this.f77737b = new Surface(KeepSurfaceTextureView.this.f77736a);
                }
                KeepSurfaceTextureView.this.f77738c = true;
                if (KeepSurfaceTextureView.this.f77739d != null) {
                    KeepSurfaceTextureView.this.f77739d.onSurfaceTextureAvailable(KeepSurfaceTextureView.this.f77736a, i, i2);
                }
            }
        });
    }
}
