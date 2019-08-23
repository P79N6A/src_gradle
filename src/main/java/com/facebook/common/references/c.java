package com.facebook.common.references;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@VisibleForTesting
public final class c<T> {
    @GuardedBy

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Object, Integer> f23551c = new IdentityHashMap();
    @GuardedBy

    /* renamed from: a  reason: collision with root package name */
    T f23552a;

    /* renamed from: b  reason: collision with root package name */
    final b<T> f23553b;
    @GuardedBy

    /* renamed from: d  reason: collision with root package name */
    private int f23554d = 1;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public final synchronized T a() {
        return this.f23552a;
    }

    private synchronized boolean d() {
        boolean z;
        if (this.f23554d > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private void e() {
        if (!a(this)) {
            throw new a();
        }
    }

    public final synchronized void b() {
        e();
        this.f23554d++;
    }

    /* access modifiers changed from: package-private */
    public synchronized int c() {
        boolean z;
        e();
        if (this.f23554d > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f23554d--;
        return this.f23554d;
    }

    private static boolean a(c<?> cVar) {
        if (cVar.d()) {
            return true;
        }
        return false;
    }

    static void a(Object obj) {
        synchronized (f23551c) {
            Integer num = f23551c.get(obj);
            if (num == null) {
                FLog.wtf("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f23551c.remove(obj);
            } else {
                f23551c.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public c(T t, b<T> bVar) {
        this.f23552a = Preconditions.checkNotNull(t);
        this.f23553b = (b) Preconditions.checkNotNull(bVar);
        synchronized (f23551c) {
            Integer num = f23551c.get(t);
            if (num == null) {
                f23551c.put(t, 1);
            } else {
                f23551c.put(t, Integer.valueOf(num.intValue() + 1));
            }
        }
    }
}
