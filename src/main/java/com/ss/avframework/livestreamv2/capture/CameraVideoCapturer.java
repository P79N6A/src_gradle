package com.ss.avframework.livestreamv2.capture;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import com.ss.android.ttvecamera.TECameraSettings;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.d;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f;
import com.ss.android.ttvecamera.f.b;
import com.ss.android.ttvecamera.f.c;
import com.ss.avframework.buffer.GlTextureFrameBuffer;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.opengl.GlRenderDrawer;
import com.ss.avframework.opengl.GlUtil;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;

public class CameraVideoCapturer extends ExternalVideoCapturer implements d.a, IVideoCapturerControl {
    private int mCameraCaptureHeight;
    private int mCameraCaptureWidth;
    private int mCameraType = 1;
    private d mCapture = new d(this);
    private Context mContext;
    private int mFront;
    public Handler mHandler;
    public boolean mISPExposureStatus = false;
    public boolean mISPFocuseStatus = false;
    public boolean mISPToggleStatus = false;
    public boolean mNewTexture;
    private Object mObject = new Object();
    private VideoCapturer.VideoCapturerObserver mObserver;
    public int mOesTex;
    public int mRotation;
    public SurfaceTexture mSurfaceTexture;
    public float[] mTexMatrix = new float[16];
    public ThreadUtils.ThreadChecker mThreadChecker;

    public void onInfo(int i, int i2, String str) {
    }

    public boolean currentSupportISPControl() {
        if (this.mCameraType == 1) {
            return true;
        }
        return false;
    }

    public void cancelAudioFocus() {
        if (this.mCapture != null) {
            try {
                f.INSTANCE.lambda$cancelFocus$10$TECameraServer(this.mCapture);
            } catch (Throwable unused) {
            }
        }
    }

    public IVideoCapturerControl.Range getExposureCompensationRange() {
        if (this.mCapture != null) {
            TECameraSettings.a cameraECInfo = f.INSTANCE.getCameraECInfo(this.mCapture);
            if (cameraECInfo != null) {
                IVideoCapturerControl.Range range = new IVideoCapturerControl.Range();
                range.max = (float) cameraECInfo.f31296a;
                range.min = (float) cameraECInfo.f31298c;
                return range;
            }
        }
        return null;
    }

    public synchronized void release() {
        if (this.mHandler != null) {
            stop();
            this.mHandler.post(new Runnable() {
                public void run() {
                    if (CameraVideoCapturer.this.mSurfaceTexture != null) {
                        CameraVideoCapturer.this.mSurfaceTexture.release();
                        CameraVideoCapturer.this.mSurfaceTexture = null;
                    }
                    if (CameraVideoCapturer.this.mOesTex > 0) {
                        GLES20.glDeleteTextures(0, new int[]{CameraVideoCapturer.this.mOesTex}, 0);
                        CameraVideoCapturer.this.mOesTex = 0;
                    }
                }
            });
        }
        this.mContext = null;
        super.release();
    }

