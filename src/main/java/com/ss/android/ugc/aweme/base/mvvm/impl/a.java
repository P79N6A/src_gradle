package com.ss.android.ugc.aweme.base.mvvm.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.mvvm.c;
import com.ss.android.ugc.aweme.base.mvvm.e;

public class a<T extends c> implements e<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34767a;

    /* renamed from: b  reason: collision with root package name */
    protected T f34768b;

    public final T a() {
        return this.f34768b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f34767a, false, 24671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34767a, false, 24671, new Class[0], Void.TYPE);
            return;
        }
        if (this.f34768b != null) {
            this.f34768b.refresh();
        }
    }

    public final void a(T t) {
        this.f34768b = t;
    }
}
