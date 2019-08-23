package com.ss.android.ugc.aweme.account.loginsetting;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import retrofit2.http.GET;

public final class LoginSettingApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32698a;

    public interface Api {
        @GET(a = "aweme/v1/bind/settings")
        q<String> getBindSetting();

        @GET(a = "aweme/v1/login/settings")
        q<String> getLoginSetting();
    }
}
