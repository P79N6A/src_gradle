package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72964a;

    /* renamed from: b  reason: collision with root package name */
    private final FromDoushanWidget f72965b;

    a(FromDoushanWidget fromDoushanWidget) {
        this.f72965b = fromDoushanWidget;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72964a, false, 84244, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72964a, false, 84244, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f72965b.m();
    }
}
