package com.ss.android.account.token;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.ss.android.ugc.aweme.v.b;
import java.util.ArrayList;
import java.util.List;

public class AuthTokenInterceptor implements Interceptor {
    public static SsResponse a(Interceptor.Chain chain) throws Exception {
        Request request = chain.request();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders());
        c.a(request.getUrl(), (List<Header>) arrayList);
        SsResponse proceed = chain.proceed(request.newBuilder().headers(arrayList).build());
        c.b(request.getUrl(), proceed.headers());
        return proceed;
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (!(chain.metrics() instanceof b)) {
            return a(chain);
        }
        b bVar = (b) chain.metrics();
        if (bVar.f75984e > 0) {
            bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
        }
        bVar.a(getClass().getSimpleName());
        bVar.f75984e = SystemClock.uptimeMillis();
        SsResponse a2 = a(chain);
        if (bVar.f75985f > 0) {
            bVar.a(getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
        }
        bVar.f75985f = SystemClock.uptimeMillis();
        return a2;
    }
}
