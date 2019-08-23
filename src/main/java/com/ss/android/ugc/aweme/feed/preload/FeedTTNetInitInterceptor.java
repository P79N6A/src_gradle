package com.ss.android.ugc.aweme.feed.preload;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.net.a.j;
import com.ss.android.ugc.aweme.v.b;

public class FeedTTNetInitInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45765a;

    private boolean a(Request request) {
        if (PatchProxy.isSupport(new Object[]{request}, this, f45765a, false, 41984, new Class[]{Request.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{request}, this, f45765a, false, 41984, new Class[]{Request.class}, Boolean.TYPE)).booleanValue();
        }
        String path = request.getPath();
        if (TextUtils.isEmpty(path) || !path.contains("/aweme/v1/feed/")) {
            return false;
        }
        return true;
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f45765a, false, 41983, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f45765a, false, 41983, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (ag.i().f3142b) {
            if (a(chain.request())) {
                ag.i().b();
                j.b();
                ag.i().c();
            }
        }
        return chain2.proceed(chain.request());
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f45765a, false, 41982, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f45765a, false, 41982, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, g.f45778a, true, 41985, new Class[]{FeedTTNetInitInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, g.f45778a, true, 41985, new Class[]{FeedTTNetInitInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
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
