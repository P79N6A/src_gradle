package com.bytedance.frameworks.baselib.network.http.retrofit;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.b;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;

public class BaseSsInterceptor implements Interceptor {
    /* access modifiers changed from: protected */
    public void intercept(Request request, SsResponse ssResponse) throws Exception {
    }

    private String tryAddCommonParams(String str) {
        try {
            return e.a(str, true);
        } catch (Throwable unused) {
            return str;
        }
    }

    public SsResponse intercept$___twin___(Interceptor.Chain chain) throws Exception {
        Request intercept = intercept(chain.request());
        SsResponse proceed = chain.proceed(intercept);
        intercept(intercept, proceed);
        return proceed;
    }

    /* access modifiers changed from: protected */
    public Request intercept(Request request) {
        String str;
        if (request == null) {
            return request;
        }
        String url = request.getUrl();
        if (request.getExtraInfo() instanceof b) {
            str = e.a(url, (b) request.getExtraInfo());
        } else {
            str = e.a(url);
        }
        if (request.isAddCommonParam()) {
            str = tryAddCommonParams(str);
        }
        Request.Builder newBuilder = request.newBuilder();
        newBuilder.url(str);
        return newBuilder.build();
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!(chain.metrics() instanceof com.ss.android.ugc.aweme.v.b)) {
            return intercept$___twin___(chain);
        }
        com.ss.android.ugc.aweme.v.b bVar = (com.ss.android.ugc.aweme.v.b) chain.metrics();
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
