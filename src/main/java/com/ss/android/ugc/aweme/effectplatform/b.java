package com.ss.android.ugc.aweme.effectplatform;

import android.accounts.NetworkErrorException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.common.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class b implements com.ss.android.ugc.effectmanager.common.d.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43804a;

    /* renamed from: b  reason: collision with root package name */
    private OkHttpClient f43805b;

    public b(OkHttpClient okHttpClient) {
        this.f43805b = okHttpClient;
    }

    public final InputStream a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f43804a, false, 38905, new Class[]{a.class}, InputStream.class)) {
            return (InputStream) PatchProxy.accessDispatch(new Object[]{aVar}, this, f43804a, false, 38905, new Class[]{a.class}, InputStream.class);
        }
        try {
            return b(aVar);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("EffectNetworkerImpl", "execute fail : " + e2.toString());
            return null;
        }
    }

    private InputStream b(a aVar) throws Exception {
        RequestBody requestBody;
        Headers headers;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f43804a, false, 38906, new Class[]{a.class}, InputStream.class)) {
            return (InputStream) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f43804a, false, 38906, new Class[]{a.class}, InputStream.class);
        }
        Request.Builder builder = new Request.Builder();
        builder.get().url(aVar2.f77265a);
        if (!aVar2.f77268d.isEmpty()) {
            Map<String, String> map = aVar2.f77268d;
            if (PatchProxy.isSupport(new Object[]{map}, this, f43804a, false, 38908, new Class[]{Map.class}, Headers.class)) {
                headers = (Headers) PatchProxy.accessDispatch(new Object[]{map}, this, f43804a, false, 38908, new Class[]{Map.class}, Headers.class);
            } else {
                Headers.Builder builder2 = new Headers.Builder();
                if (map != null) {
                    for (String next : map.keySet()) {
                        builder2.add(next, map.get(next));
                    }
                }
                headers = builder2.build();
            }
            builder = builder.headers(headers);
        }
        if (aVar2.f77266b.equals("GET")) {
            builder = builder.get();
        } else if (!aVar2.f77269e.isEmpty()) {
            String str = aVar2.f77266b;
            String str2 = aVar2.f77270f;
            Map<String, Object> map2 = aVar2.f77269e;
            if (PatchProxy.isSupport(new Object[]{str2, map2}, this, f43804a, false, 38907, new Class[]{String.class, Map.class}, RequestBody.class)) {
                requestBody = (RequestBody) PatchProxy.accessDispatch(new Object[]{str2, map2}, this, f43804a, false, 38907, new Class[]{String.class, Map.class}, RequestBody.class);
            } else {
                requestBody = RequestBody.create(MediaType.parse(str2), com.ss.android.ugc.aweme.port.in.a.f61120c.toJson((Object) map2));
            }
            builder = builder.method(str, requestBody);
        }
        try {
            final Response execute = this.f43805b.newCall(builder.build()).execute();
            if (execute.code() != 200 || execute.body() == null) {
                com.ss.android.ugc.aweme.framework.a.a.a("EffectNetworkerImpl", "request fail code : " + execute.code());
                throw new NetworkErrorException("status code = " + execute.code());
            }
            aVar2.f77267c = execute.body().contentLength();
            return new FilterInputStream(execute.body().source().inputStream()) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43806a;

                public final void close() throws IOException {
                    if (PatchProxy.isSupport(new Object[0], this, f43806a, false, 38909, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f43806a, false, 38909, new Class[0], Void.TYPE);
                        return;
                    }
                    super.close();
                    execute.close();
                }
            };
        } catch (IOException e2) {
            IOException iOException = e2;
            aVar2.g = iOException.getMessage();
            throw iOException;
        }
    }
}
