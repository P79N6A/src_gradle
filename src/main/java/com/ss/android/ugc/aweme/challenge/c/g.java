package com.ss.android.ugc.aweme.challenge.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.ss.android.ugc.aweme.common.b;

public class g extends b<e, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35380a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35380a, false, 25885, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35380a, false, 25885, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((i) this.f2979f).a((SearchChallengeList) ((e) this.f2978e).getData());
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f35380a, false, 25886, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35380a, false, 25886, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((i) this.f2979f).b();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35380a, false, 25884, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35380a, false, 25884, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((i) this.f2979f).a(exc);
        }
    }
}
