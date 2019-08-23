package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy;

import a.i;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.giphy.a.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/GiphyGifApi;", "", "getSearchingGiphy", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/input/gifsearch/giphy/model/GiphyGifsResponse;", "offset", "", "queryKey", "", "getTrendingGiphy", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface GiphyGifApi {
    @NotNull
    @GET(a = "im/resources/gifs/search/")
    i<c> getSearchingGiphy(@Query(a = "offset") int i, @NotNull @Query(a = "q") String str);

    @NotNull
    @GET(a = "im/resources/gifs/trending/")
    i<c> getTrendingGiphy(@Query(a = "offset") int i);
}
