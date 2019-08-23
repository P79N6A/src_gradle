package com.ss.android.ugc.aweme.feed.h;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class w extends b<v, ac> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45533a;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45533a, false, 42078, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45533a, false, 42078, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45533a, false, 42079, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45533a, false, 42079, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((ac) this.f2979f).a((String) ((v) this.f2978e).getData());
        }
    }
}
