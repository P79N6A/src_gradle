package com.ss.android.ugc.aweme.translation.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.model.b;
import com.ss.android.ugc.aweme.translation.model.d;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class TranslationApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74959a;

    /* renamed from: b  reason: collision with root package name */
    private static IRetrofitService f74960b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    public interface RealApi {
        @FormUrlEncoded
        @POST(a = "/aweme/v1/contents/translation/")
        q<b> getMultiTranslation(@Field(a = "trg_lang") String str, @Field(a = "translation_info") String str2);

        @GET(a = "/aweme/v1/content/translation/")
        q<d> getTranslation(@Query(a = "content") String str, @Query(a = "src_lang") String str2, @Query(a = "trg_lang") String str3);
    }

    public static RealApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f74959a, true, 87289, new Class[0], RealApi.class)) {
            return (RealApi) PatchProxy.accessDispatch(new Object[0], null, f74959a, true, 87289, new Class[0], RealApi.class);
        }
        return (RealApi) f74960b.createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class);
    }

    public static d a(String str, String str2, String str3) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f74959a, true, 87290, new Class[]{String.class, String.class, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f74959a, true, 87290, new Class[]{String.class, String.class, String.class}, d.class);
        }
        try {
            return (d) a().getTranslation(str4, str5, str6).get();
        } catch (ExecutionException e2) {
            throw f74960b.propagateCompatibleException(e2);
        }
    }
}
