package com.ss.android.ugc.aweme.app.api;

import a.i;
import a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.c;
import retrofit2.d;
import retrofit2.h;
import retrofit2.m;
import retrofit2.n;

public final class q extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33870a;

    static final class a<R> implements c<R, i<R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33871a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33872b;

        public final Type a() {
            return this.f33872b;
        }

        a(Type type) {
            this.f33872b = type;
        }

        public final /* synthetic */ Object a(retrofit2.b bVar) {
            retrofit2.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f33871a, false, 23131, new Class[]{retrofit2.b.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f33871a, false, 23131, new Class[]{retrofit2.b.class}, i.class);
            }
            final j jVar = new j();
            bVar2.a(new d<R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33873a;

                public final void a(retrofit2.b<R> bVar, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{bVar, th}, this, f33873a, false, 23133, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar, th}, this, f33873a, false, 23133, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                    } else if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }

                public final void a(retrofit2.b<R> bVar, m<R> mVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar, mVar}, this, f33873a, false, 23132, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar, mVar}, this, f33873a, false, 23132, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                    } else if (mVar.d()) {
                        jVar.b(mVar.f84319b);
                    } else {
                        jVar.b((Exception) new h(mVar));
                    }
                }
            });
            return jVar.f1091a;
        }
    }

    static final class b<R> implements c<R, i<m<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33876a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33877b;

        public final Type a() {
            return this.f33877b;
        }

        b(Type type) {
            this.f33877b = type;
        }

        public final /* synthetic */ Object a(retrofit2.b bVar) {
            retrofit2.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f33876a, false, 23134, new Class[]{retrofit2.b.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{bVar2}, this, f33876a, false, 23134, new Class[]{retrofit2.b.class}, i.class);
            }
            final j jVar = new j();
            bVar2.a(new d<R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33878a;

                public final void a(retrofit2.b<R> bVar, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{bVar, th}, this, f33878a, false, 23136, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar, th}, this, f33878a, false, 23136, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                    } else if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }

                public final void a(retrofit2.b<R> bVar, m<R> mVar) {
                    m<R> mVar2 = mVar;
                    if (PatchProxy.isSupport(new Object[]{bVar, mVar2}, this, f33878a, false, 23135, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar, mVar2}, this, f33878a, false, 23135, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                        return;
                    }
                    jVar.b(mVar2);
                }
            });
            return jVar.f1091a;
        }
    }

    q() {
    }

    public final c<?, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, nVar}, this, f33870a, false, 23130, new Class[]{Type.class, Annotation[].class, n.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, nVar}, this, f33870a, false, 23130, new Class[]{Type.class, Annotation[].class, n.class}, c.class);
        } else if (a(type) != i.class) {
            return null;
        } else {
            if (type2 instanceof ParameterizedType) {
                Type a2 = a(0, (ParameterizedType) type2);
                if (a(a2) != m.class) {
                    return new a(a2);
                }
                if (a2 instanceof ParameterizedType) {
                    return new b(a(0, (ParameterizedType) a2));
                }
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
        }
    }
}
