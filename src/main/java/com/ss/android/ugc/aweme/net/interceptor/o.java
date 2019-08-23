package com.ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.dr;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class o implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56981a;

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56981a, false, 60951, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56981a, false, 60951, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        HttpUrl url = request.url();
        if (url != null) {
            HttpUrl.Builder newBuilder = url.newBuilder();
            for (String str : dr.f75763b) {
                String queryParameter = url.queryParameter(str);
                String queryParameter2 = url.queryParameter("sec_" + str);
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
}
