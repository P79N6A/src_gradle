package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.greenrobot.eventbus.c;

public final class bg {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75615a;

    public static void a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f75615a, true, 88272, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, null, f75615a, true, 88272, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c.a().d(obj2);
    }

    public static void b(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f75615a, true, 88273, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, null, f75615a, true, 88273, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c.a().e(obj2);
    }

    public static void c(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f75615a, true, 88274, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, null, f75615a, true, 88274, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!c.a().b(obj2)) {
            c.a().a(obj2);
        }
    }

    public static void d(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f75615a, true, 88275, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, null, f75615a, true, 88275, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (c.a().b(obj2)) {
            c.a().c(obj2);
        }
    }
}
