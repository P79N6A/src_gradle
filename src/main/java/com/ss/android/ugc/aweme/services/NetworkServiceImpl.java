package com.ss.android.ugc.aweme.services;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.net.y;
import com.ss.android.ugc.aweme.port.in.ab;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/services/NetworkServiceImpl;", "Lcom/ss/android/ugc/aweme/port/in/INetworkService;", "()V", "getOKHttpClient", "Lokhttp3/OkHttpClient;", "getRetrofitFactoryGson", "Lcom/google/gson/Gson;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class NetworkServiceImpl implements ab {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public final OkHttpClient getOKHttpClient() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71468, new Class[0], OkHttpClient.class)) {
            return (OkHttpClient) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71468, new Class[0], OkHttpClient.class);
        }
        y a2 = y.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "OkHttpManager.getSingleton()");
        OkHttpClient b2 = a2.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "OkHttpManager.getSingleton().okHttpClient");
        return b2;
    }

    @NotNull
    public final Gson getRetrofitFactoryGson() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71469, new Class[0], Gson.class)) {
            return (Gson) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71469, new Class[0], Gson.class);
        }
        Gson d2 = m.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "RetrofitFactory.getGson()");
        return d2;
    }
}
