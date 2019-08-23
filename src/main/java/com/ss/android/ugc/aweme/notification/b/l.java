package com.ss.android.ugc.aweme.notification.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.notification.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.c.e;
import com.ss.android.ugc.aweme.notification.c.h;
import com.ss.android.ugc.aweme.notification.d;
import com.ss.android.ugc.aweme.notification.d.a;

public final /* synthetic */ class l implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57979a;

    /* renamed from: b  reason: collision with root package name */
    private final c f57980b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57981c = 31;

    l(c cVar, int i) {
        this.f57980b = cVar;
    }

    public final void a(BaseNotice baseNotice) {
        BaseNotice baseNotice2 = baseNotice;
        if (PatchProxy.isSupport(new Object[]{baseNotice2}, this, f57979a, false, 63174, new Class[]{BaseNotice.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseNotice2}, this, f57979a, false, 63174, new Class[]{BaseNotice.class}, Void.TYPE);
            return;
        }
        c cVar = this.f57980b;
        int i = this.f57981c;
        e eVar = new e();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), baseNotice2, eVar}, cVar, c.f3697a, false, 63158, new Class[]{Integer.TYPE, BaseNotice.class, h.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), baseNotice2, eVar};
            ChangeQuickRedirect changeQuickRedirect = c.f3697a;
            Object[] objArr2 = objArr;
            c cVar2 = cVar;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, 63158, new Class[]{Integer.TYPE, BaseNotice.class, h.class}, Void.TYPE);
            return;
        }
        int b2 = c.a().b(i);
        if (!cVar.a(baseNotice2, eVar, b2) && !d.a.a(i, baseNotice2.createTime)) {
            a.a((com.ss.android.ugc.aweme.im.service.session.a) eVar, baseNotice2);
            eVar.m = b2;
            b.a().updateNoticeSession(eVar);
        }
    }
}
