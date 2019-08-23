package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class k implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57977a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57978b;

    k(c cVar) {
        this.f57978b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57977a, false, 63173, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57977a, false, 63173, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57978b;
        int b2 = c.a().b(21);
        com.ss.android.ugc.aweme.notification.c.a aVar = new com.ss.android.ugc.aweme.notification.c.a();
        if (!cVar.a(baseNotice2, aVar, b2) && !d.a.a(21, baseNotice2.createTime)) {
            a.a((com.ss.android.ugc.aweme.im.service.session.a) aVar, baseNotice2);
            aVar.m = b2;
            b.a().updateNoticeSession(aVar);
        }
    }
}
