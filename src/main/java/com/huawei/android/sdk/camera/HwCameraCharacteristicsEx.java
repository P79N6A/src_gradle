package com.huawei.android.sdk.camera;

import android.hardware.camera2.CameraCharacteristics;

public final class HwCameraCharacteristicsEx {
    public static final CameraCharacteristics.Key<Byte> ANDROID_HW_BODYSHAPING_MODE_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.bodyShapingModeSupported", Byte.TYPE);
    public static final CameraCharacteristics.Key<Byte> HAUWEI_SMART_SUGGEST_SUPPORT = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.smartSuggestSupported", Byte.TYPE);
    public static final CameraCharacteristics.Key<byte[]> HUAWEI_APERTURE_VALUE_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.apertureValueSupported", byte[].class);
    public static final CameraCharacteristics.Key<byte[]> HUAWEI_AVAILABLE_EXPOSURE_MODES = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.availbaleLightPaintingModes", byte[].class);
    public static final CameraCharacteristics.Key<byte[]> HUAWEI_AVAILABLE_RELAYOUT_MODES = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.availbaleRelayoutModes", byte[].class);
    public static final CameraCharacteristics.Key<int[]> HUAWEI_AVAILABLE_VIDEO_FPS = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.videoFpsSupported", int[].class);
    public static final CameraCharacteristics.Key<Byte> HUAWEI_BIG_APERTURE_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.bigApertureSupported", Byte.TYPE);
    public static final CameraCharacteristics.Key<Byte> HUAWEI_DUAL_PRIMARY_SINGLE_REPROCESS = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.dualPrimarySingleReprocess", Byte.class);
    public static final CameraCharacteristics.Key<Byte> HUAWEI_PORTRAIT_ADJUST_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.portraitApertureAdjustingSupported", Byte.class);
    public static final CameraCharacteristics.Key<Byte> HUAWEI_PORTRAIT_MODE_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.portraitModeSupported", Byte.TYPE);
    public static final CameraCharacteristics.Key<Byte> HUAWEI_SUPER_SLOW_MOTION_SUPPORTED = new CameraCharacteristics.Key<>("com.huawei.device.capabilities.superSlowMotionSupported", Byte.class);
}
