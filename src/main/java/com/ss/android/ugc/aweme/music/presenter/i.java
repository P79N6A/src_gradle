package com.ss.android.ugc.aweme.music.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.music.ui.d;

public final class i extends b<h, d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56352a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56352a, false, 60023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56352a, false, 60023, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2979f != null) {
            ((d) this.f2979f).a();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f56352a, false, 60024, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f56352a, false, 60024, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((d) this.f2979f).b();
        }
    }
}
