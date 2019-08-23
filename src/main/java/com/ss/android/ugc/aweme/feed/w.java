package com.ss.android.ugc.aweme.feed;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46952a;

    /* renamed from: b  reason: collision with root package name */
    private final d f46953b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f46954c;

    w(d dVar, Aweme aweme) {
        this.f46953b = dVar;
        this.f46954c = aweme;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46952a, false, 40039, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46952a, false, 40039, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f46953b.i(this.f46954c);
    }
}
