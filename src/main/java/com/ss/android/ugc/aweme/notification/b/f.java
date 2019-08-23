package com.ss.android.ugc.aweme.notification.b;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.message.c.c;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57967a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57968b;

    f(c cVar) {
        this.f57968b = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f57967a, false, 63168, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f57967a, false, 63168, new Class[0], Object.class);
        }
        c cVar = this.f57968b;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f3697a, false, 63147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f3697a, false, 63147, new Class[0], Void.TYPE);
        } else {
            IIMService a2 = b.a(false);
            if (a2 != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("unread_count", c.a().b(11));
                a2.onNewNoticeArrived(1, bundle);
            }
        }
        cVar.a();
        cVar.b();
        cVar.d();
        cVar.e();
        cVar.f();
        cVar.g();
        c.i();
        cVar.c();
        cVar.j();
        cVar.k();
        cVar.h();
        return null;
    }
}
