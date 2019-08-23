package com.mapbox.android.telemetry;

import android.support.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.ConnectionSpec;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<o, String> f26081a = new HashMap<o, String>() {
        {
            put(o.STAGING, "api-events-staging.tilestream.net");
            put(o.COM, "events.mapbox.com");
            put(o.CHINA, "events.mapbox.cn");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public o f26082b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpUrl f26083c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26084d;

    /* renamed from: e  reason: collision with root package name */
    private final OkHttpClient f26085e;

    /* renamed from: f  reason: collision with root package name */
    private final SSLSocketFactory f26086f;
    private final X509TrustManager g;
    private final HostnameVerifier h;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        o f26087a = o.COM;

        /* renamed from: b  reason: collision with root package name */
        OkHttpClient f26088b = new OkHttpClient();

        /* renamed from: c  reason: collision with root package name */
        HttpUrl f26089c = null;

        /* renamed from: d  reason: collision with root package name */
        SSLSocketFactory f26090d = null;

        /* renamed from: e  reason: collision with root package name */
        X509TrustManager f26091e = null;

        /* renamed from: f  reason: collision with root package name */
        HostnameVerifier f26092f = null;
        boolean g = false;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final bm a() {
            if (this.f26089c == null) {
                this.f26089c = bm.a(bm.f26081a.get(this.f26087a));
            }
            return new bm(this);
        }

        /* access modifiers changed from: package-private */
        public final a a(o oVar) {
            this.f26087a = oVar;
            return this;
        }
    }

    private static boolean a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        return (sSLSocketFactory == null || x509TrustManager == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final OkHttpClient b(e eVar) {
        return a(eVar, (Interceptor) null);
    }

    /* access modifiers changed from: package-private */
    public final OkHttpClient a(e eVar) {
        return a(eVar, (Interceptor) new ac());
    }

    bm(a aVar) {
        this.f26082b = aVar.f26087a;
        this.f26085e = aVar.f26088b;
        this.f26083c = aVar.f26089c;
        this.f26086f = aVar.f26090d;
        this.g = aVar.f26091e;
        this.h = aVar.f26092f;
        this.f26084d = aVar.g;
    }

    static HttpUrl a(String str) {
        HttpUrl.Builder scheme = new HttpUrl.Builder().scheme("https");
        scheme.host(str);
        return scheme.build();
    }

    private OkHttpClient a(e eVar, @Nullable Interceptor interceptor) {
        OkHttpClient.Builder connectionSpecs = this.f26085e.newBuilder().retryOnConnectionFailure(true).certificatePinner(new f().a(this.f26082b, eVar)).connectionSpecs(Arrays.asList(new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS}));
        if (interceptor != null) {
            connectionSpecs.addInterceptor(interceptor);
        }
        if (a(this.f26086f, this.g)) {
            connectionSpecs.sslSocketFactory(this.f26086f, this.g);
            connectionSpecs.hostnameVerifier(this.h);
        }
        return connectionSpecs.build();
    }
}
