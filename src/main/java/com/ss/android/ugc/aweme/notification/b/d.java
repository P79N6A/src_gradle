package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.l;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class d implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57963a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57964b;

    d(c cVar) {
        this.f57964b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57963a, false, 63166, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57963a, false, 63166, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57964b;
        int b2 = c.a().b(46);
        l lVar = new l();
        if (!cVar.a(baseNotice2, lVar, b2) && !d.a.a(46, baseNotice2.createTime)) {
            a.a((com.ss.android.ugc.aweme.im.service.session.a) lVar, baseNotice2);
            lVar.m = b2;
            b.a().updateNoticeSession(lVar);
        }
    }
}
