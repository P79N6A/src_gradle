package com.ss.android.ugc.aweme.newfollow.ui;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57325a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoFollowFeedDetailActivity f57326b;

    p(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity) {
        this.f57326b = videoFollowFeedDetailActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57325a, false, 61730, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57325a, false, 61730, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f57326b.o();
    }
}
