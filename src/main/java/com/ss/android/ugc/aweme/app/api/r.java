package com.ss.android.ugc.aweme.app.api;

import a.i;
import a.j;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class r extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33881a;

    static final class a implements CallAdapter<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33882a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33883b;

        public final Type a() {
            return this.f33883b;
        }

        a(Type type) {
            this.f33883b = type;
        }

        public final /* synthetic */ Object a(Call call) {
            Call call2 = call;
            if (PatchProxy.isSupport(new Object[]{call2}, this, f33882a, false, 23139, new Class[]{Call.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{call2}, this, f33882a, false, 23139, new Class[]{Call.class}, i.class);
            }
            final j jVar = new j();
            call2.enqueue(new c<R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33884a;

                public final void a(Call<R> call, SsResponse<R> ssResponse) {
                    if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f33884a, false, 23140, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f33884a, false, 23140, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                    } else if (ssResponse.isSuccessful()) {
                        jVar.b(ssResponse.body());
                    } else {
                        jVar.b((Exception) new RuntimeException("HttpException"));
                    }
                }

                public final void a(Call<R> call, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{call, th}, this, f33884a, false, 23141, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, th}, this, f33884a, false, 23141, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                    } else if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f1091a;
        }
    }

    static final class b implements CallAdapter<i<SsResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33887a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33888b;

        public final Type a() {
            return this.f33888b;
        }

        b(Type type) {
            this.f33888b = type;
        }

        public final /* synthetic */ Object a(Call call) {
            Call call2 = call;
            if (PatchProxy.isSupport(new Object[]{call2}, this, f33887a, false, 23142, new Class[]{Call.class}, i.class)) {
                return (i) PatchProxy.accessDispatch(new Object[]{call2}, this, f33887a, false, 23142, new Class[]{Call.class}, i.class);
            }
            final j jVar = new j();
            call2.enqueue(new c<R>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33889a;

                public final void a(Call<R> call, SsResponse<R> ssResponse) {
                    if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f33889a, false, 23143, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f33889a, false, 23143, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                    } else if (ssResponse.isSuccessful()) {
                        jVar.b(ssResponse);
                    } else {
                        jVar.b((Exception) new RuntimeException("HttpException"));
                    }
                }

                public final void a(Call<R> call, Throwable th) {
                    if (PatchProxy.isSupport(new Object[]{call, th}, this, f33889a, false, 23144, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{call, th}, this, f33889a, false, 23144, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                    } else if (th instanceof Exception) {
                        jVar.b((Exception) th);
                    } else {
                        jVar.b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f1091a;
        }
    }

    r() {
    }

    public final CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, retrofit}, this, f33881a, false, 23138, new Class[]{Type.class, Annotation[].class, Retrofit.class}, CallAdapter.class)) {
            return (CallAdapter) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, retrofit}, this, f33881a, false, 23138, new Class[]{Type.class, Annotation[].class, Retrofit.class}, CallAdapter.class);
        } else if (getRawType(type) != i.class) {
            return null;
        } else {
            if (type2 instanceof ParameterizedType) {
                Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type2);
                if (getRawType(parameterUpperBound) != SsResponse.class) {
                    return new a(parameterUpperBound);
                }
                if (parameterUpperBound instanceof ParameterizedType) {
                    return new b(getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
                }
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
            throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
        }
    }
}
