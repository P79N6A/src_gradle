package com.ss.android.ugc.aweme.setting.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class UserPreferSettings {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("display_time")
    public int displayTime;
    @SerializedName("n")
    public int n;
    @SerializedName("t")
    public int t;
    @SerializedName("v")
    public int v;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 72250, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 72250, new Class[0], String.class);
        }
        return "UserPreferSettings{n=" + this.n + ", t=" + this.t + ", v=" + this.v + '}';
    }
}
