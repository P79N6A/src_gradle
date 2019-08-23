package com.ss.android.ugc.aweme.y;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.c.a;
import com.ss.android.ugc.aweme.main.c.e;
import com.ss.android.ugc.aweme.main.c.f;
import org.greenrobot.eventbus.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76942a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f76942a, true, 62691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f76942a, true, 62691, new Class[0], Void.TYPE);
        } else {
            c.a().d(new a());
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f76942a, true, 62693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f76942a, true, 62693, new Class[0], Void.TYPE);
        } else {
            c.a().d(new f());
        }
    }

    public static void c() {
        if (PatchProxy.isSupport(new Object[0], null, f76942a, true, 62694, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f76942a, true, 62694, new Class[0], Void.TYPE);
        } else {
            c.a().d(new e());
        }
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, null, f76942a, true, 62692, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, null, f76942a, true, 62692, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c.a().d(new a(false));
    }
}
