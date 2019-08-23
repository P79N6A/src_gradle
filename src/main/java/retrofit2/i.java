package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public final class i<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final o<T, ?> f84269a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f84270b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f84271c;
    @GuardedBy
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private Call f84272d;
    @GuardedBy
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private Throwable f84273e;
    @GuardedBy

    /* renamed from: f  reason: collision with root package name */
    private boolean f84274f;

    static final class a extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        IOException f84277a;

        /* renamed from: b  reason: collision with root package name */
        private final ResponseBody f84278b;

        public final void close() {
            this.f84278b.close();
        }

        public final long contentLength() {
            return this.f84278b.contentLength();
        }

        public final MediaType contentType() {
            return this.f84278b.contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer((Source) new ForwardingSource(this.f84278b.source()) {
                public final long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e2) {
                        a.this.f84277a = e2;
                        throw e2;
                    }
                }
            });
        }

        a(ResponseBody responseBody) {
            this.f84278b = responseBody;
        }
    }

    static final class b extends ResponseBody {

        /* renamed from: a  reason: collision with root package name */
        private final MediaType f84280a;

        /* renamed from: b  reason: collision with root package name */
        private final long f84281b;

        public final long contentLength() {
            return this.f84281b;
        }

        public final MediaType contentType() {
            return this.f84280a;
        }

        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        b(MediaType mediaType, long j) {
            this.f84280a = mediaType;
            this.f84281b = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public i<T> d() {
        return new i<>(this.f84269a, this.f84270b);
    }

    public final void b() {
        Call call;
        this.f84271c = true;
        synchronized (this) {
            call = this.f84272d;
        }
        if (call != null) {
            call.cancel();
        }
    }

    private Call g() throws IOException {
        Call newCall = this.f84269a.f84338c.newCall(this.f84269a.a(this.f84270b));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public final boolean c() {
        boolean z = true;
        if (this.f84271c) {
            return true;
        }
        synchronized (this) {
            if (this.f84272d == null || !this.f84272d.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public final m<T> a() throws IOException {
        Call call;
        synchronized (this) {
            if (!this.f84274f) {
                this.f84274f = true;
                if (this.f84273e == null) {
                    call = this.f84272d;
                    if (call == null) {
                        try {
                            call = g();
                            this.f84272d = call;
                        } catch (IOException | RuntimeException e2) {
                            this.f84273e = e2;
                            throw e2;
                        }
                    }
                } else if (this.f84273e instanceof IOException) {
                    throw ((IOException) this.f84273e);
                } else {
                    throw ((RuntimeException) this.f84273e);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f84271c) {
            call.cancel();
        }
        return a(call.execute());
    }

    public final synchronized Request e() {
        Call call = this.f84272d;
        if (call != null) {
            return call.request();
        } else if (this.f84273e == null) {
            try {
                Call g = g();
                this.f84272d = g;
                return g.request();
            } catch (RuntimeException e2) {
                this.f84273e = e2;
                throw e2;
            } catch (IOException e3) {
                this.f84273e = e3;
                throw new RuntimeException("Unable to create request.", e3);
            }
        } else if (this.f84273e instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f84273e);
        } else {
            throw ((RuntimeException) this.f84273e);
        }
    }

    /* access modifiers changed from: package-private */
    public final m<T> a(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new b(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                ResponseBody a2 = p.a(body);
                p.a(a2, "body == null");
                p.a(build, "rawResponse == null");
                if (!build.isSuccessful()) {
                    return new m<>(build, null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return m.a(null, build);
        } else {
            try {
                return m.a(this.f84269a.f84340e.a(new a(body)), build);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public final void a(final d<T> dVar) {
        Call call;
        Throwable th;
        p.a(dVar, "callback == null");
        synchronized (this) {
            if (!this.f84274f) {
                this.f84274f = true;
                call = this.f84272d;
                th = this.f84273e;
                if (call == null && th == null) {
                    try {
                        Call g = g();
                        this.f84272d = g;
                        call = g;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f84273e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.a((b<T>) this, th);
            return;
        }
        if (this.f84271c) {
            call.cancel();
        }
        call.enqueue(new Callback() {
            public final void onFailure(Call call, IOException iOException) {
                try {
                    dVar.a((b<T>) i.this, (Throwable) iOException);
                } catch (Throwable unused) {
                }
            }

            public final void onResponse(Call call, Response response) throws IOException {
                try {
                    try {
                        dVar.a((b<T>) i.this, i.this.a(response));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    i(o<T, ?> oVar, @Nullable Object[] objArr) {
        this.f84269a = oVar;
        this.f84270b = objArr;
    }
}
