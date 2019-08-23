package com.ss.android.ugc.aweme.commercialize.views;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40111a;

    /* renamed from: b  reason: collision with root package name */
    private final AdHalfWebPageFragment f40112b;

    j(AdHalfWebPageFragment adHalfWebPageFragment) {
        this.f40112b = adHalfWebPageFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40111a, false, 32781, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40111a, false, 32781, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AdHalfWebPageFragment adHalfWebPageFragment = this.f40112b;
        if (adHalfWebPageFragment.F) {
            adHalfWebPageFragment.i.stopLoading();
        } else {
            adHalfWebPageFragment.i.reload();
        }
    }
}
