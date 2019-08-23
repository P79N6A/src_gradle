package com.ss.android.ugc.aweme.poi.ui.accelerate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;

public final class k extends b<j, m> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60538a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60538a, false, 66233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60538a, false, 66233, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((m) this.f2979f).a((l) ((j) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60538a, false, 66234, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60538a, false, 66234, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((m) this.f2979f).i();
        }
    }
}
