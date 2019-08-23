package com.ss.android.ugc.aweme.share;

import android.support.annotation.Nullable;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.share.model.ShortenModel;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class ShortenUrlApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64559a;

    /* renamed from: b  reason: collision with root package name */
    static final RetrofitApi f64560b = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    interface RetrofitApi {
        @GET(a = "https://lf.snssdk.com/shorten/")
        q<ShortenModel> fetchShortenUrl(@Query(a = "target") String str, @Query(a = "belong") String str2, @Query(a = "persist") String str3);
    }

    @Nullable
    public static String a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f64559a, true, 73376, new Class[]{String.class, String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f64559a, true, 73376, new Class[]{String.class, String.class, String.class}, String.class);
        }
        try {
            return ((ShortenModel) f64560b.fetchShortenUrl(str4, str5, str6).get()).getData();
        } catch (Exception unused) {
            a.a();
            return null;
        }
    }
}
