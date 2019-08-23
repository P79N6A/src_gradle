package com.ss.android.ugc.aweme.message.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.ss.android.ugc.aweme.message.model.NoticeList;

public interface NotificationApi {
    @GET("/aweme/v1/notice/count/")
    Call<NoticeList> query(@Query(a = "source") int i, @Query(a = "second_tab_type") int i2, @Query(a = "follow_tab_position") int i3);
}
