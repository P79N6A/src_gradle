package com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch;

import a.i;
import android.annotation.SuppressLint;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import retrofit2.c;
import retrofit2.e;
import retrofit2.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50594a;

    /* renamed from: b  reason: collision with root package name */
    public static GifApi f50595b;

    static {
        com.ss.android.ugc.aweme.im.sdk.b.a aVar;
        n.a a2 = new n.a().a(g.f52586b).a(a().build()).a((e.a) retrofit2.b.a.a.a(new Gson()));
        ExecutorService executorService = i.f1051a;
        if (PatchProxy.isSupport(new Object[]{executorService}, null, com.ss.android.ugc.aweme.im.sdk.b.a.f50149a, true, 50188, new Class[]{Executor.class}, com.ss.android.ugc.aweme.im.sdk.b.a.class)) {
            aVar = (com.ss.android.ugc.aweme.im.sdk.b.a) PatchProxy.accessDispatch(new Object[]{executorService}, null, com.ss.android.ugc.aweme.im.sdk.b.a.f50149a, true, 50188, new Class[]{Executor.class}, com.ss.android.ugc.aweme.im.sdk.b.a.class);
        } else if (executorService != null) {
            aVar = new com.ss.android.ugc.aweme.im.sdk.b.a(executorService);
        } else {
            throw new NullPointerException("executor == null");
        }
        f50595b = (GifApi) a2.a((c.a) aVar).a().a(GifApi.class);
    }

    private static OkHttpClient.Builder a() {
        if (PatchProxy.isSupport(new Object[0], null, f50594a, true, 50891, new Class[0], OkHttpClient.Builder.class)) {
            return (OkHttpClient.Builder) PatchProxy.accessDispatch(new Object[0], null, f50594a, true, 50891, new Class[0], OkHttpClient.Builder.class);
        }
        OkHttpClient.Builder newBuilder = new OkHttpClient().newBuilder();
        newBuilder.hostnameVerifier(new HostnameVerifier() {
            @SuppressLint({"BadHostnameVerifier"})
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        });
        TrustManager[] trustManagerArr = {new X509TrustManager() {
            @SuppressLint({"TrustAllX509TrustManager"})
            public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            @SuppressLint({"TrustAllX509TrustManager"})
            public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            }

            public final X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, trustManagerArr, new SecureRandom());
            newBuilder.sslSocketFactory(instance.getSocketFactory());
        } catch (Exception unused) {
        }
        return newBuilder;
    }
}
