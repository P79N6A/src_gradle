package com.ss.android.ugc.aweme.followrequest.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;

public final class b extends com.ss.android.ugc.aweme.common.b<a, d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48241a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48241a, false, 45321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48241a, false, 45321, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (this.f2979f != null && ((d) this.f2979f).isViewValid() && this.f2978e != null && ((a) this.f2978e).getData() != null) {
            ((d) this.f2979f).a(((FollowRequestResponse) ((a) this.f2978e).getData()).getTotal());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48241a, false, 45322, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48241a, false, 45322, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
    }
}
