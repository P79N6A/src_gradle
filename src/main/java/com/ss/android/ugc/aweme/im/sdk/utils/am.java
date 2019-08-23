package com.ss.android.ugc.aweme.im.sdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class am<T> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52481b;

    /* renamed from: a  reason: collision with root package name */
    private T f52482a;

    public abstract T a();

    public final T b() {
        T t;
        if (PatchProxy.isSupport(new Object[0], this, f52481b, false, 53684, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f52481b, false, 53684, new Class[0], Object.class);
        }
        synchronized (this) {
            if (this.f52482a == null) {
                this.f52482a = a();
            }
            t = this.f52482a;
        }
        return t;
    }
}
