package com.alipay.b.b.a.a;

import android.os.Looper;
import com.alipay.b.b.a.a.a.d;
import com.alipay.b.b.a.a.a.e;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Object> f5250a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f5251b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private byte f5252c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f5253d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private ae f5254e;

    public ag(ae aeVar) {
        this.f5254e = aeVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (!(Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())) {
            OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
            boolean z = method.getAnnotation(ResetCookie.class) != null;
            Type genericReturnType = method.getGenericReturnType();
            method.getAnnotations();
            f5250a.set(null);
            f5251b.set(null);
            if (operationType != null) {
                String a2 = operationType.a();
                int incrementAndGet = this.f5253d.incrementAndGet();
                try {
                    if (this.f5252c == 0) {
                        e eVar = new e(incrementAndGet, a2, objArr);
                        if (f5251b.get() != null) {
                            eVar.a(f5251b.get());
                        }
                        q qVar = new q(this.f5254e.f5245a, method, incrementAndGet, a2, eVar.a(), z);
                        f5251b.set(null);
                        Object a3 = new d(genericReturnType, (byte[]) qVar.a()).a();
                        if (genericReturnType != Void.TYPE) {
                            f5250a.set(a3);
                        }
                    }
                    return f5250a.get();
                } catch (c e2) {
                    e2.setOperationType(a2);
                    throw e2;
                }
            } else {
                throw new IllegalStateException("OperationType must be set.");
            }
        } else {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
    }
}
