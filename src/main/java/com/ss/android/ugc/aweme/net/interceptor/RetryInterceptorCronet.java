package com.ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.v.b;
import java.net.URI;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLException;

public class RetryInterceptorCronet implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56960a;

    public final SsResponse a(Interceptor.Chain chain) throws Exception {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56960a, false, 60947, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56960a, false, 60947, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        try {
            return chain2.proceed(chain.request());
        } catch (Exception e2) {
            if (!(e2 instanceof a)) {
                Request request = chain.request();
                Request.Builder newBuilder = request.newBuilder();
                String url = request.getUrl();
                if (!url.contains("/aweme/v1/feed/")) {
                    throw e2;
                } else if (TextUtils.isEmpty(url) || !url.startsWith("https") || (!(e2 instanceof SSLException) && !(e2 instanceof GeneralSecurityException))) {
                    newBuilder.url(b(NetworkUtils.filterUrl(a("aweme.snssdk.com", url)), "first_retry"));
                    return chain2.proceed(newBuilder.build());
                } else {
                    newBuilder.url(b(url.replace("https", "http"), "retry_http"));
                    return chain2.proceed(newBuilder.build());
                }
            } else {
                throw e2;
            }
        }
    }

    public SsResponse intercept(Interceptor.Chain chain) throws Exception {
        if (PatchProxy.isSupport(new Object[]{chain}, this, f56960a, false, 60946, new Class[]{Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{chain}, this, f56960a, false, 60946, new Class[]{Interceptor.Chain.class}, SsResponse.class);
        }
        if (PatchProxy.isSupport(new Object[]{this, chain}, null, n.f56980a, true, 60950, new Class[]{RetryInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{this, chain}, null, n.f56980a, true, 60950, new Class[]{RetryInterceptorCronet.class, Interceptor.Chain.class}, SsResponse.class);
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

    private static String a(String str, String str2) {
        String str3;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5}, null, f56960a, true, 60948, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str4, str5}, null, f56960a, true, 60948, new Class[]{String.class, String.class}, String.class);
        } else if (str5 == null || str2.length() <= 0 || str.length() <= 0) {
            return str5;
        } else {
            try {
                String host = URI.create(str2).getHost();
                if (host != null) {
                    str3 = str5.replace(host, str4);
                } else {
                    str3 = str5;
                }
                return str3;
            } catch (Exception unused) {
                return str5;
            }
        }
    }

    private static String b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f56960a, true, 60949, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f56960a, true, 60949, new Class[]{String.class, String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return str3;
        } else {
            i iVar = new i(str3);
            iVar.a("retry_type", str4);
            return iVar.toString();
        }
    }
}
