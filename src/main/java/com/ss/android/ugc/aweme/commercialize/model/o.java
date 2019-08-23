package com.ss.android.ugc.aweme.commercialize.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class o implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("easter_egg")
    i mEasterEggInfo;

    public i getEasterEggInfo() {
        return this.mEasterEggInfo;
    }

    public void setEasterEggInfo(i iVar) {
        this.mEasterEggInfo = iVar;
    }
}
