package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.i;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class g implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57969a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57970b;

    g(c cVar) {
        this.f57970b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57969a, false, 63169, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57969a, false, 63169, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57970b;
        int b2 = c.a().b(33);
        i iVar = new i();
        if (!cVar.a(baseNotice2, iVar, b2) && !d.a.a(33, baseNotice2.createTime)) {
            a.a((com.ss.android.ugc.aweme.im.service.session.a) iVar, baseNotice2);
            iVar.m = b2;
            b.a().updateNoticeSession(iVar);
        }
    }
}
