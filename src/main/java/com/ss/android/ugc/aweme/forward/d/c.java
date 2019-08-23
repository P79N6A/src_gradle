package com.ss.android.ugc.aweme.forward.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.forward.model.a;
import com.ss.android.ugc.aweme.utils.bg;

public final class c extends b<a, com.ss.android.ugc.aweme.forward.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48281a;

    /* renamed from: b  reason: collision with root package name */
    public String f48282b;

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48281a, false, 45423, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48281a, false, 45423, new Class[]{Exception.class}, Void.TYPE);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48281a, false, 45424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48281a, false, 45424, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.forward.c.a aVar = new com.ss.android.ugc.aweme.forward.c.a(2);
        aVar.f48269c = this.f48282b;
        bg.a(aVar);
    }
}
