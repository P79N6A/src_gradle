package com.ss.android.ugc.aweme.sign;

import com.google.common.util.concurrent.q;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class RecordManager {

    /* renamed from: a  reason: collision with root package name */
    private static RecordApi f71501a = ((RecordApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RecordApi.class));

    interface RecordApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/sign/gain/url/")
        q<RecordResponseInfo> getRecordInfo(@Query(a = "video_id") String str);
    }
}
