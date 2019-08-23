package com.ss.android.ugc.aweme.commercialize.coupon.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

public class c extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("abbr_condition")
    private String abbrCondition;
    @SerializedName("activity_id")
    private int activityId;
    @SerializedName("codabar_image_url")
    private String codabarImageUrl;
    @SerializedName("code")
    private String code;
    @SerializedName("code_id")
    private String codeId;
    @SerializedName("condition")
    private String condition;
    @SerializedName("coupon_id")
    private int couponId;
    @SerializedName("coupon_source")
    private int couponSource;
    @SerializedName("coupon_type")
    private int couponType;
    @SerializedName("create_time")
    private String createTime;
    @SerializedName("desc")
    private String desc;
    @SerializedName("detail_url")
    private String detailUrl;
    @SerializedName("group")
    private String group;
    @SerializedName("head_image_url")
    private UrlModel headImageUrl;
    @SerializedName("hint_text")
    public String hintText;
    @SerializedName("is_default_head_image")
    private boolean isDefaultHeadImage;
    @SerializedName("logo_image_url")
    private UrlModel logoImageUrl;
    @SerializedName("sec_uid")
    private String mSecUid;
    @SerializedName("merchant_name")
    private String merchantName;
    @SerializedName("notification")
    private String notification;
    @SerializedName("pay_type")
    private int payType;
    @SerializedName("poi_list")
    private List<String> poiList;
    @SerializedName("qrcode_url")
    private UrlModel qrCodeUrl;
    @SerializedName("service_tel")
    private String serviceTel;
    @SerializedName("status")
    private int status;
    @SerializedName("store_page_link")
    private String storePageLink;
    @SerializedName("title")
    private String title;
    @SerializedName("use_page_link")
    private String usePageLink;
    @SerializedName("user_id")
    private Long userId;
    @SerializedName("valid_date_text")
    public String validDateText;
    @SerializedName("valid_end")
    private String validEnd;
    @SerializedName("valid_start")
    private String validStart;

    public String getAbbrCondition() {
        return this.abbrCondition;
    }

    public int getActivityId() {
        return this.activityId;
    }

    public String getCodabarImageUrl() {
        return this.codabarImageUrl;
    }

    public String getCode() {
        return this.code;
    }

    public String getCodeId() {
        return this.codeId;
    }

    public String getCondition() {
        return this.condition;
    }

    public int getCouponId() {
        return this.couponId;
    }

    public int getCouponSource() {
        return this.couponSource;
    }

    public int getCouponType() {
        return this.couponType;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDetailUrl() {
        return this.detailUrl;
    }

    public String getGroup() {
        return this.group;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public UrlModel getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getNotification() {
        return this.notification;
    }

    public int getPayType() {
        return this.payType;
    }

    public List<String> getPoiList() {
        return this.poiList;
    }

    public UrlModel getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public String getSecUid() {
        return this.mSecUid;
    }

    public String getServiceTel() {
        return this.serviceTel;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStorePageLink() {
        return this.storePageLink;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUsePageLink() {
        return this.usePageLink;
    }

    public Long getUserId() {
        return this.userId;
    }

    public String getValidEnd() {
        return this.validEnd;
    }

    public String getValidStart() {
        return this.validStart;
    }

    public boolean isDefaultHeadImage() {
        return this.isDefaultHeadImage;
    }

    public void setAbbrCondition(String str) {
        this.abbrCondition = str;
    }

    public void setActivityId(int i) {
        this.activityId = i;
    }

    public void setCodabarImageUrl(String str) {
        this.codabarImageUrl = str;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setCodeId(String str) {
        this.codeId = str;
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public void setCouponId(int i) {
        this.couponId = i;
    }

    public void setCouponSource(int i) {
        this.couponSource = i;
    }

    public void setCouponType(int i) {
        this.couponType = i;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setDefaultHeadImage(boolean z) {
        this.isDefaultHeadImage = z;
    }

    public void setDetailUrl(String str) {
        this.detailUrl = str;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setLogoImageUrl(UrlModel urlModel) {
        this.logoImageUrl = urlModel;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setNotification(String str) {
        this.notification = str;
    }

    public void setPoiList(List<String> list) {
        this.poiList = list;
    }

    public void setQrCodeUrl(UrlModel urlModel) {
        this.qrCodeUrl = urlModel;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setServiceTel(String str) {
        this.serviceTel = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStorePageLink(String str) {
        this.storePageLink = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUsePageLink(String str) {
        this.usePageLink = str;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }

    public void setValidEnd(String str) {
        this.validEnd = str;
    }

    public void setValidStart(String str) {
        this.validStart = str;
    }
}
