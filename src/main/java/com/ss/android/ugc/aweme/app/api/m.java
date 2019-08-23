package com.ss.android.ugc.aweme.app.api;

import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.rxjava2.adapter.RxJava2CallAdapterFactory;
import com.bytedance.ttnet.retrofit.SsInterceptor;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.token.AuthTokenInterceptor;
import com.ss.android.ugc.aweme.base.api.a.a.c;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.net.cache.CacheControlInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.ApiOkInterceptorCronet;
import com.ss.android.ugc.aweme.net.interceptor.CommonParamsInterceptorCronet;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptorCornet;
import com.ss.android.ugc.aweme.net.interceptor.LinkSelectorInterceptorCronet;
import com.ss.android.ugc.aweme.net.interceptor.SecUidInterceptorCronet;
import com.ss.android.ugc.aweme.net.interceptor.TTNetInitInterceptorCronet;
import com.ss.android.ugc.aweme.services.TTRetrofit;
import com.ss.android.ugc.aweme.utils.ca;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33864a;

    public static List a() {
        return PatchProxy.isSupport(new Object[0], null, f33864a, true, 23120, new Class[0], List.class) ? (List) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23120, new Class[0], List.class) : n.a();
    }

    public static Gson d() {
        if (PatchProxy.isSupport(new Object[0], null, f33864a, true, 23124, new Class[0], Gson.class)) {
            return (Gson) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23124, new Class[0], Gson.class);
        }
        return ca.a().getGson();
    }

    public static List<Converter.Factory> c() {
        if (PatchProxy.isSupport(new Object[0], null, f33864a, true, 23122, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23122, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(x.a(d()));
        arrayList.add(GsonConverterFactory.create(d()));
        return arrayList;
    }

    public static List<CallAdapter.Factory> b() {
        d dVar;
        l lVar;
        k kVar;
        if (PatchProxy.isSupport(new Object[0], null, f33864a, true, 23121, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23121, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (PatchProxy.isSupport(new Object[0], null, d.f33816a, true, 23053, new Class[0], d.class)) {
            dVar = (d) PatchProxy.accessDispatch(new Object[0], null, d.f33816a, true, 23053, new Class[0], d.class);
        } else {
            dVar = new d();
        }
        arrayList.add(dVar);
        if (PatchProxy.isSupport(new Object[0], null, l.f33856a, true, 23100, new Class[0], l.class)) {
            lVar = (l) PatchProxy.accessDispatch(new Object[0], null, l.f33856a, true, 23100, new Class[0], l.class);
        } else {
            lVar = new l();
        }
        arrayList.add(lVar);
        if (PatchProxy.isSupport(new Object[0], null, k.f33850a, true, 23094, new Class[0], k.class)) {
            kVar = (k) PatchProxy.accessDispatch(new Object[0], null, k.f33850a, true, 23094, new Class[0], k.class);
        } else {
            kVar = new k();
        }
        arrayList.add(kVar);
        arrayList.add(RxJava2CallAdapterFactory.create());
        return arrayList;
    }

    public static Retrofit a(String str) {
        List<Interceptor> list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33864a, true, 23111, new Class[]{String.class}, Retrofit.class)) {
            return (Retrofit) PatchProxy.accessDispatch(new Object[]{str2}, null, f33864a, true, 23111, new Class[]{String.class}, Retrofit.class);
        }
        List<Converter.Factory> c2 = c();
        List a2 = a();
        if (PatchProxy.isSupport(new Object[0], null, f33864a, true, 23117, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23117, new Class[0], List.class);
        } else {
            list = a((List<Interceptor>) null);
        }
        return a(str2, c2, a2, list);
    }

    public static Retrofit b(String str) {
        List list;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33864a, true, 23113, new Class[]{String.class}, Retrofit.class)) {
            return (Retrofit) PatchProxy.accessDispatch(new Object[]{str2}, null, f33864a, true, 23113, new Class[]{String.class}, Retrofit.class);
        }
        List<Converter.Factory> c2 = c();
        List a2 = a();
        if (PatchProxy.isSupport(new Object[0], null, f33864a, true, 23119, new Class[0], List.class)) {
            list = (List) PatchProxy.accessDispatch(new Object[0], null, f33864a, true, 23119, new Class[0], List.class);
        } else {
            list = new ArrayList();
            list.add(new SsInterceptor());
            list.add(new TTNetInitInterceptorCronet());
        }
        return a(str2, c2, a2, list);
    }

    private static List<Converter.Factory> b(List<Converter.Factory> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f33864a, true, 23116, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f33864a, true, 23116, new Class[]{List.class}, List.class);
        } else if (j.a((Collection<T>) list)) {
            return list;
        } else {
            ArrayList arrayList = new ArrayList();
            Converter.Factory factory = null;
            for (Converter.Factory next : list) {
                if (next instanceof x) {
                    factory = next;
                } else if (next != null) {
                    arrayList.add(next);
                }
            }
            if (factory != null) {
                arrayList.add(0, factory);
            }
            return arrayList;
        }
    }

    public static RuntimeException a(ExecutionException executionException) throws Exception {
        if (PatchProxy.isSupport(new Object[]{executionException}, null, f33864a, true, 23125, new Class[]{ExecutionException.class}, RuntimeException.class)) {
            return (RuntimeException) PatchProxy.accessDispatch(new Object[]{executionException}, null, f33864a, true, 23125, new Class[]{ExecutionException.class}, RuntimeException.class);
        }
        Throwable cause = executionException.getCause();
        if (cause instanceof a) {
            return (a) cause;
        }
        if (cause instanceof JsonParseException) {
            return new c(cause);
        }
        throw ((Exception) cause);
    }

    public static List<Interceptor> a(List<Interceptor> list) {
        List<Interceptor> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f33864a, true, 23118, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, null, f33864a, true, 23118, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SsInterceptor());
        arrayList.add(new CacheControlInterceptor());
        arrayList.add(new ApiAlisgInterceptor());
        arrayList.add(new LinkSelectorInterceptorCronet());
        arrayList.add(new ApiOkInterceptorCronet());
        arrayList.add(new DevicesNullInterceptorCornet());
        if (com.ss.android.ugc.aweme.net.a.j.a() != null && !j.a((Collection<T>) com.ss.android.ugc.aweme.net.a.j.a().s)) {
            arrayList.addAll(com.ss.android.ugc.aweme.net.a.j.a().s);
        }
        arrayList.add(new CommonParamsInterceptorCronet());
        arrayList.add(new SecUidInterceptorCronet());
        arrayList.add(new AuthTokenInterceptor());
        arrayList.add(new TTNetInitInterceptorCronet());
        if (!j.a((Collection<T>) list)) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public static IRetrofit a(String str, List<Interceptor> list) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2, null}, null, f33864a, true, 23110, new Class[]{String.class, List.class}, IRetrofit.class)) {
            return new TTRetrofit(str2, null);
        }
        return (IRetrofit) PatchProxy.accessDispatch(new Object[]{str2, null}, null, f33864a, true, 23110, new Class[]{String.class, List.class}, IRetrofit.class);
    }

    public static Retrofit a(String str, List<Converter.Factory> list, List<CallAdapter.Factory> list2, List<Interceptor> list3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, list, list2, list3}, null, f33864a, true, 23115, new Class[]{String.class, List.class, List.class, List.class}, Retrofit.class)) {
            Object[] objArr = {str2, list, list2, list3};
            return (Retrofit) PatchProxy.accessDispatch(objArr, null, f33864a, true, 23115, new Class[]{String.class, List.class, List.class, List.class}, Retrofit.class);
        }
        Retrofit.a aVar = new Retrofit.a();
        if (!j.a((Collection<T>) b(list))) {
            for (Converter.Factory a2 : list) {
                aVar.a(a2);
            }
        }
        if (!j.a((Collection<T>) list2)) {
            for (CallAdapter.Factory a3 : list2) {
                aVar.a(a3);
            }
        }
        aVar.a((Executor) new com.bytedance.frameworks.baselib.network.http.retrofit.a());
        aVar.a(str2);
        if (!j.a((Collection<T>) list3)) {
            for (Interceptor a4 : list3) {
                aVar.a(a4);
            }
        }
        aVar.a((Client.Provider) new t());
        return aVar.a();
    }
}
