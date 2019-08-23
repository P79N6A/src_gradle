package com.bytedance.retrofit2;

import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.client.Request;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

public final class g extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    final Executor f21857a;

    static final class a<T> implements Call<T>, i {

        /* renamed from: a  reason: collision with root package name */
        final Executor f21860a;

        /* renamed from: b  reason: collision with root package name */
        final Call<T> f21861b;

        public final void cancel() {
            this.f21861b.cancel();
        }

        public final SsResponse execute() throws Exception {
            return this.f21861b.execute();
        }

        public final boolean isCanceled() {
            return this.f21861b.isCanceled();
        }

        public final boolean isExecuted() {
            return this.f21861b.isExecuted();
        }

        public final Request request() {
            return this.f21861b.request();
        }

        public final Call<T> clone() {
            return new a(this.f21860a, this.f21861b.clone());
        }

        public final void doCollect() {
            if (this.f21861b instanceof i) {
                ((i) this.f21861b).doCollect();
            }
        }

        public final void enqueue(final c<T> cVar) {
            if (cVar != null) {
                this.f21861b.enqueue(new h<T>() {
                    public final void a(Call<T> call, final SsResponse<T> ssResponse) {
                        a.this.f21860a.execute(new Runnable() {
                            public final void run() {
                                if (a.this.f21861b.isCanceled()) {
                                    cVar.a((Call<T>) a.this, (Throwable) new IOException("Canceled"));
                                } else {
                                    cVar.a((Call<T>) a.this, ssResponse);
                                }
                            }
                        });
                    }

                    public final void b(Call<T> call, SsResponse<T> ssResponse) {
                        if (cVar instanceof h) {
                            ((h) cVar).b(call, ssResponse);
                        }
                    }

                    public final void a(Call<T> call, final Throwable th) {
                        a.this.f21860a.execute(new Runnable() {
                            public final void run() {
                                cVar.a((Call<T>) a.this, th);
                            }
                        });
                    }
                });
                return;
            }
            throw new NullPointerException("callback == null");
        }

        a(Executor executor, Call<T> call) {
            this.f21860a = executor;
            this.f21861b = call;
        }
    }

    g(Executor executor) {
        this.f21857a = executor;
    }

    public final CallAdapter<Call<?>> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e2 = s.e(type);
        return new CallAdapter<Call<?>>() {
            public final Type a() {
                return e2;
            }

            public final /* synthetic */ Object a(Call call) {
                return new a(g.this.f21857a, call);
            }
        };
    }
}
