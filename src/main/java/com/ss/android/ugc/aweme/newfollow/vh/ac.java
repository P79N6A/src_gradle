package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.e.f;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.f.d;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Map;

public final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57698a;

    /* renamed from: b  reason: collision with root package name */
    private final UpLoadRecoverItemViewHolder f57699b;

    /* renamed from: c  reason: collision with root package name */
    private final f f57700c;

    public ac(UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder, f fVar) {
        this.f57699b = upLoadRecoverItemViewHolder;
        this.f57700c = fVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57698a, false, 62672, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57698a, false, 62672, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        UpLoadRecoverItemViewHolder upLoadRecoverItemViewHolder = this.f57699b;
        f fVar = this.f57700c;
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().publishFromDraft(upLoadRecoverItemViewHolder.f57687b, fVar.f57113a);
        bg.a(new d(false));
        r.a("publish_retry", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("action_type", "publish").a("creation_id", fVar.f57113a.p()).f34114b);
    }
}
