package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.v.b;
import com.ss.android.ugc.aweme.v.d;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

public class CommonParamsInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56955a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56955a, false, 60923, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56955a, false, 60923, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        HttpUrl parse = HttpUrl.parse(request.getUrl());
        if (parse != null) {
            HttpUrl.Builder newBuilder = parse.newBuilder();
            HashMap hashMap = new HashMap();
            NetUtil.putCommonParams(hashMap, true);
            for (Map.Entry entry : hashMap.entrySet()) {
                newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            String httpUrl = newBuilder.build().toString();
            d.a(httpUrl);
            request = request.newBuilder().url(httpUrl).build();
        }
        return chain2.proceed(request);
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56955a, false, 60922, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56955a, false, 60922, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, f.f56970a, true, 60924, new Class[]{CommonParamsInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, f.f56970a, true, 60924, new Class[]{CommonParamsInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
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
