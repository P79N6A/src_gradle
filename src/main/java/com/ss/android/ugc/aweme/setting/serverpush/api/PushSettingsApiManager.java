package com.ss.android.ugc.aweme.setting.serverpush.api;

import android.content.Context;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.a.c;
import com.ss.android.ugc.aweme.story.shootvideo.publish.a.f;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class PushSettingsApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64031a;

    /* renamed from: b  reason: collision with root package name */
    private static PushUserSettingsApi f64032b = ((PushUserSettingsApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PushUserSettingsApi.class));

    interface PushUserSettingsApi {
        @GET(a = "https://aweme.snssdk.com/maya/user/registered/")
        q<f> getRegisterDuoshanStatus();

        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/settings/")
        q<c> getUserSettings(@Query(a = "last_settings_version") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/set/settings/")
        q<BaseResponse> setItem(@Query(a = "field") String str, @Query(a = "value") int i);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/set/settings/")
        q<BaseResponse> setPrivateItem(@Query(a = "field") String str, @Query(a = "private_setting") int i);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/user/set/settings/")
        q<BaseResponse> setPrivateItem(@Query(a = "field") String str, @Query(a = "private_setting") int i, @Query(a = "aweme_id") String str2);

        @POST(a = "https://aweme.snssdk.com/aweme/v1/user/set/settings/")
        q<BaseResponse> setResidenceItem(@Query(a = "field") String str, @Query(a = "user_residence") String str2);
    }

    public static f a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f64031a, true, 72303, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f64031a, true, 72303, new Class[0], f.class);
        }
        try {
            return (f) f64032b.getRegisterDuoshanStatus().get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static c b() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f64031a, true, 72304, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f64031a, true, 72304, new Class[0], c.class);
        }
        try {
            return (c) f64032b.getUserSettings(b.b().b((Context) k.a(), "last_user_setting_version", "")).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static BaseResponse a(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f64031a, true, 72299, new Class[]{String.class, Integer.TYPE}, BaseResponse.class)) {
            return (BaseResponse) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f64031a, true, 72299, new Class[]{String.class, Integer.TYPE}, BaseResponse.class);
        }
        try {
            return (BaseResponse) f64032b.setItem(str2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static BaseResponse b(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f64031a, true, 72300, new Class[]{String.class, Integer.TYPE}, BaseResponse.class)) {
            return (BaseResponse) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f64031a, true, 72300, new Class[]{String.class, Integer.TYPE}, BaseResponse.class);
        }
        try {
            return (BaseResponse) f64032b.setPrivateItem(str2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static BaseResponse a(String str, int i, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str4}, null, f64031a, true, 72301, new Class[]{String.class, Integer.TYPE, String.class}, BaseResponse.class)) {
            return (BaseResponse) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str4}, null, f64031a, true, 72301, new Class[]{String.class, Integer.TYPE, String.class}, BaseResponse.class);
        }
        try {
            return (BaseResponse) f64032b.setPrivateItem(str3, i, str4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
