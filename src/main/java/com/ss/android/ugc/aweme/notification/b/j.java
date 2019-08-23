package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.n;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class j implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57975a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57976b;

    j(c cVar) {
        this.f57976b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57975a, false, 63172, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57975a, false, 63172, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57976b;
        int b2 = c.a().b(32);
        n nVar = new n();
        a.a((com.ss.android.ugc.aweme.im.service.session.a) nVar, baseNotice2);
        if (!cVar.a(baseNotice2, nVar, b2) && !d.a.a(32, baseNotice2.createTime)) {
            nVar.m = b2;
            b.a().updateNoticeSession(nVar);
        }
    }
}
