package com.ss.android.ugc.aweme.captcha.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.captcha.a.c;
import com.ss.android.ugc.aweme.common.b;

public final class d extends b<com.ss.android.ugc.aweme.captcha.a.d, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35273a;

    public d() {
        a(new com.ss.android.ugc.aweme.captcha.a.d());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35273a, false, 25721, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35273a, false, 25721, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((a) this.f2979f).a((c) ((com.ss.android.ugc.aweme.captcha.a.d) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35273a, false, 25722, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35273a, false, 25722, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((a) this.f2979f).a(exc);
        }
    }
}
