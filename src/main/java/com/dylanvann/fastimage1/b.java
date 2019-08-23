package com.dylanvann.fastimage1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.LibraryGlideModule;
import com.facebook.react.modules.network.OkHttpClientProvider;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public final class b extends LibraryGlideModule {

    /* renamed from: a  reason: collision with root package name */
    static a f23258a = new a();

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        final Map<String, c> f23260a = new WeakHashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, Long> f23261b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Handler f23262c = new Handler(Looper.getMainLooper());

        a() {
        }

        /* access modifiers changed from: package-private */
        public final void a(String str) {
            this.f23260a.remove(str);
            this.f23261b.remove(str);
        }

        public final void a(String str, long j, long j2) {
            final c cVar = this.f23260a.get(str);
            if (cVar != null) {
                if (j2 <= j) {
                    a(str);
                }
                float granularityPercentage = cVar.getGranularityPercentage();
                boolean z = true;
                if (!(granularityPercentage == 0.0f || j == 0 || j2 == j)) {
                    long j3 = (long) (((((float) j) * 100.0f) / ((float) j2)) / granularityPercentage);
                    Long l = this.f23261b.get(str);
                    if (l == null || j3 != l.longValue()) {
                        this.f23261b.put(str, Long.valueOf(j3));
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    Handler handler = this.f23262c;
                    final String str2 = str;
                    final long j4 = j;
                    final long j5 = j2;
                    AnonymousClass1 r1 = new Runnable() {
                        public final void run() {
                            cVar.onProgress(str2, j4, j5);
                        }
                    };
                    handler.post(r1);
                }
            }
        }
    }

    /* renamed from: com.dylanvann.fastimage1.b$b  reason: collision with other inner class name */
    static class C0249b extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        public final String f23268a;

        /* renamed from: b  reason: collision with root package name */
        public final ResponseBody f23269b;

        /* renamed from: c  reason: collision with root package name */
        public final c f23270c;

        /* renamed from: d  reason: collision with root package name */
        private BufferedSource f23271d;

        public final long contentLength() {
            return this.f23269b.contentLength();
        }

        public final MediaType contentType() {
            return this.f23269b.contentType();
        }

        public final BufferedSource source() {
            if (this.f23271d == null) {
                this.f23271d = Okio.buffer((Source) new ForwardingSource(this.f23269b.source()) {

                    /* renamed from: a  reason: collision with root package name */
                    long f23272a;

                    public final long read(Buffer buffer, long j) throws IOException {
                        long read = super.read(buffer, j);
                        long contentLength = C0249b.this.f23269b.contentLength();
                        if (read == -1) {
                            this.f23272a = contentLength;
                        } else {
                            this.f23272a += read;
                        }
                        C0249b.this.f23270c.a(C0249b.this.f23268a, this.f23272a, contentLength);
                        return read;
                    }
                });
            }
            return this.f23271d;
        }

        C0249b(String str, ResponseBody responseBody, c cVar) {
            this.f23268a = str;
            this.f23269b = responseBody;
            this.f23270c = cVar;
        }
    }

    interface c {
        void a(String str, long j, long j2);
    }

    static void a(String str) {
        f23258a.a(str);
    }

    public final void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        OkHttpClient.Builder newBuilder = OkHttpClientProvider.getOkHttpClient().newBuilder();
        final a aVar = f23258a;
        registry.replace(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory(newBuilder.addInterceptor(new Interceptor() {
            public final Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request();
                Response proceed = chain.proceed(request);
                return proceed.newBuilder().body(new C0249b(request.url().toString(), proceed.body(), aVar)).build();
            }
        }).build()));
    }
}
