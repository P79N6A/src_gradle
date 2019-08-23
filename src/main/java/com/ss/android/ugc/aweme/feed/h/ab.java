package com.ss.android.ugc.aweme.feed.h;

import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c.a;

public final class ab extends a<aa, u> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f45465b;

    public final int c() {
        if (this.f2978e == null) {
            return 0;
        }
        return ((aa) this.f2978e).f45461b;
    }

    public final void b() {
        Pair pair;
        if (PatchProxy.isSupport(new Object[0], this, f45465b, false, 42087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45465b, false, 42087, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2978e == null) {
            pair = null;
        } else {
            pair = (Pair) ((aa) this.f2978e).getData();
        }
        if (pair != null) {
            com.ss.android.ugc.aweme.feed.a.a().c((String) pair.first, ((Integer) pair.second).intValue());
        }
        if (this.f2979f != null) {
            ((u) this.f2979f).a(pair);
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45465b, false, 42086, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45465b, false, 42086, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((u) this.f2979f).a(exc);
        }
    }
}
