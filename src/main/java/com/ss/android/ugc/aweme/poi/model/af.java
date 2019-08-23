package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import java.io.Serializable;

public class af extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon")
    private c couponInfo;

    public c getCouponInfo() {
        return this.couponInfo;
    }

    public void setCouponInfo(c cVar) {
        this.couponInfo = cVar;
    }
}
