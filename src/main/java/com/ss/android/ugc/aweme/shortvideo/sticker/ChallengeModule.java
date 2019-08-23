package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.challenge.ChallengeType;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class ChallengeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69177a;

    /* renamed from: b  reason: collision with root package name */
    public final ChallengeDetailApi f69178b = ((ChallengeDetailApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ChallengeDetailApi.class));

    public interface ChallengeDetailApi {
        @GET(a = "/aweme/v1/challenge/detail/")
        q<ChallengeDetail> fetchChallengeDetail(@Query(a = "ch_id") String str, @Query(a = "hashtag_name") String str2, @ChallengeType.TYPE @Query(a = "query_type") int i, @Query(a = "click_reason") int i2);

        @GET(a = "/aweme/v1/commerce/challenge/detail/")
        q<ChallengeDetail> fetchCommerceChallengeDetail(@Query(a = "ch_id") String str, @Query(a = "hashtag_name") String str2, @ChallengeType.TYPE @Query(a = "query_type") int i, @Query(a = "click_reason") int i2);
    }
}
