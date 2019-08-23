package com.ss.android.ugc.aweme.photomovie.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.transition.c;
import com.ss.android.ugc.aweme.photomovie.transition.e;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58925a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f58926b;

    /* renamed from: c  reason: collision with root package name */
    private c f58927c;

    /* renamed from: d  reason: collision with root package name */
    private a f58928d;

    public final boolean a() {
        return this.f58926b;
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f58925a, false, 64048, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f58925a, false, 64048, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (this.f58928d.a()) {
            this.f58926b = true;
            eVar.a().a(this.f58927c.b());
        }
    }

    public final void b(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f58925a, false, 64049, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f58925a, false, 64049, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f58926b = false;
        eVar.a().b(this.f58927c.b());
    }

    public d(c cVar, a aVar) {
        this.f58927c = cVar;
        this.f58928d = aVar;
    }
}
