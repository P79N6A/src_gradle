package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.g;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class i implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57973a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57974b;

    i(c cVar) {
        this.f57974b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57973a, false, 63171, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57973a, false, 63171, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57974b;
        int b2 = c.a().b(29);
        g gVar = new g();
        a.a((com.ss.android.ugc.aweme.im.service.session.a) gVar, baseNotice2);
        if (!cVar.a(baseNotice2, gVar, b2) && !d.a.a(29, baseNotice2.createTime)) {
            gVar.m = b2;
            b.a().updateNoticeSession(gVar);
        }
    }
}
