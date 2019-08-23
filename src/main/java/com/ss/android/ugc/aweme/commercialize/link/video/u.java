package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39048a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39049b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39050c;

    u(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39049b = commerceTagLayout;
        this.f39050c = oVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39048a, false, 30951, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39048a, false, 30951, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f39049b;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new v(commerceTagLayout, this.f39050c));
    }
}
