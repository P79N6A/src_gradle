package com.ss.android.ugc.aweme.commerce.sdk.goods.api;

import a.i;
import com.ss.android.ugc.aweme.commerce.service.g.a.b;
import com.ss.android.ugc.aweme.commerce.service.g.a.c;
import com.ss.android.ugc.aweme.commerce.service.models.p;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0010H'¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/GoodsApi;", "", "applyCoupon", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "couponMetaId", "", "getCartCount", "Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/CartCountResponseCopy;", "getShopCoupon", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "promotionId", "productId", "shopSkuDynamicInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "from", "", "skuCheckV2", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "type", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public interface GoodsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37733a = a.f37734a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/GoodsApi$Companion;", "", "()V", "API_SHOP_DYNAMIC_INFO", "", "SKU_CHECK_V2", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f37734a = new a();

        private a() {
        }
    }

    @NotNull
    @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/coupon/apply/")
    i<com.ss.android.ugc.aweme.commerce.service.g.a.a> applyCoupon(@NotNull @Query(a = "coupon_meta_id") String str);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/cart/count/")
    i<a> getCartCount();

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/coupons/new/")
    i<b> getShopCoupon(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/dynamic/info/")
    i<p> shopSkuDynamicInfo(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @Query(a = "from") int i);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/sku/v2/")
    i<c> skuCheckV2(@NotNull @Query(a = "promotion_id") String str, @NotNull @Query(a = "product_id") String str2, @Query(a = "button_type") int i);
}
