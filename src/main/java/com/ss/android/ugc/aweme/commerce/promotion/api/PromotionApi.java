package com.ss.android.ugc.aweme.commerce.promotion.api;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJH\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0006H'¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/promotion/api/PromotionApi;", "", "getPromotionsV2", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/promotion/api/vo/PromotionsResponse;", "promotionId", "", "productId", "awemeId", "authorId", "secAuthorId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface PromotionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37682a = a.f37683a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/promotion/api/PromotionApi$Companion;", "", "()V", "API_GET_PROMOTIONS", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f37683a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/promotion/")
    i<com.ss.android.ugc.aweme.commerce.promotion.api.a.a> getPromotionsV2(@Nullable @Query(a = "promotion_id") String str, @Nullable @Query(a = "product_id") String str2, @Nullable @Query(a = "aweme_id") String str3, @NotNull @Query(a = "author_id") String str4, @Nullable @Query(a = "sec_author_id") String str5);
}
