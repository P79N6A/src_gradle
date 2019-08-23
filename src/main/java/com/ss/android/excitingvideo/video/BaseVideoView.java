package com.ss.android.excitingvideo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ss.android.excitingvideo.utils.UIUtils;
import com.ss.android.ugc.bytex.a.a.a;

public class BaseVideoView extends RelativeLayout implements TextureView.SurfaceTextureListener, IVideoView {
    private ProgressBar mProgressBar;
    private VideoTextureView mVideoTextureView;
    private IVideoViewCallback mVideoViewCallback;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setSurfaceViewVisibility(int i) {
    }

    public void dismissLoading() {
        this.mProgressBar.setVisibility(8);
    }

    public void showLoading() {
        this.mProgressBar.setVisibility(0);
    }

    public Context getApplicationContext() {
        return getContext().getApplicationContext();
    }

    public Surface getSurface() {
        if (this.mVideoTextureView != null) {
            return this.mVideoTextureView.getSurface();
        }
        return null;
    }

    public void setVideoViewCallback(IVideoViewCallback iVideoViewCallback) {
        this.mVideoViewCallback = iVideoViewCallback;
    }

    public BaseVideoView(Context context) {
        super(context);
        initView(context);
    }

    public void releaseSurface(boolean z) {
        if (this.mVideoTextureView != null) {
            this.mVideoTextureView.releaseSurface(z);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.mVideoTextureView.setKeepScreenOn(false);
        if (this.mVideoViewCallback != null) {
            this.mVideoViewCallback.onSurfaceTextureDestroyed(surfaceTexture);
        }
        if (!this.mVideoTextureView.needKeepSurface()) {
            return true;
        }
        return false;
    }

    private void initView(Context context) {
        this.mVideoTextureView = new VideoTextureView(context);
        this.mVideoTextureView.setSurfaceTextureListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        addView(this.mVideoTextureView, layoutParams);
        this.mProgressBar = new ProgressBar(context);
        if (Build.VERSION.SDK_INT >= 21) {
            this.mProgressBar.setIndeterminateDrawable(a.a(context, 2130838652));
        } else {
            this.mProgressBar.setIndeterminateDrawable(a.a(context.getResources(), 2130838652));
        }
        int dip2Px = (int) UIUtils.dip2Px(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dip2Px, dip2Px);
        layoutParams2.addRule(13, -1);
        this.mProgressBar.setVisibility(8);
        addView(this.mProgressBar, layoutParams2);
    }

    public BaseVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public void setSize(int i, int i2) {
        if (i > 0 && i2 > 0) {
            double screenWidth = (double) UIUtils.getScreenWidth(getContext());
            Double.isNaN(screenWidth);
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (double) i2;
            Double.isNaN(d3);
            int i3 = (int) (((screenWidth * 1.0d) / d2) * d3);
            ViewGroup.LayoutParams layoutParams = this.mVideoTextureView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = i3;
                this.mVideoTextureView.setLayoutParams(layoutParams);
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mVideoTextureView.setKeepScreenOn(true);
        if (this.mVideoViewCallback != null) {
            this.mVideoViewCallback.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    public BaseVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }
}
