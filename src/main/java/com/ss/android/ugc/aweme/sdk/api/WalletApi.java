package com.ss.android.ugc.aweme.sdk.api;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.sdk.bean.b;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WalletApi {
    @GET(a = "/aweme/v1/wallet/mywallet/")
    q<b> getMyWallet(@Query(a = "diamond_type") int i);
}
