package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.RealInterceptorChain;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.Executor;

public class SsHttpCall<T> implements Call<T>, i, j {
    public static a sThrottleControl;
    private long appCallTime;
    public final Object[] args;
    public final CallServerInterceptor callServerInterceptor;
    public boolean isInDelayTimeRange;
    public Request originalRequest;
    public Throwable preBuildURLException;
    public final p<T> serviceMethod;

    public interface a {
        boolean e();

        boolean e(String str);

        int f();
    }

    /* access modifiers changed from: package-private */
    public SsResponse getResponseWithInterceptorChain() throws Exception {
        return q.a(this);
    }

    public SsHttpCall<T> clone() {
        return new SsHttpCall<>(this.serviceMethod, this.args);
    }

    public void doCollect() {
        if (this.callServerInterceptor != null) {
            this.callServerInterceptor.doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.callServerInterceptor != null) {
            return this.callServerInterceptor.getRequestInfo();
        }
        return null;
    }

    public boolean isCanceled() {
        if (this.callServerInterceptor == null || !this.callServerInterceptor.f21823c) {
            return false;
        }
        return true;
    }

    public void cancel() {
        com.bytedance.retrofit2.client.a aVar;
        if (this.callServerInterceptor != null) {
            CallServerInterceptor callServerInterceptor2 = this.callServerInterceptor;
            callServerInterceptor2.f21823c = true;
            synchronized (callServerInterceptor2) {
                aVar = callServerInterceptor2.f21821a;
            }
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public synchronized boolean isExecuted() {
        boolean z;
        if (this.callServerInterceptor == null || !this.callServerInterceptor.a()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    public SsResponse<T> execute() throws Exception {
        this.appCallTime = System.currentTimeMillis();
        this.originalRequest = this.serviceMethod.a(null, this.args);
        if (sThrottleControl != null && sThrottleControl.e() && sThrottleControl.e(this.originalRequest.getPath())) {
            Thread.sleep((long) sThrottleControl.f());
        }
        return getResponseWithInterceptorChain();
    }

    public SsResponse getResponseWithInterceptorChain$___twin___() throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.serviceMethod.f21935e);
        linkedList.add(this.callServerInterceptor);
        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(linkedList, 0, this.originalRequest, this, new o(this.appCallTime, System.currentTimeMillis()));
        return realInterceptorChain.proceed(this.originalRequest);
    }

    public Request request() {
        if (this.callServerInterceptor != null) {
            Request request = this.callServerInterceptor.f21822b;
            if (request != null) {
                return request;
            }
        }
        if (this.originalRequest == null) {
            try {
                this.originalRequest = this.serviceMethod.a(null, this.args);
            } catch (RuntimeException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RuntimeException("Unable to create request.", e3);
            }
        }
        return this.originalRequest;
    }

    public static void setThrottleControl(a aVar) {
        sThrottleControl = aVar;
    }

    public void enqueue(final c<T> cVar) {
        final h hVar;
        this.appCallTime = System.currentTimeMillis();
        if (cVar == null) {
            throw new NullPointerException("callback == null");
        } else if (this.callServerInterceptor == null || !this.callServerInterceptor.a()) {
            final Executor executor = this.serviceMethod.f21936f;
            if (cVar instanceof h) {
                hVar = (h) cVar;
            } else {
                hVar = null;
            }
            final AnonymousClass1 r2 = new r() {
                public final int a() {
                    return SsHttpCall.this.serviceMethod.g;
                }

                public final boolean b() {
                    return SsHttpCall.this.serviceMethod.h;
                }

                public final int c() {
                    if (SsHttpCall.sThrottleControl == null || !SsHttpCall.this.isInDelayTimeRange || !SsHttpCall.sThrottleControl.e(SsHttpCall.this.originalRequest.getPath())) {
                        return 0;
                    }
                    return SsHttpCall.sThrottleControl.f();
                }

                public final void run() {
                    try {
                        if (SsHttpCall.this.preBuildURLException == null) {
                            if (SsHttpCall.this.originalRequest == null) {
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.a(hVar, SsHttpCall.this.args);
                            }
                            SsResponse responseWithInterceptorChain = SsHttpCall.this.getResponseWithInterceptorChain();
                            try {
                                cVar.a((Call<T>) SsHttpCall.this, responseWithInterceptorChain);
                                if (hVar != null) {
                                    hVar.b(SsHttpCall.this, responseWithInterceptorChain);
                                }
                            } catch (Throwable unused) {
                            }
                        } else {
                            throw SsHttpCall.this.preBuildURLException;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            };
            if (sThrottleControl == null || !sThrottleControl.e()) {
                executor.execute(r2);
            } else {
                executor.execute(new r() {
                    public final int c() {
                        return 0;
                    }

                    public final int a() {
                        return SsHttpCall.this.serviceMethod.g;
                    }

                    public final boolean b() {
                        return SsHttpCall.this.serviceMethod.h;
                    }

                    public final void run() {
                        try {
                            if (SsHttpCall.this.originalRequest == null) {
                                SsHttpCall.this.originalRequest = SsHttpCall.this.serviceMethod.a(hVar, SsHttpCall.this.args);
                            }
                            SsHttpCall.this.isInDelayTimeRange = true;
                        } catch (Throwable th) {
                            SsHttpCall.this.preBuildURLException = th;
                        }
                        executor.execute(r2);
                    }
                });
            }
        } else {
            throw new IllegalStateException("Already executed.");
        }
    }

    SsHttpCall(p<T> pVar, Object[] objArr) {
        this.serviceMethod = pVar;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(pVar);
    }
}
