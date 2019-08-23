package com.ss.android.ttve.utils;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.support.annotation.Keep;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.vesdk.y;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Keep
public class CameraInstance {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static CameraInstance mThisInstance;
    private Comparator<Camera.Size> comparatorBigger = new Comparator<Camera.Size>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size2.width - size.width;
            if (i == 0) {
                return size2.height - size.height;
            }
            return i;
        }
    };
    private Comparator<Camera.Size> comparatorSmaller = new Comparator<Camera.Size>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            Camera.Size size = (Camera.Size) obj;
            Camera.Size size2 = (Camera.Size) obj2;
            int i = size.width - size2.width;
            if (i == 0) {
                return size.height - size2.height;
            }
            return i;
        }
    };
    private Camera mCameraDevice;
    private int mDefaultCameraID = -1;
    private int mFacing;
    private boolean mIsPreviewing;
    private Camera.Parameters mParams;
    private int mPictureHeight = 720;
    private int mPictureWidth = 1280;
    private int mPreferPreviewHeight = 720;
    private int mPreferPreviewWidth = 1280;
    private int mPreviewHeight;
    private int mPreviewWidth;
    private int mRotation;

    public interface a {
        void a();
    }

    private static int clamp(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public Camera getCameraDevice() {
        return this.mCameraDevice;
    }

    public int getCameraFacing() {
        return this.mFacing;
    }

    public int getRotation() {
        return this.mRotation;
    }

    public boolean isPreviewing() {
        return this.mIsPreviewing;
    }

    public int pictureHeight() {
        return this.mPictureHeight;
    }

    public int pictureWidth() {
        return this.mPictureWidth;
    }

    public int previewHeight() {
        return this.mPreviewHeight;
    }

    public int previewWidth() {
        return this.mPreviewWidth;
    }

    public boolean isCameraOpened() {
        if (this.mCameraDevice != null) {
            return true;
        }
        return false;
    }

    public boolean isUsingFrontCamera() {
        if (this.mFacing == 1) {
            return true;
        }
        return false;
    }

    public static synchronized CameraInstance getInstance() {
        CameraInstance cameraInstance;
        synchronized (CameraInstance.class) {
            if (mThisInstance == null) {
                mThisInstance = new CameraInstance();
            }
            cameraInstance = mThisInstance;
        }
        return cameraInstance;
    }

    public synchronized Camera.Parameters getParams() {
        if (this.mCameraDevice == null) {
            return null;
        }
        return this.mCameraDevice.getParameters();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stopCamera() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "CameraInstance"
            java.lang.String r1 = "stopCamera..."
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ all -> 0x0023 }
            android.hardware.Camera r0 = r2.mCameraDevice     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0021
            r0 = 0
            r2.mIsPreviewing = r0     // Catch:{ all -> 0x0023 }
            android.hardware.Camera r0 = r2.mCameraDevice     // Catch:{ all -> 0x0023 }
            r0.stopPreview()     // Catch:{ all -> 0x0023 }
            r0 = 0
            android.hardware.Camera r1 = r2.mCameraDevice     // Catch:{ Exception -> 0x001a }
            r1.setPreviewTexture(r0)     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            android.hardware.Camera r1 = r2.mCameraDevice     // Catch:{ all -> 0x0023 }
            r1.release()     // Catch:{ all -> 0x0023 }
            r2.mCameraDevice = r0     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.utils.CameraInstance.stopCamera():void");
    }

    public synchronized void stopPreview() {
        y.b("CameraInstance", "Camera stopPreview...");
        if (this.mIsPreviewing && this.mCameraDevice != null) {
            this.mIsPreviewing = false;
            this.mCameraDevice.stopPreview();
            y.a("CameraInstance", "Camera stopped!");
        }
    }

    public boolean tryOpenCamera(a aVar) {
        return tryOpenCamera(aVar, 0);
    }

    private static int clamp(int i) {
        return clamp(i, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }

    public synchronized void setParams(Camera.Parameters parameters) {
        if (this.mCameraDevice != null) {
            this.mParams = parameters;
            this.mCameraDevice.setParameters(this.mParams);
        }
    }

    private void setCameraDisplayOrientation(Activity activity) {
        int i = 0;
        switch (activity.getWindowManager().getDefaultDisplay().getRotation()) {
            case 1:
                i = 90;
                break;
            case 2:
                i = 180;
                break;
            case 3:
                i = 270;
                break;
        }
        this.mRotation = setOrientationDegrees(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setFocusMode(java.lang.String r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.hardware.Camera r0 = r1.mCameraDevice     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.hardware.Camera r0 = r1.mCameraDevice     // Catch:{ all -> 0x0022 }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ all -> 0x0022 }
            r1.mParams = r0     // Catch:{ all -> 0x0022 }
            android.hardware.Camera$Parameters r0 = r1.mParams     // Catch:{ all -> 0x0022 }
            java.util.List r0 = r0.getSupportedFocusModes()     // Catch:{ all -> 0x0022 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            android.hardware.Camera$Parameters r0 = r1.mParams     // Catch:{ all -> 0x0022 }
            r0.setFocusMode(r2)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r1)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.utils.CameraInstance.setFocusMode(java.lang.String):void");
    }

    public int setOrientationDegrees(int i) {
        int i2;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.mDefaultCameraID, cameraInfo);
        if (cameraInfo.facing == 1) {
            i2 = ((360 - ((cameraInfo.orientation + i) % 360)) + 180) % 360;
        } else {
            i2 = ((cameraInfo.orientation - i) + 360) % 360;
        }
        try {
            this.mCameraDevice.setDisplayOrientation(i2);
        } catch (Exception unused) {
        }
        return i2;
    }

    public synchronized void startPreview(SurfaceTexture surfaceTexture) {
        y.a("CameraInstance", "Camera startPreview...");
        if (this.mIsPreviewing) {
            y.c("CameraInstance", "Camera is previewing...");
        } else if (this.mCameraDevice != null) {
            try {
                this.mCameraDevice.setPreviewTexture(surfaceTexture);
                this.mCameraDevice.startPreview();
                this.mIsPreviewing = true;
            } catch (Exception e2) {
                y.d("CameraInstance", "startPreview: Error " + e2.getMessage());
                this.mIsPreviewing = false;
                try {
                    this.mCameraDevice.release();
                } catch (Exception unused) {
                }
                this.mCameraDevice = null;
            }
        }
    }

    public void initCamera(int i) {
        int max;
        int min;
        if (this.mCameraDevice == null) {
            y.d("CameraInstance", "initCamera: Camera is not opened!");
            return;
        }
        this.mParams = this.mCameraDevice.getParameters();
        for (Integer intValue : this.mParams.getSupportedPictureFormats()) {
            y.a("CameraInstance", String.format("Picture Format: %x", new Object[]{Integer.valueOf(intValue.intValue())}));
        }
        this.mParams.setPictureFormat(256);
        List<Camera.Size> supportedPictureSizes = this.mParams.getSupportedPictureSizes();
        Collections.sort(supportedPictureSizes, this.comparatorBigger);
        Camera.Size size = null;
        Camera.Size size2 = null;
        for (Camera.Size next : supportedPictureSizes) {
            if (size2 == null || (next.width >= this.mPictureWidth && next.height >= this.mPictureHeight)) {
                size2 = next;
            }
        }
        List<Camera.Size> supportedPreviewSizes = this.mParams.getSupportedPreviewSizes();
        Collections.sort(supportedPreviewSizes, this.comparatorBigger);
        for (Camera.Size next2 : supportedPreviewSizes) {
            y.b("CameraInstance", String.format("Supported preview size: %d x %d", new Object[]{Integer.valueOf(next2.width), Integer.valueOf(next2.height)}));
            if (size == null || (next2.width >= this.mPreferPreviewWidth && next2.height >= this.mPreferPreviewHeight)) {
                size = next2;
            }
        }
        List<Integer> supportedPreviewFrameRates = this.mParams.getSupportedPreviewFrameRates();
        this.mParams.setPreviewSize(size.width, size.height);
        this.mParams.setPictureSize(size2.width, size2.height);
        if (this.mParams.getSupportedFocusModes().contains("continuous-video")) {
            this.mParams.setFocusMode("continuous-video");
        }
        int i2 = (i * 2) / 3;
        int i3 = (i * 4) / 3;
        int i4 = 0;
        int i5 = 30;
        for (Integer next3 : supportedPreviewFrameRates) {
            y.e("CameraInstance", "Supported frame rate: " + next3);
            if (i4 < next3.intValue()) {
                i4 = next3.intValue();
            }
            if (i5 > next3.intValue()) {
                i5 = next3.intValue();
            }
        }
        y.a("CameraInstance", "FpsRange = [" + max + ", " + min + "]");
        this.mParams.setPreviewFpsRange(max * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, min * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        this.mParams.getPreviewFpsRange(new int[2]);
        y.a("CameraInstance", "FpsRange = [" + (r12[0] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + ", " + (new int[2][1] / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + "]");
        try {
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception unused) {
        }
        this.mParams = this.mCameraDevice.getParameters();
        Camera.Size pictureSize = this.mParams.getPictureSize();
        Camera.Size previewSize = this.mParams.getPreviewSize();
        this.mPreviewWidth = previewSize.width;
        this.mPreviewHeight = previewSize.height;
        this.mPictureWidth = pictureSize.width;
        this.mPictureHeight = pictureSize.height;
        y.a("CameraInstance", String.format("Camera Picture Size: %d x %d", new Object[]{Integer.valueOf(pictureSize.width), Integer.valueOf(pictureSize.height)}));
        y.a("CameraInstance", String.format("Camera Preview Size: %d x %d", new Object[]{Integer.valueOf(previewSize.width), Integer.valueOf(previewSize.height)}));
    }

    public void focusAtPoint(float f2, float f3) {
        focusAtPoint(f2, f3, 0.08f);
    }

    public void setPreferPreviewSize(int i, int i2) {
        this.mPreferPreviewHeight = i;
        this.mPreferPreviewWidth = i2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:35|36|37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6.mCameraDevice.release();
        r6.mCameraDevice = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        return false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean tryOpenCamera(com.ss.android.ttve.utils.CameraInstance.a r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "CameraInstance"
            java.lang.String r1 = "try open camera..."
            com.ss.android.vesdk.y.a(r0, r1)     // Catch:{ all -> 0x0094 }
            r0 = 0
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0089 }
            r3 = 8
            if (r2 <= r3) goto L_0x002a
            int r2 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ Exception -> 0x0089 }
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x0089 }
            r3.<init>()     // Catch:{ Exception -> 0x0089 }
            r4 = 0
        L_0x001a:
            if (r4 >= r2) goto L_0x002a
            android.hardware.Camera.getCameraInfo(r4, r3)     // Catch:{ Exception -> 0x0089 }
            int r5 = r3.facing     // Catch:{ Exception -> 0x0089 }
            if (r5 != r8) goto L_0x0027
            r6.mDefaultCameraID = r4     // Catch:{ Exception -> 0x0089 }
            r6.mFacing = r8     // Catch:{ Exception -> 0x0089 }
        L_0x0027:
            int r4 = r4 + 1
            goto L_0x001a
        L_0x002a:
            r6.stopPreview()     // Catch:{ Exception -> 0x0089 }
            android.hardware.Camera r8 = r6.mCameraDevice     // Catch:{ Exception -> 0x0089 }
            if (r8 == 0) goto L_0x0036
            android.hardware.Camera r8 = r6.mCameraDevice     // Catch:{ Exception -> 0x0089 }
            r8.release()     // Catch:{ Exception -> 0x0089 }
        L_0x0036:
            int r8 = r6.mDefaultCameraID     // Catch:{ Exception -> 0x0089 }
            if (r8 < 0) goto L_0x0043
            int r8 = r6.mDefaultCameraID     // Catch:{ Exception -> 0x0089 }
            android.hardware.Camera r8 = android.hardware.Camera.open(r8)     // Catch:{ Exception -> 0x0089 }
            r6.mCameraDevice = r8     // Catch:{ Exception -> 0x0089 }
            goto L_0x004b
        L_0x0043:
            android.hardware.Camera r8 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x0089 }
            r6.mCameraDevice = r8     // Catch:{ Exception -> 0x0089 }
            r6.mFacing = r1     // Catch:{ Exception -> 0x0089 }
        L_0x004b:
            int r8 = r6.setOrientationDegrees(r1)     // Catch:{ Exception -> 0x0089 }
            r6.mRotation = r8     // Catch:{ Exception -> 0x0089 }
            java.lang.String r8 = "CameraInstance"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            java.lang.String r3 = "Camera rotation = "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0089 }
            int r3 = r6.mRotation     // Catch:{ Exception -> 0x0089 }
            r2.append(r3)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0089 }
            com.ss.android.vesdk.y.b(r8, r2)     // Catch:{ Exception -> 0x0089 }
            android.hardware.Camera r8 = r6.mCameraDevice     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0087
            java.lang.String r8 = "CameraInstance"
            java.lang.String r2 = "Camera opened!"
            com.ss.android.vesdk.y.a(r8, r2)     // Catch:{ all -> 0x0094 }
            r8 = 30
            r6.initCamera(r8)     // Catch:{ Exception -> 0x007e }
            if (r7 == 0) goto L_0x007b
            r7.a()     // Catch:{ all -> 0x0094 }
        L_0x007b:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x007e:
            android.hardware.Camera r7 = r6.mCameraDevice     // Catch:{ all -> 0x0094 }
            r7.release()     // Catch:{ all -> 0x0094 }
            r6.mCameraDevice = r0     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)
            return r1
        L_0x0087:
            monitor-exit(r6)
            return r1
        L_0x0089:
            java.lang.String r7 = "CameraInstance"
            java.lang.String r8 = "Open Camera Failed!"
            com.ss.android.vesdk.y.d(r7, r8)     // Catch:{ all -> 0x0094 }
            r6.mCameraDevice = r0     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)
            return r1
        L_0x0094:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.utils.CameraInstance.tryOpenCamera(com.ss.android.ttve.utils.CameraInstance$a, int):boolean");
    }

    private void rotateRectForOrientation(int i, Rect rect, Rect rect2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-i));
        RectF rectF = new RectF(rect);
        RectF rectF2 = new RectF(rect2);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        matrix.reset();
        matrix.setTranslate(-rectF.left, -rectF.top);
        matrix.mapRect(rectF);
        matrix.mapRect(rectF2);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void focusAtPoint(float r4, float r5, float r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.hardware.Camera r0 = r3.mCameraDevice     // Catch:{ all -> 0x00c4 }
            if (r0 != 0) goto L_0x000e
            java.lang.String r4 = "CameraInstance"
            java.lang.String r5 = "Error: focus after release."
            com.ss.android.vesdk.y.d(r4, r5)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r3)
            return
        L_0x000e:
            android.hardware.Camera r0 = r3.mCameraDevice     // Catch:{ all -> 0x00c4 }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ all -> 0x00c4 }
            r3.mParams = r0     // Catch:{ all -> 0x00c4 }
            android.hardware.Camera$Parameters r0 = r3.mParams     // Catch:{ all -> 0x00c4 }
            int r0 = r0.getMaxNumMeteringAreas()     // Catch:{ all -> 0x00c4 }
            if (r0 <= 0) goto L_0x00bb
            int r0 = r3.mRotation     // Catch:{ all -> 0x00c4 }
            android.graphics.Rect r4 = r3.calculateTapArea(r4, r5, r6, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "CameraInstance"
            java.lang.String r6 = "FocusAreas: [%d, %d, %d, %d]"
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00c4 }
            r1 = 0
            int r2 = r4.left     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            r0[r1] = r2     // Catch:{ all -> 0x00c4 }
            r1 = 1
            int r2 = r4.top     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            r0[r1] = r2     // Catch:{ all -> 0x00c4 }
            r1 = 2
            int r2 = r4.right     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            r0[r1] = r2     // Catch:{ all -> 0x00c4 }
            r1 = 3
            int r2 = r4.bottom     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c4 }
            r0[r1] = r2     // Catch:{ all -> 0x00c4 }
            java.lang.String r6 = java.lang.String.format(r6, r0)     // Catch:{ all -> 0x00c4 }
            com.ss.android.vesdk.y.b(r5, r6)     // Catch:{ all -> 0x00c4 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00c4 }
            r5.<init>()     // Catch:{ all -> 0x00c4 }
            android.hardware.Camera$Area r6 = new android.hardware.Camera$Area     // Catch:{ all -> 0x00c4 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r6.<init>(r4, r0)     // Catch:{ all -> 0x00c4 }
            r5.add(r6)     // Catch:{ all -> 0x00c4 }
            android.hardware.Camera r4 = r3.mCameraDevice     // Catch:{ Exception -> 0x00a1 }
            r4.cancelAutoFocus()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r6 = "Multilaser"
            boolean r4 = android.text.TextUtils.equals(r4, r6)     // Catch:{ Exception -> 0x00a1 }
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r6 = "MS40"
            boolean r4 = android.text.TextUtils.equals(r4, r6)     // Catch:{ Exception -> 0x00a1 }
            if (r4 != 0) goto L_0x0083
            android.hardware.Camera$Parameters r4 = r3.mParams     // Catch:{ Exception -> 0x00a1 }
            r4.setFocusAreas(r5)     // Catch:{ Exception -> 0x00a1 }
        L_0x0083:
            android.hardware.Camera$Parameters r4 = r3.mParams     // Catch:{ Exception -> 0x00a1 }
            r4.setMeteringAreas(r5)     // Catch:{ Exception -> 0x00a1 }
            android.hardware.Camera$Parameters r4 = r3.mParams     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = "continuous-video"
            r4.setFocusMode(r5)     // Catch:{ Exception -> 0x00a1 }
            android.hardware.Camera r4 = r3.mCameraDevice     // Catch:{ Exception -> 0x00a1 }
            android.hardware.Camera$Parameters r5 = r3.mParams     // Catch:{ Exception -> 0x00a1 }
            r4.setParameters(r5)     // Catch:{ Exception -> 0x00a1 }
            android.hardware.Camera r4 = r3.mCameraDevice     // Catch:{ Exception -> 0x00a1 }
            com.ss.android.ttve.utils.CameraInstance$3 r5 = new com.ss.android.ttve.utils.CameraInstance$3     // Catch:{ Exception -> 0x00a1 }
            r5.<init>()     // Catch:{ Exception -> 0x00a1 }
            r4.autoFocus(r5)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00c2
        L_0x00a1:
            r4 = move-exception
            java.lang.String r5 = "CameraInstance"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "Error: focusAtPoint failed: "
            r6.<init>(r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c4 }
            r6.append(r4)     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x00c4 }
            com.ss.android.vesdk.y.d(r5, r4)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r3)
            return
        L_0x00bb:
            java.lang.String r4 = "CameraInstance"
            java.lang.String r5 = "The device does not support metering areas..."
            com.ss.android.vesdk.y.a(r4, r5)     // Catch:{ all -> 0x00c4 }
        L_0x00c2:
            monitor-exit(r3)
            return
        L_0x00c4:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.utils.CameraInstance.focusAtPoint(float, float, float):void");
    }

    public synchronized void setPictureSize(int i, int i2, boolean z) {
        if (this.mCameraDevice == null) {
            this.mPictureWidth = i;
            this.mPictureHeight = i2;
            return;
        }
        this.mParams = this.mCameraDevice.getParameters();
        List<Camera.Size> supportedPictureSizes = this.mParams.getSupportedPictureSizes();
        Camera.Size size = null;
        if (z) {
            Collections.sort(supportedPictureSizes, this.comparatorBigger);
            for (Camera.Size next : supportedPictureSizes) {
                if (size == null || (next.width >= i && next.height >= i2)) {
                    size = next;
                }
            }
        } else {
            Collections.sort(supportedPictureSizes, this.comparatorSmaller);
            for (Camera.Size next2 : supportedPictureSizes) {
                if (size == null || (next2.width <= i && next2.height <= i2)) {
                    size = next2;
                }
            }
        }
        if (size != null) {
            this.mPictureWidth = size.width;
        }
        if (size != null) {
            this.mPictureHeight = size.height;
        }
        try {
            this.mParams.setPictureSize(this.mPictureWidth, this.mPictureHeight);
            this.mCameraDevice.setParameters(this.mParams);
        } catch (Exception unused) {
        }
    }

    public Rect calculateTapArea(float f2, float f3, float f4, int i) {
        int intValue = Float.valueOf(f4 * 1000.0f).intValue();
        int i2 = ((int) (f2 * 2000.0f)) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i3 = ((int) (f3 * 2000.0f)) - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        int i4 = intValue / 2;
        int clamp = clamp(i2 - i4, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        int clamp2 = clamp(i3 - i4, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        RectF rectF = new RectF((float) clamp, (float) clamp2, (float) clamp(clamp + intValue), (float) clamp(clamp2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        rotateRectForOrientation(i, new Rect(-1000, -1000, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), rect);
        Rect rect2 = new Rect(rect.left - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.top - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.right - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, rect.bottom - PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        rect2.left = clamp(rect2.left);
        rect2.right = clamp(rect2.right);
        rect2.top = clamp(rect2.top);
        rect2.bottom = clamp(rect2.bottom);
        return rect2;
    }
}
