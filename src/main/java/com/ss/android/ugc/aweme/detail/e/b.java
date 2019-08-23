package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;

public final class b extends com.ss.android.ugc.aweme.common.b<a, j> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41184a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f41184a, false, 34996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41184a, false, 34996, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null || ((a) this.f2978e).getData() == null)) {
            ((j) this.f2979f).b(((BatchDetailList) ((a) this.f2978e).getData()).getItems());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f41184a, false, 34995, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f41184a, false, 34995, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((j) this.f2979f).f(exc);
        }
    }
}
