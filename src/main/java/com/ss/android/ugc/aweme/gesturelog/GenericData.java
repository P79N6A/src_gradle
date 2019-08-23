package com.ss.android.ugc.aweme.gesturelog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;

@Keep
public class GenericData {
    @SerializedName("apk_version")
    public int apkVersion;
    @SerializedName("brand")
    public String brand;
    @SerializedName("country")
    public String country;
    @SerializedName("model")
    public String model;
    @SerializedName("screen_height")
    public int screenHeight;
    @SerializedName("screen_width")
    public int screenWidth;
    @SerializedName("sdk_version_code")
    public int sdkVersionCode;
    @SerializedName("user_id")
    public String userId;
    @SerializedName("xdpi")
    public float xdpi;
    @SerializedName("ydpi")
    public float ydpi;

    public GenericData(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f2, float f3) {
        this.brand = str;
        this.model = str2;
        this.userId = str3;
        this.country = str4;
        this.sdkVersionCode = i;
        this.apkVersion = i2;
        this.screenWidth = i3;
        this.screenHeight = i4;
        this.xdpi = f2;
        this.ydpi = f3;
    }
}
