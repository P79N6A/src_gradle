package com.huawei.android.sdk.camera;

import android.hardware.camera2.CaptureRequest;
import android.util.Size;

public class HwCaptureRequestEx {
    public static final CaptureRequest.Key<Byte> ANDROID_HW_BODYSHAPING_LEVEL = new CaptureRequest.Key<>("com.huawei.capture.metadata.bodyShapingLevel", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> BEAUTY_FACE = new CaptureRequest.Key<>("com.huawei.capture.metadata.faceBeautyMode", Byte.class);
    public static final CaptureRequest.Key<Byte> BEAUTY_FACE_1080 = new CaptureRequest.Key<>("com.huawei.device.capabilities.beauty1080pSupported", Byte.class);
    public static final CaptureRequest.Key<Integer> BEAUTY_FACE_LEVEL = new CaptureRequest.Key<>("com.huawei.capture.metadata.faceBeautyLevel", Integer.class);
    public static final CaptureRequest.Key<Byte> BUFFER_CAPTURE_MODE = new CaptureRequest.Key<>("com.huawei.camera.buffer_capture_mode", Byte.class);
    public static final CaptureRequest.Key<Size> CONTROL_SIZE = new CaptureRequest.Key<>("com.huawei.camera.size", Size.class);
    public static final CaptureRequest.Key<Byte> EXT_SCENE_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.extSceneMode", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> FACE_MEIWO = new CaptureRequest.Key<>("com.huawei.capture.metadata.faceMeiwoMode", Byte.class);
    public static final CaptureRequest.Key<Integer> HAUWEI_CAMERA_SCENE_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.cameraSceneMode", Integer.class);
    public static final CaptureRequest.Key<Byte> HAUWEI_MASTER_AI_ENABLE = new CaptureRequest.Key<>("com.huawei.capture.metadata.masterAIEnable", Byte.class);
    public static final CaptureRequest.Key<Integer> HAUWEI_MASTER_AI_ENTER_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartsuggest_entermode", Integer.class);
    public static final CaptureRequest.Key<Integer> HAUWEI_SMART_SUGGEST_CONFIRM = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartSuggestConfirm", Integer.class);
    public static final CaptureRequest.Key<Integer> HAUWEI_SMART_SUGGEST_DISMISS = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartSuggestDismiss", Integer.class);
    public static final CaptureRequest.Key<Byte> HAUWEI_SMART_SUGGEST_ENABLE = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartSuggestEnable", Byte.TYPE);
    public static final CaptureRequest.Key<Integer> HAUWEI_SMART_SUGGEST_EXIT_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartsuggest_exitmode", Integer.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_ALL_FOCUS_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.allFocusMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_APERTURE_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.apertureMode", Byte.class);
    public static final CaptureRequest.Key<Integer> HUAWEI_APERTURE_VALUE = new CaptureRequest.Key<>("com.huawei.capture.metadata.apertureValue", Integer.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_BODYSHAPING_ENABLE = new CaptureRequest.Key<>("com.huawei.capture.metadata.bodyShapingEnable", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_BURST_SNAPSHOT_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.burstSnapshotMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_CAMERA_FLAG = new CaptureRequest.Key<>("com.huawei.capture.metadata.hwCamera2Flag", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_DM_WATERMARK_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.dmWaterMarkMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_DUAL_SENSOR_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.dualSensorMode", Byte.class);
    public static final CaptureRequest.Key<Float> HUAWEI_EXPOSURE_COMP_VALUE = new CaptureRequest.Key<>("com.huawei.capture.metadata.exposureCompValue", Float.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_FRONTGESTURE_DETECTION_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.frontgestureDetectionMode", Byte.class);
    public static final CaptureRequest.Key<Integer> HUAWEI_HIGH_VIDEO_FPS = new CaptureRequest.Key<>("com.huawei.capture.metadata.hw-video-fps", Integer.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_IMAGE_POST_PROCESS_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.imagePostProcessMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_LIGHT_PAINTING_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.lightPaintingMode", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_LIGHT_PAINTING_RELAYOUT_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.lightPaintingRelayoutMode", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_LIGHT_PAINTING_TRYAE = new CaptureRequest.Key<>("com.huawei.capture.metadata.lightPaintingTryAe", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_MANUAL_EXPOSURE_VALUE = new CaptureRequest.Key<>("com.huawei.capture.metadata.manualExposureValue", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_MANUAL_ISO_VALUE = new CaptureRequest.Key<>("com.huawei.capture.metadata.manualIsoValue", Byte.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_MONO_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.monoMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_NICE_FOOD_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.niceFoodMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_PORTRAIT_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.portraitMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_PROFESSIONAL_ASSIST_FLASH_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.profFocusAssistFlashMode", Byte.class);
    public static final CaptureRequest.Key<int[]> HUAWEI_REAL_JPEG_SIZE = new CaptureRequest.Key<>("com.huawei.capture.metadata.captureStreamResolution", int[].class);
    public static final CaptureRequest.Key<Integer> HUAWEI_ROTATION_VALUE = new CaptureRequest.Key<>("com.huawei.capture.metadata.hw-rotation-value", Integer.TYPE);
    public static final CaptureRequest.Key<Byte> HUAWEI_SMART_CAPTURE_ENABLE = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartCaptureEnable", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_SMILE_DETECTION = new CaptureRequest.Key<>("com.huawei.capture.metadata.smileDetectionMode", Byte.class);
    public static final CaptureRequest.Key<int[]> HUAWEI_SUPER_SLOW_CHECK_AREA = new CaptureRequest.Key<>("com.huawei.capture.metadata.checkMovingPosition", int[].class);
    public static final CaptureRequest.Key<Byte> HUAWEI_SUPER_SLOW_MOTION_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.superSlowMotionMode", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_TARGET_TRACKING_MODE = new CaptureRequest.Key<>("com.huawei.capture.metadata.hw-device-target-tracking", Byte.class);
    public static final CaptureRequest.Key<Byte> HUAWEI_VIDEO_STATUS = new CaptureRequest.Key<>("com.huawei.capture.metadata.hwVideoStatus", Byte.class);
    public static final CaptureRequest.Key<int[]> SMART_SUGGEST_RECORD_CLEAR = new CaptureRequest.Key<>("com.huawei.capture.metadata.smartsuggest_recordclear", int[].class);
    public static final CaptureRequest.Key<Size> VIDEO_SNAPSHOT_SIZE = new CaptureRequest.Key<>("com.huawei.camera.size", Size.class);
}
