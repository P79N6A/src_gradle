package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR \u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR \u0010$\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR \u0010'\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR \u0010*\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001e\u0010-\u001a\u00020\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR \u00100\u001a\u0004\u0018\u0001018\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00106\u001a\u0004\u0018\u0001078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R \u0010<\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR \u0010B\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\f\"\u0004\bD\u0010\u000eR \u0010E\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR \u0010H\u001a\u0004\u0018\u00010I8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionToutiao;", "Ljava/io/Serializable;", "()V", "appointment", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;", "getAppointment", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;", "setAppointment", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionAppointment;)V", "cartUrl", "", "getCartUrl", "()Ljava/lang/String;", "setCartUrl", "(Ljava/lang/String;)V", "couponRule", "", "getCouponRule", "()Ljava/util/List;", "setCouponRule", "(Ljava/util/List;)V", "imUrl", "getImUrl", "setImUrl", "maxPrice", "", "getMaxPrice", "()I", "setMaxPrice", "(I)V", "minPrice", "getMinPrice", "setMinPrice", "orderTmaUrl", "getOrderTmaUrl", "setOrderTmaUrl", "orderUrl", "getOrderUrl", "setOrderUrl", "originId", "getOriginId", "setOriginId", "originType", "getOriginType", "setOriginType", "postType", "getPostType", "setPostType", "preSale", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;", "getPreSale", "()Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;", "setPreSale", "(Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionPreSale;)V", "reductionInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/TouTiaoFullReductionInfo;", "getReductionInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/TouTiaoFullReductionInfo;", "setReductionInfo", "(Lcom/ss/android/ugc/aweme/commerce/service/models/TouTiaoFullReductionInfo;)V", "secKillInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "getSecKillInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;", "setSecKillInfo", "(Lcom/ss/android/ugc/aweme/commerce/service/models/SeckillInfo;)V", "skuJsonString", "getSkuJsonString", "setSkuJsonString", "titlePrefix", "getTitlePrefix", "setTitlePrefix", "virtualPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;", "getVirtualPromotion", "()Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;", "setVirtualPromotion", "(Lcom/ss/android/ugc/aweme/commerce/service/models/VirtualPromotionBean;)V", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class r implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("appointment")
    @Nullable
    private PromotionAppointment appointment;
    @SerializedName("cart_url")
    @Nullable
    private String cartUrl;
    @SerializedName("coupon_rule")
    @Nullable
    private List<String> couponRule;
    @SerializedName("im_url")
    @Nullable
    private String imUrl;
    @SerializedName("max_price")
    private int maxPrice;
    @SerializedName("min_price")
    private int minPrice;
    @SerializedName("order_tma_url")
    @Nullable
    private String orderTmaUrl;
    @SerializedName("order_url")
    @Nullable
    private String orderUrl;
    @SerializedName("origin_id")
    @Nullable
    private String originId;
    @SerializedName("origin_type")
    @Nullable
    private String originType;
    @SerializedName("post_free")
    private int postType;
    @SerializedName("pre_sale")
    @Nullable
    private PromotionPreSale preSale;
    @SerializedName("full_reduction")
    @Nullable
    private af reductionInfo;
    @SerializedName("sec_kill_info")
    @Nullable
    private s secKillInfo;
    @SerializedName("sku")
    @Nullable
    private String skuJsonString;
    @SerializedName("title_prefix")
    @Nullable
    private String titlePrefix;
    @SerializedName("virtual_promotion")
    @Nullable
    private am virtualPromotion;

    @Nullable
    public final PromotionAppointment getAppointment() {
        return this.appointment;
    }

    @Nullable
    public final String getCartUrl() {
        return this.cartUrl;
    }

    @Nullable
    public final List<String> getCouponRule() {
        return this.couponRule;
    }

    @Nullable
    public final String getImUrl() {
        return this.imUrl;
    }

    public final int getMaxPrice() {
        return this.maxPrice;
    }

    public final int getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    public final String getOrderTmaUrl() {
        return this.orderTmaUrl;
    }

    @Nullable
    public final String getOrderUrl() {
        return this.orderUrl;
    }

    @Nullable
    public final String getOriginId() {
        return this.originId;
    }

    @Nullable
    public final String getOriginType() {
        return this.originType;
    }

    public final int getPostType() {
        return this.postType;
    }

    @Nullable
    public final PromotionPreSale getPreSale() {
        return this.preSale;
    }

    @Nullable
    public final af getReductionInfo() {
        return this.reductionInfo;
    }

    @Nullable
    public final s getSecKillInfo() {
        return this.secKillInfo;
    }

    @Nullable
    public final String getSkuJsonString() {
        return this.skuJsonString;
    }

    @Nullable
    public final String getTitlePrefix() {
        return this.titlePrefix;
    }

    @Nullable
    public final am getVirtualPromotion() {
        return this.virtualPromotion;
    }

    public final void setAppointment(@Nullable PromotionAppointment promotionAppointment) {
        this.appointment = promotionAppointment;
    }

    public final void setCartUrl(@Nullable String str) {
        this.cartUrl = str;
    }

    public final void setCouponRule(@Nullable List<String> list) {
        this.couponRule = list;
    }

    public final void setImUrl(@Nullable String str) {
        this.imUrl = str;
    }

    public final void setMaxPrice(int i) {
        this.maxPrice = i;
    }

    public final void setMinPrice(int i) {
        this.minPrice = i;
    }

    public final void setOrderTmaUrl(@Nullable String str) {
        this.orderTmaUrl = str;
    }

    public final void setOrderUrl(@Nullable String str) {
        this.orderUrl = str;
    }

    public final void setOriginId(@Nullable String str) {
        this.originId = str;
    }

    public final void setOriginType(@Nullable String str) {
        this.originType = str;
    }

    public final void setPostType(int i) {
        this.postType = i;
    }

    public final void setPreSale(@Nullable PromotionPreSale promotionPreSale) {
        this.preSale = promotionPreSale;
    }

    public final void setReductionInfo(@Nullable af afVar) {
        this.reductionInfo = afVar;
    }

    public final void setSecKillInfo(@Nullable s sVar) {
        this.secKillInfo = sVar;
    }

    public final void setSkuJsonString(@Nullable String str) {
        this.skuJsonString = str;
    }

    public final void setTitlePrefix(@Nullable String str) {
        this.titlePrefix = str;
    }

    public final void setVirtualPromotion(@Nullable am amVar) {
        this.virtualPromotion = amVar;
    }
}
