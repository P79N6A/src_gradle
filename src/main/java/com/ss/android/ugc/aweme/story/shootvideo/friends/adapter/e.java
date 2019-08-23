package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73579a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishSelectFriendViewHolder f73580b;

    e(PublishSelectFriendViewHolder publishSelectFriendViewHolder) {
        this.f73580b = publishSelectFriendViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73579a, false, 85316, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73579a, false, 85316, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PublishSelectFriendViewHolder publishSelectFriendViewHolder = this.f73580b;
        if (publishSelectFriendViewHolder.h != null) {
            publishSelectFriendViewHolder.h.a();
        }
    }
}
