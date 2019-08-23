package com.ss.android.ugc.aweme.feed.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class RoomStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("height")
    public int height;
    @SerializedName("room_id")
    public long roomId;
    @SerializedName("user_count")
    private int userCount;
    @SerializedName("width")
    public int width;

    public int getUserCount() {
        return this.userCount;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}
