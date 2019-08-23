package com.ss.android.ugc.aweme.sticker.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class BaseTrackTimeStamp implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("p")
    private int pts = -1;

    public int getPts() {
        return this.pts;
    }

    public BaseTrackTimeStamp() {
    }

    public boolean isFullTrack() {
        if (-1 == this.pts) {
            return true;
        }
        return false;
    }

    public void setPts(int i) {
        this.pts = i;
    }

    public BaseTrackTimeStamp(int i) {
        this.pts = i;
    }
}
