package com.ss.android.ugc.aweme.commerce.billshare.api;

import a.i;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/api/BillShareApi;", "", "billShare", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/commerce/billshare/api/vo/BillShareResponse;", "promotionId", "", "page", "", "size", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface BillShareApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36736a = a.f36737a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/api/BillShareApi$Companion;", "", "()V", "API_BILL_SHARE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f36737a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "https://aweme.snssdk.com/aweme/v2/shop/ordershare/items/")
    i<com.ss.android.ugc.aweme.commerce.billshare.api.a.a> billShare(@NotNull @Query(a = "promotion_id") String str, @Query(a = "page") int i, @Query(a = "size") int i2);
}
