package com.ss.android.ugc.aweme.sticker.prop.api;

import com.bytedance.retrofit2.Call;
import com.ss.android.ugc.aweme.sticker.model.e;
import com.ss.android.ugc.aweme.sticker.prop.a.a;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface StickerPropApi {
    @GET(a = "/aweme/v1/sticker/detail/")
    Call<e> getStickerDetail(@Query(a = "sticker_ids") String str);

    @GET(a = "/aweme/v1/sticker/aweme/")
    Call<a> queryStickerAwemeList(@Query(a = "sticker_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i);
}
