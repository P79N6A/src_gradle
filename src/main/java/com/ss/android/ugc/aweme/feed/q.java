package com.ss.android.ugc.aweme.feed;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45786a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45787b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45788c;

    q(d dVar, Aweme aweme) {
        this.f45787b = dVar;
        this.f45788c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45786a, false, 40033, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45786a, false, 40033, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45787b.d(this.f45788c, view);
    }
}
