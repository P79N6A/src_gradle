package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class k implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("donation_all_amount")
    private double donationAllAmount;
    @SerializedName("join_count")
    private long joinCount;

    public final double getDonationAllAmount() {
        return this.donationAllAmount;
    }

    public final long getJoinCount() {
        return this.joinCount;
    }

    public final void setDonationAllAmount(double d2) {
        this.donationAllAmount = d2;
    }

    public final void setJoinCount(long j) {
        this.joinCount = j;
    }
}
