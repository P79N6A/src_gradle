package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.m;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class h implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57971a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57972b;

    h(c cVar) {
        this.f57972b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57971a, false, 63170, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57971a, false, 63170, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57972b;
        int b2 = c.a().b(16);
        m mVar = new m();
        a.a((com.ss.android.ugc.aweme.im.service.session.a) mVar, baseNotice2);
        if (!cVar.a(baseNotice2, mVar, b2) && !d.a.a(16, baseNotice2.createTime)) {
            mVar.m = b2;
            b.a().updateNoticeSession(mVar);
        }
    }
}