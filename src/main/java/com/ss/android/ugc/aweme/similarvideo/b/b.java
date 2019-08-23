package com.ss.android.ugc.aweme.similarvideo.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;

public final class b<T extends a> extends com.ss.android.ugc.aweme.common.f.b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71520a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f71521b;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71520a, false, 81622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71520a, false, 81622, new Class[0], Void.TYPE);
            return;
        }
        this.f71521b = true;
        super.b();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f71520a, false, 81623, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f71520a, false, 81623, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f71521b = false;
        super.a(exc);
    }
}
