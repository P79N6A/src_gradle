package com.ss.android.ugc.aweme.comment.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.utils.bg;

public final class h extends b<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36421a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36422b;

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f36421a, false, 27342, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36421a, false, 27342, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f2978e == null) {
            return 0;
        } else {
            return ((g) this.f2978e).a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36421a, false, 27339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36421a, false, 27339, new Class[0], Void.TYPE);
            return;
        }
        this.f36422b = true;
        super.b();
        if (this.f2978e != null) {
            a.a().b(((g) this.f2978e).f36412d, ((g) this.f2978e).a());
            bg.a(new ar(14, ((g) this.f2978e).f36412d));
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36421a, false, 27341, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36421a, false, 27341, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f36422b = true;
        super.a(exc);
    }
}
