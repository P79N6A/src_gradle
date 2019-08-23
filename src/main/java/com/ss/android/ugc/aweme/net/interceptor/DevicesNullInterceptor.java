package com.ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.q;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class DevicesNullInterceptor implements q {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean forRelease() {
        return true;
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Interceptor.Chain chain2 = chain;
        if (PatchProxy.isSupport(new Object[]{chain2}, this, changeQuickRedirect, false, 60925, new Class[]{Interceptor.Chain.class}, Response.class)) {
            return (Response) PatchProxy.accessDispatch(new Object[]{chain2}, this, changeQuickRedirect, false, 60925, new Class[]{Interceptor.Chain.class}, Response.class);
        }
        Request request = chain.request();
        if (TextUtils.equals("", request.url().queryParameter("device_id"))) {
            request = request.newBuilder().url(request.url().newBuilder().removeAllQueryParameters("device_id").build()).build();
        }
        return chain2.proceed(request);
    }
}
