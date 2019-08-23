package com.ss.android.ugc.aweme.commerce.preview.pops.a;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R \u0010\u0019\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R \u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R \u0010(\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0013\"\u0004\b*\u0010\u0015R \u0010+\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R\"\u0010.\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000e¨\u00061"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/ShopSkuResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "()V", "detailImgs", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getDetailImgs", "()Ljava/util/List;", "setDetailImgs", "(Ljava/util/List;)V", "isHaveFootprint", "", "()Ljava/lang/Boolean;", "setHaveFootprint", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "orderTmaUrl", "", "getOrderTmaUrl", "()Ljava/lang/String;", "setOrderTmaUrl", "(Ljava/lang/String;)V", "orderUrl", "getOrderUrl", "setOrderUrl", "originId", "getOriginId", "setOriginId", "originType", "getOriginType", "setOriginType", "postFee", "", "getPostFee", "()I", "setPostFee", "(I)V", "sendFrom", "getSendFrom", "setSendFrom", "serviceInfoArrayStr", "getServiceInfoArrayStr", "setServiceInfoArrayStr", "skuJsonString", "getSkuJsonString", "setSkuJsonString", "wanted", "getWanted", "setWanted", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends a {
    @SerializedName("sku")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public String f37570a = "";
    @SerializedName("detail_imgs")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public List<? extends UrlModel> f37571b;
    @SerializedName("order_url")
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public String f37572c;
    @SerializedName("order_tma_url")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f37573d;
    @SerializedName("origin_id")
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public String f37574e;
    @SerializedName("origin_type")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f37575f;
    @SerializedName("is_wanted")
    @Nullable
    public Boolean g = Boolean.FALSE;
    @SerializedName("service_info")
    @Nullable
    public String h;
    @SerializedName("post_fee")
    public int i = -1;
    @SerializedName("send_from")
    @Nullable
    public String j;
    @SerializedName("has_footprint")
    @Nullable
    public Boolean k = Boolean.FALSE;
}
