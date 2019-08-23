package com.ss.android.ugc.playerkit.videoview;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.ugc.playerkit.videoview.VideoSurfaceHolder;
import java.util.LinkedHashSet;
import java.util.Set;

public final class f implements VideoSurfaceHolder {

    /* renamed from: a  reason: collision with root package name */
    public Set<i> f77780a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f77781b;

    /* renamed from: c  reason: collision with root package name */
    private final KeepSurfaceTextureView f77782c;

    public final void a(boolean z) {
    }

    public final void e() {
        this.f77781b = true;
    }

    public final void f() {
        this.f77781b = false;
    }

    @VideoSurfaceHolder.ViewType
    public final int g() {
        return 0;
    }

    public final boolean h() {
        return false;
    }

    public final View a() {
        return this.f77782c;
    }

    public final Surface b() {
        return this.f77782c.getSurface();
    }

    public final boolean c() {
        return this.f77782c.f77738c;
    }

    public final void d() {
        this.f77782c.a();
    }

    private void i() {
        this.f77782c.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                for (i a2 : f.this.f77780a) {
                    a2.a();
                }
                if (!f.this.f77781b) {
                    return true;
                }
                return false;
            }

            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                f.this.f77781b = false;
                for (i a2 : f.this.f77780a) {
                    a2.a(i, i2);
                }
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                for (i b2 : f.this.f77780a) {
                    b2.b(i, i2);
                }
            }
        });
    }

    public final void a(i iVar) {
        this.f77780a.add(iVar);
    }

    public final void b(i iVar) {
        this.f77780a.remove(iVar);
    }

    public f(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f77782c = keepSurfaceTextureView;
        i();
    }

    public f(ViewGroup viewGroup) {
        this.f77782c = new KeepSurfaceTextureView(viewGroup.getContext());
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(this.f77782c, 0, new FrameLayout.LayoutParams(-1, -1, 17));
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            viewGroup.addView(this.f77782c, 0, layoutParams);
        } else {
            viewGroup.addView(this.f77782c, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        i();
    }
}
