package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55635a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55636b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f55637c;

    c(MicroAppVideoCardView microAppVideoCardView, Aweme aweme) {
        this.f55636b = microAppVideoCardView;
        this.f55637c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55635a, false, 59194, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55635a, false, 59194, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f55636b.a(this.f55637c);
    }
}
