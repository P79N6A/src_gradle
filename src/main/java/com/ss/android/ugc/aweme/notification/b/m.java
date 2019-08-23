package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.f;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class m implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57982a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57983b;

    m(c cVar) {
        this.f57983b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57982a, false, 63175, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57982a, false, 63175, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57983b;
        int b2 = c.a().b(103);
        f fVar = new f();
        a.a((com.ss.android.ugc.aweme.im.service.session.a) fVar, baseNotice2);
        if (!cVar.a(baseNotice2, fVar, b2) && !d.a.a(103, baseNotice2.createTime)) {
            fVar.m = b2;
            b.a().updateNoticeSession(fVar);
        }
    }
}
