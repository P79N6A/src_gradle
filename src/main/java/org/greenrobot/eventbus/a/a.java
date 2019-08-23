package org.greenrobot.eventbus.a;

import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.e;
import org.greenrobot.eventbus.n;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Class f84082a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<? extends c> f84083b = null;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f84084c;

    public final Class a() {
        return this.f84082a;
    }

    public final c b() {
        if (this.f84083b == null) {
            return null;
        }
        try {
            return (c) this.f84083b.newInstance();
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }

    protected a(Class cls, Class<? extends c> cls2, boolean z) {
        this.f84082a = cls;
        this.f84084c = z;
    }

    /* access modifiers changed from: protected */
    public final n a(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        try {
            n nVar = new n(this.f84082a.getDeclaredMethod(str, new Class[]{cls}), cls, threadMode, i, z);
            return nVar;
        } catch (NoSuchMethodException e2) {
            throw new e("Could not find subscriber method in " + this.f84082a + ". Maybe a missing ProGuard rule?", e2);
        }
    }
}
