package com.ss.android.ugc.aweme.m;

import com.bytedance.usergrowth.data.a.a.e;
import com.bytedance.usergrowth.data.a.a.f;
import com.bytedance.usergrowth.data.a.a.g;
import com.bytedance.usergrowth.data.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54109a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f54110b = new AtomicBoolean();

    static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f54109a, true, 49495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f54109a, true, 49495, new Class[0], Void.TYPE);
        } else if (f54110b.compareAndSet(false, true)) {
            c.a(e.class, new a());
            c.a(g.class, new c());
            c.a(f.class, new b());
        }
    }
}
