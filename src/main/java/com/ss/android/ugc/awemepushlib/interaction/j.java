package com.ss.android.ugc.awemepushlib.interaction;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.awemepushapi.e;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77024a;

    /* renamed from: c  reason: collision with root package name */
    private static j f77025c;

    /* renamed from: b  reason: collision with root package name */
    private e f77026b;

    public static e a() {
        if (PatchProxy.isSupport(new Object[0], null, f77024a, true, 90214, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], null, f77024a, true, 90214, new Class[0], e.class);
        }
        return b().f77026b;
    }

    private static j b() {
        if (PatchProxy.isSupport(new Object[0], null, f77024a, true, 90213, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f77024a, true, 90213, new Class[0], j.class);
        }
        if (f77025c != null) {
            return f77025c;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private j(e eVar) {
        this.f77026b = eVar;
    }

    static synchronized void a(e eVar) {
        e eVar2 = eVar;
        synchronized (j.class) {
            if (PatchProxy.isSupport(new Object[]{eVar2}, null, f77024a, true, 90212, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, null, f77024a, true, 90212, new Class[]{e.class}, Void.TYPE);
            } else if (eVar2 == null) {
                throw new IllegalArgumentException("请使用MainInterfaceForPush实例初始化");
            } else if (f77025c == null) {
                f77025c = new j(eVar2);
            } else {
                f77025c.f77026b = eVar2;
            }
        }
    }
}
