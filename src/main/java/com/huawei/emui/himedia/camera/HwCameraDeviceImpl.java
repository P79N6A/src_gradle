package com.huawei.emui.himedia.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import com.huawei.android.sdk.camera.HwCameraCaptureResultEx;
import com.huawei.android.sdk.camera.HwCameraCharacteristicsEx;
import com.huawei.android.sdk.camera.HwCaptureRequestEx;
import com.huawei.emui.himedia.camera.HwCameraCaptureSession;
import com.huawei.emui.himedia.camera.HwCameraSuperSlowMotionCaptureSession;
import com.huawei.emui.himedia.camera.internal.Util;
import com.huawei.emui.himedia.utils.SystemUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicBoolean;

public class HwCameraDeviceImpl extends HwCameraDevice {
    static Surface mMideaCodecSurface = MediaCodec.createPersistentInputSurface();
    CameraCharacteristics mCameraCharacteristics = null;
    protected CameraDevice mCameraDevice;
    private CaptureRequest.Builder mCaptureBuilder = null;
    private List<CaptureRequest.Key<?>> mCaptureRequestKeyList = null;
    protected final AtomicBoolean mClosed = new AtomicBoolean();
    protected Context mContext;
    private MediaRecorder mMediaRecorder;
    private int mMode = 0;
    Surface mPreviewSurface = null;
    protected HwCameraCaptureSession mSessionNormal;
    protected HwCameraSuperSlowMotionCaptureSession mSessionReserve;
    private CaptureResult.Key mSuggestHintKey = null;
    List<String> mSupportedApertureValues = null;
    private String mVideoFilename;

    public int getMode() {
        return this.mMode;
    }

    public Surface getPreviewSurface() {
        return this.mPreviewSurface;
    }

    public Surface getRecordSurface() {
        return mMideaCodecSurface;
    }

    private boolean isBackCamera() {
        return getId().equals(Util.backId);
    }

    public void close() {
        if (!this.mClosed.getAndSet(true)) {
            this.mCameraDevice.close();
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            close();
            super.finalize();
        } finally {
            super.finalize();
        }
    }

    public String getId() {
        checkIfClosed();
        return this.mCameraDevice.getId();
    }

