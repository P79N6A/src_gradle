package com.ss.android.ugc.aweme.feed;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45451a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45452b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45453c;

    h(d dVar, Aweme aweme) {
        this.f45452b = dVar;
        this.f45453c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45451a, false, 40024, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45451a, false, 40024, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45452b.a(this.f45453c, view);
    }
}
