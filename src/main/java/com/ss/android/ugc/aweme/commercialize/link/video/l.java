package com.ss.android.ugc.aweme.commercialize.link.video;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39022a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceTagLayout f39023b;

    /* renamed from: c  reason: collision with root package name */
    private final o f39024c;

    l(CommerceTagLayout commerceTagLayout, o oVar) {
        this.f39023b = commerceTagLayout;
        this.f39024c = oVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39022a, false, 30939, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39022a, false, 30939, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        CommerceTagLayout commerceTagLayout = this.f39023b;
        commerceTagLayout.animate().alpha(0.0f).setDuration(200).withEndAction(new m(commerceTagLayout, this.f39024c));
    }
}
