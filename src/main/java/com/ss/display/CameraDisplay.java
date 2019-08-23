package com.ss.display;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.TextUtils;
import com.bef.effectsdk.b;
import com.ss.camera.AbsIESCameraProxy;
import com.ss.camera.CameraListener;
import com.ss.camera.CameraParams;
import com.ss.camera.IESCamera2Proxy;
import com.ss.camera.IESCameraProxy;
import com.ss.common.IESEGLContextFactory;
import com.ss.common.TCState;
import com.ss.model.BeautyBean;
import com.ss.model.ComposerNodes;
import com.ss.model.EffectBean;
import com.ss.model.FilterBean;
import com.ss.model.ReshapeFaceBean;
import com.ss.render.EffectCallback;
import com.ss.render.EffectRender;
import com.ss.render.PreRender;
import com.ss.utils.Accelerometer;
import com.ss.utils.LogUtils;
import com.ss.utils.OpenGLUtils;
import java.util.Map;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public class CameraDisplay implements GLSurfaceView.Renderer {
    public String TAG;
    private boolean bFirstFrame;
    CameraListener cameraListener;
    private AssetManager mASSManager;
    private Accelerometer mAccelerometer;
    public boolean mCameraChanging;
    private int mCameraID;
    private CameraParams mCameraParams;
    public AbsIESCameraProxy mCameraProxy;
    private boolean mChange;
    private Context mContext;
    private BeautyBean mCurBeautyBean;
    private ComposerNodes mCurComposer;
    private EffectBean mCurEffectBean;
    private FilterBean mCurFilterBean;
    private ReshapeFaceBean mCurReshapeFaceBean;
    private String mDeviceName;
    private IESEGLContextFactory.IESEGLContextStateListener mEGLContextStateListener;
    private EffectCallback mEffectCallback;
    public EffectRender mEffectRender;
    public EGLContext mEglContext;
    private IESEGLContextFactory mEglContextFactory;
    private FpsChangeListener mFpsListener;
    private FrameListener mFrameListener;
    public GLSurfaceView mGlSurfaceView;
    public boolean mIsOpenSuccess;
    public volatile boolean mIsPaused;
    private boolean mIsUseResourceFinder;
    private int mMaxFps;
    private int mMinFps;
    private String mModelPath;
    private boolean mNeedFaceAttribute;
    public boolean mNeedFlipHorizontal;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    public PreRender mPreRender;
    private int mPreviewFormat;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mSetPreviewHeight;
    private int mSetPreviewWidth;
    private long mStartTime;
    private TCState.StateListener mStateListener;
    private int mSurfaceHeight;
    public SurfaceTexture mSurfaceTexture;
    private int mSurfaceWidth;
    private int mTextureId;
    private int[] mTextureOutId;
    private long mTimeStamp;

    public interface FpsChangeListener {
        void onFpsChanged(int i);
    }

    public interface FrameListener {
        void onFrameAvailable(EGLContext eGLContext, int i, int i2, int i3, int i4, long j);
    }

    public FrameListener getFrameListener() {
        return this.mFrameListener;
    }

    public TCState.StateListener getStateListener() {
        return this.mStateListener;
    }

    public boolean isFilpHorizontal() {
        return this.mNeedFlipHorizontal;
    }

    public void deleteInternalTextures() {
        if (this.mTextureOutId != null) {
            GLES20.glDeleteTextures(1, this.mTextureOutId, 0);
            this.mTextureOutId = null;
        }
    }

    private void deleteCameraPreviewTexture() {
        if (this.mTextureId != -1) {
            GLES20.glDeleteTextures(1, new int[]{this.mTextureId}, 0);
        }
        this.mTextureId = -1;
    }

    public void onDestroy() {
        this.mTextureId = -1;
        this.mEffectRender = null;
        this.mPreRender = null;
        this.mFrameListener = null;
        this.mFpsListener = null;
        this.mStateListener = null;
        this.mCameraProxy = null;
    }

    private EffectRender.Rotation getRenderRotation() {
        int direction = this.mAccelerometer.getDirection();
        EffectRender.Rotation rotation = EffectRender.Rotation.CLOCKWISE_ROTATE_0;
        if (direction == 0) {
            return EffectRender.Rotation.CLOCKWISE_ROTATE_0;
        }
        if (direction == 90) {
            return EffectRender.Rotation.CLOCKWISE_ROTATE_90;
        }
        if (direction == 180) {
            return EffectRender.Rotation.CLOCKWISE_ROTATE_180;
        }
        if (direction != 270) {
            return rotation;
        }
        return EffectRender.Rotation.CLOCKWISE_ROTATE_270;
    }

    private void openCamera() {
        if (this.mCameraProxy == null) {
            init(this.mCameraParams);
        }
        if (this.mCameraProxy.getCamera() == null || !this.mIsOpenSuccess) {
            if (this.mCameraProxy.getNumberOfCameras() == 1) {
                this.mCameraID = 0;
            }
            this.mCameraProxy.openCamera(this.mCameraID, this.cameraListener);
        }
    }

    private boolean setPreviewSize() {
        int[] iArr = (int[]) this.mCameraProxy.getBestMatchCameraPreviewSize().get(0);
        this.mPreviewWidth = iArr[0];
        this.mPreviewHeight = iArr[1];
        this.mSetPreviewHeight = this.mPreviewHeight;
        this.mSetPreviewWidth = this.mPreviewWidth;
        this.mCameraProxy.setPreviewSize(this.mPreviewHeight, this.mPreviewWidth);
        return true;
    }

    public void onPause() {
        LogUtils.i(this.TAG, "onPause", new Object[0]);
        this.mIsPaused = true;
        this.mCameraProxy.releaseCamera();
        this.mIsOpenSuccess = false;
        LogUtils.d(this.TAG, "Release camera", new Object[0]);
        this.mGlSurfaceView.queueEvent(new Runnable() {
            public void run() {
                CameraDisplay.this.deleteInternalTextures();
                if (CameraDisplay.this.mPreRender != null) {
                    CameraDisplay.this.mPreRender.destroy();
                    CameraDisplay.this.mPreRender = null;
                }
                if (CameraDisplay.this.mEffectRender != null) {
                    CameraDisplay.this.mEffectRender.release();
                }
            }
        });
        this.mGlSurfaceView.onPause();
    }

    public void onResume() {
        LogUtils.i(this.TAG, "onResume", new Object[0]);
        this.mIsPaused = false;
        openCamera();
        this.mGlSurfaceView.forceLayout();
        this.mGlSurfaceView.requestRender();
        if (this.mSurfaceTexture != null && this.mIsOpenSuccess) {
            this.mCameraProxy.startPreview(this.mSurfaceTexture);
        }
        this.mGlSurfaceView.onResume();
    }

    public void setUpCamera() {
        setPreviewSize();
        this.mNeedFlipHorizontal = this.mCameraProxy.isFlipHorizontal();
        this.bFirstFrame = true;
        if (this.mSurfaceTexture != null) {
            this.mCameraProxy.startPreview(this.mSurfaceTexture);
            if (this.mPreRender != null) {
                this.mPreRender.adjustTextureBuffer(this.mCameraProxy.getOrientation(), this.mNeedFlipHorizontal);
            }
        }
    }

    public int changeCamera() {
        if (Camera.getNumberOfCameras() == 1 || this.mCameraChanging) {
            return -501;
        }
        this.mCameraID = 1 - this.mCameraID;
        this.mCameraChanging = true;
        if (this.mCameraProxy instanceof IESCamera2Proxy) {
            this.mCameraProxy.changeCamera(this.mCameraID, new CameraListener() {
                public void onOpenFail(int i) {
                }

                public void onOpenSuccess(int i) {
                    CameraDisplay.this.mGlSurfaceView.queueEvent(new Runnable() {
                        public void run() {
                            CameraDisplay.this.deleteInternalTextures();
                            CameraDisplay.this.setUpCamera();
                            CameraDisplay.this.mCameraChanging = false;
                        }
                    });
                    CameraDisplay.this.mGlSurfaceView.requestRender();
                }
            });
        } else {
            this.mCameraProxy.changeCamera(this.mCameraID, null);
            this.mGlSurfaceView.queueEvent(new Runnable() {
                public void run() {
                    if (CameraDisplay.this.mCameraProxy == null || CameraDisplay.this.mCameraProxy.getCamera() == null || CameraDisplay.this.mIsPaused) {
                        CameraDisplay.this.mCameraChanging = false;
                        return;
                    }
                    CameraDisplay.this.deleteInternalTextures();
                    CameraDisplay.this.setUpCamera();
                    CameraDisplay.this.mCameraChanging = false;
                }
            });
            this.mGlSurfaceView.requestRender();
        }
        return 0;
    }

    private void initEffectRender() {
        if (this.mEffectRender != null) {
            int init = this.mEffectRender.init(this.mModelPath, this.mDeviceName, this.mPreviewWidth, this.mPreviewHeight, this.mChange, this.mASSManager, this.mIsUseResourceFinder);
            if (init < 0) {
                String str = this.TAG;
                LogUtils.e(str, "init effect fail res: " + init + ",modelPath: " + this.mModelPath + ",preview width: " + this.mPreviewWidth + " height:" + this.mPreviewHeight, new Object[0]);
                pushError(TCState.TCStateType.EffectInitFail, init, "mEffect init failed");
                return;
            }
            if (this.mCurEffectBean.isCustom()) {
                setCustomEffect(this.mCurEffectBean.getRenderCacheKey(), this.mCurEffectBean.getResPath(), this.mCurEffectBean.isWithoutFace());
            } else {
                setEffect(this.mCurEffectBean.getResPath(), this.mCurEffectBean.isWithoutFace());
            }
            if (this.mCurFilterBean.getLeftResPath().equals(this.mCurFilterBean.getRightResPath())) {
                setFilter(this.mCurFilterBean.getLeftResPath(), this.mCurFilterBean.getIntensity());
            } else {
                setFilter(this.mCurFilterBean.getLeftResPath(), this.mCurFilterBean.getRightResPath(), this.mCurFilterBean.getPosition());
            }
            setBeautify(this.mCurBeautyBean.getResPath(), this.mCurBeautyBean.getSmoothIntensity(), this.mCurBeautyBean.getWhiteIntensity(), this.mCurBeautyBean.getSharpIntensity());
            setReshape(this.mCurReshapeFaceBean.getResPath(), this.mCurReshapeFaceBean.getEyeIntensity(), this.mCurReshapeFaceBean.getCheekIntensity());
            this.mEffectRender.composerSetNodes(this.mCurComposer.getComposerNodesPaths(), this.mCurComposer.getComposerNodesNum());
            for (Map.Entry value : this.mCurComposer.getComposerNodes().entrySet()) {
                ComposerNodes.ComposerNode composerNode = (ComposerNodes.ComposerNode) value.getValue();
                this.mEffectRender.composerUpdateNode(composerNode.nodePath, composerNode.nodeTag, composerNode.nodeValue);
            }
        }
    }

    public void setFaceAttribute(boolean z) {
        this.mNeedFaceAttribute = z;
    }

    public void setFpsChangeListener(FpsChangeListener fpsChangeListener) {
        this.mFpsListener = fpsChangeListener;
    }

    public void setStateListener(TCState.StateListener stateListener) {
        this.mStateListener = stateListener;
    }

    public void setEffect(String str) {
        setEffect(str, false);
    }

    public void setFrameListener(FrameListener frameListener) {
        synchronized (this) {
            this.mFrameListener = frameListener;
        }
    }

    public boolean forceDetectFace(boolean z) {
        if (this.mEffectRender == null) {
            return false;
        }
        this.mEffectRender.setForceDetectFace(z);
        return true;
    }

    public boolean setDetectFaceResultListener(EffectRender.OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.mEffectRender == null) {
            return false;
        }
        this.mEffectRender.setOnRefreshFaceDataListener(onRefreshFaceDataListener);
        return true;
    }

    public int setMaxMemCache(int i) {
        if (this.mEffectRender != null) {
            return this.mEffectRender.setMaxMemCache(i);
        }
        return -105;
    }

    public void setFilpHorizontalState(boolean z) {
        if (z != this.mNeedFlipHorizontal) {
            this.mNeedFlipHorizontal = z;
            this.mGlSurfaceView.post(new Runnable() {
                public void run() {
                    if (CameraDisplay.this.mPreRender != null) {
                        CameraDisplay.this.mPreRender.adjustTextureBuffer(CameraDisplay.this.mCameraProxy.getOrientation(), CameraDisplay.this.mNeedFlipHorizontal);
                    }
                }
            });
        }
    }

    public void init(CameraParams cameraParams) {
        this.mCameraParams = cameraParams;
        if (Build.VERSION.SDK_INT > 27) {
            this.mCameraProxy = new IESCamera2Proxy();
            cameraParams.mType = 2;
        } else if (cameraParams.mType != 2 || Build.VERSION.SDK_INT < 21) {
            this.mCameraProxy = new IESCameraProxy();
            cameraParams.mType = 1;
        } else {
            this.mCameraProxy = new IESCamera2Proxy();
            cameraParams.mType = 2;
        }
        this.mCameraProxy.init(cameraParams);
    }

    public void onDrawFrame(GL10 gl10) {
        if (!this.mCameraChanging) {
            if (this.mCameraProxy.getCamera() == null) {
                pushError(TCState.TCStateType.CameraOpenFail, 0, "mCameraProxy.getCamera is null");
                return;
            }
            if (this.mTextureOutId == null) {
                this.mTextureOutId = new int[1];
                OpenGLUtils.initEffectTexture(this.mSetPreviewWidth, this.mSetPreviewHeight, this.mTextureOutId, 3553);
            }
            if (this.mPreRender == null) {
                this.mPreRender = new PreRender();
                this.mPreRender.init(this.mSetPreviewWidth, this.mSetPreviewHeight);
                this.mPreRender.calculatePreviewTextureBuffer(this.mSurfaceWidth, this.mSurfaceHeight, this.mSetPreviewWidth, this.mSetPreviewHeight);
                this.mPreRender.adjustTextureBuffer(this.mCameraProxy.getOrientation(), this.mNeedFlipHorizontal);
            }
            if (!TextUtils.isEmpty(this.mModelPath)) {
                initEffectRender();
            }
            if (this.mSurfaceTexture != null) {
                this.mSurfaceTexture.updateTexImage();
                if (this.bFirstFrame) {
                    this.bFirstFrame = false;
                    return;
                }
                this.mTimeStamp = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
                this.mStartTime = System.currentTimeMillis();
                if (this.mFpsListener != null) {
                    this.mFpsListener.onFpsChanged((int) currentTimeMillis);
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                int preProcess = this.mPreRender.preProcess(this.mTextureId);
                if (preProcess < 0) {
                    pushError(TCState.TCStateType.PreProcessFail, preProcess, "preProcess failed");
                }
                if (this.mEffectRender != null) {
                    int process = this.mEffectRender.process(preProcess, this.mTextureOutId[0], this.mSetPreviewWidth, this.mSetPreviewHeight, getRenderRotation(), (double) this.mTimeStamp);
                    if (process == 0) {
                        preProcess = this.mTextureOutId[0];
                    } else {
                        pushError(TCState.TCStateType.EffectProcessFail, process, "effect process failed");
                    }
                }
                int i = preProcess;
                GLES20.glViewport(0, 0, this.mSurfaceWidth, this.mSurfaceHeight);
                this.mPreRender.onDrawFrame(i);
                synchronized (this) {
                    if (this.mFrameListener != null) {
                        this.mFrameListener.onFrameAvailable(this.mEglContext, i, this.mPreviewFormat, this.mSetPreviewWidth, this.mSetPreviewHeight, this.mTimeStamp);
                    }
                }
            }
        }
    }

    public void setCustomEffect(String str, String str2) {
        setCustomEffect(str, str2, false);
    }

    public void setFpsRange(int i, int i2) {
        this.mMinFps = i;
        this.mMaxFps = i2;
    }

    private void adjustViewPort(int i, int i2) {
        this.mSurfaceHeight = i2;
        this.mSurfaceWidth = i;
        GLES20.glViewport(0, 0, this.mSurfaceWidth, this.mSurfaceHeight);
        if (this.mPreRender != null) {
            this.mPreRender.calculatePreviewTextureBuffer(this.mSurfaceWidth, this.mSurfaceHeight, this.mSetPreviewWidth, this.mSetPreviewHeight);
        }
    }

    public int setComposerSetNodes(String[] strArr, int i) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerNodes(strArr, i);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerSetNodes(strArr, i);
        }
        return -105;
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        LogUtils.i(this.TAG, "onSurfaceCreated", new Object[0]);
        if (!this.mIsPaused) {
            if (this.mTextureId == -1) {
                this.mTextureId = OpenGLUtils.getExternalOESTextureID();
                this.mSurfaceTexture = new SurfaceTexture(this.mTextureId);
                this.mSurfaceTexture.setOnFrameAvailableListener(this.mOnFrameAvailableListener);
            }
            openCamera();
            if (this.mCameraProxy.getCamera() != null) {
                setUpCamera();
            }
        }
    }

    public void setEffect(String str, boolean z) {
        String str2 = this.TAG;
        LogUtils.d(str2, "setEffect: " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
            z = false;
        }
        if (this.mCurEffectBean == null) {
            this.mCurEffectBean = new EffectBean(str, z);
        } else {
            this.mCurEffectBean.setResPath(str);
            this.mCurEffectBean.setRenderCacheKey(null);
            this.mCurEffectBean.setWithoutFace(z);
            this.mCurEffectBean.setCustom(false);
        }
        if (this.mEffectRender != null) {
            this.mEffectRender.setEffect(str, z);
        }
    }

    public int setFilter(String str, float f2) {
        String str2 = this.TAG;
        LogUtils.i(str2, "filter path: " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (this.mCurFilterBean == null) {
            this.mCurFilterBean = new FilterBean(str, f2);
        } else {
            this.mCurFilterBean.setLeftResPath(str);
            this.mCurFilterBean.setRightResPath(str);
            this.mCurFilterBean.setIntensity(f2);
            this.mCurFilterBean.setPosition(0.0f);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.setFilter(str, f2);
    }

    private void pushError(TCState.TCStateType tCStateType, int i, String str) {
        if (this.mStateListener != null) {
            this.mStateListener.onError(tCStateType, i, str);
        }
    }

    private void pushInfo(TCState.TCStateType tCStateType, int i, String str) {
        if (this.mStateListener != null) {
            this.mStateListener.onInfo(tCStateType, i, str);
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        LogUtils.i(this.TAG, "onSurfaceChanged", new Object[0]);
        if (!this.mIsPaused) {
            adjustViewPort(i, i2);
            this.mStartTime = System.currentTimeMillis();
        }
    }

    public int setComposerUpdateNode(String str, String str2, float f2) {
        if (this.mCurComposer != null) {
            this.mCurComposer.setComposerUpdateNodes(str, str2, f2);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.composerUpdateNode(str, str2, f2);
        }
        return -105;
    }

    public void setCustomEffect(String str, String str2, boolean z) {
        String str3 = this.TAG;
        LogUtils.d(str3, "setCustomEffect: " + str2, new Object[0]);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
            z = false;
        }
        if (this.mCurEffectBean == null) {
            this.mCurEffectBean = new EffectBean(str, str2, z);
        } else {
            this.mCurEffectBean.setResPath(str2);
            this.mCurEffectBean.setRenderCacheKey(str);
            this.mCurEffectBean.setWithoutFace(z);
            this.mCurEffectBean.setCustom(true);
        }
        if (this.mEffectRender != null) {
            this.mEffectRender.setCustomEffect(str, str2, z);
        }
    }

    public int setReshape(String str, float f2, float f3) {
        String str2 = this.TAG;
        LogUtils.i(str2, "setReshape " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            str = "";
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (this.mCurReshapeFaceBean == null) {
            this.mCurReshapeFaceBean = new ReshapeFaceBean(str, f2, f3);
        } else {
            this.mCurReshapeFaceBean.setResPath(str);
            this.mCurReshapeFaceBean.setEyeIntensity(f2);
            this.mCurReshapeFaceBean.setCheekIntensity(f3);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.setReshape(str, f2, f3);
    }

    public CameraDisplay(Context context, GLSurfaceView gLSurfaceView, boolean z) {
        this.TAG = "CameraDisplay";
        this.mTextureId = -1;
        this.mMinFps = 15;
        this.mMaxFps = 30;
        this.mOnFrameAvailableListener = new SurfaceTexture.OnFrameAvailableListener() {
            public void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (!CameraDisplay.this.mCameraChanging) {
                    CameraDisplay.this.mGlSurfaceView.requestRender();
                }
            }
        };
        this.mEGLContextStateListener = new IESEGLContextFactory.IESEGLContextStateListener() {
            public void onEGLContextDestroy() {
                CameraDisplay.this.mEglContext = null;
            }

            public void onEGLContextCreate(EGLContext eGLContext) {
                CameraDisplay.this.mEglContext = eGLContext;
                GLES20.glEnable(3024);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            }
        };
        this.mIsOpenSuccess = false;
        this.cameraListener = new CameraListener() {
            public void onOpenFail(int i) {
                CameraDisplay.this.mIsOpenSuccess = false;
            }

            public void onOpenSuccess(int i) {
                CameraDisplay.this.mIsOpenSuccess = true;
                if (CameraDisplay.this.mSurfaceTexture != null && CameraDisplay.this.mIsOpenSuccess) {
                    CameraDisplay.this.mCameraProxy.startPreview(CameraDisplay.this.mSurfaceTexture);
                }
            }
        };
        this.mContext = context;
        this.mGlSurfaceView = gLSurfaceView;
        if (z) {
            this.mCameraID = 1;
        } else {
            this.mCameraID = 0;
        }
        this.mIsPaused = false;
        this.mAccelerometer = new Accelerometer(context);
        gLSurfaceView.setEGLContextClientVersion(2);
        this.mEglContextFactory = new IESEGLContextFactory(2, this.mEGLContextStateListener);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextFactory(this.mEglContextFactory);
        gLSurfaceView.setRenderer(this);
        gLSurfaceView.setRenderMode(0);
        this.mModelPath = null;
        this.mEffectRender = new EffectRender();
        this.mCurBeautyBean = new BeautyBean();
        this.mCurEffectBean = new EffectBean();
        this.mCurFilterBean = new FilterBean();
        this.mCurReshapeFaceBean = new ReshapeFaceBean();
        this.mCurComposer = new ComposerNodes();
        this.mCameraParams = new CameraParams(1);
        this.mASSManager = null;
        this.mIsUseResourceFinder = false;
        this.mEffectCallback = null;
    }

    public int setFilter(String str, String str2, float f2) {
        String str3 = this.TAG;
        LogUtils.i(str3, "leftFilterName: " + str + "  rightFilterName: " + str2 + "position: " + f2, new Object[0]);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        if (this.mCurFilterBean == null) {
            this.mCurFilterBean = new FilterBean(str, str2, f2, 1.0f);
        } else {
            this.mCurFilterBean.setLeftResPath(str);
            this.mCurFilterBean.setRightResPath(str2);
            this.mCurFilterBean.setIntensity(1.0f);
            this.mCurFilterBean.setPosition(f2);
        }
        if (this.mEffectRender == null) {
            return -105;
        }
        return this.mEffectRender.switchFilter(str, str2, f2);
    }

    public void configEffect(String str, String str2, boolean z, boolean z2) {
        this.mModelPath = str;
        this.mDeviceName = str2;
        this.mChange = z2;
    }

    public CameraDisplay(Context context, GLSurfaceView gLSurfaceView, boolean z, CameraParams cameraParams) {
        this(context, gLSurfaceView, z, cameraParams.mHeight, cameraParams.mWidth);
        this.mCameraParams = cameraParams;
    }

    public int setBeautify(String str, float f2, float f3, float f4) {
        if (TextUtils.isEmpty(str)) {
            str = "";
            f2 = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        if (this.mCurBeautyBean == null) {
            this.mCurBeautyBean = new BeautyBean(str, f2, f3, f4);
        } else {
            this.mCurBeautyBean.setResPath(str);
            this.mCurBeautyBean.setSmoothIntensity(f2);
            this.mCurBeautyBean.setWhiteIntensity(f3);
            this.mCurBeautyBean.setSharpIntensity(f4);
        }
        if (this.mEffectRender != null) {
            return this.mEffectRender.setFaceBeauty(str, f2, f3, f4);
        }
        return -105;
    }

    public CameraDisplay(Context context, GLSurfaceView gLSurfaceView, boolean z, int i, int i2) {
        this(context, gLSurfaceView, z);
        this.mSetPreviewWidth = i;
        this.mSetPreviewHeight = i2;
    }

    public void configEffect(String str, String str2, boolean z, boolean z2, AssetManager assetManager) {
        configEffect(str, str2, z, z2);
        this.mASSManager = assetManager;
    }

    public void configEffect(String str, String str2, boolean z, boolean z2, AssetManager assetManager, b bVar) {
        configEffect(str, str2, z, z2, assetManager);
        if (bVar != null) {
            this.mIsUseResourceFinder = true;
            this.mEffectCallback = new EffectCallback();
            EffectCallback.setResourceFinder(bVar);
            return;
        }
        this.mIsUseResourceFinder = false;
    }
}
