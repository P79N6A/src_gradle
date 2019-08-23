package com.ss.android.ugc.aweme.im.sdk.feedupdate;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import java.util.concurrent.CancellationException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class FeedUpdateApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51456a;

    /* renamed from: b  reason: collision with root package name */
    private static UpdateTagApi f51457b = ((UpdateTagApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(g.f52586b).create(UpdateTagApi.class));

    interface UpdateTagApi {
        @GET(a = "im/unreaditems/")
        i<FeedUpdate> fetchFeedUpdate(@Query(a = "cursor") long j);
    }

    public static FeedUpdate a(long j) {
        if (PatchProxy.isSupport(new Object[]{0L}, null, f51456a, true, 52060, new Class[]{Long.TYPE}, FeedUpdate.class)) {
            return (FeedUpdate) PatchProxy.accessDispatch(new Object[]{0L}, null, f51456a, true, 52060, new Class[]{Long.TYPE}, FeedUpdate.class);
        }
        try {
            i<FeedUpdate> fetchFeedUpdate = f51457b.fetchFeedUpdate(0);
            fetchFeedUpdate.g();
            if (fetchFeedUpdate.d()) {
                throw fetchFeedUpdate.f();
            } else if (!fetchFeedUpdate.c()) {
                return (FeedUpdate) fetchFeedUpdate.e();
            } else {
                throw new CancellationException();
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
