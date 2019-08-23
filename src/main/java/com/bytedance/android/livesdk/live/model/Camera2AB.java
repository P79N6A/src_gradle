package com.bytedance.android.livesdk.live.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class Camera2AB {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("camera_hw_level")
    private int cameraHWLevel;
    @SerializedName("camera_type")
    private int cameraType = 1;

    public int getCameraHWLevel() {
        return this.cameraHWLevel;
    }

    public int getCameraType() {
        return this.cameraType;
    }

    public Camera2AB() {
    }

    public void setCameraHWLevel(int i) {
        this.cameraHWLevel = i;
    }

    public void setCameraType(int i) {
        this.cameraType = i;
    }

    public Camera2AB(int i, int i2) {
        this.cameraType = i;
        this.cameraHWLevel = i2;
    }
}
