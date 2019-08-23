package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.v.b;
import me.ele.lancet.base.annotations.ImplementedInterface;
import me.ele.lancet.base.annotations.Insert;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56965a;

    @ImplementedInterface
    @Insert
    static SsResponse a(ApiAlisgInterceptor apiAlisgInterceptor, Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{apiAlisgInterceptor, chain}, null, f56965a, true, 60912, new Class[]{ApiAlisgInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{apiAlisgInterceptor, chain}, null, f56965a, true, 60912, new Class[]{ApiAlisgInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
        } else if (!(chain.metrics() instanceof b)) {
            return apiAlisgInterceptor.a(chain);
        } else {
            b bVar = (b) chain.metrics();
            if (bVar.f75984e > 0) {
                bVar.a(bVar.g, SystemClock.uptimeMillis() - bVar.f75984e);
            }
            bVar.a(apiAlisgInterceptor.getClass().getSimpleName());
            bVar.f75984e = SystemClock.uptimeMillis();
            SsResponse<?> a2 = apiAlisgInterceptor.a(chain);
            if (bVar.f75985f > 0) {
                bVar.a(apiAlisgInterceptor.getClass().getSimpleName(), SystemClock.uptimeMillis() - bVar.f75985f);
            }
            bVar.f75985f = SystemClock.uptimeMillis();
            return a2;
        }
    }
}
