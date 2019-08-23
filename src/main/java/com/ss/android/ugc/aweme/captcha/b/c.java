package com.ss.android.ugc.aweme.captcha.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.captcha.a.e;
import com.ss.android.ugc.aweme.captcha.a.f;
import com.ss.android.ugc.aweme.common.b;

public final class c extends b<f, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35272a;

    public c() {
        a(new f());
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f35272a, false, 25719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35272a, false, 25719, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((b) this.f2979f).a((e) ((f) this.f2978e).getData());
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f35272a, false, 25720, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f35272a, false, 25720, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((b) this.f2979f).b(exc);
        }
    }
}
