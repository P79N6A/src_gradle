package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.r;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class n implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57984a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57985b;

    n(c cVar) {
        this.f57985b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57984a, false, 63176, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57984a, false, 63176, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57985b;
        int b2 = c.a().b(45);
        r rVar = new r();
        a.a((com.ss.android.ugc.aweme.im.service.session.a) rVar, baseNotice2);
        if (!cVar.a(baseNotice2, rVar, b2) && !d.a.a(45, baseNotice2.createTime) && !d.a.a(10, baseNotice2.createTime)) {
            rVar.m = b2;
            b.a().updateNoticeSession(rVar);
        }
    }
}
