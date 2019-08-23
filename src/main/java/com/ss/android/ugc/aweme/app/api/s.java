package com.ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class s extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33892a;

    static final class a implements CallAdapter<q> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33893a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33894b;

        public final Type a() {
            return this.f33894b;
        }

        a(Type type) {
            this.f33894b = type;
        }

        public final /* synthetic */ Object a(Call call) {
            final Call call2 = call;
            if (!PatchProxy.isSupport(new Object[]{call2}, this, f33893a, false, 23147, new Class[]{Call.class}, q.class)) {
                return new com.google.common.util.concurrent.b<R>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33895a;

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f33895a, false, 23148, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f33895a, false, 23148, new Class[0], Void.TYPE);
                            return;
                        }
                        call2.cancel();
                    }

                    {
                        call2.enqueue(new c<R>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33898a;

                            public final void a(Call<R> call, SsResponse<R> ssResponse) {
                                if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f33898a, false, 23149, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f33898a, false, 23149, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                                } else if (ssResponse.isSuccessful()) {
                                    AnonymousClass1.this.b(ssResponse.body());
                                } else {
                                    AnonymousClass1.this.a((Throwable) new RuntimeException("HttpException"));
                                }
                            }

                            public final void a(Call<R> call, Throwable th) {
                                Throwable th2 = th;
                                if (PatchProxy.isSupport(new Object[]{call, th2}, this, f33898a, false, 23150, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, th2}, this, f33898a, false, 23150, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                                    return;
                                }
                                AnonymousClass1.this.a(th2);
                            }
                        });
                    }
                };
            }
            return (q) PatchProxy.accessDispatch(new Object[]{call2}, this, f33893a, false, 23147, new Class[]{Call.class}, q.class);
        }
    }

    static final class b implements CallAdapter<q<SsResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33900a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f33901b;

        public final Type a() {
            return this.f33901b;
        }

        b(Type type) {
            this.f33901b = type;
        }

        public final /* synthetic */ Object a(Call call) {
            final Call call2 = call;
            if (!PatchProxy.isSupport(new Object[]{call2}, this, f33900a, false, 23151, new Class[]{Call.class}, q.class)) {
                return new com.google.common.util.concurrent.b<SsResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33902a;

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f33902a, false, 23152, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f33902a, false, 23152, new Class[0], Void.TYPE);
                            return;
                        }
                        call2.cancel();
                    }

                    {
                        call2.enqueue(new c<R>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f33905a;

                            public final void a(Call<R> call, SsResponse<R> ssResponse) {
                                SsResponse<R> ssResponse2 = ssResponse;
                                if (PatchProxy.isSupport(new Object[]{call, ssResponse2}, this, f33905a, false, 23153, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, ssResponse2}, this, f33905a, false, 23153, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
                                    return;
                                }
                                AnonymousClass1.this.b(ssResponse2);
                            }

                            public final void a(Call<R> call, Throwable th) {
                                Throwable th2 = th;
                                if (PatchProxy.isSupport(new Object[]{call, th2}, this, f33905a, false, 23154, new Class[]{Call.class, Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{call, th2}, this, f33905a, false, 23154, new Class[]{Call.class, Throwable.class}, Void.TYPE);
                                    return;
                                }
                                AnonymousClass1.this.a(th2);
                            }
                        });
                    }
                };
            }
            return (q) PatchProxy.accessDispatch(new Object[]{call2}, this, f33900a, false, 23151, new Class[]{Call.class}, q.class);
        }
    }

    s() {
    }

    public final CallAdapter<?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{type2, annotationArr, retrofit}, this, f33892a, false, 23146, new Class[]{Type.class, Annotation[].class, Retrofit.class}, CallAdapter.class)) {
            return (CallAdapter) PatchProxy.accessDispatch(new Object[]{type2, annotationArr, retrofit}, this, f33892a, false, 23146, new Class[]{Type.class, Annotation[].class, Retrofit.class}, CallAdapter.class);
        } else if (getRawType(type) != q.class) {
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
            throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
        }
    }
}
