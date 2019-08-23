package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.AdCoverTitle;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62908a;

    /* renamed from: b  reason: collision with root package name */
    private final a f62909b;

    /* renamed from: c  reason: collision with root package name */
    private final AdCoverTitle f62910c;

    j(a aVar, AdCoverTitle adCoverTitle) {
        this.f62909b = aVar;
        this.f62910c = adCoverTitle;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62908a, false, 69401, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62908a, false, 69401, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f62909b.a(this.f62910c, view);
    }
}
