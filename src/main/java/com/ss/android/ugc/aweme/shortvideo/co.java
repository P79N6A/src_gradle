package com.ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.camera.f;

public final class co implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66027a;

    /* renamed from: b  reason: collision with root package name */
    SafeHandler f66028b;

    /* renamed from: c  reason: collision with root package name */
    f f66029c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66027a, false, 74222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66027a, false, 74222, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f66029c.a();
        } else {
            this.f66028b.post(new cp(this));
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66027a, false, 74223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66027a, false, 74223, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f66029c.b();
        } else {
            this.f66028b.post(new cq(this));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f66027a, false, 74224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66027a, false, 74224, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f66029c.c();
        } else {
            this.f66028b.post(new cr(this));
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f66027a, false, 74225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66027a, false, 74225, new Class[0], Void.TYPE);
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f66029c.d();
        } else {
            this.f66028b.post(new cs(this));
        }
    }

    public co(LifecycleOwner lifecycleOwner, f fVar) {
        this.f66029c = fVar;
        this.f66028b = new SafeHandler(lifecycleOwner);
    }
}
