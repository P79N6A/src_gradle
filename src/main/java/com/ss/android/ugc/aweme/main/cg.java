package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;

public abstract class cg<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54713b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<T> f54714c;

    public abstract void a(T t);

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, f54713b, false, 57733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54713b, false, 57733, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f54714c == null || this.f54714c.get() == null)) {
            a(this.f54714c.get());
        }
    }

    public cg(T t) {
        this.f54714c = new WeakReference<>(t);
    }
}
