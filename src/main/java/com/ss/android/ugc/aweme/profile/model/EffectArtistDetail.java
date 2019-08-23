package com.ss.android.ugc.aweme.profile.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

@Keep
public class EffectArtistDetail implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("total")
    public int total;

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
