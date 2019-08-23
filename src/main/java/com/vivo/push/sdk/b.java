package com.vivo.push.sdk;

import com.vivo.push.util.o;
import java.lang.reflect.Method;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Method f81642a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f81643b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object[] f81644c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a f81645d;

    public final void run() {
        try {
            this.f81642a.invoke(this.f81643b, this.f81644c);
        } catch (Exception e2) {
            o.b("CommandWorker", "reflect e: ", e2);
        }
    }

    b(a aVar, Method method, Object obj, Object[] objArr) {
        this.f81645d = aVar;
        this.f81642a = method;
        this.f81643b = obj;
        this.f81644c = objArr;
    }
}
