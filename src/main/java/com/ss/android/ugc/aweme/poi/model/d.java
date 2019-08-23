package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.coupon.model.c;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import java.util.List;

public final class d implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_card")
    private a adCard;
    private int adSrc;
    @SerializedName("coupon")
    private c couponInfo;
    @SerializedName("coupon_type")
    private int couponType;

    public final a getAdCard() {
        return this.adCard;
    }

    public final int getAdSrc() {
        return this.adSrc;
    }

    public final c getCouponInfo() {
        return this.couponInfo;
    }

    public final int getCouponType() {
        return this.couponType;
    }

    public final List<AwemeRawAd> getAwemeRawAds() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65002, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65002, new Class[0], List.class);
        } else if (this.adCard != null) {
            return this.adCard.getAwemeAds();
        } else {
            return null;
        }
    }

    public final void parseRawData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65000, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65000, new Class[0], Void.TYPE);
            return;
        }
        if (this.adCard != null) {
            this.adCard.parseRawData();
        }
    }

    public final void setAdCard(a aVar) {
        this.adCard = aVar;
    }

    public final void setAdSrc(int i) {
        this.adSrc = i;
    }

    public final void setCouponInfo(c cVar) {
        this.couponInfo = cVar;
    }

    public final void setCouponType(int i) {
        this.couponType = i;
    }

    public final void setAwemeRawAds(List<AwemeRawAd> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 65001, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 65001, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.adCard != null) {
            this.adCard.setAwemeRawAds(list);
        }
    }
}
