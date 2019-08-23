package com.ss.android.ugc.aweme.commerce.portfolio.api;

import a.i;
import com.ss.android.ugc.aweme.commerce.portfolio.c;
import com.ss.android.ugc.aweme.commerce.service.models.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019Jm\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\u0013\u001a\u00020\t2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\tH'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\tH'¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/api/PortfolioApi;", "", "getShopGoodsList", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopPromotionListResponse;", "count", "", "cursor", "uid", "", "columnId", "sort", "type", "keyWord", "categoryId", "", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)Lbolts/Task;", "searchUserCategory", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserShopCategoryResponse;", "kolId", "secKolId", "requestFrom", "userProfile", "Lcom/ss/android/ugc/aweme/commerce/portfolio/UserResponse;", "userId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface PortfolioApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37048a = a.f37049a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/api/PortfolioApi$Companion;", "", "()V", "API_SEARCH_USER_CATEGORY", "", "API_SHOP_GOODS_LIST", "API_USER_PROFILE", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f37049a = new a();

        private a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class b {
    }

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/promotion/user/promotion/list/")
    i<u> getShopGoodsList(@Query(a = "count") int i, @Query(a = "cursor") int i2, @NotNull @Query(a = "user_id") String str, @Nullable @Query(a = "column_id") String str2, @Nullable @Query(a = "sort") Integer num, @Nullable @Query(a = "elastic_type") Integer num2, @Nullable @Query(a = "key_word") String str3, @Nullable @Query(a = "user_shop_category_id") Long l);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/user/category/query/")
    i<c> searchUserCategory(@NotNull @Query(a = "kol_id") String str, @Nullable @Query(a = "sec_kol_id") String str2, @Nullable @Query(a = "request_from") String str3);

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v1/user/")
    i<com.ss.android.ugc.aweme.commerce.portfolio.b> userProfile(@NotNull @Query(a = "user_id") String str);
}
