package com.ss.android.ugc.aweme.feed.c;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FloatingCardInfo;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45095a;

    /* renamed from: b  reason: collision with root package name */
    private final c f45096b;

    /* renamed from: c  reason: collision with root package name */
    private final FloatingCardInfo f45097c;

    public f(c cVar, FloatingCardInfo floatingCardInfo) {
        this.f45096b = cVar;
        this.f45097c = floatingCardInfo;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f45095a, false, 40965, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f45095a, false, 40965, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f45096b.a(this.f45097c);
    }
}
