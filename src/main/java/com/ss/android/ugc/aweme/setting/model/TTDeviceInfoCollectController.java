package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class TTDeviceInfoCollectController {
    @SerializedName("device_info_switch")
    public int deviceInfoSwitch;
    @SerializedName("riskapp")
    public JsonObject riskapp;
    @SerializedName("riskdir")
    public JsonObject riskdir;
    @SerializedName("whiteapp")
    public JsonObject whiteapp;
}
