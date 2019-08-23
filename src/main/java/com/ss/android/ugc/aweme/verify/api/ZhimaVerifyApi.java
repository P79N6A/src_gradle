package com.ss.android.ugc.aweme.verify.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.MaxLength;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.k;
import java.io.IOException;

public final class ZhimaVerifyApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75998a;

    interface VerifyApi {
        @GET("/aweme/v1/wallet/zhima/result/")
        Call<String> getVerifyResult(@MaxLength int i);
    }

    public static String a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f75998a, true, 88806, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f75998a, true, 88806, new Class[0], String.class);
        }
        if (NetworkUtils.isNetworkAvailable(k.a())) {
            return (String) ((VerifyApi) m.a("http://aweme.snssdk.com").create(VerifyApi.class)).getVerifyResult(0).execute().body();
        }
        throw new IOException();
    }
}
