package com.bytedance.android.livesdk.gift.assets;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface AssetsApi {
    @GET("/webcast/assets/{panel}/")
    Observable<d<b>> getAssets(@Path(a = "panel") String str, @Query(a = "download_assets_from") int i);
}
