package com.bytedance.android.livesdk.wallet.api;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.wallet.a.e;
import com.bytedance.android.livesdk.wallet.a.f;
import com.bytedance.android.livesdk.wallet.a.g;
import com.bytedance.android.livesdk.wallet.a.h;
import com.bytedance.android.livesdk.wallet.a.i;
import com.bytedance.android.livesdkapi.depend.model.b;
import com.bytedance.android.livesdkapi.depend.model.c;
import com.bytedance.android.livesdkapi.depend.model.c.a;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

public interface WalletApi {
    @FormUrlEncoded
    @POST("/hotsoon/props/bundles/buy/")
    Observable<d<g>> buyPackage(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("/hotsoon/ward/buy/")
    Observable<d<g>> buyWard(@FieldMap HashMap<String, String> hashMap);

    @GET("/hotsoon/diamond/{dealId}/_buy/")
    Observable<d<c>> createOrder(@Path(a = "dealId") long j, @Query(a = "way") String str, @Query(a = "email") String str2, @Query(a = "pay_currency") String str3, @Query(a = "pay_method") String str4);

    @FormUrlEncoded
    @POST("/webcast/wallet/recharge/")
    Observable<d<com.bytedance.android.livesdk.wallet.a.d>> createOrderInfo(@Field(a = "diamond_id") String str);

    @GET("/hotsoon/diamond/{dealId}/_buy/")
    Observable<String> createOrderInfo(@Path(a = "dealId") String str, @Query(a = "way") int i);

    @GET("/webcast/wallet_api/diamond_buy/")
    Observable<d<a>> createPreOrder(@Query(a = "diamond_id") long j, @Query(a = "way") int i, @Query(a = "source") int i2, @Query(a = "currency") String str);

    @GET("/webcast/wallet_api/diamond_exchange/")
    Observable<d<Object>> diamondExchange(@Query(a = "diamond_count") long j);

    @GET("/hotsoon/wallet/payment_channels/")
    Observable<com.bytedance.android.live.core.network.response.c<f>> fetchOptionList();

    @GET("/hotsoon/wallet/pay/")
    Observable<d<Object>> flameChangeDiamond(@Query(a = "diamond_id") String str, @Query(a = "way") String str2);

    @GET("/webcast/diamond/?type=1")
    Observable<b> getDiamondList();

    @GET("/hotsoon/diamond/?type=1")
    Observable<b> getDiamondList(@Query(a = "entrance") int i);

    @GET("/hotsoon/diamond/first_charge/")
    Observable<String> getFirstCharge(@Query(a = "type") int i);

    @GET("https://wallet.snssdk.com/ies/checkout/api/query_recharge_pay_status/")
    Observable<com.bytedance.android.live.core.network.response.b<e, Extra>> getOrderStatus(@QueryMap Map<String, String> map);

    @GET("https://wallet.snssdk.com/ies/checkout/api/gen_recharge_param/")
    Observable<d<h>> getRechargeParam(@QueryMap Map<String, String> map);

    @GET("/webcast/wallet/info/")
    Observable<d<i>> getWalletInfo(@Query(a = "sec_user_id") String str);

    @FormUrlEncoded
    @POST("/hotsoon/wallet/google_pay_verify/")
    Observable<d<Object>> googlePayVerify(@FieldMap HashMap<String, String> hashMap);

    @GET("/webcast/wallet_api/first_charge/")
    Observable<d<com.bytedance.android.livesdk.wallet.a.c>> isFirstCharge();

    @GET("/webcast/wallet_api/query_order/")
    Observable<com.bytedance.android.livesdk.wallet.a.a> queryOrder(@Query(a = "order_id") String str);

    @GET("/webcast/wallet_api/i18n_cashier/")
    Observable<com.bytedance.android.live.core.network.response.a<Object, Object>> vigoChargeDeals();

    @GET("/hotsoon/wallet/vigo_recharge/")
    Observable<com.bytedance.android.live.core.network.response.a<Object, Object>> vigoRecharge();
}
