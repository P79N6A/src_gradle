package org.greenrobot.eventbus;

import java.lang.reflect.Method;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    final Method f84133a;

    /* renamed from: b  reason: collision with root package name */
    final ThreadMode f84134b;

    /* renamed from: c  reason: collision with root package name */
    final Class<?> f84135c;

    /* renamed from: d  reason: collision with root package name */
    final int f84136d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f84137e;

    /* renamed from: f  reason: collision with root package name */
    String f84138f;

    public final int hashCode() {
        return this.f84133a.hashCode();
    }

    private synchronized void a() {
        if (this.f84138f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f84133a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f84133a.getName());
            sb.append('(');
            sb.append(this.f84135c.getName());
            this.f84138f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        a();
        n nVar = (n) obj;
        nVar.a();
        return this.f84138f.equals(nVar.f84138f);
    }

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f84133a = method;
        this.f84134b = threadMode;
        this.f84135c = cls;
        this.f84136d = i;
        this.f84137e = z;
    }
}
