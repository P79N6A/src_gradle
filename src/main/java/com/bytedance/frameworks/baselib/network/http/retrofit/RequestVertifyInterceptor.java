package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.ss.android.ugc.aweme.v.b;

public final class RequestVertifyInterceptor implements Interceptor {
    private Request interceptofend(Request request) {
        if (request != null && !request.isResponseStreaming()) {
            return tryAddRequestVertifyParams(request);
        }
        return request;
    }

    public final SsResponse intercept$___twin___(Interceptor.Chain chain) throws Exception {
        return chain.proceed(interceptofend(chain.request()));
    }

    private Request tryAddRequestVertifyParams(Request request) {
        try {
            String url = request.getUrl();
            request.isAddCommonParam();
            new Object[1][0] = request.getBody();
            e.b bVar = e.f19857f;
            if (bVar != null) {
                url = bVar.a(url);
            }
            Request.Builder newBuilder = request.newBuilder();
            newBuilder.url(url);
            return newBuilder.build();
        } catch (Throwable unused) {
            return request;
        }
    }

    public final SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!(chain.metrics() instanceof b)) {
            return intercept$___twin___(chain);
        }
        b bVar = (b) chain.metrics();
        if (bVar.f75984e > 0) {
            bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
        }
        bVar.a(getClass().getSimpleName());
        bVar.f75984e = SystemClock.uptimeMillis();
        SsResponse intercept$___twin___ = intercept$___twin___(chain);
        if (bVar.f75985f > 0) {
            bVar.a(getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
        }
        bVar.f75985f = SystemClock.uptimeMillis();
        return intercept$___twin___;
    }
}
