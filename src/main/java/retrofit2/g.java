package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.c;

public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    final Executor f84257a;

    static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        final Executor f84260a;

        /* renamed from: b  reason: collision with root package name */
        final b<T> f84261b;

        public final m<T> a() throws IOException {
            return this.f84261b.a();
        }

        public final void b() {
            this.f84261b.b();
        }

        public final boolean c() {
            return this.f84261b.c();
        }

        public final Request e() {
            return this.f84261b.e();
        }

        /* renamed from: d */
        public final b<T> clone() {
            return new a(this.f84260a, this.f84261b.d());
        }

        public final void a(final d<T> dVar) {
            p.a(dVar, "callback == null");
            this.f84261b.a(new d<T>() {
                public final void a(b<T> bVar, final Throwable th) {
                    a.this.f84260a.execute(new Runnable() {
                        public final void run() {
                            dVar.a((b<T>) a.this, th);
                        }
                    });
                }

                public final void a(b<T> bVar, final m<T> mVar) {
                    a.this.f84260a.execute(new Runnable() {
                        public final void run() {
                            if (a.this.f84261b.c()) {
                                dVar.a((b<T>) a.this, (Throwable) new IOException("Canceled"));
                            } else {
                                dVar.a((b<T>) a.this, mVar);
                            }
                        }
                    });
                }
            });
        }

        a(Executor executor, b<T> bVar) {
            this.f84260a = executor;
            this.f84261b = bVar;
        }
    }

    g(Executor executor) {
        this.f84257a = executor;
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (a(type) != b.class) {
            return null;
        }
        final Type e2 = p.e(type);
        return new c<Object, b<?>>() {
            public final Type a() {
                return e2;
            }

            public final /* synthetic */ Object a(b bVar) {
                return new a(g.this.f84257a, bVar);
            }
        };
    }
}
