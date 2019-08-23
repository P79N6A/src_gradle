package com.mapbox.api.speech.v1;

import okhttp3.ResponseBody;
import retrofit2.b;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface SpeechService {
    @GET(a = "/voice/v1/speak/{text}")
    b<ResponseBody> getCall(@Path(a = "text") String str, @Query(a = "textType") String str2, @Query(a = "language") String str3, @Query(a = "outputFormat") String str4, @Query(a = "access_token") String str5);
}
