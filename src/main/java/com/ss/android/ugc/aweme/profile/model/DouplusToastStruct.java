package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public class DouplusToastStruct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("id")
    public int id;
    @SerializedName("toast")
    public String toast;

    public int getId() {
        return this.id;
    }

    public String getToast() {
        return this.toast;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setToast(String str) {
        this.toast = str;
    }
}
