package com.ss.android.ugc.aweme.similarvideo.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.similarvideo.a.a;
import com.ss.android.ugc.aweme.similarvideo.a.b;
import java.util.concurrent.ExecutionException;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class SimilarVideoSearchApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71509a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f71510b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @POST(a = "https://aweme.snssdk.com/aweme/v1/ug/similar/entry/")
        q<a> hasSimilarVideo(@Query(a = "aweme_id") String str);

        @POST(a = "https://aweme.snssdk.com/aweme/v1/ug/similar/feed/")
        q<b> searchSimilarVideoList(@Query(a = "aweme_id") String str, @Query(a = "offset") long j, @Query(a = "count") int i);
    }

    public static a a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f71509a, true, 81615, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f71509a, true, 81615, new Class[]{String.class}, a.class);
        }
        try {
            return (a) ((RealApi) f71510b.create(RealApi.class)).hasSimilarVideo(str2).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static b a(String str, long j, int i) throws Exception {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, null, f71509a, true, 81616, new Class[]{String.class, Long.TYPE, Integer.TYPE}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), Integer.valueOf(i)}, null, f71509a, true, 81616, new Class[]{String.class, Long.TYPE, Integer.TYPE}, b.class);
        }
        try {
            return (b) ((RealApi) f71510b.create(RealApi.class)).searchSimilarVideoList(str2, j2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
