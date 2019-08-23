package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.f;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.mime.TypedOutput;
import io.reactivex.Single;
import java.util.HashMap;

public interface UserApi {
    @GET("/webcast/user/")
    Single<d<User>> queryUser(@Query(a = "target_uid") long j, @Query(a = "packed_level") long j2, @Query(a = "sec_target_uid") String str);

    @GET("/webcast/user/")
    Single<d<User>> queryUser(@QueryMap HashMap<String, String> hashMap);

    @POST("/webcast/room/upload/image/")
    Single<d<f>> uploadAvatar(@Body TypedOutput typedOutput);
}
