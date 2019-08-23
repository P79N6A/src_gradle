package com.ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.annotations.SerializedName;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\f\rB\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend;", "", "()V", "recommendPromotion", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$RecommendPromotion;", "getRecommendPromotion", "()Ljava/util/List;", "shopInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$ShopInfo;", "getShopInfo", "()Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$ShopInfo;", "RecommendPromotion", "ShopInfo", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class v {
    @SerializedName("shop_info")
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final b f38234a;
    @SerializedName("recommend_promotion")
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f38235b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$RecommendPromotion;", "", "()V", "cover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getCover", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "price", "", "getPrice", "()I", "productId", "", "getProductId", "()Ljava/lang/String;", "promotionId", "getPromotionId", "title", "getTitle", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        @SerializedName("title")
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final String f38236a;
        @SerializedName("price")

        /* renamed from: b  reason: collision with root package name */
        public final int f38237b;
        @SerializedName("promotion_id")
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final String f38238c;
        @SerializedName("product_id")
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public final String f38239d;
        @SerializedName("cover")
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public final UrlModel f38240e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0006XD¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/ShopRecommend$ShopInfo;", "", "()V", "dd", "", "getDd", "()Ljava/lang/String;", "gapD", "", "getGapD", "()F", "gapR", "getGapR", "gapS", "getGapS", "logo", "getLogo", "name", "getName", "note", "getNote", "rr", "getRr", "ss", "getSs", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        @SerializedName("name")
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final String f38241a;
        @SerializedName("note")
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final String f38242b;
        @SerializedName("logo")
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final String f38243c;
        @SerializedName("D")
        @Nullable

        /* renamed from: d  reason: collision with root package name */
        public final String f38244d;
        @SerializedName("S")
        @Nullable

        /* renamed from: e  reason: collision with root package name */
        public final String f38245e;
        @SerializedName("R")
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public final String f38246f;
        @SerializedName("D_gap")
        public final float g;
        @SerializedName("S_gap")
        public final float h;
        @SerializedName("R_gap")
        public final float i;
    }
}
