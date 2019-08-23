package com.ss.android.ugc.aweme.miniapp.card;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.l.c;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55663a;

    /* renamed from: b  reason: collision with root package name */
    private final j f55664b;

    n(j jVar) {
        this.f55664b = jVar;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f55663a, false, 59209, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55663a, false, 59209, new Class[0], Void.TYPE);
            return;
        }
        j jVar = this.f55664b;
        if (!jVar.f55652b.f55628c) {
            jVar.f55652b.setVisibility(0);
        }
        jVar.a();
        MicroAppVideoCardView microAppVideoCardView = jVar.f55652b;
        if (PatchProxy.isSupport(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], microAppVideoCardView, MicroAppVideoCardView.f55626a, false, 59189, new Class[0], Void.TYPE);
        } else {
            microAppVideoCardView.f55627b = true;
            if (!microAppVideoCardView.f55628c) {
                microAppVideoCardView.setVisibility(0);
            }
            a.a(microAppVideoCardView, 200, (float) (-(microAppVideoCardView.getWidth() + ((ViewGroup.MarginLayoutParams) microAppVideoCardView.getLayoutParams()).leftMargin)), 0.0f, 0.0f, 0.0f);
            microAppVideoCardView.animate().alpha(1.0f).withStartAction(new f(microAppVideoCardView)).setDuration(200).withEndAction(new g(microAppVideoCardView)).start();
        }
        MicroAppVideoCardView microAppVideoCardView2 = jVar.f55652b;
        if (PatchProxy.isSupport(new Object[0], microAppVideoCardView2, MicroAppVideoCardView.f55626a, false, 59190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], microAppVideoCardView2, MicroAppVideoCardView.f55626a, false, 59190, new Class[0], Void.TYPE);
        } else {
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            String c2 = c.c(microAppVideoCardView2.j);
            iMiniAppService.preloadMiniApp("mp_id", iMiniAppService.isMicroAppSchema(c2) ? 1 : 2);
            r.a("mp_show", (Map) d.a().a("mp_id", iMiniAppService.getAppId(c2)).a(" group_id", microAppVideoCardView2.j.getAid()).a("position", "transform_card").a("enter_from", microAppVideoCardView2.k).a("_param_for_special", iMiniAppService.isMicroGameSchema(c2) ? "micro_game" : "micro_app").f34114b);
        }
        jVar.f55654d = true;
    }
}
