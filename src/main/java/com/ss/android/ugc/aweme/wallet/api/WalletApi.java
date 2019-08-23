package com.ss.android.ugc.aweme.wallet.api;

import a.i;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;
import retrofit2.http.GET;

public interface WalletApi {
    @GET(a = "/aweme/v2/wallet/entrance/")
    i<WalletEntranceResponse> queryWalletEntrance();
}
