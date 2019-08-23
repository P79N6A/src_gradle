package com.bytedance.android.livesdk.feed.network;

import com.bytedance.android.livesdk.feed.services.b;
import com.bytedance.android.livesdk.feed.services.d;
import com.bytedance.android.livesdkapi.host.h;
import com.bytedance.frameworks.baselib.network.http.retrofit.a;
import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.rxjava2.adapter.RxJava2CallAdapterFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

public final class f implements b.C0103b<Retrofit> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14309a;

    /* renamed from: b  reason: collision with root package name */
    h f14310b;

    @NotNull
    public final b.C0103b.a<Retrofit> a(b.C0103b.a<Retrofit> aVar) {
        ResponseInterceptor responseInterceptor;
        b.C0103b.a<Retrofit> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f14309a, false, 8799, new Class[]{b.C0103b.a.class}, b.C0103b.a.class)) {
            return (b.C0103b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14309a, false, 8799, new Class[]{b.C0103b.a.class}, b.C0103b.a.class);
        }
        g gVar = new g(this);
        Retrofit.a aVar3 = new Retrofit.a();
        Retrofit.a a2 = aVar3.a("https://" + com.bytedance.android.livesdk.feed.b.b.c().i().b()).a((Client.Provider) new h(gVar)).a((CallAdapter.Factory) RxJava2CallAdapterFactory.createAsync()).a((Converter.Factory) GsonConverterFactory.create(d.a().e()));
        if (PatchProxy.isSupport(new Object[0], null, ResponseInterceptor.f14298a, true, 8797, new Class[0], ResponseInterceptor.class)) {
            responseInterceptor = (ResponseInterceptor) PatchProxy.accessDispatch(new Object[0], null, ResponseInterceptor.f14298a, true, 8797, new Class[0], ResponseInterceptor.class);
        } else {
            responseInterceptor = new ResponseInterceptor(com.bytedance.android.livesdk.feed.b.b.c().a().a());
        }
        return aVar2.a(a2.a((Interceptor) responseInterceptor).a((Executor) new a()).a()).a();
    }
}
