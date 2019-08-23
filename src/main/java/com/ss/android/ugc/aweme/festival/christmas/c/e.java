package com.ss.android.ugc.aweme.festival.christmas.c;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public class e extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("donation_item_ids")
    private long[] donationItemCount;
    @SerializedName("global_statistics")
    private k globalDonationInfo;
    @SerializedName("left_count")
    private f leftCount;
    @SerializedName("self_donation")
    private n mSelfDonationInfo;
    @SerializedName("copywriting")
    private l postCopyWriting;
    @SerializedName("valid_donation")
    private boolean validDonation;

    public long[] getDonationItemCount() {
        return this.donationItemCount;
    }

    public k getGlobalDonationInfo() {
        return this.globalDonationInfo;
    }

    public f getLeftCount() {
        return this.leftCount;
    }

    public l getPostCopyWriting() {
        return this.postCopyWriting;
    }

    public n getSelfDonationInfo() {
        return this.mSelfDonationInfo;
    }

    public boolean isValidDonation() {
        return this.validDonation;
    }

    public void setDonationItemCount(long[] jArr) {
        this.donationItemCount = jArr;
    }

    public void setGlobalDonationInfo(k kVar) {
        this.globalDonationInfo = kVar;
    }

    public void setLeftCount(f fVar) {
        this.leftCount = fVar;
    }

    public void setPostCopyWriting(l lVar) {
        this.postCopyWriting = lVar;
    }

    public void setSelfDonationInfo(n nVar) {
        this.mSelfDonationInfo = nVar;
    }

    public void setValidDonation(boolean z) {
        this.validDonation = z;
    }
}
