package com.ss.android.ugc.aweme.miniapp.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.b;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.Map;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55462a;

    /* renamed from: b  reason: collision with root package name */
    private final MostUseMicroAppViewHolder f55463b;

    /* renamed from: c  reason: collision with root package name */
    private final f f55464c;

    a(MostUseMicroAppViewHolder mostUseMicroAppViewHolder, f fVar) {
        this.f55463b = mostUseMicroAppViewHolder;
        this.f55464c = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55462a, false, 59160, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55462a, false, 59160, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        MostUseMicroAppViewHolder mostUseMicroAppViewHolder = this.f55463b;
        f fVar = this.f55464c;
        ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMiniApp(view.getContext(), fVar.getSchema(), new b.a().b("setting_page").c("021001").a());
        if (PatchProxy.isSupport(new Object[]{fVar}, mostUseMicroAppViewHolder, MostUseMicroAppViewHolder.f55449a, false, 59157, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, mostUseMicroAppViewHolder, MostUseMicroAppViewHolder.f55449a, false, 59157, new Class[]{f.class}, Void.TYPE);
            return;
        }
        r.a("mp_click", (Map) d.a().a("mp_id", fVar.getAppId()).a("author_id", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).a("enter_from", "setting_page").a("_param_for_special", fVar.getType() == 1 ? "micro_app" : "micro_game").f34114b);
    }
}
