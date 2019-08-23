package com.ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class PoiOptionStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    long code;
    boolean isSelected;
    @SerializedName("name")
    String name;

    public long getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setCode(long j) {
        this.code = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }
}
