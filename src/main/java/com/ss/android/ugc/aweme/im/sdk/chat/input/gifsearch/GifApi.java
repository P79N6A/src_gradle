package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch;

import a.i;
import com.google.gson.JsonPrimitive;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface GifApi {
    @GET
    i<JsonPrimitive> giphyAnalytics(@Url String str);
}
