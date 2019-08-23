package com.ss.android.ugc.aweme.discover.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.friends.model.RecommendList;

public final class g extends b<f, c> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42704a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42704a, false, 37189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42704a, false, 37189, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((c) this.f2979f).a((RecommendList) ((f) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f42704a, false, 37188, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f42704a, false, 37188, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((c) this.f2979f).a(exc);
        }
    }
}
