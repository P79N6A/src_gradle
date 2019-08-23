package com.ss.android.ugc.aweme.im.sdk.chat.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public class ShareCouponContent extends BaseContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    private String activityId;
    @SerializedName("coupon_desc")
    private String couponDesc;
    @SerializedName("coupon_id")
    private String couponId;
    @SerializedName("merchant_icon_url")
    private UrlModel merchantIconUrl;
    @SerializedName("poi_id")
    private String poiId;
    @SerializedName("poi_name")
    private String poiName;

    public String getActivityId() {
        return this.activityId;
    }

    public String getCouponDesc() {
        return this.couponDesc;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public UrlModel getMerchantIconUrl() {
        return this.merchantIconUrl;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public String getMsgHint() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51145, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51145, new Class[0], String.class);
        }
        return GlobalContext.getContext().getResources().getString(C0906R.string.aw_, new Object[]{this.poiName});
    }

    public IShareService.ShareStruct generateShareStruct() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 51147, new Class[0], IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 51147, new Class[0], IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.itemType = "coupon";
        shareStruct.videoCover = this.merchantIconUrl;
        shareStruct.description = this.couponDesc;
        shareStruct.shareText = String.format(GlobalContext.getContext().getResources().getString(C0906R.string.a35), new Object[]{this.poiName, this.couponDesc});
        return shareStruct;
    }

    public void setActivityId(String str) {
        this.activityId = str;
    }

    public void setCouponDesc(String str) {
        this.couponDesc = str;
    }

    public void setCouponId(String str) {
        this.couponId = str;
    }

    public void setMerchantIconUrl(UrlModel urlModel) {
        this.merchantIconUrl = urlModel;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }

    public void setPoiName(String str) {
        this.poiName = str;
    }

    public static ShareCouponContent fromShareStruct(IShareService.ShareStruct shareStruct) {
        IShareService.ShareStruct shareStruct2 = shareStruct;
        if (PatchProxy.isSupport(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51146, new Class[]{IShareService.ShareStruct.class}, ShareCouponContent.class)) {
            return (ShareCouponContent) PatchProxy.accessDispatch(new Object[]{shareStruct2}, null, changeQuickRedirect, true, 51146, new Class[]{IShareService.ShareStruct.class}, ShareCouponContent.class);
        }
        ShareCouponContent shareCouponContent = new ShareCouponContent();
        shareCouponContent.merchantIconUrl = shareStruct2.videoCover;
        shareCouponContent.poiId = shareStruct2.poiId;
        shareCouponContent.poiName = shareStruct2.extraParams.get("poi_name");
        shareCouponContent.activityId = shareStruct2.extraParams.get("activity_id");
        shareCouponContent.couponDesc = shareStruct2.extraParams.get("coupon_desc");
        shareCouponContent.couponId = shareStruct2.extraParams.get("coupon_id");
        return shareCouponContent;
    }
}
