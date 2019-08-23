package org.greenrobot.eventbus.util;

import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f84168a;

    public final Integer a(Throwable th) {
        Throwable th2 = th;
        int i = 20;
        do {
            Class<?> cls = th2.getClass();
            Integer num = this.f84168a.get(cls);
            if (num == null) {
                Class cls2 = null;
                for (Map.Entry next : this.f84168a.entrySet()) {
                    Class cls3 = (Class) next.getKey();
                    if (cls3.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls3))) {
                        num = (Integer) next.getValue();
                        cls2 = cls3;
                    }
                }
            }
            if (num != null) {
                return num;
            }
            th2 = th2.getCause();
            i--;
            if (i <= 0 || th2 == th) {
                return null;
            }
        } while (th2 != null);
        return null;
    }
}
