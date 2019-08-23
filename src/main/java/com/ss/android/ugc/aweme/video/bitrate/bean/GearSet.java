package com.ss.android.ugc.aweme.video.bitrate.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.e;

@Keep
public class GearSet implements e {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bit_rate")
    private int bitRate;
    @SerializedName("network_lower")
    private int networkLower;
    @SerializedName("network_upper")
    private int networkUpper;

    public int getBitRate() {
        return this.bitRate;
    }

    public int getNetworkLower() {
        return this.networkLower;
    }

    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89081, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89081, new Class[0], String.class);
        }
        return "GearSet{networkUpper=" + this.networkUpper + ", networkLower=" + this.networkLower + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}
