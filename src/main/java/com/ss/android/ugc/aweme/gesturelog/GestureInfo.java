package com.ss.android.ugc.aweme.gesturelog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

@Keep
public class GestureInfo {
    @SerializedName("general_data")
    public GenericData data;
    @SerializedName("touch_data_list")
    public List<TouchData> touchDataList;

    public GestureInfo(GenericData genericData, List<TouchData> list) {
        this.data = genericData;
        this.touchDataList = list;
    }
}
