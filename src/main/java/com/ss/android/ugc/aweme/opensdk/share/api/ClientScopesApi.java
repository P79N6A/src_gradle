package com.ss.android.ugc.aweme.opensdk.share.api;

import com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ClientScopesApi {
    @FormUrlEncoded
    @POST(a = "/oauth/get_client_scopes/")
    Observable<ClientKeyScopesResponse> getClientScopes(@Field(a = "client_key") String str, @Field(a = "app_identity") String str2);
}
