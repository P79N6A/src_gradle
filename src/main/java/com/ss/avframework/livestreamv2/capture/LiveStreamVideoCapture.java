package com.ss.avframework.livestreamv2.capture;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.SurfaceTextureHelper;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.ScreenVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.opengl.GLThread;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import com.ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LiveStreamVideoCapture extends VideoCapturer implements VideoCapturer.VideoCapturerObserver, IVideoCapturerControl {
    public int mBGMode;
    public Runnable mBackgroundPushVideoFrameRunable;
    public int mBackgroundTex = 0;
    private volatile long mBaseTimeUs = 0;
    public Context mContext;
    public GlRenderDrawer mDrawer;
    public int mFps;
    private GLThread mGlThread;
    public Handler mHandler;
    public int mHeight;
    private long mHelperFirstVideoTimeMs = 0;
    private boolean mHorizontalMirror = false;
    public boolean mIsResume;
    public long mLastTimestamp = 0;
    private volatile long mMaxFrameIntervalDiffUs = 0;
    public final Observer mObserver;
    private int mSaveDevicesIdWhenToBack = 0;
    private Intent mScreenIntent;
    private int mSource;
    public Object mStatFence = new Object();
    public int mStatus;
    private SurfaceTextureHelper mSurfaceTextureHelper;
    public SwitchCaptureRunnable mSwitchCaptureRunnable;
    public GlTextureFrameBuffer mTextureFrameBuffer;
    public ThreadUtils.ThreadChecker mThreadChecker;
    private boolean mVerticalMirror = false;
    public VideoCapturer mVideoCapturer;
    public int mWidth;
    public List<Integer> textureIdList = new CopyOnWriteArrayList();

    class CameraWrapper extends CameraVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        public CameraWrapper(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
            super(handler, z, videoCapturerObserver, LiveStreamVideoCapture.this.mContext);
        }

        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            this.mBaseTime += j - this.mLastTime;
            this.mLastTime = j;
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, this.mBaseTime);
        }
    }

    class ExternWrapper extends ExternalVideoCapturer {
        public int mRotation;

        public synchronized void release() {
            if (this.mBufferAlreadyReturn) {
                GLES20.glFinish();
            } else {
                LiveStreamVideoCapture.this.mHandler.post(new Runnable() {
                    public void run() {
                        AVLog.iow("LiveStreamVideoCapture", "Release texture on new post.");
                        GLES20.glFinish();
                    }
                });
            }
            super.release();
        }

        public int pushLastFrame(long j) {
            String str;
            GlTextureFrameBuffer glTextureFrameBuffer = LiveStreamVideoCapture.this.mTextureFrameBuffer;
            if (glTextureFrameBuffer == null) {
                return -1;
            }
            int width = glTextureFrameBuffer.getWidth();
            int height = glTextureFrameBuffer.getHeight();
            if (width <= 0 || height <= 0 || !this.mBufferAlreadyReturn) {
                if (this.mBufferAlreadyReturn) {
                    str = "never push any frame.";
                } else {
                    str = "current texture not return.";
                }
                AVLog.w("LiveStreamVideoCapture", str);
                return -1;
            }
            return super.pushVideoFrame(glTextureFrameBuffer.getTextureId(), false, glTextureFrameBuffer.getWidth(), glTextureFrameBuffer.getHeight(), this.mRotation, null, j, null);
        }

        public ExternWrapper(VideoCapturer.VideoCapturerObserver videoCapturerObserver, Handler handler) {
            super(videoCapturerObserver, handler);
            enableSigalMode(true);
        }

        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, j);
        }

        public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
            int[] iArr = {-1};
            if (!this.mBufferAlreadyReturn || this.mStatus != 1 || LiveStreamVideoCapture.this.mStatus != 1) {
                return iArr[0];
            }
            if (i < 0) {
                AVLog.w("LiveStreamVideoCapture", "push texture frame invalid.");
                return -1;
            }
            this.mRotation = i4;
            Handler handler = LiveStreamVideoCapture.this.mHandler;
            final int i5 = i3;
            final int i6 = i2;
            final boolean z2 = z;
            final int i7 = i;
            final float[] fArr2 = fArr;
            final long j2 = j;
            final int[] iArr2 = iArr;
            final Bundle bundle2 = bundle;
            AnonymousClass1 r0 = new Runnable() {
                public void run() {
                    if (LiveStreamVideoCapture.this.mTextureFrameBuffer != null && LiveStreamVideoCapture.this.mDrawer != null) {
                        if (!(LiveStreamVideoCapture.this.mTextureFrameBuffer.getHeight() == i5 && LiveStreamVideoCapture.this.mTextureFrameBuffer.getWidth() == i6)) {
                            try {
                                LiveStreamVideoCapture.this.mTextureFrameBuffer.setSize(i6, i5);
                            } catch (Exception e2) {
                                AVLog.e("LiveStreamVideoCapture", "textureFrameBuffer setSize failed (" + e2.getMessage() + ") w " + i6 + " h " + i5);
                                if (LiveStreamVideoCapture.this.mObserver != null) {
                                    LiveStreamVideoCapture.this.mObserver.onVideoCaptureError(-1, e2);
                                }
                                return;
                            }
                        }
                        GLES20.glBindFramebuffer(36160, LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId());
                        try {
                            GlUtil.checkNoGLES2Error("bindFrameBuffer failed");
                            if (z2) {
                                LiveStreamVideoCapture.this.mDrawer.drawOes(i7, null, fArr2, 0, 0, i6, i5);
                            } else {
                                LiveStreamVideoCapture.this.mDrawer.drawRgb(i7, null, fArr2, 0, 0, i6, i5);
                            }
                            GLES20.glFlush();
                            GLES20.glBindFramebuffer(36160, 0);
                            try {
                                GlUtil.checkNoGLES2Error("drawer is error.");
                                iArr2[0] = ExternWrapper.super.pushVideoFrame(LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId(), false, i6, i5, ExternWrapper.this.mRotation, null, j2, bundle2);
                            } catch (Throwable unused) {
                                AVLog.e("LiveStreamVideoCapture", "Drawer is error with ignore frame timestamp " + j2);
                            }
                        } catch (Throwable unused2) {
                            AVLog.ioe("LiveStreamVideoCapture", "bindFrameBuffer faild (tex:" + LiveStreamVideoCapture.this.mTextureFrameBuffer.getTextureId() + " fb:" + LiveStreamVideoCapture.this.mTextureFrameBuffer.getFrameBufferId() + " w:" + i6 + " h:" + i5);
                        }
                    }
                }
            };
            ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r0);
            return iArr[0];
        }
    }

    public interface Observer {
        void onVideoCaptureError(int i, Exception exc);

        void onVideoCaptureStarted();

        void onVideoCaptureStoped();
    }

    class ScreenWrapper extends ScreenVideoCapturer {
        private long mBaseTime;
        private long mLastTime;

        public ScreenWrapper(Intent intent, VideoCapturer.VideoCapturerObserver videoCapturerObserver) {
            super(intent, videoCapturerObserver);
        }

        public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
            if (this.mLastTime == 0) {
                this.mLastTime = j;
            }
            if (this.mBaseTime == 0) {
                this.mBaseTime = TimeUtils.nanoTime() / 1000;
                long guessFrameTimestampDiffUs = LiveStreamVideoCapture.guessFrameTimestampDiffUs(j);
                if (guessFrameTimestampDiffUs > 0) {
                    this.mBaseTime -= guessFrameTimestampDiffUs;
                }
            }
            this.mBaseTime += j - this.mLastTime;
            this.mLastTime = j;
            return LiveStreamVideoCapture.this.onFrame(buffer, i, i2, i3, this.mBaseTime);
        }
    }

    class SurfaceTextureSharedHandler extends SurfaceTextureHelper {
        public void handlerExit() {
        }

        public SurfaceTextureSharedHandler(Handler handler) {
            super(handler);
        }
    }

    class SwitchCaptureRunnable implements Runnable {
        public int mDeivce;

        public void run() {
            LiveStreamVideoCapture.this.onSwitchVideoCapturer(this.mDeivce);
        }

        public void setDevice(int i) {
            this.mDeivce = i;
        }

        public SwitchCaptureRunnable() {
        }
    }

    public IVideoCapturerControl getISPControl() {
        return this;
    }

    public int getBackgroundPolicy() {
        return this.mBGMode;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public int status() {
        return this.mStatus;
    }

    public boolean backgroundMode() {
        if (!this.mIsResume) {
            return true;
        }
        return false;
    }

    public void onVideoCapturerStarted() {
        this.mObserver.onVideoCaptureStarted();
    }

    public void onVideoCapturerStoped() {
        this.mObserver.onVideoCaptureStoped();
    }

    private CameraVideoCapturer getCameraHandler() {
        VideoCapturer videoCapturer = this.mVideoCapturer;
        if (videoCapturer == null || !(videoCapturer instanceof CameraVideoCapturer)) {
            return null;
        }
        return (CameraVideoCapturer) videoCapturer;
    }

    public void cancelAudioFocus() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            cameraHandler.cancelAudioFocus();
        }
    }

    public boolean currentSupportISPControl() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler == null || !cameraHandler.currentSupportISPControl()) {
            return false;
        }
        return true;
    }

    public IVideoCapturerControl.Range getExposureCompensationRange() {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.getExposureCompensationRange();
        }
        return null;
    }

    public void loadBitmap() {
        if (this.mBackgroundTex <= 0) {
            this.mBackgroundTex = GlUtil.generateTexture(3553);
        }
        updateImage();
    }

    private void onToExtern() {
        stopVideoCapturer();
        this.mVideoCapturer = new ExternWrapper(this, this.mHandler);
        setupMirror();
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    private void setupMirror() {
        if (this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternalVideoCapturer)) {
            ((ExternalVideoCapturer) this.mVideoCapturer).enableMirror(this.mHorizontalMirror, true);
            ((ExternalVideoCapturer) this.mVideoCapturer).enableMirror(this.mVerticalMirror, false);
        }
    }

    public void resume() {
        synchronized (this.mStatFence) {
            this.mIsResume = true;
            this.mHandler.removeCallbacks(this.mBackgroundPushVideoFrameRunable);
            if (this.mSaveDevicesIdWhenToBack != 0) {
                switchVideoCaptureDevice(this.mSaveDevicesIdWhenToBack, this.mScreenIntent);
            }
        }
    }

    public void stop() {
        synchronized (this.mStatFence) {
            if (this.mStatus != 2) {
                this.mStatus = 2;
                this.mHandler.post(new Runnable() {
                    public void run() {
                        LiveStreamVideoCapture.this.mHandler.removeCallbacks(LiveStreamVideoCapture.this.mSwitchCaptureRunnable);
                        LiveStreamVideoCapture.this.mHandler.removeCallbacks(LiveStreamVideoCapture.this.mBackgroundPushVideoFrameRunable);
                        LiveStreamVideoCapture.this.stopVideoCapturer();
                    }
                });
            }
        }
    }

    public void stopVideoCapturer() {
        if (this.mVideoCapturer != null) {
            this.mVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
    }

    @TargetApi(21)
    private void onToScreen() {
        stopVideoCapturer();
        ScreenWrapper screenWrapper = new ScreenWrapper(this.mScreenIntent, this);
        if (this.mSurfaceTextureHelper != null) {
            this.mSurfaceTextureHelper.dispose();
            this.mSurfaceTextureHelper = null;
        }
        this.mSurfaceTextureHelper = new SurfaceTextureSharedHandler(this.mHandler);
        screenWrapper.initialize(this.mSurfaceTextureHelper, this.mContext);
        this.mVideoCapturer = screenWrapper;
        this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
    }

    public void pause() {
        synchronized (this.mStatFence) {
            this.mIsResume = false;
            this.mSaveDevicesIdWhenToBack = this.mSource;
            if (this.mBGMode == 2) {
                this.mHandler.post(new Runnable() {
                    public void run() {
                        if (LiveStreamVideoCapture.this.mVideoCapturer instanceof CameraWrapper) {
                            ((CameraWrapper) LiveStreamVideoCapture.this.mVideoCapturer).copyCurrentFrame(LiveStreamVideoCapture.this.mDrawer, LiveStreamVideoCapture.this.mTextureFrameBuffer);
                        }
                    }
                });
            }
            switchVideoCaptureDevice(4, this.mScreenIntent);
            this.mHandler.post(this.mBackgroundPushVideoFrameRunable);
        }
    }

    public synchronized void release() {
        stop();
        if (this.mHandler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (LiveStreamVideoCapture.this.mBackgroundTex != 0) {
                        GLES20.glDeleteTextures(1, new int[]{LiveStreamVideoCapture.this.mBackgroundTex}, 0);
                    }
                    for (Integer intValue : LiveStreamVideoCapture.this.textureIdList) {
                        GLES20.glDeleteTextures(1, new int[]{intValue.intValue()}, 0);
                    }
                    LiveStreamVideoCapture.this.textureIdList.clear();
                    if (LiveStreamVideoCapture.this.mTextureFrameBuffer != null) {
                        LiveStreamVideoCapture.this.mTextureFrameBuffer.release();
                        LiveStreamVideoCapture.this.mTextureFrameBuffer = null;
                    }
                    if (LiveStreamVideoCapture.this.mDrawer != null) {
                        LiveStreamVideoCapture.this.mDrawer.release();
                        LiveStreamVideoCapture.this.mDrawer = null;
                    }
                }
            });
        }
        if (this.mGlThread != null) {
            this.mGlThread.quit();
        }
        super.release();
    }

    public void updateImage() {
        Bitmap createBitmap = createBitmap(this.mWidth, this.mHeight);
        if (createBitmap != null) {
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(-16777216);
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(10.0f);
            paint.setTextAlign(Paint.Align.RIGHT);
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            paint.setSubpixelText(true);
            PaintFlagsDrawFilter paintFlagsDrawFilter = new PaintFlagsDrawFilter(0, 2);
            Date date = new Date();
            canvas.setDrawFilter(paintFlagsDrawFilter);
            canvas.save();
            canvas.translate((float) (this.mWidth / 2), (float) (this.mHeight / 2));
            canvas.scale(1.0f, -1.0f);
            canvas.drawText(date.toString(), 0.0f, 0.0f, paint);
            canvas.restore();
            GLES20.glBindTexture(3553, this.mBackgroundTex);
            GLUtils.texImage2D(3553, 0, createBitmap, 0);
            GLES20.glBindTexture(3553, 0);
            createBitmap.recycle();
        }
    }

    public void setBackgroundPolicy(int i) {
        this.mBGMode = i;
    }

    public void updateScreenIntent(Intent intent) {
        this.mScreenIntent = intent;
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mHorizontalMirror;
        }
        return this.mVerticalMirror;
    }

    public void setBackGroundPhotoPath(final Object obj) {
        this.mHandler.post(new Runnable() {
            public void run() {
                boolean z;
                Iterator<Integer> it2 = LiveStreamVideoCapture.this.textureIdList.iterator();
                while (true) {
                    z = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
                }
                LiveStreamVideoCapture.this.textureIdList.clear();
                Bitmap bitmap = null;
                if (obj instanceof String) {
                    Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                    Matrix matrix = new Matrix();
                    matrix.setScale(1.0f, -1.0f);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                    decodeFile.recycle();
                    bitmap = createBitmap;
                } else {
                    if (obj instanceof Bitmap) {
                        bitmap = (Bitmap) obj;
                    }
                    z = false;
                }
                if (bitmap != null) {
                    int generateTexture = GlUtil.generateTexture(3553);
                    GLES20.glBindTexture(3553, generateTexture);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    GLES20.glBindTexture(3553, 0);
                    LiveStreamVideoCapture.this.textureIdList.add(Integer.valueOf(generateTexture));
                    if (z) {
                        bitmap.recycle();
                    }
                }
            }
        });
    }

    public int setExposureCompensation(float f2) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setExposureCompensation(f2);
        }
        return -1;
    }

    public int toggleFlashLight(boolean z) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.toggleFlashLight(z);
        }
        return -1;
    }

    public static long guessFrameTimestampDiffUs(long j) {
        long currentTimeMillis = (System.currentTimeMillis() * 1000) - j;
        if (Math.abs(currentTimeMillis) < 5000000) {
            return currentTimeMillis;
        }
        long nanoTime = (System.nanoTime() / 1000) - j;
        if (Math.abs(nanoTime) < 5000000) {
            return nanoTime;
        }
        return 0;
    }

    private void onToCamBack(boolean z) {
        if (this.mVideoCapturer == null || !(this.mVideoCapturer instanceof CameraVideoCapturer)) {
            stopVideoCapturer();
            this.mVideoCapturer = new CameraWrapper(this.mHandler, !z, this);
            setupMirror();
            this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
            return;
        }
        ((CameraVideoCapturer) this.mVideoCapturer).switchCamera();
    }

    public void onSwitchVideoCapturer(int i) {
        this.mSource = i;
        boolean z = true;
        if (this.mSource == 0 || this.mStatus == 1) {
            switch (this.mSource) {
                case 1:
                case 2:
                    if (2 != this.mSource) {
                        z = false;
                    }
                    onToCamBack(z);
                    return;
                case 3:
                    onToScreen();
                    return;
                case 4:
                    onToExtern();
                    return;
                default:
                    stopVideoCapturer();
                    return;
            }
        }
    }

    public void onVideoCapturerError(int i, Exception exc) {
        this.mObserver.onVideoCaptureError(i, exc);
    }

    private Bitmap createBitmap(int i, int i2) {
        try {
            return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public void enableMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
        setupMirror();
    }

    public void switchVideoCaptureDevice(int i, Intent intent) {
        this.mScreenIntent = intent;
        if (i != this.mSource || this.mVideoCapturer == null) {
            this.mHandler.removeCallbacks(this.mSwitchCaptureRunnable);
            this.mSwitchCaptureRunnable.setDevice(i);
            this.mHandler.post(this.mSwitchCaptureRunnable);
        }
    }

    public void adaptedOutputFormat(int i, int i2, int i3) {
        super.nativeAdaptedOutputFormat(i, i2, i3);
    }

    public void start(int i, int i2, int i3) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mFps = i3;
        this.mHandler.post(new Runnable() {
            public void run() {
                LiveStreamVideoCapture.this.loadBitmap();
            }
        });
        synchronized (this.mStatFence) {
            if (this.mStatus != 1) {
                this.mHelperFirstVideoTimeMs = 0;
                this.mStatus = 1;
                switchVideoCaptureDevice(this.mSource, this.mScreenIntent);
            }
        }
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        CameraVideoCapturer cameraHandler = getCameraHandler();
        if (cameraHandler != null) {
            return cameraHandler.setFocusAreas(i, i2, i3, i4);
        }
        return -1;
    }

    public LiveStreamVideoCapture(int i, Handler handler, Observer observer, Context context) {
        this.mSource = i;
        this.mHandler = handler;
        this.mObserver = observer;
        this.mStatus = 0;
        this.mIsResume = true;
        this.mContext = context;
        if (this.mHandler == null) {
            this.mGlThread = new GLThread("liveStreamVideoSource");
            this.mGlThread.start();
            this.mHandler = this.mGlThread.getHandler();
        } else {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                public void run() {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        throw new AndroidRuntimeException("Not a gl thread.");
                    }
                }
            });
        }
        this.mBackgroundPushVideoFrameRunable = new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d5, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r19 = this;
                    r1 = r19
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this
                    java.lang.Object r2 = r0.mStatFence
                    monitor-enter(r2)
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    boolean r0 = r0.mIsResume     // Catch:{ all -> 0x00d6 }
                    if (r0 != 0) goto L_0x00d4
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r0 = r0.status()     // Catch:{ all -> 0x00d6 }
                    r3 = 1
                    if (r0 == r3) goto L_0x0018
                    goto L_0x00d4
                L_0x0018:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.lang.Runnable r3 = r3.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x00d6 }
                    r0.removeCallbacks(r3)     // Catch:{ all -> 0x00d6 }
                    r0 = 1000(0x3e8, float:1.401E-42)
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r3 = r3.mFps     // Catch:{ all -> 0x00d6 }
                    if (r3 > 0) goto L_0x002e
                    r3 = 30
                    goto L_0x0032
                L_0x002e:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r3 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r3 = r3.mFps     // Catch:{ all -> 0x00d6 }
                L_0x0032:
                    int r0 = r0 / r3
                    long r3 = (long) r0     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    long r5 = r0.mLastTimestamp     // Catch:{ all -> 0x00d6 }
                    r7 = 1000(0x3e8, double:4.94E-321)
                    long r7 = r7 * r3
                    long r5 = r5 + r7
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x00d6 }
                    boolean r0 = r0 instanceof com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper     // Catch:{ all -> 0x00d6 }
                    if (r0 != 0) goto L_0x0052
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r5 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.lang.Runnable r5 = r5.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x00d6 }
                    r0.postDelayed(r5, r3)     // Catch:{ all -> 0x00d6 }
                    monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
                    return
                L_0x0052:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r0 = r0.mBGMode     // Catch:{ all -> 0x00d6 }
                    r7 = 2
                    if (r0 != r7) goto L_0x0072
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r0 = (com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r0     // Catch:{ all -> 0x00d6 }
                    int r0 = r0.pushLastFrame(r5)     // Catch:{ all -> 0x00d6 }
                    if (r0 < 0) goto L_0x0072
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r5 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.lang.Runnable r5 = r5.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x00d6 }
                    r0.postDelayed(r5, r3)     // Catch:{ all -> 0x00d6 }
                    monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
                    return
                L_0x0072:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.util.List<java.lang.Integer> r0 = r0.textureIdList     // Catch:{ all -> 0x00d6 }
                    boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d6 }
                    if (r0 == 0) goto L_0x009f
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    r0.updateImage()     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x00d6 }
                    r9 = r0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r9 = (com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r9     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r10 = r0.mBackgroundTex     // Catch:{ all -> 0x00d6 }
                    r11 = 0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r12 = r0.mWidth     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r13 = r0.mHeight     // Catch:{ all -> 0x00d6 }
                    r14 = 0
                    r15 = 0
                    r18 = 0
                    r16 = r5
                    r9.pushVideoFrame(r10, r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x00d6 }
                    goto L_0x00c7
                L_0x009f:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.capture.video.VideoCapturer r0 = r0.mVideoCapturer     // Catch:{ all -> 0x00d6 }
                    r9 = r0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture$ExternWrapper r9 = (com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.ExternWrapper) r9     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.util.List<java.lang.Integer> r0 = r0.textureIdList     // Catch:{ all -> 0x00d6 }
                    r7 = 0
                    java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00d6 }
                    java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x00d6 }
                    int r10 = r0.intValue()     // Catch:{ all -> 0x00d6 }
                    r11 = 0
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r12 = r0.mWidth     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    int r13 = r0.mHeight     // Catch:{ all -> 0x00d6 }
                    r14 = 0
                    r15 = 0
                    r18 = 0
                    r16 = r5
                    r9.pushVideoFrame(r10, r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x00d6 }
                L_0x00c7:
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r0 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    android.os.Handler r0 = r0.mHandler     // Catch:{ all -> 0x00d6 }
                    com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture r5 = com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.this     // Catch:{ all -> 0x00d6 }
                    java.lang.Runnable r5 = r5.mBackgroundPushVideoFrameRunable     // Catch:{ all -> 0x00d6 }
                    r0.postDelayed(r5, r3)     // Catch:{ all -> 0x00d6 }
                    monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
                    return
                L_0x00d4:
                    monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
                    return
                L_0x00d6:
                    r0 = move-exception
                    monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture.AnonymousClass3.run():void");
            }
        };
        if (this.mHandler == null) {
            this.mHandler = this.mGlThread.getHandler();
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                LiveStreamVideoCapture.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                LiveStreamVideoCapture.this.mDrawer = new GlRenderDrawer();
                LiveStreamVideoCapture.this.mTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            }
        });
        this.mSwitchCaptureRunnable = new SwitchCaptureRunnable();
    }

    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        try {
            this.mThreadChecker.checkIsOnValidThread();
        } catch (Exception e2) {
            AVLog.w("LiveStreamVideoCapture", e2.toString());
        }
        if (j - this.mLastTimestamp <= 0) {
            AVLog.w("LiveStreamVideoCapture", "Repeat video frame timestamp VS lastTime " + j + " VS " + this.mLastTimestamp);
            return -1;
        }
        this.mLastTimestamp = j;
        synchronized (this.mStatFence) {
            if (status() != 1) {
                return -1;
            }
            int onFrame = super.onFrame(buffer, i, i2, i3, j);
            return onFrame;
        }
    }

    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        if ((this.mBGMode == 1 || this.mIsResume) && this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternWrapper)) {
            return ((ExternWrapper) this.mVideoCapturer).pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        if ((this.mBGMode == 1 || this.mIsResume) && this.mVideoCapturer != null && (this.mVideoCapturer instanceof ExternWrapper)) {
            return ((ExternWrapper) this.mVideoCapturer).pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
        }
        return -1;
    }
}
