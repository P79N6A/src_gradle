package com.ss.android.ugc.aweme.net.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class i implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56974a;

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56974a, false, 60932, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56974a, false, 60932, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        HttpUrl parse = HttpUrl.parse(NetworkUtils.filterUrl(request.url().newBuilder().query(null).build().toString()));
        if (parse == null) {
            return chain2.proceed(request);
        }
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        newBuilder.host(parse.host());
        newBuilder.scheme(parse.scheme());
        return chain2.proceed(request.newBuilder().url(newBuilder.build()).build());
    }
}
