package com.ss.android.ugc.a;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f31515c;

    /* renamed from: a  reason: collision with root package name */
    public Context f31516a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.a.b.b f31517b;

    /* renamed from: d  reason: collision with root package name */
    private OkHttpClient f31518d;

    public final OkHttpClient b() {
        if (this.f31518d == null) {
            this.f31518d = c();
        }
        return this.f31518d;
    }

    public static b a() {
        if (f31515c == null) {
            synchronized (b.class) {
                if (f31515c == null) {
                    f31515c = new b();
                }
            }
        }
        return f31515c;
    }

    private static OkHttpClient c() {
        return new OkHttpClient().newBuilder().connectTimeout(60, TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
    }

    public final b a(Context context) {
        this.f31516a = context;
        return this;
    }

    public final b a(OkHttpClient okHttpClient) {
        this.f31518d = okHttpClient;
        return this;
    }
}
