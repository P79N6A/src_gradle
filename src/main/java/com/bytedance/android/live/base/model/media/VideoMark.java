package com.bytedance.android.live.base.model.media;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class VideoMark {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }
}
