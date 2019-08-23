package com.ss.android.ugc.aweme.commercialize.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class GameStationApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38493a;

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofit f38494b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f38495c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/microapp/aweme/")
        q<FeedItemList> getVideoList(@Query(a = "micro_app_id") String str, @Query(a = "hashtag_name") String str2, @Query(a = "count") long j, @Query(a = "cursor") long j2);
    }

    public static FeedItemList a(String str, String str2, long j, long j2) throws Exception {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j3), new Long(j4)}, null, f38493a, true, 30419, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, FeedItemList.class)) {
            Object[] objArr = {str, str2, new Long(j3), new Long(j4)};
            return (FeedItemList) PatchProxy.accessDispatch(objArr, null, f38493a, true, 30419, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, FeedItemList.class);
        }
        try {
            return (FeedItemList) ((RealApi) f38494b.create(RealApi.class)).getVideoList(str, str2, j, j2).get();
        } catch (ExecutionException e2) {
            throw f38495c.propagateCompatibleException(e2);
        }
    }
}
