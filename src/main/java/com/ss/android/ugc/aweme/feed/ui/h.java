package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46668a;

    /* renamed from: b  reason: collision with root package name */
    private final DisLikeAwemeLayout f46669b;

    h(DisLikeAwemeLayout disLikeAwemeLayout) {
        this.f46669b = disLikeAwemeLayout;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f46668a, false, 42506, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46668a, false, 42506, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        DisLikeAwemeLayout disLikeAwemeLayout = this.f46669b;
        if (disLikeAwemeLayout.f46125c != null && disLikeAwemeLayout.m) {
            disLikeAwemeLayout.f46125c.a(false);
        }
    }
}
