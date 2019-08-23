package com.ss.android.ugc.aweme.net.interceptor;

import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.token.c;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import com.ss.android.ugc.aweme.net.ai;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class AwemeAuthTokenInterceptor implements INetReleaseInterceptor {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean forRelease() {
        return true;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, changeQuickRedirect, false, 60920, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, changeQuickRedirect, false, 60920, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        ArrayList arrayList = new ArrayList(ai.a(request.headers()));
        c.a(request.url().toString(), (List<Header>) arrayList);
        Headers a2 = ai.a((List<Header>) arrayList);
        Request.Builder newBuilder = request.newBuilder();
        if (a2 == null) {
            a2 = request.headers();
        }
        Response proceed = chain2.proceed(newBuilder.headers(a2).build());
        c.b(request.url().toString(), ai.a(proceed.headers()));
        return proceed;
    }
}
