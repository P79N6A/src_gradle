package com.ss.android.ugc.aweme.feed;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45789a;

    /* renamed from: b  reason: collision with root package name */
    private final d f45790b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f45791c;

    r(d dVar, Aweme aweme) {
        this.f45790b = dVar;
        this.f45791c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45789a, false, 40034, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45789a, false, 40034, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45790b.c(this.f45791c, view);
    }
}