    private void cleanupEmptyFile() {
        if (this.mVideoFilename != null) {
            File file = new File(this.mVideoFilename);
            if (file.length() == 0 && file.delete()) {
                this.mVideoFilename = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void checkIfClosed() {
        if (this.mClosed.get()) {
            throw new IllegalStateException("Device was already closed");
        }
    }

    public void resetSuperSlowMotionMediaRecorder() {
        if (4 == getMode()) {
            if (this.mMediaRecorder != null) {
                cleanupEmptyFile();
                this.mMediaRecorder.reset();
            }
            this.mVideoFilename = null;
            return;
        }
        throw new IllegalStateException("reset Recorder can only be called in super slow motion mode.");
    }

    public void cleanSuperSlowMotionTag() throws RemoteException {
        if (this.mCaptureBuilder != null) {
            if (HwCamera.SDK_USAGE_FALG == 1) {
                this.mCaptureBuilder.set(HwCaptureRequestEx.HUAWEI_SUPER_SLOW_MOTION_MODE, (byte) 0);
                return;
            }
            this.mCaptureBuilder.set(getCaptureKeybyEngine(this.mCaptureBuilder.build(), 15), new byte[]{0});
        }
    }

    public void releaseSuperSlowMotionMediaRecorder() throws IOException {
        if (4 == getMode()) {
            if (this.mMediaRecorder != null) {
                cleanupEmptyFile();
                this.mMediaRecorder.release();
                this.mMediaRecorder = null;
            }
            this.mVideoFilename = null;
            return;
        }
        throw new IllegalStateException("release Recorder can only be called in super slow motion mode.");
    }

    public void stopRecordingSuperSlowMotion() {
        if (4 == getMode()) {
            if (HwCamera.SDK_USAGE_FALG == 1 || SystemUtils.getEngineVersionCode() <= 90000102) {
                this.mCaptureBuilder.set(HwCaptureRequestEx.HUAWEI_VIDEO_STATUS, (byte) 0);
            } else {
                setKeyByEngine(this.mCaptureBuilder, this.mCaptureBuilder.build(), 28, new byte[]{0});
            }
            this.mCaptureBuilder.removeTarget(mMideaCodecSurface);
            this.mMediaRecorder.stop();
            return;
        }
        throw new IllegalStateException("stop MediaRecorder can only be called in super slow motion mode.");
    }

    public void setCharacteristics(CameraCharacteristics cameraCharacteristics) {
        this.mCameraCharacteristics = cameraCharacteristics;
    }

    public void setMode(int i) {
        this.mMode = i;
    }

    HwCameraDeviceImpl(CameraDevice cameraDevice) {
        this.mCameraDevice = cameraDevice;
    }

    protected static Handler checkHandler(Handler handler) {
        if (handler != null) {
            return handler;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        throw new IllegalArgumentException("No handler given, and current thread has no looper!");
    }

    private int getApertureLevel(int i) {
        if (this.mSupportedApertureValues == null) {
            setSupportedApertureValues(getId());
        }
        if (this.mSupportedApertureValues == null) {
            return 0;
        }
        if (i >= this.mSupportedApertureValues.size()) {
            i = this.mSupportedApertureValues.size() - 1;
        }
        return Math.round(Float.parseFloat(this.mSupportedApertureValues.get(i)));
    }

    private void setUpCaptureRequestBuilderForBodyBeautyMode(CaptureRequest.Builder builder) throws RemoteException {
        setMode(7);
        long currentTimeMillis = System.currentTimeMillis();
        if (HwCamera.SDK_USAGE_FALG == 2) {
            setKeyByEngine(builder, builder.build(), 31, new byte[]{1});
            HwCameraEngineUtils.reportFunc("enableBodyBeautyMode", "beautyBody", 1, "", System.currentTimeMillis() - currentTimeMillis);
        }
    }

    private void setUpCaptureRequestBuilderForSmartMode(CaptureRequest.Builder builder) throws RemoteException {
        setMode(3);
        CaptureRequest build = builder.build();
        setKeyByEngine(builder, build, 19, new byte[]{1});
        setKeyByEngine(builder, build, 20, new byte[]{1});
        setKeyByEngine(builder, build, 21, new byte[]{1});
        setKeyByEngine(builder, build, 4, new byte[]{3});
        setKeyByEngine(builder, build, 9, new byte[]{1});
    }

    private void setUpCaptureRequestBuilderForSmartModeUsingSDK(CaptureRequest.Builder builder) throws RemoteException {
        setMode(3);
        builder.set(HwCaptureRequestEx.HUAWEI_CAMERA_FLAG, (byte) 1);
        builder.set(HwCaptureRequestEx.HUAWEI_SMART_CAPTURE_ENABLE, (byte) 1);
        builder.set(HwCaptureRequestEx.HAUWEI_SMART_SUGGEST_ENABLE, (byte) 1);
        builder.set(HwCaptureRequestEx.HAUWEI_MASTER_AI_ENABLE, (byte) 1);
        builder.set(HwCaptureRequestEx.HUAWEI_DUAL_SENSOR_MODE, (byte) 3);
    }

    public void resetSuperNightParams(CaptureRequest.Builder builder) throws RemoteException {
        if (1 != getMode()) {
            throw new IllegalStateException("resetSuperNightParams can only be called in super night mode.");
        } else if (HwCamera.SDK_USAGE_FALG == 1) {
            builder.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_RELAYOUT_MODE, (byte) 0);
            builder.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_TRYAE, (byte) 0);
        } else {
            CaptureRequest build = builder.build();
            setKeyByEngine(builder, build, 23, new byte[]{0});
            setKeyByEngine(builder, build, 25, new byte[]{0});
        }
    }

    /* access modifiers changed from: package-private */
    public void setDefaultParameters(CaptureRequest.Builder builder) throws RemoteException {
        if (HwCamera.SDK_USAGE_FALG == 1) {
            builder.set(HwCaptureRequestEx.HUAWEI_SUPER_SLOW_MOTION_MODE, (byte) 0);
            return;
        }
        builder.set(getCaptureKeybyEngine(builder.build(), 15), new byte[]{0});
    }

    private void setSupportedApertureValues(String str) {
        if (HwCamera.SDK_USAGE_FALG == 1) {
            byte[] bArr = (byte[]) this.mCameraCharacteristics.get(HwCameraCharacteristicsEx.HUAWEI_APERTURE_VALUE_SUPPORTED);
            if (bArr != null && bArr.length != 0) {
                if (bArr[bArr.length - 1] == 0) {
                    byte[] bArr2 = new byte[(bArr.length - 1)];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
                    bArr = bArr2;
                }
                try {
                    this.mSupportedApertureValues = split(new String(bArr, "UTF-8"), ",");
                } catch (UnsupportedEncodingException unused) {
                }
            }
        } else if (HwCameraEngineUtils.mICamera != null) {
            try {
                byte[] supportApertureValue = HwCameraEngineUtils.mICamera.getSupportApertureValue(str);
                if (supportApertureValue != null) {
                    if (supportApertureValue.length != 0) {
                        if (supportApertureValue[supportApertureValue.length - 1] == 0) {
                            byte[] bArr3 = new byte[(supportApertureValue.length - 1)];
                            System.arraycopy(supportApertureValue, 0, bArr3, 0, bArr3.length);
                            supportApertureValue = bArr3;
                        }
                        this.mSupportedApertureValues = split(new String(supportApertureValue, "UTF-8"), ",");
                    }
                }
            } catch (UnsupportedEncodingException unused2) {
            } catch (RemoteException unused3) {
            }
        }
    }

    private void setUpCaptureRequestBuilderForApertureMode(CaptureRequest.Builder builder) throws RemoteException {
        int i;
        setMode(2);
        CaptureRequest build = builder.build();
        setKeyByEngine(builder, build, 16, new byte[]{1});
        setSupportedApertureValues(getId());
        if (this.mSupportedApertureValues == null) {
            i = 0;
        } else {
            i = this.mSupportedApertureValues.size() / 2;
        }
        setKeyByEngine(builder, build, 17, new int[]{i});
        setKeyByEngine(builder, build, 3, new int[]{19});
        setKeyByEngine(builder, build, 4, new byte[]{3});
        setKeyByEngine(builder, build, 5, new byte[]{0});
        setKeyByEngine(builder, build, 9, new byte[]{1});
    }

    private void setUpCaptureRequestBuilderForApertureModeUsingSDK(CaptureRequest.Builder builder) throws RemoteException {
        int i;
        setMode(2);
        builder.set(HwCaptureRequestEx.HUAWEI_APERTURE_MODE, (byte) 1);
        setSupportedApertureValues(getId());
        if (this.mSupportedApertureValues == null) {
            i = 0;
        } else {
            i = this.mSupportedApertureValues.size() / 2;
        }
        builder.set(HwCaptureRequestEx.HUAWEI_APERTURE_VALUE, Integer.valueOf(i));
        builder.set(HwCaptureRequestEx.HUAWEI_CAMERA_FLAG, (byte) 1);
        builder.set(HwCaptureRequestEx.HAUWEI_CAMERA_SCENE_MODE, 19);
        builder.set(HwCaptureRequestEx.HUAWEI_DUAL_SENSOR_MODE, (byte) 3);
        builder.set(HwCaptureRequestEx.HUAWEI_MONO_MODE, (byte) 0);
    }

    private void setUpCaptureRequestBuilderForDefaultMode(CaptureRequest.Builder builder) throws RemoteException {
        setMode(0);
        CaptureRequest build = builder.build();
        setKeyByEngine(builder, build, 16, new byte[]{0});
        setKeyByEngine(builder, build, 2, new byte[]{19});
        setKeyByEngine(builder, build, 19, new byte[]{0});
        setKeyByEngine(builder, build, 20, new byte[]{0});
        setKeyByEngine(builder, build, 21, new byte[]{0});
        setKeyByEngine(builder, build, 4, new byte[]{0});
        setKeyByEngine(builder, build, 18, new byte[]{0});
    }

    private void setUpCaptureRequestBuilderForSuperSlowMotion(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        int i = 0;
        for (Range range : ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getHighSpeedVideoFpsRanges()) {
            if (((Integer) range.getUpper()).intValue() > i) {
                i = ((Integer) range.getUpper()).intValue();
            }
        }
        if (i != 0) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(i), Integer.valueOf(i)));
            builder.set(HwCaptureRequestEx.HUAWEI_SUPER_SLOW_MOTION_MODE, (byte) 1);
            return;
        }
        throw new UnsupportedOperationException("Device donot support Super Slow Motion.");
    }

    private void setUpCaptureRequestBuilderForSuperSlowMotionbyEngine(CaptureRequest.Builder builder) throws RemoteException {
        CaptureRequest build = builder.build();
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        int i = 0;
        for (Range range : ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getHighSpeedVideoFpsRanges()) {
            if (((Integer) range.getUpper()).intValue() > i) {
                i = ((Integer) range.getUpper()).intValue();
            }
        }
        if (i != 0) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(i), Integer.valueOf(i)));
            setKeyByEngine(builder, build, 15, new byte[]{1});
            return;
        }
        throw new UnsupportedOperationException("Device donot support Super Slow Motion.");
    }

    public Byte getExposureModePreviewState(CaptureResult captureResult) {
        CaptureResult.Key key;
        if (HwCamera.SDK_USAGE_FALG != 2) {
            return (Byte) captureResult.get(HwCameraCaptureResultEx.HUAWEI_EXPOSURE_MODE_PREVIEW_STATE);
        }
        String captureResultKeyName = HwCameraEngineUtils.getCaptureResultKeyName(3);
        if (captureResultKeyName == null) {
            return null;
        }
        Iterator<CaptureResult.Key<?>> it2 = captureResult.getKeys().iterator();
        while (true) {
            if (!it2.hasNext()) {
                key = null;
                break;
            }
            key = it2.next();
            if (key.getName().equals(captureResultKeyName)) {
                break;
            }
        }
        if (key == null) {
            return null;
        }
        byte[] bArr = (byte[]) captureResult.get(key);
        if (bArr == null) {
            return null;
        }
        return Byte.valueOf(bArr[0]);
    }

    public Integer getLightPaintingExposureTime(TotalCaptureResult totalCaptureResult) throws RemoteException {
        Integer num;
        CaptureResult.Key key;
        if (1 == getMode()) {
            if (HwCamera.SDK_USAGE_FALG == 1) {
                num = (Integer) totalCaptureResult.get(HwCameraCaptureResultEx.HUAWEI_LIGHT_PAINTING_EXPOSURE_TIME);
                if (num == null) {
                    return null;
                }
            } else {
                String captureResultKeyName = HwCameraEngineUtils.mICamera.getCaptureResultKeyName(4);
                if (captureResultKeyName == null) {
                    return null;
                }
                Iterator it2 = totalCaptureResult.getKeys().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        key = null;
                        break;
                    }
                    key = (CaptureResult.Key) it2.next();
                    if (key.getName().equals(captureResultKeyName)) {
                        break;
                    }
                }
                if (key == null) {
                    return null;
                }
                int[] iArr = (int[]) totalCaptureResult.get(key);
                if (iArr == null) {
                    return null;
                }
                num = Integer.valueOf(iArr[0]);
            }
            return num;
        }
        throw new IllegalStateException("getLightPaintingExposureTime can only be called in super night mode.");
    }

    public Integer getSceneResult(CaptureResult captureResult) throws RemoteException {
        String str;
        System.currentTimeMillis();
        if (HwCamera.SDK_USAGE_FALG == 2) {
            Integer num = null;
            if (this.mSuggestHintKey == null) {
                try {
                    str = HwCameraEngineUtils.mICamera.getCaptureResultKeyName(2);
                } catch (RemoteException unused) {
                    str = null;
                }
                if (str == null) {
                    return null;
                }
                for (CaptureResult.Key next : captureResult.getKeys()) {
                    if (next.getName().equals(str)) {
                        this.mSuggestHintKey = next;
                    }
                }
            }
            if (this.mSuggestHintKey == null) {
                return null;
            }
            int[] iArr = (int[]) captureResult.get(this.mSuggestHintKey);
            if (iArr != null) {
                num = Integer.valueOf(iArr[0]);
            }
            if (num != null) {
                num = Integer.valueOf(num.intValue() & 255);
            }
            return num;
        }
        Integer num2 = (Integer) captureResult.get(HwCameraCaptureResultEx.HAUWEI_SMART_SUGGEST_HINT);
        if (num2 != null) {
            num2 = Integer.valueOf(num2.intValue() & 255);
        }
        return num2;
    }

    public CaptureRequest.Builder createCaptureRequest(int i) throws CameraAccessException, RemoteException {
        checkIfClosed();
        long currentTimeMillis = System.currentTimeMillis();
        CaptureRequest.Builder createCaptureRequest = this.mCameraDevice.createCaptureRequest(i);
        switch (this.mMode) {
            case 1:
                if (HwCamera.SDK_USAGE_FALG != 1) {
                    setKeyByEngine(createCaptureRequest, createCaptureRequest.build(), 22, new byte[]{1});
                    setKeyByEngine(createCaptureRequest, createCaptureRequest.build(), 9, new byte[]{1});
                    break;
                } else {
                    createCaptureRequest.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_MODE, (byte) 1);
                    createCaptureRequest.set(HwCaptureRequestEx.HUAWEI_CAMERA_FLAG, (byte) 1);
                    break;
                }
            case 2:
                if (HwCamera.SDK_USAGE_FALG != 2) {
                    setUpCaptureRequestBuilderForApertureModeUsingSDK(createCaptureRequest);
                    break;
                } else {
                    setUpCaptureRequestBuilderForApertureMode(createCaptureRequest);
                    HwCameraEngineUtils.reportFunc("createCaptureRequest", 1, "", System.currentTimeMillis() - currentTimeMillis);
                    break;
                }
            case 3:
                if (HwCamera.SDK_USAGE_FALG != 2) {
                    setUpCaptureRequestBuilderForSmartModeUsingSDK(createCaptureRequest);
                    break;
                } else {
                    setUpCaptureRequestBuilderForSmartMode(createCaptureRequest);
                    HwCameraEngineUtils.reportFunc("createCaptureRequest", 1, "", System.currentTimeMillis() - currentTimeMillis);
                    break;
                }
            case 4:
                if (HwCamera.SDK_USAGE_FALG != 1) {
                    setUpCaptureRequestBuilderForSuperSlowMotionbyEngine(createCaptureRequest);
                    break;
                } else {
                    setUpCaptureRequestBuilderForSuperSlowMotion(createCaptureRequest);
                    break;
                }
            case 5:
                createCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                if (HwCamera.SDK_USAGE_FALG != 1) {
                    setKeyByEngine(createCaptureRequest, createCaptureRequest.build(), 1, new int[]{60});
                    HwCameraEngineUtils.reportFunc("createCaptureRequest", 1, "", System.currentTimeMillis() - currentTimeMillis);
                    break;
                } else {
                    createCaptureRequest.set(HwCaptureRequestEx.HUAWEI_HIGH_VIDEO_FPS, 60);
                    break;
                }
            case 6:
                if (HwCamera.SDK_USAGE_FALG == 2) {
                    HwCameraEngineUtils.reportFunc("createCaptureRequest", 1, "", System.currentTimeMillis() - currentTimeMillis);
                    break;
                }
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                setUpCaptureRequestBuilderForBodyBeautyMode(createCaptureRequest);
                break;
        }
        this.mCaptureBuilder = createCaptureRequest;
        return createCaptureRequest;
    }

    private CaptureRequest.Key getCaptureKeybyEngine(CaptureRequest captureRequest, int i) throws RemoteException {
        if (HwCameraEngineUtils.mICamera == null) {
            return null;
        }
        int captureRequestKeyIndex = HwCameraEngineUtils.mICamera.getCaptureRequestKeyIndex(captureRequest, i);
        if (this.mCaptureRequestKeyList == null) {
            this.mCaptureRequestKeyList = captureRequest.getKeys();
        }
        return this.mCaptureRequestKeyList.get(captureRequestKeyIndex);
    }

    private List<String> split(String str, String str2) {
        if (str == null) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreElements()) {
            arrayList.add(stringTokenizer.nextToken());
        }
        return arrayList;
    }

    public void confirmSuggestMode(CaptureRequest.Builder builder, int i) throws RemoteException {
        if (HwCamera.SDK_USAGE_FALG == 1) {
            builder.set(HwCaptureRequestEx.HAUWEI_MASTER_AI_ENTER_MODE, Integer.valueOf(i));
            return;
        }
        setKeyByEngine(builder, builder.build(), 29, new int[]{i});
    }

    public void disMissSuggestMode(CaptureRequest.Builder builder, int i) throws RemoteException {
        if (HwCamera.SDK_USAGE_FALG == 1) {
            builder.set(HwCaptureRequestEx.HAUWEI_SMART_SUGGEST_DISMISS, Integer.valueOf(i));
            return;
        }
        setKeyByEngine(builder, builder.build(), 30, new int[]{i});
    }

    HwCameraDeviceImpl(CameraDevice cameraDevice, Context context) {
        this.mContext = context;
        this.mCameraDevice = cameraDevice;
    }

    public Size getOptimalPreviewSize(int i, int i2) {
        Size optimalPreviewSize = HwCamera.getOptimalPreviewSize(Arrays.asList(((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceHolder.class)), i, i2, this.mMode, false);
        if (this.mMode == 6) {
            return new Size(1920, 1080);
        }
        return optimalPreviewSize;
    }

    public boolean setApertureLevel(CaptureRequest.Builder builder, int i) {
        if (builder == null) {
            return false;
        }
        CaptureRequest build = builder.build();
        int apertureLevel = getApertureLevel(i);
        if (HwCamera.SDK_USAGE_FALG == 2) {
            setKeyByEngine(builder, build, 17, new int[]{apertureLevel});
        } else {
            builder.set(HwCaptureRequestEx.HUAWEI_APERTURE_VALUE, Integer.valueOf(apertureLevel));
        }
        return true;
    }

    public void setBodyBeautyLevel(CaptureRequest.Builder builder, byte b2) {
        if (getMode() != 0 && getMode() != 7) {
            throw new UnsupportedOperationException("this method can only be called in default mode or beautybody mode");
        } else if (HwCamera.SDK_USAGE_FALG == 2) {
            setKeyByEngine(builder, builder.build(), 32, new byte[]{b2});
        }
    }

    public void enableBodyBeautyMode(CaptureRequest.Builder builder, boolean z) throws RemoteException {
        byte b2;
        boolean z2 = z;
        long currentTimeMillis = System.currentTimeMillis();
        if (getMode() == 0 || getMode() == 7) {
            if (z2) {
                b2 = 1;
            } else {
                b2 = 0;
            }
            if (HwCamera.SDK_USAGE_FALG == 2) {
                setKeyByEngine(builder, builder.build(), 31, new byte[]{b2});
                if (z2) {
                    HwCameraEngineUtils.reportFunc("enableBodyBeautyMode", "beautyBody", 1, "", System.currentTimeMillis() - currentTimeMillis);
                    return;
                }
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("this method can only be called in default mode or beautybody mode");
    }

    private void setUpCaptureRequestBuilderForSuperSlowMotion(CaptureRequest.Builder builder, int i) throws RemoteException {
        builder.set(CaptureRequest.CONTROL_MODE, 1);
        int i2 = 0;
        for (Range range : ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getHighSpeedVideoFpsRanges()) {
            if (((Integer) range.getUpper()).intValue() > i2) {
                i2 = ((Integer) range.getUpper()).intValue();
            }
        }
        if (i2 != 0) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(i2), Integer.valueOf(i2)));
            if (i == 1) {
                builder.set(HwCaptureRequestEx.HUAWEI_SUPER_SLOW_MOTION_MODE, (byte) 1);
                return;
            }
            builder.set(getCaptureKeybyEngine(builder.build(), 15), new byte[]{1});
            return;
        }
        throw new UnsupportedOperationException("Device donot support Super Slow Motion.");
    }

    public void startRecordingSuperSlowMotion(HwCameraSuperSlowMotionCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (4 == getMode()) {
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            if (HwCamera.SDK_USAGE_FALG == 1 || SystemUtils.getEngineVersionCode() <= 90000102) {
                this.mCaptureBuilder.set(HwCaptureRequestEx.HUAWEI_VIDEO_STATUS, (byte) 1);
            } else {
                setKeyByEngine(this.mCaptureBuilder, this.mCaptureBuilder.build(), 28, new byte[]{1});
            }
            Surface recordSurface = getRecordSurface();
            Surface previewSurface = getPreviewSurface();
            if (recordSurface == null || previewSurface == null) {
                throw new NullPointerException("record surface null!");
            }
            this.mCaptureBuilder.addTarget(recordSurface);
            arrayList.add(this.mCaptureBuilder.build());
            this.mCaptureBuilder.removeTarget(previewSurface);
            arrayList.add(this.mCaptureBuilder.build());
            this.mSessionReserve.setRepeatingBurst(arrayList, captureCallback, handler);
            this.mMediaRecorder.start();
            if (HwCamera.SDK_USAGE_FALG == 2) {
                HwCameraEngineUtils.reportFunc("startRecordingSuperSlowMotion", 1, "", System.currentTimeMillis() - currentTimeMillis);
                return;
            }
            return;
        }
        throw new IllegalStateException("start Recording can only be called in super slow motion mode.");
    }

    public void createCaptureSession(List<Surface> list, final HwCameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        checkIfClosed();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("outputs must be a non-null, non-empty list");
        } else if (stateCallback != null) {
            Handler checkHandler = checkHandler(handler);
            this.mCameraDevice.createCaptureSession(list, new CameraCaptureSession.StateCallback() {
                HwCameraCaptureSession mSession;

                public void onActive(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onActive(this.mSession);
                }

                public void onClosed(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onClosed(this.mSession);
                }

                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onConfigureFailed(this.mSession);
                }

                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onConfigured(this.mSession);
                }

                public void onReady(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onReady(this.mSession);
                }

                public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                    if (this.mSession == null) {
                        HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                        HwCameraCaptureSession createImpl = HwCameraCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                        hwCameraDeviceImpl.mSessionNormal = createImpl;
                        this.mSession = createImpl;
                    }
                    stateCallback.onSurfacePrepared(this.mSession, surface);
                }
            }, checkHandler);
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void createConstrainedHighSpeedCaptureSession(List<Surface> list, final HwCameraCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        checkIfClosed();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("outputs must be a non-null, non-empty list");
        } else if (stateCallback != null) {
            Handler checkHandler = checkHandler(handler);
            this.mCameraDevice.createConstrainedHighSpeedCaptureSession(list, new CameraCaptureSession.StateCallback() {
                HwCameraConstrainedHighSpeedCaptureSession mSession;

                public void onActive(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onActive(this.mSession);
                }

                public void onClosed(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onClosed(this.mSession);
                }

                public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onConfigureFailed(this.mSession);
                }

                public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onConfigured(this.mSession);
                }

                public void onReady(CameraCaptureSession cameraCaptureSession) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onReady(this.mSession);
                }

                public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                    if (this.mSession == null) {
                        this.mSession = HwCameraConstrainedHighSpeedCaptureSession.createImpl(HwCameraDeviceImpl.this, (CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession);
                    }
                    stateCallback.onSurfacePrepared(this.mSession, surface);
                }
            }, checkHandler);
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void startTryAE(CaptureRequest.Builder builder, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException, RemoteException {
        if (1 == getMode()) {
            if (HwCamera.SDK_USAGE_FALG == 1) {
                builder.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_TRYAE, (byte) 1);
            } else {
                setKeyByEngine(builder, builder.build(), 25, new byte[]{1});
            }
            this.mSessionNormal.setRepeatingRequest(builder.build(), captureCallback, handler);
            return;
        }
        throw new IllegalStateException("startTryAE can only be called in super night mode.");
    }

    public void createSuperSlowMotionCaptrureSession(List<Surface> list, final HwCameraSuperSlowMotionCaptureSession.StateCallback stateCallback, Handler handler) throws CameraAccessException {
        if (this.mMode == 4) {
            checkIfClosed();
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("outputs must be a non-null, non-empty list");
            } else if (stateCallback != null) {
                Handler checkHandler = checkHandler(handler);
                AnonymousClass3 r0 = new CameraCaptureSession.StateCallback() {
                    HwCameraSuperSlowMotionCaptureSession mSession;

                    public void onActive(CameraCaptureSession cameraCaptureSession) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onActive(this.mSession);
                    }

                    public void onClosed(CameraCaptureSession cameraCaptureSession) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onClosed(this.mSession);
                    }

                    public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onConfigureFailed(this.mSession);
                    }

                    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onConfigured(this.mSession);
                    }

                    public void onReady(CameraCaptureSession cameraCaptureSession) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onReady(this.mSession);
                    }

                    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                        if (this.mSession == null) {
                            HwCameraDeviceImpl hwCameraDeviceImpl = HwCameraDeviceImpl.this;
                            HwCameraSuperSlowMotionCaptureSession createImpl = HwCameraSuperSlowMotionCaptureSession.createImpl(HwCameraDeviceImpl.this, cameraCaptureSession);
                            hwCameraDeviceImpl.mSessionReserve = createImpl;
                            this.mSession = createImpl;
                        }
                        stateCallback.onSurfacePrepared(this.mSession, surface);
                    }
                };
                if (list.size() <= 1) {
                    this.mPreviewSurface = list.get(0);
                    list.add(mMideaCodecSurface);
                    this.mCameraDevice.createCaptureSession(list, r0, checkHandler);
                    return;
                }
                throw new IllegalArgumentException("Super slow motion mode can only has preview surface.");
            } else {
                throw new IllegalArgumentException("callback must not be null");
            }
        } else {
            throw new UnsupportedOperationException("can not create super slow motion session in this mode.");
        }
    }

    public void setupMediaRecorderForSuperSlowMotion(String str, String str2, int i) throws IOException {
        if (4 == getMode()) {
            CamcorderProfile camcorderProfile = CamcorderProfile.get(Integer.parseInt(getId()), PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE);
            this.mMediaRecorder = new MediaRecorder();
            this.mMediaRecorder.setVideoSource(2);
            this.mMediaRecorder.setOutputFormat(camcorderProfile.fileFormat);
            this.mMediaRecorder.setVideoFrameRate(30);
            this.mMediaRecorder.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.mMediaRecorder.setVideoEncodingBitRate(12000000);
            this.mMediaRecorder.setVideoEncoder(camcorderProfile.videoCodec);
            if (str2 == null) {
                str2 = "SL_MO_VID_" + System.currentTimeMillis() + ".mp4";
            }
            this.mVideoFilename = str + str2;
            this.mMediaRecorder.setOutputFile(str + str2);
            this.mMediaRecorder.setCaptureRate(960.0d);
            this.mMediaRecorder.setOrientationHint(i);
            this.mMediaRecorder.setInputSurface(mMideaCodecSurface);
            this.mMediaRecorder.prepare();
            return;
        }
        throw new IllegalStateException("setup MediaRecorder can only be called in super slow motion mode.");
    }

    public void startSuperNightRelayout(CaptureRequest.Builder builder, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (1 == getMode()) {
            int rotation = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
            if (HwCamera.SDK_USAGE_FALG == 1) {
                builder.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_RELAYOUT_MODE, (byte) 1);
                builder.set(HwCaptureRequestEx.HUAWEI_ROTATION_VALUE, Integer.valueOf(Util.ORIENTATIONS.get(rotation)));
            } else {
                CaptureRequest build = builder.build();
                setKeyByEngine(builder, build, 23, new byte[]{1});
                setKeyByEngine(builder, build, 24, new int[]{Util.ORIENTATIONS.get(rotation)});
            }
            this.mSessionNormal.setRepeatingRequest(builder.build(), captureCallback, handler);
            return;
        }
        throw new IllegalStateException("startSuperNightRelayout can only be called in super night mode.");
    }

    private void setKeyByEngine(CaptureRequest.Builder builder, CaptureRequest captureRequest, int i, Object obj) {
        try {
            CaptureRequest.Key captureKeybyEngine = getCaptureKeybyEngine(captureRequest, i);
            if (captureKeybyEngine != null) {
                builder.set(captureKeybyEngine, obj);
            }
        } catch (RemoteException unused) {
        }
    }

    public void startSuperNightRelayout(CaptureRequest.Builder builder, CaptureRequest.Builder builder2, int i, HwCameraCaptureSession.CaptureCallback captureCallback, Handler handler) throws CameraAccessException {
        if (1 == getMode()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (HwCamera.SDK_USAGE_FALG == 1) {
                builder.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_RELAYOUT_MODE, (byte) 1);
                builder2.set(HwCaptureRequestEx.HUAWEI_LIGHT_PAINTING_RELAYOUT_MODE, (byte) 1);
                builder.set(HwCaptureRequestEx.HUAWEI_ROTATION_VALUE, Integer.valueOf(i));
            } else {
                CaptureRequest build = builder.build();
                CaptureRequest build2 = builder2.build();
                setKeyByEngine(builder, build, 23, new byte[]{1});
                setKeyByEngine(builder2, build2, 23, new byte[]{1});
                setKeyByEngine(builder, build, 24, new int[]{i});
                HwCameraEngineUtils.reportFunc("startSuperNightRelayout", 1, "", System.currentTimeMillis() - currentTimeMillis);
            }
            this.mSessionNormal.setRepeatingRequest(builder.build(), captureCallback, handler);
            return;
        }
        throw new IllegalStateException("startSuperNightRelayout can only be called in super night mode.");
    }
}
