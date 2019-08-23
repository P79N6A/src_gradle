package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.CollegeModel;
import java.util.concurrent.Callable;

public final class CollegeApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61313a;

    /* renamed from: b  reason: collision with root package name */
    public static final CollegeApi f61314b = ((CollegeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CollegeApi.class));

    public interface CollegeApi {
        @GET("/aweme/v2/school/colleges/")
        q<CollegeModel> searchCollege(@Query(a = "school_name") String str);
    }

    public static void a(Handler handler, String str, int i) {
        Handler handler2 = handler;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{handler2, str2, Integer.valueOf(i)}, null, f61313a, true, 67441, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str2, Integer.valueOf(i)}, null, f61313a, true, 67441, new Class[]{Handler.class, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61315a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f61315a, false, 67442, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f61315a, false, 67442, new Class[0], Object.class);
                }
                try {
                    return CollegeApiManager.f61314b.searchCollege(str2).get();
                } catch (Exception e2) {
                    return e2;
                }
            }
        }, i);
    }
}
