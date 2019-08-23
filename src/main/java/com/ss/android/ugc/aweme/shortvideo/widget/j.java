package com.ss.android.ugc.aweme.shortvideo.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.Map;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71463a;

    /* renamed from: b  reason: collision with root package name */
    private final h f71464b;

    j(h hVar) {
        this.f71464b = hVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71463a, false, 81471, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71463a, false, 81471, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        h hVar = this.f71464b;
        hVar.dismiss();
        r.a("publish_retry", (Map) d.a().a("action_type", "publish").a("creation_id", hVar.f71454d.p()).f34114b);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().publishFromDraft(hVar.f71453c, hVar.f71454d);
    }
}
