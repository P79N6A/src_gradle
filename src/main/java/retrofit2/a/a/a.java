package retrofit2.a.a;

import com.google.common.util.concurrent.q;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.c;
import retrofit2.d;
import retrofit2.m;
import retrofit2.n;

public final class a extends c.a {

    /* renamed from: retrofit2.a.a.a$a  reason: collision with other inner class name */
    static final class C0902a<R> implements c<R, q<R>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f84214a;

        public final Type a() {
            return this.f84214a;
        }

        C0902a(Type type) {
            this.f84214a = type;
        }

        public final /* synthetic */ Object a(final retrofit2.b bVar) {
            return new com.google.common.util.concurrent.b<R>() {
                public final void c() {
                    bVar.b();
                }

                {
                    bVar.a(new d<R>() {
                        public final void a(retrofit2.b<R> bVar, Throwable th) {
                            AnonymousClass1.this.a(th);
                        }

                        public final void a(retrofit2.b<R> bVar, m<R> mVar) {
                            if (mVar.d()) {
                                AnonymousClass1.this.b(mVar.f84319b);
                            } else {
                                AnonymousClass1.this.a((Throwable) new b(mVar));
                            }
                        }
                    });
                }
            };
        }
    }

    static final class b<R> implements c<R, q<m<R>>> {

        /* renamed from: a  reason: collision with root package name */
        private final Type f84218a;

        public final Type a() {
            return this.f84218a;
        }

        b(Type type) {
            this.f84218a = type;
        }

        public final /* synthetic */ Object a(final retrofit2.b bVar) {
            return new com.google.common.util.concurrent.b<m<R>>() {
                public final void c() {
                    bVar.b();
                }

                {
                    bVar.a(new d<R>() {
                        public final void a(retrofit2.b<R> bVar, Throwable th) {
                            AnonymousClass1.this.a(th);
                        }

                        public final void a(retrofit2.b<R> bVar, m<R> mVar) {
                            AnonymousClass1.this.b(mVar);
                        }
                    });
                }
            };
        }
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (a(type) != q.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = a(0, (ParameterizedType) type);
            if (a(a2) != m.class) {
                return new C0902a(a2);
            }
            if (a2 instanceof ParameterizedType) {
                return new b(a(0, (ParameterizedType) a2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
