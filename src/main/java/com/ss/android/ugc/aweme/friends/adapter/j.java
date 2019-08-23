package com.ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48805a;

    /* renamed from: b  reason: collision with root package name */
    private final FriendsViewHolder f48806b;

    j(FriendsViewHolder friendsViewHolder) {
        this.f48806b = friendsViewHolder;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48805a, false, 46316, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f48805a, false, 46316, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        this.f48806b.a("click_name");
    }
}
