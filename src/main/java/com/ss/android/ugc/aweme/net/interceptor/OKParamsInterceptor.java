package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.commercialize.log.z;
import com.ss.android.ugc.aweme.v.b;
import java.net.URLDecoder;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

public class OKParamsInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56958a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56958a, false, 60938, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56958a, false, 60938, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        Request request = chain.request();
        return chain2.proceed(request.newBuilder().url(a(request.getUrl())).build());
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56958a, false, 60937, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56958a, false, 60937, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, k.f56976a, true, 60940, new Class[]{OKParamsInterceptor.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, k.f56976a, true, 60940, new Class[]{OKParamsInterceptor.class, Interceptor.Chain.class}, SsResponse.class);
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

    private static String a(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f56958a, true, 60939, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f56958a, true, 60939, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str2;
        } else {
            if (((Boolean) SharePrefCache.inst().getUseHttps().c()).booleanValue()) {
                if (PatchProxy.isSupport(new Object[0], null, z.f39361a, true, 31846, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, z.f39361a, true, 31846, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = Intrinsics.areEqual((Object) z.f39363c.get(), (Object) Boolean.TRUE);
                }
                if (!z) {
                    if (!str2.contains("https://") && !str2.contains("http://")) {
                        str2 = "https://" + str2;
                    } else if (str2.contains("http://")) {
                        str2 = str2.replace("http://", "https://");
                    }
                }
            }
            HttpUrl build = HttpUrl.parse(str2).newBuilder().build();
            if (!str2.contains("/passport/auth/login/") && !str2.contains("/passport/auth/login_only/")) {
                if (str2.contains("/location/sulite")) {
                    str2 = build.newBuilder().host("aweme.snssdk.com").build().url().toString();
                }
                if (str2.contains("push/get_service_addrs")) {
                    str2 = build.newBuilder().host("aweme.snssdk.com").build().url().toString();
                }
                if (str2.contains("push/get_service_addrs")) {
                    str2 = build.newBuilder().host("aweme.snssdk.com").build().url().toString();
                }
                if (!str2.contains("/aweme/v1/") && ((str2.contains("/feedback/2/list/") || str2.contains("/feedback/1/post_message/") || str2.contains("/2/data/upload_image/")) && "aweme.snssdk.com".equals(build.host()))) {
                    str2 = build.newBuilder().host("aweme.snssdk.com").build().url().toString();
                }
                return str2;
            } else if (TextUtils.isEmpty(build.queryParameter("access_token"))) {
                return str2;
            } else {
                String replaceAll = build.queryParameter("access_token").replaceAll(" ", "+");
                HttpUrl.Builder removeAllQueryParameters = build.newBuilder().removeAllQueryParameters("access_token");
                try {
                    removeAllQueryParameters.addQueryParameter("access_token", URLDecoder.decode(replaceAll, "utf-8"));
                } catch (Exception unused) {
                    removeAllQueryParameters.addQueryParameter("access_token", replaceAll);
                }
                return removeAllQueryParameters.build().url().toString();
            }
        }
    }
}
