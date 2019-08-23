package com.ss.android.ugc.aweme.freeflowcard.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.freeflowcard.data.a;
import com.ss.android.ugc.aweme.freeflowcard.data.b.b;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48563a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile f f48564b;

    private f() {
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f48563a, false, 46158, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48563a, false, 46158, new Class[0], Boolean.TYPE)).booleanValue();
        }
        b c2 = a.a().c();
        if (c2.isOpen || c2.changeType != 1) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f48563a, false, 46159, new Class[0], Boolean.TYPE)) {
            return com.ss.android.ugc.aweme.freeflowcard.b.a().i;
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48563a, false, 46159, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f48563a, true, 46157, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f48563a, true, 46157, new Class[0], f.class);
        }
        if (f48564b == null) {
            synchronized (f.class) {
                if (f48564b == null) {
                    f48564b = new f();
                }
            }
        }
        return f48564b;
    }
}
