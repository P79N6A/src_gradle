package com.bytedance.android.live.excitingvideoad.d;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class g extends TextureView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8411a;

    /* renamed from: b  reason: collision with root package name */
    public TextureView.SurfaceTextureListener f8412b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8413c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8414d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8415e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8416f;
    public Surface g;
    public SurfaceTexture h;
    private final String i;
    private Context j;
    private int k;
    private int l;

    public final Surface getSurface() {
        return this.g;
    }

    public final void setReuseSurfaceTexture(boolean z) {
        this.f8413c = z;
    }

    public final void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.f8412b = surfaceTextureListener;
    }

    public g(Context context) {
        this(context, null);
    }

    public final void onWindowVisibilityChanged(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8411a, false, 1693, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8411a, false, 1693, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowVisibilityChanged(i2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f8411a, false, 1694, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f8411a, false, 1694, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z && this.f8413c) {
            if (this.h != null) {
                this.h.release();
                this.h = null;
            }
            if (this.g != null) {
                this.g.release();
                this.g = null;
            }
        }
        this.f8414d = false;
        this.f8415e = false;
        this.g = null;
        this.h = null;
    }

    private g(Context context, AttributeSet attributeSet) {
        super(context, null);
        this.i = "TextureVideoView";
        this.f8413c = true;
        if (PatchProxy.isSupport(new Object[]{context}, this, f8411a, false, 1691, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f8411a, false, 1691, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.j = context;
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            this.l = displayMetrics.heightPixels;
            this.k = displayMetrics.widthPixels;
        }
        if (PatchProxy.isSupport(new Object[0], this, f8411a, false, 1690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8411a, false, 1690, new Class[0], Void.TYPE);
            return;
        }
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8417a;

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f8417a, false, 1698, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f8417a, false, 1698, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (g.this.f8412b != null) {
                    g.this.f8412b.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f8417a, false, 1697, new Class[]{SurfaceTexture.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f8417a, false, 1697, new Class[]{SurfaceTexture.class}, Boolean.TYPE)).booleanValue();
                }
                if (g.this.f8413c && !g.this.f8414d && g.this.g != null) {
                    g.this.g.release();
                    g.this.g = null;
                    g.this.h = null;
                }
                g.this.f8416f = false;
                if (g.this.f8412b == null || !g.this.f8412b.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                }
                if (z) {
                    g.this.a(false);
                }
                return z;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8417a, false, 1696, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8417a, false, 1696, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (g.this.f8412b != null) {
                    int i3 = i;
                    g.this.f8412b.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                if (PatchProxy.isSupport(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8417a, false, 1695, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f8417a, false, 1695, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (g.this.f8413c) {
                    g.this.f8415e = true;
                    if (g.this.g != null && (!g.this.f8414d || !g.this.g.isValid())) {
                        g.this.g.release();
                        g.this.g = null;
                        g.this.h = null;
                    }
                    if (g.this.g == null) {
                        g.this.g = new Surface(surfaceTexture);
                        g.this.h = surfaceTexture2;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                if (g.this.h != null) {
                                    g.this.setSurfaceTexture(g.this.h);
                                }
                            } else if (g.this.h != null) {
                                g.this.g = new Surface(surfaceTexture);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    g.this.f8416f = true;
                    g.this.f8414d = true;
                } else {
                    g.this.g = new Surface(surfaceTexture);
                    g.this.h = surfaceTexture2;
                }
                if (g.this.f8412b != null) {
                    int i3 = i;
                    g.this.f8412b.onSurfaceTextureAvailable(g.this.h, i, i2);
                }
            }
        });
    }

    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8411a, false, 1692, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f8411a, false, 1692, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
    }
}
