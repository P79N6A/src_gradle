package com.ss.android.ugc.aweme.livewallpaper.b;

import android.opengl.EGL14;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53617a;

    /* renamed from: b  reason: collision with root package name */
    c f53618b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53617a, false, 56088, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53617a, false, 56088, new Class[0], Void.TYPE);
            return;
        }
        this.f53618b.a();
    }

    public final void finalize() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, f53617a, false, 56089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53617a, false, 56089, new Class[0], Void.TYPE);
            return;
        }
        try {
            if (this.f53618b != null) {
                this.f53618b.finalize();
            }
        } finally {
            super.finalize();
        }
    }

    public static Object b() {
        if (PatchProxy.isSupport(new Object[0], null, f53617a, true, 56100, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], null, f53617a, true, 56100, new Class[0], Object.class);
        }
        if (i.a()) {
            if (PatchProxy.isSupport(new Object[0], null, b.f53613a, true, 56087, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], null, b.f53613a, true, 56087, new Class[0], Object.class);
            }
            return EGL14.eglGetCurrentContext();
        } else if (PatchProxy.isSupport(new Object[0], null, a.f53608a, true, 56072, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], null, a.f53608a, true, 56072, new Class[0], Object.class);
        } else {
            return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
        }
    }

    public d(Object obj, int i) {
        if (i.a()) {
            this.f53618b = new b(obj, 0);
        } else {
            this.f53618b = new a(obj, 0);
        }
    }

    public final int a(Object obj, int i) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2, Integer.valueOf(i)}, this, f53617a, false, 56099, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)) {
            return this.f53618b.a(obj2, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj2, Integer.valueOf(i)}, this, f53617a, false, 56099, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)).intValue();
    }
}
