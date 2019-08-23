package com.bytedance.android.livesdk.live.provider;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.live.g;
import com.bytedance.android.livesdk.network.ResponseInterceptor;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdk.v.j;
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

public final class b implements h.b<Retrofit> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15876a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.livesdkapi.host.h f15877b;

    @NotNull
    public final h.b.a<Retrofit> a(h.b.a<Retrofit> aVar) {
        g gVar;
        ResponseInterceptor responseInterceptor;
        h.b.a<Retrofit> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f15876a, false, 10365, new Class[]{h.b.a.class}, h.b.a.class)) {
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f15876a, false, 10365, new Class[]{h.b.a.class}, h.b.a.class);
        }
        c cVar = new c(this);
        Retrofit.a aVar3 = new Retrofit.a();
        Retrofit.a a2 = aVar3.a("https://" + TTLiveSDKContext.getLiveHostDomain()).a((Client.Provider) new d(cVar)).a((CallAdapter.Factory) RxJava2CallAdapterFactory.createAsync());
        if (PatchProxy.isSupport(new Object[0], null, g.f15853a, true, 10285, new Class[0], g.class)) {
            gVar = (g) PatchProxy.accessDispatch(new Object[0], null, g.f15853a, true, 10285, new Class[0], g.class);
        } else {
            gVar = new g();
        }
        Retrofit.a a3 = a2.a((Converter.Factory) gVar).a((Converter.Factory) GsonConverterFactory.create(j.q().c()));
        if (PatchProxy.isSupport(new Object[0], null, ResponseInterceptor.f16731a, true, 12545, new Class[0], ResponseInterceptor.class)) {
            responseInterceptor = (ResponseInterceptor) PatchProxy.accessDispatch(new Object[0], null, ResponseInterceptor.f16731a, true, 12545, new Class[0], ResponseInterceptor.class);
        } else {
            responseInterceptor = new ResponseInterceptor(TTLiveSDKContext.getHostService().a().a());
        }
        return aVar2.a(a3.a((Interceptor) responseInterceptor).a((Executor) new a()).a()).a();
    }
}
