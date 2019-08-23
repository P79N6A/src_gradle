package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.v.b;
import okhttp3.HttpUrl;

public class DevicesNullInterceptorCornet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56956a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56956a, false, 60927, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56956a, false, 60927, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        HttpUrl parse = HttpUrl.parse(request.getUrl());
        HttpUrl.Builder newBuilder = parse.newBuilder();
        if (TextUtils.equals("", parse.queryParameter("device_id"))) {
            newBuilder.removeAllQueryParameters("device_id");
            parse = newBuilder.build();
        }
        return chain2.proceed(request.newBuilder().url(parse.toString()).build());
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56956a, false, 60926, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56956a, false, 60926, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, g.f56971a, true, 60928, new Class[]{DevicesNullInterceptorCornet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, g.f56971a, true, 60928, new Class[]{DevicesNullInterceptorCornet.class, Interceptor.Chain.class}, SsResponse.class);
        } else if (!(chain.metrics() instanceof b)) {
            return a(chain);
        } else {
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
}
