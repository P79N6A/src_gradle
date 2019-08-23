package com.ss.android.ugc.aweme.miniapp.api;

import com.bytedance.retrofit2.http.MaxLength;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.d;
import com.ss.android.ugc.aweme.miniapp_api.model.e;
import com.ss.android.ugc.aweme.miniapp_api.model.g;
import com.ss.android.ugc.aweme.miniapp_api.model.i;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public final class MicroAppApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55474a;

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofit f55475b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f55476c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    public interface RealApi {
        @GET
        q<String> executeGet(@MaxLength int i, @Url String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/microapp/follow/relation/")
        q<e> getFollowRelation(@Query(a = "from_user_token") String str, @Query(a = "to_user_id") long j);

        @GET(a = "https://gate.snssdk.com/developer/api/get_gid/")
        q<d> getGid(@Query(a = "alias_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/microapp/record/list/")
        q<g> getMicroAppList(@Query(a = "page") int i, @Query(a = "page_size") int i2, @Query(a = "list_type") int i3);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/microapp/mutual/follow/")
        q<BaseResponse> mutualFollowUser(@Query(a = "from_user_id") long j, @Query(a = "to_user_id") long j2, @Query(a = "sec_from_user_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/microapp/record/update/")
        q<i> updateMicroRecord(@Query(a = "schema") String str);
    }

    public static d b(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55474a, true, 59180, new Class[]{String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str2}, null, f55474a, true, 59180, new Class[]{String.class}, d.class);
        }
        try {
            return (d) ((RealApi) f55475b.create(RealApi.class)).getGid(str2).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }

    public static i a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55474a, true, 59177, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f55474a, true, 59177, new Class[]{String.class}, i.class);
        }
        try {
            return (i) ((RealApi) f55475b.create(RealApi.class)).updateMicroRecord(str2).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }

    public static e a(String str, long j) throws Exception {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, null, f55474a, true, 59178, new Class[]{String.class, Long.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, null, f55474a, true, 59178, new Class[]{String.class, Long.TYPE}, e.class);
        }
        try {
            return (e) ((RealApi) f55475b.create(RealApi.class)).getFollowRelation(str2, j2).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }

    public static BaseResponse a(long j, long j2) throws Exception {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, null, f55474a, true, 59179, new Class[]{Long.TYPE, Long.TYPE}, BaseResponse.class)) {
            Object[] objArr = {new Long(j3), new Long(j4)};
            return (BaseResponse) PatchProxy.accessDispatch(objArr, null, f55474a, true, 59179, new Class[]{Long.TYPE, Long.TYPE}, BaseResponse.class);
        }
        try {
            return (BaseResponse) ((RealApi) f55475b.create(RealApi.class)).mutualFollowUser(j, j2, dr.a().a(String.valueOf(j))).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }

    public static String a(int i, String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{20480, str2}, null, f55474a, true, 59181, new Class[]{Integer.TYPE, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{20480, str2}, null, f55474a, true, 59181, new Class[]{Integer.TYPE, String.class}, String.class);
        }
        try {
            return (String) ((RealApi) f55475b.create(RealApi.class)).executeGet(20480, str2).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }

    public static g a(int i, int i2, int i3) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f55474a, true, 59176, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, f55474a, true, 59176, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, g.class);
        }
        try {
            return (g) ((RealApi) f55475b.create(RealApi.class)).getMicroAppList(i, i2, i3).get();
        } catch (ExecutionException e2) {
            throw f55476c.propagateCompatibleException(e2);
        }
    }
}
