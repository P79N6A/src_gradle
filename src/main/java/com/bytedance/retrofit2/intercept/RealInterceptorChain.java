package com.bytedance.retrofit2.intercept;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.a;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.o;
import com.ss.android.ugc.aweme.v.b;
import com.ss.android.ugc.aweme.v.c;
import java.util.List;

public class RealInterceptorChain implements Interceptor.Chain {
    private final Call call;
    private int calls;
    public final int index;
    private final List<Interceptor> interceptors;
    public o metrics;
    private final Request request;

    public Call call() {
        return this.call;
    }

    public o metrics() {
        return this.metrics;
    }

    public Request request() {
        return this.request;
    }

    public SsResponse proceed(Request request2) throws Exception {
        o oVar = this.metrics;
        if (!(oVar instanceof b)) {
            b bVar = new b(oVar.f21929a, oVar.f21930b);
            this.metrics = bVar;
            oVar = bVar;
        }
        SsResponse proceed$___twin___ = proceed$___twin___(request2);
        if (Integer.valueOf(this.index).intValue() == 0 && proceed$___twin___.raw() != null && (proceed$___twin___.raw().getExtraInfo() instanceof a)) {
            a aVar = (a) proceed$___twin___.raw().getExtraInfo();
            if (aVar.h > 0 && (oVar instanceof b)) {
                b bVar2 = (b) oVar;
                bVar2.i = System.currentTimeMillis();
                bVar2.j = SystemClock.uptimeMillis() - bVar2.k;
                c.f75987b.a(request2.getUrl(), aVar, bVar2);
            }
        }
        return proceed$___twin___;
    }

    public SsResponse proceed$___twin___(Request request2) throws Exception {
        String str;
        if (this.index < this.interceptors.size()) {
            this.calls++;
            if (this.calls > 1) {
                for (Interceptor next : this.interceptors) {
                    if (next instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) next).b();
                    }
                }
            }
            RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.interceptors, this.index + 1, request2, this.call, this.metrics);
            Interceptor interceptor = this.interceptors.get(this.index);
            StringBuilder sb = new StringBuilder("interceptor = ");
            if (interceptor != null) {
                str = interceptor.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" url = ");
            sb.append(request2.getUrl());
            SsResponse intercept = interceptor.intercept(realInterceptorChain);
            if (this.index + 1 < this.interceptors.size() && realInterceptorChain.calls <= 0) {
                throw new IllegalStateException("interceptor " + interceptor + " must call proceed() at least once");
            } else if (intercept == null) {
                throw new NullPointerException("interceptor " + interceptor + " returned null");
            } else if (intercept.raw() != null) {
                return intercept;
            } else {
                throw new IllegalStateException("interceptor " + interceptor + " returned a ssResponse with no body");
            }
        } else {
            throw new AssertionError();
        }
    }

    public RealInterceptorChain(List<Interceptor> list, int i, Request request2, Call call2, o oVar) {
        this.interceptors = list;
        this.index = i;
        this.request = request2;
        this.call = call2;
        this.metrics = oVar;
    }
}
