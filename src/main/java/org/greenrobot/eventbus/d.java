package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class d {
    private static final ExecutorService m = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    boolean f84108a = true;

    /* renamed from: b  reason: collision with root package name */
    boolean f84109b = true;

    /* renamed from: c  reason: collision with root package name */
    boolean f84110c = true;

    /* renamed from: d  reason: collision with root package name */
    boolean f84111d = true;

    /* renamed from: e  reason: collision with root package name */
    boolean f84112e;

    /* renamed from: f  reason: collision with root package name */
    boolean f84113f = true;
    boolean g;
    boolean h;
    public ExecutorService i = m;
    public List<org.greenrobot.eventbus.a.d> j;
    g k;
    h l;

    static Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public final c b() {
        c cVar;
        synchronized (c.class) {
            if (c.f84095b == null) {
                cVar = new c(this);
                c.f84095b = cVar;
            } else {
                throw new e("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return cVar;
    }
}
