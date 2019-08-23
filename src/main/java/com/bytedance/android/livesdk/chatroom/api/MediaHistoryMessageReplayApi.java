package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.livesdk.message.proto.Response;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.gson.JsonObject;

public interface MediaHistoryMessageReplayApi {
    @GET("/webcast/media/room_history_msg?format=json")
    Call<JsonObject> fetchMessageUseJson(@Query(a = "room_id") long j);

    @GET("/webcast/media/room_history_msg")
    Call<Response> fetchMessageUsePb(@Query(a = "room_id") long j);
}
