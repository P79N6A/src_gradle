package com.ss.android.ugc.aweme.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.net.a.j;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class OKHttpSwitchInterceptor implements INetReleaseInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean forRelease() {
        return false;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, changeQuickRedirect, false, 60768, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, changeQuickRedirect, false, 60768, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        if (a.a() && j.a() != null && j.a().n) {
            request = request.newBuilder().url(request.url().toString().replace("api.amemv.com", "aweme.snssdk.com")).build();
        }
        return chain2.proceed(request);
    }
}
