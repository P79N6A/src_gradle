package com.mapbox.a;

import com.google.gson.GsonBuilder;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.b;
import retrofit2.d;
import retrofit2.e;
import retrofit2.n;

public abstract class a<T, S> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25907a;

    /* renamed from: b  reason: collision with root package name */
    protected OkHttpClient f25908b;

    /* renamed from: c  reason: collision with root package name */
    public Call.Factory f25909c;

    /* renamed from: d  reason: collision with root package name */
    public n f25910d;

    /* renamed from: e  reason: collision with root package name */
    private final Class<S> f25911e;

    /* renamed from: f  reason: collision with root package name */
    private b<T> f25912f;
    private S g;

    /* access modifiers changed from: protected */
    public abstract String d();

    /* access modifiers changed from: protected */
    public abstract b<T> w();

    /* access modifiers changed from: protected */
    public GsonBuilder x() {
        return new GsonBuilder();
    }

    /* access modifiers changed from: protected */
    public final b<T> y() {
        if (this.f25912f == null) {
            this.f25912f = w();
        }
        return this.f25912f;
    }

    private synchronized OkHttpClient a() {
        if (this.f25908b == null) {
            if (this.f25907a) {
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                builder.addInterceptor(httpLoggingInterceptor);
                this.f25908b = builder.build();
            } else {
                this.f25908b = new OkHttpClient();
            }
        }
        return this.f25908b;
    }

    /* access modifiers changed from: protected */
    public final S z() {
        if (this.g != null) {
            return this.g;
        }
        n.a a2 = new n.a().a(d()).a((e.a) retrofit2.b.a.a.a(x().create()));
        if (this.f25909c != null) {
            a2.a(this.f25909c);
        } else {
            a2.a(a());
        }
        this.f25910d = a2.a();
        this.g = this.f25910d.a(this.f25911e);
        return this.g;
    }

    public a(Class<S> cls) {
        this.f25911e = cls;
    }

    public void a(d<T> dVar) {
        y().a(dVar);
    }
}
