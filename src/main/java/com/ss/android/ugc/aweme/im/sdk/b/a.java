package com.ss.android.ugc.aweme.im.sdk.b;

import a.i;
import a.j;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import retrofit2.c;
import retrofit2.d;
import retrofit2.m;
import retrofit2.n;

public final class a extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50149a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f50150b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.b.a$a  reason: collision with other inner class name */
    static class C0596a<R> implements c<R, i<R>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50151a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f50152b;

        /* renamed from: c  reason: collision with root package name */
        private final Type f50153c;

        public final Type a() {
            return this.f50153c;
        }

        public final /* synthetic */ Object a(@NonNull final retrofit2.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f50151a, false, 50190, new Class[]{retrofit2.b.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{bVar}, this, f50151a, false, 50190, new Class[]{retrofit2.b.class}, i.class);
            }
            final j jVar = new j();
            if (this.f50152b != null) {
                this.f50152b.execute(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50154a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50154a, false, 50192, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50154a, false, 50192, new Class[0], Void.TYPE);
                            return;
                        }
                        try {
                            C0596a.this.a(bVar.a(), jVar);
                        } catch (IOException e2) {
                            jVar.b((Exception) e2);
                        }
                    }
                });
            } else {
                bVar.a(new d<R>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50158a;

                    public final void a(@NonNull retrofit2.b<R> bVar, @NonNull Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{bVar, th2}, this, f50158a, false, 50194, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, th2}, this, f50158a, false, 50194, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                            return;
                        }
                        jVar.b(new Exception(th2));
                    }

                    public final void a(@NonNull retrofit2.b<R> bVar, @NonNull m<R> mVar) {
                        if (PatchProxy.isSupport(new Object[]{bVar, mVar}, this, f50158a, false, 50193, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, mVar}, this, f50158a, false, 50193, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                            return;
                        }
                        C0596a.this.a(mVar, jVar);
                    }
                });
            }
            return jVar.f1091a;
        }

        C0596a(Executor executor, Type type) {
            this.f50152b = executor;
            this.f50153c = type;
        }

        public final void a(m<R> mVar, j<R> jVar) {
            m<R> mVar2 = mVar;
            j<R> jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{mVar2, jVar2}, this, f50151a, false, 50191, new Class[]{m.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mVar2, jVar2}, this, f50151a, false, 50191, new Class[]{m.class, j.class}, Void.TYPE);
                return;
            }
            try {
                if (mVar.d()) {
                    jVar2.b(mVar2.f84319b);
                } else {
                    jVar2.b((Exception) new IOException("HttpException"));
                }
            } catch (CancellationException unused) {
                jVar.b();
            } catch (Exception e2) {
                jVar2.b(e2);
            }
        }
    }

    static class b<R> implements c<R, i<m<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50161a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f50162b;

        /* renamed from: c  reason: collision with root package name */
        private final Type f50163c;

        public final Type a() {
            return this.f50163c;
        }

        public final /* synthetic */ Object a(@NonNull final retrofit2.b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f50161a, false, 50195, new Class[]{retrofit2.b.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{bVar}, this, f50161a, false, 50195, new Class[]{retrofit2.b.class}, i.class);
            }
            final j jVar = new j();
            if (this.f50162b != null) {
                this.f50162b.execute(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50164a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50164a, false, 50197, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50164a, false, 50197, new Class[0], Void.TYPE);
                            return;
                        }
                        try {
                            b.this.a(bVar.a(), jVar);
                        } catch (IOException e2) {
                            jVar.b((Exception) e2);
                        }
                    }
                });
            } else {
                bVar.a(new d<R>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50168a;

                    public final void a(@NonNull retrofit2.b<R> bVar, @NonNull Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{bVar, th2}, this, f50168a, false, 50199, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, th2}, this, f50168a, false, 50199, new Class[]{retrofit2.b.class, Throwable.class}, Void.TYPE);
                            return;
                        }
                        jVar.b(new Exception(th2));
                    }

                    public final void a(@NonNull retrofit2.b<R> bVar, @NonNull m<R> mVar) {
                        if (PatchProxy.isSupport(new Object[]{bVar, mVar}, this, f50168a, false, 50198, new Class[]{retrofit2.b.class, m.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar, mVar}, this, f50168a, false, 50198, new Class[]{retrofit2.b.class, m.class}, Void.TYPE);
                            return;
                        }
                        b.this.a(mVar, jVar);
                    }
                });
            }
            return jVar.f1091a;
        }

        b(Executor executor, Type type) {
            this.f50162b = executor;
            this.f50163c = type;
        }

        public final void a(m<R> mVar, j<m<R>> jVar) {
            m<R> mVar2 = mVar;
            j<m<R>> jVar2 = jVar;
            if (PatchProxy.isSupport(new Object[]{mVar2, jVar2}, this, f50161a, false, 50196, new Class[]{m.class, j.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mVar2, jVar2}, this, f50161a, false, 50196, new Class[]{m.class, j.class}, Void.TYPE);
                return;
            }
            try {
                jVar2.b(mVar2);
            } catch (CancellationException unused) {
                jVar.b();
            } catch (Exception e2) {
                jVar2.b(e2);
            }
        }
    }

    public a(Executor executor) {
        this.f50150b = executor;
    }

    public final c<?, ?> a(@NonNull Type type, @NonNull Annotation[] annotationArr, @NonNull n nVar) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, nVar}, this, f50149a, false, 50189, new Class[]{Type.class, Annotation[].class, n.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, nVar}, this, f50149a, false, 50189, new Class[]{Type.class, Annotation[].class, n.class}, c.class);
        } else if (a(type) != i.class) {
            return null;
        } else {
            if (type2 instanceof ParameterizedType) {
                Type a2 = a(0, (ParameterizedType) type2);
                if (a(a2) != m.class) {
                    return new C0596a(this.f50150b, a2);
                }
                if (a2 instanceof ParameterizedType) {
                    return new b(this.f50150b, a(0, (ParameterizedType) a2));
                }
                throw new IllegalArgumentException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            throw new IllegalArgumentException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
        }
    }
}
