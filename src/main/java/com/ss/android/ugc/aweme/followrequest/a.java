package com.ss.android.ugc.aweme.followrequest;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48234a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowRequestActivity f48235b;

    a(FollowRequestActivity followRequestActivity) {
        this.f48235b = followRequestActivity;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48234a, false, 45298, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48234a, false, 45298, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FollowRequestActivity followRequestActivity = this.f48235b;
        followRequestActivity.mListStatusView.d();
        if (PatchProxy.isSupport(new Object[0], followRequestActivity, FollowRequestActivity.f48223a, false, 45292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], followRequestActivity, FollowRequestActivity.f48223a, false, 45292, new Class[0], Void.TYPE);
            return;
        }
        if (followRequestActivity.f48224b != null) {
            followRequestActivity.f48224b.c();
        }
    }
}
