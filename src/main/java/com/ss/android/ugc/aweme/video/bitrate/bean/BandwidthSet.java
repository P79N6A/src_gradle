package com.ss.android.ugc.aweme.video.bitrate.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.lib.video.bitrate.regulator.a.b;

@Keep
public class BandwidthSet implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bitrate")
    private double bitRate;
    @SerializedName("speed")
    private double speed;

    public double getBitrate() {
        return this.bitRate;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89078, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89078, new Class[0], String.class);
        }
        return "BandwidthSet{speed=" + this.speed + ", bitRate=" + this.bitRate + '}';
    }

    public void setBitRate(long j) {
        this.bitRate = (double) j;
    }

    public void setSpeed(int i) {
        this.speed = (double) i;
    }
}
