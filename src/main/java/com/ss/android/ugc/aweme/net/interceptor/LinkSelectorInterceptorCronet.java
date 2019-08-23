package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.v.b;

public class LinkSelectorInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56957a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56957a, false, 60934, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56957a, false, 60934, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        String url = request.getUrl();
        if (TextUtils.isEmpty(url) || !url.contains("maya/user/registered/")) {
            return chain2.proceed(request.newBuilder().url(NetworkUtils.filterUrl(request.getUrl())).build());
        }
        return chain2.proceed(request);
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56957a, false, 60933, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56957a, false, 60933, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, j.f56975a, true, 60935, new Class[]{LinkSelectorInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, j.f56975a, true, 60935, new Class[]{LinkSelectorInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
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
