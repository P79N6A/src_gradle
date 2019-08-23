package com.huawei.android.sdk.camera;

import android.hardware.camera2.CaptureResult;

public class HwCameraCaptureResultEx {
    public static final CaptureResult.Key<Integer> HAUWEI_SMART_SUGGEST_HINT = new CaptureResult.Key<>("com.huawei.capture.metadata.smartSuggestHint", Integer.TYPE);
    public static final CaptureResult.Key<Byte> HUAWEI_EXPOSURE_MODE_PREVIEW_STATE = new CaptureResult.Key<>("com.huawei.capture.metadata.hw-exposure-mode-preview-state", Byte.TYPE);
    public static final CaptureResult.Key<Integer> HUAWEI_LIGHT_PAINTING_EXPOSURE_TIME = new CaptureResult.Key<>("com.huawei.capture.metadata.lightPaintingExposureTime", Integer.TYPE);
    public static final CaptureResult.Key<Byte> HUAWEI_SUPER_SLOW_MOTION_STATUS = new CaptureResult.Key<>("com.huawei.capture.metadata.superSlowMotionStatus", Byte.class);
}
