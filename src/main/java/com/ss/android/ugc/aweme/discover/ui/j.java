package com.ss.android.ugc.aweme.discover.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43172a;

    /* renamed from: b  reason: collision with root package name */
    private final DiscoverFragment f43173b;

    j(DiscoverFragment discoverFragment) {
        this.f43173b = discoverFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f43172a, false, 37545, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f43172a, false, 37545, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DiscoverFragment discoverFragment = this.f43173b;
        if (discoverFragment.f42868f) {
            discoverFragment.e();
            discoverFragment.f42868f = false;
            discoverFragment.g = false;
        }
        discoverFragment.b();
    }
}
