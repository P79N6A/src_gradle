package com.ss.android.ugc.aweme.gesturelog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class SensorData {
    @SerializedName("sensor_type")
    public int sensorType;
    @SerializedName("time")
    public long time;
    @SerializedName("x")
    public float x;
    @SerializedName("y")
    public float y;
}
