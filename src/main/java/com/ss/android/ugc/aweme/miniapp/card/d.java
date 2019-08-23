package com.ss.android.ugc.aweme.miniapp.card;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55638a;

    /* renamed from: b  reason: collision with root package name */
    private final MicroAppVideoCardView f55639b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f55640c;

    d(MicroAppVideoCardView microAppVideoCardView, Aweme aweme) {
        this.f55639b = microAppVideoCardView;
        this.f55640c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f55638a, false, 59195, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f55638a, false, 59195, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f55639b.a(this.f55640c);
    }
}
