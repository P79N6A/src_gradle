package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class BDASplashVideoView extends RelativeLayout implements TextureView.SurfaceTextureListener, f {

    /* renamed from: a  reason: collision with root package name */
    private c f27794a;

    /* renamed from: b  reason: collision with root package name */
    private g f27795b;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setSurfaceViewVisibility(int i) {
    }

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public Surface getSurface() {
        if (this.f27794a != null) {
            return this.f27794a.getSurface();
        }
        return null;
    }

    public void setVideoViewCallback(g gVar) {
        this.f27795b = gVar;
    }

    public BDASplashVideoView(Context context) {
        super(context);
        a(context);
    }

    public void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            this.f27794a.setLayoutParams(layoutParams);
        }
    }

    public void setTextureViewOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f27794a.setOnTouchListener(onTouchListener);
    }

    private void a(Context context) {
        this.f27794a = new c(context);
        this.f27794a.setSurfaceTextureListener(this);
        addView(this.f27794a, new RelativeLayout.LayoutParams(-1, -1));
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z;
        this.f27794a.setKeepScreenOn(false);
        c cVar = this.f27794a;
        if (!cVar.f27810b || !cVar.f27812d) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f27794a.setKeepScreenOn(true);
        if (this.f27795b != null) {
            this.f27795b.a(surfaceTexture);
        }
    }

    public BDASplashVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