    public void returnTexture() {
        this.mThreadChecker.checkIsOnValidThread();
        this.mBufferAlreadyReturn = true;
        if (this.mStatus == 1 && this.mNewTexture) {
            tryDeliverFrame();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|(2:7|8)|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ss.avframework.utils.ThreadUtils$ThreadChecker r0 = r3.mThreadChecker     // Catch:{ all -> 0x001c }
            r0.checkIsOnValidThread()     // Catch:{ all -> 0x001c }
            java.lang.Object r0 = r3.mObject     // Catch:{ all -> 0x001c }
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            com.ss.android.ttvecamera.d r1 = r3.mCapture     // Catch:{ all -> 0x0019 }
            r2 = 0
            r3.mCapture = r2     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0016
            r1.a()     // Catch:{ Throwable -> 0x0016 }
            r1.c()     // Catch:{ Throwable -> 0x0016 }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            monitor-exit(r3)
            return
        L_0x0019:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.stop():void");
    }

    public void tryDeliverFrame() {
        if (this.mStatus == 1 && this.mNewTexture && this.mBufferAlreadyReturn) {
            this.mNewTexture = false;
            this.mSurfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(this.mTexMatrix);
            pushVideoFrame(this.mOesTex, true, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mRotation, this.mTexMatrix, this.mSurfaceTexture.getTimestamp() / 1000, null);
        }
    }

    public void switchCamera() {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            if (this.mCapture == null) {
                this.mObserver.onVideoCapturerError(-1, new Exception("Capture already release"));
                return;
            }
            int i = 1;
            if (status() != 1) {
                AVLog.ioe("CameraVideoCapturer", "Camera no ready.");
                return;
            }
            if (this.mFront != 0) {
                i = 0;
            }
            this.mFront = i;
            f.INSTANCE.lambda$switchCamera$6$TECameraServer(this.mCapture, this.mFront);
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.switchCamera();
                }
            });
        }
    }

    public void onCaptureStopped(final int i) {
        try {
            this.mThreadChecker.checkIsOnValidThread();
            super.stop();
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.onCaptureStopped(i);
                }
            });
        }
    }

    public int setExposureCompensation(float f2) {
        final int[] iArr = {-1};
        IVideoCapturerControl.Range exposureCompensationRange = getExposureCompensationRange();
        if (exposureCompensationRange != null && ((f2 <= exposureCompensationRange.max || f2 >= exposureCompensationRange.min) && this.mCapture != null)) {
            try {
                this.mISPExposureStatus = true;
                f.INSTANCE.lambda$setExposureCompensation$15$TECameraServer(this.mCapture, (int) f2);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPExposureStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    public int toggleFlashLight(boolean z) {
        final int[] iArr = {-1};
        if (this.mCapture != null) {
            try {
                this.mISPToggleStatus = true;
                f.INSTANCE.lambda$toggleTorch$18$TECameraServer(this.mCapture, z);
                postAndWait(this.mHandler, 1000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPToggleStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return iArr[0];
            }
        }
        return iArr[0];
    }

    public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
        final boolean[] zArr = {false};
        ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
            public void run() {
                if (CameraVideoCapturer.this.mOesTex > 0 && glRenderDrawer != null && glTextureFrameBuffer != null && glTextureFrameBuffer.getFrameBufferId() > 0) {
                    if (!(glTextureFrameBuffer.getWidth() == CameraVideoCapturer.this.mOutWidth && glTextureFrameBuffer.getHeight() == CameraVideoCapturer.this.mOutHeight)) {
                        try {
                            glTextureFrameBuffer.setSize(CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                        } catch (Exception e2) {
                            AVLog.e("CameraVideoCapturer", "frameBuffer setSize failed (" + e2.getMessage() + ") w " + CameraVideoCapturer.this.mOutWidth + " h " + CameraVideoCapturer.this.mOutHeight);
                            return;
                        }
                    }
                    Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                    convertMatrixToAndroidGraphicsMatrix.preTranslate(0.5f, 0.5f);
                    convertMatrixToAndroidGraphicsMatrix.preRotate((float) (-CameraVideoCapturer.this.mRotation));
                    convertMatrixToAndroidGraphicsMatrix.preTranslate(-0.5f, -0.5f);
                    float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                    GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                    glRenderDrawer.drawOes(CameraVideoCapturer.this.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, CameraVideoCapturer.this.mOutWidth, CameraVideoCapturer.this.mOutHeight);
                    GLES20.glFlush();
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("CameraVideoCapturer.copyCurrentFrame ");
                    zArr[0] = true;
                }
            }
        });
        return zArr[0];
    }

    public void onError(final int i, final String str) {
        if (Thread.currentThread() == this.mHandler.getLooper().getThread()) {
            onErrorOnHandler(i, str);
        } else {
            this.mHandler.post(new Runnable() {
                public void run() {
                    CameraVideoCapturer.this.onErrorOnHandler(i, str);
                }
            });
        }
    }

    public void onErrorOnHandler(int i, String str) {
        switch (i) {
            case -417:
            case -416:
                this.mISPToggleStatus = false;
                return;
            case -415:
            case -414:
            case -413:
                this.mISPExposureStatus = false;
                return;
            case -412:
            case -411:
                this.mISPFocuseStatus = false;
                return;
            default:
                this.mStatus = 2;
                this.mObserver.onVideoCapturerError(i, new Exception(str));
                return;
        }
    }

    public void onCaptureStarted(final int i, int i2) {
        boolean z;
        if (this.mCapture == null) {
            AVLog.iow("CameraVideoCapturer", "onCaptureStarted after stop");
        } else if (i2 != 0) {
            onError(i2, "What happen? Maybe the size(" + this.mFps + "@" + this.mOutWidth + "x" + this.mOutHeight + ") is invalid.");
        } else {
            try {
                this.mThreadChecker.checkIsOnValidThread();
                if (this.mSurfaceTexture == null || this.mOesTex <= 0) {
                    onError(0, "Invalid texture");
                    return;
                }
                String str = "Capture is null, not should be here";
                synchronized (this.mObject) {
                    z = true;
                    if (this.mCapture != null) {
                        c.a aVar = new c.a(new ac(this.mCameraCaptureWidth, this.mCameraCaptureHeight), new b.a() {
                            public void onFrameCaptured(final e eVar) {
                                if (Thread.currentThread() != CameraVideoCapturer.this.mHandler.getLooper().getThread()) {
                                    ThreadUtils.invokeAtFrontUninterruptibly(CameraVideoCapturer.this.mHandler, (Runnable) new Runnable() {
                                        public void run() {
                                            CameraVideoCapturer.this.mNewTexture = true;
                                            CameraVideoCapturer.this.mRotation = eVar.c();
                                            CameraVideoCapturer.this.tryDeliverFrame();
                                        }
                                    });
                                    return;
                                }
                                CameraVideoCapturer.this.mNewTexture = true;
                                CameraVideoCapturer.this.mRotation = eVar.c();
                                CameraVideoCapturer.this.tryDeliverFrame();
                            }
                        }, true, this.mSurfaceTexture, this.mOesTex);
                        this.mCapture.a(aVar);
                        try {
                            i2 = this.mCapture.b();
                        } catch (Exception e2) {
                            i2 = -1;
                            str = e2.getMessage();
                        }
                        if (i2 == 0) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    onError(i2, str);
                } else {
                    super.start(this.mOutWidth, this.mOutHeight, this.mFps);
                }
            } catch (Throwable unused) {
                ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, (Runnable) new Runnable() {
                    public void run() {
                        CameraVideoCapturer.this.onCaptureStarted(i, 0);
                    }
                });
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|(2:10|11)|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean postAndWait(android.os.Handler r5, long r6, final java.lang.Runnable r8) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x002b
            if (r8 == 0) goto L_0x002b
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x002b
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2 = 1
            boolean[] r2 = new boolean[r2]
            r2[r0] = r0
            monitor-enter(r1)
            com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$12 r3 = new com.ss.avframework.livestreamv2.capture.CameraVideoCapturer$12     // Catch:{ all -> 0x0028 }
            r3.<init>(r8, r2, r1)     // Catch:{ all -> 0x0028 }
            boolean r5 = r5.post(r3)     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x0024
            r1.wait(r6)     // Catch:{ InterruptedException -> 0x0024 }
        L_0x0024:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            boolean r0 = r2[r0]
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r5
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.capture.CameraVideoCapturer.postAndWait(android.os.Handler, long, java.lang.Runnable):boolean");
    }

    public void start(int i, int i2, int i3) {
        this.mOutWidth = i;
        this.mOutHeight = i2;
        this.mCameraCaptureHeight = Math.min(i, i2);
        this.mCameraCaptureWidth = Math.max(i, i2);
        this.mFps = i3;
        synchronized (this.mObject) {
            if (this.mCapture != null) {
                TECameraSettings tECameraSettings = new TECameraSettings(this.mContext, this.mCameraType, this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                tECameraSettings.f31294e = this.mFront;
                int a2 = this.mCapture.a(tECameraSettings);
                if (a2 != 0) {
                    VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
                    videoCapturerObserver.onVideoCapturerError(-1, new Exception("Capture connect failed(" + a2 + ")"));
                }
            } else {
                this.mObserver.onVideoCapturerError(-1, new Exception("Capture already release"));
            }
        }
    }

    public CameraVideoCapturer(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, Context context) {
        super(videoCapturerObserver, handler);
        this.mFront = z ? 1 : 0;
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) new Runnable() {
            public void run() {
                CameraVideoCapturer.this.mThreadChecker = new ThreadUtils.ThreadChecker();
                CameraVideoCapturer.this.mOesTex = GlUtil.generateTexture(36197);
                CameraVideoCapturer.this.mSurfaceTexture = new SurfaceTexture(CameraVideoCapturer.this.mOesTex);
            }
        });
        this.mHandler = handler;
        this.mObserver = videoCapturerObserver;
        this.mContext = context;
        enableSigalMode(true);
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        final int[] iArr = {-1};
        if (this.mCapture != null) {
            try {
                this.mISPFocuseStatus = true;
                this.mCapture.a(i, i2, 0.15f, i3, i4);
                postAndWait(this.mHandler, 3000, new Runnable() {
                    public void run() {
                        int i;
                        int[] iArr = iArr;
                        if (CameraVideoCapturer.this.mISPFocuseStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr[0] = i;
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return super.onFrame(buffer, i, i2, i3, j);
    }
}
