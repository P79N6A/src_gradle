package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import me.ele.lancet.base.annotations.ImplementedInterface;
import me.ele.lancet.base.annotations.Insert;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56966a;

    @ImplementedInterface
    @Insert
    static SsResponse a(ApiCheckInterceptor apiCheckInterceptor, Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{apiCheckInterceptor, chain}, null, f56966a, true, 60915, new Class[]{ApiCheckInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{apiCheckInterceptor, chain}, null, f56966a, true, 60915, new Class[]{ApiCheckInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
        } else if (!(chain.metrics() instanceof com.ss.android.ugc.aweme.v.b)) {
            return apiCheckInterceptor.a(chain);
        } else {
            com.ss.android.ugc.aweme.v.b bVar = (com.ss.android.ugc.aweme.v.b) chain.metrics();
            if (bVar.f75984e > 0) {
                bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
            }
            bVar.a(apiCheckInterceptor.getClass().getSimpleName());
            bVar.f75984e = SystemClock.uptimeMillis();
            SsResponse<?> a2 = apiCheckInterceptor.a(chain);
            if (bVar.f75985f > 0) {
                bVar.a(apiCheckInterceptor.getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
            }
            bVar.f75985f = SystemClock.uptimeMillis();
            return a2;
        }
    }
}
