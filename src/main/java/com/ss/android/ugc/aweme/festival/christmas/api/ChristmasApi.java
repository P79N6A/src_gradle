package com.ss.android.ugc.aweme.festival.christmas.api;

import a.i;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.festival.christmas.c.a;
import com.ss.android.ugc.aweme.festival.christmas.c.e;
import com.ss.android.ugc.aweme.festival.christmas.c.h;
import com.ss.android.ugc.aweme.festival.christmas.c.p;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class ChristmasApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47231a;

    /* renamed from: b  reason: collision with root package name */
    private static API f47232b = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/activity/unlock/status/")
        q<a> getActivityUnlockStatus(@Query(a = "user_id") String str);

        @GET(a = "/aweme/v1/multi/aweme/detail/")
        i<BatchDetailList> getAwemeDetail(@Query(a = "aweme_ids") String str);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/activity/donation/create/")
        q<e> getDonationCreateInfo(@Field(a = "item_id") String str, @Field(a = "donation_type") int i);

        @GET(a = "/aweme/v1/activity/share/ecard/")
        i<h> getECardShareStats(@Query(a = "item_id") String str);

        @GET(a = "/aweme/v1/activity/share/stats/")
        i<p> getShareStats(@Query(a = "item_id") String str);

        @GET(a = "/aweme/v1/activity/share/record/")
        i<BaseResponse> reportShareEvent(@Query(a = "item_id") String str, @Query(a = "user_id") String str2);
    }

    public static API a() {
        return f47232b;
    }

    public static a a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f47231a, true, 43911, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str2}, null, f47231a, true, 43911, new Class[]{String.class}, a.class);
        }
        try {
            return (a) f47232b.getActivityUnlockStatus(str2).get();
        } catch (ExecutionException e2) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static e a(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f47231a, true, 43912, new Class[]{String.class, Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f47231a, true, 43912, new Class[]{String.class, Integer.TYPE}, e.class);
        }
        try {
            return (e) f47232b.getDonationCreateInfo(str2, i).get();
        } catch (ExecutionException e2) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
        }
    }
}
