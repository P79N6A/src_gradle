package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.base.model.user.j;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Single;

public interface UploadApi {
    @POST("/webcast/certification/submit_cert_data/")
    Single<d<j>> upload(@Body TypedOutput typedOutput);
}
