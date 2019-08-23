package com.ss.android.ugc.aweme.poi.ui.accelerate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.poi.model.an;

public final class e extends b<d, f> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60527a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60527a, false, 66224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60527a, false, 66224, new Class[0], Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((f) this.f2979f).a((an) ((d) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f60527a, false, 66225, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f60527a, false, 66225, new Class[]{Exception.class}, Void.TYPE);
        } else if (this.f2979f != null && this.f2978e != null) {
            ((f) this.f2979f).h();
        }
    }
}
