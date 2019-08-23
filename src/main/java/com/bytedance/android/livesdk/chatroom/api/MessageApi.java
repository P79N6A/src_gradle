package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.livesdk.message.proto.Response;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Path;
import com.google.gson.JsonObject;
import java.util.Map;

public interface MessageApi {
    @FormUrlEncoded
    @POST("/webcast/room/{room_id}/_fetch_message_polling/")
    Call<JsonObject> fetchMessageUseJson(@Path(a = "room_id") long j, @FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/webcast/room/{room_id}/_fetch_message_polling/")
    Call<Response> fetchMessageUsePb(@Path(a = "room_id") long j, @FieldMap Map<String, String> map);
}
