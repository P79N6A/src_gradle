package com.ss.android.ugc.aweme.commerce.preview.api;

import a.i;
import com.ss.android.ugc.aweme.commerce.preview.api.a.d;
import com.ss.android.ugc.aweme.commerce.preview.api.a.e;
import com.ss.android.ugc.aweme.commerce.preview.api.a.f;
import com.ss.android.ugc.aweme.commerce.preview.pops.a.b;
import com.ss.android.ugc.aweme.commerce.preview.pops.a.c;
import com.ss.android.ugc.aweme.commerce.service.models.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 42\u00020\u0001:\u00014J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'JB\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H'J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J@\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J8\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006H'J8\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'JV\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010'\u001a\u00020\u00062\b\b\u0001\u0010(\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006H'J@\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010+\u001a\u00020\u000f2\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H'JB\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u00062\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\"\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J,\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u000fH'J\u0018\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u00103\u001a\u00020\u0006H'¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/PreviewApi;", "", "addShopCart", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/AddCartResponse;", "promotionId", "", "productId", "skuInfo", "appointPromotion", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "awemeId", "kolId", "secKolId", "type", "", "consumeCoupon", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "couponMetaId", "getCartCount", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/CartCountResponse;", "getShopCommentList", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewCommentListResponse;", "getShopFeeds", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewVideoIdsResponse;", "page", "size", "itemId", "getShopRecommend", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewRecommendResponse;", "authorId", "secAuthorId", "getUserTrace", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/UserTraceResponse;", "shopCoupon", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "shopCouponNew", "shopSku", "Lcom/ss/android/ugc/aweme/commerce/preview/pops/sku/ShopSkuResponse;", "originType", "enterMethod", "shopSkuDynamicInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "from", "shopWillList", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewWillListResponse;", "skuCheck", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "skuCheckV2", "userProfile", "Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/CUserResponse;", "userId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface PreviewApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37312a = a.f37313a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/PreviewApi$Companion;", "", "()V", "API_PORTFOLIO_FEED_RECOMMEND", "", "API_PROMOTION_APPOINT", "API_SHOP_ADD_CART", "API_SHOP_CART_COUNT", "API_SHOP_COMMENT_LIST", "API_SHOP_COUPON", "API_SHOP_COUPON_APPLY", "API_SHOP_COUPON_NEW", "API_SHOP_DYNAMIC_INFO", "API_SHOP_RECOMMEND", "API_SHOP_SKU", "API_SHOP_USER_TRACE", "API_SHOP_WILL_LIST", "API_USER_PROFILE", "SKU_CHECK", "SKU_CHECK_V2", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f37313a = new a();

        private a() {
        }
    }

    @NotNull
    @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/cart/add/")
    i<b> addShopCart(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @NotNull @Query(a = "sku") String str3);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/promotion/appoint/")
    i<com.ss.android.ugc.aweme.commerce.service.d.a> appointPromotion(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "aweme_id") String str2, @NotNull @Query(a = "kol_id") String str3, @Nullable @Query(a = "sec_kol_id") String str4, @Query(a = "op_type") int i);

    @NotNull
    @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/coupon/apply/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.a> consumeCoupon(@NotNull @Query(a = "coupon_meta_id") String str);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/cart/count/")
    i<c> getCartCount();

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/comment/list/")
    i<com.ss.android.ugc.aweme.commerce.preview.api.a.b> getShopCommentList(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/item/feed/")
    i<d> getShopFeeds(@Query(a = "page") int i, @Query(a = "size") int i2, @NotNull @Query(a = "item_id") String str, @NotNull @Query(a = "promotion_id") String str2, @NotNull @Query(a = "product_id") String str3);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/recommend/")
    i<com.ss.android.ugc.aweme.commerce.preview.api.a.c> getShopRecommend(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @NotNull @Query(a = "author_id") String str3, @Nullable @Query(a = "sec_author_id") String str4);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/user/trace/")
    i<f> getUserTrace(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "author_id") String str2, @Nullable @Query(a = "sec_author_id") String str3, @NotNull @Query(a = "aweme_id") String str4);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/coupons/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.b> shopCoupon(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/coupons/new/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.b> shopCouponNew(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/extra/")
    i<com.ss.android.ugc.aweme.commerce.preview.pops.a.d> shopSku(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @NotNull @Query(a = "origin_type") String str3, @NotNull @Query(a = "enter_method") String str4, @NotNull @Query(a = "aweme_id") String str5, @NotNull @Query(a = "author_id") String str6, @Nullable @Query(a = "sec_author_id") String str7);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/dynamic/info/")
    i<p> shopSkuDynamicInfo(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @Query(a = "from") int i, @NotNull @Query(a = "kol_id") String str3, @NotNull @Query(a = "sec_kol_id") String str4);

    @NotNull
    @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/willlist/")
    i<e> shopWillList(@NotNull @Query(a = "aweme_id") String str, @NotNull @Query(a = "promotion_id") String str2, @NotNull @Query(a = "author_id") String str3, @Nullable @Query(a = "sec_author_id") String str4, @Query(a = "type") int i);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/sku/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.c> skuCheck(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/sku/v2/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.c> skuCheckV2(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @Query(a = "button_type") int i);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/user/")
    i<com.ss.android.ugc.aweme.commerce.preview.api.a.a> userProfile(@NotNull @Query(a = "user_id") String str);
}
