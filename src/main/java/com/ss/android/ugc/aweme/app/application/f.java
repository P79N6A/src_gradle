package com.ss.android.ugc.aweme.app.application;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.application.initialization.a;
import com.ss.android.ugc.aweme.net.y;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public final /* synthetic */ class f implements a.C0436a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33940a;

    /* renamed from: b  reason: collision with root package name */
    static final a.C0436a f33941b = new f();

    private f() {
    }

    public final Object a() {
        if (PatchProxy.isSupport(new Object[0], this, f33940a, false, 23216, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33940a, false, 23216, new Class[0], Object.class);
        } else if (PatchProxy.isSupport(new Object[0], null, b.f33924a, true, 23208, new Class[0], OkHttpClient.class)) {
            return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], null, b.f33924a, true, 23208, new Class[0], OkHttpClient.class);
        } else {
            return y.a().b().newBuilder().connectTimeout(240, TimeUnit.SECONDS).writeTimeout(240, TimeUnit.SECONDS).readTimeout(240, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
        }
    }
}
