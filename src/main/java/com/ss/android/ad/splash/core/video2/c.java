package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;

public final class c extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f27809a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f27810b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27811c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27812d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27813e;

    /* renamed from: f  reason: collision with root package name */
    public Surface f27814f;
    public SurfaceTexture g;
    private final String h;
    private Context i;
    private int j;
    private int k;

    public final Surface getSurface() {
        return this.f27814f;
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f27809a = surfaceTextureListener;
    }

    public c(Context context) {
        this(context, null);
    }

    private c(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.h = "TextureVideoView";
        this.f27810b = true;
        this.i = context;
        DisplayMetrics displayMetrics = this.i.getResources().getDisplayMetrics();
        this.k = displayMetrics.heightPixels;
        this.j = displayMetrics.widthPixels;
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (c.this.f27809a != null) {
                    c.this.f27809a.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (c.this.f27810b && !c.this.f27811c && c.this.f27814f != null) {
                    c.this.f27814f.release();
                    c.this.f27814f = null;
                    c.this.g = null;
                }
                c.this.f27813e = false;
                if (c.this.f27809a == null || !c.this.f27809a.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    c cVar = c.this;
                    cVar.f27811c = false;
                    cVar.f27812d = false;
                    cVar.f27814f = null;
                    cVar.g = null;
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (c.this.f27809a != null) {
                    c.this.f27809a.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (c.this.f27810b) {
                    c.this.f27812d = true;
                    if (c.this.f27814f != null && (!c.this.f27811c || !c.this.f27814f.isValid())) {
                        c.this.f27814f.release();
                        c.this.f27814f = null;
                        c.this.g = null;
                    }
                    if (c.this.f27814f == null) {
                        c.this.f27814f = new Surface(surfaceTexture);
                        c.this.g = surfaceTexture;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                if (c.this.g != null) {
                                    c.this.setSurfaceTexture(c.this.g);
                                }
                            } else if (c.this.g != null) {
                                c.this.f27814f = new Surface(surfaceTexture);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    c.this.f27813e = true;
                    c.this.f27811c = true;
                } else {
                    c.this.f27814f = new Surface(surfaceTexture);
                    c.this.g = surfaceTexture;
                }
                if (c.this.f27809a != null) {
                    c.this.f27809a.onSurfaceTextureAvailable(c.this.g, i, i2);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
