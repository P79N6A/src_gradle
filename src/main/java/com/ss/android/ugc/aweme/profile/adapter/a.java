package com.ss.android.ugc.aweme.profile.adapter;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.services.IAVService;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61286a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxViewHolder f61287b;

    a(DraftBoxViewHolder draftBoxViewHolder) {
        this.f61287b = draftBoxViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61286a, false, 67384, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61286a, false, 67384, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DraftBoxViewHolder draftBoxViewHolder = this.f61287b;
        if (PatchProxy.isSupport(new Object[0], draftBoxViewHolder, DraftBoxViewHolder.f61244a, false, 67381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], draftBoxViewHolder, DraftBoxViewHolder.f61244a, false, 67381, new Class[0], Void.TYPE);
        } else if (!d.a().isLogin()) {
            e.a((Activity) draftBoxViewHolder.f61245b, "", "click_draft");
        } else {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().enterDraftBox((Activity) draftBoxViewHolder.f61245b);
            r.onEvent(MobClick.obtain().setEventName("click_draft").setLabelName("personal_homepage"));
        }
    }
}
