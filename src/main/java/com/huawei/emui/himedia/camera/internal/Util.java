package com.huawei.emui.himedia.camera.internal;

import android.hardware.camera2.CaptureRequest;
import android.util.SparseIntArray;

public class Util {
    public static final SparseIntArray ORIENTATIONS;
    public static String backId;
    public static String frontId;

    public static void tickLog(String str) {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        ORIENTATIONS = sparseIntArray;
        sparseIntArray.append(0, 90);
        ORIENTATIONS.append(1, 0);
        ORIENTATIONS.append(2, 270);
        ORIENTATIONS.append(3, 180);
    }

    public static void setCameraID(String[] strArr) {
        backId = strArr[0];
        frontId = strArr[1];
    }

    private <T> void setEngineKey(CaptureRequest.Builder builder, CaptureRequest.Key<T> key, T t) {
        if (key != null) {
            builder.set(key, t);
        }
    }
}
