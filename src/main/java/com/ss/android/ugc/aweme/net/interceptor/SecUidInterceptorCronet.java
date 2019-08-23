package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.v.b;
import okhttp3.HttpUrl;

public class SecUidInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56961a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56961a, false, 60953, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56961a, false, 60953, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        HttpUrl parse = HttpUrl.parse(request.getUrl());
        if (parse != null) {
            HttpUrl.Builder newBuilder = parse.newBuilder();
            for (String str : dr.f75763b) {
                String queryParameter = parse.queryParameter(str);
                String queryParameter2 = parse.queryParameter("sec_" + str);
                String a2 = dr.a().a(queryParameter);
                if (TextUtils.isEmpty(queryParameter2) && !TextUtils.isEmpty(a2)) {
                    if (dr.a().f75767f) {
                        newBuilder.removeAllQueryParameters(str);
                    }
                    newBuilder.setQueryParameter("sec_" + str, a2);
                }
            }
            request = request.newBuilder().url(newBuilder.build().toString()).build();
        }
        return chain2.proceed(request);
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56961a, false, 60952, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56961a, false, 60952, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, p.f56982a, true, 60954, new Class[]{SecUidInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, p.f56982a, true, 60954, new Class[]{SecUidInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
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
