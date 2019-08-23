package com.ss.android.ugc.aweme.story.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.model.StoryResponse;

public final class StoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71828a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final StoryService f71829b = ((StoryService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(StoryService.class));

    /* renamed from: c  reason: collision with root package name */
    private static boolean f71830c = true;

    public interface StoryService {
        @GET("/aweme/v1/story/")
        Call<StoryResponse> getStory(@Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "page_id") int i2, @Query(a = "is_cold_start") String str);

        @GET("/aweme/v1/story/addreview/")
        Call<BaseResponse> markRead(@Query(a = "story_uid") String str);
    }
}
