package com.ss.android.ugc.aweme.setting.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class i extends b<k, j> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63946a;

    public i() {
        a(new k());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63946a, false, 72279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63946a, false, 72279, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((j) this.f2979f).af_();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f63946a, false, 72278, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f63946a, false, 72278, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((j) this.f2979f).b(exc);
        }
    }
}
