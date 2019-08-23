package com.ss.android.ugc.aweme.hotsearch.b;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("edition_no")
    public int editionNo;
    @SerializedName("end_time")
    public long endTime;
    @SerializedName("start_time")
    public long startTime;
    @SerializedName("uid")
    public String uid;

    public final int getEditionNo() {
        return this.editionNo;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setEditionNo(int i) {
        this.editionNo = i;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
