package com.ss.avframework.livestreamv2.core;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bef.effectsdk.b;
import com.bef.effectsdk.message.MessageCenter;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.avframework.livestreamv2.control.IVideoCapturerControl;
import com.ss.avframework.livestreamv2.effectcamera.common.TCState;
import com.ss.avframework.livestreamv2.effectcamera.display.CameraDisplay2;
import com.ss.avframework.livestreamv2.effectcamera.render.EffectRender;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.filter.ITTVideoEffectProcessor;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.ThreadUtils;
import javax.microedition.khronos.egl.EGLContext;

public class EffectCameraWrapper implements SurfaceHolder.Callback, IVideoCapturerControl, TCState.StateListener, CameraDisplay2.FrameListener, IFilterManager {
    public static final String TAG = "com.ss.avframework.livestreamv2.core.EffectCameraWrapper";
    private final int STATUS_ERROR = 4;
    private final int STATUS_INIT = 1;
    private final int STATUS_START = 2;
    private final int STATUS_STOP = 3;
    private final int STATUS_UNINIT;
    public CameraDisplay2 mCameraDisplay2;
    public Handler mCaptureHander;
    public int mCaptureHeight;
    public int mCapturePreviewHeight;
    public int mCapturePreviewWidth;
    public int mCaptureWidth;
    private boolean mDisableFilter;
    public ITTVideoEffectProcessor.FaceDetectListener mFaceDetectListener;
    private int mFps;
    public final CameraDisplay2.FrameListener mFrameListener;
    public boolean mFrontCam;
    public ITTVideoEffectProcessor.EffectMsgListener mMsgListener;
    public LiveStreamVideoCapture.Observer mObserver;
    public int mStatus;
    private Handler mWorkHandler;

    public void checkStatus(boolean z) {
    }

    public boolean currentSupportISPControl() {
        return true;
    }

    public int enableMockFace(boolean z) {
        return 0;
    }

    public String getVersion() {
        return "";
    }

    public boolean isValid() {
        return true;
    }

    public String name() {
        return "EffectCameraWrapper";
    }

    public void setMicrophoneDetectListener(ITTVideoEffectProcessor.MicrophoneDetectListener microphoneDetectListener) {
    }

    public int startEffectAudio() {
        return 0;
    }

    public int stopEffectAudio() {
        return 0;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public boolean isEnable() {
        return this.mDisableFilter;
    }

    public boolean isFrontCam() {
        return this.mFrontCam;
    }

    public void cancelAudioFocus() {
        this.mCameraDisplay2.cancelAutoFocus();
    }

    public int pauseEffect() {
        return this.mCameraDisplay2.pauseEffect();
    }

    public int resumeEffect() {
        return this.mCameraDisplay2.resumeEffect();
    }

    public void release() {
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkHandler, (Runnable) new Runnable() {
            public void run() {
                EffectCameraWrapper.this.stopCapture();
                EffectCameraWrapper.this.mCameraDisplay2.releaseSurfaceHolder();
                EffectCameraWrapper.this.mStatus = 0;
            }
        });
    }

