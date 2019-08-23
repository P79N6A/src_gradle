package com.ss.android.ugc.aweme.challenge.api;

import a.i;
import android.support.annotation.Nullable;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.challenge.model.mixfeed.ChallengeMixFeedList;
import com.ss.android.ugc.aweme.commercialize.utils.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.Map;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class ChallengeApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35343a;

    /* renamed from: b  reason: collision with root package name */
    public static final RealApi f35344b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    public interface RealApi {
        @GET
        q<ChallengeAwemeList> getChallengeAwemeList(@Url String str, @QueryMap Map<String, String> map);

        @GET
        q<ChallengeDetail> getChallengeDetail(@Url String str, @QueryMap Map<String, String> map);

        @GET(a = "/aweme/v1/recommend/challenge/")
        q<ChallengeList> getChallengeList(@QueryMap Map<String, String> map);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/challenge/aweme/single/")
        i<ChallengeMixFeedList> loadChallengeMixFeedList(@Query(a = "pull_type") @Constants.FeedPullType int i, @Nullable @Query(a = "ch_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i2, @Nullable @Query(a = "hashtag_name") String str2, @Query(a = "query_type") int i3);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/challenge/fresh/aweme/single/")
        i<ChallengeMixFeedList> loadFreshChallengeMixFeedList(@Query(a = "pull_type") @Constants.FeedPullType int i, @Nullable @Query(a = "ch_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i2, @Nullable @Query(a = "hashtag_name") String str2, @Query(a = "query_type") int i3);

        @FormUrlEncoded
        @POST("/aweme/v1/challenge/search/")
        q<SearchChallengeList> searchChallenge(@FieldMap Map<String, String> map);
    }

    public static ChallengeDetail a(String str, int i, boolean z) throws Exception {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, null, f35343a, true, 25805, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, ChallengeDetail.class)) {
            return (ChallengeDetail) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), Byte.valueOf(z)}, null, f35343a, true, 25805, new Class[]{String.class, Integer.TYPE, Boolean.TYPE}, ChallengeDetail.class);
        }
        if (r.b(str)) {
            str2 = "https://aweme.snssdk.com/aweme/v1/commerce/challenge/detail/";
        } else {
            str2 = "https://aweme.snssdk.com/aweme/v1/challenge/detail/";
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str3);
            hashMap.put("query_type", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } else {
            hashMap.put("ch_id", str3);
            hashMap.put("query_type", PushConstants.PUSH_TYPE_NOTIFY);
        }
        hashMap.put("click_reason", String.valueOf(i));
        return (ChallengeDetail) f35344b.getChallengeDetail(str2, hashMap).get();
    }
}
