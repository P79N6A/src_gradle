package com.ss.android.ugc.aweme.commerce.sdk.goods.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.g.a.c;
import com.ss.android.ugc.aweme.commerce.service.models.p;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0007J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0013H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/GoodsApiImpl;", "", "()V", "portfolioApi", "Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/GoodsApi;", "applyCoupon", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ConsumeCouponResponse;", "couponMetaId", "", "getCartCountCopy", "Lcom/ss/android/ugc/aweme/commerce/sdk/goods/api/CartCountResponseCopy;", "getShopCouponList", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/ShopCouponResponse;", "promotionId", "productId", "shopSkuDynamicInfo", "Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionDynamicInfoResponse;", "from", "", "skuCheckV2", "Lcom/ss/android/ugc/aweme/commerce/service/goods/api/SkuCheckResponse;", "buttonType", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37736a;

    /* renamed from: b  reason: collision with root package name */
    public static final GoodsApi f37737b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f37738c = new b();

    private b() {
    }

    static {
        Object create = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(com.ss.android.c.b.k + '/').create(GoodsApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ServiceManager.get().get…ate(GoodsApi::class.java)");
        f37737b = (GoodsApi) create;
    }

    @JvmStatic
    @NotNull
    public static final i<c> a(@NotNull String str, @NotNull String str2, int i) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, 1}, null, f37736a, true, 29265, new Class[]{String.class, String.class, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str3, str4, 1}, null, f37736a, true, 29265, new Class[]{String.class, String.class, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "promotionId");
        Intrinsics.checkParameterIsNotNull(str4, "productId");
        return f37737b.skuCheckV2(str3, str4, 1);
    }

    @JvmStatic
    @NotNull
    public static final i<p> b(@NotNull String str, @NotNull String str2, int i) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, 1}, null, f37736a, true, 29266, new Class[]{String.class, String.class, Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str3, str4, 1}, null, f37736a, true, 29266, new Class[]{String.class, String.class, Integer.TYPE}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "promotionId");
        Intrinsics.checkParameterIsNotNull(str4, "productId");
        return f37737b.shopSkuDynamicInfo(str3, str4, 1);
    }
}
