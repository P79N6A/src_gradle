package com.ss.android.ugc.aweme.challenge.ui;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35696a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f35697b;

    l(ImageView imageView) {
        this.f35697b = imageView;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f35696a, false, 26170, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f35696a, false, 26170, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f35697b.performClick();
    }
}
