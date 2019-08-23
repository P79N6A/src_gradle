package com.ss.android.ugc.aweme.live.livehostimpl;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public final /* synthetic */ class t implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53481a;

    /* renamed from: b  reason: collision with root package name */
    private final a f53482b;

    t(a aVar) {
        this.f53482b = aVar;
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f53481a, false, 55841, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f53481a, false, 55841, new Class[]{Bundle.class}, Void.TYPE);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53481a, false, 55840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53481a, false, 55840, new Class[0], Void.TYPE);
            return;
        }
        this.f53482b.a(g.a(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser()));
    }
}
