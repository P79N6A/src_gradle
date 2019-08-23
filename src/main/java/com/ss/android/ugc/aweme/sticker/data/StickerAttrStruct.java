package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class StickerAttrStruct {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_sticker_id")
    private String poiStickerId;
    @SerializedName("poll_sticker_id")
    private String pollStickerId;

    public String getPoiStickerId() {
        return this.poiStickerId;
    }

    public String getPollStickerId() {
        return this.pollStickerId;
    }

    public void setPoiStickerId(String str) {
        this.poiStickerId = str;
    }

    public void setPollStickerId(String str) {
        this.pollStickerId = str;
    }
}
