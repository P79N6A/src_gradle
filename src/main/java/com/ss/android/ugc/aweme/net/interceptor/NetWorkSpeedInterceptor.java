package com.ss.android.ugc.aweme.net.interceptor;

import com.facebook.d.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class NetWorkSpeedInterceptor implements INetReleaseInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean forRelease() {
        return true;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, changeQuickRedirect, false, 60936, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, changeQuickRedirect, false, 60936, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        d.a().b();
        Response proceed = chain2.proceed(request);
        d.a().c();
        return proceed;
    }
}
