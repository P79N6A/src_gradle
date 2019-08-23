package com.ss.android.ugc.aweme.net;

import com.bytedance.frameworks.baselib.network.http.c.a.d;
import com.bytedance.ies.net.b.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.net.a.j;
import com.ss.android.ugc.aweme.net.interceptor.AwemeAuthTokenInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.o;
import com.ss.android.ugc.aweme.sec.k;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57040a;

    /* renamed from: c  reason: collision with root package name */
    private static final y f57041c = new y();

    /* renamed from: b  reason: collision with root package name */
    public OkHttpClient f57042b;

    /* renamed from: d  reason: collision with root package name */
    private OkHttpClient f57043d;

    /* renamed from: e  reason: collision with root package name */
    private OkHttpClient f57044e = new OkHttpClient();

    public static y a() {
        return f57041c;
    }

    private y() {
    }

    @Deprecated
    public final OkHttpClient b() {
        if (this.f57043d != null) {
            return this.f57043d;
        }
        j.b();
        OkHttpClient.Builder newBuilder = this.f57044e.newBuilder();
        newBuilder.connectTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.readTimeout(60000, TimeUnit.MILLISECONDS);
        newBuilder.retryOnConnectionFailure(true);
        if (x.a() != null) {
            newBuilder.dispatcher(new Dispatcher(x.a()));
        }
        if (ToolUtils.isMainProcess(GlobalContext.getContext())) {
            newBuilder.cookieJar(new b(CookieHandler.getDefault()));
        }
        if (j.a() != null && j.a().j) {
            Interceptor a2 = k.a();
            if (a2 != null) {
                newBuilder.addInterceptor(a2);
            }
        }
        newBuilder.addNetworkInterceptor(c.a());
        newBuilder.addNetworkInterceptor(new NetWorkSpeedInterceptor());
        newBuilder.addNetworkInterceptor(new d());
        newBuilder.addNetworkInterceptor(new AwemeAuthTokenInterceptor());
        newBuilder.addInterceptor(new DevicesNullInterceptor());
        newBuilder.addInterceptor(new o());
        if (a.a()) {
            newBuilder.addNetworkInterceptor(new OKHttpSwitchInterceptor());
            newBuilder.addInterceptor(new OKHttpSwitchInterceptor());
        }
        newBuilder.protocols(Collections.singletonList(Protocol.HTTP_1_1));
        this.f57043d = newBuilder.build();
        return this.f57043d;
    }
}
