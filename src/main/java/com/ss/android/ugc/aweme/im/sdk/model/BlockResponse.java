package com.ss.android.ugc.aweme.im.sdk.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class BlockResponse extends BaseResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("block_status")
    int blockStaus;

    public int getBlockStaus() {
        return this.blockStaus;
    }

    public void setBlockStaus(int i) {
        this.blockStaus = i;
    }
}
