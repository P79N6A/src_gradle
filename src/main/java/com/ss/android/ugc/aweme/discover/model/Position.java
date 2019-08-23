package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class Position implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("begin")
    public int begin;
    @SerializedName("end")
    public int end;

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }
}
