package com.bytedance.android.livesdk.sticker.api;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface StickerReportApi {
    @FormUrlEncoded
    @POST("/webcast/gift/set_room_supported/")
    Observable<d<Object>> reportFaceGift(@Field(a = "room_id") long j, @Field(a = "gift_ids") String str);
}
