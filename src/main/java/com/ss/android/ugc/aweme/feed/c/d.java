package com.ss.android.ugc.aweme.feed.c;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45090a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45091b;

    /* renamed from: c  reason: collision with root package name */
    private final FloatingCardInfo f45092c;

    public d(c cVar, FloatingCardInfo floatingCardInfo) {
        this.f45091b = cVar;
        this.f45092c = floatingCardInfo;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45090a, false, 40963, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45090a, false, 40963, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45091b.a(this.f45092c);
    }
}
