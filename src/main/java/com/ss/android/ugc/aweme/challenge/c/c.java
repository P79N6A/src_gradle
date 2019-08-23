package com.ss.android.ugc.aweme.challenge.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.discover.model.Challenge;

public final class c extends b<b, h> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35370a;

    public c() {
        a(new b());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35370a, false, 25864, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35370a, false, 25864, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null)) {
            ((h) this.f2979f).a((Challenge) ((b) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35370a, false, 25863, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35370a, false, 25863, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((h) this.f2979f).a(exc);
        }
    }
}
