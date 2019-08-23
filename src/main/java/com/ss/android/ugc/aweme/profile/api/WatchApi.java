package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.ss.android.ugc.aweme.profile.model.WatchStatus;
import java.util.Map;

public interface WatchApi {
    @FormUrlEncoded
    @POST("/aweme/v1/commit/watch/user/")
    Call<WatchStatus> turnPostNotification(@FieldMap Map<String, String> map);
}