    public void startCapture() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                if (EffectCameraWrapper.this.mStatus == 4) {
                    AVLog.e(EffectCameraWrapper.TAG, "Status exception at startCapture");
                } else if (EffectCameraWrapper.this.mStatus != 2) {
                    EffectCameraWrapper.this.mStatus = 2;
                    ThreadUtils.invokeAtFrontUninterruptibly(EffectCameraWrapper.this.mCaptureHander, (Runnable) new Runnable() {
                        public void run() {
                            EffectCameraWrapper.this.mCameraDisplay2.startCapture(EffectCameraWrapper.this.mFrontCam, EffectCameraWrapper.this.mCaptureWidth, EffectCameraWrapper.this.mCaptureHeight, EffectCameraWrapper.this.mCapturePreviewWidth, EffectCameraWrapper.this.mCapturePreviewHeight);
                        }
                    });
                }
            }
        });
    }

    public void stopCapture() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                if (EffectCameraWrapper.this.mStatus == 4) {
                    AVLog.e(EffectCameraWrapper.TAG, "Status exception at startCapture");
                } else if (EffectCameraWrapper.this.mStatus != 3) {
                    EffectCameraWrapper.this.mStatus = 3;
                    EffectCameraWrapper.this.mCameraDisplay2.stopCapture();
                }
            }
        });
    }

    public void switchCamera() {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                if (EffectCameraWrapper.this.mStatus == 4) {
                    AVLog.e(EffectCameraWrapper.TAG, "Status exception at startCapture");
                    return;
                }
                EffectCameraWrapper effectCameraWrapper = EffectCameraWrapper.this;
                if (EffectCameraWrapper.this.mStatus == 2) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapper.checkStatus(z);
                int changeCamera = EffectCameraWrapper.this.mCameraDisplay2.changeCamera();
                if (changeCamera != 0) {
                    EffectCameraWrapper effectCameraWrapper2 = EffectCameraWrapper.this;
                    TCState.TCStateType tCStateType = TCState.TCStateType.CameraOpenFail;
                    effectCameraWrapper2.onError(tCStateType, -1, "change camera failed, ret : " + changeCamera + "msg type ");
                    EffectCameraWrapper.this.mStatus = 4;
                }
                EffectCameraWrapper.this.mFrontCam = !EffectCameraWrapper.this.mFrontCam;
            }
        });
    }

    public IVideoCapturerControl.Range getExposureCompensationRange() {
        IVideoCapturerControl.Range range = new IVideoCapturerControl.Range();
        if (this.mCameraDisplay2.isSupportExposureCompensation()) {
            range.max = (float) this.mCameraDisplay2.getMaxExposureCompensation();
            range.min = (float) this.mCameraDisplay2.getMinExposureCompensation();
        }
        return range;
    }

    public void enable(boolean z) {
        this.mDisableFilter = z;
        this.mCameraDisplay2.disableFilters(z);
    }

    public int setEffect(String str) {
        this.mCameraDisplay2.setEffect(str);
        return 0;
    }

    public int setFaceAttribute(boolean z) {
        this.mCameraDisplay2.setFaceAttribute(z);
        return 0;
    }

    public void setSurface(SurfaceView surfaceView) {
        surfaceView.getHolder().addCallback(this);
    }

    public int toggleFlashLight(boolean z) {
        return this.mCameraDisplay2.toggleFlashLight(z);
    }

    public void setEffectMsgListener(ITTVideoEffectProcessor.EffectMsgListener effectMsgListener) {
        this.mMsgListener = effectMsgListener;
        this.mCameraDisplay2.setEffectMsgListener(new MessageCenter.a() {
            public void onMessageReceived(int i, int i2, int i3, String str) {
                ITTVideoEffectProcessor.EffectMsgListener effectMsgListener = EffectCameraWrapper.this.mMsgListener;
                if (effectMsgListener != null) {
                    effectMsgListener.onMessage(i, i2, i3, str);
                }
            }
        });
    }

    public void setFaceDetectListener(ITTVideoEffectProcessor.FaceDetectListener faceDetectListener) {
        this.mFaceDetectListener = faceDetectListener;
        this.mCameraDisplay2.setDetectFaceResultListener(new EffectRender.OnRefreshFaceDataListener() {
            public void onRefreshFaceData(int i) {
                if (EffectCameraWrapper.this.mFaceDetectListener != null) {
                    EffectCameraWrapper.this.mFaceDetectListener.onFaceDetectResultCallback(i);
                }
            }
        });
    }

    public void surfaceCreated(final SurfaceHolder surfaceHolder) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                EffectCameraWrapper effectCameraWrapper = EffectCameraWrapper.this;
                if (EffectCameraWrapper.this.mStatus != 4) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapper.checkStatus(z);
                EffectCameraWrapper.this.mCameraDisplay2.setSurfaceHolder(surfaceHolder);
            }
        });
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                EffectCameraWrapper effectCameraWrapper = EffectCameraWrapper.this;
                if (EffectCameraWrapper.this.mStatus != 4) {
                    z = true;
                } else {
                    z = false;
                }
                effectCameraWrapper.checkStatus(z);
                EffectCameraWrapper.this.mCameraDisplay2.releaseSurfaceHolder();
            }
        });
    }

    public int setExposureCompensation(float f2) {
        if (!this.mCameraDisplay2.isSupportExposureCompensation()) {
            return -1;
        }
        this.mCameraDisplay2.setExposureCompensation((int) f2);
        return 0;
    }

    public int composerReloadNodes(String[] strArr, int i) {
        return this.mCameraDisplay2.setComposerReloadNodes(strArr, i);
    }

    public int composerSetMode(int i, int i2) {
        return this.mCameraDisplay2.setComposerMode(i, i2);
    }

    public int composerSetNodes(String[] strArr, int i) {
        return this.mCameraDisplay2.setComposerSetNodes(strArr, i);
    }

    public int setCustomEffect(String str, String str2) {
        this.mCameraDisplay2.setCustomEffect(str, str2);
        return 0;
    }

    public int setFilter(String str, float f2) {
        this.mCameraDisplay2.setFilter(str, f2);
        return 0;
    }

    public void enableMirror(final boolean z, boolean z2) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                boolean z;
                CameraDisplay2 cameraDisplay2 = EffectCameraWrapper.this.mCameraDisplay2;
                if (z != EffectCameraWrapper.this.mCameraDisplay2.isFilpHorizontal()) {
                    z = true;
                } else {
                    z = false;
                }
                cameraDisplay2.setFilpHorizontalState(z);
            }
        });
    }

    public int setEffect(String str, boolean z) {
        this.mCameraDisplay2.setEffect(str, z);
        return 0;
    }

    public int composerUpdateNode(String str, String str2, float f2) {
        return this.mCameraDisplay2.setComposerUpdateNode(str, str2, f2);
    }

    public int setBeautify(String str, float f2, float f3) {
        return this.mCameraDisplay2.setBeautify(str, f2, f3, 0.0f);
    }

    public int setReshape(String str, float f2, float f3) {
        return this.mCameraDisplay2.setReshape(str, f2, f3);
    }

    public void onError(final TCState.TCStateType tCStateType, final int i, String str) {
        this.mWorkHandler.post(new Runnable() {
            public void run() {
                LiveStreamVideoCapture.Observer observer = EffectCameraWrapper.this.mObserver;
                int i = i;
                observer.onVideoCaptureError(i, new Exception("ret : " + i + "msg type " + tCStateType.name()));
            }
        });
    }

    public void onInfo(TCState.TCStateType tCStateType, int i, String str) {
        if (tCStateType == TCState.TCStateType.EffectInitSucceed) {
            ITTVideoEffectProcessor.EffectMsgListener effectMsgListener = this.mMsgListener;
            if (effectMsgListener != null) {
                effectMsgListener.onMessage(2139095041, i, 0, str);
            }
        }
    }

    public int setFilter(String str, String str2, float f2) {
        this.mCameraDisplay2.setFilter(str, str2, f2);
        return 0;
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        return this.mCameraDisplay2.sendEffectMsg(i, i2, i3, str);
    }

    public int setBeautify(String str, float f2, float f3, float f4) {
        return this.mCameraDisplay2.setBeautify(str, f2, f3, f4);
    }

    public int setFocusAreas(int i, int i2, int i3, int i4) {
        if (this.mCameraDisplay2.setFocus(i, i2, (float) i3, (float) i4)) {
            return 0;
        }
        return -1;
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z) {
        this.mCameraDisplay2.configEffect(str, str2, z, false);
    }

    public EffectCameraWrapper(final LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, LiveStreamVideoCapture.Observer observer, CameraDisplay2.FrameListener frameListener) {
        boolean z = true;
        this.mFps = liveStreamBuilder.getVideoCaptureFps();
        this.mCaptureWidth = liveStreamBuilder.getVideoCaptureWidth();
        this.mCaptureHeight = liveStreamBuilder.getVideoCaptureHeight();
        this.mCaptureHander = handler;
        this.mWorkHandler = handler2;
        this.mCapturePreviewWidth = liveStreamBuilder.getVideoWidth();
        this.mCapturePreviewHeight = liveStreamBuilder.getVideoHeight();
        this.mObserver = observer;
        this.mFrontCam = liveStreamBuilder.getVideoCaptureDevice() != 1 ? false : z;
        this.mFrameListener = frameListener;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mCaptureHander, (Runnable) new Runnable() {
            public void run() {
                EffectCameraWrapper.this.mCameraDisplay2 = new CameraDisplay2(liveStreamBuilder.getContext());
                EffectCameraWrapper.this.mCameraDisplay2.setFrameListener(EffectCameraWrapper.this);
                EffectCameraWrapper.this.mCameraDisplay2.setStateListener(EffectCameraWrapper.this);
                EffectCameraWrapper.this.mStatus = 1;
            }
        });
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, AssetManager assetManager) {
        this.mCameraDisplay2.configEffect(str, str2, z, false, assetManager);
    }

    public void configEffect(int i, int i2, String str, String str2, boolean z, Object obj) {
        this.mCameraDisplay2.configEffect(str, str2, z, false, null, (b) obj);
    }

    public void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, Bundle bundle) {
        String str = TAG;
        StringBuilder sb = new StringBuilder("Get a frame w ");
        sb.append(i3);
        sb.append(" h ");
        final int i5 = i4;
        sb.append(i5);
        AVLog.d(str, sb.toString());
        Handler handler = this.mCaptureHander;
        final EGLContext eGLContext2 = eGLContext;
        final int i6 = i;
        final int i7 = i2;
        final int i8 = i3;
        final long j2 = j;
        final Bundle bundle2 = bundle;
        AnonymousClass9 r3 = new Runnable() {
            public void run() {
                EffectCameraWrapper.this.mFrameListener.onFrameAvailable(eGLContext2, i6, i7, i8, i5, j2, bundle2);
            }
        };
        ThreadUtils.invokeAtFrontUninterruptibly(handler, (Runnable) r3);
    }
}
