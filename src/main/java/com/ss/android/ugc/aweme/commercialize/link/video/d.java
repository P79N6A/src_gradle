package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38996a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f38997b;

    /* renamed from: c  reason: collision with root package name */
    private final o f38998c;

    d(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f38997b = commerceTagLayout;
        this.f38998c = oVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f38996a, false, 30924, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38996a, false, 30924, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f38997b;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new e(commerceTagLayout, this.f38998c));
    }
}
