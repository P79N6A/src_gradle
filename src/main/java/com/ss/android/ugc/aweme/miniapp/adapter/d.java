package com.ss.android.ugc.aweme.miniapp.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.adapter.RecentlyMicroAppListAdapter;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55471a;

    /* renamed from: b  reason: collision with root package name */
    private final f f55472b;

    /* renamed from: c  reason: collision with root package name */
    private final RecentlyMicroAppListAdapter.a f55473c;

    d(f fVar, RecentlyMicroAppListAdapter.a aVar) {
        this.f55472b = fVar;
        this.f55473c = aVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55471a, false, 59175, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55471a, false, 59175, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        f fVar = this.f55472b;
        RecentlyMicroAppListAdapter.a aVar = this.f55473c;
        ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(view.getContext(), fVar.getSchema(), new b.a().b("setting_page").c("021001").a());
        aVar.a(fVar.getAppId());
        r.a("mp_click", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("mp_id", fVar.getAppId()).a("author_id", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).a("enter_from", "setting_page").a("_param_for_special", fVar.getType() == 1 ? "micro_app" : "micro_game").f34114b);
    }
}
