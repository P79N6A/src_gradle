package com.ss.android.ugc.aweme.newfollow.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.newfollow.e.d;
import com.ss.android.ugc.aweme.newfollow.ui.i;
import org.greenrobot.eventbus.Subscribe;

public class a extends b<d, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3642a;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3642a, false, 61209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3642a, false, 61209, new Class[0], Void.TYPE);
            return;
        }
        super.b();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3642a, false, 61210, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3642a, false, 61210, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
    }

    @Subscribe
    public void onDeleteItemEvent(com.ss.android.ugc.aweme.newfollow.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3642a, false, 61211, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3642a, false, 61211, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null && ((i) this.f2979f).isViewValid() && aVar.f57079a == 3) {
            a(aVar.f57081c);
        }
    }
}
