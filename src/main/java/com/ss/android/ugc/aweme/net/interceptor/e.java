package com.ss.android.ugc.aweme.net.interceptor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.v.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class e implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56969a;

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, f56969a, false, 60921, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, f56969a, false, 60921, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        HttpUrl.Builder newBuilder = request.url().newBuilder();
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, true);
        for (Map.Entry entry : hashMap.entrySet()) {
            newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        HttpUrl build = newBuilder.build();
        d.a(build.toString());
        return chain2.proceed(request.newBuilder().url(build).build());
    }
}
