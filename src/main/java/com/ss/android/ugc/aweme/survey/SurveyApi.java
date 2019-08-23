package com.ss.android.ugc.aweme.survey;

import a.i;
import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.g.a;
import javax.annotation.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@SuppressLint({"LogNotTimber"})
public final class SurveyApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74494a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f74495b = a.a();

    /* renamed from: c  reason: collision with root package name */
    private static final SurveyRetrofit f74496c = ((SurveyRetrofit) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SurveyRetrofit.class));

    interface SurveyRetrofit {
        @GET(a = "/aweme/v1/survey/get/")
        i<e> getSurveyData();

        @GET(a = "/aweme/v1/survey/record/")
        i<Object> recordAnswer(@Query(a = "action_type") int i, @Query(a = "dialog_id") int i2, @Query(a = "original_id") int i3);
    }

    @Nullable
    static i<e> a() {
        if (PatchProxy.isSupport(new Object[0], null, f74494a, true, 86681, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f74494a, true, 86681, new Class[0], i.class);
        }
        try {
            return f74496c.getSurveyData();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    static i<Object> a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f74494a, true, 86682, new Class[]{c.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f74494a, true, 86682, new Class[]{c.class}, i.class);
        }
        try {
            return f74496c.recordAnswer(cVar2.f74499b, cVar2.f74500c, cVar2.f74501d);
        } catch (Throwable unused) {
            return null;
        }
    }
}
