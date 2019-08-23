package com.ss.avframework.livestreamv2;

import android.opengl.Matrix;
import android.view.SurfaceView;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.opengl.GLRenderVideoSink;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;

public class RenderView extends GLRenderVideoSink implements GLRenderVideoSink.GLRenderer {
    private GlRenderDrawer mDrawer;
    private boolean mFitMode;
    private int mFrameHeight;
    private int mFrameWidth;
    private boolean mMirrorX;
    private boolean mMirrorY;
    private float[] mPrj = new float[16];
    private VideoFrameRender mRenderFrame;
    private boolean mSizedChanged;
    private int mWindHeight;
    private int mWindWidth;

    public void onSurfaceCreated() {
        this.mDrawer = new GlRenderDrawer();
    }

    public void onSurfaceDestroy() {
        this.mDrawer.release();
        this.mDrawer = null;
    }

    public RenderView(SurfaceView surfaceView) {
        super(surfaceView);
        setRenderer(this);
        Matrix.setIdentityM(this.mPrj, 0);
        this.mRenderFrame = new VideoFrameRender();
    }

    public void onDrawFrame(VideoFrame videoFrame) {
        if (this.mDrawer != null) {
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
                calcViewRatio(rotatedWidth, rotatedHeight);
                this.mSizedChanged = false;
            }
            if (!this.mRenderFrame.drawFrame(videoFrame, this.mDrawer, this.mPrj, null, 0, 0, this.mWindWidth, this.mWindHeight)) {
                AVLog.w("RenderView", "Render frame failed timestamp " + videoFrame.getTimestampNs());
            }
        }
    }

    public void onSurfaceChanged(int i, int i2) {
        this.mWindWidth = i;
        this.mWindHeight = i2;
        this.mSizedChanged = true;
    }

    private void calcViewRatio(int i, int i2) {
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        Matrix.setIdentityM(this.mPrj, 0);
        RendererCommon.calcWindRatio(this.mFitMode, this.mMirrorX, this.mMirrorY, this.mWindWidth, this.mWindHeight, i, i2, this.mPrj);
    }
}
