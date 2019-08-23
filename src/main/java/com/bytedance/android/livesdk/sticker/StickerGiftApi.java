package com.bytedance.android.livesdk.sticker;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.gift.model.a;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;

public interface StickerGiftApi {
    @GET("/webcast/gift/user_name/check/")
    Observable<d<a>> checkUserNameLegality(@Query(a = "name") String str);
}
