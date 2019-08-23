package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.tenor;

import a.i;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface TenorGifApi {
    @GET(a = "anonid")
    i<Object> getAnonId(@Query(a = "key") String str);

    @GET(a = "search")
    i<Object> getSearchGifs(@QueryMap Map<String, String> map);

    @GET(a = "trending")
    i<Object> getTrendingGifs(@QueryMap Map<String, String> map);

    @GET(a = "registershare")
    i<Object> registerShareGif(@QueryMap Map<String, String> map);
}
