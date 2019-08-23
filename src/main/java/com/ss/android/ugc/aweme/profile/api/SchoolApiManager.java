package com.ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.SchoolStruct;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class SchoolApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61321a;

    /* renamed from: b  reason: collision with root package name */
    public static SchoolApi f61322b = ((SchoolApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SchoolApi.class));

    public interface SchoolApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v2/school/list/")
        q<SchoolStruct> schoolList(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET(a = "https://aweme.snssdk.com/aweme/v2/school/nearest/")
        q<SchoolStruct> schoolNearby(@Query(a = "longitude") String str, @Query(a = "latitude") String str2);

        @GET(a = "https://aweme.snssdk.com/aweme/v2/school/search/")
        q<SchoolStruct> searchSchool(@Query(a = "keyword") String str, @Query(a = "cursor") int i, @Query(a = "count") int i2);
    }

    public static void a(Handler handler, String str, String str2) {
        Handler handler2 = handler;
        final String str3 = str;
        final String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{handler2, str3, str4}, null, f61321a, true, 67466, new Class[]{Handler.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler2, str3, str4}, null, f61321a, true, 67466, new Class[]{Handler.class, String.class, String.class}, Void.TYPE);
            return;
        }
        m.a().a(handler2, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61323a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f61323a, false, 67467, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f61323a, false, 67467, new Class[0], Object.class);
                }
                try {
                    return SchoolApiManager.f61322b.schoolNearby(str3, str4).get();
                } catch (ExecutionException e2) {
                    throw com.ss.android.ugc.aweme.app.api.m.a(e2);
                }
            }
        }, 1);
    }

    public static SchoolStruct a(String str, int i, int i2) throws Exception {
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61321a, true, 67465, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, SchoolStruct.class)) {
            return (SchoolStruct) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, null, f61321a, true, 67465, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, SchoolStruct.class);
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return (SchoolStruct) f61322b.schoolList(i3, i4).get();
            }
            return (SchoolStruct) f61322b.searchSchool(str2, i3, i4).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.app.api.m.a(e2);
        }
    }
}
