package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class r implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("book_url")
    public String book_url;
    @SerializedName("queue_status")
    public int queueStatus;
    @SerializedName("queue_url")
    public String queue_url;

    public boolean isAvailable() {
        if (this.queueStatus < 2 || this.queueStatus > 4) {
            return true;
        }
        return false;
    }
}
