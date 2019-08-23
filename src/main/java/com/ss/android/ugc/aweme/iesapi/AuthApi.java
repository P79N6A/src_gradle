package com.ss.android.ugc.aweme.iesapi;

import android.text.TextUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.f.b.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final class AuthApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50007a;

    /* renamed from: b  reason: collision with root package name */
    public static final AuthService f50008b = ((AuthService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(AuthService.class));

    public interface AuthService {
        @GET("/aweme/v1/user/sync/bind/")
        Call<String> bind(@Query(a = "bind_key") String str);

        @GET("/aweme/v1/user/sync/key/")
        Call<a> getToken(@Query(a = "product") int i);

        @GET("/aweme/v1/user/sync/bind/")
        Call<String> syncAll(@Query(a = "product") int i, @Query(a = "action") String str);

        @GET("/aweme/v1/user/sync/unbind/")
        Call<String> unBind(@Query(a = "product") int i);
    }

    public static int a(String str) {
        String str2 = str;
        char c2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f50007a, true, 49977, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f50007a, true, 49977, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return -1;
        } else {
            if (str.hashCode() != 1817585384 || !str2.equals("HOTSOON")) {
                c2 = 65535;
            }
            if (c2 != 0) {
                return -1;
            }
            return 1112;
        }
    }
}
