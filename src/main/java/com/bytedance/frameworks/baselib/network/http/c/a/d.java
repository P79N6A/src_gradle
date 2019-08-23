package com.bytedance.frameworks.baselib.network.http.c.a;

import com.bytedance.frameworks.baselib.network.http.e;
import java.io.IOException;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class d implements Interceptor {
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Map a2 = e.a(request.url().toString(), (Map) request.headers().toMultimap());
        if (a2 == null) {
            return chain.proceed(request);
        }
        Request.Builder builder = new Request.Builder();
        builder.url(request.url());
        builder.method(request.method(), request.body());
        builder.tag(request.tag());
        Headers.Builder newBuilder = request.headers().newBuilder();
        for (Map.Entry entry : a2.entrySet()) {
            newBuilder.add((String) entry.getKey(), (String) entry.getValue());
        }
        builder.headers(newBuilder.build());
        return chain.proceed(builder.build());
    }
}
