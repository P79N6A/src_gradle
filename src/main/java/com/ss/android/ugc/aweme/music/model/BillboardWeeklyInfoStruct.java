package com.ss.android.ugc.aweme.music.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class BillboardWeeklyInfoStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("end_date")
    private String endDate;
    @SerializedName("last_updated_date")
    private String lastUpdatedDate;
    @SerializedName("serial")
    private int serial;
    @SerializedName("start_date")
    private String startDate;

    public String getEndDate() {
        return this.endDate;
    }

    public String getLastUpdatedDate() {
        return this.lastUpdatedDate;
    }

    public int getSerial() {
        return this.serial;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void setLastUpdatedDate(String str) {
        this.lastUpdatedDate = str;
    }

    public void setSerial(int i) {
        this.serial = i;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }
}
