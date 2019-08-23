package com.ss.android.ugc.aweme.services;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.c;
import com.ss.android.ugc.aweme.app.api.g;
import com.ss.android.ugc.aweme.app.api.i;
import com.ss.android.ugc.aweme.app.api.j;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.net.t;
import com.ss.android.ugc.aweme.net.y;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.a.b.h;
import retrofit2.b.a.a;
import retrofit2.c;
import retrofit2.e;
import retrofit2.n;

public class RetrofitService implements IRetrofitService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final HashMap<String, IRetrofit> mRetrofitHashMap = new HashMap<>();

    public RuntimeException propagateCompatibleException(ExecutionException executionException) throws Exception {
        if (PatchProxy.isSupport(new Object[]{executionException}, this, changeQuickRedirect, false, 71482, new Class[]{ExecutionException.class}, RuntimeException.class)) {
            return (RuntimeException) PatchProxy.accessDispatch(new Object[]{executionException}, this, changeQuickRedirect, false, 71482, new Class[]{ExecutionException.class}, RuntimeException.class);
        }
        throw m.a(executionException);
    }

    public IRetrofit createNewRetrofit(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71481, new Class[]{String.class}, IRetrofit.class)) {
            return (IRetrofit) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71481, new Class[]{String.class}, IRetrofit.class);
        }
        IRetrofit iRetrofit = this.mRetrofitHashMap.get(str2);
        if (iRetrofit == null) {
            synchronized (this) {
                iRetrofit = this.mRetrofitHashMap.get(str2);
                if (iRetrofit == null) {
                    iRetrofit = new TTRetrofit(str2);
                    this.mRetrofitHashMap.put(str2, iRetrofit);
                }
            }
        }
        t tVar = t.f57014c;
        HashMap<String, IRetrofit> hashMap = this.mRetrofitHashMap;
        if (PatchProxy.isSupport(new Object[]{hashMap}, tVar, t.f57012a, false, 60757, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hashMap}, tVar, t.f57012a, false, 60757, new Class[]{Map.class}, Void.TYPE);
        } else if (hashMap != null && hashMap.size() >= t.f57013b) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("retrofit_map_size", hashMap.size());
            } catch (JSONException unused) {
            }
            t.f57013b *= 2;
            n.b("retrofit_map_size", "", jSONObject);
        }
        return iRetrofit;
    }

    @Deprecated
    public Object createCompatibleRetrofit(String str) {
        g gVar;
        c cVar;
        j jVar;
        i iVar;
        OkHttpClient okHttpClient;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, m.f33864a, true, 23123, new Class[]{String.class}, retrofit2.n.class)) {
            return (retrofit2.n) PatchProxy.accessDispatch(new Object[]{str2}, null, m.f33864a, true, 23123, new Class[]{String.class}, retrofit2.n.class);
        }
        n.a aVar = new n.a();
        Gson d2 = m.d();
        if (PatchProxy.isSupport(new Object[]{d2}, null, g.f33832a, true, 23066, new Class[]{Gson.class}, g.class)) {
            gVar = (g) PatchProxy.accessDispatch(new Object[]{d2}, null, g.f33832a, true, 23066, new Class[]{Gson.class}, g.class);
        } else {
            gVar = new g(d2);
        }
        n.a a2 = aVar.a((e.a) gVar).a((e.a) a.a(m.d()));
        if (PatchProxy.isSupport(new Object[0], null, c.f33805a, true, 23045, new Class[0], c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[0], null, c.f33805a, true, 23045, new Class[0], c.class);
        } else {
            cVar = new c();
        }
        n.a a3 = a2.a((c.a) cVar);
        if (PatchProxy.isSupport(new Object[0], null, j.f33841a, true, 23087, new Class[0], j.class)) {
            jVar = (j) PatchProxy.accessDispatch(new Object[0], null, j.f33841a, true, 23087, new Class[0], j.class);
        } else {
            jVar = new j();
        }
        n.a a4 = a3.a((c.a) jVar);
        if (PatchProxy.isSupport(new Object[0], null, i.f33834a, true, 23082, new Class[0], i.class)) {
            iVar = (i) PatchProxy.accessDispatch(new Object[0], null, i.f33834a, true, 23082, new Class[0], i.class);
        } else {
            iVar = new i();
        }
        n.a a5 = a4.a((c.a) iVar).a((c.a) h.a()).a(str2);
        y a6 = y.a();
        if (PatchProxy.isSupport(new Object[0], a6, y.f57040a, false, 60778, new Class[0], OkHttpClient.class)) {
            okHttpClient = (OkHttpClient) PatchProxy.accessDispatch(new Object[0], a6, y.f57040a, false, 60778, new Class[0], OkHttpClient.class);
        } else if (a6.f57042b != null) {
            okHttpClient = a6.f57042b;
        } else {
            OkHttpClient.Builder newBuilder = y.a().b().newBuilder();
            List<Interceptor> interceptors = newBuilder.interceptors();
            interceptors.add(0, new com.ss.android.ugc.aweme.net.interceptor.e());
            interceptors.add(0, new com.ss.android.ugc.aweme.net.interceptor.c());
            interceptors.add(0, new com.ss.android.ugc.aweme.net.interceptor.i());
            a6.f57042b = newBuilder.build();
            okHttpClient = a6.f57042b;
        }
        return a5.a(okHttpClient).a();
    }
}
