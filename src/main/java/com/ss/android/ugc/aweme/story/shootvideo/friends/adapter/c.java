package com.ss.android.ugc.aweme.story.shootvideo.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73574a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishSelectFriendViewHolder f73575b;

    c(PublishSelectFriendViewHolder publishSelectFriendViewHolder) {
        this.f73575b = publishSelectFriendViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f73574a, false, 85314, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f73574a, false, 85314, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f73575b.g.setVisibility(8);
        a.o.h().a(Boolean.TRUE);
    }
}
