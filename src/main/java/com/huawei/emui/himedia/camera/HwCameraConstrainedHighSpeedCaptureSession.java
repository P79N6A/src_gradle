package com.huawei.emui.himedia.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.List;

public abstract class HwCameraConstrainedHighSpeedCaptureSession extends HwCameraCaptureSession {
    public abstract List<CaptureRequest> createHighSpeedRequestList(CaptureRequest captureRequest) throws CameraAccessException;

    static HwCameraConstrainedHighSpeedCaptureSessionImpl createImpl(HwCameraDevice hwCameraDevice, CameraConstrainedHighSpeedCaptureSession cameraConstrainedHighSpeedCaptureSession) {
        return new HwCameraConstrainedHighSpeedCaptureSessionImpl(hwCameraDevice, cameraConstrainedHighSpeedCaptureSession);
    }
}
