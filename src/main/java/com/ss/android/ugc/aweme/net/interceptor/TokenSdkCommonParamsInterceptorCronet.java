package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.v.b;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

public class TokenSdkCommonParamsInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56963a;

    /* renamed from: b  reason: collision with root package name */
    String f56964b;

    public TokenSdkCommonParamsInterceptorCronet(String str) {
        this.f56964b = str;
    }

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56963a, false, 60959, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56963a, false, 60959, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        int serverTime = NetworkUtils.getServerTime();
        Request request = chain.request();
        String url = request.getUrl();
        if (url != null && (url.contains("/passport/token/beat/") || url.contains("/passport/token/change/") || url.contains("/passport/user/logout/"))) {
            HttpUrl.Builder addQueryParameter = HttpUrl.parse(request.getUrl()).newBuilder().addQueryParameter(TimeDisplaySetting.TIME_DISPLAY_SETTING, String.valueOf(serverTime)).addQueryParameter("app_type", this.f56964b);
            HashMap hashMap = new HashMap();
            NetUtil.putCommonParams(hashMap, true);
            for (Map.Entry entry : hashMap.entrySet()) {
                addQueryParameter.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            request = request.newBuilder().url(addQueryParameter.build().toString()).build();
        }
        return chain2.proceed(request);
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56963a, false, 60958, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56963a, false, 60958, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, r.f56984a, true, 60960, new Class[]{TokenSdkCommonParamsInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, r.f56984a, true, 60960, new Class[]{TokenSdkCommonParamsInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
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
