package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

public final class n implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("charity_org")
    private String charityOrg;
    @SerializedName("currency")
    private int currency;
    @SerializedName("donation_amount")
    private double donationAmount;

    public final String getCharityOrg() {
        return this.charityOrg;
    }

    public final int getCurrency() {
        return this.currency;
    }

    public final double getDonationAmount() {
        return this.donationAmount;
    }

    public final void setCharityOrg(String str) {
        this.charityOrg = str;
    }

    public final void setCurrency(int i) {
        this.currency = i;
    }

    public final void setDonationAmount(double d2) {
        this.donationAmount = d2;
    }
}
