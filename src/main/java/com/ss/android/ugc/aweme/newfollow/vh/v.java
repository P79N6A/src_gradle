package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57761a;

    /* renamed from: b  reason: collision with root package name */
    private final FollowVideoViewHolder f57762b;

    v(FollowVideoViewHolder followVideoViewHolder) {
        this.f57762b = followVideoViewHolder;
    }

    public final void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f57761a, false, 62385, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f57761a, false, 62385, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        FollowVideoViewHolder followVideoViewHolder = this.f57762b;
        if (followVideoViewHolder.n != null && (followVideoViewHolder.n instanceof FollowVideoViewHolder.b)) {
            ((FollowVideoViewHolder.b) followVideoViewHolder.n).b(view2, followVideoViewHolder.itemView, followVideoViewHolder.j);
        }
    }
}
