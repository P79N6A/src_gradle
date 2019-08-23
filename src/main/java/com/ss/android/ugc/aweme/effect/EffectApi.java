package com.ss.android.ugc.aweme.effect;

import a.i;
import com.ss.android.ugc.aweme.feed.model.NewStickerItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class EffectApi {

    /* renamed from: a  reason: collision with root package name */
    private static API f43512a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/original/effect/list/")
        i<NewStickerItemList> getEffectList(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2, @Query(a = "cursor") long j, @Query(a = "count") int i);
    }

    public static API a() {
        return f43512a;
    }
}
