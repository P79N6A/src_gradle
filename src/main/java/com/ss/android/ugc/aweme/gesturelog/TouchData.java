package com.ss.android.ugc.aweme.gesturelog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class TouchData {
    @SerializedName("action")
    public int action;
    @SerializedName("phone_orientation")
    public int phoneOrientation;
    @SerializedName("pressure")
    public float pressure;
    @SerializedName("time")
    public long time;
    @SerializedName("size")
    public float touchAreaSize;
    @SerializedName("touch_orientation")
    public float touchOrientation;
    @SerializedName("x")
    public float x;
    @SerializedName("x_velocity")
    public float xVelocity;
    @SerializedName("y")
    public float y;
    @SerializedName("y_velocity")
    public float yVelocity;

    public TouchData(long j, int i, float f2, int i2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.time = j;
        this.action = i;
        this.touchOrientation = f2;
        this.phoneOrientation = i2;
        this.x = f3;
        this.y = f4;
        this.pressure = f5;
        this.touchAreaSize = f6;
        this.xVelocity = f7;
        this.yVelocity = f8;
    }
}
