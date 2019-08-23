package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57729a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowFeedEmptyItemViewHolder f57730b;

    public m(FollowFeedEmptyItemViewHolder followFeedEmptyItemViewHolder) {
        this.f57730b = followFeedEmptyItemViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f57729a, false, 62216, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f57729a, false, 62216, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FollowFeedEmptyItemViewHolder followFeedEmptyItemViewHolder = this.f57730b;
        if (followFeedEmptyItemViewHolder.f57556f != null) {
            followFeedEmptyItemViewHolder.f57556f.a();
        }
    }
}
