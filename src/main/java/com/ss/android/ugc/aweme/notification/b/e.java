package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.q;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57965a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57966b;

    e(c cVar) {
        this.f57966b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57965a, false, 63167, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57965a, false, 63167, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57966b;
        int b2 = c.a().b(47);
        q qVar = new q();
        if (!cVar.a(baseNotice2, qVar, b2) && !d.a.a(47, baseNotice2.createTime)) {
            a.a((com.ss.android.ugc.aweme.im.service.session.a) qVar, baseNotice2);
            qVar.m = b2;
            b.a().updateNoticeSession(qVar);
        }
    }
}
