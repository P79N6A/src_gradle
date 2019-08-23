package com.ss.android.excitingvideo.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Surface;
import android.view.TextureView;

public class VideoTextureView extends TextureView {
    private final String TAG;
    public Surface mCachedSurface;
    private Context mContext;
    private boolean mIsReuseSurfaceTexture;
    public boolean mNeedKeepSurface;
    private int mScreenHeight;
    private int mScreenWidth;
    public SurfaceTexture mSurfaceTexture;
    public TextureView.SurfaceTextureListener mSurfaceTextureListener;
    public boolean mTextureAvailable;
    public boolean mTextureValid;

    public Surface getSurface() {
        return this.mCachedSurface;
    }

    public boolean isReuseSurfaceTexture() {
        return this.mIsReuseSurfaceTexture;
    }

    private void initListener() {
        super.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (VideoTextureView.this.mSurfaceTextureListener != null) {
                    VideoTextureView.this.mSurfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }

            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                boolean z;
                if (VideoTextureView.this.isReuseSurfaceTexture() && !VideoTextureView.this.mTextureValid && VideoTextureView.this.mCachedSurface != null) {
                    VideoTextureView.this.mCachedSurface.release();
                    VideoTextureView.this.mCachedSurface = null;
                    VideoTextureView.this.mSurfaceTexture = null;
                }
                VideoTextureView.this.mTextureAvailable = false;
                if (VideoTextureView.this.mSurfaceTextureListener == null || !VideoTextureView.this.mSurfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    VideoTextureView.this.releaseSurface(false);
                }
                return z;
            }

            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                if (VideoTextureView.this.mSurfaceTextureListener != null) {
                    VideoTextureView.this.mSurfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            }

            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (VideoTextureView.this.isReuseSurfaceTexture()) {
                    VideoTextureView.this.mNeedKeepSurface = true;
                    if (VideoTextureView.this.mCachedSurface != null && (!VideoTextureView.this.mTextureValid || !VideoTextureView.this.mCachedSurface.isValid())) {
                        VideoTextureView.this.mCachedSurface.release();
                        VideoTextureView.this.mCachedSurface = null;
                        VideoTextureView.this.mSurfaceTexture = null;
                    }
                    if (VideoTextureView.this.mCachedSurface == null) {
                        VideoTextureView.this.mCachedSurface = new Surface(surfaceTexture);
                        VideoTextureView.this.mSurfaceTexture = surfaceTexture;
                    } else {
                        try {
                            if (Build.VERSION.SDK_INT >= 16) {
                                if (VideoTextureView.this.mSurfaceTexture != null) {
                                    VideoTextureView.this.setSurfaceTexture(VideoTextureView.this.mSurfaceTexture);
                                }
                            } else if (VideoTextureView.this.mSurfaceTexture != null) {
                                VideoTextureView.this.mCachedSurface = new Surface(surfaceTexture);
                            }
                        } catch (Exception unused) {
                        }
                    }
                    VideoTextureView.this.mTextureAvailable = true;
                    VideoTextureView.this.mTextureValid = true;
                } else {
                    VideoTextureView.this.mCachedSurface = new Surface(surfaceTexture);
                    VideoTextureView.this.mSurfaceTexture = surfaceTexture;
                }
                if (VideoTextureView.this.mSurfaceTextureListener != null) {
                    VideoTextureView.this.mSurfaceTextureListener.onSurfaceTextureAvailable(VideoTextureView.this.mSurfaceTexture, i, i2);
                }
            }
        });
    }

    public boolean needKeepSurface() {
        if (!isReuseSurfaceTexture() || !this.mNeedKeepSurface) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setReuseSurfaceTexture(boolean z) {
        this.mIsReuseSurfaceTexture = z;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.mSurfaceTextureListener = surfaceTextureListener;
    }

    public VideoTextureView(Context context) {
        this(context, null);
    }

    private void initView(Context context) {
        this.mContext = context;
        DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
        this.mScreenHeight = displayMetrics.heightPixels;
        this.mScreenWidth = displayMetrics.widthPixels;
    }

    public void releaseSurface(boolean z) {
        if (z && isReuseSurfaceTexture()) {
            if (this.mSurfaceTexture != null) {
                this.mSurfaceTexture.release();
                this.mSurfaceTexture = null;
            }
            if (this.mCachedSurface != null) {
                this.mCachedSurface.release();
                this.mCachedSurface = null;
            }
        }
        this.mTextureValid = false;
        this.mNeedKeepSurface = false;
        this.mCachedSurface = null;
        this.mSurfaceTexture = null;
    }

    public VideoTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "TextureVideoView";
        this.mIsReuseSurfaceTexture = true;
        initView(context);
        initListener();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
