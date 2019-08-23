package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;

public interface AutoReplyApi {
    @FormUrlEncoded
    @POST("/webcast/room/set_auto_gift_thanks/")
    Observable<Object> enableAutoReply(@Field(a = "enabled") String str);
}
