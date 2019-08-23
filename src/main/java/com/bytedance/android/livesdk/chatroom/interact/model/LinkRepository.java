package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.b;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import io.reactivex.Observable;
import java.util.HashMap;

public interface LinkRepository {
    @FormUrlEncoded
    @POST("/hotsoon/linkmic/{room_id}/apply/")
    Observable<d<b>> apply(@Path(a = "room_id") long j, @FieldMap HashMap<String, String> hashMap);
}
